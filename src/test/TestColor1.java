package src.test;

import org.junit.Test;
import src.java.Dog;

/**玩一下Test*/
public class TestColor1 {

    /**测试一下获取狗的颜色*/
    @Test
    public void test1(){
        Dog d1 = new Dog();
        String s = d1.getColor();
        System.out.println(s);
    }

    @Test
    public void test2(){
        Dog d1 = new Dog();
        d1.setColor("red");
        System.out.println(d1.getColor());
    }
}
