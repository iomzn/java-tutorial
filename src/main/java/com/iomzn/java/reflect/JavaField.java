package com.iomzn.java.reflect;

import java.lang.reflect.Field;

public class JavaField {
    public String sampleField;

    public static void main(String[] args) throws Exception {
        // example
        Class<JavaField> clazz = JavaField.class;
        JavaField instance = new JavaField();

        // field
        Field field = clazz.getField("sampleField");
        Field[] fields = clazz.getFields();

        // field name
        String fieldName = field.getName(); // sampleField

        // field type
        Class<?> fieldType = field.getType();

        // get field value
        String fieldValue = (String) field.get(instance); // null

        // set field value
        field.set(instance, "init");
    }
}
