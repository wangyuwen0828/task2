package gupaoedu.delegate.simple;

/**
 * 2019/5/27
 * wangyuwen
 */
public class EmployeeB implements Employee {
    @Override
    public void doing(String command) {
        System.out.println("我是B，我擅长"+command);
    }
}
