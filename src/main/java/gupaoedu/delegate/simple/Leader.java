package gupaoedu.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 2019/5/27
 * wangyuwen
 */
public class Leader implements Employee {
    private static Map<String,Employee> map = new HashMap<>();

    static {
        map.put("加密",new EmployeeA());
        map.put("架构",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        Employee employee = map.get(command);
        employee.doing(command);
    }
}
