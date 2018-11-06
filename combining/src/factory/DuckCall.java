package factory;

/**
 * @author panhaidong
 * @date 2018/11/2 07:56
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
