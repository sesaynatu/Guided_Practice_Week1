import java.util.Scanner;

/*
Name: Taphanatu Sesay
Date: March 2026
Assignment: SDC230 Performance Assessment - Smallest Number
Description: This program asks the user how many integers they will enter,
then determines the smallest value using a loop.
*/

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Taphanatu Sesay - Week 2 PA Smallest Number");

        System.out.print("How many integers will you enter? ");
        int count = input.nextInt();

        int smallest = 0;

        for(int i = 1; i <= count; i++) {

            System.out.print("Enter integer #" + i + ": ");
            int number = input.nextInt();

            if(i == 1) {
                smallest = number;
            }
            else if(number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The smallest number entered is: " + smallest);

        input.close();
    }
}