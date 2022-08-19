package src.test;

import src.java.Poodle;
import src.java.MathThings;
import org.junit.Test;

import java.util.*;

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

    /**试一下toString()方法*/
    @Test
    public void t3(){
        int a = 4;
        int[] b = {1,2,3};
        String stringed;


        stringed = Integer.toString(a);  //Integer类转String
        System.out.println(stringed);
        System.out.println("----------------");
        stringed = Arrays.toString(b);   //Arrays类（其实是接口）转String
        System.out.println(stringed);
        System.out.println("----------------");
        stringed = b.toString();         //Object类直接toString，给的是地址
        System.out.println(stringed);
    }

    /**学习并理解递归方法*/
    @Test
    public void t4(){
        int start = 5;

        System.out.println(MathThings.jiecheng(start));
        System.out.println(MathThings.jiecheng_rec(start));
        System.out.println(MathThings.fibonacci_n(5));
    }

    /**研究一下泛型方法。*/
    @Test
    public void t5(){
        Poodle p1 = new Poodle();
        p1.tellSeen("a ball");
        p1.tellSeen(300 + 100);
    }

    /**
     * 练习try catch语句 和 throw new exception.
     * try里面定义的变量只在try里能用.
     */
    @Test
    public void t6(){
        int y = 3;
        try {
            int x = 3 + 4 ;       // try里面定义的变量只在try里能用。
            y = y +1;
            throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("got exception");
        }
        System.out.println(y);
        int x = 7;
        if (x == 7){
            throw new RuntimeException("created an exception.");
        }
    }

    /**试一下迭代器Iterator()*/
    @Test
    public void t7(){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(14);
        System.out.println(l1);

        Iterator<Integer> l1_iterator = l1.iterator();  //List的实例本身就具有产生迭代器的方法。
        try {
            while (l1_iterator.hasNext()){
                System.out.println(l1_iterator.next());
            }
        } catch (Exception e) {
            throw new RuntimeException("got a exception.");
        }
    }

}
