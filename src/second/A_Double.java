package second;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。不得使用库函数，不需要考虑大数问题
 */
public class A_Double {

    public double Power(double base, int exponent){
        double res = 0.0;
        if(equal(base,0)){
            return 0;
        }

        if (exponent == 0){
            return 1;
        }

        if(exponent < 0){
            res = mutiply(1/base,exponent);
        }else {
            res = mutiply(base,exponent);
        }

        return res;
    }

    private double mutiply(double base, int exponent) {
        double sum = 1.0;
        for (int i = 0; i<exponent; i++){
            sum *= base ;
        }
        return sum;
    }

    private boolean equal(double base1, double base2) {
        if(base1 - base2 < 0.0000001 && base1 - base2 > -0.0000001){
            return true;
        }else {
            return false;
        }
    }
}
