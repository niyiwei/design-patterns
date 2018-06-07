package decorator;

/**
 * Soy装饰者类
 * @auth panhaidong
 * @date 2018/6/7 21:30
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy ";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
