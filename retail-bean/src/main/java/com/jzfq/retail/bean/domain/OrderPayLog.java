package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderPayLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.orders_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer ordersId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.orders_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String ordersSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.payment_code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String paymentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.payment_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String paymentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.pay_money
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private BigDecimal payMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.pay_integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer payIntegral;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.pay_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String paySn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.trade_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String tradeSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.member_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Integer memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.member_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private String memberName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_pay_log.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_pay_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.id
     *
     * @return the value of order_pay_log.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.id
     *
     * @param id the value for order_pay_log.id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.orders_id
     *
     * @return the value of order_pay_log.orders_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.orders_id
     *
     * @param ordersId the value for order_pay_log.orders_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.orders_sn
     *
     * @return the value of order_pay_log.orders_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getOrdersSn() {
        return ordersSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.orders_sn
     *
     * @param ordersSn the value for order_pay_log.orders_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setOrdersSn(String ordersSn) {
        this.ordersSn = ordersSn == null ? null : ordersSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.payment_code
     *
     * @return the value of order_pay_log.payment_code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.payment_code
     *
     * @param paymentCode the value for order_pay_log.payment_code
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.payment_name
     *
     * @return the value of order_pay_log.payment_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getPaymentName() {
        return paymentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.payment_name
     *
     * @param paymentName the value for order_pay_log.payment_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.pay_money
     *
     * @return the value of order_pay_log.pay_money
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.pay_money
     *
     * @param payMoney the value for order_pay_log.pay_money
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.pay_integral
     *
     * @return the value of order_pay_log.pay_integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getPayIntegral() {
        return payIntegral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.pay_integral
     *
     * @param payIntegral the value for order_pay_log.pay_integral
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPayIntegral(Integer payIntegral) {
        this.payIntegral = payIntegral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.pay_sn
     *
     * @return the value of order_pay_log.pay_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getPaySn() {
        return paySn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.pay_sn
     *
     * @param paySn the value for order_pay_log.pay_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setPaySn(String paySn) {
        this.paySn = paySn == null ? null : paySn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.trade_sn
     *
     * @return the value of order_pay_log.trade_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getTradeSn() {
        return tradeSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.trade_sn
     *
     * @param tradeSn the value for order_pay_log.trade_sn
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setTradeSn(String tradeSn) {
        this.tradeSn = tradeSn == null ? null : tradeSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.member_id
     *
     * @return the value of order_pay_log.member_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.member_id
     *
     * @param memberId the value for order_pay_log.member_id
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.member_name
     *
     * @return the value of order_pay_log.member_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.member_name
     *
     * @param memberName the value for order_pay_log.member_name
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_pay_log.create_time
     *
     * @return the value of order_pay_log.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_pay_log.create_time
     *
     * @param createTime the value for order_pay_log.create_time
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_pay_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderPayLog other = (OrderPayLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrdersId() == null ? other.getOrdersId() == null : this.getOrdersId().equals(other.getOrdersId()))
            && (this.getOrdersSn() == null ? other.getOrdersSn() == null : this.getOrdersSn().equals(other.getOrdersSn()))
            && (this.getPaymentCode() == null ? other.getPaymentCode() == null : this.getPaymentCode().equals(other.getPaymentCode()))
            && (this.getPaymentName() == null ? other.getPaymentName() == null : this.getPaymentName().equals(other.getPaymentName()))
            && (this.getPayMoney() == null ? other.getPayMoney() == null : this.getPayMoney().equals(other.getPayMoney()))
            && (this.getPayIntegral() == null ? other.getPayIntegral() == null : this.getPayIntegral().equals(other.getPayIntegral()))
            && (this.getPaySn() == null ? other.getPaySn() == null : this.getPaySn().equals(other.getPaySn()))
            && (this.getTradeSn() == null ? other.getTradeSn() == null : this.getTradeSn().equals(other.getTradeSn()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_pay_log
     *
     * @mbggenerated Wed Jun 27 16:29:15 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrdersId() == null) ? 0 : getOrdersId().hashCode());
        result = prime * result + ((getOrdersSn() == null) ? 0 : getOrdersSn().hashCode());
        result = prime * result + ((getPaymentCode() == null) ? 0 : getPaymentCode().hashCode());
        result = prime * result + ((getPaymentName() == null) ? 0 : getPaymentName().hashCode());
        result = prime * result + ((getPayMoney() == null) ? 0 : getPayMoney().hashCode());
        result = prime * result + ((getPayIntegral() == null) ? 0 : getPayIntegral().hashCode());
        result = prime * result + ((getPaySn() == null) ? 0 : getPaySn().hashCode());
        result = prime * result + ((getTradeSn() == null) ? 0 : getTradeSn().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}