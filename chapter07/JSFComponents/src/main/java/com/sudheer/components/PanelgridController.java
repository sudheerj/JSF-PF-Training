package com.sudheer.components;
 
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class PanelgridController implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int number;
 
	public int getNumber() {
		return number;
	}
 
	public void setNumber(int number) {
		this.number = number;
	}
 
}