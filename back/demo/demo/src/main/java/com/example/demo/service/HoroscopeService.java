package com.example.horoscope.service;

import com.example.horoscope.model.DailyHoroscopeResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;

@Service
public class HoroscopeService {

    private final Map<String, String> mockPredictions = Map.of(
            "aries", "Сегодня отличное время для новых начинаний.",
            "taurus", "Сосредоточьтесь на финансовых вопросах.",
            "gemini", "Будьте внимательны к мелочам — они важнее, чем кажется.",
            "cancer", "Хороший момент для общения с близкими.",
            "leo", "Ваше лидерство сегодня особенно заметно.",
            "virgo", "Организованность — ключ к успеху.",
            "libra", "Стоит искать баланс во всех делах.",
            "scorpio", "Интуиция сегодня подскажет верный путь.",
            "sagittarius", "Путешествия и новые впечатления принесут радость.",
            "capricorn", "Упорный труд сегодня будет щедро вознаграждён.",
            "aquarius", "Откройтесь новым идеям.",
            "pisces", "Творчество поможет решить старую проблему."
    );

    public DailyHoroscopeResponse getDailyHoroscope(String zodiacSign) {
        String normalized = zodiacSign.toLowerCase();

        String prediction = mockPredictions.getOrDefault(
                normalized,
                "Неизвестный знак зодиака: " + zodiacSign
        );

        return new DailyHoroscopeResponse(
                normalized,
                LocalDate.now().toString(),
                prediction
        );
    }
}
