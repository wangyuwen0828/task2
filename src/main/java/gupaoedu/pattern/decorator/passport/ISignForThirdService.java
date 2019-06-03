package gupaoedu.pattern.decorator.passport;

/**
 * 2019/6/3
 * wangyuwen
 */
public interface ISignForThirdService extends ISignService{
    ResultMsg loginForQQ(String id);

    ResultMsg loginForWechat(String id);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String telphone,String code);

    ResultMsg loginForRegist(String username,String passport);
}
