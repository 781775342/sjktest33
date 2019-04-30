<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/25
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script>
      function zen() {
          var id=document.getElementById('num').value;
          var xmlhttp = new XMLHttpRequest();
          xmlhttp.onreadystatechange = function () {
              if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {

              }
          }
          xmlhttp.open("POST", "/zen", true);
          xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
          xmlhttp.send("id="+id);
      }
      function shan() {
          var id=document.getElementById('num');
          var xmlhttp = new XMLHttpRequest();
          xmlhttp.onreadystatechange = function () {
              if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {

              }
          }
          xmlhttp.open("POST", "/shan", true);
          xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
          xmlhttp.send("id="+id);
      }
  </script>
  <body>
 <form method="post" action="/zen">
     <input type="number" id="num" name="num">
   <input type="button" value="增"onclick="zen()">
 </form>
 <form method="post" action="/shan">
   <input type="button" value="删" onclick="shan()">
 </form>
  </body>
</html>
