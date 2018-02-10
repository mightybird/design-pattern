package com.mightybird.designpattern.creational.singleton.lazysingleton;

public class LazyLoadBalancer {
    private volatile static LazyLoadBalancer instance = null;

    private LazyLoadBalancer() {
        System.out.println("Lazy LoadBalancer singleton created!");
    }

    public static LazyLoadBalancer getInstance() {
        if (instance == null) {
            synchronized (LazyLoadBalancer.class) {
                if (instance == null) {
                    instance = new LazyLoadBalancer();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        LazyLoadBalancer instance1 = LazyLoadBalancer.getInstance();
        LazyLoadBalancer instance2 = LazyLoadBalancer.getInstance();
        System.out.println(instance1 == instance2);
    }
}
