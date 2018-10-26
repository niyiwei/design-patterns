package simple;

/**
 * @author panhaidong
 * @date 2018/10/25 19:48
 */
public class Test {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println(cheesePizza);
    }
}
