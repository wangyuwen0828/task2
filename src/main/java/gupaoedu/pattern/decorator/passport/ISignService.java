package gupaoedu.pattern.decorator.passport;

/**
 * 2019/6/3
 * wangyuwen
 */
public interface ISignService {
    ResultMsg regist(String username,String password);

    ResultMsg login(String username,String password);
}
