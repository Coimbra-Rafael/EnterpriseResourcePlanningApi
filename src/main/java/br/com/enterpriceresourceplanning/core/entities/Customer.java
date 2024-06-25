package br.com.enterpriceresourceplanning.core.entities;

import br.com.enterpriceresourceplanning.core.abstraction.Person;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Customer")
public class Customer extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CpfCnpj", nullable = false, length = 14)
    private String cpfCnpj;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone")
    private String phone;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name = "Address_Id")
    private Address address;
}
