package com.iomzn.java.guava;

import java.util.List;

import static com.google.common.base.Preconditions.*;

public class GuavaPreconditions {
    private int argument = 10;
    private String instance = "ABC";
    private String state = "SUCCESS";
    private List<Integer> list = List.of(1, 2, 3); // size = 3

    public static void main(String[] args) {
        // example
        GuavaPreconditions example = new GuavaPreconditions();

        // Preconditions.checkXXX
        checkArgument(example.argument > 0); // true|false - IllegalArgumentException
        checkNotNull(example.instance); // null - NullPointerException
        checkState(example.state.equals("SUCCESS")); // true|false - IllegalStateException
        checkElementIndex(2, example.list.size()); // [0, size)|IndexOutOfBoundsException
        checkPositionIndex(3, example.list.size()); // [0, size]|IndexOutOfBoundsException
        checkPositionIndexes(0, 3, example.list.size()); // [start, end)|IndexOutOfBoundsException
    }
}
