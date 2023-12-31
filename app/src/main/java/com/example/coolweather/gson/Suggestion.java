package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    private class Comfort {
        @SerializedName("txt")
        public String cityName;
    }

    private class CarWash {
        @SerializedName("txt")
        public String info;

    }

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}
