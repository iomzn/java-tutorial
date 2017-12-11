package com.iomzn.java.collections.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class JavaCollection {

    public static void main(String[] args) {
        // example
        Collection<String> collection = new ArrayList<>();
        boolean isAddA = collection.add("A"); // true
        boolean isAddB = collection.add("B"); // true
        boolean isAddC = collection.add("C"); // true
        boolean isAddD = collection.add("D"); // true
        boolean isAddE = collection.add("E"); // true
        boolean isAddF = collection.add("F"); // true

        // query
        int size = collection.size(); // 6
        boolean isEmpty = collection.isEmpty(); // false
        boolean contains = collection.contains("A"); // true
        Iterator<String> iterator = collection.iterator();
        Object[] array01 = collection.toArray();
        String[] array02 = collection.toArray(new String[0]);

        // modification
        boolean isAdd = collection.add("G"); // true
        boolean isRemove = collection.remove("G"); // true

        // bulk
        boolean containsAll = collection.containsAll(List.of("A", "B", "C"));
        boolean isAddAll = collection.addAll(List.of("G", "H", "I"));
        boolean isRemoveAll = collection.removeAll(List.of("G", "H", "I"));
        boolean removeIf = collection.removeIf(s -> s.equals("F"));
        boolean retainAll = collection.retainAll(List.of("A", "B", "C"));
        collection.clear();
    }
}
