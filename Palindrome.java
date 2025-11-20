import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the String");

        String str = sc.nextLine();

        str = str.toLowerCase().replaceAll("\\s+", "");

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);

        }

        if (str.equals(reversed)) {

            System.out.println("string is plaindrome");

        } else {
            System.out.println("string is not palindrome");

        }


    }


}





