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

}
