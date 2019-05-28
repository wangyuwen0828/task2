package gupaoedu.delegate.journey;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019/5/28
 * wangyuwen
 */
public class JourneyStrategy {
    private static Map<String,JourneyWay> map = new HashMap<>();
    public static final String BY_BIKE = "byBike";
    public static final String BY_BUS = "byBus";
    public static final String BY_LEGS = "byLegs";
    public static final String DEFAULT = BY_BUS;

    static{
        map.put(BY_BIKE,new ByBike());
        map.put(BY_BUS,new ByBus());
        map.put(BY_LEGS,new ByLegs());
    }

    public static JourneyWay getWay(String way){
        System.out.println("我要出去旅行！！！");
        return map.get(way)!=null?map.get(way):map.get(DEFAULT);
    }
}
