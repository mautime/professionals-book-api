package com.mausoft.professionals.book.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

import com.mausoft.common.entity.AbstractBaseEntity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="USER_ID"))})
public class User extends AbstractBaseEntity {
	private static final long serialVersionUID = 8432922731237026255L;
	
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String aUsername) {
		username = aUsername;
	}
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
}