package gupaoedu.pattern.decorator.passport;

/**
 * 2019/5/30
 * wangyuwen
 */
public class ResultMsg {

    public ResultMsg(int code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private int code;
    private String msg;
    private Object data;

}
