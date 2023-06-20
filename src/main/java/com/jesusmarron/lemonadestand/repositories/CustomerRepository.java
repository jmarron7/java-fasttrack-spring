package com.jesusmarron.lemonadestand.repositories;

import com.jesusmarron.lemonadestand.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
