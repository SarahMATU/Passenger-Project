package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    Passenger myPass;

    @BeforeEach
    void setUp() { myPass = new Passenger();
    }

    @Test
    void testConstructor()
    {

    }

    @Test
    void testConstructorFail()  {

    }

    @Test
    void testTitle() {
        assertEquals("Mr", myPass.setUserTitle("Mr"));
        assertEquals("Mrs", myPass.setUserTitle("Mrs"));
        assertEquals("Ms", myPass.setUserTitle("Ms"));
    }

    @Test
    void testNameFail()    {assertEquals("Sarah", myPass.setUserName("Sarah"));}

    @Test
    void testIdFail() {
        assertEquals("4738GEHS837", myPass.setUserId("4738GEHS837"));
    }

    @Test
    void testPhoneFail() {
        assertEquals("0876984572", myPass.setNumPhone("0876984572"));
    }

    @Test
    void testAgeFail() {assertEquals(17, myPass.setNumAge(17));}

    @AfterEach
    void tearDown() {    }
}