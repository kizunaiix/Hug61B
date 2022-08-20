package src.main.java;
/**
 * English extends Language
 * ，学习一下extend
 */
public class English extends Language {
    

    /**使用父类的无参数构造方法，是这么写的 */
    public English(){
        super();
    }

    /**
     * 这是有参数的构造方法，使用的super(i)即为父类的构造方法
     * @param i : 一个String
     */
    public English(String i){
        super(i);
    }

    /**这是English的speak方法*/
    @Override
    public void speak(){
        System.out.println("speaking english!");
    }

    /**这是English的talk方法*/
    public void talk(){
        System.out.println("talking , in english.");

    }
 
    
}
