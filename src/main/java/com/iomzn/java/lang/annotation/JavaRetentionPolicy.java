package com.iomzn.java.lang.annotation;

import java.lang.annotation.RetentionPolicy;

public class JavaRetentionPolicy {

    public static void main(String[] args) {
        // instance
        RetentionPolicy v01 = RetentionPolicy.SOURCE;
        RetentionPolicy v02 = RetentionPolicy.CLASS;
        RetentionPolicy v03 = RetentionPolicy.RUNTIME;
    }
}
