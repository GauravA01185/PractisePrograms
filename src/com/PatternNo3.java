package com;

public class PatternNo3 {
    public static void main(String[] args) {
        /*

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
*/
        int numberOfRows=5;
        for (int rows = 1; rows <= numberOfRows; rows++) {
            for (int column = 1; column <=rows ; column++) {
                System.out.print(rows +" ");

            }
            System.out.println();
        }
    }
}
