package name.kiix;

public class mainClass {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println(a1.ateThings);  //a1.ateThings是protected ，但是目前这个类和Animal在同一个包里面，所以可以用。
    }
}
