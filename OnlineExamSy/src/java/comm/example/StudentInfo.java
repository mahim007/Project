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
 * @author ismilerahman79
 */
public class StudentInfo extends org.apache.struts.action.ActionForm {

    private String name;
    private String gender;
    private String username;
    private String password;
    private String address;
    private String email;
    private int mobile;
    private int year1, year2;
    private int roll1, roll2;
    private float gpa1, gpa2;
    private int payno;

    public StudentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public StudentInfo(String name, String gender, String username, String password, String address, String email, int mobile, int year1, int year2, int roll1, int roll2, int gpa1, int gpa2, int payno) {
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
        this.year1 = year1;
        this.year2 = year2;
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.payno = payno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getYear1() {
        return year1;
    }

    public void setYear1(int year1) {
        this.year1 = year1;
    }

    public int getYear2() {
        return year2;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }

    public int getRoll1() {
        return roll1;
    }

    public void setRoll1(int roll1) {
        this.roll1 = roll1;
    }

    public int getRoll2() {
        return roll2;
    }

    public void setRoll2(int roll2) {
        this.roll2 = roll2;
    }

    public float getGpa1() {
        return gpa1;
    }

    public void setGpa1(float gpa1) {
        this.gpa1 = gpa1;
    }

    public float getGpa2() {
        return gpa2;
    }

    public void setGpa2(float gpa2) {
        this.gpa2 = gpa2;
    }

    public int getPayno() {
        return payno;
    }

    public void setPayno(int payno) {
        this.payno = payno;
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 5) {
            errors.add("name", new ActionMessage("error.name"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getUsername() == null || getUsername().length() < 5) {
            errors.add("username", new ActionMessage("error.username"));
        }
        if (getPassword() == null || getPassword().length() < 8) {
            errors.add("password", new ActionMessage("error.password"));
        }
        if (getAddress() == null || getAddress().length() < 10) {
            errors.add("address", new ActionMessage("error.address"));
        }
        if (getMobile() < 10) {
            errors.add("mobile", new ActionMessage("error.mobile"));
        }
        if (getEmail() == null || getEmail().length() < 10) {
            errors.add("email", new ActionMessage("error.email"));
        }
        return errors;
    }
}
