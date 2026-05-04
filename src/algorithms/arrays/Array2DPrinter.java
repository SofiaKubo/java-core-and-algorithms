package algorithms.arrays;

public class Array2DPrinter {
    public static void main(String[] args) {
        int[][] arr2d = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        print2dArray(arr2d);
    }

    public static void print2dArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) { // Первый цикл идет по строкам
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
