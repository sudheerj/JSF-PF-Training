package com.sudheer.components;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class LinkController{
 
	public String golinksresponsePage(){
		
		return "/views/linksresponse.xhtml?faces-redirect=true";
		
	}
}
