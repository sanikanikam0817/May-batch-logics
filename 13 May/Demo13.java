//Print the multiplication table of a number using the * operator    
import java.util.Scanner;
public class Demo13 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
       
        int i=1;
        System.out.print(" Enter Your Number : " );
        int n = sc.nextInt();
        
        while( i<=10)
        {
        System.out.println(i*n);
        i++;
        }

    }
}