package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepayfollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepayfollowExample() {
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

        public Criteria andFollowmanIsNull() {
            addCriterion("followman is null");
            return (Criteria) this;
        }

        public Criteria andFollowmanIsNotNull() {
            addCriterion("followman is not null");
            return (Criteria) this;
        }

        public Criteria andFollowmanEqualTo(String value) {
            addCriterion("followman =", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotEqualTo(String value) {
            addCriterion("followman <>", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanGreaterThan(String value) {
            addCriterion("followman >", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanGreaterThanOrEqualTo(String value) {
            addCriterion("followman >=", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanLessThan(String value) {
            addCriterion("followman <", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanLessThanOrEqualTo(String value) {
            addCriterion("followman <=", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanLike(String value) {
            addCriterion("followman like", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotLike(String value) {
            addCriterion("followman not like", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanIn(List<String> values) {
            addCriterion("followman in", values, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotIn(List<String> values) {
            addCriterion("followman not in", values, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanBetween(String value1, String value2) {
            addCriterion("followman between", value1, value2, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotBetween(String value1, String value2) {
            addCriterion("followman not between", value1, value2, "followman");
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

        public Criteria andCustnoIsNull() {
            addCriterion("custno is null");
            return (Criteria) this;
        }

        public Criteria andCustnoIsNotNull() {
            addCriterion("custno is not null");
            return (Criteria) this;
        }

        public Criteria andCustnoEqualTo(String value) {
            addCriterion("custno =", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotEqualTo(String value) {
            addCriterion("custno <>", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoGreaterThan(String value) {
            addCriterion("custno >", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoGreaterThanOrEqualTo(String value) {
            addCriterion("custno >=", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLessThan(String value) {
            addCriterion("custno <", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLessThanOrEqualTo(String value) {
            addCriterion("custno <=", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLike(String value) {
            addCriterion("custno like", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotLike(String value) {
            addCriterion("custno not like", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoIn(List<String> values) {
            addCriterion("custno in", values, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotIn(List<String> values) {
            addCriterion("custno not in", values, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoBetween(String value1, String value2) {
            addCriterion("custno between", value1, value2, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotBetween(String value1, String value2) {
            addCriterion("custno not between", value1, value2, "custno");
            return (Criteria) this;
        }

        public Criteria andRepaydateIsNull() {
            addCriterion("repaydate is null");
            return (Criteria) this;
        }

        public Criteria andRepaydateIsNotNull() {
            addCriterion("repaydate is not null");
            return (Criteria) this;
        }

        public Criteria andRepaydateEqualTo(Date value) {
            addCriterion("repaydate =", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateNotEqualTo(Date value) {
            addCriterion("repaydate <>", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateGreaterThan(Date value) {
            addCriterion("repaydate >", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("repaydate >=", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateLessThan(Date value) {
            addCriterion("repaydate <", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateLessThanOrEqualTo(Date value) {
            addCriterion("repaydate <=", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateIn(List<Date> values) {
            addCriterion("repaydate in", values, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateNotIn(List<Date> values) {
            addCriterion("repaydate not in", values, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateBetween(Date value1, Date value2) {
            addCriterion("repaydate between", value1, value2, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateNotBetween(Date value1, Date value2) {
            addCriterion("repaydate not between", value1, value2, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepayamountIsNull() {
            addCriterion("repayamount is null");
            return (Criteria) this;
        }

        public Criteria andRepayamountIsNotNull() {
            addCriterion("repayamount is not null");
            return (Criteria) this;
        }

        public Criteria andRepayamountEqualTo(BigDecimal value) {
            addCriterion("repayamount =", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountNotEqualTo(BigDecimal value) {
            addCriterion("repayamount <>", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountGreaterThan(BigDecimal value) {
            addCriterion("repayamount >", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayamount >=", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountLessThan(BigDecimal value) {
            addCriterion("repayamount <", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayamount <=", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountIn(List<BigDecimal> values) {
            addCriterion("repayamount in", values, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountNotIn(List<BigDecimal> values) {
            addCriterion("repayamount not in", values, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayamount between", value1, value2, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayamount not between", value1, value2, "repayamount");
            return (Criteria) this;
        }

        public Criteria andFollowdateIsNull() {
            addCriterion("followdate is null");
            return (Criteria) this;
        }

        public Criteria andFollowdateIsNotNull() {
            addCriterion("followdate is not null");
            return (Criteria) this;
        }

        public Criteria andFollowdateEqualTo(Date value) {
            addCriterion("followdate =", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateNotEqualTo(Date value) {
            addCriterion("followdate <>", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateGreaterThan(Date value) {
            addCriterion("followdate >", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateGreaterThanOrEqualTo(Date value) {
            addCriterion("followdate >=", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateLessThan(Date value) {
            addCriterion("followdate <", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateLessThanOrEqualTo(Date value) {
            addCriterion("followdate <=", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateIn(List<Date> values) {
            addCriterion("followdate in", values, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateNotIn(List<Date> values) {
            addCriterion("followdate not in", values, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateBetween(Date value1, Date value2) {
            addCriterion("followdate between", value1, value2, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateNotBetween(Date value1, Date value2) {
            addCriterion("followdate not between", value1, value2, "followdate");
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