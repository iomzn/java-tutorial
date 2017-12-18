package com.iomzn.java.cglib.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceInvocationHandler implements InvocationHandler {
    private Object target;

    public ServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before service");

        Object result = method.invoke(target, args);

        System.out.println("after service");

        return result;
    }


    public static void main(String[] args) {
        Service service = new ServiceImpl();
        ServiceInvocationHandler serviceInvocationHandler = new ServiceInvocationHandler(service);

        Service serviceProxy = (Service) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), serviceInvocationHandler);

        serviceProxy.print();
    }
}
