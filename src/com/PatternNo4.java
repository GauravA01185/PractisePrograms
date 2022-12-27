package com;

public class PatternNo4 {
    public static void main(String[] args) {
        /*

        1
        2 3
        4 5 6
        7 8 9 10
*/
        int k=1;
        for (int rows = 1; rows <=4; rows++) {
            for (int column = 1; column <=rows ; column++) {
                System.out.print(k++ +" ");

            }
            System.out.println();
        }
    }
}
