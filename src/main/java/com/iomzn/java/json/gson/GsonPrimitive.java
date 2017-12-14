package com.iomzn.java.json.gson;

import com.google.gson.Gson;

public class GsonPrimitive {

    public static void main(String[] args) {
        Gson gson = new Gson();

        // serialization
        String s01 = gson.toJson(1); // 1
        String s02 = gson.toJson(1.0); // 1.0
        String s03 = gson.toJson(true); // true
        String s04 = gson.toJson('A'); // "A"
        String s05 = gson.toJson("ABC"); // "ABC"
        String s06 = gson.toJson(new int[]{1, 2, 3}); // [1,2,3]

        // deserialization
        int d01 = gson.fromJson("1", int.class);
        double d02 = gson.fromJson("1.0", double.class);
        boolean d03 = gson.fromJson("true", boolean.class);
        char d04 = gson.fromJson("\"A\"", char.class);
        String d05 = gson.fromJson("\"ABC\"", String.class);
        int[] d06 = gson.fromJson("[1,2,3]", int[].class);
    }
}
