package lesson6;

public class Palindrome {
        public static void main(String[] args) {

                String Str = "Кит На Морі Романтик", ReverseStr = "";
                String replaceString=Str.replaceAll(" ","");
                int StrLength = replaceString.length();

                for (int i = (StrLength - 1); i >= 0; i--) {
                        ReverseStr = ReverseStr + replaceString.charAt(i);
                }

                if (replaceString.toLowerCase().equals(ReverseStr.toLowerCase())) {
                        System.out.println(replaceString + " - Given String is palindrome");
                } else {
                        System.out.println(replaceString + " - Given String is not palindrome");
                }
        }
}


//case '/':
//       if ((operand1 > 0)&&(operand2 > 0)) {
//        result = operand1 / operand2;
//        System.out.println(operand1 + " / " + operand2 + " = " + result);
//        } else if ((operand1 < 0)&&(operand2 < 0)) {
 //       result = operand1 / operand2;
//       System.out.println(operand1 + " / " + operand2 + " = " + result);
 //       } else {
//        System.out.println("Can't divide by 0!");
 //       }
//        break;