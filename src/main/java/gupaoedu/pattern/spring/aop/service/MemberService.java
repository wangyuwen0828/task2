package gupaoedu.pattern.spring.aop.service;

import gupaoedu.pattern.adapter.loginadapter.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * 2019/6/4
 * wangyuwen
 */
@Service
@Slf4j
public class MemberService {


    public Member get(long id){
        log.info("getMemberById method . . .");
        return new Member();
    }

    public Member get(){
        log.info("getMember method . . .");
        return new Member();
    }

    public void save(Member member){
        log.info("save member method . . .");
    }

    public boolean delete(long id) throws Exception{
        log.info("delete method . . .");
        throw new Exception("spring aop ThrowAdvice演示");
    }
}
