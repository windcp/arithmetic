package second;

public class B_PrintDigit {
    public void printToMaxOfNDigits(int n) {
//        int[] array=new int[n];
//        if(n <= 0)
//            return;
//        printArray(array, 0);

        long i = (long) Math.pow(10,n);
        for(int j=1;j<i;j++){
            System.out.println(j);
        }
    }

//    private void printArray(int[] array,int n) {
//        for(int i = 0; i < 10; i++) {
//            if(n != array.length) {
//                array[n] = i;
//                printArray(array, n+1);
//            } else {
//                boolean isFirstNo0 = false;
//                for(int j = 0; j < array.length; j++) {
//                    if(array[j] != 0) {
//                        System.out.print(array[j]);
//                        if(!isFirstNo0)
//                            isFirstNo0 = true;
//                    } else {
//                        if(isFirstNo0)
//                            System.out.print(array[j]);
//                    }
//                }
//                System.out.println();
//                return ;
//            }
//        }
//    }
}
