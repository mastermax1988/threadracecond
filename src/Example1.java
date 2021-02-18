
public class Example1 {
    private boolean flag;
    public void setTrue() {
        flag = true;
        if(!flag) {
            System.out.println("Race Condition");
        }
    }
    public void setFalse()
    {
        flag = false;
        if (flag)
        {
            System.out.println("Race Condition");
        }
    }
}