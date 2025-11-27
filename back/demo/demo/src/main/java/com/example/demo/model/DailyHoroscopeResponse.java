package com.example.demo.model;

public class DailyHoroscopeResponse {

    private String zodiacSign;
    private String date;
    private String prediction;

    public DailyHoroscopeResponse(String zodiacSign, String date, String prediction) {
        this.zodiacSign = zodiacSign;
        this.date = date;
        this.prediction = prediction;
    }

    public String getZodiacSign() { return zodiacSign; }
    public String getDate() { return date; }
    public String getPrediction() { return prediction; }
}
