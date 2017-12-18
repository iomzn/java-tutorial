package com.iomzn.java.zookeeper.example;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

public class Master implements Watcher {

    @Override
    public void process(WatchedEvent event) {
        System.out.println("AAA" + event);
    }
}
