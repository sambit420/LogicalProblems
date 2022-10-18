package logicalPrograms;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse.");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        reverseNo(n);
    }

    public static void reverseNo(int n) {
        int rev = 0, rem = 0;
        while (n > 0)
        {
            rem = n % 10;
            rev = (rev * 10)+rem;
            n = n / 10;
        }
        System.out.println("Reverse of the above no is : "+rev);
    }
}
