/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;

import java.sql.*;
import java.io.PrintWriter;
import java.sql.DriverManager;
//import java.util.List;
//import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

/**
 *
 * @author Shad
 */
public class BookSearchAction extends org.apache.struts.action.Action {

    private String code = null;

    //private String name=null;
    //private String ath=null;
    /* forward name="success" path="" */
    //private static final String SUCCESS = "success";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            code = request.getParameter("t1");
            //name=request.getParameter("t2");
            //ath=request.getParameter("t3");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/hr", "root", "root");
                PreparedStatement ps = connection.prepareStatement("select * from book_list where book_code=?");
                ps.setString(1, code);
                ResultSet rs = ps.executeQuery();
                
                out.println("<body><center>");
                out.println("<table border=1>");
                out.println("<tr><td>Book code</td><td>Book Name</td><td>First Author</td><td>Edition</td><td>Rack No.</td></tr>");
                while (rs.next()) {
                    out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(3) + "</td><td>"
                            + rs.getString(4) + "</td><td>" + rs.getString(6) + "</td><td>" + rs.getString(10) + "</td></tr>");

                }
       
                out.println("<br><a href='adsuccess.jsp'>Back to Admin Profile.</a>");
                out.println("</center></table></body>");
                

                /**
                 * SessionFactory factory = new
                 * Configuration().configure().buildSessionFactory(); Session
                 * session = factory.openSession();
                 *
                 * String query = "from AddBookBean B";//full column from table
                 * Query q = session.createQuery(query); List<AddBookBean> lt =
                 * q.list(); for (AddBookBean bb : lt) { String cd =
                 * bb.getBkcode(); if (cd.equals(code)) { String qry = "FROM
                 * AddBookBean A WHERE A.bkcode= :book_code";//specific record
                 * retrieve from table Query qr = session.createQuery(qry);
                 * qr.setParameter("book_code", code); List<AddBookBean> lit =
                 * qr.list();
                 *
                 * request.setAttribute("F", lit); RequestDispatcher view =
                 * request.getRequestDispatcher("a.jsp"); view.forward(request,
                 * response); } else { out.println("Book code Not Found. <br>");
                 * RequestDispatcher view =
                 * request.getRequestDispatcher("b.jsp"); view.include(request,
                 * response); } }
                 */
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mapping.findForward(null);
    }
}

