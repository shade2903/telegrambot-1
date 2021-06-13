package com.github.rusmich.telegrambot.service;

import java.util.Random;

public class CoordinteGen {
    Random rand = new Random();
    private float lat = rand.nextFloat() * (90 - (-90)) + (-90);
    private float lon = rand.nextFloat() * (180 - (-180)) + (-180);


    public String getLat() {
        String latitude = Float.toString(lat);
        return latitude;
    }

    public String getLon() {
        String longitude = Float.toString(lon);
        return longitude;
    }
}
