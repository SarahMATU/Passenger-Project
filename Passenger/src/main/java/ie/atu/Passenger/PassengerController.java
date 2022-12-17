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

    //Find by Name
    @GetMapping("/user_name/{user_name}")
    public Passenger getPassengerName(@PathVariable("user_name")String user_name)
    {
        return myService.findPassengerByName(user_name);
    }

    //Delete by Count
    @DeleteMapping("/count/{count}")
    public void deletePassenger(@PathVariable("count")Long count)
    {
       myService.deletePassenger(count);
    }

    @GetMapping("/age")
    public List <Passenger> getPassengerByAge(@RequestParam(name = "age_start") int age, @RequestParam(name= "age_end") int age2){
        return myService.findPassengerByAgeRange(age, age2);
    }

}
