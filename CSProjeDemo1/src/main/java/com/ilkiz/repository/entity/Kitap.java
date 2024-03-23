package com.ilkiz.repository.entity;

import java.util.UUID;

public class Kitap {

    String ISBN;
    String baslik;
    String yazar;
    String yayin_yili;

    public Kitap(String baslik, String yazar, String yayin_yili) {
        ISBN = UUID.randomUUID().toString();
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayin_yili = yayin_yili;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayin_yili() {
        return yayin_yili;
    }

    public void setYayin_yili(String yayin_yili) {
        this.yayin_yili = yayin_yili;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "ISBN='" + ISBN + '\'' +
                ", baslik='" + baslik + '\'' +
                ", yazar='" + yazar + '\'' +
                ", yayin_yili='" + yayin_yili + '\'' +
                '}';
    }
}
