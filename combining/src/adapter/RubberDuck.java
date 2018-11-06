package adapter;

/**
 * @author panhaidong
 * @date 2018/11/2 07:56
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
