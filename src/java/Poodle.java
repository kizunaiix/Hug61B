package src.java;

import org.junit.Test;

/**Poodle是Dog的子类*/
public class Poodle extends Dog{

    @Override
    public Dog maxDog(Dog d1, Dog d2) {
        System.out.println("Poodle xianghaole .");
        return d2;
    }

    @Test
    public void test2(){

    }

}
