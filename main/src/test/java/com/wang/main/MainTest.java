package com.wang.main;

import com.wang.common.Constant;
import org.junit.Test;

import java.io.IOException;

public class MainTest {

    @Test
    public void testMain() throws IOException {
        System.out.println("Hello Main!!!");
        System.out.println("com.wang.common.Constant: " + Constant.HELLO);
    }

}
