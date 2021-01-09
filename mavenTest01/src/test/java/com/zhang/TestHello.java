package com.zhang;

import javafx.scene.control.cell.MapValueFactory;
import org.junit.Test;

/**
 * @author zhanghaoran
 * @create 2021-01-09 19:48
 */
public class TestHello {
    @Test
    public void testHello(){
        Hell0 hell0 = new Hell0();
//       String s 去接sayHello中的return值
        String s = hell0.sayHello("Maven!");
        System.out.println(s);
    }
}
