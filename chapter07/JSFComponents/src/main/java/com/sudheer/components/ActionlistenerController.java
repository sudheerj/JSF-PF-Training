package com.sudheer.components;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class ActionlistenerController{
 
	public String username;
 
	public String outcome(){
		return "/views/setpropertyactionlistenerresponse.xhtml?faces-redirect=true";
	}
 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
}