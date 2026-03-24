import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
//import org.junit.jupiter.api.BeforeEach;

public class MiniParkingSystemTest{

	@Test
	public void testItParksAutomatically(){
		int [] parkingLot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		MiniParkingSystem.parkAutomatically(parkingLot);
		assertTrue(MiniParkingSystem.spaceAvailability(parkingLot, 1));
		MiniParkingSystem.parkAutomatically(parkingLot);
		assertTrue(MiniParkingSystem.spaceAvailability(parkingLot, 2));
	}

	@Test
	public void testItParksManually(){
		int [] parkingLot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		MiniParkingSystem.parkManually(parkingLot, 7);
		assertTrue(MiniParkingSystem.spaceAvailability(parkingLot, 7));
		MiniParkingSystem.parkManually(parkingLot, 15);
		assertTrue(MiniParkingSystem.spaceAvailability(parkingLot, 15));
	}

	@Test
	public void testItUnparks(){
		int [] parkingLot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		MiniParkingSystem.parkManually(parkingLot, 7);
		assertTrue(MiniParkingSystem.spaceAvailability(parkingLot, 7));
		MiniParkingSystem.parkManually(parkingLot, 15);
		assertTrue(MiniParkingSystem.spaceAvailability(parkingLot, 15));
		MiniParkingSystem.parkAutomatically(parkingLot);
		assertTrue(MiniParkingSystem.spaceAvailability(parkingLot, 1));
		MiniParkingSystem.unparkCar(parkingLot, 15);
		assertFalse(MiniParkingSystem.spaceAvailability(parkingLot, 15));
	}


}