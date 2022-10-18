package logicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        System.out.println("how many random numbers do you\r\n" + "need to generate a distinct coupon number?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        int randomNum = 0;
        int arr[] = new int[size];
        Random coupon = new Random();
        boolean flag;

        for (int i = 0; i < size; i++)
        {
            randomNum = coupon.nextInt(20);
            flag = isPresent(arr, randomNum);
            if (flag != true)
            {
                arr[i] = randomNum;
            }
            else
            {
                --i;
            }
        }

        System.out.println("The random numbers generated are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static boolean isPresent(int[] arr, int randomNum) {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == randomNum)
            {
                return true;
            }
        }
        return false;
    }
}
