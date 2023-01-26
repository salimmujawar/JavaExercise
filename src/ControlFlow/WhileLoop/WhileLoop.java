package ControlFlow.WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
        System.out.println("For the digit 123, total sum is: "+ sumDigits(123));
        System.out.println("For the digit -123, total sum is: "+ sumDigits(-123));
        System.out.println("For the digit 4, total sum is: "+ sumDigits(4));
        System.out.println("For the digit 32123, total sum is: "+ sumDigits(32123));

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount ++;
                continue;
            }
            evenCount ++;
            System.out.println(number + " Is an even number");
            if (evenCount == 5) {
                break;
            }
        }
        System.out.println("Total odd num found " + oddCount);
        System.out.println("Total even num found " + evenCount);
    }

    public static boolean isEvenNumber(int num) {
        return (num%2 == 0) ? true : false;
    }

    public static int sumDigits(int number) {
        int digit = number;
        int sumOfDigits = 0;
        if (number < 0) {
            return -1;
        }

        while(true){
            sumOfDigits += number%10;
            number = number/10;
            if (number == 0) {
                break;
            }
        }
        return sumOfDigits;
    }

    public static boolean isPalindrome(int num) {
        int reverse  = 0;
        if (num < 0 ) {
            num *= -1;
        }
        int tmp = num;
        //extract last digit
        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;
            //Increase place value by 1
            reverse *= 10;
            //add last digit
            reverse += lastDigit;
            num = num / 10;
        }
        if (reverse == tmp) {
            return true;
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0 ) {
            return -1;
        }
        int lastDigit = num % 10;
        int firstDigit = 0;

        while ( num > 0) {
            firstDigit = num;
            num = num / 10;
        }

        return firstDigit + lastDigit;
    }
}
