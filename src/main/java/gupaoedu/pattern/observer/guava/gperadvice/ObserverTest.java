package gupaoedu.pattern.observer.guava.gperadvice;

import com.google.common.eventbus.EventBus;
import gupaoedu.pattern.observer.guava.GuavaEvent;

/**
 * 2019/6/3
 * wangyuwen
 */
public class ObserverTest {
    public static void main(String[] args) {
        Gper eventBus = Gper.getInstance();
        Teacher tom = new Teacher("tom");
        eventBus.register(tom);
        Question question = new Question();
        question.setUsername("小明");
        question.setContent("观察者模式适用于哪些场景？");
        eventBus.post(question);
    }
}
