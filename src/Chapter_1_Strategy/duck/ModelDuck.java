package Chapter_1_Strategy.duck;

import Chapter_1_Strategy.fly.FlyNoWay;
import Chapter_1_Strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior =  new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
