package com.mausoft.professionals.book.entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

import com.mausoft.common.entity.AbstractAuditEntity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="PE_ID"))})
public class ProfessionalExperience extends AbstractAuditEntity<User> {
	private static final long serialVersionUID = -331127189880059307L;
	
	private String title;
	private String companyName;
	private Date fromDate;
	private Date toDate;
	private String city;
	private String state;
	private String country;
	private boolean actual;
	private String summary;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String aTitle) {
		title = aTitle;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String aCompanyName) {
		companyName = aCompanyName;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date aFromDate) {
		fromDate = aFromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date aToDate) {
		toDate = aToDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String aCity) {
		city = aCity;
	}
	public String getState() {
		return state;
	}
	public void setState(String aState) {
		state = aState;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String aCountry) {
		country = aCountry;
	}
	public boolean isActual() {
		return actual;
	}
	public void setActual(boolean aActual) {
		actual = aActual;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String aSummary) {
		summary = aSummary;
	}
}