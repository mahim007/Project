/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.script.ScriptEngine;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ismilerahman79
 */
public class MyAction extends org.apache.struts.action.Action {

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
        try {
            StudentInfo si = (StudentInfo)form;
            String username = si.getUsername();
            String password = si.getPassword();
            String name = si.getName();
            String gender = si.getGender();
            String address = si.getAddress();
            int mobile = si.getMobile();
            String email = si.getEmail();
            int roll1 = si.getRoll1();
            int year1 = si.getYear1();
            float gpa1 = si.getGpa1();
            int roll2 = si.getRoll2();
            int year2 = si.getYear2();
            float gpa2 = si.getGpa2();
            int payno = si.getPayno();
            String sql = "insert into stuinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hr", "root", "root");
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setString(4, gender);
            ps.setString(5, address);
            ps.setInt(6, mobile);
            ps.setString(7, email);
            ps.setInt(8, roll1);
            ps.setInt(9, year1);
            ps.setFloat(10, gpa1);
            ps.setInt(11, roll2);
            ps.setInt(12, year2);
            ps.setFloat(13, gpa2);
            ps.setInt(14, payno);

           ps.executeUpdate();
            RequestDispatcher view = request.getRequestDispatcher("successful.jsp");
            view.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward(null);
    }
}
