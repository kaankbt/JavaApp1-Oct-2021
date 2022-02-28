package org.csystem.classworks.collections.stack.example2;

import org.csystem.util.console.Console;

import java.util.EmptyStackException;
import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        var stack = new Stack<Integer>();

        for (int i = 0; i < 10; ++i)
            stack.push(i * 10);

        Console.writeLine("Peek%d", stack.peek());

        try {
            for (; ; ) {
                Console.write("%d ", stack.pop());
            }
        } catch (EmptyStackException ignore) {
            Console.writeLine();
        }
    }
}
