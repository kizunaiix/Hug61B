package src.java;
/**这个Animal类实现了Animalistic接口。 */
public class Animal implements Animalistic {
    public static void main(String[] args) {
        System.out.println("hello world");
        Animal pig = new Animal();
        pig.eat("things");

    }

    /**
     * try to make an override
     * 传入String i
     * 输出ate i
     * 在这里另起几行都没用的。
     * @param i :String ，要吃的东西
     * @return : print吃了什么
     */
    @Override
    public void eat(String i) {
        /**不试试怎么知道呢 */
        System.out.println("ate " + i);
        
    }

    /**get方法传入str i */
    @Override
    public void get(String i) {
        //not useful at all 
        
    }

}
