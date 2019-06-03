package gupaoedu.pattern.decorator.passport;

/**
 * 2019/6/3
 * wangyuwen
 */
public class SignService implements ISignService {
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username,String password){
        return null;
    }
}
