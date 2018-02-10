package com.mightybird.designpattern.creational.singleton.eagersingleton;

public class EagerLoadBalancer {
    private static EagerLoadBalancer ourInstance = new EagerLoadBalancer();

    private EagerLoadBalancer() {
        System.out.println("Eager LoadBalancer singleton created!");
    }

    public static EagerLoadBalancer getInstance() {
        return ourInstance;
    }

    public static void main(String[] args) {
        EagerLoadBalancer instance1 = EagerLoadBalancer.getInstance();
        EagerLoadBalancer instance2 = EagerLoadBalancer.getInstance();
        System.out.println(instance1 == instance2);
    }
}
