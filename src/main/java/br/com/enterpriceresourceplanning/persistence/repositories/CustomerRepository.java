package br.com.enterpriceresourceplanning.persistence.repositories;

import br.com.enterpriceresourceplanning.core.entities.Customer;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
