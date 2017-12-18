package com.iomzn.java.cglib.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ServiceProxy implements MethodInterceptor {


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("after");

        return result;
    }


    public static void main(String[] args) {
        ServiceProxy serviceProxy = new ServiceProxy();
        Service service = ServiceProxyFactory.getInstacne(serviceProxy);
        service.print();
    }
}
