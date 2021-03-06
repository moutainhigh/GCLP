package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RatescoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RatescoreExample() {
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

        public Criteria andStartrategradeIsNull() {
            addCriterion("startrategrade is null");
            return (Criteria) this;
        }

        public Criteria andStartrategradeIsNotNull() {
            addCriterion("startrategrade is not null");
            return (Criteria) this;
        }

        public Criteria andStartrategradeEqualTo(String value) {
            addCriterion("startrategrade =", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeNotEqualTo(String value) {
            addCriterion("startrategrade <>", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeGreaterThan(String value) {
            addCriterion("startrategrade >", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeGreaterThanOrEqualTo(String value) {
            addCriterion("startrategrade >=", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeLessThan(String value) {
            addCriterion("startrategrade <", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeLessThanOrEqualTo(String value) {
            addCriterion("startrategrade <=", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeLike(String value) {
            addCriterion("startrategrade like", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeNotLike(String value) {
            addCriterion("startrategrade not like", value, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeIn(List<String> values) {
            addCriterion("startrategrade in", values, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeNotIn(List<String> values) {
            addCriterion("startrategrade not in", values, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeBetween(String value1, String value2) {
            addCriterion("startrategrade between", value1, value2, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andStartrategradeNotBetween(String value1, String value2) {
            addCriterion("startrategrade not between", value1, value2, "startrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeIsNull() {
            addCriterion("endrategrade is null");
            return (Criteria) this;
        }

        public Criteria andEndrategradeIsNotNull() {
            addCriterion("endrategrade is not null");
            return (Criteria) this;
        }

        public Criteria andEndrategradeEqualTo(String value) {
            addCriterion("endrategrade =", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeNotEqualTo(String value) {
            addCriterion("endrategrade <>", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeGreaterThan(String value) {
            addCriterion("endrategrade >", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeGreaterThanOrEqualTo(String value) {
            addCriterion("endrategrade >=", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeLessThan(String value) {
            addCriterion("endrategrade <", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeLessThanOrEqualTo(String value) {
            addCriterion("endrategrade <=", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeLike(String value) {
            addCriterion("endrategrade like", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeNotLike(String value) {
            addCriterion("endrategrade not like", value, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeIn(List<String> values) {
            addCriterion("endrategrade in", values, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeNotIn(List<String> values) {
            addCriterion("endrategrade not in", values, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeBetween(String value1, String value2) {
            addCriterion("endrategrade between", value1, value2, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andEndrategradeNotBetween(String value1, String value2) {
            addCriterion("endrategrade not between", value1, value2, "endrategrade");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
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