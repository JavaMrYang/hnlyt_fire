package com.hdkj.lyt.hnlyt_fire.repository;

import com.hdkj.lyt.hnlyt_fire.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//这是JUnit的注解，通过这个注解让SpringJUnit4ClassRunner这个类提供Spring测试上下文。
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringJUnitTestApplicationTests {
   @Autowired
    private UserRepository userRepository;
    @Test
    public void testCountUserByAppType(){
       /*int i=userRepository.countUserByAppType(4);
       System.out.println(i);*/
      User user=userRepository.findByName("13974867030");
      System.out.println("username:"+user.getName());
    }
}
