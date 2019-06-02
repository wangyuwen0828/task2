package gupaoedu.pattern.adapter.loginadapter.v2;

import gupaoedu.pattern.adapter.loginadapter.ResultMsg;

/**
 * 2019/6/1
 * wangyuwen
 */
public class LoginForWechat implements LoginAdapter {
    public boolean support(Object adapter){
        return adapter instanceof LoginForWechat;
    }
    public ResultMsg login(String id, Object adapter){
        return null;
    }
}
