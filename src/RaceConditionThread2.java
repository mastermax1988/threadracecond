public class RaceConditionThread2 extends Thread
{
    Example2 example;
    RaceConditionThread2(Example2 ex) {
        example = ex;
    }
    public void run() {
        while (true) {
            System.out.println(example.increment());
        }
    }
}
