
// Accept a number n from the user and display the sum of odd numbers up to n.
import java.util.Scanner;
public class Demo11 
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

