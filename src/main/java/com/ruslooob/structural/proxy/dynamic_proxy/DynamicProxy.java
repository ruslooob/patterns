package com.ruslooob.structural.proxy.dynamic_proxy;

public class DynamicProxy extends BaseTargetClass implements TargetInterfaceA, TargetInterfaceB {

    @Override
    public void aMethod() {
        System.out.println("method a of DynamicProxy");
    }

    @Override
    public void bMethods() {
        System.out.println("method b of DynamicProxy class");
    }

}
