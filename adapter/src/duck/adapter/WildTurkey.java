package duck.adapter;

/**
 * @author panhaidong
 * @date 2018/10/26 07:54
 */
public class WildTurkey implements Trukey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
