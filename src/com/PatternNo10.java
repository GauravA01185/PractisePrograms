package com;

public class PatternNo10 {
    public static void main(String[] args) {
        /*
           1
          1 2
         1 2 3
        1 2 3 4
       1 2 3 4 5

          */
        int numberOfRows=5;
        for (int rows = 1; rows <=numberOfRows ; rows++) {
            for (int space = numberOfRows-rows; space >0 ; space--) {
                System.out.print(" ");

            }
            for (int column = 1; column <=rows ; column++) {
                System.out.print(column+" ");

            }
            System.out.println();
        }





    }
}
