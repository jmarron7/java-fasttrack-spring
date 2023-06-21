package com.jesusmarron.lemonadestand.controllers;

import com.jesusmarron.lemonadestand.entities.Lemonade;
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
    public List<Lemonade> getAllLemonades() {
        return lemonadeService.getAllLemonades();
    }

    @PostMapping
    public Lemonade createLemonade(@RequestBody Lemonade lemonade) {
        return lemonadeService.createLemonade(lemonade);
    }
}
