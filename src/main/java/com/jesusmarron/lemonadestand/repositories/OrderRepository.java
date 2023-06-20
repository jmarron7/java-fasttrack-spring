package com.jesusmarron.lemonadestand.repositories;

import com.jesusmarron.lemonadestand.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
