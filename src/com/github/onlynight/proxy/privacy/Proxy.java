package com.github.onlynight.proxy.privacy;

import com.github.onlynight.proxy.RealSubject;
import com.github.onlynight.proxy.Subject;

/**
 * Created by lion on 2016/10/14.
 * 通过静态方法获取代理，这里可以设计成单例，也可以从远程服务中获取被代理对象。
 */
public class Proxy implements Subject {

    private Proxy() {
    }

    public static Proxy getDefault() {
        // 这里又很多想象空间，具体怎么使用就留给大家啦。
        return new Proxy();
    }

    /**
     * 这里演示内部构造方式，控制外部访问权限。
     * 只要不把对象本身能直接外部访问即可。
     */
    private Subject subject = new RealSubject();

    @Override
    public void operation() {
        System.out.println("Proxy start");
        subject.operation();
        System.out.println("Proxy end");
    }
}
