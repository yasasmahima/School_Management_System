<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Enter Teacher Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <style>
        #inputs{
            width:300px;
            margin-left: 70px;
        }

        #form{
            margin-left: 150px;
            width:800px;
        }

        body{
            /*background-image: url("http://getwallpapers.com/wallpaper/full/5/6/b/368370.jpg");*/
            background-image: url("https://i.pinimg.com/originals/3c/04/37/3c0437f18940e273edd564e4e93cd3c6.jpg");
        }

        input{
            width: 100%;
        }

        #button{
            width:100px;
        }

        #cancel{
            background-color: darkred;
            color: aliceblue;
            float: right;
        }
    </style>


</head>
<body>
<div class="container" id="main">
    <div class="col-md-12">
        <div class="card bg-dark my-5" >
            <div class="card-body">
                <h1 class="card-title text-center text-white py-3">Teacher Details Form</h1>
            </div>
        </div>
    </div>

    <div class="card my-5" id="form">

        <!-- (ngSubmit)="onSubmit()" -->
        <div class="card-body">
<%--        <h1>Form</h1>--%>
<form method="post" action="teachers">
    <div className="form-group">
        Enter Teachers Name : <input  className="form-control" type="text" name="name"/>
    </div><br>
    <div className="form-group">
        Enter Teachers Subject : <input  className="form-control" type="text" name="subject"/>
    </div><br>
    <div className="form-group">
    Enter Teachers Subjects Level : <input  className="form-control" type="text" name="level"/>
    </div><br>
    <div className="form-group">
        Enter Teachers Subjects Batch Name : <input  className="form-control" type="text" name="batch"/>
    </div><br>
    <div className="form-group">
        Enter Teachers Subjects Batch ID : <input  className="form-control" type="text" name="batchId"/>
    </div><br>
    <div className="form-group">
        Enter Teachers Contact No : <input  className="form-control" type="text" name="teacherContact">
    </div><br>
    <input id="button" class="btn btn-info"  type="submit" value="Submit">
    <a href="/" id="cancel" class="btn btn-info" type="submit" value="Submit" >Cancel</a>

</form>
        </div>
    </div>



</body>
</html>


