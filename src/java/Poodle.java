package src.java;

/**Poodle是Dog的子类*/
public class Poodle extends Dog{

    @Override
    public Dog maxDog(Dog d1, Dog d2) {
        System.out.println("Poodle triangle .");
        return d2;
    }

}
