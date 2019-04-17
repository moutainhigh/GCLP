package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MortgagestateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MortgagestateExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logid is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logid is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(String value) {
            addCriterion("logid =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(String value) {
            addCriterion("logid <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(String value) {
            addCriterion("logid >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(String value) {
            addCriterion("logid >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(String value) {
            addCriterion("logid <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(String value) {
            addCriterion("logid <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLike(String value) {
            addCriterion("logid like", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotLike(String value) {
            addCriterion("logid not like", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<String> values) {
            addCriterion("logid in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<String> values) {
            addCriterion("logid not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(String value1, String value2) {
            addCriterion("logid between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(String value1, String value2) {
            addCriterion("logid not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNull() {
            addCriterion("mortgageid is null");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNotNull() {
            addCriterion("mortgageid is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageidEqualTo(String value) {
            addCriterion("mortgageid =", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotEqualTo(String value) {
            addCriterion("mortgageid <>", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThan(String value) {
            addCriterion("mortgageid >", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageid >=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThan(String value) {
            addCriterion("mortgageid <", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThanOrEqualTo(String value) {
            addCriterion("mortgageid <=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLike(String value) {
            addCriterion("mortgageid like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotLike(String value) {
            addCriterion("mortgageid not like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIn(List<String> values) {
            addCriterion("mortgageid in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotIn(List<String> values) {
            addCriterion("mortgageid not in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidBetween(String value1, String value2) {
            addCriterion("mortgageid between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotBetween(String value1, String value2) {
            addCriterion("mortgageid not between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteIsNull() {
            addCriterion("mortgagenote is null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteIsNotNull() {
            addCriterion("mortgagenote is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteEqualTo(String value) {
            addCriterion("mortgagenote =", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotEqualTo(String value) {
            addCriterion("mortgagenote <>", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteGreaterThan(String value) {
            addCriterion("mortgagenote >", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagenote >=", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteLessThan(String value) {
            addCriterion("mortgagenote <", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteLessThanOrEqualTo(String value) {
            addCriterion("mortgagenote <=", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteLike(String value) {
            addCriterion("mortgagenote like", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotLike(String value) {
            addCriterion("mortgagenote not like", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteIn(List<String> values) {
            addCriterion("mortgagenote in", values, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotIn(List<String> values) {
            addCriterion("mortgagenote not in", values, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteBetween(String value1, String value2) {
            addCriterion("mortgagenote between", value1, value2, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotBetween(String value1, String value2) {
            addCriterion("mortgagenote not between", value1, value2, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagestateIsNull() {
            addCriterion("mortgagestate is null");
            return (Criteria) this;
        }

        public Criteria andMortgagestateIsNotNull() {
            addCriterion("mortgagestate is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagestateEqualTo(String value) {
            addCriterion("mortgagestate =", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotEqualTo(String value) {
            addCriterion("mortgagestate <>", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateGreaterThan(String value) {
            addCriterion("mortgagestate >", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagestate >=", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateLessThan(String value) {
            addCriterion("mortgagestate <", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateLessThanOrEqualTo(String value) {
            addCriterion("mortgagestate <=", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateLike(String value) {
            addCriterion("mortgagestate like", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotLike(String value) {
            addCriterion("mortgagestate not like", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateIn(List<String> values) {
            addCriterion("mortgagestate in", values, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotIn(List<String> values) {
            addCriterion("mortgagestate not in", values, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateBetween(String value1, String value2) {
            addCriterion("mortgagestate between", value1, value2, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotBetween(String value1, String value2) {
            addCriterion("mortgagestate not between", value1, value2, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageIsNull() {
            addCriterion("checkstateimage is null");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageIsNotNull() {
            addCriterion("checkstateimage is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageEqualTo(String value) {
            addCriterion("checkstateimage =", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageNotEqualTo(String value) {
            addCriterion("checkstateimage <>", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageGreaterThan(String value) {
            addCriterion("checkstateimage >", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageGreaterThanOrEqualTo(String value) {
            addCriterion("checkstateimage >=", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageLessThan(String value) {
            addCriterion("checkstateimage <", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageLessThanOrEqualTo(String value) {
            addCriterion("checkstateimage <=", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageLike(String value) {
            addCriterion("checkstateimage like", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageNotLike(String value) {
            addCriterion("checkstateimage not like", value, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageIn(List<String> values) {
            addCriterion("checkstateimage in", values, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageNotIn(List<String> values) {
            addCriterion("checkstateimage not in", values, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageBetween(String value1, String value2) {
            addCriterion("checkstateimage between", value1, value2, "checkstateimage");
            return (Criteria) this;
        }

        public Criteria andCheckstateimageNotBetween(String value1, String value2) {
            addCriterion("checkstateimage not between", value1, value2, "checkstateimage");
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