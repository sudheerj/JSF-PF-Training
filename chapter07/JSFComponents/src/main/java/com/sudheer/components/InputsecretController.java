package com.sudheer.components;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class InputsecretController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String password;
	 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}

	

}