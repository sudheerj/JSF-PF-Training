package com.sudheer.carsinfo.model;

public class Car {
  private String model;
  private String manufacturer;
  private String color;
  private String speed;
public Car(String model, String manufacturer, String color, String speed) {
	super();
	this.model = model;
	this.manufacturer = manufacturer;
	this.color = color;
	this.speed = speed;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getSpeed() {
	return speed;
}
public void setSpeed(String speed) {
	this.speed = speed;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result
			+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	result = prime * result + ((speed == null) ? 0 : speed.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Car other = (Car) obj;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (manufacturer == null) {
		if (other.manufacturer != null)
			return false;
	} else if (!manufacturer.equals(other.manufacturer))
		return false;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (speed == null) {
		if (other.speed != null)
			return false;
	} else if (!speed.equals(other.speed))
		return false;
	return true;
}
@Override
public String toString() {
	return "Car [model=" + model + ", manufacturer=" + manufacturer
			+ ", color=" + color + ", speed=" + speed + "]";
}
  
  
}
