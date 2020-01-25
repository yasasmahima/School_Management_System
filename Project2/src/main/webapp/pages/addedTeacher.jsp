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
            background-image: url("https://static.zerochan.net/Love.Live%21.School.Idol.Festival.full.2430583.png");
            background-size: 100%;
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

<h3 id="title"  class="btn btn-info">Teacher Details</h3>
<h4> Teacher Name : ${name} </h4>
<h4> Student Contact No : ${contact} </h4>

<br>
<h3 id="title"  class="btn btn-info">Teachers Subject Details</h3>
<h4>Subject Name: ${subject}</h4>
<h4>Subject Level : ${level}</h4>
<h4>Subject Batch : ${batch}</h4>
<h4>Subject Batch ID : ${batchId}</h4>
            <br>

            <a id="button" class="btn btn-info" href="/">Go to Main Menu</a>

        </div>
    </div>

</body>
</html>