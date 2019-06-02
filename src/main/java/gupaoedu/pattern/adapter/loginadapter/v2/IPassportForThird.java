package gupaoedu.pattern.adapter.loginadapter.v2;

import gupaoedu.pattern.adapter.loginadapter.ResultMsg;

/**
 * 2019/6/1
 * wangyuwen
 */
public interface IPassportForThird {
    ResultMsg loginForQQ(String id);
    ResultMsg loginForWechat(String id);
}
