package duck.adapter;

/**
 * @author panhaidong
 * @date 2018/10/26 07:48
 */
public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
