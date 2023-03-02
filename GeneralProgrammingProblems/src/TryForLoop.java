import java.util.Scanner;

public class TryForLoop extends TryLoop{
    public TryForLoop(int end){
        super(end);
    }
    public void loopPrint(){
        System.out.println("output:");
        for (int i = getStart(); i < getEnd(); i=i+getIncrement()) {
            System.out.println(arrInt[i]);
        }
    }
    public void loopScan(){
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Give Input:");
        for (int i = getStart(); i < getEnd(); i=i+getIncrement()) {
            arrInt[i]=inputInt.nextInt();
        }
    }
    public void loopSum(){
        int sum=0;
        Scanner inputInt = new Scanner(System.in);
        for (int i = getStart(); i < getEnd(); i=i+getIncrement()) {
            sum+=arrInt[i];
        }
        System.out.println("Sum is: "+sum);
    }
    public void loopConditionalSum(String parameter){
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
