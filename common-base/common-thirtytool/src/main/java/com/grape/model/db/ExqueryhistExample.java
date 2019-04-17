package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExqueryhistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExqueryhistExample() {
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

        public Criteria andInterfacenoIsNull() {
            addCriterion("interfaceno is null");
            return (Criteria) this;
        }

        public Criteria andInterfacenoIsNotNull() {
            addCriterion("interfaceno is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacenoEqualTo(String value) {
            addCriterion("interfaceno =", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoNotEqualTo(String value) {
            addCriterion("interfaceno <>", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoGreaterThan(String value) {
            addCriterion("interfaceno >", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoGreaterThanOrEqualTo(String value) {
            addCriterion("interfaceno >=", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoLessThan(String value) {
            addCriterion("interfaceno <", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoLessThanOrEqualTo(String value) {
            addCriterion("interfaceno <=", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoLike(String value) {
            addCriterion("interfaceno like", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoNotLike(String value) {
            addCriterion("interfaceno not like", value, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoIn(List<String> values) {
            addCriterion("interfaceno in", values, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoNotIn(List<String> values) {
            addCriterion("interfaceno not in", values, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoBetween(String value1, String value2) {
            addCriterion("interfaceno between", value1, value2, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andInterfacenoNotBetween(String value1, String value2) {
            addCriterion("interfaceno not between", value1, value2, "interfaceno");
            return (Criteria) this;
        }

        public Criteria andSuccessflagIsNull() {
            addCriterion("successflag is null");
            return (Criteria) this;
        }

        public Criteria andSuccessflagIsNotNull() {
            addCriterion("successflag is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessflagEqualTo(String value) {
            addCriterion("successflag =", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagNotEqualTo(String value) {
            addCriterion("successflag <>", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagGreaterThan(String value) {
            addCriterion("successflag >", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagGreaterThanOrEqualTo(String value) {
            addCriterion("successflag >=", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagLessThan(String value) {
            addCriterion("successflag <", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagLessThanOrEqualTo(String value) {
            addCriterion("successflag <=", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagLike(String value) {
            addCriterion("successflag like", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagNotLike(String value) {
            addCriterion("successflag not like", value, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagIn(List<String> values) {
            addCriterion("successflag in", values, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagNotIn(List<String> values) {
            addCriterion("successflag not in", values, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagBetween(String value1, String value2) {
            addCriterion("successflag between", value1, value2, "successflag");
            return (Criteria) this;
        }

        public Criteria andSuccessflagNotBetween(String value1, String value2) {
            addCriterion("successflag not between", value1, value2, "successflag");
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