package com.keer;

import com.keer.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void getHello1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello1").accept
                (MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello world.")));
    }

    @Test
    public void getHello2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello2").accept
                (MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().string(equalTo("[\"A\",\"B\",\"C\"]")));
    }

}
