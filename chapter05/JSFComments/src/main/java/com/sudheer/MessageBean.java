package com.sudheer;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="msg")
@SessionScoped
public class MessageBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2660616404566699470L;
	String buttonLabel = "Submit";

	public String getButtonLabel() {
		return buttonLabel;
	}

	public void setButtonLabel(String buttonLabel) {
		this.buttonLabel = buttonLabel;
	}

}