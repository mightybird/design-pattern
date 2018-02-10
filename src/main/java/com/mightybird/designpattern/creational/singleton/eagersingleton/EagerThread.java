package com.mightybird.designpattern.creational.singleton.eagersingleton;

public class EagerThread extends Thread {

    public void run() {
        System.out.println(EagerLoadBalancer.getInstance().toString());
    }
}
