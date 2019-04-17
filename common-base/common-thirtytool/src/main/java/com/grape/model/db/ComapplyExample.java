package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class ComapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComapplyExample() {
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

        public Criteria andComapplyIsNull() {
            addCriterion("comapply is null");
            return (Criteria) this;
        }

        public Criteria andComapplyIsNotNull() {
            addCriterion("comapply is not null");
            return (Criteria) this;
        }

        public Criteria andComapplyEqualTo(String value) {
            addCriterion("comapply =", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyNotEqualTo(String value) {
            addCriterion("comapply <>", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyGreaterThan(String value) {
            addCriterion("comapply >", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyGreaterThanOrEqualTo(String value) {
            addCriterion("comapply >=", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyLessThan(String value) {
            addCriterion("comapply <", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyLessThanOrEqualTo(String value) {
            addCriterion("comapply <=", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyLike(String value) {
            addCriterion("comapply like", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyNotLike(String value) {
            addCriterion("comapply not like", value, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyIn(List<String> values) {
            addCriterion("comapply in", values, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyNotIn(List<String> values) {
            addCriterion("comapply not in", values, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyBetween(String value1, String value2) {
            addCriterion("comapply between", value1, value2, "comapply");
            return (Criteria) this;
        }

        public Criteria andComapplyNotBetween(String value1, String value2) {
            addCriterion("comapply not between", value1, value2, "comapply");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andIdentiIsNull() {
            addCriterion("identi is null");
            return (Criteria) this;
        }

        public Criteria andIdentiIsNotNull() {
            addCriterion("identi is not null");
            return (Criteria) this;
        }

        public Criteria andIdentiEqualTo(String value) {
            addCriterion("identi =", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiNotEqualTo(String value) {
            addCriterion("identi <>", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiGreaterThan(String value) {
            addCriterion("identi >", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiGreaterThanOrEqualTo(String value) {
            addCriterion("identi >=", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiLessThan(String value) {
            addCriterion("identi <", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiLessThanOrEqualTo(String value) {
            addCriterion("identi <=", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiLike(String value) {
            addCriterion("identi like", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiNotLike(String value) {
            addCriterion("identi not like", value, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiIn(List<String> values) {
            addCriterion("identi in", values, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiNotIn(List<String> values) {
            addCriterion("identi not in", values, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiBetween(String value1, String value2) {
            addCriterion("identi between", value1, value2, "identi");
            return (Criteria) this;
        }

        public Criteria andIdentiNotBetween(String value1, String value2) {
            addCriterion("identi not between", value1, value2, "identi");
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