import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your number ");
        int n = sc.nextInt();
         
        int sum=0;
        int num = 0;
        int i=1;

        while( i<n){
            if(n % i == 0){
                sum +=i;
            }
            
           

            if(num== sum)
            {
                System.out.println( n  +  " is perfect ");
            }
            else
            {
            System.out.println(n  + " is not Perfect");
            }
    }
}
}