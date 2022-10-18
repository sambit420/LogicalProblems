package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number. \n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        perfectNo(n);
    }

    public static void perfectNo(int n) {
        int a = 0;
        for (int i = 1; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
                a += i;
            }
        }
        if ( n == a)
            System.out.println(n+" is a Perfect No.");
        else
            System.out.println(n+" is not a Perfect No.");
    }
}
