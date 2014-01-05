package com.sudheer.components;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class ButtonController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String sayHello(){
		return "/views/buttonsresponse.xhtml?faces-redirect=true";
	}

}