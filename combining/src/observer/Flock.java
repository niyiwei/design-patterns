package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author panhaidong
 * @date 2018/11/5 20:40
 */
public class Flock implements Quackable {
    ArrayList<Quackable> ducks = new ArrayList();

    public void add(Quackable quacker) {
        ducks.add(quacker);
    }


    @Override
    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            iterator.next().registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}
