package nl.lotrac.bv.repository;

import nl.lotrac.bv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<User, String> {
}
