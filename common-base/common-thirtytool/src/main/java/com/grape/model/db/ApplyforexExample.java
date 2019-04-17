package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ApplyforexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyforexExample() {
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

        public Criteria andMainborrowerIsNull() {
            addCriterion("mainborrower is null");
            return (Criteria) this;
        }

        public Criteria andMainborrowerIsNotNull() {
            addCriterion("mainborrower is not null");
            return (Criteria) this;
        }

        public Criteria andMainborrowerEqualTo(String value) {
            addCriterion("mainborrower =", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerNotEqualTo(String value) {
            addCriterion("mainborrower <>", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerGreaterThan(String value) {
            addCriterion("mainborrower >", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerGreaterThanOrEqualTo(String value) {
            addCriterion("mainborrower >=", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerLessThan(String value) {
            addCriterion("mainborrower <", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerLessThanOrEqualTo(String value) {
            addCriterion("mainborrower <=", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerLike(String value) {
            addCriterion("mainborrower like", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerNotLike(String value) {
            addCriterion("mainborrower not like", value, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerIn(List<String> values) {
            addCriterion("mainborrower in", values, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerNotIn(List<String> values) {
            addCriterion("mainborrower not in", values, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerBetween(String value1, String value2) {
            addCriterion("mainborrower between", value1, value2, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andMainborrowerNotBetween(String value1, String value2) {
            addCriterion("mainborrower not between", value1, value2, "mainborrower");
            return (Criteria) this;
        }

        public Criteria andIdentifinoIsNull() {
            addCriterion("identifino is null");
            return (Criteria) this;
        }

        public Criteria andIdentifinoIsNotNull() {
            addCriterion("identifino is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifinoEqualTo(String value) {
            addCriterion("identifino =", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoNotEqualTo(String value) {
            addCriterion("identifino <>", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoGreaterThan(String value) {
            addCriterion("identifino >", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoGreaterThanOrEqualTo(String value) {
            addCriterion("identifino >=", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoLessThan(String value) {
            addCriterion("identifino <", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoLessThanOrEqualTo(String value) {
            addCriterion("identifino <=", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoLike(String value) {
            addCriterion("identifino like", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoNotLike(String value) {
            addCriterion("identifino not like", value, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoIn(List<String> values) {
            addCriterion("identifino in", values, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoNotIn(List<String> values) {
            addCriterion("identifino not in", values, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoBetween(String value1, String value2) {
            addCriterion("identifino between", value1, value2, "identifino");
            return (Criteria) this;
        }

        public Criteria andIdentifinoNotBetween(String value1, String value2) {
            addCriterion("identifino not between", value1, value2, "identifino");
            return (Criteria) this;
        }

        public Criteria andExamountIsNull() {
            addCriterion("examount is null");
            return (Criteria) this;
        }

        public Criteria andExamountIsNotNull() {
            addCriterion("examount is not null");
            return (Criteria) this;
        }

        public Criteria andExamountEqualTo(BigDecimal value) {
            addCriterion("examount =", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountNotEqualTo(BigDecimal value) {
            addCriterion("examount <>", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountGreaterThan(BigDecimal value) {
            addCriterion("examount >", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("examount >=", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountLessThan(BigDecimal value) {
            addCriterion("examount <", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("examount <=", value, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountIn(List<BigDecimal> values) {
            addCriterion("examount in", values, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountNotIn(List<BigDecimal> values) {
            addCriterion("examount not in", values, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("examount between", value1, value2, "examount");
            return (Criteria) this;
        }

        public Criteria andExamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("examount not between", value1, value2, "examount");
            return (Criteria) this;
        }

        public Criteria andExageIsNull() {
            addCriterion("exage is null");
            return (Criteria) this;
        }

        public Criteria andExageIsNotNull() {
            addCriterion("exage is not null");
            return (Criteria) this;
        }

        public Criteria andExageEqualTo(String value) {
            addCriterion("exage =", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageNotEqualTo(String value) {
            addCriterion("exage <>", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageGreaterThan(String value) {
            addCriterion("exage >", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageGreaterThanOrEqualTo(String value) {
            addCriterion("exage >=", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageLessThan(String value) {
            addCriterion("exage <", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageLessThanOrEqualTo(String value) {
            addCriterion("exage <=", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageLike(String value) {
            addCriterion("exage like", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageNotLike(String value) {
            addCriterion("exage not like", value, "exage");
            return (Criteria) this;
        }

        public Criteria andExageIn(List<String> values) {
            addCriterion("exage in", values, "exage");
            return (Criteria) this;
        }

        public Criteria andExageNotIn(List<String> values) {
            addCriterion("exage not in", values, "exage");
            return (Criteria) this;
        }

        public Criteria andExageBetween(String value1, String value2) {
            addCriterion("exage between", value1, value2, "exage");
            return (Criteria) this;
        }

        public Criteria andExageNotBetween(String value1, String value2) {
            addCriterion("exage not between", value1, value2, "exage");
            return (Criteria) this;
        }

        public Criteria andExinterestrateIsNull() {
            addCriterion("exinterestrate is null");
            return (Criteria) this;
        }

        public Criteria andExinterestrateIsNotNull() {
            addCriterion("exinterestrate is not null");
            return (Criteria) this;
        }

        public Criteria andExinterestrateEqualTo(BigDecimal value) {
            addCriterion("exinterestrate =", value, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateNotEqualTo(BigDecimal value) {
            addCriterion("exinterestrate <>", value, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateGreaterThan(BigDecimal value) {
            addCriterion("exinterestrate >", value, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exinterestrate >=", value, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateLessThan(BigDecimal value) {
            addCriterion("exinterestrate <", value, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exinterestrate <=", value, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateIn(List<BigDecimal> values) {
            addCriterion("exinterestrate in", values, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateNotIn(List<BigDecimal> values) {
            addCriterion("exinterestrate not in", values, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exinterestrate between", value1, value2, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andExinterestrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exinterestrate not between", value1, value2, "exinterestrate");
            return (Criteria) this;
        }

        public Criteria andRepaymethodIsNull() {
            addCriterion("repaymethod is null");
            return (Criteria) this;
        }

        public Criteria andRepaymethodIsNotNull() {
            addCriterion("repaymethod is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymethodEqualTo(String value) {
            addCriterion("repaymethod =", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotEqualTo(String value) {
            addCriterion("repaymethod <>", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodGreaterThan(String value) {
            addCriterion("repaymethod >", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("repaymethod >=", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodLessThan(String value) {
            addCriterion("repaymethod <", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodLessThanOrEqualTo(String value) {
            addCriterion("repaymethod <=", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodLike(String value) {
            addCriterion("repaymethod like", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotLike(String value) {
            addCriterion("repaymethod not like", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodIn(List<String> values) {
            addCriterion("repaymethod in", values, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotIn(List<String> values) {
            addCriterion("repaymethod not in", values, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodBetween(String value1, String value2) {
            addCriterion("repaymethod between", value1, value2, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotBetween(String value1, String value2) {
            addCriterion("repaymethod not between", value1, value2, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andExreasonIsNull() {
            addCriterion("exreason is null");
            return (Criteria) this;
        }

        public Criteria andExreasonIsNotNull() {
            addCriterion("exreason is not null");
            return (Criteria) this;
        }

        public Criteria andExreasonEqualTo(String value) {
            addCriterion("exreason =", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonNotEqualTo(String value) {
            addCriterion("exreason <>", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonGreaterThan(String value) {
            addCriterion("exreason >", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonGreaterThanOrEqualTo(String value) {
            addCriterion("exreason >=", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonLessThan(String value) {
            addCriterion("exreason <", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonLessThanOrEqualTo(String value) {
            addCriterion("exreason <=", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonLike(String value) {
            addCriterion("exreason like", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonNotLike(String value) {
            addCriterion("exreason not like", value, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonIn(List<String> values) {
            addCriterion("exreason in", values, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonNotIn(List<String> values) {
            addCriterion("exreason not in", values, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonBetween(String value1, String value2) {
            addCriterion("exreason between", value1, value2, "exreason");
            return (Criteria) this;
        }

        public Criteria andExreasonNotBetween(String value1, String value2) {
            addCriterion("exreason not between", value1, value2, "exreason");
            return (Criteria) this;
        }

        public Criteria andNewworkidIsNull() {
            addCriterion("newworkid is null");
            return (Criteria) this;
        }

        public Criteria andNewworkidIsNotNull() {
            addCriterion("newworkid is not null");
            return (Criteria) this;
        }

        public Criteria andNewworkidEqualTo(String value) {
            addCriterion("newworkid =", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidNotEqualTo(String value) {
            addCriterion("newworkid <>", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidGreaterThan(String value) {
            addCriterion("newworkid >", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidGreaterThanOrEqualTo(String value) {
            addCriterion("newworkid >=", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidLessThan(String value) {
            addCriterion("newworkid <", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidLessThanOrEqualTo(String value) {
            addCriterion("newworkid <=", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidLike(String value) {
            addCriterion("newworkid like", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidNotLike(String value) {
            addCriterion("newworkid not like", value, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidIn(List<String> values) {
            addCriterion("newworkid in", values, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidNotIn(List<String> values) {
            addCriterion("newworkid not in", values, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidBetween(String value1, String value2) {
            addCriterion("newworkid between", value1, value2, "newworkid");
            return (Criteria) this;
        }

        public Criteria andNewworkidNotBetween(String value1, String value2) {
            addCriterion("newworkid not between", value1, value2, "newworkid");
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