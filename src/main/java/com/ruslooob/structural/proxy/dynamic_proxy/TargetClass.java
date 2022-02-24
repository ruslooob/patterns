package com.ruslooob.structural.proxy.dynamic_proxy;

public class TargetClass extends BaseTargetClass implements TargetInterfaceA, TargetInterfaceB{

    @Override
    public void aMethod() {
        System.out.println("method a of target class");
    }

    @Override
    public void bMethods() {
        System.out.println("method b of target class");
    }

}
