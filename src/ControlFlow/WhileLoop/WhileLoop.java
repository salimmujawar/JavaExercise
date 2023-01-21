package ControlFlow.WhileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
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
}
