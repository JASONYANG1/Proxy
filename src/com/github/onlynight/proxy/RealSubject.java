package com.github.onlynight.proxy;

/**
 * Created by lion on 2016/10/11.
 */
public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("real operation");
    }
}
