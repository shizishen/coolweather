package com.example.coolweather.gson;

import java.security.PublicKey;

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
