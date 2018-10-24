package customer;

/**
 * @author panhaidong
 * @date 2018/10/24 20:43
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObjeser(Observer o);

    public void notifyObservers();
}
