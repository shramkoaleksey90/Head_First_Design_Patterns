package Chapter_1_Strategy.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with a rocket");
    }
}
