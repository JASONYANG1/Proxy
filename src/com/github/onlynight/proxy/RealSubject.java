package com.github.onlynight.proxy;

/**
 * Created by lion on 2016/10/11.
 */
public class RealSubject implements Subject {
    @Override
    public void operation() {
        // 调用以下内部函数，实现改函数的真正功能
        operation1();
        System.out.println("real operation");
    }

    private void operation1() {
        //todo real operation1
    }
}
