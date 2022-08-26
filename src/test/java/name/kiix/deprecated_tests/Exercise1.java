package name.kiix.deprecated_tests;

import name.kiix.Animal;
import name.kiix.English;
import name.kiix.Language;

/**这次实现的是父类子类之间的继承 */
public class Exercise1 {
    public static void main(String[] args) {
    
        Animal cat;  //这句话和下面一句可以这样分开写
        cat = new Animal();  //同上
        cat.eat("boom");

        Language lan1 = new Language();
        Language eng1 = new English();  //父类声明，子类实例化。 这里体现了多态。
        
        lan1.speak();
        eng1.speak();
//         eng1.talk();    这行代码不能用，因为父类Language不会子类才有的talk

    }
}
