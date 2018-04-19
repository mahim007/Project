
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Issue</title>
    </head>
    <body>
    <center>
        <h1>Issue Book</h1><br>

        <form action="issuebook.do" method="post">
            <table>
                <tr>
                    <td>Member ID:</td>
                    <td><input type="text" name="t1" required/></td>
                </tr>

                <tr>
                    <td>Book Code:</td> 
                    <td><input type="text" name="t2" required/></td>
                </tr>

                <tr>
                    <td>Book Name:</td> 
                    <td><input type="text" name="t3" required/></td>
                </tr>

                <tr>
                    <td>Issue Date(yyyy-mm-dd):</td>
                    <td><input type="text" name="t4" required/></td>
                </tr>

                <tr>
                    <td>Return Date(yyyy-mm-dd):</td>
                    <td><input type="text" name="t5" required/></td>
                </tr>

                <tr>
                    <td><input type="submit" value="Submit"/></td>     
                    <td><input type="reset" value="Clear"/></td>
                </tr>

            </table>
        </form>
    </center>
</body>
</html>
