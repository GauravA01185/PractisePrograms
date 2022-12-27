package com;

public class PatternNo5 {
    public static void main(String[] args) {
        /*

        1
        1 1
        1 1 1
        1 1 1 1
*/
        int k=1;
        for (int rows = 1; rows <=4; rows++) {
            for (int column = 1; column <=rows ; column++) {
                System.out.print("1 ");

            }
            System.out.println();
        }
    }
}
