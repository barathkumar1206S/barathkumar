package com.chainsys.mavenlessons.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name="USER_ID")
    private int id;
    @Column(name="USER_NAME")
    private String name;
    @Column(name="CITY")
    private String city;
    
    @OneToOne(mappedBy="user",fetch=FetchType.LAZY)
    @JsonIgnore
    private Passport passport;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    

}