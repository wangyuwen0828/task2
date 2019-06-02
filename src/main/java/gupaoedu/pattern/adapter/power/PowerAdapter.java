package gupaoedu.pattern.adapter.power;

/**
 * 2019/5/29
 * wangyuwen
 */
public class PowerAdapter implements DC5V {
    private AC220V ac220V;

    public PowerAdapter(AC220V ac220V){
        this.ac220V = ac220V;
    }

    public int outputDC5V(){
        int adaptInput = ac220V.outputAC220V();
        int adaptOutput = adaptInput/44;
        System.out.println("使用 PowerAdapter 输入 AC:"+adaptInput+"V"+"输出 DC:"+adaptOutput+"V");
        return adaptOutput;
    }
}
