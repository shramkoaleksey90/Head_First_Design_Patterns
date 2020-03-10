package Chapter_1_Strategy.duck;

import Chapter_1_Strategy.fly.FlyNoWay;
import Chapter_1_Strategy.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("A piece of rubber");
    }
}
