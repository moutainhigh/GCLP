package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MonthlystatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonthlystatExample() {
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

        public Criteria andMonthnumIsNull() {
            addCriterion("monthnum is null");
            return (Criteria) this;
        }

        public Criteria andMonthnumIsNotNull() {
            addCriterion("monthnum is not null");
            return (Criteria) this;
        }

        public Criteria andMonthnumEqualTo(String value) {
            addCriterion("monthnum =", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumNotEqualTo(String value) {
            addCriterion("monthnum <>", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumGreaterThan(String value) {
            addCriterion("monthnum >", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumGreaterThanOrEqualTo(String value) {
            addCriterion("monthnum >=", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumLessThan(String value) {
            addCriterion("monthnum <", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumLessThanOrEqualTo(String value) {
            addCriterion("monthnum <=", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumLike(String value) {
            addCriterion("monthnum like", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumNotLike(String value) {
            addCriterion("monthnum not like", value, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumIn(List<String> values) {
            addCriterion("monthnum in", values, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumNotIn(List<String> values) {
            addCriterion("monthnum not in", values, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumBetween(String value1, String value2) {
            addCriterion("monthnum between", value1, value2, "monthnum");
            return (Criteria) this;
        }

        public Criteria andMonthnumNotBetween(String value1, String value2) {
            addCriterion("monthnum not between", value1, value2, "monthnum");
            return (Criteria) this;
        }

        public Criteria andChannelnoIsNull() {
            addCriterion("channelno is null");
            return (Criteria) this;
        }

        public Criteria andChannelnoIsNotNull() {
            addCriterion("channelno is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnoEqualTo(String value) {
            addCriterion("channelno =", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotEqualTo(String value) {
            addCriterion("channelno <>", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoGreaterThan(String value) {
            addCriterion("channelno >", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoGreaterThanOrEqualTo(String value) {
            addCriterion("channelno >=", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLessThan(String value) {
            addCriterion("channelno <", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLessThanOrEqualTo(String value) {
            addCriterion("channelno <=", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLike(String value) {
            addCriterion("channelno like", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotLike(String value) {
            addCriterion("channelno not like", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoIn(List<String> values) {
            addCriterion("channelno in", values, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotIn(List<String> values) {
            addCriterion("channelno not in", values, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoBetween(String value1, String value2) {
            addCriterion("channelno between", value1, value2, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotBetween(String value1, String value2) {
            addCriterion("channelno not between", value1, value2, "channelno");
            return (Criteria) this;
        }

        public Criteria andFundnoIsNull() {
            addCriterion("fundno is null");
            return (Criteria) this;
        }

        public Criteria andFundnoIsNotNull() {
            addCriterion("fundno is not null");
            return (Criteria) this;
        }

        public Criteria andFundnoEqualTo(String value) {
            addCriterion("fundno =", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotEqualTo(String value) {
            addCriterion("fundno <>", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoGreaterThan(String value) {
            addCriterion("fundno >", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoGreaterThanOrEqualTo(String value) {
            addCriterion("fundno >=", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoLessThan(String value) {
            addCriterion("fundno <", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoLessThanOrEqualTo(String value) {
            addCriterion("fundno <=", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoLike(String value) {
            addCriterion("fundno like", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotLike(String value) {
            addCriterion("fundno not like", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoIn(List<String> values) {
            addCriterion("fundno in", values, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotIn(List<String> values) {
            addCriterion("fundno not in", values, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoBetween(String value1, String value2) {
            addCriterion("fundno between", value1, value2, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotBetween(String value1, String value2) {
            addCriterion("fundno not between", value1, value2, "fundno");
            return (Criteria) this;
        }

        public Criteria andAislenoIsNull() {
            addCriterion("aisleno is null");
            return (Criteria) this;
        }

        public Criteria andAislenoIsNotNull() {
            addCriterion("aisleno is not null");
            return (Criteria) this;
        }

        public Criteria andAislenoEqualTo(String value) {
            addCriterion("aisleno =", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotEqualTo(String value) {
            addCriterion("aisleno <>", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoGreaterThan(String value) {
            addCriterion("aisleno >", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoGreaterThanOrEqualTo(String value) {
            addCriterion("aisleno >=", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoLessThan(String value) {
            addCriterion("aisleno <", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoLessThanOrEqualTo(String value) {
            addCriterion("aisleno <=", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoLike(String value) {
            addCriterion("aisleno like", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotLike(String value) {
            addCriterion("aisleno not like", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoIn(List<String> values) {
            addCriterion("aisleno in", values, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotIn(List<String> values) {
            addCriterion("aisleno not in", values, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoBetween(String value1, String value2) {
            addCriterion("aisleno between", value1, value2, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotBetween(String value1, String value2) {
            addCriterion("aisleno not between", value1, value2, "aisleno");
            return (Criteria) this;
        }

        public Criteria andOverdueprobIsNull() {
            addCriterion("overdueprob is null");
            return (Criteria) this;
        }

        public Criteria andOverdueprobIsNotNull() {
            addCriterion("overdueprob is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueprobEqualTo(BigDecimal value) {
            addCriterion("overdueprob =", value, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobNotEqualTo(BigDecimal value) {
            addCriterion("overdueprob <>", value, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobGreaterThan(BigDecimal value) {
            addCriterion("overdueprob >", value, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueprob >=", value, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobLessThan(BigDecimal value) {
            addCriterion("overdueprob <", value, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueprob <=", value, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobIn(List<BigDecimal> values) {
            addCriterion("overdueprob in", values, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobNotIn(List<BigDecimal> values) {
            addCriterion("overdueprob not in", values, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueprob between", value1, value2, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOverdueprobNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueprob not between", value1, value2, "overdueprob");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumIsNull() {
            addCriterion("onpassagenum is null");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumIsNotNull() {
            addCriterion("onpassagenum is not null");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumEqualTo(Integer value) {
            addCriterion("onpassagenum =", value, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumNotEqualTo(Integer value) {
            addCriterion("onpassagenum <>", value, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumGreaterThan(Integer value) {
            addCriterion("onpassagenum >", value, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("onpassagenum >=", value, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumLessThan(Integer value) {
            addCriterion("onpassagenum <", value, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumLessThanOrEqualTo(Integer value) {
            addCriterion("onpassagenum <=", value, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumIn(List<Integer> values) {
            addCriterion("onpassagenum in", values, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumNotIn(List<Integer> values) {
            addCriterion("onpassagenum not in", values, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumBetween(Integer value1, Integer value2) {
            addCriterion("onpassagenum between", value1, value2, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOnpassagenumNotBetween(Integer value1, Integer value2) {
            addCriterion("onpassagenum not between", value1, value2, "onpassagenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumIsNull() {
            addCriterion("overduenum is null");
            return (Criteria) this;
        }

        public Criteria andOverduenumIsNotNull() {
            addCriterion("overduenum is not null");
            return (Criteria) this;
        }

        public Criteria andOverduenumEqualTo(Integer value) {
            addCriterion("overduenum =", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumNotEqualTo(Integer value) {
            addCriterion("overduenum <>", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumGreaterThan(Integer value) {
            addCriterion("overduenum >", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("overduenum >=", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumLessThan(Integer value) {
            addCriterion("overduenum <", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumLessThanOrEqualTo(Integer value) {
            addCriterion("overduenum <=", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumIn(List<Integer> values) {
            addCriterion("overduenum in", values, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumNotIn(List<Integer> values) {
            addCriterion("overduenum not in", values, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumBetween(Integer value1, Integer value2) {
            addCriterion("overduenum between", value1, value2, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumNotBetween(Integer value1, Integer value2) {
            addCriterion("overduenum not between", value1, value2, "overduenum");
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