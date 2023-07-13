package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String data;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    private class Temperature {
        public String max;
        private String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
