package com.sudheer.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="welcomemessage")
@SessionScoped
public class WelcomeMessageBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String welcomemessage = "Welcome to JSF 2.x";

	public String getWelcomemessage() {
		return welcomemessage;
	}

	public void setWelcomemessage(String welcomemessage) {
		this.welcomemessage = welcomemessage;
	}

	

}