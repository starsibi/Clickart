package com.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class UserAuthorization {
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mail_id")
	private RegistrationDetails regdet;
	@Id
	private int userauthid;
	private String role;
	

	public int getUserauthid() {
		return userauthid;
	}

	public void setUserauthid(int userauthid) {
		this.userauthid = userauthid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public RegistrationDetails getRegdet() {
		return regdet;
	}

	public void setRegdet(RegistrationDetails regdet) {
		this.regdet = regdet;
	}

	
}
