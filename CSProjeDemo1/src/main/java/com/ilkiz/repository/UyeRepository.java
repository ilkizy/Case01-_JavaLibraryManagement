package com.ilkiz.repository;

import com.ilkiz.repository.entity.Kitap;
import com.ilkiz.repository.entity.Uye;
import com.ilkiz.utility.Database;

import java.util.List;

public class UyeRepository {

    public boolean save(Uye uye, int s) {

        return false;
    }

    public Uye save(Uye uye) {
        Database.uyeListesi.add(uye);
        return null;
    }

    public Uye update(Uye uye) {
        for (Uye u : Database.uyeListesi) {
            if (u.getUyeNo().equals(uye.getUyeNo())) {
                u.setAd(uye.getAd());
                u.setSoyad(uye.getSoyad());
            }
        }
        return uye;
    }

    public boolean delete(Uye uye) {
        return true;
    }

    public boolean delete(String id) {
        Uye uye = null;
        for (Uye u : Database.uyeListesi) {
            if (u.getUyeNo().equals(id)) {
                uye = u;
                break;
            }
        }
        Database.uyeListesi.remove(uye);
        return true;
    }
    public boolean delete(int index) {
        return true;
    }

    public List<Uye> findAll() {
        return Database.uyeListesi;
    }

    public Uye findById(String id) {
        return null;
    }

    public Uye findByAd(String ad) {
        return null;
    }
}
