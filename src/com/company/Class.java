package com.company;

public class Class {
    private int san;
    private String soz;
    private int[] masiv;


    public Class(int san, String soz, int[] masiv) {
        this.san = san;
        this.soz = soz;
        this.masiv = masiv;
    }

    public int getSan() {
        return san;
    }

    public void setSan(int san) {
        this.san = san;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMasiv() {
        return masiv;
    }

    public void setMasiv(int[] masiv) {
        this.masiv = masiv;
    }
}
