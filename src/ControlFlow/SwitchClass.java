package ControlFlow;

public class SwitchClass {

    public void switchTest(int switchCase) {
          switch(switchCase) {
              case 1:
                  System.out.println("Case 1");
                  break;
              case 2:
                  System.out.println("Case 2");
                  break;
              case 3: case 4: case 5:
                  System.out.println("Case " + switchCase);
                  break;
              default:
                  System.out.println("Default");
          }
    }

    public void convertString(char ch) {
        switch (ch) {
            case 'A':
                System.out.println( "A is Able");
            case 'B':
                System.out.println( "B is Baker");
            case 'C':
                System.out.println( "C is Charlie");
            case 'D':
                System.out.println( "D is Dog");
            case 'E':
                System.out.println( "E is Easy");
            case 'F':
                System.out.println( "F is Fox");
            case 'G':
                System.out.println( "G is George");
            case 'H':
                System.out.println( "H is How");
            case 'I':
                System.out.println( "I is Item");
            case 'J':
                System.out.println( "J is Jig");
            case 'K':
                System.out.println( "K is King");
            case 'L':
                System.out.println( "L is Love");
            case 'M':
                System.out.println( "M is Mike");
            case 'N':
                System.out.println( "N is Nan");
            case 'O':
                System.out.println( "O is Oboe");
            case 'P':
                System.out.println( "P is Peter");
            case 'Q':
                System.out.println( "Q is Queen");
            case 'R':
                System.out.println( "R is Roger");
            case 'S':
                System.out.println( "S is Sugar");
            case 'T':
                System.out.println( "T is Tare");
            case 'U':
                System.out.println( "U is Uncle");
            case 'V':
                System.out.println( "V is Victor");
            case 'W':
                System.out.println( "W is William");
            case 'X':
                System.out.println( "X is X-ray");
            case 'Y':
                System.out.println( "Y is Yoke");
            case 'Z':
                System.out.println( "Z is Zebra");

        }
        System.out.println( "Default");
    }

    /*
        Enhanced Switch
     */
    public void printDayOfWeek (int day) {
        String dayOfWeek =  switch (day) {
            case 0 -> { yield  "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " is " + dayOfWeek);
    }

}
