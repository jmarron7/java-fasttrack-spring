package com.jesusmarron.lemonadestand.controllers;

import com.jesusmarron.lemonadestand.entities.Lemonade;
import com.jesusmarron.lemonadestand.models.LemonadeRequestDto;
import com.jesusmarron.lemonadestand.models.LemonadeResponseDto;
import com.jesusmarron.lemonadestand.services.LemonadeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lemonades")
@AllArgsConstructor
public class LemonadeController {

    private LemonadeService lemonadeService;

    @GetMapping
    public List<LemonadeResponseDto> getAllLemonades() {
        return lemonadeService.getAllLemonades();
    }

    @PostMapping
    public LemonadeResponseDto createLemonade(@RequestBody LemonadeRequestDto lemonadeRequestDto) {
        return lemonadeService.createLemonade(lemonadeRequestDto);
    }
}
