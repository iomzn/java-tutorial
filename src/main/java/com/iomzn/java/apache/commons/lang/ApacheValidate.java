package com.iomzn.java.apache.commons.lang;

import org.apache.commons.lang3.Validate;

public class ApacheValidate {

    public static void main(String[] args) {
        // example
        boolean expression = true;
        Object object = new ApacheValidate();
        Object[] objects = new Object[]{new ApacheValidate()};
        String str = "test";
        boolean state = true;
        double value = 1.0;

        Validate.isTrue(true);
        Validate.notNull(object);
        Validate.notEmpty(objects);
        Validate.notBlank(str);
        Validate.noNullElements(objects);
        Validate.validIndex(objects, 0);
        Validate.validState(true);
        Validate.matchesPattern("hi", "[a-z]*");
        Validate.notNaN(value);
        Validate.finite(value);
        Validate.inclusiveBetween(1, 10, 5);
        Validate.exclusiveBetween(1, 10, 5);
        Validate.isInstanceOf(ApacheValidate.class, new ApacheValidate());
        Validate.isAssignableFrom(Object.class, ApacheValidate.class);
    }
}
