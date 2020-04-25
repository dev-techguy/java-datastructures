package com.shiftechafrica.linked;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public LinkedListExample() {
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");

        states.addFirst("Alabama");
        System.out.println(states);
        System.out.println("last state in my list: " + states.getLast());

        ListIterator iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
