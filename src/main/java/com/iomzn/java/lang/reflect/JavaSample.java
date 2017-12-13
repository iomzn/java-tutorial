package com.iomzn.java.lang.reflect;

public class JavaSample {

    public JavaSample() {
        System.out.println("invoke default constructor");
    }

    public JavaSample(String arg) {
        System.out.println("invoke constructor with arg " + arg);
    }

    private JavaSample(String arg1, String arg2) {
        System.out.println("invoke private constructor with arg " + arg1 + " " + arg2);
    }

    public int publicMethod(String arg) {
        System.out.println("invoke public method with arg " + arg);
        return 0;
    }

    private int privateMethod(String arg) {
        System.out.println("invoke private method with arg " + arg);
        return 0;
    }
}
