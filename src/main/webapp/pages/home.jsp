<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Enter Student Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

    <style>
#main{
    margin-top:200px;
}

        body{
            background-image: url("https://wallpaperaccess.com/full/859072.jpg");
            /*background-image: url("https://wallpaperaccess.com/full/859076.jpg");*/
            /*background-size: 100%;*/
        }



    </style>
</head>
<body>



<div class="container" id="main">
    <div class="col-md-12">
        <div class="card bg-dark my-5" >
            <div class="card-body">
                <h1 class="card-title text-center text-white py-3">School Management System</h1>
                <ul class="text-center list-inline py-3">
                    <li class="list-inline-item">
                        <a  href="/students" class="btn btn-info" style="font-size: 20px;">Add Students</a>
                    </li>
                    <li class="list-inline-item">
                        <a  href="/searchStudents" class="btn btn-info" style="font-size: 20px;">Search Students</a>
                    </li>
                    <li class="list-inline-item">
                        <a  href="/updateStudents" class="btn btn-info" style="font-size: 20px;">Update Students</a>
                    </li>
                </ul>

                <ul class="text-center list-inline py-3">
                    <li class="list-inline-item">
                        <a  href="/teachers" class="btn btn-info" style="font-size: 20px;">Add Teachers</a>
                    </li>
                    <li class="list-inline-item">
                        <a  href="/classes" class="btn btn-info" style="font-size: 20px;">Class Controller</a>
                    </li>
                    <li class="list-inline-item">
                        <a  href="" class="btn btn-info" style="font-size: 20px;">Time Table Management</a>
                    </li>
                </ul>

            </div>
        </div>
    </div>
</div>

</body>
</html>