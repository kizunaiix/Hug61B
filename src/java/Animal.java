package src.java;
/**这个Animal类实现了Animalistic接口。 */
public class Animal implements Animalistic {

    /**吃过的东西*/
    public String ateThings;


    /**初始化方法*/
    public Animal(){
        this.ateThings = "null";
    }

    /**
     * @param i :String ，要吃的东西
     * @return : print吃了什么
     */
    @Override
    public void eat(String i) {
        ateThings = i;
        System.out.println("ate " + ateThings);
    }

    /**get方法传入str i */
    @Override
    public String getAteThings() {
        return ateThings;
    }

}
