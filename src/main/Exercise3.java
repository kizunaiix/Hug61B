package src.main;

import src.java.Dog;
import src.java.Poodle;

/**子类继承的父类方法是用父类当参数的。想看看子类继承过了参数还是不是父类。
 * 因为该方法返回Dog类型 ，所以继承后的该方法还是返回Dog类型。
 */
public class Exercise3 {
    public static void main(String[] args) {
        Dog p1 = new Dog();
        Poodle p2 = new Poodle();
        Poodle p3 = (Poodle) p1.maxDog(p1,p2);  //注意这一句用到了cast ， cast能暂时把Dog都当做Poodle。(尽管Dog不总是Poodle)

        p2.maxDog(p1, p3);
        
        // Poodle p4 = (Poodle)new Dog();   ------>这样写会报错的！！！
        System.out.println(p1.getColor());
        p1.setColor("red");
        System.out.println(p1.getColor());

    }
}
