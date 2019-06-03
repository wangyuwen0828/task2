package gupaoedu.pattern.observer.guava.gperadvice;

import com.google.common.eventbus.EventBus;
import gupaoedu.pattern.observer.guava.GuavaEvent;

import java.util.Observable;

/**
 * 2019/6/3
 * wangyuwen
 */
public class Gper extends EventBus{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Gper生态圈";
    private static Gper gper = null;

    private Gper(){}

    public static Gper getInstance(){
        if(gper == null){
            gper = new Gper();
        }
        return gper;
    }

    public void post(Question question){
        System.out.println(question.getUsername()+"在"+this.name+"提了个问题");
        super.post(question);
    }
}
