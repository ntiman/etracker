<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Home</title>

        <style>
            .img{
                width: 300px;
                height: 200px;
                margin: 20px;
                display: inline-block;
            }
        </style>

    </head>

    <body>
        <img class="img" src="img/gardenparty.png">
        <img class="img" src="img/drinks.png">
        <img class="img" src="img/diners.png">
        <div class="box">

            <form class="form-style" action="getFromDB">
                <input  type="submit" value="Display clients">
            </form>

            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Phone</th>
                    <th>Passport #</th>
                </tr>
                ${result}
            </table>

            <form class="form-style" action="deleteFromDB">
                <div class="row">
                    <div class="col-sm-6"><input type="text" name="pasnum" placeholder="Passpot #" required=""></div>
                    <div class="col-sm-6"><input class="sub" type="submit" value="Delete client"></div>
                </div>
                <br>
            </form>

            <form action="rooms.jsp">
                <div><input class="sub" type="submit" value="View available rooms"></div>
                <br>
            </form>

        </div>
    </body>
</html>
