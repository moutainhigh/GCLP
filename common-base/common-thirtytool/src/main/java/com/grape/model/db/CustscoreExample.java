package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CustscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustscoreExample() {
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

        public Criteria andStartcustgradeIsNull() {
            addCriterion("startcustgrade is null");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeIsNotNull() {
            addCriterion("startcustgrade is not null");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeEqualTo(BigDecimal value) {
            addCriterion("startcustgrade =", value, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeNotEqualTo(BigDecimal value) {
            addCriterion("startcustgrade <>", value, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeGreaterThan(BigDecimal value) {
            addCriterion("startcustgrade >", value, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("startcustgrade >=", value, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeLessThan(BigDecimal value) {
            addCriterion("startcustgrade <", value, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("startcustgrade <=", value, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeIn(List<BigDecimal> values) {
            addCriterion("startcustgrade in", values, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeNotIn(List<BigDecimal> values) {
            addCriterion("startcustgrade not in", values, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startcustgrade between", value1, value2, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartcustgradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startcustgrade not between", value1, value2, "startcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeIsNull() {
            addCriterion("endcustgrade is null");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeIsNotNull() {
            addCriterion("endcustgrade is not null");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeEqualTo(BigDecimal value) {
            addCriterion("endcustgrade =", value, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeNotEqualTo(BigDecimal value) {
            addCriterion("endcustgrade <>", value, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeGreaterThan(BigDecimal value) {
            addCriterion("endcustgrade >", value, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("endcustgrade >=", value, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeLessThan(BigDecimal value) {
            addCriterion("endcustgrade <", value, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("endcustgrade <=", value, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeIn(List<BigDecimal> values) {
            addCriterion("endcustgrade in", values, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeNotIn(List<BigDecimal> values) {
            addCriterion("endcustgrade not in", values, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endcustgrade between", value1, value2, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andEndcustgradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endcustgrade not between", value1, value2, "endcustgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeIsNull() {
            addCriterion("startmortgrade is null");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeIsNotNull() {
            addCriterion("startmortgrade is not null");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeEqualTo(BigDecimal value) {
            addCriterion("startmortgrade =", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeNotEqualTo(BigDecimal value) {
            addCriterion("startmortgrade <>", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeGreaterThan(BigDecimal value) {
            addCriterion("startmortgrade >", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("startmortgrade >=", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeLessThan(BigDecimal value) {
            addCriterion("startmortgrade <", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("startmortgrade <=", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeIn(List<BigDecimal> values) {
            addCriterion("startmortgrade in", values, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeNotIn(List<BigDecimal> values) {
            addCriterion("startmortgrade not in", values, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startmortgrade between", value1, value2, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startmortgrade not between", value1, value2, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeIsNull() {
            addCriterion("endmortgrade is null");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeIsNotNull() {
            addCriterion("endmortgrade is not null");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeEqualTo(BigDecimal value) {
            addCriterion("endmortgrade =", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeNotEqualTo(BigDecimal value) {
            addCriterion("endmortgrade <>", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeGreaterThan(BigDecimal value) {
            addCriterion("endmortgrade >", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("endmortgrade >=", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeLessThan(BigDecimal value) {
            addCriterion("endmortgrade <", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("endmortgrade <=", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeIn(List<BigDecimal> values) {
            addCriterion("endmortgrade in", values, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeNotIn(List<BigDecimal> values) {
            addCriterion("endmortgrade not in", values, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endmortgrade between", value1, value2, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endmortgrade not between", value1, value2, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andCustleavelIsNull() {
            addCriterion("custleavel is null");
            return (Criteria) this;
        }

        public Criteria andCustleavelIsNotNull() {
            addCriterion("custleavel is not null");
            return (Criteria) this;
        }

        public Criteria andCustleavelEqualTo(String value) {
            addCriterion("custleavel =", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelNotEqualTo(String value) {
            addCriterion("custleavel <>", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelGreaterThan(String value) {
            addCriterion("custleavel >", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelGreaterThanOrEqualTo(String value) {
            addCriterion("custleavel >=", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelLessThan(String value) {
            addCriterion("custleavel <", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelLessThanOrEqualTo(String value) {
            addCriterion("custleavel <=", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelLike(String value) {
            addCriterion("custleavel like", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelNotLike(String value) {
            addCriterion("custleavel not like", value, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelIn(List<String> values) {
            addCriterion("custleavel in", values, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelNotIn(List<String> values) {
            addCriterion("custleavel not in", values, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelBetween(String value1, String value2) {
            addCriterion("custleavel between", value1, value2, "custleavel");
            return (Criteria) this;
        }

        public Criteria andCustleavelNotBetween(String value1, String value2) {
            addCriterion("custleavel not between", value1, value2, "custleavel");
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