package Chapter_1_Strategy.duck;

import Chapter_1_Strategy.fly.FlyWithWings;
import Chapter_1_Strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior =  new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'am a real Mallard duck");
    }
}
