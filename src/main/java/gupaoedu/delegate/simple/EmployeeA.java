package gupaoedu.delegate.simple;

/**
 * 2019/5/27
 * wangyuwen
 */
public class EmployeeA implements Employee{
    @Override
    public void doing(String command) {
        System.out.println("我是A，我擅长"+command);
    }
}
