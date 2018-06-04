package first;

/**
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 *
 * 思路：递归的效率低，使用循环方式。
 */
public class G_Fibonacci {

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
