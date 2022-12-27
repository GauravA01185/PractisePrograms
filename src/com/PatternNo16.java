package com;

public class PatternNo16 {
    public static void main(String[] args) {
        /*
           1
          2 2
         3 3 3
        4 4 4 4
       5 5 5 5 5


          */
        int numberOfRows=1;
        for (int rows = 5; rows >=1 ; rows--) {
            for (int space = 0; space <5 ; space++) {
                System.out.print(" ");

            }
            for (int column = 1; column <=5 ; column++) {
                System.out.print("*");

            }
            System.out.println();
        }

        }
}
