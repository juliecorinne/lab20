<%--
  Created by IntelliJ IDEA.
  User: julieschneider
  Date: 2/28/17
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Please fill in the form to register!

<form action="coffeeRegistration" method="post">
    First Name <input type="text" name="FName"> <br> <!--text box-->
    Last Name <input type="text" name="LName"> <br>
    Email <input type="email" name="eMail"> <br>
    Phone Number <input type="number" name="pN"> <br>
    Password <input type="password" name="pWord"> <br>
    <input type="submit" value="Register">
</form>

</body>
</html>
