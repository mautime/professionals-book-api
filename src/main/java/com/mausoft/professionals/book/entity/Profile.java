package com.mausoft.professionals.book.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.mausoft.common.entity.AbstractAuditEntity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="PROFILE_ID"))})
public class Profile extends AbstractAuditEntity<User> {
	private static final long serialVersionUID = 5031061210654693642L;
	
	public Profile() {}
	
	public Profile(long id) {
		setId(id);
	}
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String description;
	private String legend;
	private String picture;
	private String pictureXs;
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="OWNER_ID")
	private User owner;
	@OneToOne(mappedBy="profile", fetch=FetchType.LAZY)
	private ProfessionalProfile professionalProfile;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String aFirstName) {
		firstName = aFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String aLastName) {
		lastName = aLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String aEmail) {
		email = aEmail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String aPhone) {
		phone = aPhone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String aDescription) {
		description = aDescription;
	}
	public String getLegend() {
		return legend;
	}
	public void setLegend(String aLegend) {
		legend = aLegend;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String aPicture) {
		picture = aPicture;
	}
	public String getPictureXs() {
		return pictureXs;
	}
	public void setPictureXs(String aPictureXs) {
		pictureXs = aPictureXs;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User aOwner) {
		owner = aOwner;
	}
	public ProfessionalProfile getProfessionalProfile() {
		return professionalProfile;
	}
	public void setProfessionalProfile(ProfessionalProfile aProfessionalProfile) {
		professionalProfile = aProfessionalProfile;
	}
}