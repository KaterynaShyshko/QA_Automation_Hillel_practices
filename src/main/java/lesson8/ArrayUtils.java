package lesson8;

import java.util.Random;

public class ArrayUtils {
    //метод, що добавляє елемент в кінець масиву int[]
    public static int[] addElementToArray(int[] array, int element){
        int [] rez = new int [array.length+1];
        for (int i=0; i< array.length; i++){
            rez [i]= array[i];
        }
        rez[rez.length-1]= element;
        return rez;
    }

    //метод, що добавляє елемент в початок массиву int[]
    public static int[] addElementToArrayBeginning(int[] array, int element){
        int[] addElement_Array = new int[array.length+1];
        int val = element;
        int j = 0;
        for(int i = 0; i <addElement_Array.length; i++) {
            if(i == 0) {
                addElement_Array[i] = val;
            } else {
                addElement_Array[i] = array[j];
                j++;
            }
        }
        return addElement_Array;
    }

    //метод, що вставляє елемент element в задану позицію position масиву int[]
    public static int[] insertElementInArray(int[] array, int element, int position){
        int[] insertElement_Array = new int[array.length+1];
        int val = element;
        int index = position;
        int j = 0;
        for(int i = 0; i <insertElement_Array.length; i++) {
            if(i == index) {
                insertElement_Array[i] = val;
            } else {
                insertElement_Array[i] = array[j];
                j++;
            }
        }
        return insertElement_Array;
    }

    //виводить на екран елементи array int[] з комами
    public static void printArray(int[] array) {
        if (array.length >= 1) {
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println();
        System.out.println();
    }

    //метод, що добавляє елемент в кінець масиву double[]
    public static double[] addElementToArray(double[] array, double element){
        double [] rez = new double[array.length+1];
        for (int i=0; i< array.length; i++){
            rez [i]= array[i];
        }
        rez[rez.length-1]= element;
        return rez;
    }

    //метод, що добавляє елемент в початок массиву double[]
    public static double[] addElementToArrayBeginning(double[] array, double element){
        double[] addElement_Array = new double[array.length+1];
        double val = element;
        int j = 0;
        for(int i = 0; i <addElement_Array.length; i++) {
            if(i == 0) {
                addElement_Array[i] = val;
            } else {
                addElement_Array[i] = array[j];
                j++;
            }
        }
        return addElement_Array;
    }

    //метод, що вставляє елемент element в задану позицію position масиву double[]
    public static double[] insertElementInArray(double[] array, double element, int position){
        double[] insertElement_Array = new double[array.length+1];
        double val = element;
        int index = position;
        int j = 0;
        for(int i = 0; i <insertElement_Array.length; i++) {
            if(i == index) {
                insertElement_Array[i] = val;
            } else {
                insertElement_Array[i] = array[j];
                j++;
            }
        }
        return insertElement_Array;
    }

    //виводить на екран елементи array double[] з комами
    public static void printArray(double[] array) {
        if (array.length >= 1) {
            System.out.print(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println();
        System.out.println();
    }

    //метод, що добавляє елемент в кінець String
    public static String addElementToString(String string, char element){
        char a = element;
        String str = string;

        String str2 = str + a;
        return str2;
    }

    //метод, що добавляє елемент в кінець String
    public static String addElementToStringBeginning(String string, char element){
        char a = element;
        String str = string;

        String str2 = a + str;
        return str2;
    }

    //метод, що добавляє елемент в середину String
    public static String insertElementInString(String string, char ch, int position) {
        String str = string;
        char a = ch;
        int pos = position;

        String str2 = str.substring(0, pos) + a + str.substring(pos);
        return str2;
    }


/////////////////////////////////////////////////////////////////////////методи, що створені на уроці
    public static int[] generateArray(int size, int min, int max) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(min, max + 1);
        }
        return result;
    }

    public static int[][] generateArray(int rows, int columns, int min, int max) {
        int[][] result = new int[rows][];
        for (int i = 0; i < result.length; i++){
            result[i] = generateArray(columns, min, max);
        }
        return result;
    }

    public static void printArray(String[] array) {
        for (String arrayElement : array) {
            System.out.print(arrayElement + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void printArray(String[][] array) {
        for (String[] row : array) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
