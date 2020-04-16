package com.shiftechafrica;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableExample {
    IterableExample() {
        Collection collection = Arrays.asList(
                "java",
                "php",
                "python",
                "go-lang",
                "node-js",
                "vue-js",
                "react-js"
        );

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
