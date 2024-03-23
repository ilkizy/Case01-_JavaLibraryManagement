package com.ilkiz.repository.entity;

import java.util.Date;

public class KitapRoman extends Kitap{

    Durum durum;
    public KitapRoman(String baslik, String yazar, String yayin_yili, Durum durum) {
        super(baslik, yazar, yayin_yili);
        this.durum = durum;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "KitapRoman{" +
                "durum=" + durum +
                ", ISBN='" + ISBN + '\'' +
                ", baslik='" + baslik + '\'' +
                ", yazar='" + yazar + '\'' +
                ", yayin_yili=" + yayin_yili +
                '}';
    }
}
