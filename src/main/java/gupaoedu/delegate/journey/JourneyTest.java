package gupaoedu.delegate.journey;

/**
 * 2019/5/28
 * wangyuwen
 */
public class JourneyTest {
    public static void main(String[] args) {
        JourneyWay journeyWay = JourneyStrategy.getWay(JourneyStrategy.BY_BIKE);
        journeyWay.way();
    }
}
