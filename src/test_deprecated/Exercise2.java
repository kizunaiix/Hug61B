
package src.test_deprecated;

import src.java.English;
import src.java.Language;

/**
 * 这个是想试一试构造方法的继承
 * 
 * 构造方法是不能继承的
 * 只能重写一个构造方法，再在里面用super写上父类的构造方法
 */
public class Exercise2 {
    public static void main(String[] args) {
        Language lan2 = new Language();
        Language lan3 = new Language("HelloWorld");
        English eng3 = new English("hello");


        lan2.shenmi();
        lan3.shenmi();
        eng3.shenmi();
    }
}
