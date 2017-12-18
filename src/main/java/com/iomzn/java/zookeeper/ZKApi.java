package com.iomzn.java.zookeeper;

public class ZKApi {

    public static void main(String[] args) {
        // create /path data
        // delete /path
        // exists /path
        // setData /path data
        // getData /path
        // getChildren /path

        // mode - persistent|ephemeral|persistent_sequential|ephemeral_sequential - (-e|-s)
        // persistent - can only be deleted through delete call
        // ephemeral - deleted if client crash or close connection - cannot have children
        // sequential - a unique, monotonically increasing integer - for unique names

        // watches|notifications

        // versions
    }
}
