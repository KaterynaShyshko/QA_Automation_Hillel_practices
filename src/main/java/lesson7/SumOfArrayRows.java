package lesson7;

public class SumOfArrayRows {
    public static void main(String args[]){
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i =0; i < array.length; i++) {
            int sumRow = 0;
            System.out.print("Рядок : ");
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+" ");
                sumRow = sumRow + array[i][j];
            }
            System.out.println();

        System.out.println("Сума елементів рядка: " + (i+1) +" => " + sumRow);
        System.out.println();
        }

        System.out.println();
        System.out.println("Результат обчислень, як одномірний масив: ");
        System.out.print("[ ");
        for (int i =0; i < array.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < array[i].length; j++){
                sumRow = sumRow + array[i][j];
            }
            System.out.print(sumRow+" ");
        }
        System.out.print("]");


    }
}