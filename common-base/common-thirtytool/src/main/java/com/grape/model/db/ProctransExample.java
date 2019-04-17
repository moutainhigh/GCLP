package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class ProctransExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProctransExample() {
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

        public Criteria andTransidIsNull() {
            addCriterion("transid is null");
            return (Criteria) this;
        }

        public Criteria andTransidIsNotNull() {
            addCriterion("transid is not null");
            return (Criteria) this;
        }

        public Criteria andTransidEqualTo(String value) {
            addCriterion("transid =", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotEqualTo(String value) {
            addCriterion("transid <>", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThan(String value) {
            addCriterion("transid >", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThanOrEqualTo(String value) {
            addCriterion("transid >=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThan(String value) {
            addCriterion("transid <", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThanOrEqualTo(String value) {
            addCriterion("transid <=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLike(String value) {
            addCriterion("transid like", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotLike(String value) {
            addCriterion("transid not like", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidIn(List<String> values) {
            addCriterion("transid in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotIn(List<String> values) {
            addCriterion("transid not in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidBetween(String value1, String value2) {
            addCriterion("transid between", value1, value2, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotBetween(String value1, String value2) {
            addCriterion("transid not between", value1, value2, "transid");
            return (Criteria) this;
        }

        public Criteria andButtonidIsNull() {
            addCriterion("buttonid is null");
            return (Criteria) this;
        }

        public Criteria andButtonidIsNotNull() {
            addCriterion("buttonid is not null");
            return (Criteria) this;
        }

        public Criteria andButtonidEqualTo(String value) {
            addCriterion("buttonid =", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidNotEqualTo(String value) {
            addCriterion("buttonid <>", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidGreaterThan(String value) {
            addCriterion("buttonid >", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidGreaterThanOrEqualTo(String value) {
            addCriterion("buttonid >=", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidLessThan(String value) {
            addCriterion("buttonid <", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidLessThanOrEqualTo(String value) {
            addCriterion("buttonid <=", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidLike(String value) {
            addCriterion("buttonid like", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidNotLike(String value) {
            addCriterion("buttonid not like", value, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidIn(List<String> values) {
            addCriterion("buttonid in", values, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidNotIn(List<String> values) {
            addCriterion("buttonid not in", values, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidBetween(String value1, String value2) {
            addCriterion("buttonid between", value1, value2, "buttonid");
            return (Criteria) this;
        }

        public Criteria andButtonidNotBetween(String value1, String value2) {
            addCriterion("buttonid not between", value1, value2, "buttonid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTonodeIsNull() {
            addCriterion("tonode is null");
            return (Criteria) this;
        }

        public Criteria andTonodeIsNotNull() {
            addCriterion("tonode is not null");
            return (Criteria) this;
        }

        public Criteria andTonodeEqualTo(String value) {
            addCriterion("tonode =", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotEqualTo(String value) {
            addCriterion("tonode <>", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeGreaterThan(String value) {
            addCriterion("tonode >", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeGreaterThanOrEqualTo(String value) {
            addCriterion("tonode >=", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeLessThan(String value) {
            addCriterion("tonode <", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeLessThanOrEqualTo(String value) {
            addCriterion("tonode <=", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeLike(String value) {
            addCriterion("tonode like", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotLike(String value) {
            addCriterion("tonode not like", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeIn(List<String> values) {
            addCriterion("tonode in", values, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotIn(List<String> values) {
            addCriterion("tonode not in", values, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeBetween(String value1, String value2) {
            addCriterion("tonode between", value1, value2, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotBetween(String value1, String value2) {
            addCriterion("tonode not between", value1, value2, "tonode");
            return (Criteria) this;
        }

        public Criteria andCondexpressIsNull() {
            addCriterion("condexpress is null");
            return (Criteria) this;
        }

        public Criteria andCondexpressIsNotNull() {
            addCriterion("condexpress is not null");
            return (Criteria) this;
        }

        public Criteria andCondexpressEqualTo(String value) {
            addCriterion("condexpress =", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressNotEqualTo(String value) {
            addCriterion("condexpress <>", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressGreaterThan(String value) {
            addCriterion("condexpress >", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressGreaterThanOrEqualTo(String value) {
            addCriterion("condexpress >=", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressLessThan(String value) {
            addCriterion("condexpress <", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressLessThanOrEqualTo(String value) {
            addCriterion("condexpress <=", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressLike(String value) {
            addCriterion("condexpress like", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressNotLike(String value) {
            addCriterion("condexpress not like", value, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressIn(List<String> values) {
            addCriterion("condexpress in", values, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressNotIn(List<String> values) {
            addCriterion("condexpress not in", values, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressBetween(String value1, String value2) {
            addCriterion("condexpress between", value1, value2, "condexpress");
            return (Criteria) this;
        }

        public Criteria andCondexpressNotBetween(String value1, String value2) {
            addCriterion("condexpress not between", value1, value2, "condexpress");
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