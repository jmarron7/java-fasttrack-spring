package com.jesusmarron.lemonadestand.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LemonadeResponseDto {

    private Long id;

    private double price;

    private double lemonJuice;

    private double water;

    private double sugar;

    private int iceCubes;

}
