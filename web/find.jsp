<div class="find">
    <!-- Image by https://unsplash.com/@garciasaldana_ -->
    <div class="find_background parallax-window" data-parallax="scroll" data-image-src="images/find.jpg" data-speed="0.8"></div>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="find_title text-center">Find the Adventure of a lifetime</div>
            </div>
            <div class="col-12">
                <div class="find_form_container">
                    <form action="MainController" id="find_form" class="find_form d-flex flex-md-row flex-column align-items-md-center align-items-start justify-content-md-between justify-content-start flex-wrap" method="POST">
                        <div class="find_item">
                            <div>Destination:</div>
                            <input type="text" class="destination find_input" placeholder="Keyword here" name="txtDeparture">
                        </div>
                        <div class="find_item">
                            <div>Arrival:</div>
                            <input type="text" class="find_input" placeholder="Keyword here" name="txtArrival">
                        </div>
                        <div class="find_item">
                            <div>Min price</div>
                            <select name="minprice" id="min_price" class="dropdown_item_select find_input" value="0" >
                                <option value="0">0</option>
                                <option value="500">500</option>
                                <option value="1000">1000</option>
                                <option value="1500">2000</option>
                            </select>
                        </div>
                        <div class="find_item">
                            <div>Max price</div>
                            <select name="maxprice" id="max_price" class="dropdown_item_select find_input" value="2500">
                                <option value="2000">2500</option>
                                <option value ="5000">6000</option>
                                <option value="10000">10000</option>
                            </select>
                        </div>
                        <div class="find_button">
                            <input type="submit" value="Find" name="action" class="btn btn-info" style="background-color: #fe435b; border-color: #fe435b"/>
                        </div>
                    </form>
                    <font color="red">
                    <h3>${requestScope.MESSAGE}</h3>
                    </font>
                </div>
            </div>
        </div>
    </div>
</div>