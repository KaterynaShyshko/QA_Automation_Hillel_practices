package lesson7;

public class SumOfRowsInArrayNew {
    public static void main(String args[]){
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Масив: ");
        printArray(array);
        System.out.println();

        System.out.println("Результат обчислень, як одномірний масив: ");
        int [] ints= sumsInRows(array);
        printArrayNew(ints);
        System.out.println();

    }

    public static int[] sumsInRows(int[][] array){
        int [] result = new int [array.length];
        for (int i =0; i < array.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < array[i].length; j++){
                sumRow = sumRow + array[i][j];
                result[i]= sumRow;
            }
        }
        return result;
    }

    public static void printArray (int [][] arrayToPrint){
          for (int i = 0; i< arrayToPrint.length; i++){
              for (int j=0; j<arrayToPrint[i].length; j++){
              System.out.print(arrayToPrint[i][j] + " ");
              }
              System.out.println();
          }
    }
    public static void printArrayNew (int [] arrayNewToPrint){
        for (int i = 0; i< arrayNewToPrint.length; i++){
            System.out.print(arrayNewToPrint[i] + " ");
        }
        System.out.println();
    }
}


