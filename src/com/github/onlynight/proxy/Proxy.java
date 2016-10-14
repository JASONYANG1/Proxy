package com.github.onlynight.proxy;

/**
 * Created by lion on 2016/10/11.
 * 这类的构造函数需要从外部传入被代理对象，这种不太符合真实的使用场景
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
