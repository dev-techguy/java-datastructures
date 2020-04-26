package com.shiftechafrica;

import com.shiftechafrica.arraylist.ArrayListExample;
import com.shiftechafrica.collection.CollectionsExample;
import com.shiftechafrica.iterable.IterableExample;
import com.shiftechafrica.linked.LinkedListExample;
import com.shiftechafrica.queue.QueueExample;
import com.shiftechafrica.stack.StackExample;
import com.shiftechafrica.vector.VectorExample;

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
        new VectorExample();
        System.out.println("\n------- Running Stack Interface ----------");
        new StackExample();
        System.out.println("\n------- Running Queue Interface ----------");
        new QueueExample();
    }
}
