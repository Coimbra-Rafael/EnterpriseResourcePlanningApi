package br.com.enterpriceresourceplanning.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.UUID;

import java.io.Serializable;
import java.security.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Address")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Address_Description")
    private String addressDescription;

    @Column(name = "Complement")
    private String complement;

    @Column(name = "Number_Address")
    private Integer numberAddress;

    @Column(name = "CEP")
    private String cep;

    @CreationTimestamp
    private Timestamp created;

    @UpdateTimestamp
    private Timestamp updated;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Customer customer;
}
