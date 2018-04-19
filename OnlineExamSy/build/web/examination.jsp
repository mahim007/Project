<%-- 
    Document   : examination
    Created on : Mar 29, 2017, 12:03:43 PM
    Author     : HP
--%>

<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<HTML>
    <HEAD>
        <TITLE>Navigating in a Database Table </TITLE>
    </HEAD>
    <BODY>
        
        <%          int c = 0;

            Connection connection = null;

            String connectionURL = "jdbc:mysql://localhost:3306/hr";

            ResultSet rs = null;
        %>
        <FORM NAME="form1" ACTION="examination.jsp" METHOD="get"><%
            if (request.getParameter("hidden") != null) {
                c = Integer.parseInt(request.getParameter("hidden"));
            }
            Statement statement = null;
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                connection = DriverManager.getConnection(connectionURL, "root", "root");
                statement = connection.createStatement();
                rs = statement.executeQuery("select * from quesset");
                for (int i = 0; i < c; i++) {
                    rs.next();
                }
                if (!rs.next()) {

                    out.println("Examination is completed");
                    //out.println("<br/><a href='exam.do'>Exam Score</a>");
                } else {
            %>
            <center>
                <h1>Examination Question</h1>
            <TABLE >

                <TR><TD>Ques:</TD><TD> <%= rs.getString(2)%> </TD></tr>
                <TR><TD>a.</TD><TD><input type="radio" name="ri" value="a">  <%= rs.getString(3)%> </TD></tr>
                <TR><TD>b.</TD><TD><input type="radio" name="ri" value="b">  <%= rs.getString(4)%> </TD></tr>
                <TR><TD>c.</TD><TD><input type="radio" name="ri" value="c">  <%= rs.getString(5)%> </TD></tr>    
                <TR><TD>d.</TD><TD><input type="radio" name="ri" value="d">  <%= rs.getString(6)%> </TD></tr>    
              
            <tr><td><INPUT TYPE="hidden" NAME="hidden" VALUE="<%=c + 1%>"><td>
            <td><INPUT TYPE="submit" VALUE="next record"></td></tr>
            </TABLE>
            </center>
        </FORM>
        <%
                }
            } catch (Exception ex) {

                ex.printStackTrace();
            } finally {
                // close all the connections.
                rs.close();
                statement.close();
                connection.close();
            }
        %>
    </FORM>
</body> 
</html>

