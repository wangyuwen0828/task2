package gupaoedu.pattern.adapter.loginadapter.v2;

import gupaoedu.pattern.adapter.loginadapter.ResultMsg;

/**
 * 2019/6/1
 * wangyuwen
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
