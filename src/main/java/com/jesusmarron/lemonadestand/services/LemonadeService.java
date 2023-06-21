package com.jesusmarron.lemonadestand.services;

import com.jesusmarron.lemonadestand.entities.Lemonade;
import com.jesusmarron.lemonadestand.models.LemonadeRequestDto;
import com.jesusmarron.lemonadestand.models.LemonadeResponseDto;

import java.util.List;

public interface LemonadeService {
    List<LemonadeResponseDto> getAllLemonades();

    LemonadeResponseDto createLemonade(LemonadeRequestDto lemonadeRequestDto);
}
