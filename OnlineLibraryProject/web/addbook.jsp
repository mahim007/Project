
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add book page</title>
    </head>
    <body>
    <center>
        <h1>Book Informations</h1><br>
        <html:form action="/addbkk" method="post">
            <table>
                <tr>
                    <td>Book Code: </td>
                    <td><html:text name="adbk" property="bkcode"/></td>
                    <td><font color="red"><html:errors property="bkcode"/></font></td>
                <tr/>

                <tr>
                    <td>Related Field:</td> 
                    <td><html:text name="adbk" property="bkfield"/> </td>
                    <td><font color="red"><html:errors property="bkfield"/></font></td>
                <tr/>

                <tr>
                    <td>Book Name: </td>
                    <td><html:text name="adbk" property="bkname"/> </td>
                    <td><font color="red"><html:errors property="bkname"/></font></td>
                <tr/>

                <tr>
                    <td>First Author: </td>
                    <td><html:text name="adbk" property="fauthor"/> </td>
                    <td><font color="red"><html:errors property="fauthor"/></font></td>
                <tr/>

                <tr>
                    <td>Second Author:</td>
                    <td><html:text name="adbk" property="sauthor"/> </td>
                    <td><font color="red"><html:errors property="sauthou"/></font></td>
                <tr/>

                <tr>
                    <td>Edition:</td> 
                    <td><html:text name="adbk" property="bkedition"/></td> 
                    <td><font color="red"><html:errors property="bkedition"/></font></td>
                <tr/>

                <tr>
                    <td>Quantity:</td>
                    <td><html:text name="adbk" property="bkquantity"/></td>
                    <td><font color="red"><html:errors property="bkquantity"/></font></td>
                <tr/>

                <tr>
                    <td>Enlist Date(yyyy-mm-dd):</td>
                    <td><html:text name="adbk" property="endate"/></td> 
                    <td><font color="red"><html:errors property="endate"/></font></td>
                <tr/>

                <tr>
                    <td>Price(per book):</td>
                    <td><html:text name="adbk" property="bkprice"/></td> 
                    <td><font color="red"><html:errors property="bkprice"/></font></td>
                <tr/>

                <tr>
                    <td>Rack No.:</td>
                    <td><html:text name="adbk" property="bkrack"/></td> 
                    <td><font color="red"><html:errors property="bkrack"/></font></td>
                <tr/>

                <tr>
                    <td><html:submit value="ADD"/></td> 
                    <td><html:reset value="CLEAR"/></td>
                <tr/>

            </table>
        </html:form>
    </center>  
</body>
</html>
