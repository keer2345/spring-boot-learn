package com.keer.mybatis;

import com.keer.mybatis.entity.User;
import com.keer.mybatis.mapper.UserMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        userMapper.dropTable();
        userMapper.createTable();
        for (int i = 0; i < 10; i++) {
            User user = new User("keer" + i, 25 + i);
            userMapper.insert(user);
        }
    }

    @Test
    public void proxy() throws Exception {
        System.out.println(userMapper.getClass());
    }

    @Test
    public void all() throws Exception {
        assertThat(userMapper.findByNameLike("keer%")).hasSize(10);
    }

    @After
    public void destroy() throws Exception {
        userMapper.deleteAll();
    }

}
