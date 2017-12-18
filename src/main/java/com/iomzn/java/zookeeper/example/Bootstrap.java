package com.iomzn.java.zookeeper.example;

import org.apache.zookeeper.ZooKeeper;

public class Bootstrap {

    public static void main(String[] args) throws Exception {
        Master master = new Master();
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 15000, master);


        Thread.sleep(100000);



    }
}
