package decorator;

/**
 * Decaf Coffer子类
 * @auth panhaidong
 * @date 2018/6/7 20:58
 */
public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
