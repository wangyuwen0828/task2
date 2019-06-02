package gupaoedu.pattern.adapter.loginadapter;

/**
 * 2019/5/30
 * wangyuwen
 */
public class SignForThirdService extends SiginService {
    public ResultMsg  loginForQQ(String openId){
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForPhone(String phone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String username,String password){
        super.registe(username,null);
        return super.login(username,null);
    }
}
