package com.jzfq.retail.bean.domain;

import java.io.Serializable;
import java.util.Date;

public class SellerLoginOpenIDRel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_login_openid_rel.id
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_login_openid_rel.login_permission_id
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    private Integer loginPermissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_login_openid_rel.openID
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    private String openid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_login_openid_rel.status
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_login_openid_rel.create_time
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_login_openid_rel.id
     *
     * @return the value of seller_login_openid_rel.id
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_login_openid_rel.id
     *
     * @param id the value for seller_login_openid_rel.id
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_login_openid_rel.login_permission_id
     *
     * @return the value of seller_login_openid_rel.login_permission_id
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public Integer getLoginPermissionId() {
        return loginPermissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_login_openid_rel.login_permission_id
     *
     * @param loginPermissionId the value for seller_login_openid_rel.login_permission_id
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setLoginPermissionId(Integer loginPermissionId) {
        this.loginPermissionId = loginPermissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_login_openid_rel.openID
     *
     * @return the value of seller_login_openid_rel.openID
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_login_openid_rel.openID
     *
     * @param openid the value for seller_login_openid_rel.openID
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_login_openid_rel.status
     *
     * @return the value of seller_login_openid_rel.status
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_login_openid_rel.status
     *
     * @param status the value for seller_login_openid_rel.status
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_login_openid_rel.create_time
     *
     * @return the value of seller_login_openid_rel.create_time
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_login_openid_rel.create_time
     *
     * @param createTime the value for seller_login_openid_rel.create_time
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
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
        SellerLoginOpenIDRel other = (SellerLoginOpenIDRel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginPermissionId() == null ? other.getLoginPermissionId() == null : this.getLoginPermissionId().equals(other.getLoginPermissionId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_login_openid_rel
     *
     * @mbggenerated Sat Jun 30 16:52:44 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginPermissionId() == null) ? 0 : getLoginPermissionId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}