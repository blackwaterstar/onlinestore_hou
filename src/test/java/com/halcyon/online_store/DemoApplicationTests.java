package com.halcyon.online_store;

import com.halcyon.online_store.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

@Resource
private UserService userService;

    @Test
    void contextLoads() {

    }

    @Test
    public void a(){
       userService.list().forEach(System.out::println);

    }


}
