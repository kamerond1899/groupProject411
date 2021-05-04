<%-- 
    Document   : stateTable
    Created on : Apr 28, 2021, 2:26:52 PM
    Author     : Kameron Dangleben, River Martinez

    Purpose: Display the String tableHTML that has been passed from the tableServlet. This object
    will display data from the table based on what dataset the user decided to view
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="styles.css" rel="stylesheet" />
    <style>
table { /* Table styling  */
  width:100%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
#t01 tr:nth-child(even) {
  background-color: #eee;
}
#t01 tr:nth-child(odd) {
 background-color: #fff;
}
#t01 th {
  background-color: black;
  color: white;
}

.menu { /* menu */
        align:center;
      width:100%;
      text-align:center;
    }
    .menu a { /* Menu links */
             text-align:center;
      background-color:#26aceb;
            
      margin-top:10px;
      margin-bottom:10px;
      padding-bottom:24px;
      padding-left:6px;
      padding-right:6px;
      padding-top:24px;
      display:inline-block;
      width:50%;
      color:white;
      text-decoration:none;
    } 
    
        .menu a:hover { /* Menu on mouseover */
             text-align:center;
      background-color:#9999ff;
            
      margin-top:10px;
      margin-bottom:10px;
      padding-bottom:24px;
      padding-left:6px;
      padding-right:6px;
      padding-top:24px;
      display:inline-block;
      width:50%;
      color:white;
      text-decoration:none;
</style>

    <head>
        <title>USA COVID-19 Statistic Tracker</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Screen will resize based on device width-->
    </head>
    <body style=font-family:Verdana>
            <h1 align="center">USA COVID-19 Statistic Tracker</h1>
        <div class="menu">
        <a href="index.html" align="center">Return Home</a>
        <a href=${returnLink}> Return to Dataset Selector</a></div><br>
        <h2>${pageHeader}</h2> <!-- page header from the tableServlet -->
        <table border = 2>
    <thead>
        ${tableHTML}
    </table>
    </body>
    
    
</html>
