package Chapter_1_Strategy;

import Chapter_1_Strategy.duck.Duck;
import Chapter_1_Strategy.duck.MallardDuck;
import Chapter_1_Strategy.duck.ModelDuck;
import Chapter_1_Strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
