package name.kiix;

import java.util.Arrays;
import java.util.List;

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

    /**用递归手写一个冒泡排序*/
    public static int[] sortFromStoL(int[] origin) {
        int[] varList = new int[origin.length];
        System.arraycopy(origin, 0, varList, 0, origin.length);

        for (int i = 0; i < varList.length - 1; i = i + 1) {
            if (varList[i] > varList[i + 1]) {
                int ex = varList[i];
                varList[i] = varList[i + 1];
                varList[i + 1] = ex;
            }
        }

        if(Arrays.equals(varList,origin)){
            return varList;
        }else{
            return sortFromStoL(varList);
        }
    }
}
