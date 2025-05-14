import java.util.Scanner;
public class Demo06 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Start Number : " );
        int i = sc.nextInt();
        System.out.println("Enter Your End Number : " );
        int n = sc.nextInt();

        while(i<=n)
        {
            if(i % 2==0)
            System.out.println("i:" + i);
            i++;
        }
    }
      
      }

  
