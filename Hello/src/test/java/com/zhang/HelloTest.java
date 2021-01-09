package com.zhang;

import org.junit.Test;

/**
 * @author zhanghaoran
 * @create 2021-01-09 19:22
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven");
        System.out.println(maven);
    }
}
