package com.ilkiz.repository.entity;

import java.util.List;

public interface IUye {
    List<Kitap> oduncKitapListesi();
    Boolean oduncAl();
    Boolean oduncVer();

}
