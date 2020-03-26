package model;
//Type your code
import java.time.*;

public class Bus{
	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;
	
	//GETTERS AND SETTERS
	public int getNoofpersons() {
		return noOfPersons;
	}
	public void setNoofpersons(int noOfPersons) {
		this.noOfPersons=noOfPersons;
	}
	//Getter and setter for type
		public String getBustype() {
			return busType;
		}
		public void setBustype(String busType) {
			this.busType=busType;

	}
		public int getRates() {
			return rates;
		}
		public void setRates(int rates) {
			this.rates=rates;

	}	

		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date=date;

	}	
		
		public Bus(int noOfPersons, int rates, String busType, LocalDate date) {
			
		}


}