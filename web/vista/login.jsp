<%-- 
    Document   : login
    Created on : Mar 18, 2015, 11:13:48 AM
    Author     : Willy Yeltsin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.gisa.framework.utils.Constantes"%>
<%
    String basePath = Constantes.WEBROOT;
%>
<!DOCTYPE html>
<html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>.::Vinculacion GISA::.</title>
  <link rel="stylesheet" href="css/login.css">
</head>
<body>
  <form method="post" action="vista/tablas.jsp" class="login">
    <p>
      <label for="login">Email:</label>
      <input type="text" name="login" id="login" value="name@example.com">
    </p>

    <p>
      <label for="password">Password:</label>
      <input type="password" name="password" id="password" value="4815162342">
    </p>

    <p class="login-submit">
      <button type="submit" class="login-button">Login</button>
    </p>

    <p class="forgot-password"><a href="index.jsp">Forgot your password?</a></p>
  </form>

</body>
</html>
