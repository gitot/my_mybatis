package com.guyot.demo.mybatis;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;


public class MybatisTest {


    @Test
    public void test() {
        System.out.println("hello");
        assertThat(1, notNullValue());
    }

}
