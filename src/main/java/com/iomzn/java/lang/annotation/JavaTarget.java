package com.iomzn.java.lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class JavaTarget {

    @Target({ElementType.FIELD, ElementType.METHOD})
    @interface MyAnnotationType {
    }
}
