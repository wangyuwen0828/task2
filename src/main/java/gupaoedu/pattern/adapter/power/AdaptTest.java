package gupaoedu.pattern.adapter.power;

/**
 * 2019/5/29
 * wangyuwen
 */
public class AdaptTest {
    public static void main(String[] args) {
        AC220V ac220V = new AC220V();
        PowerAdapter powerAdapter = new PowerAdapter(ac220V);
        powerAdapter.outputDC5V();
    }
}
