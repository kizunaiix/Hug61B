package src.java;

import org.junit.Test;

public class Dog implements Animalistic{

    private String color = "default color";
    
    public Dog maxDog(Dog d1, Dog d2){
        System.out.println("meixianghao");
        return d2;
    }

    public void bark(){
        System.out.println("wang wang wang");
    }

    /**jiagezhushi*/
    @Override
    public void eat(String i) {
        System.out.println("Dog eat " + i);
    }

    @Override
    public void get(String i) {
        System.out.println("Dog get " + i);
    }

//    @Test
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}





