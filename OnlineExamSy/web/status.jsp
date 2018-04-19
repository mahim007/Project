<%-- 
    Document   : status
    Created on : Mar 28, 2017, 11:52:39 AM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Student Status</h1>
        <table>
            <tr>
                <td>
               
                    <%
                        String name = request.getParameter("un");
                        String sql = "select * from stuinfo where username =?";
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hr", "root", "root");
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setString(1, name);
                        ResultSet rs = ps.executeQuery();
                        while (rs.next()) {
                            out.println("<table>");
                            out.println("<tr><td>Name :</td><td>" + rs.getString(3)+"</td></tr>");
                            out.println("<tr><td>Gender :</td><td>" + rs.getString(4)+"</td></tr>");
                            out.println("<tr><td>Address :</td><td>" + rs.getString(5)+"</td></tr>");
                            out.println("<tr><td>Mobile :</td><td>" + rs.getInt(6)+"</td></tr>");
                            out.println("<tr><td>Email :</td><td>v" + rs.getString(7)+"</td></tr>");
                            out.println("<tr><td>SSC Roll :</td><td>" + rs.getInt(8)+"</td></tr>");
                            out.println("<tr><td>Passed Year :</td><td>" + rs.getInt(9)+"</td></tr>");
                            out.println("<tr><td>SSC GPA:</td><td>" + rs.getFloat(10)+"</td></tr>");
                            out.println("<tr><td>HSC Roll :</td><td>" + rs.getInt(11)+"</td></tr>");
                            out.println("<tr><td>Passed Year:</td><td>" + rs.getInt(12)+"</td></tr>");
                            out.println("<tr><td>HSC GPA :</td><td>" + rs.getFloat(13)+"</td></tr>");
                            out.println("</table>");
                            out.println("<a href='examination.jsp'>Begin Examination</a>");
                       
                        }
                    %>
                </td>
            </tr>
        </table>
    </center>
    </body>
</html>
