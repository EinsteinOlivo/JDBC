<%-- 
    Document   : index
    Created on : May 30, 2015, 11:08:09 AM
    Author     : einstein pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
<%-- El esquema de la base de datos esta esta en la carpeta esquema DBO dentro de el proyecto WS --%>
    
    <%-- start web service invocation --%><hr/>
    <strong>Instancia de CorreosController: </strong>
    <%
    try {
	WSC.WSWebService_Service service = new WSC.WSWebService_Service();
	WSC.WSWebService port = service.getWSWebServicePort();
	// TODO process result here
	WSC.CorreosController result = port.correosInstancia();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <%-- start web service invocation --%><hr/>
    <strong>Instancia de PersonasController: </strong>
    <%
    try {
	WSC.WSWebService_Service service = new WSC.WSWebService_Service();
	WSC.WSWebService port = service.getWSWebServicePort();
	// TODO process result here
	WSC.PersonasController result = port.perInstancia();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    
    <%-- start web service invocation --%><hr/>
    <strong>Instancia de TelefonosController: </strong>
    <%
    try {
	WSC.WSWebService_Service service = new WSC.WSWebService_Service();
	WSC.WSWebService port = service.getWSWebServicePort();
	// TODO process result here
	WSC.TelefonosController result = port.telInstancia();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
