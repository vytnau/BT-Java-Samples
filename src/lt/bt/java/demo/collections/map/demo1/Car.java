package lt.bt.java.demo.collections.map.demo1;

import java.util.Date;

public class Car {
	private String number;
	private String make;
	private String model;
	private Date date;
	
	public Car(){
		setDate(new Date(System.currentTimeMillis()));
	}
	
	public Car(String number, String make, String model){
		super();
		this.number = number;
		this.make = make;
		this.model = model;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
