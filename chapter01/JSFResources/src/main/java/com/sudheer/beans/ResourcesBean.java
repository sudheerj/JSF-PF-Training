package com.sudheer.beans;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class ResourcesBean {

    private String messageProperty = "message";
    private String messageFontProperty = "message-font";
    private String oddevenProperty = "odd, even";
    private String text = "JSF";
    private String passedParameter;
    private String carCompany = "Renault";
    private String carName;
    private Map<String, String[]> allCars = new HashMap<String, String[]>();
    private static final String[] carsRenault = new String[]{"Clio", "Clio  Estate", "Clio RS", "Symbol",
        "Fluence", "Sedan", "Megane", "Megane Coupe", "Megan Sport Tourer", "Scenic", "Grand Scenic", "Kangoo",
        "Coupe", "Koleos", "Espace", "Laguna", "Laguna Estate"};
    private static final String[] carsFiat = new String[]{"500", "Panda", "Punto Classic", "Grande Punto Unico",
        "Albea", "Bravo", "Linea", "Croma", "Sedici", "Doblo Panorama"};
    private static final String[] carsDacia = new String[]{"Sandero", "Logan", "Logan MCV", "Van", "Pick-up"};
    private String param_1 = "Me";
    private String param_2 = "You";

    public ResourcesBean() {
        allCars.put("Renault", carsRenault);
        allCars.put("Fiat", carsFiat);
        allCars.put("Dacia", carsDacia);
    }

    public String getMessageProperty() {
        return messageProperty;
    }

    public void setMessageProperty(String messageProperty) {
        this.messageProperty = messageProperty;
    }

    public String getMessageFontProperty() {
        return messageFontProperty;
    }

    public void setMessageFontProperty(String messageFontProperty) {
        this.messageFontProperty = messageFontProperty;
    }

    public String getOddevenProperty() {
        return oddevenProperty;
    }

    public void setOddevenProperty(String oddevenProperty) {
        this.oddevenProperty = oddevenProperty;
    }
    
    public String deleteRecord(){
    	System.out.println("Record deleted");
    	return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void listenerNewWindow() {
        System.out.println("Listener New Window");
        //return null;
    }

    public String actionNewWindow() {
        System.out.println("Action New Window");
        return null;
    }
    
    public String action() {
        System.out.println("Action method");
        return null;
    }
    
    public String getPassedParameter() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        this.passedParameter = (String) facesContext.getExternalContext().getRequestParameterMap().get("id");
        return this.passedParameter;
    }

    public void setPassedParameter(String passedParameter) {
        this.passedParameter = passedParameter;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Map<String, String[]> getAllCars() {
        return allCars;
    }

    public void setAllCars(Map<String, String[]> allCars) {
        this.allCars = allCars;
    }
    
    public String getParam_1() {
        return param_1;
    }

    public void setParam_1(String param_1) {
        this.param_1 = param_1;
    }

    public String getParam_2() {
        return param_2;
    }

    public void setParam_2(String param_2) {
        this.param_2 = param_2;
    }


}
