package com.iomzn.java.cglib.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

public class ServiceProxyFactory {



    public static Service getInstacne(ServiceProxy serviceProxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Service.class);
        enhancer.setCallback(serviceProxy);
        return (Service) enhancer.create();
    }








}
