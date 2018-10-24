package customer;

/**
 * @author panhaidong
 * @date 2018/10/24 20:44
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
