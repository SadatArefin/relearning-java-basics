import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executeTryLoop();
    }

    public static void executeTryLoop() {
        Scanner inputArrayLength = new Scanner(System.in);
        Scanner inputSumCondition = new Scanner(System.in);
        System.out.println("How many numbers?");
        int arrayLength= inputArrayLength.nextInt();
        TryLoop loop=new TryLoop(arrayLength);
        loop.forLoopScan();
        loop.forLoopPrint();
        loop.forLoopSum();
        System.out.println("Sum of even or odd numbers?");
        String sumCondition = inputSumCondition.nextLine();
        loop.forLoopConditionalSum(sumCondition);
    }
}