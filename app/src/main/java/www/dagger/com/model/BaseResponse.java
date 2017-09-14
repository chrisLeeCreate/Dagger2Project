package www.dagger.com.model;

import java.io.Serializable;

/**
 * Created by xmren on 2017/8/7.
 */

public class BaseResponse<T> implements Serializable{
    private int status;
    private String msg;
    private T data;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
