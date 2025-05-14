//Accept a character and a range n, then display the next n characters
import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in) ;

       System.out.print("Enter Your Number: " );
       int n= sc.nextInt();

       System.out.print("Enter Your Character: " );
       char ch = sc.next().charAt(0);

       int start=(int)ch ;
       int end =start+n; 
       
        while(start <= end){
        System.out.println((char)start);
        start++; 
        } 
      }
    }
    

