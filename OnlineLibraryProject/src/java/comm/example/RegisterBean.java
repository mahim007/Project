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

/**
 *
 * @author Shad
 */
public class RegisterBean extends org.apache.struts.action.ActionForm {
    
    
     private String mid;
     private String mpass;
     private String mname;
     private String maddress;
     private String mgender;
     private String memail;
     private String mcontact;
     private String moccupation;

    public RegisterBean() {
    }

    public RegisterBean(String mid, String mpass, String mname, String maddress, String mgender, String memail, String mcontact, String moccupation) {
        this.mid = mid;
        this.mpass = mpass;
        this.mname = mname;
        this.maddress = maddress;
        this.mgender = mgender;
        this.memail = memail;
        this.mcontact = mcontact;
        this.moccupation = moccupation;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpass() {
        return mpass;
    }

    public void setMpass(String mpass) {
        this.mpass = mpass;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public String getMgender() {
        return mgender;
    }

    public void setMgender(String mgender) {
        this.mgender = mgender;
    }

    public String getMemail() {
        return memail;
    }

    public void setMemail(String memail) {
        this.memail = memail;
    }

    public String getMcontact() {
        return mcontact;
    }

    public void setMcontact(String mcontact) {
        this.mcontact = mcontact;
    }

    public String getMoccupation() {
        return moccupation;
    }

    public void setMoccupation(String moccupation) {
        this.moccupation = moccupation;
    }
     
     
     
     @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getMid().equals("")) {
            errors.add("mid", new ActionMessage("error.mid.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getMpass().equals("") || getMpass().length()<8) {
            errors.add("mpass", new ActionMessage("error.mpassword.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getMname().equals("")||getMname().length()<5) {
            errors.add("mname", new ActionMessage("error.mname.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getMaddress().equals("")) {
            errors.add("maddress", new ActionMessage("error.maddress.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getMgender().equals("Select")) {
            errors.add("mgender", new ActionMessage("error.mgender.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getMemail().equals("")) {
            errors.add("memail", new ActionMessage("error.memail.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getMcontact().equals("")|| getMcontact().length()<11) {
            errors.add("mcontact", new ActionMessage("error.mcontact.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getMoccupation().equals("")) {
            errors.add("moccupation", new ActionMessage("error.moccupation.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
