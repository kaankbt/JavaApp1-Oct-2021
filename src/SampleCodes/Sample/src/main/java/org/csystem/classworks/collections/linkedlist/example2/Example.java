package org.csystem.classworks.collections.linkedlist.example2;

import java.util.Iterator;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");

        //Adding an element to the first position
        list.addFirst("Rick");
        //Adding an element to the last position
        list.addLast("Nathan");
        //Adding an element to the 3rd position
        list.add(2, "Glenn");
        System.out.println(list);
        //Iterating LinkedList
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


