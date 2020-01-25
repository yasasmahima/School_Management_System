<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Enter Student Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <style>
        #button{
            width: 100%;
        }


        #title{
            font-size: 18px;
            background-color: chocolate;
            width: 100%;
        }

        #form{
            margin-left: 150px;
            width:800px;
        }

        #searchBar{
            margin-left: 20px
        ;
        }

        h4{
            font-family: "Baskerville Old Face";
        }

        body{
            background-image: url("https://theanimeacademy.files.wordpress.com/2014/07/cherry-tree-desktop-background-3336161.jpg");
            background-size: 100%;
        }


    </style>
</head>
<body>

<div class="container" id="main">
    <div class="col-md-12">
        <div class="card bg-dark my-5" >
            <div class="card-body">
                <h1 class="card-title text-center text-white py-3">Search Students</h1>
            </div>
        </div>
    </div>

    <div class="card my-5" id="form">

        <!-- (ngSubmit)="onSubmit()" -->
        <div style="text-align: center" class="card-body">

<form method="post" action="searchStudents">
    <label><h5>Input Student's Name: </h5></label><input id="searchBar"  className="form-control"  type="text" name="name">
    <input class="btn btn-info" style="margin-left: 20px" type="submit" value="Search">
</form>

<h3 id="title" class="btn btn-info">${alert}</h3>
            <h3 id="title" class="btn btn-info" >${stu}</h3><br>

<h4> ${name}</h4>
<h4> ${age}</h4>
<h4>  ${email}</h4>

            <h3 id="title" class="btn btn-info" >${prt}</h3><br>

<h4> ${parentName}</h4>
<h4>  ${parentContact}</h4>
<h4>  ${job}</h4>
<h2> </h2>

<h3><a id="button" class="btn btn-info" href="/">Go to Main Menu</a></h3>

        </div>
    </div>

</body>
</html>