package com.example.fortune.model;

public class FortuneResponse {
    private String type;
    private String result;

    public FortuneResponse(String type, String result) {
        this.type = type;
        this.result = result;
    }

    public String getType() {
        return type;
    }

    public String getResult() {
        return result;
    }
}
