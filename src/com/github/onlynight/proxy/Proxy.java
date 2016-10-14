package com.github.onlynight.proxy;

/**
 * Created by lion on 2016/10/11.
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        System.out.println("before operation");
        subject.operation();
        System.out.println("end operation");
    }
}
