package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class RiskinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskinfoExample() {
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

        public Criteria andRiskadviceIsNull() {
            addCriterion("riskadvice is null");
            return (Criteria) this;
        }

        public Criteria andRiskadviceIsNotNull() {
            addCriterion("riskadvice is not null");
            return (Criteria) this;
        }

        public Criteria andRiskadviceEqualTo(String value) {
            addCriterion("riskadvice =", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceNotEqualTo(String value) {
            addCriterion("riskadvice <>", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceGreaterThan(String value) {
            addCriterion("riskadvice >", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceGreaterThanOrEqualTo(String value) {
            addCriterion("riskadvice >=", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceLessThan(String value) {
            addCriterion("riskadvice <", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceLessThanOrEqualTo(String value) {
            addCriterion("riskadvice <=", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceLike(String value) {
            addCriterion("riskadvice like", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceNotLike(String value) {
            addCriterion("riskadvice not like", value, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceIn(List<String> values) {
            addCriterion("riskadvice in", values, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceNotIn(List<String> values) {
            addCriterion("riskadvice not in", values, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceBetween(String value1, String value2) {
            addCriterion("riskadvice between", value1, value2, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskadviceNotBetween(String value1, String value2) {
            addCriterion("riskadvice not between", value1, value2, "riskadvice");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureIsNull() {
            addCriterion("riskdiclosure is null");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureIsNotNull() {
            addCriterion("riskdiclosure is not null");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureEqualTo(String value) {
            addCriterion("riskdiclosure =", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureNotEqualTo(String value) {
            addCriterion("riskdiclosure <>", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureGreaterThan(String value) {
            addCriterion("riskdiclosure >", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureGreaterThanOrEqualTo(String value) {
            addCriterion("riskdiclosure >=", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureLessThan(String value) {
            addCriterion("riskdiclosure <", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureLessThanOrEqualTo(String value) {
            addCriterion("riskdiclosure <=", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureLike(String value) {
            addCriterion("riskdiclosure like", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureNotLike(String value) {
            addCriterion("riskdiclosure not like", value, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureIn(List<String> values) {
            addCriterion("riskdiclosure in", values, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureNotIn(List<String> values) {
            addCriterion("riskdiclosure not in", values, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureBetween(String value1, String value2) {
            addCriterion("riskdiclosure between", value1, value2, "riskdiclosure");
            return (Criteria) this;
        }

        public Criteria andRiskdiclosureNotBetween(String value1, String value2) {
            addCriterion("riskdiclosure not between", value1, value2, "riskdiclosure");
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