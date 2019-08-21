<footer class="footer">
    <div class="container">
        <div class="row">

            <!-- Footer Column -->
            <div class="col-lg-4 footer_col">
                <div class="footer_about">
                    <!-- Logo -->
                    <div class="logo_container">
                        <div class="logo">
                            <div>destino</div>
                            <div>travel agency</div>
                            <div class="logo_image"><img src="images/logo.png" alt=""></div>
                        </div>
                    </div>
                    <div class="footer_about_text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer pulvinar sed mauris eget tincidunt. Sed lectus nulla, tempor vel eleifend quis, tempus rut rum metus. Pellentesque ultricies enim eu quam fermentum hendrerit.</div>
                    <div class="copyright"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>
                </div>
            </div>

            <!-- Footer Column -->
            <div class="col-lg-4 footer_col">
                <div class="footer_latest">
                    <div class="footer_title">Latest News</div>
                    <div class="footer_latest_content">

                        <!-- Footer Latest Post -->
                        <div class="footer_latest_item">
                            <div class="footer_latest_image"><img src="images/latest_1.jpg" alt="https://unsplash.com/@peecho"></div>
                            <div class="footer_latest_item_content">
                                <div class="footer_latest_item_title"><a href="news.html">Brazil Summer</a></div>
                                <div class="footer_latest_item_date">Jan 09, 2018</div>
                            </div>
                        </div>

                        <!-- Footer Latest Post -->
                        <div class="footer_latest_item">
                            <div class="footer_latest_image"><img src="images/latest_2.jpg" alt="https://unsplash.com/@sanfrancisco"></div>
                            <div class="footer_latest_item_content">
                                <div class="footer_latest_item_title"><a href="news.html">A perfect vacation</a></div>
                                <div class="footer_latest_item_date">Jan 09, 2018</div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <!-- Footer Column -->
            <div class="col-lg-4 footer_col">
                <div class="tags footer_tags">
                    <div class="footer_title">Tags</div>
                    <ul class="tags_content d-flex flex-row flex-wrap align-items-start justify-content-start">
                        <li class="tag"><a href="#">travel</a></li>
                        <li class="tag"><a href="#">summer</a></li>
                        <li class="tag"><a href="#">cruise</a></li>
                        <li class="tag"><a href="#">beach</a></li>
                        <li class="tag"><a href="#">offer</a></li>
                        <li class="tag"><a href="#">vacation</a></li>
                        <li class="tag"><a href="#">trip</a></li>
                        <li class="tag"><a href="#">city break</a></li>
                        <li class="tag"><a href="#">adventure</a></li>
                    </ul>
                </div>
            </div>

        </div>
    </div>
</footer>
</div>
<script>
    // Get the modal
    var modal = document.getElementById('id01');
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }


    $('#myModal').modal({
        keyboard: false
    });
    $('#myModal').modal('toggle');
    $('#myModal').modal('show');
    $('#myModal').modal('hide');
    $('#myModal').modal('handleUpdate');
    $('#myModal').on('hidden.bs.modal', function (e) {
        // do something...
    });
    function check(price, number) {
        var totalPrice = document.getElementById('totalPrice' + number);
        var priceAdult = $('input#adultT' + number).val() * price;
        var priceChildren = $('input#childrenT' + number).val() * price / 2;
        totalPrice.innerHTML = "Total price for your ticket($): " + (priceAdult + priceChildren);
//        totalPrice.innerHTML = "Total price for your ticket($): " + ($('input#adultT' + number).value * price + $('input#childrenT' + number).value * price / 2);
    }

    function checkTicket(num1, num2) {
        if (num2 > 0 && num1 == 0) {
            return false;
        } else {
            return true;
        }
    }

    function confirmDelete(id) {
        if (confirm("Do you want to disable the Tour that has ID: " + id)) {
            $("a#" + id).attr("href", "MainController?action=Delete&txtTourID=" + id + "&txtTName=${param.txtTName}&date=${param.date}");
        } else {
            alert("You didn't disable that Tour");
        }
    }

    function addTicket(id, number, ticket) {
        var adultT = $('input#adultT' + number).val();
        var childrenT = $('input#childrenT' + number).val();
        if (adultT == 0 && childrenT == 0) {
            alert("You must buy ticket first");
        } else if (adultT < 0 || childrenT < 0) {
            alert("Ticket must be higher than zero");
        } else {
            if (!checkTicket(adultT, childrenT)) {
                alert("Children can't go without adult");
            } else {
                var totalTicket = Number(adultT) + Number(childrenT);
                if (Number(totalTicket) > ticket) {
                    alert("That total ticket is too much we can't afford for you");
                } else {
                    $('a#' + id).attr("href", "MainController?action=Add To Cart&adultTicket=" + adultT + "&childrenTicket=" + childrenT + "&txtTourID=" + id);
                }
            }
        }
    }
    
    function addTour(){
        $('button#add').attr("href", "insert.jsp");
    }
    
    function viewTour(){
        $('button#view').attr("href", "view-tour.jsp");
    }


</script>


</body>
</html>