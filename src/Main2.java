public class Main2
{
        public static void main(String[] args) {
        Example2 example = new Example2();
        RaceConditionThread2 t1 = new RaceConditionThread2(example);
        RaceConditionThread2 t2 = new RaceConditionThread2(example);
        RaceConditionThread2 t3 = new RaceConditionThread2(example);
        t1.start();
        t2.start();
        t3.start();
    }
}
