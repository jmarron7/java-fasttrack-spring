package com.jesusmarron.lemonadestand.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LemonadeStand {
    @Id
    @GeneratedValue
    private Long id;
}
