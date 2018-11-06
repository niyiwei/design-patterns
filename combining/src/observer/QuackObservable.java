package observer;


/**
 * @author panhaidong
 * @date 2018/11/5 21:45
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();
}
