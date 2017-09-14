package www.dagger.com.model;

import java.io.Serializable;

/**
 * Created by lishaowei on 2017/9/5.
 */

public class ZKOrderResult implements Serializable {

    /**
     * order_id : 5102
     * order_no : 20170905131656701235
     * course_id : 339
     * type : 3
     * title : 哈哈哈很长很长很长很长很长的标题
     * location :
     * time : 2017-08-22 17:49:39~20:49:41
     * total_price : 0.10
     * teacher_name : 赵小东赵小东2
     */
    /**
     status	string	1:培优2:智康
     if_refund string  是否允许退费 （1 允许 0不允许）
     if_show_refund_schedule  string   是否显示退费进度（1是）
     reg_create_date string 报班时间

     */
    private String order_id;
    private String order_no;
    private String course_id;
    private String type;
    private String title;
    private String location;
    private String time;
    private String total_price;
    private String teacher_name;
    private String status;
    private String if_refund;
    private String if_show_refund_schedule;
    private String reg_create_date;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIf_refund() {
        return if_refund;
    }

    public void setIf_refund(String if_refund) {
        this.if_refund = if_refund;
    }

    public String getIf_show_refund_schedule() {
        return if_show_refund_schedule;
    }

    public void setIf_show_refund_schedule(String if_show_refund_schedule) {
        this.if_show_refund_schedule = if_show_refund_schedule;
    }

    public String getReg_create_date() {
        return reg_create_date;
    }

    public void setReg_create_date(String reg_create_date) {
        this.reg_create_date = reg_create_date;
    }

    @Override
    public String toString() {
        return "ZKOrderResult{" +
                "order_id='" + order_id + '\'' +
                ", order_no='" + order_no + '\'' +
                ", course_id='" + course_id + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", total_price='" + total_price + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                ", status='" + status + '\'' +
                ", if_refund='" + if_refund + '\'' +
                ", if_show_refund_schedule='" + if_show_refund_schedule + '\'' +
                ", reg_create_date='" + reg_create_date + '\'' +
                '}';
    }
}
