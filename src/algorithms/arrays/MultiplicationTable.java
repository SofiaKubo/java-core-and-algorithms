package algorithms.arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                if (j < MULTIPLICATION_TABLE[i].length - 1) {
                    System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
                } else {
                    System.out.print(MULTIPLICATION_TABLE[i][j]);
                }
            }
            System.out.println();
        }
    }
}
