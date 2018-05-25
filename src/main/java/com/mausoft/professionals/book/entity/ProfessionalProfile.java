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
import javax.persistence.OrderBy;

import com.mausoft.common.entity.AbstractAuditEntity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="PP_ID"))})
public class ProfessionalProfile extends AbstractAuditEntity<User> {
	private static final long serialVersionUID = 5967028008621014696L;
	
	private String summary;
	private String picture;
	private String pictureXs;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PP_ID")
	private Profile profile;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="PP_ID")
	@OrderBy("fromDate DESC")
	private Set<ProfessionalExperience> positions;
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String aSummary) {
		summary = aSummary;
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
	public Set<ProfessionalExperience> getPositions() {
		return positions;
	}
	public void setPositions(Set<ProfessionalExperience> aPositions) {
		positions = aPositions;
	}
}
