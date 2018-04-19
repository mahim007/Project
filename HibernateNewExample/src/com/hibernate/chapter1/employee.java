package com.hibernate.chapter1;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Employee")
//@Table(name="University_Employee",uniqueConstraints = {@UniqueConstraint(columnNames={"month", "day"})}
//)
public class employee {

     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

	@Lob
private String name;
 @Column(name = "roll",length=120)
private String roll;


@ManyToOne(cascade={CascadeType.ALL})
@JoinColumn(name="employee")
private Salary salary;

/*@Embedded private salary salary;
public salary getAddress() { return salary; }
public void setAddress() { this.salary = salary; }*/
private String address;

	   /*// boolean nullable() default true;,
	    boolean insertable()  default true;,
	    boolean updatable()  default true;,
	    String columnDefinition() default "";,
	    String table default() "";,
	    int length() default 255;,
	    int precision() default 0; ,// decimal precision
	    int scale() default 0;) // decimal scale
*/
 public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

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

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
