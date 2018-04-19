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
public class AddBookBean extends org.apache.struts.action.ActionForm {
    
    private String bkcode;
    private String bkfield;
    private String bkname;
    private String fauthor;
    private String sauthor;
    private String bkedition;
    private int bkquantity;
    private String endate;
    private double bkprice;
    private String bkrack;

    public AddBookBean() {
    }

    public AddBookBean(String bkcode, String bkfield, String bkname, String fauthor, String sauthor, String bkedition, int bkquantity, String endate, double bkprice,String bkrack) {
        this.bkcode = bkcode;
        this.bkfield = bkfield;
        this.bkname = bkname;
        this.fauthor = fauthor;
        this.sauthor = sauthor;
        this.bkedition = bkedition;
        this.bkquantity = bkquantity;
        this.endate = endate;
        this.bkprice = bkprice;
        this.bkrack=bkrack;
    }

    public String getBkcode() {
        return bkcode;
    }

    public void setBkcode(String bkcode) {
        this.bkcode = bkcode;
    }

    public String getBkfield() {
        return bkfield;
    }

    public void setBkfield(String bkfield) {
        this.bkfield = bkfield;
    }

    public String getBkname() {
        return bkname;
    }

    public void setBkname(String bkname) {
        this.bkname = bkname;
    }

    public String getFauthor() {
        return fauthor;
    }

    public void setFauthor(String fauthor) {
        this.fauthor = fauthor;
    }

    public String getSauthor() {
        return sauthor;
    }

    public void setSauthor(String sauthor) {
        this.sauthor = sauthor;
    }

    public String getBkedition() {
        return bkedition;
    }

    public void setBkedition(String bkedition) {
        this.bkedition = bkedition;
    }

    public int getBkquantity() {
        return bkquantity;
    }

    public void setBkquantity(int bkquantity) {
        this.bkquantity = bkquantity;
    }

    public String getEndate() {
        return endate;
    }

    public void setEndate(String endate) {
        this.endate = endate;
    }

    public double getBkprice() {
        return bkprice;
    }

    public void setBkprice(double bkprice) {
        this.bkprice = bkprice;
    }

    public String getBkrack() {
        return bkrack;
    }

    public void setBkrack(String bkrack) {
        this.bkrack = bkrack;
    }
    
    
                    
            
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        if (getBkcode().equals("")||getBkcode().length()<10) {
            errors.add("bkcode", new ActionMessage("error.bkcode.required"));
            
        }
        if (getBkname().equals("")) {
            errors.add("bkname", new ActionMessage("error.bkname.required"));
            
        }
        if (getBkfield().equals("")) {
            errors.add("bkfield", new ActionMessage("error.bkfield.required"));
            
        }
        if (getFauthor().equals("")) {
            errors.add("fauthor", new ActionMessage("error.fauthor.required"));
            
        }
        if (getBkedition().equals("")) {
            errors.add("bkedition", new ActionMessage("error.bkedition.required"));
            
        }
        if (getBkquantity()==0 ){
            errors.add("bkquantity", new ActionMessage("error.bkquantity.required"));
            
        }
        if (getEndate().equals("")) {
            errors.add("endate", new ActionMessage("error.endate.required"));
            
        }
        if (getBkprice()==0) {
            errors.add("bkprice", new ActionMessage("error.bkprice.required"));
            
        }
        if (getBkrack().equals("")) {
            errors.add("bkrack", new ActionMessage("error.bkrack.required"));
            
        }
        return errors;
    }
}
