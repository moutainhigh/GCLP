package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BnkcomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BnkcomExample() {
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

        public Criteria andComnoIsNull() {
            addCriterion("comno is null");
            return (Criteria) this;
        }

        public Criteria andComnoIsNotNull() {
            addCriterion("comno is not null");
            return (Criteria) this;
        }

        public Criteria andComnoEqualTo(String value) {
            addCriterion("comno =", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotEqualTo(String value) {
            addCriterion("comno <>", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThan(String value) {
            addCriterion("comno >", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThanOrEqualTo(String value) {
            addCriterion("comno >=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThan(String value) {
            addCriterion("comno <", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThanOrEqualTo(String value) {
            addCriterion("comno <=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLike(String value) {
            addCriterion("comno like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotLike(String value) {
            addCriterion("comno not like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoIn(List<String> values) {
            addCriterion("comno in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotIn(List<String> values) {
            addCriterion("comno not in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoBetween(String value1, String value2) {
            addCriterion("comno between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotBetween(String value1, String value2) {
            addCriterion("comno not between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andBnknoIsNull() {
            addCriterion("bnkno is null");
            return (Criteria) this;
        }

        public Criteria andBnknoIsNotNull() {
            addCriterion("bnkno is not null");
            return (Criteria) this;
        }

        public Criteria andBnknoEqualTo(String value) {
            addCriterion("bnkno =", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoNotEqualTo(String value) {
            addCriterion("bnkno <>", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoGreaterThan(String value) {
            addCriterion("bnkno >", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoGreaterThanOrEqualTo(String value) {
            addCriterion("bnkno >=", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoLessThan(String value) {
            addCriterion("bnkno <", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoLessThanOrEqualTo(String value) {
            addCriterion("bnkno <=", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoLike(String value) {
            addCriterion("bnkno like", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoNotLike(String value) {
            addCriterion("bnkno not like", value, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoIn(List<String> values) {
            addCriterion("bnkno in", values, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoNotIn(List<String> values) {
            addCriterion("bnkno not in", values, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoBetween(String value1, String value2) {
            addCriterion("bnkno between", value1, value2, "bnkno");
            return (Criteria) this;
        }

        public Criteria andBnknoNotBetween(String value1, String value2) {
            addCriterion("bnkno not between", value1, value2, "bnkno");
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

        public Criteria andRemoveflgIsNull() {
            addCriterion("removeflg is null");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIsNotNull() {
            addCriterion("removeflg is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveflgEqualTo(String value) {
            addCriterion("removeflg =", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotEqualTo(String value) {
            addCriterion("removeflg <>", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgGreaterThan(String value) {
            addCriterion("removeflg >", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgGreaterThanOrEqualTo(String value) {
            addCriterion("removeflg >=", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLessThan(String value) {
            addCriterion("removeflg <", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLessThanOrEqualTo(String value) {
            addCriterion("removeflg <=", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLike(String value) {
            addCriterion("removeflg like", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotLike(String value) {
            addCriterion("removeflg not like", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIn(List<String> values) {
            addCriterion("removeflg in", values, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotIn(List<String> values) {
            addCriterion("removeflg not in", values, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgBetween(String value1, String value2) {
            addCriterion("removeflg between", value1, value2, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotBetween(String value1, String value2) {
            addCriterion("removeflg not between", value1, value2, "removeflg");
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