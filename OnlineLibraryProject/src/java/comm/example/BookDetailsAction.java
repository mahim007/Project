/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;

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
public class BookDetailsAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    //private static final String SUCCESS = "success";
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

        try{
            SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String query = "from AddBookBean ll ";

        Query q = session.createQuery(query);
        List<AddBookBean> list = q.list();
        request.setAttribute("DF", list);
        RequestDispatcher view = request.getRequestDispatcher("bookdet.jsp");
        view.forward(request, response);
        }catch(Exception e){
            e.printStackTrace();
        }

        return mapping.findForward(null);
    }
}
