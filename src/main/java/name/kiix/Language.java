package name.kiix;

/**
 * 这样是在注释Language类吗？
 * @author syd@qq.com
 * @talk no exist  
 * @speak 具有这个方法
 * @param iii:并没有这个参数
 */
public class Language {
    
    /**这个是无参数的构造方法 */
    public Language(){};
    
    /**
     * 这个是有参数的构造方法 
     * @param i :String
     */
    public Language(String i){
        System.out.println("构造的时候就会立马用这个方法！ " + i);   
    };

    /**瞎写着玩的 */
    public void shenmi(){
        System.out.println("shenmi");
    }
    
    /**
     * 这是language的方法speak
     * 会输出i can speak any language
     */
    public void speak(){
    
        System.out.println(" i can speak any language.");
    }
}
