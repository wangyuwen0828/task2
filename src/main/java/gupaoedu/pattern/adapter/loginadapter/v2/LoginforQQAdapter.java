package gupaoedu.pattern.adapter.loginadapter.v2;

import gupaoedu.pattern.adapter.loginadapter.ResultMsg;

/**
 * 2019/6/1
 * wangyuwen
 */
public class LoginforQQAdapter implements LoginAdapter {
    public boolean support(Object adapter){
        return adapter instanceof LoginforQQAdapter;
    }
    public ResultMsg login(String id,Object adapter){
        return null;
    }
}
