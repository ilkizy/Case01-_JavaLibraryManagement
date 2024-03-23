package com.ilkiz.repository.entity;

import java.util.Date;

public class KitapTarih extends Kitap{

    Durum durum;
    public KitapTarih(String baslik, String yazar, String yayin_yili, Durum durum) {
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
        return "KitapTarih{" +
                "durum=" + durum +
                ", ISBN='" + ISBN + '\'' +
                ", baslik='" + baslik + '\'' +
                ", yazar='" + yazar + '\'' +
                ", yayin_yili=" + yayin_yili +
                '}';
    }
}
