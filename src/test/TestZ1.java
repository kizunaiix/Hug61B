package src.test;

import src.java.Poodle;
import java.util.List;
import org.junit.Test;
//import src.main.Box;

public class TestZ1 {

    @Test
    public void t1(){
        System.out.println("hello");
    }

    @Test
    public void t2(){
        Poodle p1 = new Poodle();
        p1.bark();
    }
}
