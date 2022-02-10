package org.csystem.classworks.dosyalar.example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("dosya.txt");

            fis.skip(5);

            System.out.println("Okunan karakter :" + (char) fis.read());

            for (int i = 0; i < fis.available(); ++i) {
                System.out.println(i +". karakter :" + (char) fis.read());
            }



        } catch (FileNotFoundException e) {
            System.out.println("File Bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu...");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }
        }
    }
}
