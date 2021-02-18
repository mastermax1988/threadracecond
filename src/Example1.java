
public class Example1 {
    private volatile boolean flag;
    public synchronized void setTrue() {
        flag = true;
        if(!flag) {
            System.out.println("Race Condition");
        }
    }
    public synchronized void setFalse()
    {
        flag = false;
        if (flag)
        {
            System.out.println("Race Condition");
        }
    }
}