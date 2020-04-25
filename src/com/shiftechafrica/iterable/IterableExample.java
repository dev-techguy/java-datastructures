package com.shiftechafrica.iterable;

import java.util.Arrays;
import java.util.Collection;

public class IterableExample {
    public IterableExample() {
        Collection collection = Arrays.asList(
                "java",
                "php",
                "python",
                "go-lang",
                "node-js",
                "vue-js",
                "react-js"
        );

        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
