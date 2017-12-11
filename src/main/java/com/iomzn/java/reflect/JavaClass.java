package com.iomzn.java.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaClass {

    public static void main(String[] args) throws Exception {
        // instance
        Class v01 = JavaClass.class;
        Class v02 = Class.forName("com.iomzn.java.reflect.JavaClass");

        // example
        Class clazz = JavaClass.class;

        // class name
        String clazzName = clazz.getName(); // com.iomzn.java.reflect.JavaClass
        String clazzSimpleName = clazz.getSimpleName(); // JavaClass

        // modifiers
        int clazzModifiers = clazz.getModifiers();

        // package
        Package clazzPackage = clazz.getPackage();

        // super class
        Class clazzSuperclass = clazz.getSuperclass();

        // interfaces
        Class[] clazzInterfaces = clazz.getInterfaces();

        // constructors
        Constructor[] clazzConstructors = clazz.getConstructors();

        // methods
        Method[] clazzMethods = clazz.getMethods();

        // fields
        Field[] clazzFields = clazz.getFields();

        // annotations
        Annotation[] clazzAnnotations = clazz.getAnnotations();
    }
}
