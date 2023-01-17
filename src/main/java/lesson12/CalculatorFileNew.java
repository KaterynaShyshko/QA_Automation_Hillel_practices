package lesson12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CalculatorFileNew {
    public static void main(String[] args) throws IOException {

        FileWriter File = new FileWriter("src/main/java/lesson12/file1.txt");
        File.write("-5.44\n" + "PluS\n" + "5.66");
        File.close();

        List<String> dataList = getDataFromFileLines("src/main/java/lesson12/file1.txt");

        System.out.println();
        System.out.println("FileOperation" + " ==> " + dataList.get(0) + ", " + dataList.get(1) + ", " + dataList.get(2));

        Float result3 = Calculate(dataList);
        String resultExpression3= prepareResults(dataList,result3);
        System.out.println(resultExpression3);
    }

    public static List<String> getDataFromFileLines(String relativeFilePath) throws IOException {
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
        String operationSign = "";

        switch (operation) {
            case PLUS -> operationSign = "+";
            case MINUS -> operationSign = "-";
            case TIMES -> operationSign = "*";
            case REMAINDER_OF_DIVIDING -> operationSign = "%";
            case DIVIDE -> operationSign = "/";
        }
        return "Operation" + " ==> " + operand1 +" "+ operationSign +" "+ operand2 +" "+  "=" +" "+  result;
    }
}
