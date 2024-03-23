package com.ilkiz.controller;

import com.ilkiz.repository.KitapRepository;
import com.ilkiz.repository.UyeRepository;
import com.ilkiz.repository.entity.Kitap;
import com.ilkiz.repository.entity.Uye;

import java.util.Scanner;

public class Kütüphane {

    KitapRepository kitapRepository = new KitapRepository();
    UyeRepository uyeRepository = new UyeRepository();

    private void kitapEkleme() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Kitap adýný girin: ");
        String ad = sc.nextLine();
        System.out.print("Yazarý girin: ");
        String yazar = sc.nextLine();
        System.out.print("Yayýn yýlýný girin: ");
        String yayinYili = sc.nextLine();
        Kitap kitap = new Kitap(ad, yazar, yayinYili);
        kitapRepository.save(kitap);
    }

    private void kitapSilme() {
        kitapListesiGoster();
        Scanner sc = new Scanner(System.in);
        System.out.print("Silinecek kayýt no: ");

        int sno = sc.nextInt();
        System.out.println();

        Kitap kitap = kitapRepository.findAll().get(sno - 1);
        kitapRepository.delete(kitap.getISBN());
    }

    private void kitapListesiGoster() {
        System.out.println("**KÝTAP LÝSTESÝ SAYFASI**");
        System.out.println();
        int no = 1;
        for (Kitap kitap : kitapRepository.findAll()) {
            System.out.println("Sýra numarasý: " + no + " - ");
            System.out.println(kitap.toString());
            no++;
        }
    }

    private void uyeEkleme() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Üye adýný girin: ");
        String ad = sc.nextLine();
        System.out.print("Üye soyadýný girin: ");
        String soyad = sc.nextLine();
        Uye uye = new Uye(ad, soyad);
        uyeRepository.save(uye);
    }

    private void uyeSilme() {
        uyeListesiGoster();
        Scanner sc = new Scanner(System.in);
        System.out.print("Silinecek kayýt no: ");

        int sno = sc.nextInt();
        System.out.println();

        Uye uye = uyeRepository.findAll().get(sno - 1);
        uyeRepository.delete(uye.getUyeNo());
    }

    private void uyeListesiGoster() {
        System.out.println("**ÜYE LÝSTESÝ SAYFASI**");
        System.out.println();
        int no = 1;
        for (Uye uye : uyeRepository.findAll()) {
            System.out.println("Sýra numarasý: " + no + " - ");
            System.out.println(uye.toString());
            no++;
        }
    }

    private void oduncAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Üye numaranýzý girin: ");
        String uyeNo = sc.nextLine();
        Uye uye = uyeRepository.findById(uyeNo);
        uye.oduncAl();
    }

    private void oduncVer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Üye numaranýzý girin: ");
        String uyeNo = sc.nextLine();
        Uye uye = uyeRepository.findById(uyeNo);
        uye.oduncVer();
    }
    public void kutuphaneIslemleri() {
        Scanner sc = new Scanner(System.in);
        int secim;
        do {
            System.out.println("**************************");
            System.out.println("**KÜTÜPHANE ÝÞLEMLERÝ SAYFASI**");
            System.out.println("**************************");
            System.out.println();
            System.out.println("1-Kitap Ekleme");
            System.out.println("2-Kitap Silme");
            System.out.println("3-Kitap Listeleme");
            System.out.println("4-Üye Ekleme");
            System.out.println("5-Üye Silme");
            System.out.println("6-Üye Listeleme");
            System.out.println("7-Ödünç Alma Ýþlemi");
            System.out.println("8-Ýade Ýþlemi");
            System.out.println("0-ÇIKIÞ");
            System.out.print("Seçiniz: ");
            secim = sc.nextInt();
            switch (secim) {
                case 1:
                    kitapEkleme();
                    break;
                case 2:
                    kitapSilme();
                    break;
                case 3:
                    kitapListesiGoster();
                    break;
                case 4:
                    uyeEkleme();
                    break;
                case 5:
                    uyeSilme();
                    break;
                case 6:
                    uyeListesiGoster();
                    break;
                case 7:
                    oduncAl();
                    break;
                case 8:
                    oduncVer();
                    break;
                case 0:
                    System.err.println("Çýkýþ yapýldý.");
                    break;
                default:
                    break;
            }
        } while (secim != 0);
    }

}
