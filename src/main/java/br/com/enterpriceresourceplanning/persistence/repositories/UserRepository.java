package br.com.enterpriceresourceplanning.persistence.repositories;

import br.com.enterpriceresourceplanning.core.entities.User;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
