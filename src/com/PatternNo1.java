package com;

public class PatternNo1 {
    public static void main(String[] args) {
        /*


         *
         * *
         * * *
         * * * *
         * * * * *





         */
        int numberOfRows=5;
        for (int rows = 1; rows <= numberOfRows; rows++) {
            for (int column = 1; column <=rows ; column++) {
                System.out.print("*" +" ");

            }
            System.out.println();
        }
    }
}
