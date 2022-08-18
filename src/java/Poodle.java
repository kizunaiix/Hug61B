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

    /**
     * 这是一个泛型方法。
     * 给它看一个东西，它会说出自己看到了什么
     */
    public <things> void tellSeen(things x){
        System.out.println(x);
    }

}
