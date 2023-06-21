package com.jesusmarron.lemonadestand.services;

import com.jesusmarron.lemonadestand.entities.Lemonade;

import java.util.List;

public interface LemonadeService {
    List<Lemonade> getAllLemonades();

    Lemonade createLemonade(Lemonade lemonade);
}
