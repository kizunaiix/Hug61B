package name.kiix;

import org.junit.Test;

/**玩一下Test*/
public class TestColor1 {

    /**测试一下获取狗的颜色*/
    @Test
    public void test1(){
        Dog d1 = new Dog();
        String s = d1.getColor();
        System.out.println(s);
    }

    /**测试一下设置狗的颜色，shining时应该抛出异常*/
    @Test
    public void test2(){
        Dog d1 = new Dog();
        d1.setColor("red");
        System.out.println(d1.getColor());
        System.out.println("____________________");
//        d1.setColor("shining");              //  这两句成功抛出了异常
//        System.out.println(d1.getColor());   //  这两句成功抛出了异常
    }


}
