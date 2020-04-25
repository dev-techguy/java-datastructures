package com.shiftechafrica;

import com.shiftechafrica.arraylist.ArrayListExample;
import com.shiftechafrica.collection.CollectionsExample;
import com.shiftechafrica.iterable.IterableExample;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n------- Running Collection Interface ----------");
        new CollectionsExample();
        System.out.println("\n------- Running Iterable Interface ----------");
        new IterableExample();
        System.out.println("\n------- Running ArrayList Interface ----------");
        new ArrayListExample();
    }
}
