<%-- 
    Document   : index
    Created on : Mar 18, 2021, 6:20:23 PM
    Author     : cmgp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <h1>Testing!!!</h1>
        <form action="/crudapijakarta/resources/clientes" method="post">
            <label>Name</label>
            <input type="text" name="name"/>
            <label>Ci</label>
            <input type="text" name="ci"/>
            <input type="submit" />
        </form>
    </body>
</html>
