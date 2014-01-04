package com.sudheer.components;
 
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class SelectcheckboxController{
 
	public boolean rememberMe;
	public String[] favNumber1;
	public String[] favNumber2;
	public String[] favNumber3;
	public String[] favNumber4;
 
     
	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String[] getFavNumber1() {
		return favNumber1;
	}

	public void setFavNumber1(String[] favNumber1) {
		this.favNumber1 = favNumber1;
	}

	public String[] getFavNumber2() {
		return favNumber2;
	}

	public void setFavNumber2(String[] favNumber2) {
		this.favNumber2 = favNumber2;
	}

	public String[] getFavNumber3() {
		return favNumber3;
	}

	public void setFavNumber3(String[] favNumber3) {
		this.favNumber3 = favNumber3;
	}

	public String[] getFavNumber4() {
		return favNumber4;
	}

	public void setFavNumber4(String[] favNumber4) {
		this.favNumber4 = favNumber4;
	}

	public String getFavNumber1InString() {
		return Arrays.toString(favNumber1);
	}
 
	//Generated by Array
	public String[] getFavNumber2Value() {
 
		favNumber2 = new String[5];
		favNumber2[0] = "Number2 - 1";
		favNumber2[1] = "Number2 - 2";
		favNumber2[2] = "Number2 - 3";
		favNumber2[3] = "Number2 - 4";
		favNumber2[4] = "Number2 - 5";
 
		return favNumber2;
	}
 
	public String getFavNumber2InString() {
		return Arrays.toString(favNumber2);
	}
 
 
	//Generated by Map
	private static Map<String,Object> number3Value;
	static{
		number3Value = new LinkedHashMap<String,Object>();
		number3Value.put("Number3 - 1", "1"); //label, value
		number3Value.put("Number3 - 2", "2");
		number3Value.put("Number3 - 3", "3");
		number3Value.put("Number3 - 4", "4");
		number3Value.put("Number3 - 5", "5");
	}
 
	public Map<String,Object> getFavNumber3Value() {
		return number3Value;
	}
 
	public String getFavNumber3InString() {
		return Arrays.toString(favNumber3);
	}
 
	//Generated by Object array
	public static class Number{
		public String numberLabel;
		public String numberValue;
 
		public Number(String numberLabel, String numberValue){
			this.numberLabel = numberLabel;
			this.numberValue = numberValue;
		}
 
		public String getNumberLabel(){
			return numberLabel;
		}
 
		public String getNumberValue(){
			return numberValue;
		}
 
	}
 
	public Number[] number4List;
 
	public Number[] getFavNumber4Value() {
 
		number4List = new Number[5];
		number4List[0] = new Number("Number4 - 1", "1");
		number4List[1] = new Number("Number4 - 2", "2");
		number4List[2] = new Number("Number4 - 3", "3");
		number4List[3] = new Number("Number4 - 4", "4");
		number4List[4] = new Number("Number4 - 5", "5");
 
		return number4List;
	}
 
	public String getFavNumber4InString() {
		return Arrays.toString(favNumber4);
	}
 
}