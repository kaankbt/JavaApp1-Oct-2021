package org.csystem.classworks.arrays.compare;

/*----------------------------------------------------------------------------------------------------------------------
    Arrays sınıfının compare metodu dizileri karşılaştırmak için kullanılır. Metot "lexicographically" bir karşılaştırma
    yapar:
        Arrays.compare(a, b); çağrısı için
    a dizisi ile b karşılıklı elemanları içerisinde ilk farklı olan elemana göre eğer a'ya ilişkin eleman küçükse -1,
    b'ye ilişkin küçükse 1 değerine dizilerin karşılık elemanlarının tamamı eşitse 0(sıfır) değerine geri döner. Metot
    Java 9 ile eklenmiştir
----------------------------------------------------------------------------------------------------------------------*/

import org.csystem.util.console.Console;

import java.util.Arrays;

class App1 {
    public static void main(String[] args) {
        int[] a = {1, -6, 3, 4, 5, 8, 9, 7};
        int[] b = {1, 3};

        Console.writeLine(Arrays.compare(a, b));
    }
}

