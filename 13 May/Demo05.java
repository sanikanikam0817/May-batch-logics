import java.util.Scanner;
class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Start Number : " );
        int i = sc.nextInt();
        System.out.println("Enter Your End Number : " );
        int n = sc.nextInt();

        while(i>=n)
        {
            System.out.println("i:" + i);
            i--;
        }
    }
    }


