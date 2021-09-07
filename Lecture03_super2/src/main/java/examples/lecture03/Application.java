package examples.lecture03;

import java.util.Scanner;

public class Application {
    /*
        print "enter a number"
        `number` = read int from user
        if `number` mod 2 is 0  (this means its even)
            print: `number` is even
        otherwise
            print: `number` is odd
     */
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if( number % 2 == 0) {
            System.out.println(number + "is even");
        } else {
            System.out.println(number + "is odd");
        }
    }
}
