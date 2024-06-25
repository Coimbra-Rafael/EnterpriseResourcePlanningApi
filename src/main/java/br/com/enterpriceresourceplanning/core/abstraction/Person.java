package br.com.enterpriceresourceplanning.core.abstraction;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.UUID;

import java.security.Timestamp;

@Getter
@Setter
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "FirstName", nullable = false)

    private String firstName;
    @Column(name = "FirstName", nullable = false)
    private String lastName;

    @CreationTimestamp
    private Timestamp created;

    @UpdateTimestamp
    private Timestamp updated;
}
