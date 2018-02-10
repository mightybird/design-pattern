package com.mightybird.designpattern.creational.singleton.iodhsingleton;

public class IoDHThread extends Thread {
    public void run() {
        System.out.println(IoDHLoadBalancer.getInstance().toString());
    }
}
