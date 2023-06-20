package com.jesusmarron.lemonadestand.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="order_table")
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

    @OneToMany(mappedBy = "order")
    private List<Lemonade> lemonades;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    @ManyToOne
    @JoinColumn
    private LemonadeStand lemonadeStand;
}
