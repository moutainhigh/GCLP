package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MortgagescoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MortgagescoreExample() {
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

        public Criteria andStartmortgradeIsNull() {
            addCriterion("startmortgrade is null");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeIsNotNull() {
            addCriterion("startmortgrade is not null");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeEqualTo(String value) {
            addCriterion("startmortgrade =", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeNotEqualTo(String value) {
            addCriterion("startmortgrade <>", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeGreaterThan(String value) {
            addCriterion("startmortgrade >", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeGreaterThanOrEqualTo(String value) {
            addCriterion("startmortgrade >=", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeLessThan(String value) {
            addCriterion("startmortgrade <", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeLessThanOrEqualTo(String value) {
            addCriterion("startmortgrade <=", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeLike(String value) {
            addCriterion("startmortgrade like", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeNotLike(String value) {
            addCriterion("startmortgrade not like", value, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeIn(List<String> values) {
            addCriterion("startmortgrade in", values, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeNotIn(List<String> values) {
            addCriterion("startmortgrade not in", values, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeBetween(String value1, String value2) {
            addCriterion("startmortgrade between", value1, value2, "startmortgrade");
            return (Criteria) this;
        }

        public Criteria andStartmortgradeNotBetween(String value1, String value2) {
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

        public Criteria andEndmortgradeEqualTo(String value) {
            addCriterion("endmortgrade =", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeNotEqualTo(String value) {
            addCriterion("endmortgrade <>", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeGreaterThan(String value) {
            addCriterion("endmortgrade >", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeGreaterThanOrEqualTo(String value) {
            addCriterion("endmortgrade >=", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeLessThan(String value) {
            addCriterion("endmortgrade <", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeLessThanOrEqualTo(String value) {
            addCriterion("endmortgrade <=", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeLike(String value) {
            addCriterion("endmortgrade like", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeNotLike(String value) {
            addCriterion("endmortgrade not like", value, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeIn(List<String> values) {
            addCriterion("endmortgrade in", values, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeNotIn(List<String> values) {
            addCriterion("endmortgrade not in", values, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeBetween(String value1, String value2) {
            addCriterion("endmortgrade between", value1, value2, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andEndmortgradeNotBetween(String value1, String value2) {
            addCriterion("endmortgrade not between", value1, value2, "endmortgrade");
            return (Criteria) this;
        }

        public Criteria andMortgagerateIsNull() {
            addCriterion("mortgagerate is null");
            return (Criteria) this;
        }

        public Criteria andMortgagerateIsNotNull() {
            addCriterion("mortgagerate is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagerateEqualTo(BigDecimal value) {
            addCriterion("mortgagerate =", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateNotEqualTo(BigDecimal value) {
            addCriterion("mortgagerate <>", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateGreaterThan(BigDecimal value) {
            addCriterion("mortgagerate >", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagerate >=", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateLessThan(BigDecimal value) {
            addCriterion("mortgagerate <", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagerate <=", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateIn(List<BigDecimal> values) {
            addCriterion("mortgagerate in", values, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateNotIn(List<BigDecimal> values) {
            addCriterion("mortgagerate not in", values, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagerate between", value1, value2, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagerate not between", value1, value2, "mortgagerate");
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