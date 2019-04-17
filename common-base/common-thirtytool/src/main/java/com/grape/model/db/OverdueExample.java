package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverdueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OverdueExample() {
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

        public Criteria andOverduetermIsNull() {
            addCriterion("overdueterm is null");
            return (Criteria) this;
        }

        public Criteria andOverduetermIsNotNull() {
            addCriterion("overdueterm is not null");
            return (Criteria) this;
        }

        public Criteria andOverduetermEqualTo(String value) {
            addCriterion("overdueterm =", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermNotEqualTo(String value) {
            addCriterion("overdueterm <>", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermGreaterThan(String value) {
            addCriterion("overdueterm >", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermGreaterThanOrEqualTo(String value) {
            addCriterion("overdueterm >=", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermLessThan(String value) {
            addCriterion("overdueterm <", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermLessThanOrEqualTo(String value) {
            addCriterion("overdueterm <=", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermLike(String value) {
            addCriterion("overdueterm like", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermNotLike(String value) {
            addCriterion("overdueterm not like", value, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermIn(List<String> values) {
            addCriterion("overdueterm in", values, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermNotIn(List<String> values) {
            addCriterion("overdueterm not in", values, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermBetween(String value1, String value2) {
            addCriterion("overdueterm between", value1, value2, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduetermNotBetween(String value1, String value2) {
            addCriterion("overdueterm not between", value1, value2, "overdueterm");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusIsNull() {
            addCriterion("overduecorpus is null");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusIsNotNull() {
            addCriterion("overduecorpus is not null");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusEqualTo(BigDecimal value) {
            addCriterion("overduecorpus =", value, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusNotEqualTo(BigDecimal value) {
            addCriterion("overduecorpus <>", value, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusGreaterThan(BigDecimal value) {
            addCriterion("overduecorpus >", value, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overduecorpus >=", value, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusLessThan(BigDecimal value) {
            addCriterion("overduecorpus <", value, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overduecorpus <=", value, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusIn(List<BigDecimal> values) {
            addCriterion("overduecorpus in", values, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusNotIn(List<BigDecimal> values) {
            addCriterion("overduecorpus not in", values, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overduecorpus between", value1, value2, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverduecorpusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overduecorpus not between", value1, value2, "overduecorpus");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualIsNull() {
            addCriterion("overdueaccrual is null");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualIsNotNull() {
            addCriterion("overdueaccrual is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualEqualTo(BigDecimal value) {
            addCriterion("overdueaccrual =", value, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualNotEqualTo(BigDecimal value) {
            addCriterion("overdueaccrual <>", value, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualGreaterThan(BigDecimal value) {
            addCriterion("overdueaccrual >", value, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueaccrual >=", value, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualLessThan(BigDecimal value) {
            addCriterion("overdueaccrual <", value, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueaccrual <=", value, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualIn(List<BigDecimal> values) {
            addCriterion("overdueaccrual in", values, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualNotIn(List<BigDecimal> values) {
            addCriterion("overdueaccrual not in", values, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueaccrual between", value1, value2, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andOverdueaccrualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueaccrual not between", value1, value2, "overdueaccrual");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestIsNull() {
            addCriterion("defaultinterest is null");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestIsNotNull() {
            addCriterion("defaultinterest is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestEqualTo(BigDecimal value) {
            addCriterion("defaultinterest =", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestNotEqualTo(BigDecimal value) {
            addCriterion("defaultinterest <>", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestGreaterThan(BigDecimal value) {
            addCriterion("defaultinterest >", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("defaultinterest >=", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestLessThan(BigDecimal value) {
            addCriterion("defaultinterest <", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("defaultinterest <=", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestIn(List<BigDecimal> values) {
            addCriterion("defaultinterest in", values, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestNotIn(List<BigDecimal> values) {
            addCriterion("defaultinterest not in", values, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defaultinterest between", value1, value2, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("defaultinterest not between", value1, value2, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentIsNull() {
            addCriterion("delayingpayment is null");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentIsNotNull() {
            addCriterion("delayingpayment is not null");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentEqualTo(BigDecimal value) {
            addCriterion("delayingpayment =", value, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentNotEqualTo(BigDecimal value) {
            addCriterion("delayingpayment <>", value, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentGreaterThan(BigDecimal value) {
            addCriterion("delayingpayment >", value, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delayingpayment >=", value, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentLessThan(BigDecimal value) {
            addCriterion("delayingpayment <", value, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delayingpayment <=", value, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentIn(List<BigDecimal> values) {
            addCriterion("delayingpayment in", values, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentNotIn(List<BigDecimal> values) {
            addCriterion("delayingpayment not in", values, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delayingpayment between", value1, value2, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delayingpayment not between", value1, value2, "delayingpayment");
            return (Criteria) this;
        }

        public Criteria andLatetimeIsNull() {
            addCriterion("latetime is null");
            return (Criteria) this;
        }

        public Criteria andLatetimeIsNotNull() {
            addCriterion("latetime is not null");
            return (Criteria) this;
        }

        public Criteria andLatetimeEqualTo(Date value) {
            addCriterion("latetime =", value, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeNotEqualTo(Date value) {
            addCriterion("latetime <>", value, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeGreaterThan(Date value) {
            addCriterion("latetime >", value, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("latetime >=", value, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeLessThan(Date value) {
            addCriterion("latetime <", value, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeLessThanOrEqualTo(Date value) {
            addCriterion("latetime <=", value, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeIn(List<Date> values) {
            addCriterion("latetime in", values, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeNotIn(List<Date> values) {
            addCriterion("latetime not in", values, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeBetween(Date value1, Date value2) {
            addCriterion("latetime between", value1, value2, "latetime");
            return (Criteria) this;
        }

        public Criteria andLatetimeNotBetween(Date value1, Date value2) {
            addCriterion("latetime not between", value1, value2, "latetime");
            return (Criteria) this;
        }

        public Criteria andOverduedaysIsNull() {
            addCriterion("overduedays is null");
            return (Criteria) this;
        }

        public Criteria andOverduedaysIsNotNull() {
            addCriterion("overduedays is not null");
            return (Criteria) this;
        }

        public Criteria andOverduedaysEqualTo(Integer value) {
            addCriterion("overduedays =", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysNotEqualTo(Integer value) {
            addCriterion("overduedays <>", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysGreaterThan(Integer value) {
            addCriterion("overduedays >", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("overduedays >=", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysLessThan(Integer value) {
            addCriterion("overduedays <", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysLessThanOrEqualTo(Integer value) {
            addCriterion("overduedays <=", value, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysIn(List<Integer> values) {
            addCriterion("overduedays in", values, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysNotIn(List<Integer> values) {
            addCriterion("overduedays not in", values, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysBetween(Integer value1, Integer value2) {
            addCriterion("overduedays between", value1, value2, "overduedays");
            return (Criteria) this;
        }

        public Criteria andOverduedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("overduedays not between", value1, value2, "overduedays");
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