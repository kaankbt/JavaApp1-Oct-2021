package org.csystem.classworks.dosyalar.example5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println("Okunan satır :" + scanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu.");

        }
    }
}
