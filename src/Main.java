public class Main {
    public static void main(String[] args) {
        Example1 example = new Example1();
        RaceConditionThread t1 = new RaceConditionThread(example);
        RaceConditionThread t2 = new RaceConditionThread(example);
        RaceConditionThread t3 = new RaceConditionThread(example);
        t1.start();
        t2.start();
        t3.start();
    }
}