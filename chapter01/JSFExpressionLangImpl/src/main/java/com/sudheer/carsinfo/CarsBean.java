package com.sudheer.carsinfo;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.sudheer.carsinfo.model.Car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ManagedBean(name = "carsInfo")
@SessionScoped
public class CarsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Car> carslist;
	private String expressionFactoryName;
	private String getValueTimeinMilli;
	private String createValueTimeinMilli;

	public CarsBean() {
		carslist = new ArrayList<Car>();
		carslist.add(new Car(getRandomModel(), "Volvo", "Red", "200kh"));
		carslist.add(new Car(getRandomModel(), "Ford", "Green", "220kh"));
		carslist.add(new Car(getRandomModel(), "Benz", "Red", "240kh"));
		carslist.add(new Car(getRandomModel(), "Audi", "Red", "300kh"));
		carslist.add(new Car(getRandomModel(), "Suzuki", "Red", "150kh"));
		carslist.add(new Car(getRandomModel(), "Volvo", "Red", "270kh"));
	}

	private String getRandomModel() {
		return UUID.randomUUID().toString().substring(0, 5);
	}

	public String evaluateEL() {
		ELContext context = FacesContext.getCurrentInstance().getELContext();
		ExpressionFactory factory = FacesContext.getCurrentInstance()
				.getApplication().getExpressionFactory();
		expressionFactoryName=(String) FacesContext.getCurrentInstance().getExternalContext().getInitParameter("com.sun.faces.expressionFactory");
		System.out.println("EL implementation name is"+
				FacesContext.getCurrentInstance().getExternalContext().getInitParameter("com.sun.faces.expressionFactory"));
		ValueExpression expression = factory.createValueExpression(context,
				"#{carsInfo.carslist}", List.class);

		long start;

		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			List<Car> getValue = (List<Car>) expression.getValue(context);
		}
		getValueTimeinMilli = (System.currentTimeMillis() - start)
				+ "ms #getValue";
		System.err.println((System.currentTimeMillis() - start)
				+ "ms #getValue");

		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			expression = factory.createValueExpression(context,
					"#{carsInfo.carslist}", List.class);
			List<Car> createValue = (List<Car>) expression.getValue(context);
		}
		createValueTimeinMilli = (System.currentTimeMillis() - start)
				+ "ms #getValue and #createValueExpression";
		System.err.println((System.currentTimeMillis() - start)
				+ "ms #getValue and #createValueExpression");

		return "";
	}

	public List<Car> getCarslist() {
		return carslist;
	}

	public void setCarslist(List<Car> carslist) {
		this.carslist = carslist;
	}

	public String getExpressionFactoryName() {
		return expressionFactoryName;
	}

	public void setExpressionFactoryName(String expressionFactoryName) {
		this.expressionFactoryName = expressionFactoryName;
	}

	public String getGetValueTimeinMilli() {
		return getValueTimeinMilli;
	}

	public void setGetValueTimeinMilli(String getValueTimeinMilli) {
		this.getValueTimeinMilli = getValueTimeinMilli;
	}

	public String getCreateValueTimeinMilli() {
		return createValueTimeinMilli;
	}

	public void setCreateValueTimeinMilli(String createValueTimeinMilli) {
		this.createValueTimeinMilli = createValueTimeinMilli;
	}

}