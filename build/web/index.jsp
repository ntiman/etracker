<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Final Exam</title>
    </head>
    <body>
        <div>

            <img style="width:1000px;
                 height:565px;
                 margin-bottom:30px;"
                 src="img/beachswim.png">
            <h2>Welcome</h2>
        </div>
        <form action="addToDB">
            <div class="row">
                <div class="col-sm-6">First name: <input type="text" name="fname" placeholder="First name"></div>
                <div class="col-sm-6">Checkin date: <input type="text" name="check" placeholder="ChekIn Date"></div>
            </div>
            <div class="row">
                <div class="col-sm-6">Last name: <input type="text" name="lname" placeholder="Last name"></div>
                <div class="col-sm-6">Checkout date:<input type="text" name="checkout" placeholder="CheckOut Date"></div>
            </div>
            <div class="row">
                <div class="col-sm-6">Email: <input type="text" name="email" placeholder="Email"></div>
                <div class="col-sm-6">Days booked: <input type="text" name="numdays" placeholder="# Days Booked"></div>
            </div> 
            <div class="row">
                <div class="col-sm-6">Telephone #: <input type="text" name="phone" placeholder="Telephone #" ></div>
                <div class="col-sm-6">Passport #: <input type="text" name="pasnum" placeholder="Passport #"></div>
            </div> 
            <div class="row">
                <div class="col-sm-6">Room type: <input type="text" name="roomtype" placeholder="Room Type"></div>
                <div class="col-sm-6">Guests: <input type="text" name="gnum" placeholder="# of guests"></div>
            </div>
            <div><input style="margin: 20px;
                        width: 182px;" name="add" type="submit" value="Register"></div>

        </form>
    </body>
</html>
