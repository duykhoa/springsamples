package com.torczuk.github;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class})
public class FastCarTest {

    @Autowired(required = false)
    Car fast;

    @Test
    public void autowireFast() {
        assertThat(fast).isNotNull(); //.is ..
    }

}
