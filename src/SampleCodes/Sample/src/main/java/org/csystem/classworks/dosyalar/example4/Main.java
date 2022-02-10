package org.csystem.classworks.dosyalar.example4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("diller.txt")) {
            Scanner scanner = new Scanner(System.in);
            String dil;
            while (true) {

                System.out.println("Bir dil giriniz:");
                dil = scanner.nextLine();


                if (dil.equals("-1")) {
                    System.out.println("Çıkış yapılıyor");
                    break;
                }
                writer.write(dil + "\n");

            }

        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken hata oluştu.");

        }
    }
}
