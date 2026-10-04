public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        IO.println("The Turkey says:");
        turkey.gobble();
        turkey.fly();

        IO.println("\nThe Duck says:");
        duck.quack();
        duck.fly();

        IO.println("\nThe TurkeyAdapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
