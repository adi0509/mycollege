<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id = "employee" class = "test.Beans"> 
         <jsp:setProperty name = "employee" property = "name" value = "ABC"/>
         <jsp:setProperty name = "employee" property = "id" value = "101"/>
         <jsp:setProperty name = "employee" property = "dept" value = "Marketing"/>
        </jsp:useBean>

      <p>Employee Name: 
         <jsp:getProperty name = "employee" property = "name"/>
      </p>
      
      <p>Employee ID:  
         <jsp:getProperty name = "employee" property = "id"/>
      </p>
      
      <p>Employee Department: 
         <jsp:getProperty name = "employee" property = "dept"/>
      </p>
    </body>
</html>
