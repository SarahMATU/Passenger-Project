package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/passenger")
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List <Passenger> getPassenger ()
	{
		List<Passenger> myPassenger = List.of(
				new Passenger("Mrs", "Sarah", "3E7F9N2Y1H4T", "0895746178", 25),
				new Passenger("Mrs", "Sarah", "3E7F9N2Y1H4T", "0895746178", 25),
				new Passenger("Mrs", "Sarah", "3E7F9N2Y1H4T", "0895746178", 25));
		return myPassenger;
	}
}
