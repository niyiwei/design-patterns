package starbuzz;

/**
 * Espresso子类
 * @auth panhaidong
 * @date 2018/6/7 20:58
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
