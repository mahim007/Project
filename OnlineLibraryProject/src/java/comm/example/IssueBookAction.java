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

/**
 *
 * @author Shad
 */
public class IssueBookAction extends org.apache.struts.action.Action {

    private String id = null;
    private String bcode = null;
    private String bname = null;
    private String idate = null;
    private String rdate = null;

    /* forward name="success" path="" */
    //private static final String SUCCESS = "issuccess";

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            id = request.getParameter("t1");
            bcode = request.getParameter("t2");
            bname = request.getParameter("t3");
            idate = request.getParameter("t4");
            rdate = request.getParameter("t5");

            try {
                SessionFactory factory = new Configuration().configure().buildSessionFactory();
                Session session = factory.openSession();

                String query = "from RegisterBean R";
                Query q = session.createQuery(query);
                List<RegisterBean> lst = q.list();
                for (RegisterBean bm : lst) {
                    String tt=bm.getMid();
                    if (tt.equals(id)) {
                        IssueBook k = new IssueBook();
                        k.setId(id);
                        k.setBcode(bcode);
                        k.setBname(bname);
                        k.setIdate(idate);
                        k.setRdate(rdate);
                        session.getTransaction().begin();
                        session.save(k);
                        session.getTransaction().commit();

                        out.println("One Book issued Successfully for ID "+tt+"<br>");
                        RequestDispatcher view = request.getRequestDispatcher("issue.jsp");
                        view.include(request, response);

                    } else {
                        out.println("Member Id not found.<br>");
                        RequestDispatcher view = request.getRequestDispatcher("issue.jsp");
                        view.include(request, response);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return mapping.findForward(null);
        }
    }}
