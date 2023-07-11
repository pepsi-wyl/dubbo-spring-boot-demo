package org.apache.dubbo.springboot.demo.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.springboot.demo.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消费端请求任务
 *
 * @author by pepsi-wyl
 * @date 2023-07-10 15:40
 */
@Component
public class Task implements CommandLineRunner {

    // 通过@DubboReference 从 Dubbo 获取一个 RPC 订阅
    @DubboReference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {

        // 调用服务端接口
        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);

        // 线程调用服务端接口
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(new Date() + " Receive result ======> " + demoService.sayHello("world"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

    }
}