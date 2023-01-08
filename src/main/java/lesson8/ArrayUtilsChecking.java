package lesson8;

public class ArrayUtilsChecking {
    public static void main(String args[]) {

        int[] array1 = {1, 2, 3, 4, 5};

        double[] array2 = {1, 2.2, 3, 4.1, 5};

        System.out.println("Array int[]");
        ArrayUtils.printArray(array1);

        System.out.println("метод, що добавляє елемент в кінець масиву int[]");
        int [] rez0 = ArrayUtils.addElementToArray(array1,7);
        ArrayUtils.printArray(rez0);

        System.out.println("метод, що добавляє елемент в початок масиву int[]");
        int [] rez2 = ArrayUtils.addElementToArrayBeginning(array1,6);
        ArrayUtils.printArray(rez2);

        System.out.println("метод, що добавляє елемент в середину масиву int[]");
        int [] rez3 = ArrayUtils.insertElementInArray(array1,8,2);
        ArrayUtils.printArray(rez3);

        System.out.println("Array double[]");
        ArrayUtils.printArray(array2);

        System.out.println("метод, що добавляє елемент в кінець масиву double[]");
        double [] rez1= ArrayUtils.addElementToArray(array2,7.1);
        ArrayUtils.printArray(rez1);

        System.out.println("метод, що добавляє елемент в початок масиву double[]");
        double [] rez4= ArrayUtils.addElementToArrayBeginning(array2,6.8);
        ArrayUtils.printArray(rez4);

        System.out.println("метод, що добавляє елемент в середину масиву double[]");
        double [] rez5= ArrayUtils.insertElementInArray(array2,1.1,1);
        ArrayUtils.printArray(rez5);

        System.out.println("метод, що добавляє елемент в кінець String");
        String string1 = ArrayUtils.addElementToString("Kateryna", 's' );
        System.out.println(string1);
        System.out.println();

        System.out.println("метод, що добавляє елемент в початок String");
        String string2 = ArrayUtils.addElementToStringBeginning("РИМ", 'К' );
        System.out.println(string2);
        System.out.println();

        System.out.println("метод, що добавляє елемент в середину String");
        String string3 = ArrayUtils.insertElementInString("Olivia",'i', 5);
        System.out.println(string3);
        System.out.println();



    }

}
