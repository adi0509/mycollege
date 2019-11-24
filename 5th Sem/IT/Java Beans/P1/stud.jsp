<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id = "students" class = "test.Beans"> 
         <jsp:setProperty name = "students" property = "name" value = "ABC"/>
         <jsp:setProperty name = "students" property = "roll" value = "1400"/>
         <jsp:setProperty name = "students" property = "course" value = "Bsc CS"/>
      </jsp:useBean>

      <p>Student Name: 
         <jsp:getProperty name = "students" property = "name"/>
      </p>
      
      <p>Student roll no. : 
         <jsp:getProperty name = "students" property = "roll"/>
      </p>
      
      <p>Student Course: 
         <jsp:getProperty name = "students" property = "course"/>
      </p>
    </body>
</html>
