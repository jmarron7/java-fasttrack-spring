package com.jesusmarron.lemonadestand.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private double total;

    @OneToMany
    private List<Lemonade> lemonades;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private LemonadeStand lemonadeStand;
}
