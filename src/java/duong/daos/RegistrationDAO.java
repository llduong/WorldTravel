/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.daos;

import duong.dtos.RegistrationDTCustomer;
import duong.dtos.RegistrationDTTour;
import duong.db.MyConnection;
import duong.dtos.RegistrationDTAdult;
import duong.dtos.RegistrationDTChildren;
import duong.dtos.RegistrationDTTicket;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class RegistrationDAO implements Serializable {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public String checkLogin(String username, String password) throws Exception {
        String role = "failed";
        String sql = "Select Role From Users Where Username = ? AND Password = ?";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
        } finally {
            closeConnection();
        }
        return role;
    }

    public boolean createAccount(RegistrationDTCustomer cus) throws Exception {
        String sql = "Insert Into Users Values(?,?,?,?,?,?,?)";
        boolean result = false;
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cus.getID());
            ps.setString(2, cus.getPassword());
            ps.setString(3, cus.getFullname());
            ps.setBoolean(4, cus.isGender());
            ps.setString(5, cus.getAddress());
            ps.setString(6, cus.getPhone());
            ps.setString(7, "customer");
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean checkDuplicateUsername(String username) throws Exception {
        boolean result = true;
        String sql = "Select COUNT(Username) AS ID From Users Where Username = ?";
        int count = 0;
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt("ID");
            }
            if (count == 1) {
                result = false;
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public RegistrationDTCustomer findByUsername(String username) throws Exception {
        RegistrationDTCustomer result = null;
        String sql = "Select Password, Fullname, Gender, Address, Phone From Users Where Username = ?";
        String password, fullname, address, phone;
        boolean gender;
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                password = rs.getString("Password");
                fullname = rs.getString("Fullname");
                address = rs.getString("Address");
                phone = rs.getString("Phone");
                gender = rs.getBoolean("Gender");
                result = new RegistrationDTCustomer(username, fullname, gender, address, phone);
                result.setPassword(password);
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean changePassword(RegistrationDTCustomer cus) throws Exception {
        boolean result = false;
        String sql = "Update Users set Password = ? Where Username = ?";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cus.getPassword());
            ps.setString(2, cus.getID());
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean updateProfile(RegistrationDTCustomer cus) throws Exception {
        boolean result = false;
        String sql = "Update Users set Fullname = ?, Gender = ?, Address = ?, Phone = ? Where Username = ?";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cus.getFullname());
            ps.setBoolean(2, cus.isGender());
            ps.setString(3, cus.getAddress());
            ps.setString(4, cus.getPhone());
            ps.setString(5, cus.getID());
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public List<RegistrationDTTour> findTourByPrice(float min, float max, String departureName, String arrivalName) throws Exception {
        String sql = "";
        List<RegistrationDTTour> result = null;
        try {
            if (!departureName.isEmpty() && !arrivalName.isEmpty()) {
                sql = "Select TourID, TourName, DepartureName, ArrivalName ,DepartureTime, ArrivalTime, Ticket, Price, Detail, Status, Image From Tour Where (Price <= ? AND Price >= ?)"
                        + "And (DepartureName LIKE ? And ArrivalName LIKE ?) AND isDelete = 'False'";
                conn = MyConnection.getMyConnection();
                ps = conn.prepareStatement(sql);
                ps.setFloat(1, max);
                ps.setFloat(2, min);
                ps.setString(3, "%" + departureName + "%");
                ps.setString(4, "%" + arrivalName + "%");
            } else if (!departureName.isEmpty() && arrivalName.isEmpty()) {
                sql = "Select TourID, TourName, DepartureTime, ArrivalTime, DepartureName, ArrivalName, Ticket, Price, Detail, Status, Image "
                        + "From Tour Where (Price <= ? AND Price >= ?) AND DepartureName LIKE ? AND isDelete = 'False'";
                conn = MyConnection.getMyConnection();
                ps = conn.prepareStatement(sql);
                ps.setFloat(1, max);
                ps.setFloat(2, min);
                ps.setString(3, "%" + departureName + "%");
            } else if (departureName.isEmpty() && !arrivalName.isEmpty()) {
                sql = "Select TourID, TourName, DepartureTime, ArrivalTime, DepartureName, ArrivalName, Ticket, Price, Detail, Status, Image "
                        + "From Tour Where (Price <= ? AND Price >= ?) AND ArrivalName LIKE ? AND isDelete = 'False'";
                conn = MyConnection.getMyConnection();
                ps = conn.prepareStatement(sql);
                ps.setFloat(1, max);
                ps.setFloat(2, min);
                ps.setString(3, "%" + arrivalName + "%");
            } else {
                sql = "Select TourID, TourName, DepartureTime, ArrivalTime, DepartureName, ArrivalName, Ticket, Price ,Detail, Status, Image "
                        + "From Tour Where (Price <= ? AND Price >= ?) AND isDelete = 'False'";
                conn = MyConnection.getMyConnection();
                ps = conn.prepareStatement(sql);
                ps.setFloat(1, max);
                ps.setFloat(2, min);
            }
            String ID, Name, Detail, departure, arrival, image;
            int ticket;
            float price;
            boolean status;
            Date departureTime, arrivalTime;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            rs = ps.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                ID = rs.getString("TourID");
                Name = rs.getString("TourName");
                Detail = rs.getString("Detail");
                departure = rs.getString("DepartureName");
                arrival = rs.getString("ArrivalName");
                departureTime = rs.getDate("DepartureTime");
                arrivalTime = rs.getDate("ArrivalTime");
                ticket = rs.getInt("Ticket");
                status = rs.getBoolean("Status");
                price = rs.getFloat("Price");
                image = rs.getString("Image");
                RegistrationDTTour tour = new RegistrationDTTour(ID, Name, sdf.format(departureTime), sdf.format(arrivalTime),
                        departure, arrival, ticket, price, Detail, status, false);
                tour.setImage(image);
                result.add(tour);
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean checkDuplicateTour(String tourID) throws Exception {
        boolean result = true;
        String sql = "Select COUNT(TourID) AS ID From Tour Where TourID = ?";
        int count = 0;
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, tourID);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt("ID");
            }
            if (count == 1) {
                result = false;
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean insertTour(RegistrationDTTour tour) throws Exception {
        boolean result = false;
        String sql = "Insert Into Tour Values(?,?,?,?,?,?,?,?,?,?,?,?)";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, tour.getID());
            ps.setString(2, tour.getName());
            ps.setDate(3, new Date(sdf.parse(tour.getDepartureTime()).getTime()));
            ps.setDate(4, new Date(sdf.parse(tour.getArrivalTime()).getTime()));
            ps.setString(5, tour.getDeparture());
            ps.setString(6, tour.getArrival());
            ps.setInt(7, tour.getTicket());
            ps.setFloat(8, tour.getPrice());
            ps.setString(9, tour.getDetail());
            ps.setBoolean(10, tour.isStatus());
            ps.setString(11, tour.getImage());
            ps.setBoolean(12, false);
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public List<RegistrationDTTour> searchByTourName(String tourname) throws Exception {
        List<RegistrationDTTour> result = null;
        String sql = "Select TourID, TourName, DepartureTime, ArrivalTime ,DepartureName, ArrivalName, Ticket, Price, Status, isDelete From Tour Where Tourname LIKE ?";
        String ID, name, departureTime, arrivalTime, departureName, arrivalName;
        boolean status, isDelete;
        float price;
        int ticket;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + tourname + "%");
            rs = ps.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                ID = rs.getString("TourID");
                name = rs.getString("TourName");
                departureTime = sdf.format(rs.getDate("DepartureTime"));
                arrivalTime = sdf.format(rs.getDate("ArrivalTime"));
                departureName = rs.getString("DepartureName");
                arrivalName = rs.getString("ArrivalName");
                ticket = rs.getInt("Ticket");
                price = rs.getFloat("Price");
                status = rs.getBoolean("Status");
                isDelete = rs.getBoolean("isDelete");
                result.add(new RegistrationDTTour(ID, name, departureTime, arrivalTime, departureName, arrivalName, ticket, price, "", status, isDelete));
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public List<RegistrationDTTour> searchByDate(String date) throws Exception {
        List<RegistrationDTTour> result = null;
        String sql = "Select TourID, TourName, ArrivalTime ,DepartureName, ArrivalName, Ticket, Price, Status, isDelete From Tour Where DepartureTime = ?";
        String ID, name, arrivalTime, departureName, arrivalName;
        boolean status, isDelete;
        int ticket;
        float price;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setDate(1, new Date(sdf.parse(date).getTime()));
            rs = ps.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                ID = rs.getString("TourID");
                name = rs.getString("TourName");
                arrivalTime = sdf.format(rs.getDate("ArrivalTime"));
                departureName = rs.getString("DepartureName");
                arrivalName = rs.getString("ArrivalName");
                ticket = rs.getInt("Ticket");
                price = rs.getFloat("Price");
                status = rs.getBoolean("Status");
                isDelete = rs.getBoolean("isDelete");
                result.add(new RegistrationDTTour(ID, name, departureName, arrivalTime, departureName, arrivalName, ticket, price, "", status, isDelete));
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public List<RegistrationDTTour> searchByTourNameAndDate(String tourname, String date) throws Exception {
        List<RegistrationDTTour> result = null;
        String sql = "Select TourID, TourName, ArrivalTime ,DepartureName, ArrivalName, Ticket, Price, Status, isDelete From Tour Where TourName LIKE ? AND DepartureTime = ?";
        String ID, name, arrivalTime, departureName, arrivalName;
        boolean status, isDelete;
        int ticket;
        float price;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + tourname + "%");
            ps.setDate(2, new Date(sdf.parse(date).getTime()));
            rs = ps.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                ID = rs.getString("TourID");
                name = rs.getString("TourName");
                arrivalTime = sdf.format(rs.getDate("ArrivalTime"));
                departureName = rs.getString("DepartureName");
                arrivalName = rs.getString("ArrivalName");
                ticket = rs.getInt("Ticket");
                price = rs.getFloat("Price");
                status = rs.getBoolean("Status");
                isDelete = rs.getBoolean("isDelete");
                result.add(new RegistrationDTTour(ID, name, date, arrivalTime, departureName, arrivalName, ticket, price, "", status, isDelete));
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public int checkCustomerBoughtTour(String ID) throws Exception {
        int count = 0;
        String sql = "Select COUNT(TourID) AS ID From Ticket Where TourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt("ID");
            }
        } finally {
            closeConnection();
        }
        return count;
    }

    public boolean deleteTourByID(String ID) throws Exception {
        boolean result = false;
        String sql = "Update Tour set isDelete = 'True' Where TourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public RegistrationDTTour findByPrimaryKey(String ID) throws Exception {
        RegistrationDTTour result = null;
        String sql = "Select TourName, DepartureTime, ArrivalTime, DepartureName, ArrivalName, Detail, Ticket, Price, Status, Image, isDelete From Tour Where TourID = ?";
        String tourName, departureName, arrivalName, detail, image, arrivalTime, departureTime;
        float price;
        int ticket;
        boolean status, isDelete;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                tourName = rs.getString("TourName");
                departureName = rs.getString("DepartureName");
                arrivalName = rs.getString("ArrivalName");
                departureTime = sdf.format(rs.getDate("DepartureTime"));
                arrivalTime = sdf.format(rs.getDate("ArrivalTime"));
                detail = rs.getString("Detail");
                ticket = rs.getInt("Ticket");
                price = rs.getFloat("Price");
                status = rs.getBoolean("Status");
                image = rs.getString("Image");
                isDelete = rs.getBoolean("isDelete");
                result = new RegistrationDTTour(ID, tourName, departureTime, arrivalTime, departureName, arrivalName, ticket, price, detail, status, isDelete);
                result.setImage(image);
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean updateTour(RegistrationDTTour tour) throws Exception {
        boolean result = false;
        String sql = "Update Tour set TourName = ?, DepartureTime = ?, ArrivalTime = ?, DepartureName = ?, ArrivalName = ?, Ticket = ?, Price = ?, Detail = ?, Status = ?,"
                + " Image = ?, isDelete = ? Where TourID = ?";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, tour.getName());
            ps.setDate(2, new Date(sdf.parse(tour.getDepartureTime()).getTime()));
            ps.setDate(3, new Date(sdf.parse(tour.getArrivalTime()).getTime()));
            ps.setString(4, tour.getDeparture());
            ps.setString(5, tour.getArrival());
            ps.setInt(6, tour.getTicket());
            ps.setFloat(7, tour.getPrice());
            ps.setString(8, tour.getDetail());
            ps.setBoolean(9, tour.isStatus());
            ps.setString(10, tour.getImage());
            ps.setBoolean(11, tour.isDelete());
            ps.setString(12, tour.getID());
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean updateTourStatus(String ID, boolean status, int ticket) throws Exception {
        boolean result = false;
        String sql = "Update Tour set Status = ? , Ticket = ? Where TourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setBoolean(1, status);
            ps.setInt(2, ticket);
            ps.setString(3, ID);
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public int countTicket() throws Exception {
        int result = 0;
        String sql = "Select COUNT(TicketID) AS ID From Ticket";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getInt("ID");
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public boolean addTicketAndCustomer(RegistrationDTTicket ticket, RegistrationDTAdult[] adultInfo, RegistrationDTChildren[] childrenInfo) throws Exception {
        boolean result = false;
        String sql = "Insert Into Ticket Values(?,?,?,?,?,?)";
        int countAdult = 0, countChildren = 0, countTicket = 0;
        try {
            conn = MyConnection.getMyConnection();
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);
            ps.setString(1, ticket.getID());
            ps.setString(2, ticket.getTourID());
            ps.setString(3, ticket.getUsername());
            ps.setInt(4, ticket.getAdultTicket());
            ps.setInt(5, ticket.getChildrenTicket());
            ps.setFloat(6, ticket.getTotalPrice());
            countTicket = ps.executeUpdate();
            sql = "Insert Into Adult Values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            for (RegistrationDTAdult x : adultInfo) {
                ps.setString(1, ticket.getID());
                ps.setString(2, x.getName());
                ps.setString(3, x.getPassport());
                ps.setString(4, x.getPhoneNo());
                ps.setBoolean(5, x.isGender());
                if (ps.executeUpdate() > 0) {
                    countAdult++;
                }
            }
            sql = "Insert Into Children Values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            for (RegistrationDTChildren x : childrenInfo) {
                ps.setString(1, ticket.getID());
                ps.setString(2, x.getName());
                ps.setString(3, x.getPassport());
                ps.setBoolean(4, x.isGender());
                if (ps.executeUpdate() > 0) {
                    countChildren++;
                }
            }
            if (countTicket > 0 && countAdult > 0 && countChildren > 0) {
                result = true;
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
        } finally {
            closeConnection();
        }
        return result;
    }

    private int getTicketOfTour(String tourID) throws Exception {
        int ticket = 0;
        String sql = "Select Ticket From Tour Where TourID = ?";
        System.out.println("Tour ID = " + tourID);
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, tourID);
            rs = ps.executeQuery();
            if (rs.next()) {
                ticket = rs.getInt("Ticket");
            }
            System.out.println("ticket2222 " + ticket);
        } finally {
            closeConnection();
        }
        return ticket;
    }

    public boolean updateTourTicket(int adultTicket, int childrenTicket, String tourID) throws Exception {
        boolean result = false;
        System.out.println("Ticket ID " + tourID);
        System.out.println("adult = " + adultTicket);
        System.out.println("children = " + childrenTicket);
        int ticket = getTicketOfTour(tourID) - adultTicket - childrenTicket;
        System.out.println("ticket = " + ticket);
        String sql = "Update Tour set Ticket = ? Where TourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, ticket);
            ps.setString(2, tourID);
            result = ps.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return result;
    }

    public RegistrationDTTicket showRecentTicket(String username, String ticketID) throws Exception {
        RegistrationDTTicket result = null;
        String sql = "Select TourID, Adult, Children, TotalPrice From Ticket Where Username = ? AND TicketID = ?";
        String tourID = "";
        int adult, children;
        float totalPrice;
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, ticketID);
            rs = ps.executeQuery();
            if (rs.next()) {
                tourID = rs.getString("TourID");
                adult = rs.getInt("Adult");
                children = rs.getInt("Children");
                totalPrice = rs.getFloat("TotalPrice");
                result = new RegistrationDTTicket(ticketID, tourID, username, adult, children, totalPrice);
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public List<RegistrationDTTicket> getAllTicketOfUser(String username) throws Exception {
        List<RegistrationDTTicket> result = null;
        String sql = "Select TicketID, TourID, Adult, Children, TotalPrice From Ticket Where Username = ?";
        String ticketID, tourID;
        int adult, children;
        float totalPrice;
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                ticketID = rs.getString("TicketID");
                tourID = rs.getString("TourID");
                adult = rs.getInt("Adult");
                children = rs.getInt("Children");
                totalPrice = rs.getFloat("TotalPrice");
                result.add(new RegistrationDTTicket(ticketID, tourID, username, adult, children, totalPrice));
            }
        } finally {
            closeConnection();
        }
        return result;
    }

    public int getTotalTicket(String tourID) throws Exception {
        String sql = "Select Adult, Children From Ticket Where TourID = ?";
        int totalTicket = 0, adult = 0, children = 0;
        try {
            conn = MyConnection.getMyConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, tourID);
            rs = ps.executeQuery();
            while (rs.next()) {
                adult = rs.getInt("Adult");
                children = rs.getInt("Children");
                totalTicket += adult + children;
            }
        } finally {
            closeConnection();
        }
        return totalTicket;
    }
}
