package model;
// Type your code
import java.time.*;
public class Train{
	private int noOfPersons;
	private String berth;
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
		public String getBerth() {
			return berth;
		}
		public void setBerth(String berth) {
			this.berth=berth;

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
		
		public Train(int noOfPersons, int rates, String berth, LocalDate date) {
			
		}


}