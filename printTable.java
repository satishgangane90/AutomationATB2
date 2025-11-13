import java.util.Scanner;

public class printTable {

    public static void main(String[] args){

        Scanner Scanner = new Scanner(System.in);


        System.out.println("enter number");

        int i= Scanner.nextInt();

       int j;

        for(j=1;j<11;j++){

            System.out.println(i*j);


        }



    }

}
