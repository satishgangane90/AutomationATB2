import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {

        boolean isLeapYear = false;

        System.out.println("Enter year");

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

            isLeapYear = true;

        }
        if (isLeapYear) {

            System.out.println(year + "is a leap year ");
        } else {

            System.out.println(year + " not  leap year");

        }


    }


}



