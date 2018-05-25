package com.mausoft.common.entity;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public abstract class AbstractAuditEntity<U extends IEntity> extends AbstractBaseEntity {
	private static final long serialVersionUID = 3979500414910993397L;
	
	@CreatedBy
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CREATED_BY")
	@JsonIgnore
	private U createdBy;
	@CreatedDate
	private Date createdDate;
	@LastModifiedBy
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="LAST_UPDATED_BY")
	@JsonIgnore
	private U lastUpdatedBy;
	@LastModifiedDate
	private Date lastUpdatedDate;
	
	public U getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(U aCreatedBy) {
		createdBy = aCreatedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date aCreatedDate) {
		createdDate = aCreatedDate;
	}
	public U getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(U aLastUpdatedBy) {
		lastUpdatedBy = aLastUpdatedBy;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date aLastUpdatedDate) {
		lastUpdatedDate = aLastUpdatedDate;
	}
}