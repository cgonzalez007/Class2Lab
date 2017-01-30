
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Response </title>
    </head>
    <body>
        <h1>
            Welcome Response
        </h1>
        <%
           Object obj = request.getAttribute("msg");
           String msg = "Unknown";
           if(obj != null) {
               msg = obj.toString();
           }
           
           // Output html which gets added to the existing html in this position.
           out.println("<p style='font-weight:bold;'>" + msg + "</p>");

        %>
    </body>
</html>
