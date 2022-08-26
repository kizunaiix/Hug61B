package name.kiix;

public class MathThings {

    /**用普通方法实现的阶乘*/
    public static int jiecheng(int x){
        int sum = 1;

        while(x>1){
            sum = sum * x;
            x -= 1;
        }
        return sum;
    }

    /**用递归方法实现的阶乘*/
    public static int jiecheng_rec(int x){
        if (x == 1){
            return 1;
        }else {
            return x*jiecheng_rec(x - 1);
        }
    }

    /**用递归实现斐波那契数列计算*/
    public static int fibonacci_n(int n){
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return fibonacci_n(n - 1) + fibonacci_n(n - 2);
        }
    }
}
