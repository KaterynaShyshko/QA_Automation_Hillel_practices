package lesson9;

import java.util.Arrays;
import java.util.List;

public class CalculatorEnum {
        public static void main(String[] args){
            List<String> list = Arrays.asList("-5", "PluS", "-5");

            Double result = Double.valueOf(Calculate(list));
            String resultExpression= prepareResults(list,result);
            System.out.println(resultExpression);
        }

        public static Double Calculate(List<String> list) {
            String operand1 = String.valueOf(list.get(0));
            String operand2 = String.valueOf(list.get(2));
            double result = 0;
            Operations operations = Operations.valueOf(list.get(1).toUpperCase());

            Double op1 = Double.valueOf(operand1);
            Double op2 = Double.valueOf(operand2);

            switch (operations){
                case PLUS:
                    result = op1 + op2;
                    break;
                case MINUS:
                    result = op1 - op2;
                    break;
                case TIMES:
                    result = op1 * op2;
                    break;
                case REMAINDER_OF_DIVIDING:
                    if (op2 == 0) {
                        System.out.println("Can't divide % by 0!");
                    } else {
                        result = op1 % op2;
                    }
                    break;
                case DIVIDE:
                    if (op2 == 0) {
                        System.out.println("Can't divide by 0!");
                    } else {
                        result = op1 / op2;
                    }
                    break;
                default:
                 System.out.println("Invalid operator! Please, enter correct operator.");
                 break;
            }
            return result;
        }

        public enum Operations {
            PLUS,
            MINUS,
            TIMES,
            DIVIDE,
            REMAINDER_OF_DIVIDING;
        }
         public static String prepareResults(List<String> inputData, Double result){
             Operations operation = Operations.valueOf(inputData.get(1).toUpperCase());
             switch (operation){
                 case PLUS:
                     return Double.valueOf(inputData.get(0)) + "+" + Double.valueOf(inputData.get(2))+ "=" + result;
                 case MINUS:
                     return Double.valueOf(inputData.get(0)) + "-" + Double.valueOf(inputData.get(2))+ "=" + result;
                 case TIMES:
                     return Double.valueOf(inputData.get(0)) + "*" + Double.valueOf(inputData.get(2))+ "=" + result;
                 case REMAINDER_OF_DIVIDING:
                     return Double.valueOf(inputData.get(0)) + "%" + Double.valueOf(inputData.get(2))+ "=" + result;
                 case DIVIDE:
                     return Double.valueOf(inputData.get(0)) + "/" + Double.valueOf(inputData.get(2))+ "=" + result;
                 default:
                     return null;
             }
         }

}
