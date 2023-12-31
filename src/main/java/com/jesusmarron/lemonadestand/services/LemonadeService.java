package com.jesusmarron.lemonadestand.services;

import com.jesusmarron.lemonadestand.entities.Lemonade;
import com.jesusmarron.lemonadestand.models.LemonadeRequestDto;
import com.jesusmarron.lemonadestand.models.LemonadeResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LemonadeService {

    List<LemonadeResponseDto> getAllLemonades();

    LemonadeResponseDto createLemonade(LemonadeRequestDto lemonadeRequestDto);

    ResponseEntity<LemonadeResponseDto> getLemonadeById(Long id);
}
