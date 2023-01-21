package lesson12;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

public class DataFromFile {
    public static void main(String[] args) throws IOException{
        File file = new File("src/main/java/lesson12/data.txt");

        System.out.println();
        System.out.println("Data file list:");
        Map<Integer, String> users = new HashMap<>(getDataFromFile(file));

        System.out.println("----");
        System.out.println("ID searching:");
        String id = getDataById(users,3522);
        System.out.println(id);

        System.out.println("----");
        Integer integer = getNumberOfOccurrences(users,"Ivanov");
        System.out.println(integer);
    }
    public static Map<Integer, String> getDataFromFile(File dataFile) throws IOException {
        File file =  dataFile;
        Map<Integer, String> users = new HashMap<>();
        List<String> list = FileUtils.readLines(file, Charset.defaultCharset());
        list.forEach(System.out::println);

        for (String line : list) {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[0]);
            String lastName_name = split[1].trim();
            users.put(id, lastName_name);
        }
        return users;
    }

    public static String getDataById(Map<Integer, String> mapData, Integer id){
        Map<Integer, String> users = mapData;
        Integer num = id;
        String s = users.get(num);

        if(users.containsKey(num)){
            users.get(num);
        } else {
            System.out.println("This 'id' don't exist");
        }
        return s;
    }

    public static int getNumberOfOccurrences(Map<Integer, String> mapData, String lastName){
        Map<Integer, String> users = mapData;
        String lastName1 = lastName;
        int j =0;

        for (String i : users.values()) {
            if (i.contains(lastName1)){
                j++;
            }
        }
        return j;
    }
}
