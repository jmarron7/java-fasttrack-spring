package com.jesusmarron.lemonadestand.services.impl;

import com.jesusmarron.lemonadestand.entities.Lemonade;
import com.jesusmarron.lemonadestand.mappers.LemonadeMapper;
import com.jesusmarron.lemonadestand.models.LemonadeRequestDto;
import com.jesusmarron.lemonadestand.models.LemonadeResponseDto;
import com.jesusmarron.lemonadestand.repositories.LemonadeRepository;
import com.jesusmarron.lemonadestand.services.LemonadeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LemonadeServiceImpl implements LemonadeService {

    private LemonadeRepository lemonadeRepository;

    private LemonadeMapper lemonadeMapper;

    @Override
    public List<LemonadeResponseDto> getAllLemonades() {
        return lemonadeMapper.entitiesToResponseDtos(lemonadeRepository.findAll());
    }

    @Override
    public LemonadeResponseDto createLemonade(LemonadeRequestDto lemonadeRequestDto) {

        Lemonade lemonadeToSave = lemonadeMapper.requestDtoToEntity(lemonadeRequestDto);
        lemonadeToSave.setPrice(lemonadeToSave.getLemonJuice() * 0.20 + lemonadeToSave.getWater() * 0.10 + lemonadeToSave.getSugar() * 0.15 + lemonadeToSave.getIceCubes() * 0.05 + 0.50);

        return lemonadeMapper.entityToResponseDto(lemonadeRepository.saveAndFlush(lemonadeToSave));
    }

    @Override
    public ResponseEntity<LemonadeResponseDto> getLemonadeById(Long id) {
        Lemonade lemonade = lemonadeRepository.getReferenceById(id);

        if(lemonade == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(lemonadeMapper.entityToResponseDto(lemonade), HttpStatus.OK);
    }
}
