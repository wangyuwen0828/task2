package gupaoedu.pattern.observer.guava.gperadvice;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 2019/6/3
 * wangyuwen
 */
public class Teacher {
    private String name;

    public Teacher(String name){
        this.name=name;
    }

    @Subscribe
    public void update(Question question){
        System.out.println("=====================");
        System.out.println(name+"老师，你好！\n"+
        "您收到一条来自"+Gper.getInstance().getName()+"的消息，消息内容是：\n"+question.getContent()+"\n"+
                "提问者："+question.getUsername());
    }
}
