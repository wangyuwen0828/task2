package gupaoedu.delegate.journey;

/**
 * 2019/5/28
 * wangyuwen
 */
public class ByBike implements JourneyWay {
    @Override
    public void way() {
        System.out.println("我要去北京，我选择骑自行车");
    }
}
