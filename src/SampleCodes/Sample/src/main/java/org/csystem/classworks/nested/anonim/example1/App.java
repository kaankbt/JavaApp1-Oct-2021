package org.csystem.classworks.nested.anonim.example1;
/*----------------------------------------------------------------------------------------------------------------------
    Anonim sınıflar: Bildirim sırasında programcının isim vermediği sınıflardır.
    Anonim sınıf bildiriminin genel biçimi:

    new <tür>([argümanlar]) {
        <bildirimler>
    };

    Anonim sınıf yazmak hem bildirim hem de türemiş sınıf veya tür bir arayüz ise arayüzü destekleyen (implementation)
    bir sınıf türünden nesne yaratmak demektir. Şüphesiz derleyici anonim sınıfa da bir isim verecektir. Bu işlem türetme
    ya d implementation olduğundan anonim sınıfa ilişkin yaratılan  nesnenin referansı (adresi) taban sınıf (veya interface)
    türünden bir referansa atanmalıdır. Birebir aynı bile olsa her anonim sınıf bildirimi yeni bir tür bildirimi ve o türden
    bir nesne yaratılması demektir
----------------------------------------------------------------------------------------------------------------------*/
import org.csystem.util.console.*;

public class App {
    public static void main(String[] args) {
        Sample s1, s2, s3;
        s1 = new Sample() {

        };
        s2 = new Sample() {

        };
        s3 = new Sample() {

        };

        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());
        System.out.println(s3.getClass().getName());

        s1.foo();
        s2.foo();
        s3.foo();

    }
}

class Sample {
    public void foo() {
        Console.writeLine("Sample");
    }
}
