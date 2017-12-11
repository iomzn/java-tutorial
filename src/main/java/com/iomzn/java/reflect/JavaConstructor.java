package com.iomzn.java.reflect;

import java.lang.reflect.Constructor;

public class JavaConstructor {

    public JavaConstructor() {
        System.out.println("no args constructor");
    }

    public JavaConstructor(String arg) {
        System.out.println("one arg constructor");
    }

    public static void main(String[] args) throws Exception {
        // example
        Class<JavaConstructor> clazz = JavaConstructor.class;

        // constructor
        Constructor<JavaConstructor> noArgConstructor = clazz.getConstructor();
        Constructor<JavaConstructor> oneArgConstructor = clazz.getConstructor(String.class);

        // new instance
        JavaConstructor v01 = noArgConstructor.newInstance();
        JavaConstructor v02 = oneArgConstructor.newInstance("string argument");
    }
}
