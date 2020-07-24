package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Orders {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientMobile() {
        return recipientMobile;
    }

    public void setRecipientMobile(String recipientMobile) {
        this.recipientMobile = recipientMobile;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getActualPayAmount() {
        return actualPayAmount;
    }

    public void setActualPayAmount(Integer actualPayAmount) {
        this.actualPayAmount = actualPayAmount;
    }

    public Integer getMailAmount() {
        return mailAmount;
    }

    public void setMailAmount(Integer mailAmount) {
        this.mailAmount = mailAmount;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public String getLeftMsg() {
        return leftMsg;
    }

    public void setLeftMsg(String leftMsg) {
        this.leftMsg = leftMsg;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public Integer getIsCommented() {
        return isCommented;
    }

    public void setIsCommented(Integer isCommented) {
        this.isCommented = isCommented;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}