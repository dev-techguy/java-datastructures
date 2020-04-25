package com.shiftechafrica;

import com.shiftechafrica.arraylist.ArrayListExample;
import com.shiftechafrica.collection.CollectionsExample;
import com.shiftechafrica.iterable.IterableExample;
import com.shiftechafrica.linked.LinkedListExample;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n------- Running Collection Interface ----------");
        new CollectionsExample();
        System.out.println("\n------- Running Iterable Interface ----------");
        new IterableExample();
        System.out.println("\n------- Running ArrayList Interface ----------");
        new ArrayListExample();
        System.out.println("\n------- Running LinkedList Interface ----------");
        new LinkedListExample();
        System.out.println("\n------- Running Vector Interface ----------");
        new LinkedListExample();
    }
}
