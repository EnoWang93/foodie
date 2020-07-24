package com.yinuo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "order_status")
public class OrderStatus {
    /**
     * order_id
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * order_status
     */
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

    /**
     * 获取order_id
     *
     * @return order_id - order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置order_id
     *
     * @param orderId order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取order_status
     *
     * @return order_status - order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置order_status
     *
     * @param orderStatus order_status
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
     * 获取pay_time
     *
     * @return pay_time - pay_time
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置pay_time
     *
     * @param payTime pay_time
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取deliver_time
     *
     * @return deliver_time - deliver_time
     */
    public Date getDeliverTime() {
        return deliverTime;
    }

    /**
     * 设置deliver_time
     *
     * @param deliverTime deliver_time
     */
    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    /**
     * 获取success_time
     *
     * @return success_time - success_time
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置success_time
     *
     * @param successTime success_time
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取close_time
     *
     * @return close_time - close_time
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置close_time
     *
     * @param closeTime close_time
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取comment_time
     *
     * @return comment_time - comment_time
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 设置comment_time
     *
     * @param commentTime comment_time
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}