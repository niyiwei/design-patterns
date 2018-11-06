package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author panhaidong
 * @date 2018/11/5 20:40
 */
public class Flock implements Quackable {
    ArrayList<Quackable>quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }


    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            iterator.next().quack();
        }
    }
}
