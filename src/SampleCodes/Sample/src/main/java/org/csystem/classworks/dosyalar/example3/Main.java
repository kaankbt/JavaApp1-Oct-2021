package org.csystem.classworks.dosyalar.example3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileWriter writer = null;

        try {
            writer = new FileWriter("dosya.txt",true);

            writer.write("Kaan KUBAT\n");
            writer.write("Kerem KUBAT\n");


        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatılırken bir hata oluştu.");
                }
            }
        }
    }
}
