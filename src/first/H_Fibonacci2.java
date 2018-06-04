package first;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class H_Fibonacci2 {

    public long fibonacci(int n) {
        long result = 1;
        long preone = 0;
        long pretwo = 1;

        if(n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        for(int i=2; i<=n; i++){
            result = preone + pretwo;
            preone = pretwo;
            pretwo = result;
        }

        return result;
    }

}
