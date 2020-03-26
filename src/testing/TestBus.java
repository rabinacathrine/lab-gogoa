package testing;

/* Uncomment the below code to test your application*/

import model.Bus;
import java.time.LocalDate;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestBus {
	LocalDate ld = LocalDate.of(2020, 02, 03);
	Bus bus = new Bus(2, 1500, "acsleeper", ld);

	@Test
	public void testGetNoOfPersonMethod() {
		bus.setNoofpersons(5);
		assertEquals(5, bus.getNoofpersons());
		bus.setNoofpersons(1);
		assertEquals(1, bus.getNoofpersons());
		try {
			bus.setNoofpersons(0);
			bus.setNoofpersons(-5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetRateMethod() {
		bus.setRates(1300);
		assertEquals(1300, bus.getRates());
		bus.setRates(800);
		assertEquals(800, bus.getRates());
		try {
			bus.setRates(0);
			bus.setRates(-500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetBusType() {
		bus.setBustype("ACsleeper");
		assertEquals("ACsleeper", bus.getBustype());
		try {
			bus.setBustype(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSetDate() {
		try {
			bus.setDate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


