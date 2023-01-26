package ControlFlow.ReadUserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        checkMinMax();
    }

    public static void sumNumbers(){
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter number #" + count);
                sum += Integer.parseInt(scanner.nextLine());
                count ++;

            }catch (NumberFormatException invalidNum) {
                System.out.println("Invalid Number");
            }
        }while(count <= 5);
        System.out.println("Total sum is: " + sum);
    }

    public static void checkMinMax() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Enter a number to proceed, or enter any character to quit");
                num = Integer.parseInt(scanner.nextLine());
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }catch (NumberFormatException nfe) {
                break;
            }
        }
        System.out.println("Min: " + min + ", Max: " + max);

    }

}
