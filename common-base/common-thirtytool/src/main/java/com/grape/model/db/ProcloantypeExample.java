package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcloantypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcloantypeExample() {
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

        public Criteria andProductnoIsNull() {
            addCriterion("productno is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("productno is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("productno =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("productno <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("productno >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("productno >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("productno <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("productno <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("productno like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("productno not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("productno in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("productno not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("productno between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("productno not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andTermofloanIsNull() {
            addCriterion("termofloan is null");
            return (Criteria) this;
        }

        public Criteria andTermofloanIsNotNull() {
            addCriterion("termofloan is not null");
            return (Criteria) this;
        }

        public Criteria andTermofloanEqualTo(String value) {
            addCriterion("termofloan =", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanNotEqualTo(String value) {
            addCriterion("termofloan <>", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanGreaterThan(String value) {
            addCriterion("termofloan >", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanGreaterThanOrEqualTo(String value) {
            addCriterion("termofloan >=", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanLessThan(String value) {
            addCriterion("termofloan <", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanLessThanOrEqualTo(String value) {
            addCriterion("termofloan <=", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanLike(String value) {
            addCriterion("termofloan like", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanNotLike(String value) {
            addCriterion("termofloan not like", value, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanIn(List<String> values) {
            addCriterion("termofloan in", values, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanNotIn(List<String> values) {
            addCriterion("termofloan not in", values, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanBetween(String value1, String value2) {
            addCriterion("termofloan between", value1, value2, "termofloan");
            return (Criteria) this;
        }

        public Criteria andTermofloanNotBetween(String value1, String value2) {
            addCriterion("termofloan not between", value1, value2, "termofloan");
            return (Criteria) this;
        }

        public Criteria andSubloanflgIsNull() {
            addCriterion("subloanflg is null");
            return (Criteria) this;
        }

        public Criteria andSubloanflgIsNotNull() {
            addCriterion("subloanflg is not null");
            return (Criteria) this;
        }

        public Criteria andSubloanflgEqualTo(String value) {
            addCriterion("subloanflg =", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgNotEqualTo(String value) {
            addCriterion("subloanflg <>", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgGreaterThan(String value) {
            addCriterion("subloanflg >", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgGreaterThanOrEqualTo(String value) {
            addCriterion("subloanflg >=", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgLessThan(String value) {
            addCriterion("subloanflg <", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgLessThanOrEqualTo(String value) {
            addCriterion("subloanflg <=", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgLike(String value) {
            addCriterion("subloanflg like", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgNotLike(String value) {
            addCriterion("subloanflg not like", value, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgIn(List<String> values) {
            addCriterion("subloanflg in", values, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgNotIn(List<String> values) {
            addCriterion("subloanflg not in", values, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgBetween(String value1, String value2) {
            addCriterion("subloanflg between", value1, value2, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andSubloanflgNotBetween(String value1, String value2) {
            addCriterion("subloanflg not between", value1, value2, "subloanflg");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioIsNull() {
            addCriterion("firstloanratio is null");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioIsNotNull() {
            addCriterion("firstloanratio is not null");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioEqualTo(BigDecimal value) {
            addCriterion("firstloanratio =", value, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioNotEqualTo(BigDecimal value) {
            addCriterion("firstloanratio <>", value, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioGreaterThan(BigDecimal value) {
            addCriterion("firstloanratio >", value, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("firstloanratio >=", value, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioLessThan(BigDecimal value) {
            addCriterion("firstloanratio <", value, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("firstloanratio <=", value, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioIn(List<BigDecimal> values) {
            addCriterion("firstloanratio in", values, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioNotIn(List<BigDecimal> values) {
            addCriterion("firstloanratio not in", values, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("firstloanratio between", value1, value2, "firstloanratio");
            return (Criteria) this;
        }

        public Criteria andFirstloanratioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("firstloanratio not between", value1, value2, "firstloanratio");
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