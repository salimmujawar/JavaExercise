package ControlFlow.ForLoop;

public class ForLoop {

    public static void main(String[] args) {
        int countPrime = 0;
        int sumOfMatches = 0;
        int countOfMatches = 0;
        for (int i =1; i<=1000; i++) {
            if ((i%3 == 0) && (i%5==0)) {
                sumOfMatches += i;
                System.out.println(i + " is divisible by 3 and 5");
                countOfMatches ++;
            }
            if (countOfMatches == 5){
                break;
            }
        }

        for (double i = 7.5; i <= 10; i+=0.25) {
            System.out.println("Amount: 100, Interest Rate: "+ i + ", Interest: "+  calculateInterest(100, i));
        }
        for (int i = 0; i <= 1000; i ++) {
            if (isPrime(i)) {
                System.out.println(i + " is " + " a Prime number");
                countPrime++;
                if (countPrime == 3) {
                    break;
                }
            }
        }
        countPrime = 0;
        for (int i = 0; countPrime < 3 && i <= 1000; i ++) {
            if (isPrime(i)) {
                System.out.println(i + " is " + " a Prime number");
                countPrime++;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
            return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor ++) {
            if ((wholeNumber % divisor) == 0) {
                return false;
            }
        }
        return true;
    }
}
