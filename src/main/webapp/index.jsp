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
        <br>
        <a href="/crudapijakarta/resources/hola">Hola mundo Api</a>
        <hr>
        <br>
        <label>Lista de clientes</label>
        <a href="/crudapijakarta/api/clientes">API</a>
        <hr>
        <br>
        <label>Agregar cliente</label><br><br><br>
        <form action="/crudapijakarta/api/clientes" method="post">
            <label>Name</label><br>
            <input type="text" name="name"/><br><br>
            <label>Ci</label><br>
            <input type="text" name="ci"/><br>
            <input type="submit" value="enviar"/>
        </form>
        <hr>
    </body>
</html>
