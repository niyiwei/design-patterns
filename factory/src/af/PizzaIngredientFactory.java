package af;

/**
 * @author panhaidong
 * @date 2018/10/25 20:40
 */
public interface PizzaIngredientFactory {
    
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
