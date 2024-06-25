package br.com.enterpriceresourceplanning.core.entities;

import br.com.enterpriceresourceplanning.core.abstraction.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "User")
public class User extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "Email", unique = true, nullable = false)
    private String email;
    @Column(name = "Password", nullable = false)
    private String password;
}
