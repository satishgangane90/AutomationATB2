public class FizzBuzz {

    public static void main(String[] args) {



        for( int c=1;c<100;c++) {


            if (c % 5 == 0 && c % 3 == 0) {
                System.out.println("FizzBuzz");

            } else if (c % 3 == 0) {

                System.out.println("Fizz");
            } else if (c % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(c);

            }


        }
    }
    }


