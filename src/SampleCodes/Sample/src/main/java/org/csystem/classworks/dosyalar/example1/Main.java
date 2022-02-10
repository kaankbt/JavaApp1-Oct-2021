package org.csystem.classworks.dosyalar.example1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("dosya.txt",true);

          //  byte[] array = {101,31,48,34,33};
            String s = "Kaan KUBAT";
            byte[] s_array = s.getBytes(StandardCharsets.UTF_8);

            fos.write(s_array);


        } catch (FileNotFoundException e) {
            System.out.println("File Not found excepiton oluştu");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu.");
        } finally {

            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }
        }
    }
}
