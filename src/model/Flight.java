package model;
import java.time.*;
//Type your code 
public class Flight{
	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	
public int getNoofpersons() {
	return noOfPersons;
}
public void setNoofpersons(int noOfPersons) {
	this.noOfPersons=noOfPersons;
}
//Getter and setter for type
	public String getClasstype() {
		return classType;
	}
	public void setClasstype(String classType) {
		this.classType=classType;

}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates=rates;

}	

	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from=from;

}	
	
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to=to;

}
	
	public String getTriptype() {
		return classType;
	}
	public void setTriptype(String triptype) {
		this.triptype=triptype;

}
	public Flight(int noOfPersons, int rates,String classType, LocalDate from,LocalDate to,String triptype) {
		this.noOfPersons=noOfPersons;
		this.rates=rates;
		this.classType=classType;
		this.from=from;
		this.to=to;
		this.triptype=triptype;
	}
	
}