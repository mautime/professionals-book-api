package com.mausoft.professionals.book.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.mausoft.common.entity.AbstractAuditEntity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="HOBBY_ID"))})
public class Hobby extends AbstractAuditEntity<User> {
	private static final long serialVersionUID = 8589304753527574691L;
	
	private String summary;
	private String description;
	private String picture;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROFILE_ID")
	private Profile profile;
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String aSummary) {
		summary = aSummary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String aDescription) {
		description = aDescription;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String aPicture) {
		picture = aPicture;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile aProfile) {
		profile = aProfile;
	}
}