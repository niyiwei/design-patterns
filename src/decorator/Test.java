package decorator;

/**
 * 测试类
 * @auth panhaidong
 * @date 2018/6/7 21:25
 */
public class Test {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Whip(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + ", $" +beverage.cost());
    }
}
