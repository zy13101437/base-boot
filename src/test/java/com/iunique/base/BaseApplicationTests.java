package com.iunique.base;

import com.iunique.BaseApplication;
import com.iunique.system.entity.User;
import com.iunique.system.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={BaseApplication.class})
public class BaseApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    UserRepository userRepository;


    @Test
    public void test1() {

        User user = userRepository.getOne(1L);
        user.setPassword("123");
        userRepository.save(user);

    }

}
