package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Orders {
    /**
     * id 同时也是订单编号
     */
    @Id
    private String id;

    /**
     * user_id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * recipient_name
     */
    @Column(name = "recipient_name")
    private String recipientName;

    /**
     * recipient_mobile
     */
    @Column(name = "recipient_mobile")
    private String recipientMobile;

    /**
     * recipient_address
     */
    @Column(name = "recipient_address")
    private String recipientAddress;

    /**
     * total_amount
     */
    @Column(name = "total_amount")
    private Integer totalAmount;

    /**
     * actual_pay_amount
     */
    @Column(name = "actual_pay_amount")
    private Integer actualPayAmount;

    /**
     * mail_amount
     */
    @Column(name = "mail_amount")
    private Integer mailAmount;

    /**
     * pay_method
     */
    @Column(name = "pay_method")
    private Integer payMethod;

    /**
     * left_msg
     */
    @Column(name = "left_msg")
    private String leftMsg;

    /**
     * extend
     */
    private String extend;

    /**
     * is_commented
     */
    @Column(name = "is_commented")
    private Integer isCommented;

    /**
     * is_deleted
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * created_time
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * updated_time
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取id 同时也是订单编号
     *
     * @return id - id 同时也是订单编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id 同时也是订单编号
     *
     * @param id id 同时也是订单编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取user_id
     *
     * @return user_id - user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置user_id
     *
     * @param userId user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取recipient_name
     *
     * @return recipient_name - recipient_name
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * 设置recipient_name
     *
     * @param recipientName recipient_name
     */
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * 获取recipient_mobile
     *
     * @return recipient_mobile - recipient_mobile
     */
    public String getRecipientMobile() {
        return recipientMobile;
    }

    /**
     * 设置recipient_mobile
     *
     * @param recipientMobile recipient_mobile
     */
    public void setRecipientMobile(String recipientMobile) {
        this.recipientMobile = recipientMobile;
    }

    /**
     * 获取recipient_address
     *
     * @return recipient_address - recipient_address
     */
    public String getRecipientAddress() {
        return recipientAddress;
    }

    /**
     * 设置recipient_address
     *
     * @param recipientAddress recipient_address
     */
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    /**
     * 获取total_amount
     *
     * @return total_amount - total_amount
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置total_amount
     *
     * @param totalAmount total_amount
     */
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 获取actual_pay_amount
     *
     * @return actual_pay_amount - actual_pay_amount
     */
    public Integer getActualPayAmount() {
        return actualPayAmount;
    }

    /**
     * 设置actual_pay_amount
     *
     * @param actualPayAmount actual_pay_amount
     */
    public void setActualPayAmount(Integer actualPayAmount) {
        this.actualPayAmount = actualPayAmount;
    }

    /**
     * 获取mail_amount
     *
     * @return mail_amount - mail_amount
     */
    public Integer getMailAmount() {
        return mailAmount;
    }

    /**
     * 设置mail_amount
     *
     * @param mailAmount mail_amount
     */
    public void setMailAmount(Integer mailAmount) {
        this.mailAmount = mailAmount;
    }

    /**
     * 获取pay_method
     *
     * @return pay_method - pay_method
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * 设置pay_method
     *
     * @param payMethod pay_method
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取left_msg
     *
     * @return left_msg - left_msg
     */
    public String getLeftMsg() {
        return leftMsg;
    }

    /**
     * 设置left_msg
     *
     * @param leftMsg left_msg
     */
    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg;
    }

    /**
     * 获取extend
     *
     * @return extend - extend
     */
    public String getExtend() {
        return extend;
    }

    /**
     * 设置extend
     *
     * @param extend extend
     */
    public void setExtend(String extend) {
        this.extend = extend;
    }

    /**
     * 获取is_commented
     *
     * @return is_commented - is_commented
     */
    public Integer getIsCommented() {
        return isCommented;
    }

    /**
     * 设置is_commented
     *
     * @param isCommented is_commented
     */
    public void setIsCommented(Integer isCommented) {
        this.isCommented = isCommented;
    }

    /**
     * 获取is_deleted
     *
     * @return is_deleted - is_deleted
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置is_deleted
     *
     * @param isDeleted is_deleted
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取created_time
     *
     * @return created_time - created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置created_time
     *
     * @param createdTime created_time
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取updated_time
     *
     * @return updated_time - updated_time
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置updated_time
     *
     * @param updatedTime updated_time
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}