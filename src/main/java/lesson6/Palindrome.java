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