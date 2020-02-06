<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Enter Student Details</title>
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
            background-image: url("https://wallpaperaccess.com/full/859076.jpg");
            background-size: 100%;
        }

        input,select{
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

        h5{
            font-size: 16px;
        }

    </style>
</head>
<body>
<div class="container" id="main">
    <div class="col-md-12">
        <div class="card bg-dark my-5" >
            <div class="card-body">
                <h1 class="card-title text-center text-white py-3">Class Details Form</h1>
            </div>
        </div>
    </div>

    <div class="card my-5" id="form">

        <!-- (ngSubmit)="onSubmit()" -->
        <div class="card-body">
<%--        <h1>Form</h1>--%>
<form method="post" action="classes">
    <div className="form-group">
        <label>Choose Class Name : </label>
        <select name="class">
            <option value="Class 1">Class 1</option>
            <option value="Class 2">Class 2</option>
            <option value="Class 3">Class 3</option>
        </select>

    </div><br>
    <div className="form-group">
        Enter In-Charge Name : <input  className="form-control" type="text" name="incharge"/>
    </div><br>
    <div className="form-group">
        Enter Batch Name : <input  className="form-control" type="email" name="batch">
    </div><br>
    <div className="form-group">
        Enter Batch Id : <input  className="form-control" type="text" name="batchId">
    </div><br>
    <input id="button" class="btn btn-info" type="submit" value="Submit">
    <a href="/" id="cancel" class="btn btn-info" type="submit" value="Submit" >Cancel</a>
    <br><br>

    <h5 class="alert alert-success">${message}</h5>
    <h5 class="alert alert-danger">${error}</h5>

<%--    <a href="/" id="cancel" class="btn btn-info" type="submit" value="Submit" >Cancel</a>--%>
</form>

        </div>
    </div>

</body>
</html>


