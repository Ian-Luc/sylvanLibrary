<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RAT - MtG Tech Finder</title>
    <link rel="stylesheet" href="css/header.css">
    <link rel="stylesheet" href="css/rat.css">
</head>
<body>
    <div class="top-header">
        <div class="header-item">
            <img src="images/IMG_3176.PNG" id="chibinez">
            <h1>MtG Tech Finder</h1>
        </div>
        <div class="header-item">
            <nav>
                <ul>
                    <li>
                        <a href="./main">Home</a>
                    </li>
                    <li>
                        <a href="./Search">Search</a>
                    </li>
                    <li>
                        <a href="./about">About</a>
                    </li>
                    <li>
                        <a href="#">Account</a>
                    </li>
                    <li>
                        <a href="./login.html">Login</a>
                    </li>
                    <li>
                        <a href="#" id="rat">Rat?</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
    <div style="margin-top: 130px"></div>
    <div class="buttonbox">
        <button onclick="playVideo()">Play</button>
        <button onclick="stopVideo()">Pause</button>
    </div>
    <div class="videoplayer">
        <div>
            <video src="images/rat.webm" type="video/webm" id="ratmovie"></video>
        </div>
    </div>
    <script src="js/ratvideo.js"></script>
</body>
</html>