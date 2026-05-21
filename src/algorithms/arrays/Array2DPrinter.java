package algorithms.arrays;

public class Array2DPrinter {
  public static void main(String[] args) {
    int[][] arr2d = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    char[][] arr = new char[10][10];

    print2DArray(arr2d);
    print2DArray(arr);
  }

  public static void print2DArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void print2DArray(char[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
