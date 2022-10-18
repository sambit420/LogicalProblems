package logicalPrograms;

import java.util.Scanner;

public class StopwatchSimulation {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter '1' to start stopwatch!");
    int watch = scanner.nextInt();
    long startMillis = System.currentTimeMillis();
    System.out.println("Stopwatch starts!");
    System.out.println("Stopwatch Started at "+startMillis);
    System.out.println("Enter '0' to stop stopwatch!");
    watch = scanner.nextInt();
    scanner.close();
    long stopMillis = System.currentTimeMillis();
    System.out.println("Stopwatch Stopped at "+stopMillis);
    elapseCount(startMillis, stopMillis);
}

    public static void elapseCount(long startMillis, long stopMillis) {
        double elapse = stopMillis - startMillis;
        double seconds = elapse / 1000;
        System.out.println("Time elapse in seconds = " + seconds);
    }

}
