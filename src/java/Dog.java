package src.java;


public class Dog extends Animal{

    protected String color = "default color";
    protected int weightInKg;

    
    public Dog maxDog(Dog d1, Dog d2){
        System.out.println("shanghai");
        return d2;
    }

    public void bark(){
        System.out.println("wang wang wang");
    }

    /**加个注释*/
    @Override
    public void eat(String i) {
        System.out.println("Dog eat " + i);
    }

    @Override
    public String getAteThings() {
        return ateThings;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("shining")){
            throw new RuntimeException("shining is not a color!");
        }
        this.color = color;
    }

}





