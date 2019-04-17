package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditinfoofcomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditinfoofcomExample() {
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

        public Criteria andComcreditdateIsNull() {
            addCriterion("comcreditdate is null");
            return (Criteria) this;
        }

        public Criteria andComcreditdateIsNotNull() {
            addCriterion("comcreditdate is not null");
            return (Criteria) this;
        }

        public Criteria andComcreditdateEqualTo(Date value) {
            addCriterion("comcreditdate =", value, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateNotEqualTo(Date value) {
            addCriterion("comcreditdate <>", value, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateGreaterThan(Date value) {
            addCriterion("comcreditdate >", value, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("comcreditdate >=", value, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateLessThan(Date value) {
            addCriterion("comcreditdate <", value, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateLessThanOrEqualTo(Date value) {
            addCriterion("comcreditdate <=", value, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateIn(List<Date> values) {
            addCriterion("comcreditdate in", values, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateNotIn(List<Date> values) {
            addCriterion("comcreditdate not in", values, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateBetween(Date value1, Date value2) {
            addCriterion("comcreditdate between", value1, value2, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andComcreditdateNotBetween(Date value1, Date value2) {
            addCriterion("comcreditdate not between", value1, value2, "comcreditdate");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditIsNull() {
            addCriterion("isblackofcredit is null");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditIsNotNull() {
            addCriterion("isblackofcredit is not null");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditEqualTo(String value) {
            addCriterion("isblackofcredit =", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditNotEqualTo(String value) {
            addCriterion("isblackofcredit <>", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditGreaterThan(String value) {
            addCriterion("isblackofcredit >", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditGreaterThanOrEqualTo(String value) {
            addCriterion("isblackofcredit >=", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditLessThan(String value) {
            addCriterion("isblackofcredit <", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditLessThanOrEqualTo(String value) {
            addCriterion("isblackofcredit <=", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditLike(String value) {
            addCriterion("isblackofcredit like", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditNotLike(String value) {
            addCriterion("isblackofcredit not like", value, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditIn(List<String> values) {
            addCriterion("isblackofcredit in", values, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditNotIn(List<String> values) {
            addCriterion("isblackofcredit not in", values, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditBetween(String value1, String value2) {
            addCriterion("isblackofcredit between", value1, value2, "isblackofcredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditNotBetween(String value1, String value2) {
            addCriterion("isblackofcredit not between", value1, value2, "isblackofcredit");
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