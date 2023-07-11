package org.apache.dubbo.springboot.demo;

/**
 * 服务接口
 * Dubbo 中沟通消费端和服务端的桥梁
 *
 * @author by pepsi-wyl
 * @date 2023-07-10 15:20
 */
public interface DemoService {

    /**
     * 接口方法
     *
     * @param name
     * @return
     */
    String sayHello(String name);
}