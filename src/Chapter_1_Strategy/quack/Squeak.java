package Chapter_1_Strategy.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Rubber ducks squeak");
    }
}
