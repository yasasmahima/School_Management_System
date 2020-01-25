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
            background-image: url("https://cdna.artstation.com/p/assets/images/images/012/579/512/large/evgeniy-slushev-1080-dva-team-canteen-inside-day.jpg?1535486966");
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
                <h1 class="card-title text-center text-white py-3">Student Details Form</h1>
            </div>
        </div>
    </div>

        <div class="card my-5" id="form">

            <!-- (ngSubmit)="onSubmit()" -->
            <div class="card-body">


<%--        <h1>Form</h1>--%>
        <form method="post" action="students">
            <div className="form-group">
            Enter Students Name : <input  className="form-control" type="text" name="name"/>
            </div><br>

            <div className="form-group">
            Enter Students Age : <input  className="form-control" type="text" name="age"/>
            </div><br>

            <div className="form-group">
            Enter Students Email Address : <input  className="form-control" type="email" name="email">
            </div><br>

            <div className="form-group">
            Enter Students Parents Name : <input  className="form-control" type="text" name="parentName">
            </div><br>

            <div className="form-group">
            Enter Students Parents Contact No : <input  className="form-control" type="text" name="contactNo">
            </div><br>

            <div className="form-group">
            Enter Students Parents Job : <input   className="form-control" type="text" name="job">
            </div><br>

            <input id="button" class="btn btn-info" type="submit" value="Submit" >
            <a href="/" id="cancel" class="btn btn-info" type="submit" value="Submit" >Cancel</a>
        </form>
            </div>
        </div>

    </body>
</html>


