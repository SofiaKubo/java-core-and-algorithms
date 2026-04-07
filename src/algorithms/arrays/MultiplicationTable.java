package algorithms.arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                if (j < multiplicationTable[i].length - 1) {
                    System.out.print(multiplicationTable[i][j] + " ");
                } else {
                    System.out.print(multiplicationTable[i][j]);
                }
            }
            System.out.println();
        }
    }
}
