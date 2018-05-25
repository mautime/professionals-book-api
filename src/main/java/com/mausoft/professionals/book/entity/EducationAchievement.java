package com.mausoft.professionals.book.entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

import com.mausoft.common.entity.AbstractAuditEntity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="EA_ID"))})
public class EducationAchievement extends AbstractAuditEntity<User> {
	private static final long serialVersionUID = 3753578273255219763L;
	
	private String achievementName;
	private String achievementUid;
	private Date achievementDate;
	private String institutionName;
	
	public String getAchievementName() {
		return achievementName;
	}
	public void setAchievementName(String aAchievementName) {
		achievementName = aAchievementName;
	}
	public String getAchievementUid() {
		return achievementUid;
	}
	public void setAchievementUid(String aAchievementUid) {
		achievementUid = aAchievementUid;
	}
	public Date getAchievementDate() {
		return achievementDate;
	}
	public void setAchievementDate(Date aAchievementDate) {
		achievementDate = aAchievementDate;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String aInstitutionName) {
		institutionName = aInstitutionName;
	}
}