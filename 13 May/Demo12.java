//Accept two numbers n and mmm from the user and print the sum of numbers between n
and m
import java.util.Scanner;
public class Demo12 
{
    public static void main(String[] args)
     {
     
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n : " );

        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i<=n)
        {
            if( i % 2 != 0){
            sum+= i;
            }
            i++;
        }
            System.out.println("Sum of odd numbers up to " + n + " is: " + sum);
            
     }
}

