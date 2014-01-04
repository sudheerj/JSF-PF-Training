package com.sudheer.components;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class InputhiddenController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String answer = "I'm Hidden value!";
	 
	public String getAnswer() {
		return answer;
	}
 
	public void setAnswer(String answer) {
		this.answer = answer;
	}	
	

}