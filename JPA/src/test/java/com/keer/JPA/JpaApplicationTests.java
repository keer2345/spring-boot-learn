package com.keer.JPA;

import com.keer.JPA.entity.User;
import com.keer.JPA.repository.UserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JpaApplicationTests {
    @Autowired
    UserRepository userRepository;

    @Before
    public void save() throws Exception {
        for (int i = 0; i < 10; i++) {
            User user = new User("keer" + i, 25 + i);
            userRepository.save(user);
        }
    }

    @Test
    public void proxy() throws Exception {
        System.out.println(userRepository.getClass());
    }


    @Test
    public void all() throws Exception {
        assertThat(userRepository.findAll()).hasSize(10);
    }


    @Test
    public void findByName() throws Exception {
        assertThat(userRepository.findByNameLike("keer%")).hasSize(10);
    }

    @After
    public void destroy() throws Exception {
        userRepository.deleteAll();
    }
}