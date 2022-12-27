import java.util.Scanner;

public class EvenNumberForRange {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter first number");
        int start_range=value.nextInt();
        System.out.println("Enter second number");
        int endRange=value.nextInt();
        for(int i=start_range;i<=endRange;i++){
            if (i%2==0){
                System.out.println("Even Number is "+i);
            }
            else{
                System.out.println("The Odd Number is "+i);
            }
        }
    }
}
