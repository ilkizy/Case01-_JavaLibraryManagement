package com.ilkiz.repository;

import com.ilkiz.repository.entity.Kitap;
import com.ilkiz.utility.Database;

import java.util.List;

public class KitapRepository {
    public boolean save(Kitap kitap, int s) {

        return false;
    }

    public Kitap save(Kitap kitap) {
        Database.kitapListesi.add(kitap);
        return null;
    }

    public Kitap update(Kitap kitap) {
        for (Kitap k : Database.kitapListesi) {
            if (k.getISBN().equals(kitap.getISBN())) {
                k.setBaslik(kitap.getBaslik());
                k.setYazar(kitap.getYazar());
                k.setYayin_yili(kitap.getYayin_yili());
            }
        }
        return kitap;
    }

    public boolean delete(Kitap kitap) {
        return true;
    }

    public boolean delete(String id) {
        Kitap kitap = null;
        for (Kitap k : Database.kitapListesi) {
            if (k.getISBN().equals(id)) {
                kitap = k;
                break;
            }
        }
        Database.kitapListesi.remove(kitap);
        return true;
    }

    public boolean delete(int index) {
        return true;
    }

    public List<Kitap> findAll() {
        return Database.kitapListesi;
    }

    public Kitap findByISBN(String ISBN) {
        return null;
    }

    public Kitap findByBaslik(String baslik) {
        return null;
    }
}


