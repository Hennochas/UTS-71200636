package com.rplbo.tocm;

public class Main {
    public static double FeetIncToCm(int inc) {
        if (inc > 0 || inc == 0) {
            double con1 = inc / 12;
            double con2 = inc % 12;
            System.out.println(inc + " inc = " + con1 + " feet " + con2 + " inc ");
            return FeetIncToCm(con1, con2);
        } else {
            return -1;
        }
    }

    public static double FeetIncToCm(double feet, double inc) {
        if (inc > 0 || inc == 0) {
            feet *= 12;
            inc += feet;
            inc *= 2.54;
            System.out.println("Nilai dalam Centimeter : " + inc);
            return inc;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        FeetIncToCm(1, 3);
        FeetIncToCm(30);
    }
}