package Chapter_1_Strategy.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack-quack");
    }
}
