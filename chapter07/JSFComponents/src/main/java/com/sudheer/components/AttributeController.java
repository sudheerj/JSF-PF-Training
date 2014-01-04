package com.sudheer.components;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
 
@ManagedBean
@SessionScoped
public class AttributeController{
 
	public String nickname;
 
	//action listener event
	public void attrListener(ActionEvent event){
 
		nickname = (String)event.getComponent().getAttributes().get("username");
 
	}
 
	public String outcome(){
		return "/views/attributeresponse?faces-redirect=true";
	}
 
	public String getNickname() {
		return nickname;
	}
 
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}