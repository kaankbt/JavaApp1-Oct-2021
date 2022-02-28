package org.csystem.classworks.reflection.example1;

public class Solution {
    public static void main(String[] args) {

        Class<Sample> clsSample = Sample.class; // 1
        Class<Mample> clsMample = Mample.class; // 2
        Class<String> clsString = String.class; // 3
        Class<Integer> clsInteger = Integer.class;
        Class<Integer> clsInt = int.class;
        Class<?> clsDouble = double.class;
        Class<int[]> clsIntArray = int[].class;

        //...
    }
}

class Sample {
        //...
}

class Mample {
        //...
}
