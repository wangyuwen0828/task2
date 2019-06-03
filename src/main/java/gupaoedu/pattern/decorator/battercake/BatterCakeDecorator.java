package gupaoedu.pattern.decorator.battercake;

/**
 * 2019/6/2
 * wangyuwen
 */
public class BatterCakeDecorator extends BatterCake {
    private BatterCake batterCake;
    public BatterCakeDecorator(BatterCake batterCake){
        this.batterCake = batterCake;
    }

    public String getMsg(){
        return batterCake.getMsg();
    }
    public int getPrice(){
        return batterCake.getPrice();
    }

}
