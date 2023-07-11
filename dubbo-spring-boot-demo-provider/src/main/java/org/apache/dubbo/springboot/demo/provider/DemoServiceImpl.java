package org.apache.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.springboot.demo.DemoService;

/**
 * 服务接口实现类
 * 在服务端这一侧定义对应的实现，这部分的实现相对于消费端来说是远端的实现，本地没有相关的信息
 *
 * @author by pepsi-wyl
 * @date 2023-07-10 15:24
 */
@DubboService  // 通过这个配置可以基于 Spring Boot 去发布 Dubbo 服务
public class DemoServiceImpl implements DemoService {  // 实现了 DemoService 接口

    /**
     * 接口方法实现
     *
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}