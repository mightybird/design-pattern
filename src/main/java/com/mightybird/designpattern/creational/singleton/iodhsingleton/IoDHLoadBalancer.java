package com.mightybird.designpattern.creational.singleton.iodhsingleton;

public class IoDHLoadBalancer {
    private IoDHLoadBalancer() {
        System.out.println("IoDH LoadBalancer singleton created!");
    }

    public static IoDHLoadBalancer getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHLoadBalancer instance1 = IoDHLoadBalancer.getInstance();
        IoDHLoadBalancer instance2 = IoDHLoadBalancer.getInstance();
        System.out.println(instance1 == instance2);
    }

    private static class HolderClass {
        private static final IoDHLoadBalancer instance = new IoDHLoadBalancer();
    }
}
