package lesson6;

public class Calculator {
    public static void main(String[] args){

        int operand1 = 6;
        int operand2 = 2;
        char operation = '-';
        int result;
        switch (operation) {

            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;

            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;

            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;

            case '%':
                if ((operand1 != 0)&&(operand2 != 0)) {
                    result = operand1 % operand2;
                    System.out.println(operand1 + " % " + operand2 + " = " + result);
                } else {
                    System.out.println("Can't divide % by 0!");
                }
                break;

            case '/':
                if ((operand1 != 0)&&(operand2 != 0)) {
                    result = operand1 / operand2;
                    System.out.println(operand1 + " / " + operand2 + " = " + result);
                } else {
                    System.out.println("Can't divide by 0!");
                }
                break;

            default:
                System.out.println("Invalid operator! Please, enter correct operator.");
                break;

        }

    }
}
