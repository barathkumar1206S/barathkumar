package com.chainsys.application.doctor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
    private int doc_id;
    private String doc_name;
    private Date dob;
    private String speciality;
    private String city;
    private long phone_no;
    @Column(name="standard_fees")
    private float standard_fees;
    public int getDoc_id() {
        return doc_id;
    }
    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }
    public String getDoc_name() {
        return doc_name;
    }
    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public long getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }
    public float getStandard_fees() {
		return standard_fees;
	}
	public void setStandard_fees(float standard_fees) {
		this.standard_fees = standard_fees;
	}
    
    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %d",doc_id,doc_name,dob,city,phone_no);
    }
	

}