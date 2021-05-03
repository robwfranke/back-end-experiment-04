package nl.lotrac.bv.repository;

import nl.lotrac.bv.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Customer, String> {

}
