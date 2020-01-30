package com.company;

import java.util.Objects;

public class NWD {
    private int numberOne;
    private int numberTwo;

    NWD(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    int calculateNWD() {

        if ((numberOne == 0) && (numberTwo == 0)) {
            return 0;
        }
        if (numberOne == 0 || numberTwo == 0) {
            return numberOne + numberTwo;
        }
        int temp;
        while (numberOne % numberTwo != 0) {
            temp = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = temp;
        }
        return numberTwo;
    }

}
