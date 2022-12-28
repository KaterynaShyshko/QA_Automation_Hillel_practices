package lesson7;

public class SumOfRowsInArray {
    public static void main(String args[]){
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i =0; i < array.length; i++) {
            System.out.print("Рядок масиву: ");
            int[] row = array[i];
            sumRowArray (row);
        }

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


    public static void sumRowArray(int[] arraySumOfRow){
        int sumRow = 0;
        for (int j = 0; j < arraySumOfRow.length; j++){
            System.out.print(arraySumOfRow[j]+" ");
            sumRow = sumRow + arraySumOfRow[j];
        }
        System.out.println();
        System.out.println("Сума всіх чисел цього рядку: "+ sumRow);
        System.out.println();
    }

}




