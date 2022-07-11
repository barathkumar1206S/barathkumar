package com.chainsys.mavenlessons.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Appointment")
public class Appointment {
@Id
@Column(name="APP_ID")
private int id;
@Column(name="APP_DATE ")
private Date appointDATE ;
@Column(name="Doc_ID ")
private int doctorid;
@Column(name="PATIENT_NAME")
private String patientname;
@Column(name="FEES_COLLECTED")
private float fees;
@Column(name="FEES_NATURE")
private String feestype;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="doc_id", nullable = false,insertable = false,updatable =false)
@JsonIgnore
private Doctor doctor;
public Doctor getDoctor() {
	return this.doctor;
}
public void setDoctor(Doctor doc) {
	this.doctor=doc;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getAppointDATE() {
	return appointDATE;
}
public void setAppointDATE(Date appointDATE) {
	this.appointDATE = appointDATE;
}
public int getDoctorid() {
	return doctorid;
}
public void setDoctorid(int doctorid) {
	this.doctorid = doctorid;
}
public String getPatientname() {
	return patientname;
}
public void setPatientname(String patientname) {
	this.patientname = patientname;
}
public float getFees() {
	return fees;
}
public void setFees(float fees) {
	this.fees = fees;
}
public String getFeestype() {
	return feestype;
}
public void setFeestype(String feestype) {
	this.feestype = feestype;
}

@Override
public String toString() {
    return String.format("%d, %s, %d,%s,%.2f, %s",id,appointDATE,doctorid,patientname,fees,feestype);
}

}
     