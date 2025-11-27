package com.example.horoscope.controller;

import com.example.horoscope.service.HoroscopeService;
import com.example.horoscope.model.DailyHoroscopeResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/horoscope")
public class HoroscopeController {

    private final HoroscopeService horoscopeService;

    public HoroscopeController(HoroscopeService horoscopeService) {
        this.horoscopeService = horoscopeService;
    }

    @GetMapping("/daily/{zodiacSign}")
    public DailyHoroscopeResponse getDailyHoroscope(@PathVariable String zodiacSign) {
        return horoscopeService.getDailyHoroscope(zodiacSign);
    }
}
