package gupaoedu.delegate.simple;

/**
 * 2019/5/27
 * wangyuwen
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Leader leader = new Leader();
        boss.command("加密",leader);
    }
}
