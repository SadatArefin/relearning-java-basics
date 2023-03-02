import java.util.Scanner;

public class TryLoop {
    private int start;
    private int end;
    private int increment;
    private final int[] arrInt = new int[10000];
    public void setStart(int start) {
        this.start = start;
    }
    public int getStart() {
        return start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getIncrement() {
        return increment;
    }
    public TryLoop(int end){
        setStart(0);
        setEnd(end);
        setIncrement(1);
    }
    public void forLoopPrint(){
        System.out.println("output:");
        for (int i = getStart(); i < getEnd(); i=i+getIncrement()) {
            System.out.println(arrInt[i]);
        }
    }
    public void forLoopScan(){
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Give Input:");
        for (int i = getStart(); i < getEnd(); i=i+getIncrement()) {
            arrInt[i]=inputInt.nextInt();
        }
    }
    public void forLoopSum(){
        int sum=0;
        Scanner inputInt = new Scanner(System.in);
        for (int i = getStart(); i < getEnd(); i=i+getIncrement()) {
            sum+=arrInt[i];
        }
        System.out.println("Sum is: "+sum);
    }
    public void forLoopConditionalSum(String parameter){
        int sum=0;
        Scanner inputInt = new Scanner(System.in);
        for (int i = getStart(); i < getEnd(); i=i+getIncrement()) {
            if (parameter.equalsIgnoreCase("odd")){
                if(arrInt[i]%2!=0){
                    sum+=arrInt[i];
                }
            }
            else if (parameter.equalsIgnoreCase("even")){
                if(arrInt[i]%2==0){
                    sum+=arrInt[i];
                }
            }

        }
        System.out.println("Sum is: "+sum);
    }
}
