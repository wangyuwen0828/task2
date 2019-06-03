package gupaoedu.pattern.decorator.battercake;

/**
 * 2019/6/2
 * wangyuwen
 */
public class EggBatterCakeDecorator extends BatterCakeDecorator {
    public EggBatterCakeDecorator(BatterCake batterCake){
        super(batterCake);
    }

    public String getMsg(){
        return super.getMsg()+"+一个鸡蛋";
    }
    public int getPrice(){
        return super.getPrice()+1;
    }
}
