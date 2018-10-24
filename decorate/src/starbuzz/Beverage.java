package starbuzz;

/**
 * 饮料抽象类
 * @author panhaidong
 * @date 2018年06月07日20:50:00.
 */
public abstract class Beverage {
    //描述饮料
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    //抽象的价格方法，由子类的定价格
    public abstract double cost();
}
