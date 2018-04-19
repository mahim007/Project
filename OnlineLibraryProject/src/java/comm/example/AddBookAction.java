/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Shad
 */
public class AddBookAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    //private static final String SUCCESS = "addbooksuccess";

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
            SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        session.getTransaction().begin();
        AddBookBean adb=(AddBookBean)form;
        session.save(adb);
        session.getTransaction().commit();
        
            out.println("One book Added Successfully");
            
            RequestDispatcher view=request.getRequestDispatcher("addbook.jsp");
            view.include(request, response);
        }
        catch(Exception p){
            p.printStackTrace();
        }
        
        
        return mapping.findForward(null);
    }
}
