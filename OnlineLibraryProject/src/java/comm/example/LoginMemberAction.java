/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginMemberAction extends org.apache.struts.action.Action {

    private String userid = null;
    private String userpassword = null;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        userid = request.getParameter("id");
        userpassword = request.getParameter("password");

        try {
            
            //RegisterBean rb=(RegisterBean)form;
            SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session session = factory.openSession();
            String query = "from RegisterBean R";

            Query q = session.createQuery(query);
            List<RegisterBean> list = q.list();

            for (RegisterBean h : list) {
                String tString=h.getMid();
                String pString=h.getMpass();
                if (tString.equals(userid) || pString.equals(userpassword)) {
                    RequestDispatcher view = request.getRequestDispatcher("mlsuccess.jsp");
                    view.forward(request, response);
                } else {
                    out.println("User Id or Password didn't match");
                    RequestDispatcher view = request.getRequestDispatcher("member.jsp");
                    view.include(request, response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward(null);
    }
}}
