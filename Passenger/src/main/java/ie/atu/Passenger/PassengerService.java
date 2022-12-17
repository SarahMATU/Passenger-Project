package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Component


public class PassengerService {

    private final PassengerRepo passengerRepo;

    public List <Passenger> getPassenger ()
    {
      return passengerRepo.findAll();
    }


    public Passenger getPassenger(String passengerID)
    {
        Passenger myPassenger = new Passenger("Mrs", "Sarah", "3E7F9N2Y6W4T", "0895746178", 25);
        return myPassenger;
    }

    public void savePassenger (Passenger passenger){
        passengerRepo.save(passenger);
    }

    public Passenger findPassengerByName (String user_name){
        return passengerRepo.findPassengerByName(user_name);
    }

    public void deletePassenger (Long count){
        passengerRepo.deletePassenger(count);
    }

}
