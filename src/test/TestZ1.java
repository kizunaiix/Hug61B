package src.test;

import src.java.Poodle;
//import java.util.List;
import org.junit.Test;
//import src.main.Box;

public class TestZ1 {

    @Test
    public void t1(){
        System.out.println("hello");
    }

    /**试一下父类的private属性能不能继承
     * 答案是不能
     * 是不是要在子类里再写一遍呢？
     * --->不是。用protected关键字就行了。
     */
    @Test
    public void t2(){
        Poodle p1 = new Poodle();
        p1.bark();
        System.out.println(p1.getColor());
        p1.setColor("hello");
        System.out.println(p1.getColor());
    }

    @Test
    public void t3(){

    }
}
