package com.smujawar;

import ControlFlow.Switch.SwitchClass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SwitchClass switchClass = new SwitchClass();
        switchClass.switchTest(1);

        switchClass.convertString('N');
        switchClass.convertString('A');
        switchClass.convertString('T');
        switchClass.convertString('O');
        switchClass.printDayOfWeek(1);
    }
}
