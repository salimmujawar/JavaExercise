package ControlFlow.WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

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
}
