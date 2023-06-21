package com.jesusmarron.lemonadestand.services.impl;

import com.jesusmarron.lemonadestand.entities.Lemonade;
import com.jesusmarron.lemonadestand.repositories.LemonadeRepository;
import com.jesusmarron.lemonadestand.services.LemonadeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LemonadeServiceImpl implements LemonadeService {

    private LemonadeRepository lemonadeRepository;

    @Override
    public List<Lemonade> getAllLemonades() {
        return lemonadeRepository.findAll();
    }

    @Override
    public Lemonade createLemonade(Lemonade lemonade) {
        lemonade.setId(null);
        lemonade.setPrice(lemonade.getLemonJuice() * 0.20 + lemonade.getWater() * 0.10 + lemonade.getSugar() * 0.15 + lemonade.getIceCubes() * 0.05 + 0.50);
        return lemonadeRepository.saveAndFlush(lemonade);
    }
}
