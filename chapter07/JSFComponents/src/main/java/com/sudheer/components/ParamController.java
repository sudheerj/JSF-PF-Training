package com.sudheer.components;
 
import java.util.Map;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean
@SessionScoped
public class ParamController{
 
	public String name;
	public String country;
 
	public String outcome(){
 
		FacesContext fc = FacesContext.getCurrentInstance();
		this.country = getCountryParam(fc);
 
		return "paramresponse";
	}
 
	//get value from "f:param"
	public String getCountryParam(FacesContext fc){
 
		Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
		return params.get("country");
 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
 
 
}