package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class ProcconditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcconditionExample() {
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

        public Criteria andConditionidIsNull() {
            addCriterion("conditionid is null");
            return (Criteria) this;
        }

        public Criteria andConditionidIsNotNull() {
            addCriterion("conditionid is not null");
            return (Criteria) this;
        }

        public Criteria andConditionidEqualTo(String value) {
            addCriterion("conditionid =", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidNotEqualTo(String value) {
            addCriterion("conditionid <>", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidGreaterThan(String value) {
            addCriterion("conditionid >", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidGreaterThanOrEqualTo(String value) {
            addCriterion("conditionid >=", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidLessThan(String value) {
            addCriterion("conditionid <", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidLessThanOrEqualTo(String value) {
            addCriterion("conditionid <=", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidLike(String value) {
            addCriterion("conditionid like", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidNotLike(String value) {
            addCriterion("conditionid not like", value, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidIn(List<String> values) {
            addCriterion("conditionid in", values, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidNotIn(List<String> values) {
            addCriterion("conditionid not in", values, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidBetween(String value1, String value2) {
            addCriterion("conditionid between", value1, value2, "conditionid");
            return (Criteria) this;
        }

        public Criteria andConditionidNotBetween(String value1, String value2) {
            addCriterion("conditionid not between", value1, value2, "conditionid");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNull() {
            addCriterion("nodeid is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("nodeid is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(String value) {
            addCriterion("nodeid =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(String value) {
            addCriterion("nodeid <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(String value) {
            addCriterion("nodeid >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(String value) {
            addCriterion("nodeid >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(String value) {
            addCriterion("nodeid <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(String value) {
            addCriterion("nodeid <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLike(String value) {
            addCriterion("nodeid like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotLike(String value) {
            addCriterion("nodeid not like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<String> values) {
            addCriterion("nodeid in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<String> values) {
            addCriterion("nodeid not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(String value1, String value2) {
            addCriterion("nodeid between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(String value1, String value2) {
            addCriterion("nodeid not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andCondsIsNull() {
            addCriterion("conds is null");
            return (Criteria) this;
        }

        public Criteria andCondsIsNotNull() {
            addCriterion("conds is not null");
            return (Criteria) this;
        }

        public Criteria andCondsEqualTo(String value) {
            addCriterion("conds =", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotEqualTo(String value) {
            addCriterion("conds <>", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsGreaterThan(String value) {
            addCriterion("conds >", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsGreaterThanOrEqualTo(String value) {
            addCriterion("conds >=", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsLessThan(String value) {
            addCriterion("conds <", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsLessThanOrEqualTo(String value) {
            addCriterion("conds <=", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsLike(String value) {
            addCriterion("conds like", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotLike(String value) {
            addCriterion("conds not like", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsIn(List<String> values) {
            addCriterion("conds in", values, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotIn(List<String> values) {
            addCriterion("conds not in", values, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsBetween(String value1, String value2) {
            addCriterion("conds between", value1, value2, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotBetween(String value1, String value2) {
            addCriterion("conds not between", value1, value2, "conds");
            return (Criteria) this;
        }

        public Criteria andAppearIsNull() {
            addCriterion("appear is null");
            return (Criteria) this;
        }

        public Criteria andAppearIsNotNull() {
            addCriterion("appear is not null");
            return (Criteria) this;
        }

        public Criteria andAppearEqualTo(String value) {
            addCriterion("appear =", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearNotEqualTo(String value) {
            addCriterion("appear <>", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearGreaterThan(String value) {
            addCriterion("appear >", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearGreaterThanOrEqualTo(String value) {
            addCriterion("appear >=", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearLessThan(String value) {
            addCriterion("appear <", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearLessThanOrEqualTo(String value) {
            addCriterion("appear <=", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearLike(String value) {
            addCriterion("appear like", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearNotLike(String value) {
            addCriterion("appear not like", value, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearIn(List<String> values) {
            addCriterion("appear in", values, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearNotIn(List<String> values) {
            addCriterion("appear not in", values, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearBetween(String value1, String value2) {
            addCriterion("appear between", value1, value2, "appear");
            return (Criteria) this;
        }

        public Criteria andAppearNotBetween(String value1, String value2) {
            addCriterion("appear not between", value1, value2, "appear");
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