package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class AreaquotaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaquotaExample() {
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

        public Criteria andAccountnoIsNull() {
            addCriterion("accountno is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("accountno is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("accountno =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("accountno <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("accountno >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("accountno >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("accountno <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("accountno <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("accountno like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("accountno not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("accountno in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("accountno not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("accountno between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("accountno not between", value1, value2, "accountno");
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

        public Criteria andTotalquotaIsNull() {
            addCriterion("totalquota is null");
            return (Criteria) this;
        }

        public Criteria andTotalquotaIsNotNull() {
            addCriterion("totalquota is not null");
            return (Criteria) this;
        }

        public Criteria andTotalquotaEqualTo(Double value) {
            addCriterion("totalquota =", value, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaNotEqualTo(Double value) {
            addCriterion("totalquota <>", value, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaGreaterThan(Double value) {
            addCriterion("totalquota >", value, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaGreaterThanOrEqualTo(Double value) {
            addCriterion("totalquota >=", value, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaLessThan(Double value) {
            addCriterion("totalquota <", value, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaLessThanOrEqualTo(Double value) {
            addCriterion("totalquota <=", value, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaIn(List<Double> values) {
            addCriterion("totalquota in", values, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaNotIn(List<Double> values) {
            addCriterion("totalquota not in", values, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaBetween(Double value1, Double value2) {
            addCriterion("totalquota between", value1, value2, "totalquota");
            return (Criteria) this;
        }

        public Criteria andTotalquotaNotBetween(Double value1, Double value2) {
            addCriterion("totalquota not between", value1, value2, "totalquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaIsNull() {
            addCriterion("usedquota is null");
            return (Criteria) this;
        }

        public Criteria andUsedquotaIsNotNull() {
            addCriterion("usedquota is not null");
            return (Criteria) this;
        }

        public Criteria andUsedquotaEqualTo(Double value) {
            addCriterion("usedquota =", value, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaNotEqualTo(Double value) {
            addCriterion("usedquota <>", value, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaGreaterThan(Double value) {
            addCriterion("usedquota >", value, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaGreaterThanOrEqualTo(Double value) {
            addCriterion("usedquota >=", value, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaLessThan(Double value) {
            addCriterion("usedquota <", value, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaLessThanOrEqualTo(Double value) {
            addCriterion("usedquota <=", value, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaIn(List<Double> values) {
            addCriterion("usedquota in", values, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaNotIn(List<Double> values) {
            addCriterion("usedquota not in", values, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaBetween(Double value1, Double value2) {
            addCriterion("usedquota between", value1, value2, "usedquota");
            return (Criteria) this;
        }

        public Criteria andUsedquotaNotBetween(Double value1, Double value2) {
            addCriterion("usedquota not between", value1, value2, "usedquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaIsNull() {
            addCriterion("remainingquota is null");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaIsNotNull() {
            addCriterion("remainingquota is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaEqualTo(Double value) {
            addCriterion("remainingquota =", value, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaNotEqualTo(Double value) {
            addCriterion("remainingquota <>", value, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaGreaterThan(Double value) {
            addCriterion("remainingquota >", value, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaGreaterThanOrEqualTo(Double value) {
            addCriterion("remainingquota >=", value, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaLessThan(Double value) {
            addCriterion("remainingquota <", value, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaLessThanOrEqualTo(Double value) {
            addCriterion("remainingquota <=", value, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaIn(List<Double> values) {
            addCriterion("remainingquota in", values, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaNotIn(List<Double> values) {
            addCriterion("remainingquota not in", values, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaBetween(Double value1, Double value2) {
            addCriterion("remainingquota between", value1, value2, "remainingquota");
            return (Criteria) this;
        }

        public Criteria andRemainingquotaNotBetween(Double value1, Double value2) {
            addCriterion("remainingquota not between", value1, value2, "remainingquota");
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