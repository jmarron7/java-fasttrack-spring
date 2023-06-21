package com.jesusmarron.lemonadestand.services.impl;

import com.jesusmarron.lemonadestand.entities.Lemonade;
import com.jesusmarron.lemonadestand.models.LemonadeRequestDto;
import com.jesusmarron.lemonadestand.models.LemonadeResponseDto;
import com.jesusmarron.lemonadestand.repositories.LemonadeRepository;
import com.jesusmarron.lemonadestand.services.LemonadeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LemonadeServiceImpl implements LemonadeService {

    private LemonadeRepository lemonadeRepository;

    @Override
    public List<LemonadeResponseDto> getAllLemonades() {
        List<LemonadeResponseDto> result = new ArrayList<LemonadeResponseDto>();
        for (Lemonade lemonade : lemonadeRepository.findAll()) {
            result.add(new LemonadeResponseDto(lemonade.getId(), lemonade.getPrice()));
        }
        return result;
    }

    @Override
    public LemonadeResponseDto createLemonade(LemonadeRequestDto lemonadeRequestDto) {

        Lemonade lemonadeToSave = new Lemonade();

        lemonadeToSave.setLemonJuice(lemonadeRequestDto.getLemonJuice());
        lemonadeToSave.setWater(lemonadeRequestDto.getWater());
        lemonadeToSave.setSugar(lemonadeRequestDto.getSugar());
        lemonadeToSave.setIceCubes(lemonadeRequestDto.getIceCubes());
        lemonadeToSave.setPrice(lemonadeToSave.getLemonJuice() * 0.20 + lemonadeToSave.getWater() * 0.10 + lemonadeToSave.getSugar() * 0.15 + lemonadeToSave.getIceCubes() * 0.05 + 0.50);

        Lemonade savedLemonade = lemonadeRepository.saveAndFlush(lemonadeToSave);
        LemonadeResponseDto result = new LemonadeResponseDto();

        result.setId(savedLemonade.getId());
        result.setPrice(savedLemonade.getPrice());

        return result;
    }
}
