package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class FCode implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_code.id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_code.seller_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Integer sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_code.code
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_code.valid_start_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Date validStartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column f_code.valid_end_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private Date validEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table f_code
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_code.id
     *
     * @return the value of f_code.id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_code.id
     *
     * @param id the value for f_code.id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_code.seller_id
     *
     * @return the value of f_code.seller_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_code.seller_id
     *
     * @param sellerId the value for f_code.seller_id
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_code.code
     *
     * @return the value of f_code.code
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_code.code
     *
     * @param code the value for f_code.code
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_code.valid_start_time
     *
     * @return the value of f_code.valid_start_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Date getValidStartTime() {
        return validStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_code.valid_start_time
     *
     * @param validStartTime the value for f_code.valid_start_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column f_code.valid_end_time
     *
     * @return the value of f_code.valid_end_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public Date getValidEndTime() {
        return validEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column f_code.valid_end_time
     *
     * @param validEndTime the value for f_code.valid_end_time
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_code
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
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
        FCode other = (FCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getValidStartTime() == null ? other.getValidStartTime() == null : this.getValidStartTime().equals(other.getValidStartTime()))
            && (this.getValidEndTime() == null ? other.getValidEndTime() == null : this.getValidEndTime().equals(other.getValidEndTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_code
     *
     * @mbggenerated Wed Aug 01 20:29:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getValidStartTime() == null) ? 0 : getValidStartTime().hashCode());
        result = prime * result + ((getValidEndTime() == null) ? 0 : getValidEndTime().hashCode());
        return result;
    }
}