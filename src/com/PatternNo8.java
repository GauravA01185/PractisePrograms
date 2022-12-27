package com;

public class PatternNo8 {
    public static void main(String[] args) {
        /*
           *
          * *
         * * *
        * * * *
       * * * * *

          */
        int numberOfRows=5;
        for (int rows = 1; rows <=numberOfRows ; rows++) {
            for (int space = numberOfRows-rows; space >0 ; space--) {
                System.out.print(" ");

            }
            for (int column = 1; column <=rows ; column++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }





    }
}
