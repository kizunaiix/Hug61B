package src.java;

/**Poodle是Dog的子类*/
public class Poodle extends Dog{


    public Poodle(){
        this.color = "poodleColor";
    }

    @Override
    public Dog maxDog(Dog d1, Dog d2) {
        System.out.println("Poodle triangle .");
        return d2;
    }


    @Override
    public void setColor(String color){
        this.color = "poodleColor is " + color;
    }

    @Override
    public String getColor() {
        return color;
    }

}
