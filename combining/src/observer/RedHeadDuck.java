package observer;


/**
 * @author panhaidong
 * @date 2018/11/2 07:55
 */
public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RedHead Duck";
    }
}
