package name.kiix;

import org.junit.Test;
import java.util.*;
import java.lang.Math;

public class TestT1 {

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
        String newStringed;

        newStringed = Integer.toString(a);  //Integer类转String
        System.out.println(newStringed);
        System.out.println("----------------");
        newStringed = Arrays.toString(b);   //Arrays类（其实是接口）转String
        System.out.println(newStringed);
        System.out.println("----------------");
        newStringed = b.toString();         //Object类直接toString，给的是地址
        System.out.println(newStringed);
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
            y = y + 1;
            x = x + 2; 
            throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("got exception");
        }
        System.out.println(y);
        int x = (int) (Math.random() * 7);
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
        System.out.println("______________________________________");

        Iterator<Integer> l1_iterator = l1.iterator();  //List的实例本身就具有产生迭代器的方法。
        try {
            while (l1_iterator.hasNext()){
                System.out.println(l1_iterator.next());
            }
        } catch (Exception e) {
            throw new RuntimeException("got a exception.");
        }
        System.out.println("______________________________________");

        if (l1.iterator().hasNext()){
            System.out.println(l1.iterator().next());
        }

    }

    /**new一下Poodle类里面的嵌套类*/
    @Test
    public void t8(){
        Poodle p1 = new Poodle();
        Poodle.subclassOfPoodle p1s = p1.new subclassOfPoodle();  // 如果subclassOfPoodle是非静态的，就这样写
                                                                  // 注意是p1.new xxxxxxxx
//        Poodle.subclassOfPoodle p1s = new Poodle.subclassOfPoodle();  // 如果是static subclassOfPoodle的话，就得这样写了
                                                                        // 注意，两种都是Poodle.subclassOfPoodle打头的。
        System.out.println(p1s.num);
    }

    /**TODO :试试手写的冒泡排序,多试几种长度*/
    @Test
    public void t9(){
        int[] l1 = {2,4,3,1};
        int i = 1;
        int[] sorted = MathThings.sortFromStoL(l1);


        System.out.println(Arrays.toString(sorted));
    }

}
