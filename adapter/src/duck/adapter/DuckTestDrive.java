package duck.adapter;

/**
 * @author panhaidong
 * @date 2018/10/26 07:58
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Trukey trukey = new WildTurkey();
        Duck mallardDuck = new MallardDuck();

        Duck trukeyAdapter = new TrukeyAdapter(trukey);

        System.out.println("测试绿头鸭");
        testDuck(mallardDuck);
        System.out.println("\n\n");
        System.out.println("测试火鸡适配器");
        testDuck(trukeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
