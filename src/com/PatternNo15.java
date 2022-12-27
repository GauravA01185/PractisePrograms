package com;

public class PatternNo15 {
    public static void main(String[] args) {
        /*
           1
          2 2
         3 3 3
        4 4 4 4
       5 5 5 5 5


          */
        for (int rows = 1; rows <=5 ; rows++) {
            for (int space = 0; space <=rows ; space++) {
                System.out.print(" ");

            }

            for (int column = 5; column >=rows ; column--) {
                System.out.print("*" +" ");

            }
            System.out.println();

        }

    }
}
