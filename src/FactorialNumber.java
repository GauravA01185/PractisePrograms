import java.util.Scanner;
public class FactorialNumber{
    public static void main(String[] args){
        Scanner values=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=values.nextInt();
        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                System.out.println("The factorial of given number is "+i);
            }
        }

    }
}