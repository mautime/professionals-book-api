package com.mausoft.professionals.book.entity;

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.mausoft.common.entity.AbstractAuditEntity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="EP_ID"))})
public class EducationProfile extends AbstractAuditEntity<User> {
	private static final long serialVersionUID = -7420438016659506633L;
	
	private String title;
	private String picture;
	private String pictureXs;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EP_ID")
	private Profile profile;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="EP_ID")
	private Set<EducationAchievement> educationAchievements;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String aTitle) {
		title = aTitle;
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
	public Set<EducationAchievement> getEducationAchievements() {
		return educationAchievements;
	}
	public void setEducationAchievements(Set<EducationAchievement> aEducationAchievements) {
		educationAchievements = aEducationAchievements;
	}
}