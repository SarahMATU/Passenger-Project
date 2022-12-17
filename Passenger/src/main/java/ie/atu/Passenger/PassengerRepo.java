package ie.atu.Passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long> {
    Passenger findPassengerByName(String user_name);

    void deletePassenger(Long count);

    @Query("SELECT p FROM Passenger p WHERE p.numAge > ?1 and p.numAge < ?2")
            public List<Passenger> findPassengerByAge(int age, int age2);
}
