package starbuzz;

/**
 * House Blend Coffer子类
 * @auth panhaidong
 * @date 2018/6/7 20:58
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
