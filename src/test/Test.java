package test;

import first.F_RotateArray;
import first.G_Fibonacci;
import second.A_Double;
import second.B_PrintDigit;

public class Test {
    public static void main(String[] args) {
        /*int[] array = {6,7,8,1,2,3,4,5};
        F_RotateArray f = new F_RotateArray();
        int i = f.minNumberInRotateArray(array);
        System.out.println(i);*/
        test3();

    }

    public static void test3(){
        B_PrintDigit b = new B_PrintDigit();
        b.printToMaxOfNDigits(4);

    }

    public static void test2(){
        A_Double a = new A_Double();
        System.out.println(a.Power(2.5,2));

    }

    public static void test1(){
        G_Fibonacci g = new G_Fibonacci();
        for(int i=0; i<=10; i++){
            System.out.println(g.fibonacci(i));
        }

    }
}
