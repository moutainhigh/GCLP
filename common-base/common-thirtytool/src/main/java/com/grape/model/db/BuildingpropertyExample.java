package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BuildingpropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingpropertyExample() {
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

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andFastpriceIsNull() {
            addCriterion("fastprice is null");
            return (Criteria) this;
        }

        public Criteria andFastpriceIsNotNull() {
            addCriterion("fastprice is not null");
            return (Criteria) this;
        }

        public Criteria andFastpriceEqualTo(String value) {
            addCriterion("fastprice =", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceNotEqualTo(String value) {
            addCriterion("fastprice <>", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceGreaterThan(String value) {
            addCriterion("fastprice >", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceGreaterThanOrEqualTo(String value) {
            addCriterion("fastprice >=", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceLessThan(String value) {
            addCriterion("fastprice <", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceLessThanOrEqualTo(String value) {
            addCriterion("fastprice <=", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceLike(String value) {
            addCriterion("fastprice like", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceNotLike(String value) {
            addCriterion("fastprice not like", value, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceIn(List<String> values) {
            addCriterion("fastprice in", values, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceNotIn(List<String> values) {
            addCriterion("fastprice not in", values, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceBetween(String value1, String value2) {
            addCriterion("fastprice between", value1, value2, "fastprice");
            return (Criteria) this;
        }

        public Criteria andFastpriceNotBetween(String value1, String value2) {
            addCriterion("fastprice not between", value1, value2, "fastprice");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNull() {
            addCriterion("mortgageid is null");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNotNull() {
            addCriterion("mortgageid is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageidEqualTo(String value) {
            addCriterion("mortgageid =", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotEqualTo(String value) {
            addCriterion("mortgageid <>", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThan(String value) {
            addCriterion("mortgageid >", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageid >=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThan(String value) {
            addCriterion("mortgageid <", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThanOrEqualTo(String value) {
            addCriterion("mortgageid <=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLike(String value) {
            addCriterion("mortgageid like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotLike(String value) {
            addCriterion("mortgageid not like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIn(List<String> values) {
            addCriterion("mortgageid in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotIn(List<String> values) {
            addCriterion("mortgageid not in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidBetween(String value1, String value2) {
            addCriterion("mortgageid between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotBetween(String value1, String value2) {
            addCriterion("mortgageid not between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andRealpriceIsNull() {
            addCriterion("realprice is null");
            return (Criteria) this;
        }

        public Criteria andRealpriceIsNotNull() {
            addCriterion("realprice is not null");
            return (Criteria) this;
        }

        public Criteria andRealpriceEqualTo(String value) {
            addCriterion("realprice =", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceNotEqualTo(String value) {
            addCriterion("realprice <>", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceGreaterThan(String value) {
            addCriterion("realprice >", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceGreaterThanOrEqualTo(String value) {
            addCriterion("realprice >=", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceLessThan(String value) {
            addCriterion("realprice <", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceLessThanOrEqualTo(String value) {
            addCriterion("realprice <=", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceLike(String value) {
            addCriterion("realprice like", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceNotLike(String value) {
            addCriterion("realprice not like", value, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceIn(List<String> values) {
            addCriterion("realprice in", values, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceNotIn(List<String> values) {
            addCriterion("realprice not in", values, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceBetween(String value1, String value2) {
            addCriterion("realprice between", value1, value2, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpriceNotBetween(String value1, String value2) {
            addCriterion("realprice not between", value1, value2, "realprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceIsNull() {
            addCriterion("realpriceprice is null");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceIsNotNull() {
            addCriterion("realpriceprice is not null");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceEqualTo(String value) {
            addCriterion("realpriceprice =", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceNotEqualTo(String value) {
            addCriterion("realpriceprice <>", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceGreaterThan(String value) {
            addCriterion("realpriceprice >", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceGreaterThanOrEqualTo(String value) {
            addCriterion("realpriceprice >=", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceLessThan(String value) {
            addCriterion("realpriceprice <", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceLessThanOrEqualTo(String value) {
            addCriterion("realpriceprice <=", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceLike(String value) {
            addCriterion("realpriceprice like", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceNotLike(String value) {
            addCriterion("realpriceprice not like", value, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceIn(List<String> values) {
            addCriterion("realpriceprice in", values, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceNotIn(List<String> values) {
            addCriterion("realpriceprice not in", values, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceBetween(String value1, String value2) {
            addCriterion("realpriceprice between", value1, value2, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andRealpricepriceNotBetween(String value1, String value2) {
            addCriterion("realpriceprice not between", value1, value2, "realpriceprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceIsNull() {
            addCriterion("houseunitprice is null");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceIsNotNull() {
            addCriterion("houseunitprice is not null");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceEqualTo(BigDecimal value) {
            addCriterion("houseunitprice =", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceNotEqualTo(BigDecimal value) {
            addCriterion("houseunitprice <>", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceGreaterThan(BigDecimal value) {
            addCriterion("houseunitprice >", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("houseunitprice >=", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceLessThan(BigDecimal value) {
            addCriterion("houseunitprice <", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("houseunitprice <=", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceIn(List<BigDecimal> values) {
            addCriterion("houseunitprice in", values, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceNotIn(List<BigDecimal> values) {
            addCriterion("houseunitprice not in", values, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("houseunitprice between", value1, value2, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("houseunitprice not between", value1, value2, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceIsNull() {
            addCriterion("housetotalprice is null");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceIsNotNull() {
            addCriterion("housetotalprice is not null");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceEqualTo(BigDecimal value) {
            addCriterion("housetotalprice =", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("housetotalprice <>", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceGreaterThan(BigDecimal value) {
            addCriterion("housetotalprice >", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("housetotalprice >=", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceLessThan(BigDecimal value) {
            addCriterion("housetotalprice <", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("housetotalprice <=", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceIn(List<BigDecimal> values) {
            addCriterion("housetotalprice in", values, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("housetotalprice not in", values, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housetotalprice between", value1, value2, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housetotalprice not between", value1, value2, "housetotalprice");
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