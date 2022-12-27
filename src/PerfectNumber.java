import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = values.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Given number factorial is " + i);
                sum = sum + i;
            }
        }
        System.out.println(sum == number ? "Given number is perfect number" : "Given number is not perfect number");

    }
    }