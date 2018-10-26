package duck.adapter;

/**
 * @author panhaidong
 * @date 2018/10/26 07:56
 */
public class TrukeyAdapter implements Duck {
    private Trukey trukey;

    public TrukeyAdapter(Trukey trukey) {
        this.trukey = trukey;
    }

    @Override
    public void quack() {
        trukey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            trukey.fly();
        }
    }
}
