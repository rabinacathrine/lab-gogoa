package services;
import java.time.*;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
// Type your code

public class FareCalculator extends Booking{
	Booking b=new Booking();
		public double book(Hotel hotel)
		{
			int noOfPersons=hotel.getNoofpersons();
			String roomType =hotel.getRoomtype();
			int rates=hotel.getRates();
			String occupancy=hotel.getOccupancy();
			LocalDate fromdate=hotel.getFromdate();
			LocalDate todate=hotel.getTodate();
                double d=0;
			if(todate.isAfter(fromdate))
			{
		      Double data;
		    data =  b.Booking(noOfPersons, rates);
		    return data;
		      }
			else
				return d;
		}
		
		public double book(Flight flight) {
			int noOfPersons=flight.getNoofpersons();
			String classType=flight.getClasstype();
			int rates=flight.getRates();
			LocalDate from=flight.getFrom();
			LocalDate to=flight.getTo();
			String triptype=flight.getTriptype();	
			double data1=0;
			if(triptype=="One-way")
			{
			data1 =b.Booking(noOfPersons, rates);
			}
			else
			{
				if(to.isAfter(from))
					data1=b.Booking(noOfPersons, rates);
			}	
			return  data1 ;                      
		}
		
		 public double book(Train train)
		{
			int noOfPersons=train.getNoofpersons();
			String berth=train.getBerth();
			int rates=train.getRates();
			LocalDate date=train.getDate();
			double data2 =b.Booking(noOfPersons, rates);	
			return  data2 ;
		}

	
	public double book(Bus bus)
	{
		int noOfPersons=bus.getNoofpersons();
		String busType=bus.getBustype();
		int rates=bus.getRates();
		LocalDate date=bus.getDate();
		double data3 =b.Booking(noOfPersons, rates);
		return  data3 ;
	}
  }