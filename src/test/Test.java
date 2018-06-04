package test;

import first.F_RotateArray;
import first.G_Fibonacci;

public class Test {
    public static void main(String[] args) {
        /*int[] array = {6,7,8,1,2,3,4,5};
        F_RotateArray f = new F_RotateArray();
        int i = f.minNumberInRotateArray(array);
        System.out.println(i);*/
        test1();

    }

    public static void test1(){
        G_Fibonacci g = new G_Fibonacci();
        for(int i=0; i<=10; i++){
            System.out.println(g.fibonacci(i));
        }

    }
}
