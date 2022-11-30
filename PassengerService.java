package ie.atu.Passenger;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    public List <Passenger> getPassenger ()
    {
        List<Passenger> myPassenger = List.of(
                new Passenger("Mrs", "Sarah", "3E7F9N2Y1H4T", "0895746178", 30),
                new Passenger("Mrs", "Rayah", "3E7F9U9Y1H4T", "0895734578", 25),
                new Passenger("Mrs", "Brittany", "3E7F9N2Y6W4T", "0894827178", 65));
        return myPassenger;
    }


    public Passenger getPassenger(String passengerID)
    {
        Passenger myPassenger = new Passenger("Mrs", "Sarah", "3E7F9N2Y6W4T", "0895746178", 25);
        return myPassenger;
    }

}
