import java.util.Scanner;

public class TryWhileLoop extends TryLoop {

    public TryWhileLoop(int end) {
        super(end);
    }

    public void loopPrint() {
        System.out.println("output:");
        int i = getStart();
        while ( i < getEnd()) {
            System.out.println(arrInt[i]);
            i = i + getIncrement();
        }
    }

    public void loopScan() {
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Give Input:");
        int i = getStart();
        while ( i < getEnd()) {
            arrInt[i] = inputInt.nextInt();
            i = i + getIncrement();
        }
    }

    public void loopSum() {
        int sum = 0;
        Scanner inputInt = new Scanner(System.in);
        int i = getStart();
        while ( i < getEnd()) {
            sum += arrInt[i];
            i = i + getIncrement();
        }
        System.out.println("Sum is: " + sum);
    }

    public void loopConditionalSum(String parameter) {
        int sum = 0;
        Scanner inputInt = new Scanner(System.in);
        int i = getStart();
        while ( i < getEnd()) {
            if (parameter.equalsIgnoreCase("odd")) {
                if (arrInt[i] % 2 != 0) {
                    sum += arrInt[i];
                }
            } else if (parameter.equalsIgnoreCase("even")) {
                if (arrInt[i] % 2 == 0) {
                    sum += arrInt[i];
                }
            }
            i = i + getIncrement();
        }
        System.out.println("Sum is: " + sum);

    }
}