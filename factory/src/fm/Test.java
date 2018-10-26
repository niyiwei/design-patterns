package fm;

/**
 * @author panhaidong
 * @date 2018/10/25 20:06
 */
public class Test {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYStylePizzaStyle();
        Pizza pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza);
    }
}
