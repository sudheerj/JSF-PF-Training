package com.sudheer.helloworld;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

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

	public String getWelcomemessage(){
		   //null check
		   if("".equals(username) || username ==null){
			return "";
		   }else{
			return "Ajax message :: Welcome User: " + username;
		   }
		}

}