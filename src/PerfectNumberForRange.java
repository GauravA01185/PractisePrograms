import java.util.Scanner;

public class PerfectNumberForRange {
    public static void main(String[] args) {
        Scanner values=new Scanner(System.in);

        System.out.println("Enter second number");
        int ending_Range=values.nextInt();
        int sum=0;
        for(int i=1;i<=ending_Range/2;i++) {


            if (ending_Range%i == 0){
                sum = sum + i;
                System.out.println(sum);
                System.out.println("This is factorial" + i);

           }

        }
    }
}
