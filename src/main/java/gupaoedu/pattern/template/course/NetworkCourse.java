package gupaoedu.pattern.template.course;

/**
 * 2019/5/29
 * wangyuwen
 */
public abstract class NetworkCourse  {
    protected final void createCourse(){
        this.postPreResource();
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postPreResource();
        if(needHomework()){
            checkHomework();
        }

    }
    abstract void checkHomework();

    protected boolean needHomework(){
        return false;
    }

    final void postSource(){
        System.out.println("提交源代码");
    }
    final void postNote(){
        System.out.println("提交课件和笔记");
    }
    final void liveVideo(){
        System.out.println("直播授课");
    }
    final void createPPT(){
        System.out.println("制作备课PPT");
    }
    final void postPreResource(){
        System.out.println("分发预习资料");
    }
}
