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
     * 吃点东西，并打印出来
     * @param i :String ，要吃的东西
     */
    @Override
    public void eat(String i) {
        ateThings = i;
        System.out.println("ate " + ateThings);
    }

    /**
     * 看看最近吃了什么
     * @return : 最近吃的东西
     */
    @Override
    public String getAteThings() {
        return ateThings;
    }



}
