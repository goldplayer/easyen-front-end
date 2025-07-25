package spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_data_rest.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
