package com.mightybird.designpattern.creational.singleton.lazysingleton;

public class LazyThread extends Thread {
    public void run() {
        System.out.println(LazyLoadBalancer.getInstance().toString());
    }
}
