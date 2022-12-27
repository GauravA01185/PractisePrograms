import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args){
        Scanner values=new Scanner(System.in);
        System.out.println("Enter number");
        int number1=values.nextInt();
        for(int i=1;i<=number1;i--){
            System.out.println("Infinite loop");
        }
    }
}
