/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author HP
 */
public class ExamAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
 
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int count=0;
        String an2=request.getParameter("ri");
        Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("select ans from quesset");
                String an1=rs.getString(1);
                while(rs.next()){
                if (an2.equals(an1)) {
                    
            count++;
        }
                }
        System.out.println(count);
        HttpSession session=request.getSession();
        session.setAttribute("score", count);
        
        return mapping.findForward(null);
    }
}
