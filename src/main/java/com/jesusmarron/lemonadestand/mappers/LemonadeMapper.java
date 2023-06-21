package com.jesusmarron.lemonadestand.mappers;

import com.jesusmarron.lemonadestand.entities.Lemonade;
import com.jesusmarron.lemonadestand.models.LemonadeRequestDto;
import com.jesusmarron.lemonadestand.models.LemonadeResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LemonadeMapper {

    Lemonade requestDtoToEntity(LemonadeRequestDto lemonadeRequestDto);

    LemonadeResponseDto entityToResponseDto(Lemonade lemonade);

    List<LemonadeResponseDto> entitiesToResponseDtos(List<Lemonade> lemonades);
}