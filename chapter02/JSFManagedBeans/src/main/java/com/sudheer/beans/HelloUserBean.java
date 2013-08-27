package com.sudheer.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloUserBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getWelcomeMessage(){
		//check if null?
		if("".equals(username) || username ==null){
			return "";
		}else{
			return " Welcome " + username;
		}
	}
	
}