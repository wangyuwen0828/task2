package gupaoedu.pattern.adapter.power;

/**
 * 2019/5/29
 * wangyuwen
 */
public class AC220V {
    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电"+output+"V");
        return output;
    }
}
