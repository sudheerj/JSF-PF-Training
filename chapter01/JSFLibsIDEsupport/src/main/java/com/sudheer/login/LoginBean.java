package com.sudheer.login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		FacesMessage msg = null;
		String returnURL;
		if(username != null  && username.equals("admin") && password != null  && password.equals("admin")) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
			returnURL="welcome?faces-redirect=true";
		} else {
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
			returnURL="";
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return returnURL;
	}

}