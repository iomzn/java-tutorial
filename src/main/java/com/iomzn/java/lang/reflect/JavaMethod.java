package com.iomzn.java.lang.reflect;

import java.lang.reflect.Method;

public class JavaMethod {

    public int sampleInstanceMethod(String s) {
        System.out.println("invoke sample instance method");
        return 0;
    }

    private int samplePrivateInstanceMethod(String s) {
        System.out.println("invoke sample public instance");
        return 0;
    }

    public static int sampleStaticMethod(String s) {
        System.out.println("invoke sample static method");
        return 0;
    }

    public static void main(String[] args) throws Exception {
        // example
        Class<JavaMethod> clazz = JavaMethod.class;
        JavaMethod instance = new JavaMethod();

        // method
        Method instanceMethod = clazz.getMethod("sampleInstanceMethod", String.class);
        Method staticMethod = clazz.getMethod("sampleStaticMethod", String.class);
        Method[] methods = clazz.getMethods();

        // invoke method
        Object instanceResult = instanceMethod.invoke(instance, "instance method");
        Object staticResult = staticMethod.invoke(null, "static method");
    }
}
