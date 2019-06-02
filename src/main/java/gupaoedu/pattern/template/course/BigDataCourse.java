package gupaoedu.pattern.template.course;

/**
 * 2019/5/29
 * wangyuwen
 */
public class BigDataCourse extends NetworkCourse {
    private boolean homeworkFlag = false;

    public BigDataCourse(boolean homeworkFlag){
        this.homeworkFlag = homeworkFlag;
    }
    void checkHomework(){
        System.out.println("检查大数据作业");
    }

    @Override
    protected boolean needHomework() {
        return this.homeworkFlag;
    }
}
