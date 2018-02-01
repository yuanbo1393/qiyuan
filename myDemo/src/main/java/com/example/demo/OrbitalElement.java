package com.example.demo;

public class OrbitalElement{
	
	private int element;
	private String elementName;
	private double value;
	private double uncertainly;
	private String unit;
	
	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}
	
	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public double getUncertainly() {
		return uncertainly;
	}

	public void setUncertainly(double uncertainly) {
		this.uncertainly = uncertainly;
	}
	
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}