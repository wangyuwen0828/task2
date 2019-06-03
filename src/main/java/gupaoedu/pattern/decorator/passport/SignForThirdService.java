package gupaoedu.pattern.decorator.passport;

/**
 * 2019/6/3
 * wangyuwen
 */
public class SignForThirdService implements ISignForThirdService {
    private ISignService iSignService;

    public SignForThirdService(ISignService iSignService){
        this.iSignService = iSignService;
    }
    public ResultMsg regist(String username,String password){
        return iSignService.regist(username,password);
    }

    public ResultMsg login(String username,String password){
        return iSignService.login(username,password);
    }

    public ResultMsg loginForQQ(String id){
        return null;
    }

    public ResultMsg loginForWechat(String id){
        return null;
    }

    public ResultMsg loginForToken(String token){
        return null;
    }
    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String username,String passport){
        return null;
    }
}

