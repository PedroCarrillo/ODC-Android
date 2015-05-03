package com.pedrocarrillo.odcandroid.models;

import java.util.Date;

/**
 * Created by Pedro on 02/05/15.
 */
public class Weather {

    private String description;
    private Float degrees;
    private Date date;

    public Weather (String description, Float degrees){
        this.description = description;
        this.degrees = degrees;
    }

    public Float getDegrees() {
        return degrees;
    }

    public void setDegrees(Float degrees) {
        this.degrees = degrees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String totalDescription(){
        return description + degrees;
    }
}
