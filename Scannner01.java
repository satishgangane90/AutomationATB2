import java.util.Scanner;

//✅ How to Take Input from Users?	2

public class Scannner01 {

    public static void main(String[] args){

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        String name= Scanner.nextLine();

        System.out.println("Enter your age");

        int age= Scanner.nextInt();

        System.out.println("Your Name = "+ name + " your age = "+ age +"");






    }


}
