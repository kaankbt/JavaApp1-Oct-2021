package org.csystem.classworks.reflection.example1.example2;

import org.csystem.util.console.Console;

class Solution {
    public static void main(String[] args)
    {
        var clsStr1 = String.class;
        var clsStr2 = String.class;

        Console.writeLine(clsStr1 != clsStr2);
        //...
    }
}
