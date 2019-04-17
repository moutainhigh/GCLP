package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserapproveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserapproveExample() {
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

        public Criteria andAreridIsNull() {
            addCriterion("arerid is null");
            return (Criteria) this;
        }

        public Criteria andAreridIsNotNull() {
            addCriterion("arerid is not null");
            return (Criteria) this;
        }

        public Criteria andAreridEqualTo(String value) {
            addCriterion("arerid =", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridNotEqualTo(String value) {
            addCriterion("arerid <>", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridGreaterThan(String value) {
            addCriterion("arerid >", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridGreaterThanOrEqualTo(String value) {
            addCriterion("arerid >=", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridLessThan(String value) {
            addCriterion("arerid <", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridLessThanOrEqualTo(String value) {
            addCriterion("arerid <=", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridLike(String value) {
            addCriterion("arerid like", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridNotLike(String value) {
            addCriterion("arerid not like", value, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridIn(List<String> values) {
            addCriterion("arerid in", values, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridNotIn(List<String> values) {
            addCriterion("arerid not in", values, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridBetween(String value1, String value2) {
            addCriterion("arerid between", value1, value2, "arerid");
            return (Criteria) this;
        }

        public Criteria andAreridNotBetween(String value1, String value2) {
            addCriterion("arerid not between", value1, value2, "arerid");
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andAmtlowIsNull() {
            addCriterion("amtlow is null");
            return (Criteria) this;
        }

        public Criteria andAmtlowIsNotNull() {
            addCriterion("amtlow is not null");
            return (Criteria) this;
        }

        public Criteria andAmtlowEqualTo(BigDecimal value) {
            addCriterion("amtlow =", value, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowNotEqualTo(BigDecimal value) {
            addCriterion("amtlow <>", value, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowGreaterThan(BigDecimal value) {
            addCriterion("amtlow >", value, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amtlow >=", value, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowLessThan(BigDecimal value) {
            addCriterion("amtlow <", value, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amtlow <=", value, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowIn(List<BigDecimal> values) {
            addCriterion("amtlow in", values, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowNotIn(List<BigDecimal> values) {
            addCriterion("amtlow not in", values, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amtlow between", value1, value2, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmtlowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amtlow not between", value1, value2, "amtlow");
            return (Criteria) this;
        }

        public Criteria andAmthighIsNull() {
            addCriterion("amthigh is null");
            return (Criteria) this;
        }

        public Criteria andAmthighIsNotNull() {
            addCriterion("amthigh is not null");
            return (Criteria) this;
        }

        public Criteria andAmthighEqualTo(BigDecimal value) {
            addCriterion("amthigh =", value, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighNotEqualTo(BigDecimal value) {
            addCriterion("amthigh <>", value, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighGreaterThan(BigDecimal value) {
            addCriterion("amthigh >", value, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amthigh >=", value, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighLessThan(BigDecimal value) {
            addCriterion("amthigh <", value, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amthigh <=", value, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighIn(List<BigDecimal> values) {
            addCriterion("amthigh in", values, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighNotIn(List<BigDecimal> values) {
            addCriterion("amthigh not in", values, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amthigh between", value1, value2, "amthigh");
            return (Criteria) this;
        }

        public Criteria andAmthighNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amthigh not between", value1, value2, "amthigh");
            return (Criteria) this;
        }

        public Criteria andQuotalowIsNull() {
            addCriterion("quotalow is null");
            return (Criteria) this;
        }

        public Criteria andQuotalowIsNotNull() {
            addCriterion("quotalow is not null");
            return (Criteria) this;
        }

        public Criteria andQuotalowEqualTo(BigDecimal value) {
            addCriterion("quotalow =", value, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowNotEqualTo(BigDecimal value) {
            addCriterion("quotalow <>", value, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowGreaterThan(BigDecimal value) {
            addCriterion("quotalow >", value, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quotalow >=", value, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowLessThan(BigDecimal value) {
            addCriterion("quotalow <", value, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quotalow <=", value, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowIn(List<BigDecimal> values) {
            addCriterion("quotalow in", values, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowNotIn(List<BigDecimal> values) {
            addCriterion("quotalow not in", values, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quotalow between", value1, value2, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotalowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quotalow not between", value1, value2, "quotalow");
            return (Criteria) this;
        }

        public Criteria andQuotahighIsNull() {
            addCriterion("quotahigh is null");
            return (Criteria) this;
        }

        public Criteria andQuotahighIsNotNull() {
            addCriterion("quotahigh is not null");
            return (Criteria) this;
        }

        public Criteria andQuotahighEqualTo(BigDecimal value) {
            addCriterion("quotahigh =", value, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighNotEqualTo(BigDecimal value) {
            addCriterion("quotahigh <>", value, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighGreaterThan(BigDecimal value) {
            addCriterion("quotahigh >", value, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quotahigh >=", value, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighLessThan(BigDecimal value) {
            addCriterion("quotahigh <", value, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quotahigh <=", value, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighIn(List<BigDecimal> values) {
            addCriterion("quotahigh in", values, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighNotIn(List<BigDecimal> values) {
            addCriterion("quotahigh not in", values, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quotahigh between", value1, value2, "quotahigh");
            return (Criteria) this;
        }

        public Criteria andQuotahighNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quotahigh not between", value1, value2, "quotahigh");
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