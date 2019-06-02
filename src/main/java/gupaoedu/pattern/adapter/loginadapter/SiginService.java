package gupaoedu.pattern.adapter.loginadapter;


/**
 * 2019/5/30
 * wangyuwen
 */
public class SiginService {
    public ResultMsg registe(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username,String password){
        return null;
    }
}
