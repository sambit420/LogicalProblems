package logicalPrograms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number.");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        //  By method - 1
        if (isPrime(n))
            System.out.println("The given no : "+n+" is a prime number.");
        else
            System.out.println("The given no : "+n+" is not a prime number.");
        //  By method - 2
        checkPrime(n);
    }
    //Method - 1
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Method - 2
    public static void checkPrime(int n)
    {
        boolean b=false;;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                b=true;
                break;
            }
        }
        if(n == 1 || n == 0)
            System.out.println(n+" is Not a Prime Number");
        else if (b == false)
            System.out.println(n+" is Prime Number");
        else
            System.out.println(n+" is Not a Prime Number");
    }
}
