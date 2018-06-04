package first;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 思路：2^(n-1)
 * 1 ：1
 * 2 : 1 + 1+ 1 - 1 = 4
 * 3 : 2 + 2 + 1 - 1 = 4
 * 4 : 4 + 4 + 1 - 1 = 8
 * ...
 */
public class I_Fibonacci3 {
    public int JumpFloor2(int target) {
        return (int) Math.pow(2,target-1);
    }
}
