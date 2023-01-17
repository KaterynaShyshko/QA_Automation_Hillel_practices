package lesson12;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalculatorFile {
        public static void main(String[] args) throws IOException {
         //   File file = new File("C:/Users/Family/Desktop/Tast_Automation/Projects/QA_TestAutomation_14_11_22_unit1/src/main/java/lesson12/file1.txt");
          //  List<String> list = Arrays.asList("-5", "PluS", "-5");

            List<String> list1 = Arrays.asList("-5\n", "PluS\n", "-5");
            String str = list1.toString();
            writeWithBufferedWriter(str);

            List<String> data = getDataFromFile("src/main/java/lesson12/file1.txt");
            Float result3 = Calculate(getDataFromFile(data.toString()));
            String resultExpression3= prepareResults(getDataFromFile(data.toString()),result3);
            System.out.println(resultExpression3);

            System.out.println();
            System.out.println(data);
        }
    public static void writeWithBufferedWriter(String str) throws IOException {
        File file1 = new File("src/main/java/lesson12", "file1.txt");
        file1.createNewFile();

        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter  bufferedWriter = new BufferedWriter(fileWriter);
        for (Character ch: str.toCharArray()){
            bufferedWriter.append(ch);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }


    public static List<String> getDataFromFile(String relativeFilePath) throws IOException {
            File file = new File(relativeFilePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            int ch;
            while ((ch = bufferedReader.read()) != -1) {
                stringBuffer.append((char) ch);
            }
        List<String> list = Arrays.asList(stringBuffer.toString());

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

