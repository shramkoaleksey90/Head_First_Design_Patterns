package Chapter_1_Strategy.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
