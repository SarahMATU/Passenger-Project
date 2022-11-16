package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor() { //Creates a new passenger when all the requirements are met.
        Passenger userNew = new Passenger("Mrs", "Sarah", "3E7F9N2Y1H4T", "0895746178", 25);
        assertEquals("Mrs", userNew.getUserTitle());
        assertEquals("Sarah", userNew.getUserName());
        assertEquals("3E7F9N2Y1H4T", userNew.getUserId());
        assertEquals("0895746178", userNew.getNumPhone());
        assertEquals(25, userNew.getNumAge());
    }

    @Test
    void testMrTitle() { //Tests the Mr Title
        Passenger userNew = new Passenger("Mr", "Sarah", "3E7F9N2Y1H4T", "0895746178", 25);
        assertEquals("Mr", userNew.getUserTitle());
    }

    @Test
    void testMsTitle() { //Tests the Ms Title
        Passenger userNew = new Passenger("Ms", "Sarah", "3E7F9N2Y1H4T", "0895746178", 25);
        assertEquals("Ms", userNew.getUserTitle());
    }

    @Test
    void testTitleFail() { //Tests the title for a fail
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("trs", "Sarah", "3E7F9N2Y1H4T", "0895746178", 25));
        assertEquals("This is not a valid Title", exMessage.getMessage());
    }

    @Test
    void testNameFail() { //Test the name for a fail
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms", "Sa", "3E7F9N2Y1H4T", "0895746178", 25));
        assertEquals("This is not a valid Name", exMessage.getMessage());
    }

    @Test
    void testIdFail() { //Tests the ID for a fail
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms", "Sarah", "3E7F9H4T", "0895746178", 25));
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }

    @Test
    void testPhoneFail() { //Test the phone number for a fail
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms", "Sarah", "3E7F9N2Y1H4T", "08956", 25));
        assertEquals("This is not a valid Phone Number", exMessage.getMessage());
    }

    @Test
    void testAgeFail() { //Tests the age for a fail
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms", "Sarah", "3E7F9N2Y1H4T", "0895746178", 10));
        assertEquals("User must be over 16", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {

    }
}


