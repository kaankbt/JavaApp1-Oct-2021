package org.csystem.classworks.dosyalar.example6;

import java.io.Serial;
import java.io.Serializable;

public class Ogrenci implements Serializable {
    @Serial
    private static final long serialVersionUID =  1000;

    private String isim;
    private int id;
    private String bolum;

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Öğrenci ismi :" + isim +
                            "\n Öğrenci numarası: " + id +
                            "\n Öğrenci Bölüm :" + bolum;

        return bilgiler;


    }
}
