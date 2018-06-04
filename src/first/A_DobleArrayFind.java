package first;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class A_DobleArrayFind {

    public static void main(String[] args) {
        int [][] array = {{1,3,4},{2,5,6}};
        int num = 6;
        find(array,num);
    }

    public static boolean find(int[][] array, int num) {
        if (array==null||array.length==0||(array.length==1&&array[0].length==0)) {
            return false;
        }
        int row = array.length;

        for (int i = 0; i < row; i++) {
            int column = array[i].length;
            if (num <= array[i][column - 1] && num >= array[i][0]) {
                for (int j = 0; j < column; j++) {
                    if (num == array[i][j]) {
                        System.out.println("查询到数据:a["+i+"]["+j+"]="+num);
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
