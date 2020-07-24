package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_status")
public class OrderStatus {

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * created_time
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * pay_time
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * deliver_time
     */
    @Column(name = "deliver_time")
    private Date deliverTime;

    /**
     * success_time
     */
    @Column(name = "success_time")
    private Date successTime;

    /**
     * close_time
     */
    @Column(name = "close_time")
    private Date closeTime;

    /**
     * comment_time
     */
    @Column(name = "comment_time")
    private Date commentTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}