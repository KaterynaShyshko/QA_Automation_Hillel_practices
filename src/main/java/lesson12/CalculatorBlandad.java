package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorBlandad {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/lesson12/file.txt");
        List<String> list = Arrays.asList("-5", "PluS", "-5");
        System.out.println();
        System.out.println(file.toURI());


        Float result = Calculate(list);
        String resultExpression= prepareResults(list,result);
        System.out.println(resultExpression);

        List<String> data = getDataFromFile("src/main/java/lesson12/file.txt");
        //  String data1 = String.valueOf(data);
        // Float result3 = Calculate(getDataFromFile(data1));
        //  String resultExpression3= prepareResults(getDataFromFile(data1),result3);
        //  System.out.println(resultExpression3);

        System.out.println(readFileWithOperation(file) +" " +"= our txt");
        System.out.println();
        System.out.println(data);
    }

    public static List<String> getDataFromFile(String relativeFilePath) throws IOException {
        File file = new File(relativeFilePath);
        List<String> list = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();
        return list;
    }

    public static String readFileWithOperation(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            stringBuffer.append((char) ch);
        }
        return stringBuffer.toString();
    }

    public static Float Calculate(List<String> list) {
        Float operand1 = Float.valueOf(list.get(0));
        Float operand2 = Float.valueOf(list.get(2));
        Operations operations = Operations.valueOf(list.get(1).toUpperCase());

        switch (operations){
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case TIMES:
                return operand1 * operand2;
            case REMAINDER_OF_DIVIDING:
                if (operand2 == 0) {
                    System.out.println("Can't divide % by 0!");
                    return null;
                } else {
                    return operand1 % operand2;
                }
            case DIVIDE:
                if (operand2 == 0) {
                    System.out.println("Can't divide by 0!");
                    return null;
                } else {
                    return operand1 / operand2;
                }
            default:
                System.out.println("Invalid operator! Please, enter correct operator.");
                break;
        }
        return null;
    }

    public enum Operations {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE,
        REMAINDER_OF_DIVIDING;
    }
    public static String prepareResults(List<String> inputData, Float result){
        Float operand1 = Float.valueOf(inputData.get(0));
        Float operand2 = Float.valueOf(inputData.get(2));
        Operations operation = Operations.valueOf(inputData.get(1).toUpperCase());
        switch (operation){
            case PLUS:
                return operand1 + "+" + operand2+ "=" + result;
            case MINUS:
                return operand1 + "-" + operand2+ "=" + result;
            case TIMES:
                return operand1 + "*" + operand2+ "=" + result;
            case REMAINDER_OF_DIVIDING:
                return operand1 + "%" + operand2+ "=" + result;
            case DIVIDE:
                return operand1 + "/" + operand2+ "=" + result;
            default:
                return null;
        }
    }
}
