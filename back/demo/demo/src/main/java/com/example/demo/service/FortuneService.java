package com.example.fortune.service;

import com.example.fortune.model.FortuneResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FortuneService {

    private final Random random = new Random();

    private final List<String> tarotCards = List.of(
            "The Fool — новое начало, спонтанность",
            "The Magician — сила проявления",
            "The High Priestess — интуиция и тайны",
            "The Empress — гармония и изобилие"
    );

    private final List<String> runes = List.of(
            "Fehu — энергия, богатство",
            "Uruz — сила и выносливость",
            "Thurisaz — защита и осторожность",
            "Ansuz — вдохновение и знание"
    );

    public FortuneResponse getFortune(String type) {
        String prediction;

        switch (type.toLowerCase()) {
            case "tarot":
                prediction = tarotCards.get(random.nextInt(tarotCards.size()));
                break;
            case "runes":
                prediction = runes.get(random.nextInt(runes.size()));
                break;
            default:
                prediction = "Неизвестный тип гадания: " + type;
        }

        return new FortuneResponse(type, prediction);
    }
}
