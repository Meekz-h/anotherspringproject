package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Division division = divisionRepository.findById(2L).orElse(null);
        Customer customer1 = new Customer("Ivy","Ng","1 Arizona Way","86313","222-222-5555",division);
        Customer customer2 = new Customer("Mamb","White","3 Arizona Way","86343","222-222-4455",division);
        Customer customer3 = new Customer("Jason","Gnome","2 Arizona Way","86333","222-232-5655",division);
        Customer customer4 = new Customer("Lukas","Bell","4 Arizona Way","86377","222-222-5525",division);
        Customer customer5 = new Customer("Rob","Stone","5 Arizona Way","86355","332-222-5555",division);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);


    }
}
