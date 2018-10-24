package starbuzz;

/**
 * Dark Roast Coffer子类
 * @auth panhaidong
 * @date 2018/6/7 20:58
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
