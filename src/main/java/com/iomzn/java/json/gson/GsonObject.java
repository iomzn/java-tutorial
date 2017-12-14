package com.iomzn.java.json.gson;

import com.google.gson.Gson;
import com.iomzn.java.json.gson.domain.GsonExample;

public class GsonObject {

    public static void main(String[] args) {
        Gson gson = new Gson();
        GsonExample example = new GsonExample();

        // serialization
        String json = gson.toJson(example);

        // deserialization
        GsonExample object = gson.fromJson(json, GsonExample.class);
    }
}
