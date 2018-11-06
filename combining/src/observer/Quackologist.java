package observer;

/**
 * @author panhaidong
 * @date 2018/11/5 22:00
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
