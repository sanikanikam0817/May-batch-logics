
//Accept a number n from the user and display the sum of numb upto n
import java.util.Scanner;
public class Demo09 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Start Number : " );
        int i = sc.nextInt();
        System.out.println("Enter Your End Number : " );
        int n = sc.nextInt();
        int sum=0;

        while(i<=n)
        {
            sum+=i;
            System.out.println("sum:" + sum);
            i++;
        }
    }
      
      }