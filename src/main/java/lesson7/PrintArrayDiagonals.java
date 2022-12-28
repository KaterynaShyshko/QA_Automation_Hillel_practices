package lesson7;

public class PrintArrayDiagonals {
    public static void main(String [] args) {
        int array [][]  = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        PrincipalDiagonal(array);
        SecondaryDiagonal(array);
    }

    public static void PrincipalDiagonal(int array[][]) {
        System.out.print("Головна діагональ: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }

    public static void SecondaryDiagonal(int array[][]) {
        System.out.print("Другорядна діагональ: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) == (array.length - 1)) {
                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
}
