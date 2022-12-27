import java.util.Scanner;

public class MultiplicationWithoutUsingSymbol {
    public static void main(String[] args){
        Scanner values=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=values.nextInt();
        System.out.println("Enter second number");
        int number2=values.nextInt();
        int result=0;
        for(int i=1;i<=number1;i++){
            result=result+number2;

        }
        System.out.println("The multiplication of given number is "+result);
    }
}
