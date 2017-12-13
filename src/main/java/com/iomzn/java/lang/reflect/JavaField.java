package com.iomzn.java.lang.reflect;

import java.lang.reflect.Field;

public class JavaField {
    public String samplePublicField;
    private String samplePrivateField;

    public static void main(String[] args) throws Exception {
        // example
        Class<JavaField> clazz = JavaField.class;
        JavaField instance = new JavaField();

        // field
        Field publicField = clazz.getField("samplePublicField");
        Field[] publicFields = clazz.getFields();
        Field privateField = clazz.getDeclaredField("samplePrivateField");
        Field[] privateFields = clazz.getDeclaredFields();

        // field name
        String publicFieldName = publicField.getName(); // samplePublicField
        String privateFieldName = privateField.getName(); // samplePrivateField

        // field type
        Class<?> publicFieldType = publicField.getType();
        Class<?> privateFieldType = privateField.getType();

        // note: because main method belong to this class, so main can access
        // private field, so this is not required
        privateField.setAccessible(true);

        // get field value
        String publicFieldValue  = (String) publicField.get(instance); // null
        String privateFieldValue = (String) privateField.get(instance); // null

        // set field value
        publicField.set(instance, "init public");
        privateField.set(instance, "init private");
    }
}
