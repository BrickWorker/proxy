package com.brickworker.reflect;

import java.lang.reflect.Proxy;

/**
 * @Author tongzhixiang
 * @create 2019-09-05 10:33
 */
public class App {

    public static void main(String[] args) {

        JavaWorld javaWorld = new JavaWorld();
        LoggerHandler loggerHandler = new LoggerHandler(javaWorld);
        IHelloWorld proxy =  (IHelloWorld) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), javaWorld.getClass().getInterfaces(), loggerHandler);
        proxy.sayHello();

    }
}
