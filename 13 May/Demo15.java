//Calculate the factorial of a given number n
//factorial = 5*4*3*2*1
import java.util.Scanner;
class Demo15{

public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.print(" Enter Your Number : " );
        int n = sc.nextInt();
        int i = n;

        int fact=1;
        
        while( i>=1)
        {
         fact *= i;
         i--;
         
        }
        System.out.println( " Factorial of "+ n+" is "+fact);
}
}