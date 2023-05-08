package Homework.day04;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        // Finding Three Num Average.

        int[] arr = new int[3];
        System.out.println("Enter number");
        for(int i = 0; i < arr.length; i++){
            int input = print.nextInt();
            arr[i] = input;
        }
        int numbersTotal = 0;
        for (int i = 0; i <arr.length;i++){
            numbersTotal += arr[i];
        }
        double average = (double)numbersTotal /3;
        System.out.println("Average : " + average);


    }


}
