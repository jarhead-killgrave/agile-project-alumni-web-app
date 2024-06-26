package fr.imt.alumni.fil.persistance;

import fr.imt.alumni.fil.domain.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserDAO extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String username);
}
