package testing;

// Uncomment the below code to test your application

import static org.junit.Assert.*;
import org.junit.Test;

import services.Booking;

public class TestBooking {
	Booking book = new Booking();

	@Test
	public void testBookingMethod() {
		assertEquals(6000, book.Booking(2, 3000),0);
		assertEquals(1000, book.Booking(1, 1000),0);
		try {
			book.Booking(0, 5000);
			book.Booking(5, 0);
			book.Booking(0, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

