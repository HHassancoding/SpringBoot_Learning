package com.example.cardapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/card")


public class CardController {

    @GetMapping
    public List<Cards> getCards(){
        return List.of(
                new Cards(
                        3000,
                        "Blue eyes White Dragon",
                        7
                ),
                new Cards(
                        2000,
                        "Red Dragon",
                        6
                )
        );
    }


}
