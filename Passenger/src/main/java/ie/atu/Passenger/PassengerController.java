package ie.atu.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {

    PassengerService myService;

    @Autowired

    public PassengerController(PassengerService myService)
    {
        this.myService = myService;
    }

    @GetMapping
    public List <Passenger> getPassenger ()
    {
        return myService.getPassenger();
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID)
    {
        return myService.getPassenger(passengerID);
    }

    //Save
    @PostMapping("")
    public void savePassenger(
            @RequestBody Passenger passenger
    )
    {

       myService.savePassenger(passenger);
    }

    //FInd by Name
    @GetMapping("/user_name/{user_name}")
    public Passenger getPassengerName(@PathVariable("user_name")String user_name)
    {
        return myService.findPassengerByName(user_name);
    }

}
