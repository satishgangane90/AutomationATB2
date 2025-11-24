import java.util.Scanner;

public class VowelandConsonentsCunt {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int CVovel = 0;

        int CConsonent = 0;

        System.out.println("Enter the string");

       // String s = sc.nextLine();

        String s = sc.nextLine().toLowerCase();   // convert to lowercase


        int l = s.length();

        for (int i = 0; i < l; i++) {


            char ch = s.charAt(i);


            // check alphabet only
            if (ch >= 'a' && ch <= 'z'){

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

               CVovel++;

            } else

                 CConsonent++;

            }


        }

        System.out.println("No of vowels" + "" + CVovel);

        System.out.println("No of consonents" + "" + CConsonent);

    }

}
