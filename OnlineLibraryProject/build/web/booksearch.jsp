
<%@page import="java.util.List"%>
<%@page import="comm.example.AddBookBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Search</title>
    </head>
    <body>
    <center>
      
        <%--
        <%
            Object t=request.getAttribute("F");
            if(t!=null){
            List<AddBookBean> list=(List<AddBookBean>)t;
            out.println("<table border=1>");
            out.println("<tr><td>Book code</td><td>Book Name</td><td>First Author</td><td>Edition</td><td>Rack No.</td></tr>");
            for(AddBookBean b:list)
            {
               out.println("<tr><td>"+b.getBkcode()+"</td><td>"+b.getBkname()+"</td><td>"
                       +b.getFauthor()+"</td><td>"+b.getBkedition()+"</td><td>"+b.getBkrack()+"</td></tr>");
            }
            out.println("</table>");
            }
            %>
            --%>
      <h1>Search!!!</h1><br>
        <form action="booksearchaction.do" method="post">
        Book Code:<input type="text" name="t1" required/> <br>
        <!--Book Name:<input type="text" name="t2" required> <br>
        Author:<input type="text" name="t3" required> <br>
        -->
        <input type="submit" name="Search"/>
        </form>
        </center>
</body>
</html>
