package starbuzz;

/**
 * @author panhaidong
 * @date 2018/10/25 07:17
 */
public class Test {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Milk(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + ", $" + darkRoast.cost());
    }
}
