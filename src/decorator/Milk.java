package decorator;

/**
 * 牛奶装饰者类
 * @auth panhaidong
 * @date 2018/6/7 21:28
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Milk ";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
