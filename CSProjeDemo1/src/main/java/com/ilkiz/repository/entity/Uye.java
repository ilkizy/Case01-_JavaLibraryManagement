package com.ilkiz.repository.entity;

import com.ilkiz.repository.KitapRepository;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Uye implements IUye{

    String ad;
    String soyad;
    String uyeNo;
    List<Kitap> oduncListesi;

    KitapRepository kitapRepository = new KitapRepository();
    public Uye(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        uyeNo = UUID.randomUUID().toString();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUyeNo() {
        return uyeNo;
    }

    @Override
    public List<Kitap> oduncKitapListesi() {
        return oduncListesi;
    }

    @Override
    public Boolean oduncAl() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Ödünç almak istediðiniz kitap adýný girin: ");
        String kitapAdi = sc.nextLine();
        Kitap kitap = kitapRepository.findByBaslik(kitapAdi);
        oduncListesi.add(kitap);
        System.out.println(kitapAdi + "ödünç alýndý");
        return true;
    }

    @Override
    public Boolean oduncVer() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Geri vermek istediðiniz kitap adýný girin: ");
        String kitapAdi = sc.nextLine();
        Kitap kitap = kitapRepository.findByBaslik(kitapAdi);
        oduncListesi.remove(kitap);
        System.out.println(kitapAdi + "iade edildi");
        return true;
    }
    @Override
    public String toString() {
        return "Uye{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", uyeNo='" + uyeNo + '\''
                ;
    }
}
