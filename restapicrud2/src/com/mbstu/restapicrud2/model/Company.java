package com.mbstu.restapicrud2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by amjad on 8/14/14.
 */
@Entity
@Table(name = "company")
public class Company {

    @Id
    @SequenceGenerator(name = "company_id_seq", sequenceName = "company_id_seq")
    @GeneratedValue(generator = "company_id_seq")
    private Long id;

    private String name;

    private String city;

    private String country;

    private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
