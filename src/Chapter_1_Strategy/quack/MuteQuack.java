package Chapter_1_Strategy.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
        //mute
    }
}
