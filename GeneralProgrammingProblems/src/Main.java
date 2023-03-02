import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executeTryWhileLoop();
    }

    public static void executeTryForLoop() {
        Scanner inputArrayLength = new Scanner(System.in);
        Scanner inputSumCondition = new Scanner(System.in);
        System.out.println("How many numbers?");
        int arrayLength= inputArrayLength.nextInt();
        //TODO: Factory Pattern
        TryForLoop loop=new TryForLoop(arrayLength);
        //TODO: Template Method Pattern
        loop.loopScan();
        loop.loopPrint();
        loop.loopSum();
        System.out.println("Sum of even or odd numbers?");
        String sumCondition = inputSumCondition.nextLine();
        loop.loopConditionalSum(sumCondition);
    }
    public static void executeTryWhileLoop() {
        Scanner inputArrayLength = new Scanner(System.in);
        Scanner inputSumCondition = new Scanner(System.in);
        System.out.println("How many numbers?");
        int arrayLength= inputArrayLength.nextInt();
        //TODO: Factory Pattern
        TryWhileLoop loop=new TryWhileLoop(arrayLength);
        //TODO: Template Method Pattern
        loop.loopScan();
        loop.loopPrint();
        loop.loopSum();
        System.out.println("Sum of even or odd numbers?");
        String sumCondition = inputSumCondition.nextLine();
        loop.loopConditionalSum(sumCondition);
    }
}