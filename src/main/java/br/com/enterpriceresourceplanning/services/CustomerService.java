package br.com.enterpriceresourceplanning.services;

import br.com.enterpriceresourceplanning.persistence.repositories.AddressRepository;
import br.com.enterpriceresourceplanning.persistence.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@AllArgsConstructor
@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    private AddressRepository addressRepository;


}
