/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Shad
 */
public class AdminBean extends org.apache.struts.action.ActionForm {
    
   private String id;
   private String pass;

    public AdminBean() {
    }

    public AdminBean(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

   
    

    
   @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        
       
        ActionErrors errors = new ActionErrors();
        if (!getId().equals("admin123")) {
            errors.add("id", new ActionMessage("error.adId.invalid"));
        
        }
        if(!getPass().equals("admin@123")){
          errors.add("pass", new ActionMessage("error.adPass.invalid"));  
        }
        return errors;
    }
}
