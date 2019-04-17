package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OtherapplyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OtherapplyinfoExample() {
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

        public Criteria andUsageofloanIsNull() {
            addCriterion("usageofloan is null");
            return (Criteria) this;
        }

        public Criteria andUsageofloanIsNotNull() {
            addCriterion("usageofloan is not null");
            return (Criteria) this;
        }

        public Criteria andUsageofloanEqualTo(String value) {
            addCriterion("usageofloan =", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanNotEqualTo(String value) {
            addCriterion("usageofloan <>", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanGreaterThan(String value) {
            addCriterion("usageofloan >", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanGreaterThanOrEqualTo(String value) {
            addCriterion("usageofloan >=", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanLessThan(String value) {
            addCriterion("usageofloan <", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanLessThanOrEqualTo(String value) {
            addCriterion("usageofloan <=", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanLike(String value) {
            addCriterion("usageofloan like", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanNotLike(String value) {
            addCriterion("usageofloan not like", value, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanIn(List<String> values) {
            addCriterion("usageofloan in", values, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanNotIn(List<String> values) {
            addCriterion("usageofloan not in", values, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanBetween(String value1, String value2) {
            addCriterion("usageofloan between", value1, value2, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageofloanNotBetween(String value1, String value2) {
            addCriterion("usageofloan not between", value1, value2, "usageofloan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanIsNull() {
            addCriterion("usageloanplan is null");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanIsNotNull() {
            addCriterion("usageloanplan is not null");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanEqualTo(String value) {
            addCriterion("usageloanplan =", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanNotEqualTo(String value) {
            addCriterion("usageloanplan <>", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanGreaterThan(String value) {
            addCriterion("usageloanplan >", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanGreaterThanOrEqualTo(String value) {
            addCriterion("usageloanplan >=", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanLessThan(String value) {
            addCriterion("usageloanplan <", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanLessThanOrEqualTo(String value) {
            addCriterion("usageloanplan <=", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanLike(String value) {
            addCriterion("usageloanplan like", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanNotLike(String value) {
            addCriterion("usageloanplan not like", value, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanIn(List<String> values) {
            addCriterion("usageloanplan in", values, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanNotIn(List<String> values) {
            addCriterion("usageloanplan not in", values, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanBetween(String value1, String value2) {
            addCriterion("usageloanplan between", value1, value2, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andUsageloanplanNotBetween(String value1, String value2) {
            addCriterion("usageloanplan not between", value1, value2, "usageloanplan");
            return (Criteria) this;
        }

        public Criteria andRepaysourceIsNull() {
            addCriterion("repaysource is null");
            return (Criteria) this;
        }

        public Criteria andRepaysourceIsNotNull() {
            addCriterion("repaysource is not null");
            return (Criteria) this;
        }

        public Criteria andRepaysourceEqualTo(String value) {
            addCriterion("repaysource =", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceNotEqualTo(String value) {
            addCriterion("repaysource <>", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceGreaterThan(String value) {
            addCriterion("repaysource >", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceGreaterThanOrEqualTo(String value) {
            addCriterion("repaysource >=", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceLessThan(String value) {
            addCriterion("repaysource <", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceLessThanOrEqualTo(String value) {
            addCriterion("repaysource <=", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceLike(String value) {
            addCriterion("repaysource like", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceNotLike(String value) {
            addCriterion("repaysource not like", value, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceIn(List<String> values) {
            addCriterion("repaysource in", values, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceNotIn(List<String> values) {
            addCriterion("repaysource not in", values, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceBetween(String value1, String value2) {
            addCriterion("repaysource between", value1, value2, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepaysourceNotBetween(String value1, String value2) {
            addCriterion("repaysource not between", value1, value2, "repaysource");
            return (Criteria) this;
        }

        public Criteria andRepayplanIsNull() {
            addCriterion("repayplan is null");
            return (Criteria) this;
        }

        public Criteria andRepayplanIsNotNull() {
            addCriterion("repayplan is not null");
            return (Criteria) this;
        }

        public Criteria andRepayplanEqualTo(String value) {
            addCriterion("repayplan =", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanNotEqualTo(String value) {
            addCriterion("repayplan <>", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanGreaterThan(String value) {
            addCriterion("repayplan >", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanGreaterThanOrEqualTo(String value) {
            addCriterion("repayplan >=", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanLessThan(String value) {
            addCriterion("repayplan <", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanLessThanOrEqualTo(String value) {
            addCriterion("repayplan <=", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanLike(String value) {
            addCriterion("repayplan like", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanNotLike(String value) {
            addCriterion("repayplan not like", value, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanIn(List<String> values) {
            addCriterion("repayplan in", values, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanNotIn(List<String> values) {
            addCriterion("repayplan not in", values, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanBetween(String value1, String value2) {
            addCriterion("repayplan between", value1, value2, "repayplan");
            return (Criteria) this;
        }

        public Criteria andRepayplanNotBetween(String value1, String value2) {
            addCriterion("repayplan not between", value1, value2, "repayplan");
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