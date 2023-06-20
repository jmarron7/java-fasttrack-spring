package com.jesusmarron.lemonadestand.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Lemonade {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private double lemonJuice;

    @Column(nullable = false)
    private double water;

    @Column(nullable = false)
    private double sugar;

    @Column(nullable = false)
    private int iceCubes;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn
    private Order order;
}
