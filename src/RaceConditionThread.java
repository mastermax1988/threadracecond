
public class RaceConditionThread extends Thread {
    Example1 example;
    RaceConditionThread(Example1 ex) {
        example = ex;
    }
    public void run() {
        while (true) {
            example.setTrue();
            example.setFalse();
        }
    }
}