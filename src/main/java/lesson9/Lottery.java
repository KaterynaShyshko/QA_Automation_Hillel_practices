package lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 36; i++) {
            list.add(i+1);
        }
        System.out.println("Початкова послідовність чисел:");
        System.out.println(list);
        System.out.println();

        List<Integer> listLottery = new ArrayList<>();

        int numberOfElements = 6;

        for (int i = 0; i < numberOfElements; i++) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(list.size());
            int randomElement = list.get(randomIndex);
            listLottery.add(randomElement);
            list.remove(randomIndex);
            System.out.println(randomIndex +" index");
            System.out.println(randomElement+" number");
            System.out.println("Залишкова послідовність чисел:");
            System.out.println(list);
            System.out.println();
            System.out.println("Вибірка із 6 чисел:");
            System.out.println(listLottery);
            System.out.println();
        }
    }
}