package com.sudheer.components;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class InputtextareaController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String address;
	 
	public String getAddress() {
		return address;
	}
 
	public void setAddress(String address) {
		this.address = address;
	}

	

}