import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        Scanner values = new Scanner(System.in);
        System.out.println("Enter  Number");
        int number=values.nextInt();
        if(number%2==0){
            System.out.println("Its even number");
        }
        else{
            System.out.println("Its odd number");
        }
    }
}
