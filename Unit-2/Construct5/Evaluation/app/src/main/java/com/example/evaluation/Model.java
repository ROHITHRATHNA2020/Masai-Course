package com.example.evaluation;

public class Model {

    private int date;
    private int positive;
    private int negative;
    private int hospitalisedCurrently;
    private int onVentilatorCurrently;
    private int death;
    private String dateChecked;

    public Model(int date, int positive, int negative, int hospitalisedCurrently,int onVentilatorCurrently, int death, String dateChecked ) {
        this.date = date;
        this.positive = positive;
        this.negative = negative;
        this.hospitalisedCurrently = hospitalisedCurrently;
        this.onVentilatorCurrently = onVentilatorCurrently;
        this.death = death;
        this.dateChecked = dateChecked;
    }

    public int getDate() {
        return date;
    }

    public int getPositive() {
        return positive;
    }

    public int getNegative() {
        return negative;
    }

    public int getOnVentilatorCurrently(){
        return onVentilatorCurrently;
    }

    public int getHospitalisedCurrently() {
        return hospitalisedCurrently;
    }

    public int getDeath() {
        return death;
    }

    public String getDateChecked() {
        return dateChecked;
    }
}
