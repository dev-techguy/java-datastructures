package com.shiftechafrica.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public CollectionsExample() {
        List<Integer> list1 = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        System.out.println("Position of 21 is " + Collections.binarySearch(list1, 21));
    }
}
