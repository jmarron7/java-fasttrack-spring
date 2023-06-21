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
}
