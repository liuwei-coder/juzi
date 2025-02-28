package com.jzfq.retail.bean.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseApplyGoodsQuery {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public PurchaseApplyGoodsQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("purchaseApplyGoods.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("purchaseApplyGoods.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("purchaseApplyGoods.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("purchaseApplyGoods.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("purchaseApplyGoods.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("purchaseApplyGoods.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("purchaseApplyGoods.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseApplyGoods.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdIsNull() {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdIsNotNull() {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id =", value, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdNotEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id <>", value, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdGreaterThan(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id >", value, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id >=", value, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdLessThan(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id <", value, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id <=", value, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdIn(List<Integer> values) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id in", values, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdNotIn(List<Integer> values) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id not in", values, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id between", value1, value2, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseApplyOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseApplyGoods.purchase_apply_order_id not between", value1, value2, "purchaseApplyOrderId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdIsNull() {
            addCriterion("purchaseApplyGoods.product_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdIsNotNull() {
            addCriterion("purchaseApplyGoods.product_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id =", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdNotEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id <>", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdGreaterThan(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id >", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id >=", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdLessThan(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id <", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id <=", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdLike(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id like", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdNotLike(String value) {
            addCriterion("purchaseApplyGoods.product_goods_id not like", value, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdIn(List<String> values) {
            addCriterion("purchaseApplyGoods.product_goods_id in", values, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdNotIn(List<String> values) {
            addCriterion("purchaseApplyGoods.product_goods_id not in", values, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.product_goods_id between", value1, value2, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdNotBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.product_goods_id not between", value1, value2, "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("purchaseApplyGoods.product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("purchaseApplyGoods.product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("purchaseApplyGoods.product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("purchaseApplyGoods.product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("purchaseApplyGoods.product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("purchaseApplyGoods.product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("purchaseApplyGoods.product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("purchaseApplyGoods.product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIsNull() {
            addCriterion("purchaseApplyGoods.purchase_count is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIsNotNull() {
            addCriterion("purchaseApplyGoods.purchase_count is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_count =", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_count <>", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountGreaterThan(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_count >", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_count >=", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLessThan(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_count <", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseApplyGoods.purchase_count <=", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIn(List<Integer> values) {
            addCriterion("purchaseApplyGoods.purchase_count in", values, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotIn(List<Integer> values) {
            addCriterion("purchaseApplyGoods.purchase_count not in", values, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountBetween(Integer value1, Integer value2) {
            addCriterion("purchaseApplyGoods.purchase_count between", value1, value2, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseApplyGoods.purchase_count not between", value1, value2, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("purchaseApplyGoods.unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("purchaseApplyGoods.unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("purchaseApplyGoods.unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("purchaseApplyGoods.unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("purchaseApplyGoods.unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("purchaseApplyGoods.unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("purchaseApplyGoods.unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("purchaseApplyGoods.unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("purchaseApplyGoods.unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("purchaseApplyGoods.unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("purchaseApplyGoods.price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("purchaseApplyGoods.price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("purchaseApplyGoods.price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("purchaseApplyGoods.price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("purchaseApplyGoods.price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("purchaseApplyGoods.price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseApplyGoods.price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseApplyGoods.price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("purchaseApplyGoods.discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("purchaseApplyGoods.discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("purchaseApplyGoods.discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("purchaseApplyGoods.discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("purchaseApplyGoods.discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("purchaseApplyGoods.discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("purchaseApplyGoods.discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("purchaseApplyGoods.discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("purchaseApplyGoods.discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("purchaseApplyGoods.discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("purchaseApplyGoods.discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("purchaseApplyGoods.discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("purchaseApplyGoods.total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("purchaseApplyGoods.total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("purchaseApplyGoods.total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("purchaseApplyGoods.total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchaseApplyGoods.total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("purchaseApplyGoods.total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("purchaseApplyGoods.total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseApplyGoods.total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchaseApplyGoods.total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelIsNull() {
            addCriterion("purchaseApplyGoods.entry_personnel is null");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelIsNotNull() {
            addCriterion("purchaseApplyGoods.entry_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelEqualTo(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel =", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelNotEqualTo(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel <>", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelGreaterThan(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel >", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel >=", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelLessThan(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel <", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelLessThanOrEqualTo(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel <=", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelLike(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel like", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelNotLike(String value) {
            addCriterion("purchaseApplyGoods.entry_personnel not like", value, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelIn(List<String> values) {
            addCriterion("purchaseApplyGoods.entry_personnel in", values, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelNotIn(List<String> values) {
            addCriterion("purchaseApplyGoods.entry_personnel not in", values, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.entry_personnel between", value1, value2, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelNotBetween(String value1, String value2) {
            addCriterion("purchaseApplyGoods.entry_personnel not between", value1, value2, "entryPersonnel");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("purchaseApplyGoods.entry_time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("purchaseApplyGoods.entry_time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("purchaseApplyGoods.entry_time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("purchaseApplyGoods.entry_time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("purchaseApplyGoods.entry_time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchaseApplyGoods.entry_time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("purchaseApplyGoods.entry_time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchaseApplyGoods.entry_time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("purchaseApplyGoods.entry_time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("purchaseApplyGoods.entry_time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("purchaseApplyGoods.entry_time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchaseApplyGoods.entry_time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andProductGoodsIdLikeInsensitive(String value) {
            addCriterion("upper(purchaseApplyGoods.product_goods_id) like", value.toUpperCase(), "productGoodsId");
            return (Criteria) this;
        }

        public Criteria andProductNameLikeInsensitive(String value) {
            addCriterion("upper(purchaseApplyGoods.product_name) like", value.toUpperCase(), "productName");
            return (Criteria) this;
        }

        public Criteria andUnitLikeInsensitive(String value) {
            addCriterion("upper(purchaseApplyGoods.unit) like", value.toUpperCase(), "unit");
            return (Criteria) this;
        }

        public Criteria andEntryPersonnelLikeInsensitive(String value) {
            addCriterion("upper(purchaseApplyGoods.entry_personnel) like", value.toUpperCase(), "entryPersonnel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 02 14:45:23 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_apply_goods
     *
     * @mbggenerated Thu Aug 02 14:45:23 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}