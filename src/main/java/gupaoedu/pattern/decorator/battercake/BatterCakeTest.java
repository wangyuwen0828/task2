package gupaoedu.pattern.decorator.battercake;

/**
 * 2019/6/2
 * wangyuwen
 */
public class BatterCakeTest {
    public static void main(String[] args) {
        BaseBatterCake baseBatterCake = new BaseBatterCake();
        EggBatterCakeDecorator eggBatterCakeDecorator = new EggBatterCakeDecorator(baseBatterCake);
        System.out.println(eggBatterCakeDecorator.getMsg());
        System.out.println(eggBatterCakeDecorator.getPrice());
    }
}
