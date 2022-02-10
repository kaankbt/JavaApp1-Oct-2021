package org.csystem.classworks.lambda;


import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        IIntBinaryOperator bop = (a, b) -> a * b;

        System.out.println("Bir sayı giriniz(x) :");
        int x = kb.nextInt();

        System.out.println("Bir sayı giriniz(y) :");
        int y = kb.nextInt();

        System.out.println(bop.apply(x, y));
    }
}

interface IIntBinaryOperator {
    int apply(int left, int rigth);
}