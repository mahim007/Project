/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm.example;


public class IssueBook {
    private String id;
    private String bcode;
    private String bname;
    private String idate;
    private String rdate;

    public IssueBook() {
    }

    public IssueBook(String id, String bcode, String bname, String idate, String rdate) {
        this.id = id;
        this.bcode = bcode;
        this.bname = bname;
        this.idate = idate;
        this.rdate = rdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getIdate() {
        return idate;
    }

    public void setIdate(String idate) {
        this.idate = idate;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }
  
    
}
