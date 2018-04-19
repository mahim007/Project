package com.dsi.entity;
import com.hibernate.chapter1.Salary;
import javax.persistence.*;

/**
 * Created by habib on 5/10/17.
 */

@Entity
@Table(name="student_ict")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@Column(name = "s_name", nullable = false, length = 10,unique = true)
    private String name;
    private String fName;
    private String roll;

//    @ManyToOne(cascade={CascadeType.ALL})
//    @JoinColumn(name="salary_id")
//    private Salary salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    
}
