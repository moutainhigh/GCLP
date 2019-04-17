package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MortgageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MortgageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeIsNull() {
            addCriterion("mortgagetype is null");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeIsNotNull() {
            addCriterion("mortgagetype is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeEqualTo(String value) {
            addCriterion("mortgagetype =", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotEqualTo(String value) {
            addCriterion("mortgagetype <>", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeGreaterThan(String value) {
            addCriterion("mortgagetype >", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagetype >=", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeLessThan(String value) {
            addCriterion("mortgagetype <", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeLessThanOrEqualTo(String value) {
            addCriterion("mortgagetype <=", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeLike(String value) {
            addCriterion("mortgagetype like", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotLike(String value) {
            addCriterion("mortgagetype not like", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeIn(List<String> values) {
            addCriterion("mortgagetype in", values, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotIn(List<String> values) {
            addCriterion("mortgagetype not in", values, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeBetween(String value1, String value2) {
            addCriterion("mortgagetype between", value1, value2, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotBetween(String value1, String value2) {
            addCriterion("mortgagetype not between", value1, value2, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andPropertyownerIsNull() {
            addCriterion("propertyowner is null");
            return (Criteria) this;
        }

        public Criteria andPropertyownerIsNotNull() {
            addCriterion("propertyowner is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyownerEqualTo(String value) {
            addCriterion("propertyowner =", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotEqualTo(String value) {
            addCriterion("propertyowner <>", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerGreaterThan(String value) {
            addCriterion("propertyowner >", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerGreaterThanOrEqualTo(String value) {
            addCriterion("propertyowner >=", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerLessThan(String value) {
            addCriterion("propertyowner <", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerLessThanOrEqualTo(String value) {
            addCriterion("propertyowner <=", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerLike(String value) {
            addCriterion("propertyowner like", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotLike(String value) {
            addCriterion("propertyowner not like", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerIn(List<String> values) {
            addCriterion("propertyowner in", values, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotIn(List<String> values) {
            addCriterion("propertyowner not in", values, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerBetween(String value1, String value2) {
            addCriterion("propertyowner between", value1, value2, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotBetween(String value1, String value2) {
            addCriterion("propertyowner not between", value1, value2, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceIsNull() {
            addCriterion("houseaddressprovince is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceIsNotNull() {
            addCriterion("houseaddressprovince is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceEqualTo(String value) {
            addCriterion("houseaddressprovince =", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceNotEqualTo(String value) {
            addCriterion("houseaddressprovince <>", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceGreaterThan(String value) {
            addCriterion("houseaddressprovince >", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddressprovince >=", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceLessThan(String value) {
            addCriterion("houseaddressprovince <", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceLessThanOrEqualTo(String value) {
            addCriterion("houseaddressprovince <=", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceLike(String value) {
            addCriterion("houseaddressprovince like", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceNotLike(String value) {
            addCriterion("houseaddressprovince not like", value, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceIn(List<String> values) {
            addCriterion("houseaddressprovince in", values, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceNotIn(List<String> values) {
            addCriterion("houseaddressprovince not in", values, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceBetween(String value1, String value2) {
            addCriterion("houseaddressprovince between", value1, value2, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddressprovinceNotBetween(String value1, String value2) {
            addCriterion("houseaddressprovince not between", value1, value2, "houseaddressprovince");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityIsNull() {
            addCriterion("houseaddresscity is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityIsNotNull() {
            addCriterion("houseaddresscity is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityEqualTo(String value) {
            addCriterion("houseaddresscity =", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityNotEqualTo(String value) {
            addCriterion("houseaddresscity <>", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityGreaterThan(String value) {
            addCriterion("houseaddresscity >", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddresscity >=", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityLessThan(String value) {
            addCriterion("houseaddresscity <", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityLessThanOrEqualTo(String value) {
            addCriterion("houseaddresscity <=", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityLike(String value) {
            addCriterion("houseaddresscity like", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityNotLike(String value) {
            addCriterion("houseaddresscity not like", value, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityIn(List<String> values) {
            addCriterion("houseaddresscity in", values, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityNotIn(List<String> values) {
            addCriterion("houseaddresscity not in", values, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityBetween(String value1, String value2) {
            addCriterion("houseaddresscity between", value1, value2, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddresscityNotBetween(String value1, String value2) {
            addCriterion("houseaddresscity not between", value1, value2, "houseaddresscity");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaIsNull() {
            addCriterion("houseaddressarea is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaIsNotNull() {
            addCriterion("houseaddressarea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaEqualTo(String value) {
            addCriterion("houseaddressarea =", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaNotEqualTo(String value) {
            addCriterion("houseaddressarea <>", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaGreaterThan(String value) {
            addCriterion("houseaddressarea >", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddressarea >=", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaLessThan(String value) {
            addCriterion("houseaddressarea <", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaLessThanOrEqualTo(String value) {
            addCriterion("houseaddressarea <=", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaLike(String value) {
            addCriterion("houseaddressarea like", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaNotLike(String value) {
            addCriterion("houseaddressarea not like", value, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaIn(List<String> values) {
            addCriterion("houseaddressarea in", values, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaNotIn(List<String> values) {
            addCriterion("houseaddressarea not in", values, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaBetween(String value1, String value2) {
            addCriterion("houseaddressarea between", value1, value2, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressareaNotBetween(String value1, String value2) {
            addCriterion("houseaddressarea not between", value1, value2, "houseaddressarea");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailIsNull() {
            addCriterion("houseaddressdetail is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailIsNotNull() {
            addCriterion("houseaddressdetail is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailEqualTo(String value) {
            addCriterion("houseaddressdetail =", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailNotEqualTo(String value) {
            addCriterion("houseaddressdetail <>", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailGreaterThan(String value) {
            addCriterion("houseaddressdetail >", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddressdetail >=", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailLessThan(String value) {
            addCriterion("houseaddressdetail <", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailLessThanOrEqualTo(String value) {
            addCriterion("houseaddressdetail <=", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailLike(String value) {
            addCriterion("houseaddressdetail like", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailNotLike(String value) {
            addCriterion("houseaddressdetail not like", value, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailIn(List<String> values) {
            addCriterion("houseaddressdetail in", values, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailNotIn(List<String> values) {
            addCriterion("houseaddressdetail not in", values, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailBetween(String value1, String value2) {
            addCriterion("houseaddressdetail between", value1, value2, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andHouseaddressdetailNotBetween(String value1, String value2) {
            addCriterion("houseaddressdetail not between", value1, value2, "houseaddressdetail");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("areaid like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("areaid not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andMartgagenameIsNull() {
            addCriterion("martgagename is null");
            return (Criteria) this;
        }

        public Criteria andMartgagenameIsNotNull() {
            addCriterion("martgagename is not null");
            return (Criteria) this;
        }

        public Criteria andMartgagenameEqualTo(String value) {
            addCriterion("martgagename =", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameNotEqualTo(String value) {
            addCriterion("martgagename <>", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameGreaterThan(String value) {
            addCriterion("martgagename >", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameGreaterThanOrEqualTo(String value) {
            addCriterion("martgagename >=", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameLessThan(String value) {
            addCriterion("martgagename <", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameLessThanOrEqualTo(String value) {
            addCriterion("martgagename <=", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameLike(String value) {
            addCriterion("martgagename like", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameNotLike(String value) {
            addCriterion("martgagename not like", value, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameIn(List<String> values) {
            addCriterion("martgagename in", values, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameNotIn(List<String> values) {
            addCriterion("martgagename not in", values, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameBetween(String value1, String value2) {
            addCriterion("martgagename between", value1, value2, "martgagename");
            return (Criteria) this;
        }

        public Criteria andMartgagenameNotBetween(String value1, String value2) {
            addCriterion("martgagename not between", value1, value2, "martgagename");
            return (Criteria) this;
        }

        public Criteria andFloorareaIsNull() {
            addCriterion("floorarea is null");
            return (Criteria) this;
        }

        public Criteria andFloorareaIsNotNull() {
            addCriterion("floorarea is not null");
            return (Criteria) this;
        }

        public Criteria andFloorareaEqualTo(String value) {
            addCriterion("floorarea =", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaNotEqualTo(String value) {
            addCriterion("floorarea <>", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaGreaterThan(String value) {
            addCriterion("floorarea >", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaGreaterThanOrEqualTo(String value) {
            addCriterion("floorarea >=", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaLessThan(String value) {
            addCriterion("floorarea <", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaLessThanOrEqualTo(String value) {
            addCriterion("floorarea <=", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaLike(String value) {
            addCriterion("floorarea like", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaNotLike(String value) {
            addCriterion("floorarea not like", value, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaIn(List<String> values) {
            addCriterion("floorarea in", values, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaNotIn(List<String> values) {
            addCriterion("floorarea not in", values, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaBetween(String value1, String value2) {
            addCriterion("floorarea between", value1, value2, "floorarea");
            return (Criteria) this;
        }

        public Criteria andFloorareaNotBetween(String value1, String value2) {
            addCriterion("floorarea not between", value1, value2, "floorarea");
            return (Criteria) this;
        }

        public Criteria andLanduseageIsNull() {
            addCriterion("landuseage is null");
            return (Criteria) this;
        }

        public Criteria andLanduseageIsNotNull() {
            addCriterion("landuseage is not null");
            return (Criteria) this;
        }

        public Criteria andLanduseageEqualTo(String value) {
            addCriterion("landuseage =", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageNotEqualTo(String value) {
            addCriterion("landuseage <>", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageGreaterThan(String value) {
            addCriterion("landuseage >", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageGreaterThanOrEqualTo(String value) {
            addCriterion("landuseage >=", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageLessThan(String value) {
            addCriterion("landuseage <", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageLessThanOrEqualTo(String value) {
            addCriterion("landuseage <=", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageLike(String value) {
            addCriterion("landuseage like", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageNotLike(String value) {
            addCriterion("landuseage not like", value, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageIn(List<String> values) {
            addCriterion("landuseage in", values, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageNotIn(List<String> values) {
            addCriterion("landuseage not in", values, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageBetween(String value1, String value2) {
            addCriterion("landuseage between", value1, value2, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseageNotBetween(String value1, String value2) {
            addCriterion("landuseage not between", value1, value2, "landuseage");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateIsNull() {
            addCriterion("landuseenddate is null");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateIsNotNull() {
            addCriterion("landuseenddate is not null");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateEqualTo(Date value) {
            addCriterion("landuseenddate =", value, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateNotEqualTo(Date value) {
            addCriterion("landuseenddate <>", value, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateGreaterThan(Date value) {
            addCriterion("landuseenddate >", value, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("landuseenddate >=", value, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateLessThan(Date value) {
            addCriterion("landuseenddate <", value, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateLessThanOrEqualTo(Date value) {
            addCriterion("landuseenddate <=", value, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateIn(List<Date> values) {
            addCriterion("landuseenddate in", values, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateNotIn(List<Date> values) {
            addCriterion("landuseenddate not in", values, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateBetween(Date value1, Date value2) {
            addCriterion("landuseenddate between", value1, value2, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLanduseenddateNotBetween(Date value1, Date value2) {
            addCriterion("landuseenddate not between", value1, value2, "landuseenddate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateIsNull() {
            addCriterion("landusestartdate is null");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateIsNotNull() {
            addCriterion("landusestartdate is not null");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateEqualTo(Date value) {
            addCriterion("landusestartdate =", value, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateNotEqualTo(Date value) {
            addCriterion("landusestartdate <>", value, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateGreaterThan(Date value) {
            addCriterion("landusestartdate >", value, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("landusestartdate >=", value, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateLessThan(Date value) {
            addCriterion("landusestartdate <", value, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateLessThanOrEqualTo(Date value) {
            addCriterion("landusestartdate <=", value, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateIn(List<Date> values) {
            addCriterion("landusestartdate in", values, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateNotIn(List<Date> values) {
            addCriterion("landusestartdate not in", values, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateBetween(Date value1, Date value2) {
            addCriterion("landusestartdate between", value1, value2, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andLandusestartdateNotBetween(Date value1, Date value2) {
            addCriterion("landusestartdate not between", value1, value2, "landusestartdate");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeIsNull() {
            addCriterion("mortgagefirsttype is null");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeIsNotNull() {
            addCriterion("mortgagefirsttype is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeEqualTo(String value) {
            addCriterion("mortgagefirsttype =", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeNotEqualTo(String value) {
            addCriterion("mortgagefirsttype <>", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeGreaterThan(String value) {
            addCriterion("mortgagefirsttype >", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagefirsttype >=", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeLessThan(String value) {
            addCriterion("mortgagefirsttype <", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeLessThanOrEqualTo(String value) {
            addCriterion("mortgagefirsttype <=", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeLike(String value) {
            addCriterion("mortgagefirsttype like", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeNotLike(String value) {
            addCriterion("mortgagefirsttype not like", value, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeIn(List<String> values) {
            addCriterion("mortgagefirsttype in", values, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeNotIn(List<String> values) {
            addCriterion("mortgagefirsttype not in", values, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeBetween(String value1, String value2) {
            addCriterion("mortgagefirsttype between", value1, value2, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagefirsttypeNotBetween(String value1, String value2) {
            addCriterion("mortgagefirsttype not between", value1, value2, "mortgagefirsttype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeIsNull() {
            addCriterion("mortgagesecondtype is null");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeIsNotNull() {
            addCriterion("mortgagesecondtype is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeEqualTo(String value) {
            addCriterion("mortgagesecondtype =", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeNotEqualTo(String value) {
            addCriterion("mortgagesecondtype <>", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeGreaterThan(String value) {
            addCriterion("mortgagesecondtype >", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagesecondtype >=", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeLessThan(String value) {
            addCriterion("mortgagesecondtype <", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeLessThanOrEqualTo(String value) {
            addCriterion("mortgagesecondtype <=", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeLike(String value) {
            addCriterion("mortgagesecondtype like", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeNotLike(String value) {
            addCriterion("mortgagesecondtype not like", value, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeIn(List<String> values) {
            addCriterion("mortgagesecondtype in", values, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeNotIn(List<String> values) {
            addCriterion("mortgagesecondtype not in", values, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeBetween(String value1, String value2) {
            addCriterion("mortgagesecondtype between", value1, value2, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andMortgagesecondtypeNotBetween(String value1, String value2) {
            addCriterion("mortgagesecondtype not between", value1, value2, "mortgagesecondtype");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeIsNull() {
            addCriterion("otherlandpurpose is null");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeIsNotNull() {
            addCriterion("otherlandpurpose is not null");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeEqualTo(String value) {
            addCriterion("otherlandpurpose =", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeNotEqualTo(String value) {
            addCriterion("otherlandpurpose <>", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeGreaterThan(String value) {
            addCriterion("otherlandpurpose >", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeGreaterThanOrEqualTo(String value) {
            addCriterion("otherlandpurpose >=", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeLessThan(String value) {
            addCriterion("otherlandpurpose <", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeLessThanOrEqualTo(String value) {
            addCriterion("otherlandpurpose <=", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeLike(String value) {
            addCriterion("otherlandpurpose like", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeNotLike(String value) {
            addCriterion("otherlandpurpose not like", value, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeIn(List<String> values) {
            addCriterion("otherlandpurpose in", values, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeNotIn(List<String> values) {
            addCriterion("otherlandpurpose not in", values, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeBetween(String value1, String value2) {
            addCriterion("otherlandpurpose between", value1, value2, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherlandpurposeNotBetween(String value1, String value2) {
            addCriterion("otherlandpurpose not between", value1, value2, "otherlandpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeIsNull() {
            addCriterion("landpurpose is null");
            return (Criteria) this;
        }

        public Criteria andLandpurposeIsNotNull() {
            addCriterion("landpurpose is not null");
            return (Criteria) this;
        }

        public Criteria andLandpurposeEqualTo(String value) {
            addCriterion("landpurpose =", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotEqualTo(String value) {
            addCriterion("landpurpose <>", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeGreaterThan(String value) {
            addCriterion("landpurpose >", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeGreaterThanOrEqualTo(String value) {
            addCriterion("landpurpose >=", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeLessThan(String value) {
            addCriterion("landpurpose <", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeLessThanOrEqualTo(String value) {
            addCriterion("landpurpose <=", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeLike(String value) {
            addCriterion("landpurpose like", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotLike(String value) {
            addCriterion("landpurpose not like", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeIn(List<String> values) {
            addCriterion("landpurpose in", values, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotIn(List<String> values) {
            addCriterion("landpurpose not in", values, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeBetween(String value1, String value2) {
            addCriterion("landpurpose between", value1, value2, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotBetween(String value1, String value2) {
            addCriterion("landpurpose not between", value1, value2, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeIsNull() {
            addCriterion("otherhousepurpose is null");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeIsNotNull() {
            addCriterion("otherhousepurpose is not null");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeEqualTo(String value) {
            addCriterion("otherhousepurpose =", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeNotEqualTo(String value) {
            addCriterion("otherhousepurpose <>", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeGreaterThan(String value) {
            addCriterion("otherhousepurpose >", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeGreaterThanOrEqualTo(String value) {
            addCriterion("otherhousepurpose >=", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeLessThan(String value) {
            addCriterion("otherhousepurpose <", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeLessThanOrEqualTo(String value) {
            addCriterion("otherhousepurpose <=", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeLike(String value) {
            addCriterion("otherhousepurpose like", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeNotLike(String value) {
            addCriterion("otherhousepurpose not like", value, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeIn(List<String> values) {
            addCriterion("otherhousepurpose in", values, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeNotIn(List<String> values) {
            addCriterion("otherhousepurpose not in", values, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeBetween(String value1, String value2) {
            addCriterion("otherhousepurpose between", value1, value2, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andOtherhousepurposeNotBetween(String value1, String value2) {
            addCriterion("otherhousepurpose not between", value1, value2, "otherhousepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeIsNull() {
            addCriterion("housepurpose is null");
            return (Criteria) this;
        }

        public Criteria andHousepurposeIsNotNull() {
            addCriterion("housepurpose is not null");
            return (Criteria) this;
        }

        public Criteria andHousepurposeEqualTo(String value) {
            addCriterion("housepurpose =", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeNotEqualTo(String value) {
            addCriterion("housepurpose <>", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeGreaterThan(String value) {
            addCriterion("housepurpose >", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeGreaterThanOrEqualTo(String value) {
            addCriterion("housepurpose >=", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeLessThan(String value) {
            addCriterion("housepurpose <", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeLessThanOrEqualTo(String value) {
            addCriterion("housepurpose <=", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeLike(String value) {
            addCriterion("housepurpose like", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeNotLike(String value) {
            addCriterion("housepurpose not like", value, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeIn(List<String> values) {
            addCriterion("housepurpose in", values, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeNotIn(List<String> values) {
            addCriterion("housepurpose not in", values, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeBetween(String value1, String value2) {
            addCriterion("housepurpose between", value1, value2, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andHousepurposeNotBetween(String value1, String value2) {
            addCriterion("housepurpose not between", value1, value2, "housepurpose");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNull() {
            addCriterion("registrationdate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIsNotNull() {
            addCriterion("registrationdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateEqualTo(Date value) {
            addCriterion("registrationdate =", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotEqualTo(Date value) {
            addCriterion("registrationdate <>", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThan(Date value) {
            addCriterion("registrationdate >", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registrationdate >=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThan(Date value) {
            addCriterion("registrationdate <", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateLessThanOrEqualTo(Date value) {
            addCriterion("registrationdate <=", value, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateIn(List<Date> values) {
            addCriterion("registrationdate in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotIn(List<Date> values) {
            addCriterion("registrationdate not in", values, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateBetween(Date value1, Date value2) {
            addCriterion("registrationdate between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andRegistrationdateNotBetween(Date value1, Date value2) {
            addCriterion("registrationdate not between", value1, value2, "registrationdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateIsNull() {
            addCriterion("housefinishdate is null");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateIsNotNull() {
            addCriterion("housefinishdate is not null");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateEqualTo(Date value) {
            addCriterion("housefinishdate =", value, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateNotEqualTo(Date value) {
            addCriterion("housefinishdate <>", value, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateGreaterThan(Date value) {
            addCriterion("housefinishdate >", value, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("housefinishdate >=", value, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateLessThan(Date value) {
            addCriterion("housefinishdate <", value, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateLessThanOrEqualTo(Date value) {
            addCriterion("housefinishdate <=", value, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateIn(List<Date> values) {
            addCriterion("housefinishdate in", values, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateNotIn(List<Date> values) {
            addCriterion("housefinishdate not in", values, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateBetween(Date value1, Date value2) {
            addCriterion("housefinishdate between", value1, value2, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andHousefinishdateNotBetween(Date value1, Date value2) {
            addCriterion("housefinishdate not between", value1, value2, "housefinishdate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateIsNull() {
            addCriterion("buyhousedate is null");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateIsNotNull() {
            addCriterion("buyhousedate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateEqualTo(Date value) {
            addCriterion("buyhousedate =", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateNotEqualTo(Date value) {
            addCriterion("buyhousedate <>", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateGreaterThan(Date value) {
            addCriterion("buyhousedate >", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateGreaterThanOrEqualTo(Date value) {
            addCriterion("buyhousedate >=", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateLessThan(Date value) {
            addCriterion("buyhousedate <", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateLessThanOrEqualTo(Date value) {
            addCriterion("buyhousedate <=", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateIn(List<Date> values) {
            addCriterion("buyhousedate in", values, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateNotIn(List<Date> values) {
            addCriterion("buyhousedate not in", values, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateBetween(Date value1, Date value2) {
            addCriterion("buyhousedate between", value1, value2, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateNotBetween(Date value1, Date value2) {
            addCriterion("buyhousedate not between", value1, value2, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andHouseageIsNull() {
            addCriterion("houseage is null");
            return (Criteria) this;
        }

        public Criteria andHouseageIsNotNull() {
            addCriterion("houseage is not null");
            return (Criteria) this;
        }

        public Criteria andHouseageEqualTo(String value) {
            addCriterion("houseage =", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageNotEqualTo(String value) {
            addCriterion("houseage <>", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageGreaterThan(String value) {
            addCriterion("houseage >", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageGreaterThanOrEqualTo(String value) {
            addCriterion("houseage >=", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageLessThan(String value) {
            addCriterion("houseage <", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageLessThanOrEqualTo(String value) {
            addCriterion("houseage <=", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageLike(String value) {
            addCriterion("houseage like", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageNotLike(String value) {
            addCriterion("houseage not like", value, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageIn(List<String> values) {
            addCriterion("houseage in", values, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageNotIn(List<String> values) {
            addCriterion("houseage not in", values, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageBetween(String value1, String value2) {
            addCriterion("houseage between", value1, value2, "houseage");
            return (Criteria) this;
        }

        public Criteria andHouseageNotBetween(String value1, String value2) {
            addCriterion("houseage not between", value1, value2, "houseage");
            return (Criteria) this;
        }

        public Criteria andLandpropertyIsNull() {
            addCriterion("landproperty is null");
            return (Criteria) this;
        }

        public Criteria andLandpropertyIsNotNull() {
            addCriterion("landproperty is not null");
            return (Criteria) this;
        }

        public Criteria andLandpropertyEqualTo(String value) {
            addCriterion("landproperty =", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotEqualTo(String value) {
            addCriterion("landproperty <>", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyGreaterThan(String value) {
            addCriterion("landproperty >", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("landproperty >=", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyLessThan(String value) {
            addCriterion("landproperty <", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyLessThanOrEqualTo(String value) {
            addCriterion("landproperty <=", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyLike(String value) {
            addCriterion("landproperty like", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotLike(String value) {
            addCriterion("landproperty not like", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyIn(List<String> values) {
            addCriterion("landproperty in", values, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotIn(List<String> values) {
            addCriterion("landproperty not in", values, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyBetween(String value1, String value2) {
            addCriterion("landproperty between", value1, value2, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotBetween(String value1, String value2) {
            addCriterion("landproperty not between", value1, value2, "landproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyIsNull() {
            addCriterion("houseproperty is null");
            return (Criteria) this;
        }

        public Criteria andHousepropertyIsNotNull() {
            addCriterion("houseproperty is not null");
            return (Criteria) this;
        }

        public Criteria andHousepropertyEqualTo(String value) {
            addCriterion("houseproperty =", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyNotEqualTo(String value) {
            addCriterion("houseproperty <>", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyGreaterThan(String value) {
            addCriterion("houseproperty >", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyGreaterThanOrEqualTo(String value) {
            addCriterion("houseproperty >=", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyLessThan(String value) {
            addCriterion("houseproperty <", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyLessThanOrEqualTo(String value) {
            addCriterion("houseproperty <=", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyLike(String value) {
            addCriterion("houseproperty like", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyNotLike(String value) {
            addCriterion("houseproperty not like", value, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyIn(List<String> values) {
            addCriterion("houseproperty in", values, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyNotIn(List<String> values) {
            addCriterion("houseproperty not in", values, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyBetween(String value1, String value2) {
            addCriterion("houseproperty between", value1, value2, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andHousepropertyNotBetween(String value1, String value2) {
            addCriterion("houseproperty not between", value1, value2, "houseproperty");
            return (Criteria) this;
        }

        public Criteria andPropertystateIsNull() {
            addCriterion("propertystate is null");
            return (Criteria) this;
        }

        public Criteria andPropertystateIsNotNull() {
            addCriterion("propertystate is not null");
            return (Criteria) this;
        }

        public Criteria andPropertystateEqualTo(String value) {
            addCriterion("propertystate =", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateNotEqualTo(String value) {
            addCriterion("propertystate <>", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateGreaterThan(String value) {
            addCriterion("propertystate >", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateGreaterThanOrEqualTo(String value) {
            addCriterion("propertystate >=", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateLessThan(String value) {
            addCriterion("propertystate <", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateLessThanOrEqualTo(String value) {
            addCriterion("propertystate <=", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateLike(String value) {
            addCriterion("propertystate like", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateNotLike(String value) {
            addCriterion("propertystate not like", value, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateIn(List<String> values) {
            addCriterion("propertystate in", values, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateNotIn(List<String> values) {
            addCriterion("propertystate not in", values, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateBetween(String value1, String value2) {
            addCriterion("propertystate between", value1, value2, "propertystate");
            return (Criteria) this;
        }

        public Criteria andPropertystateNotBetween(String value1, String value2) {
            addCriterion("propertystate not between", value1, value2, "propertystate");
            return (Criteria) this;
        }

        public Criteria andNousetimeIsNull() {
            addCriterion("nousetime is null");
            return (Criteria) this;
        }

        public Criteria andNousetimeIsNotNull() {
            addCriterion("nousetime is not null");
            return (Criteria) this;
        }

        public Criteria andNousetimeEqualTo(String value) {
            addCriterion("nousetime =", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeNotEqualTo(String value) {
            addCriterion("nousetime <>", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeGreaterThan(String value) {
            addCriterion("nousetime >", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeGreaterThanOrEqualTo(String value) {
            addCriterion("nousetime >=", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeLessThan(String value) {
            addCriterion("nousetime <", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeLessThanOrEqualTo(String value) {
            addCriterion("nousetime <=", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeLike(String value) {
            addCriterion("nousetime like", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeNotLike(String value) {
            addCriterion("nousetime not like", value, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeIn(List<String> values) {
            addCriterion("nousetime in", values, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeNotIn(List<String> values) {
            addCriterion("nousetime not in", values, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeBetween(String value1, String value2) {
            addCriterion("nousetime between", value1, value2, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNousetimeNotBetween(String value1, String value2) {
            addCriterion("nousetime not between", value1, value2, "nousetime");
            return (Criteria) this;
        }

        public Criteria andNouseareaIsNull() {
            addCriterion("nousearea is null");
            return (Criteria) this;
        }

        public Criteria andNouseareaIsNotNull() {
            addCriterion("nousearea is not null");
            return (Criteria) this;
        }

        public Criteria andNouseareaEqualTo(String value) {
            addCriterion("nousearea =", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaNotEqualTo(String value) {
            addCriterion("nousearea <>", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaGreaterThan(String value) {
            addCriterion("nousearea >", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaGreaterThanOrEqualTo(String value) {
            addCriterion("nousearea >=", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaLessThan(String value) {
            addCriterion("nousearea <", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaLessThanOrEqualTo(String value) {
            addCriterion("nousearea <=", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaLike(String value) {
            addCriterion("nousearea like", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaNotLike(String value) {
            addCriterion("nousearea not like", value, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaIn(List<String> values) {
            addCriterion("nousearea in", values, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaNotIn(List<String> values) {
            addCriterion("nousearea not in", values, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaBetween(String value1, String value2) {
            addCriterion("nousearea between", value1, value2, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNouseareaNotBetween(String value1, String value2) {
            addCriterion("nousearea not between", value1, value2, "nousearea");
            return (Criteria) this;
        }

        public Criteria andNetreportamountIsNull() {
            addCriterion("netreportamount is null");
            return (Criteria) this;
        }

        public Criteria andNetreportamountIsNotNull() {
            addCriterion("netreportamount is not null");
            return (Criteria) this;
        }

        public Criteria andNetreportamountEqualTo(BigDecimal value) {
            addCriterion("netreportamount =", value, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountNotEqualTo(BigDecimal value) {
            addCriterion("netreportamount <>", value, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountGreaterThan(BigDecimal value) {
            addCriterion("netreportamount >", value, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("netreportamount >=", value, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountLessThan(BigDecimal value) {
            addCriterion("netreportamount <", value, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("netreportamount <=", value, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountIn(List<BigDecimal> values) {
            addCriterion("netreportamount in", values, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountNotIn(List<BigDecimal> values) {
            addCriterion("netreportamount not in", values, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netreportamount between", value1, value2, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netreportamount not between", value1, value2, "netreportamount");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceIsNull() {
            addCriterion("netreportprice is null");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceIsNotNull() {
            addCriterion("netreportprice is not null");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceEqualTo(BigDecimal value) {
            addCriterion("netreportprice =", value, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceNotEqualTo(BigDecimal value) {
            addCriterion("netreportprice <>", value, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceGreaterThan(BigDecimal value) {
            addCriterion("netreportprice >", value, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("netreportprice >=", value, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceLessThan(BigDecimal value) {
            addCriterion("netreportprice <", value, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("netreportprice <=", value, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceIn(List<BigDecimal> values) {
            addCriterion("netreportprice in", values, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceNotIn(List<BigDecimal> values) {
            addCriterion("netreportprice not in", values, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netreportprice between", value1, value2, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andNetreportpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netreportprice not between", value1, value2, "netreportprice");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(String value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(String value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(String value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(String value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(String value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(String value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLike(String value) {
            addCriterion("workid like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotLike(String value) {
            addCriterion("workid not like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<String> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<String> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(String value1, String value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(String value1, String value2) {
            addCriterion("workid not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgIsNull() {
            addCriterion("housesoloflg is null");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgIsNotNull() {
            addCriterion("housesoloflg is not null");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgEqualTo(String value) {
            addCriterion("housesoloflg =", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgNotEqualTo(String value) {
            addCriterion("housesoloflg <>", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgGreaterThan(String value) {
            addCriterion("housesoloflg >", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgGreaterThanOrEqualTo(String value) {
            addCriterion("housesoloflg >=", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgLessThan(String value) {
            addCriterion("housesoloflg <", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgLessThanOrEqualTo(String value) {
            addCriterion("housesoloflg <=", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgLike(String value) {
            addCriterion("housesoloflg like", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgNotLike(String value) {
            addCriterion("housesoloflg not like", value, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgIn(List<String> values) {
            addCriterion("housesoloflg in", values, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgNotIn(List<String> values) {
            addCriterion("housesoloflg not in", values, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgBetween(String value1, String value2) {
            addCriterion("housesoloflg between", value1, value2, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andHousesoloflgNotBetween(String value1, String value2) {
            addCriterion("housesoloflg not between", value1, value2, "housesoloflg");
            return (Criteria) this;
        }

        public Criteria andCertificateurlIsNull() {
            addCriterion("certificateurl is null");
            return (Criteria) this;
        }

        public Criteria andCertificateurlIsNotNull() {
            addCriterion("certificateurl is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateurlEqualTo(String value) {
            addCriterion("certificateurl =", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlNotEqualTo(String value) {
            addCriterion("certificateurl <>", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlGreaterThan(String value) {
            addCriterion("certificateurl >", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlGreaterThanOrEqualTo(String value) {
            addCriterion("certificateurl >=", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlLessThan(String value) {
            addCriterion("certificateurl <", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlLessThanOrEqualTo(String value) {
            addCriterion("certificateurl <=", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlLike(String value) {
            addCriterion("certificateurl like", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlNotLike(String value) {
            addCriterion("certificateurl not like", value, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlIn(List<String> values) {
            addCriterion("certificateurl in", values, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlNotIn(List<String> values) {
            addCriterion("certificateurl not in", values, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlBetween(String value1, String value2) {
            addCriterion("certificateurl between", value1, value2, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andCertificateurlNotBetween(String value1, String value2) {
            addCriterion("certificateurl not between", value1, value2, "certificateurl");
            return (Criteria) this;
        }

        public Criteria andChgtlIsNull() {
            addCriterion("chgtl is null");
            return (Criteria) this;
        }

        public Criteria andChgtlIsNotNull() {
            addCriterion("chgtl is not null");
            return (Criteria) this;
        }

        public Criteria andChgtlEqualTo(String value) {
            addCriterion("chgtl =", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlNotEqualTo(String value) {
            addCriterion("chgtl <>", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlGreaterThan(String value) {
            addCriterion("chgtl >", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlGreaterThanOrEqualTo(String value) {
            addCriterion("chgtl >=", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlLessThan(String value) {
            addCriterion("chgtl <", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlLessThanOrEqualTo(String value) {
            addCriterion("chgtl <=", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlLike(String value) {
            addCriterion("chgtl like", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlNotLike(String value) {
            addCriterion("chgtl not like", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlIn(List<String> values) {
            addCriterion("chgtl in", values, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlNotIn(List<String> values) {
            addCriterion("chgtl not in", values, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlBetween(String value1, String value2) {
            addCriterion("chgtl between", value1, value2, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlNotBetween(String value1, String value2) {
            addCriterion("chgtl not between", value1, value2, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgdtIsNull() {
            addCriterion("chgdt is null");
            return (Criteria) this;
        }

        public Criteria andChgdtIsNotNull() {
            addCriterion("chgdt is not null");
            return (Criteria) this;
        }

        public Criteria andChgdtEqualTo(Date value) {
            addCriterion("chgdt =", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtNotEqualTo(Date value) {
            addCriterion("chgdt <>", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtGreaterThan(Date value) {
            addCriterion("chgdt >", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtGreaterThanOrEqualTo(Date value) {
            addCriterion("chgdt >=", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtLessThan(Date value) {
            addCriterion("chgdt <", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtLessThanOrEqualTo(Date value) {
            addCriterion("chgdt <=", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtIn(List<Date> values) {
            addCriterion("chgdt in", values, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtNotIn(List<Date> values) {
            addCriterion("chgdt not in", values, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtBetween(Date value1, Date value2) {
            addCriterion("chgdt between", value1, value2, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtNotBetween(Date value1, Date value2) {
            addCriterion("chgdt not between", value1, value2, "chgdt");
            return (Criteria) this;
        }

        public Criteria andHousenoIsNull() {
            addCriterion("houseno is null");
            return (Criteria) this;
        }

        public Criteria andHousenoIsNotNull() {
            addCriterion("houseno is not null");
            return (Criteria) this;
        }

        public Criteria andHousenoEqualTo(String value) {
            addCriterion("houseno =", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotEqualTo(String value) {
            addCriterion("houseno <>", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoGreaterThan(String value) {
            addCriterion("houseno >", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoGreaterThanOrEqualTo(String value) {
            addCriterion("houseno >=", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLessThan(String value) {
            addCriterion("houseno <", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLessThanOrEqualTo(String value) {
            addCriterion("houseno <=", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLike(String value) {
            addCriterion("houseno like", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotLike(String value) {
            addCriterion("houseno not like", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoIn(List<String> values) {
            addCriterion("houseno in", values, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotIn(List<String> values) {
            addCriterion("houseno not in", values, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoBetween(String value1, String value2) {
            addCriterion("houseno between", value1, value2, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotBetween(String value1, String value2) {
            addCriterion("houseno not between", value1, value2, "houseno");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoIsNull() {
            addCriterion("landcertificateno is null");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoIsNotNull() {
            addCriterion("landcertificateno is not null");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoEqualTo(String value) {
            addCriterion("landcertificateno =", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoNotEqualTo(String value) {
            addCriterion("landcertificateno <>", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoGreaterThan(String value) {
            addCriterion("landcertificateno >", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoGreaterThanOrEqualTo(String value) {
            addCriterion("landcertificateno >=", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoLessThan(String value) {
            addCriterion("landcertificateno <", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoLessThanOrEqualTo(String value) {
            addCriterion("landcertificateno <=", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoLike(String value) {
            addCriterion("landcertificateno like", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoNotLike(String value) {
            addCriterion("landcertificateno not like", value, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoIn(List<String> values) {
            addCriterion("landcertificateno in", values, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoNotIn(List<String> values) {
            addCriterion("landcertificateno not in", values, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoBetween(String value1, String value2) {
            addCriterion("landcertificateno between", value1, value2, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andLandcertificatenoNotBetween(String value1, String value2) {
            addCriterion("landcertificateno not between", value1, value2, "landcertificateno");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateIsNull() {
            addCriterion("islandcertificate is null");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateIsNotNull() {
            addCriterion("islandcertificate is not null");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateEqualTo(String value) {
            addCriterion("islandcertificate =", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateNotEqualTo(String value) {
            addCriterion("islandcertificate <>", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateGreaterThan(String value) {
            addCriterion("islandcertificate >", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateGreaterThanOrEqualTo(String value) {
            addCriterion("islandcertificate >=", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateLessThan(String value) {
            addCriterion("islandcertificate <", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateLessThanOrEqualTo(String value) {
            addCriterion("islandcertificate <=", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateLike(String value) {
            addCriterion("islandcertificate like", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateNotLike(String value) {
            addCriterion("islandcertificate not like", value, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateIn(List<String> values) {
            addCriterion("islandcertificate in", values, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateNotIn(List<String> values) {
            addCriterion("islandcertificate not in", values, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateBetween(String value1, String value2) {
            addCriterion("islandcertificate between", value1, value2, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andIslandcertificateNotBetween(String value1, String value2) {
            addCriterion("islandcertificate not between", value1, value2, "islandcertificate");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNull() {
            addCriterion("propertytype is null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNotNull() {
            addCriterion("propertytype is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeEqualTo(String value) {
            addCriterion("propertytype =", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotEqualTo(String value) {
            addCriterion("propertytype <>", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThan(String value) {
            addCriterion("propertytype >", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThanOrEqualTo(String value) {
            addCriterion("propertytype >=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThan(String value) {
            addCriterion("propertytype <", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThanOrEqualTo(String value) {
            addCriterion("propertytype <=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLike(String value) {
            addCriterion("propertytype like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotLike(String value) {
            addCriterion("propertytype not like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIn(List<String> values) {
            addCriterion("propertytype in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotIn(List<String> values) {
            addCriterion("propertytype not in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeBetween(String value1, String value2) {
            addCriterion("propertytype between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotBetween(String value1, String value2) {
            addCriterion("propertytype not between", value1, value2, "propertytype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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