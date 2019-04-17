package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsultExample() {
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

        public Criteria andConsultmanIsNull() {
            addCriterion("consultman is null");
            return (Criteria) this;
        }

        public Criteria andConsultmanIsNotNull() {
            addCriterion("consultman is not null");
            return (Criteria) this;
        }

        public Criteria andConsultmanEqualTo(String value) {
            addCriterion("consultman =", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanNotEqualTo(String value) {
            addCriterion("consultman <>", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanGreaterThan(String value) {
            addCriterion("consultman >", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanGreaterThanOrEqualTo(String value) {
            addCriterion("consultman >=", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanLessThan(String value) {
            addCriterion("consultman <", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanLessThanOrEqualTo(String value) {
            addCriterion("consultman <=", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanLike(String value) {
            addCriterion("consultman like", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanNotLike(String value) {
            addCriterion("consultman not like", value, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanIn(List<String> values) {
            addCriterion("consultman in", values, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanNotIn(List<String> values) {
            addCriterion("consultman not in", values, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanBetween(String value1, String value2) {
            addCriterion("consultman between", value1, value2, "consultman");
            return (Criteria) this;
        }

        public Criteria andConsultmanNotBetween(String value1, String value2) {
            addCriterion("consultman not between", value1, value2, "consultman");
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

        public Criteria andMortgagenoIsNull() {
            addCriterion("mortgageno is null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoIsNotNull() {
            addCriterion("mortgageno is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoEqualTo(String value) {
            addCriterion("mortgageno =", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotEqualTo(String value) {
            addCriterion("mortgageno <>", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoGreaterThan(String value) {
            addCriterion("mortgageno >", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageno >=", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLessThan(String value) {
            addCriterion("mortgageno <", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLessThanOrEqualTo(String value) {
            addCriterion("mortgageno <=", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLike(String value) {
            addCriterion("mortgageno like", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotLike(String value) {
            addCriterion("mortgageno not like", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoIn(List<String> values) {
            addCriterion("mortgageno in", values, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotIn(List<String> values) {
            addCriterion("mortgageno not in", values, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoBetween(String value1, String value2) {
            addCriterion("mortgageno between", value1, value2, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotBetween(String value1, String value2) {
            addCriterion("mortgageno not between", value1, value2, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andConsultresultIsNull() {
            addCriterion("consultresult is null");
            return (Criteria) this;
        }

        public Criteria andConsultresultIsNotNull() {
            addCriterion("consultresult is not null");
            return (Criteria) this;
        }

        public Criteria andConsultresultEqualTo(String value) {
            addCriterion("consultresult =", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultNotEqualTo(String value) {
            addCriterion("consultresult <>", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultGreaterThan(String value) {
            addCriterion("consultresult >", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultGreaterThanOrEqualTo(String value) {
            addCriterion("consultresult >=", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultLessThan(String value) {
            addCriterion("consultresult <", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultLessThanOrEqualTo(String value) {
            addCriterion("consultresult <=", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultLike(String value) {
            addCriterion("consultresult like", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultNotLike(String value) {
            addCriterion("consultresult not like", value, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultIn(List<String> values) {
            addCriterion("consultresult in", values, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultNotIn(List<String> values) {
            addCriterion("consultresult not in", values, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultBetween(String value1, String value2) {
            addCriterion("consultresult between", value1, value2, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultresultNotBetween(String value1, String value2) {
            addCriterion("consultresult not between", value1, value2, "consultresult");
            return (Criteria) this;
        }

        public Criteria andConsultstateIsNull() {
            addCriterion("consultstate is null");
            return (Criteria) this;
        }

        public Criteria andConsultstateIsNotNull() {
            addCriterion("consultstate is not null");
            return (Criteria) this;
        }

        public Criteria andConsultstateEqualTo(String value) {
            addCriterion("consultstate =", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateNotEqualTo(String value) {
            addCriterion("consultstate <>", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateGreaterThan(String value) {
            addCriterion("consultstate >", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateGreaterThanOrEqualTo(String value) {
            addCriterion("consultstate >=", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateLessThan(String value) {
            addCriterion("consultstate <", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateLessThanOrEqualTo(String value) {
            addCriterion("consultstate <=", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateLike(String value) {
            addCriterion("consultstate like", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateNotLike(String value) {
            addCriterion("consultstate not like", value, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateIn(List<String> values) {
            addCriterion("consultstate in", values, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateNotIn(List<String> values) {
            addCriterion("consultstate not in", values, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateBetween(String value1, String value2) {
            addCriterion("consultstate between", value1, value2, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultstateNotBetween(String value1, String value2) {
            addCriterion("consultstate not between", value1, value2, "consultstate");
            return (Criteria) this;
        }

        public Criteria andConsultdateIsNull() {
            addCriterion("consultdate is null");
            return (Criteria) this;
        }

        public Criteria andConsultdateIsNotNull() {
            addCriterion("consultdate is not null");
            return (Criteria) this;
        }

        public Criteria andConsultdateEqualTo(Date value) {
            addCriterion("consultdate =", value, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateNotEqualTo(Date value) {
            addCriterion("consultdate <>", value, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateGreaterThan(Date value) {
            addCriterion("consultdate >", value, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateGreaterThanOrEqualTo(Date value) {
            addCriterion("consultdate >=", value, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateLessThan(Date value) {
            addCriterion("consultdate <", value, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateLessThanOrEqualTo(Date value) {
            addCriterion("consultdate <=", value, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateIn(List<Date> values) {
            addCriterion("consultdate in", values, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateNotIn(List<Date> values) {
            addCriterion("consultdate not in", values, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateBetween(Date value1, Date value2) {
            addCriterion("consultdate between", value1, value2, "consultdate");
            return (Criteria) this;
        }

        public Criteria andConsultdateNotBetween(Date value1, Date value2) {
            addCriterion("consultdate not between", value1, value2, "consultdate");
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