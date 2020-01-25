<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 16-08-2017
  Time: 08:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Result</title>

    <style>
        #button{
            width: 100%;
        }


        #form{
            margin-left: 150px;
            width:800px;
        }

        h4{
            font-family: "Baskerville Old Face";
        }

        #title{
            font-size: 18px;
            background-color: chocolate;
            width: 100%;
        }

        body{
            background-image: url("https://i.pinimg.com/originals/f2/95/a6/f295a6ff46cef0837497f12c57d780fb.jpg");
        }
    </style>
</head>
<body>

<div class="container" id="main">
    <div class="col-md-12">
        <div class="card bg-dark my-5" >
            <div class="card-body">
                <h1 class="card-title text-center text-white py-3">Details Submitted Successfully</h1>
            </div>
        </div>
    </div>

    <div class="card my-5" id="form">

        <!-- (ngSubmit)="onSubmit()" -->
        <div style="text-align: center" class="card-body">
<h3 id="title" class="btn btn-info" >Student Details</h3><br>
<h4> Student Name : ${name} </h4>
<h4> Student Email : ${email} </h4>
<h4> Student Age : ${age} </h4>
            <h4>Students Class : ${className}</h4>

<br><br>

<h3 id="title" class="btn btn-info" >Parent Details</h3><br>
<h4>Parent Name : ${parentName}</h4>
<h4>Parent Contact No : ${contactNo}</h4>
<h4>Parent Job : ${job}</h4>
            <br><br>


<a id="button" class="btn btn-info" href="/">Go to Main Menu</a>

        </div>
    </div>

</body>
</html>

<%--https://app.creately.com/diagram/fySrs7cC7zk/view--%>