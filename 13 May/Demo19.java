import java.util.Scanner;
public class Demo19 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your number ");
        int n = sc.nextInt();
         boolean isPrime = true;
        int i=2;
        while( i<=n){
            if(n % i == 0){
                isPrime = false;
                break;
            }
            if(isPrime){
                s=System.out.println("is prime");
            }
            else{
            System.out.println("is not Prime");
            }
    }
}
}