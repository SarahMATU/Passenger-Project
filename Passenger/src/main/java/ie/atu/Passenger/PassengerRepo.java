package ie.atu.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    Passenger findPassengerByName(String user_name);

    void deletePassenger(Long count);
}
