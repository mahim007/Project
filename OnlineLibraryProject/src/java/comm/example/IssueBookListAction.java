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

public class IssueBookListAction extends org.apache.struts.action.Action {

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

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String query = "from IssueBook ll ";

        Query q = session.createQuery(query);
        List<IssueBook> list = q.list();
        request.setAttribute("IB", list);
        RequestDispatcher view = request.getRequestDispatcher("issuebooklist.jsp");
        view.forward(request, response);

        return mapping.findForward(null);
    }
}
