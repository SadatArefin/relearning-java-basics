import java.util.Scanner;

public abstract class TryLoop {
    private int start;
    private int end;
    private int increment;
    protected int[] arrInt = new int[10000];
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
    public abstract void loopPrint();
    public abstract void loopScan();
    public abstract void loopSum();
    public abstract void loopConditionalSum(String parameter);
}
