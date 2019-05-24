package com.cuiyun.ddc.common.msg;

/**
 * @program: kfcoding-cloud
 * @description: list返回response
 * @author: maple
 * @create: 2018-08-02 17:13
 **/
public class ListRestResponse<T> extends BaseResponse{

    T result;
    int count;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int scount) {
        this.count = count;
    }

    public ListRestResponse count(int count) {
        this.setCount(count);
        return this;
    }

    public ListRestResponse count(Long count) {
        this.setCount(count.intValue());
        return this;
    }

    public ListRestResponse result(T result) {
        this.setResult(result);
        return this;
    }

}
