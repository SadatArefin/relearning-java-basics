import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputArrayLength = new Scanner(System.in);
        int arrayLength= inputArrayLength.nextInt();
        TryLoop loop=new TryLoop(arrayLength);
        loop.forLoopScan();
        loop.forLoopPrint();
    }
}