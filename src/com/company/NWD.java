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
        boolean condition = true;
        int biggerNumber;
        int smallerNumber;
        if (numberOne > numberTwo) {
            biggerNumber = numberOne;
            smallerNumber = numberTwo;
        } else {
            biggerNumber = numberTwo;
            smallerNumber = numberOne;
        }
        while (condition) {
            if (biggerNumber % smallerNumber == 0) {
                condition = false;
            } else {
                int temp = biggerNumber % smallerNumber;
                biggerNumber = smallerNumber;
                smallerNumber = temp;
            }
        }
        return smallerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NWD nwd = (NWD) o;
        return numberOne == nwd.numberOne &&
                numberTwo == nwd.numberTwo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOne, numberTwo);
    }

}
