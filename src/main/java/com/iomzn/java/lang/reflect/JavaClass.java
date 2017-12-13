package com.iomzn.java.lang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class JavaClass {

    public static void main(String[] args) throws Exception {
        // instance
        Class v01 = JavaSample.class;
        Class v02 = Class.forName("com.iomzn.java.lang.reflect.JavaSample");
        Class v03 = ClassLoader.getSystemClassLoader().loadClass("com.iomzn.java.lang.reflect.JavaSample");
        Class v04 = new JavaSample().getClass(); // not recommended

        // example
        Class<JavaSample> clazz = JavaSample.class;

        // class name
        String name = clazz.getName(); // com.iomzn.java.lang.reflect.JavaSample
        String simpleName = clazz.getSimpleName(); // JavaSample

        // package name
        String packageName = clazz.getPackageName(); // com.iomzn.java.lang.reflect

        // package info
        Package packageInfo = clazz.getPackage();

        // modifiers
        int modifiers = clazz.getModifiers();

        // superclass
        Class superclass = clazz.getSuperclass();

        // interfaces
        Class[] interfaces = clazz.getInterfaces();

        // constructor
        Constructor<JavaSample> defaultConstructor = clazz.getConstructor();
        Constructor<JavaSample> constructorWithArg = clazz.getConstructor(String.class);
        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<JavaSample> privateConstructor = clazz.getDeclaredConstructor(String.class, String.class);
        Constructor<?>[] privateConstructors = clazz.getDeclaredConstructors();

        // method
        Method method = clazz.getMethod("publicMethod", String.class);
        Method[] methods = clazz.getMethods();













        System.out.println(packageName);





    }
}
