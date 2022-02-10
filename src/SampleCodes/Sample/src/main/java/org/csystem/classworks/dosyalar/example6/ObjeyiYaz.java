package org.csystem.classworks.dosyalar.example6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.txt"))) {

            Ogrenci ogrenci1 = new Ogrenci("Kaan KUBAT", 1123, "Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Kerem ATAY", 3123, "Elektirik Mühendisliği");

            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException Oluştu...");
        }
    }
}
