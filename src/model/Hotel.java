package model;
import java.time.*;
// Type your code
public class Hotel{
	private int noOfPersons;
	private String roomType;
	private int rates;
	private String occupancy;
	private LocalDate fromdate;
	private LocalDate todate;
	
	public int getNoofpersons() {
		return noOfPersons;
	}
	public void setNoofpersons(int noOfPersons) {
		this.noOfPersons=noOfPersons;
	}
	//Getter and setter for type
		public String getRoomtype() {
			return roomType;
		}
		public void setRoomtype(String roomType) {
			this.roomType=roomType;

	}
		public int getRates() {
			return rates;
		}
		public void setRates(int rates) {
			this.rates=rates;

	}	

		public LocalDate getFromdate() {
			return fromdate;
		}
		public void setFromdate(LocalDate fromdate) {
			this.fromdate=fromdate;

	}	
		
		public LocalDate getTodate() {
			return todate;
		}
		public void setTodate(LocalDate todate) {
			this.todate=todate;

	}
		
		public String getOccupancy() {
			return occupancy;
		}
		public void setOccupancy(String occupancy) {
			this.occupancy=occupancy;

	}
		public Hotel(int noOfPersons, String roomType, int rates,String occupancy,LocalDate fromdate,LocalDate todate) {
			
		}


}