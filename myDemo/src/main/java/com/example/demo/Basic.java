package com.example.demo;

public class Basic{
	
	private String num;			//编号，例433
	private String name;			//名字，例Eros
	private String serialNum;	//序列号，例1898 DQ
	private int classification;	//类型，例Amor
	private String className;	//类型，例Amor
	private long spk_id;			//spk id，例2000433
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	
	public int getClassification() {
		return classification;
	}
	public void setClassification(int classification) {
		this.classification = classification;
	}
	
	public String getclassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public long getSpk_id() {
		return spk_id;
	}
	public void setSpk_id(long spk_id) {
		this.spk_id = spk_id;
	}
}