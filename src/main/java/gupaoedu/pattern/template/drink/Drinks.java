package gupaoedu.pattern.template.drink;

/**
 * 2019/6/2
 * wangyuwen
 */
public abstract class Drinks {
    public final void makeDrinks(){
        powder();
        water();
        if (needOther()) {
            other();
        }
    }

    public final void powder(){
        System.out.println("加入粉末");
    }

    public final void water(){
        System.out.println("加入水");
    }

    public abstract void other();

    protected boolean needOther(){
        return false;
    }
}
