package Chapter_1_Strategy.duck;

import Chapter_1_Strategy.fly.FlyBehavior;
import Chapter_1_Strategy.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    void swim(){
        System.out.println("All ducks float, even decoys");
    }

    abstract void display();

}


