package lesson6;

public class NewTestPalindrom {
    public static void main(String[]  args){
        String st = "3553";
        StringBuffer buffer = new StringBuffer(st);
        buffer.reverse();

        String palindrome = buffer.toString();
        if(st.equals(palindrome)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }
    }
}