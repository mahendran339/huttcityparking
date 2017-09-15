<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.10.0/jquery.validate.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.textbox ,select{ 
    -webkit-border-radius: 5px; 
    -moz-border-radius: 5px; 
 
    border: 1px solid #848484; 
    outline:0; 
    height:25px; 
    width: 175px; 
 }
 label.error{
 display: block;
 color:red;
 margin:0px;
 margin-left:75px;
 font-size:12px;

 }
 input, select{

 }

 .containers{
 margin:0 auto;
 width:600px;
 border:1px solid #506ce6;
 padding-bottom:25px;
 }
 .containers h4{
    padding: 10px;
    background: #506ce6;
    color: #fff;
    font-weight: bold;
    font-size: 22px;
    margin:0px;
 }
span {
    width: 125px;
    display: inline-block;
    text-align: left;
}
</style>

</head>
<body>
<br> 
<br>
 <div align="center" id ="msg" class="containers" > 
   <br>
   <h2>Congratulations!</h2>
   <br>
   <h4>Thank you for using Hutt city parking services.Your car is successfully parked</h4>
     Your car Reg.No is <label id="car_number"></label><br>
          your Reference Number is <label id="reference"> ${datetime} </label>
          <br><p>
         <em>Note: the parking duration is limited to 120 minutes </em>      
   </p>
   </div>
</html>