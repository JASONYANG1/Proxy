package com.github.onlynight.proxy;

public class Main {

    public static void main(String[] args) {
        System.out.println("demo1>");
        demo1();
        System.out.println("\ndemo2>");
        demo2();
    }

    private static void demo1() {
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.operation();
    }

    private static void demo2() {
        com.github.onlynight.proxy.privacy.Proxy.getDefault().operation();
    }
}
