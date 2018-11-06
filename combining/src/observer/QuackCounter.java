package observer;


/**
 * @author panhaidong
 * @date 2018/11/5 20:25
 */
public class QuackCounter implements Quackable {
    static int numberOfQuacks;
    Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notify();
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}
