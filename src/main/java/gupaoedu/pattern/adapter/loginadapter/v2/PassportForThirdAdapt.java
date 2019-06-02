package gupaoedu.pattern.adapter.loginadapter.v2;

import gupaoedu.pattern.adapter.loginadapter.ResultMsg;
import gupaoedu.pattern.adapter.loginadapter.SiginService;

import javax.xml.transform.Result;

/**
 * 2019/6/1
 * wangyuwen
 */
public class PassportForThirdAdapt extends SiginService implements IPassportForThird {
    public ResultMsg loginForQQ(String id){
        return processLogin(id,LoginforQQAdapter.class);
    }

    public ResultMsg loginForWechat(String id){
        return processLogin(id,LoginForWechat.class);
    }

    private ResultMsg processLogin(String id,Class<? extends LoginAdapter> clazz){

        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
