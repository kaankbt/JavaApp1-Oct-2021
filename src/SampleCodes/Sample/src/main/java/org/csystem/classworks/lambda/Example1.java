package org.csystem.classworks.lambda;
//Aşağıdaki örneklerde kullanılan FunctionalUtil sınıfı tamamen callback kavramı için yazılmıştır. Sınıfın kodları
//    nasıl yazıldığı önemsizdir. Sadece kullanım şekline odaklanılmalıdır

import org.csystem.app.function.FunctionalUtil;
import org.csystem.util.console.Console;

public class Example1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = new int[6];

        int count = FunctionalUtil.filter(a, b, val -> val % 2 == 0);

        FunctionalUtil.forEach(b,count,val -> Console.write("%d " , val));
    }
}

