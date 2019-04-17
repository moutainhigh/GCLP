package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallhistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallhistExample() {
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

        public Criteria andCallidIsNull() {
            addCriterion("callid is null");
            return (Criteria) this;
        }

        public Criteria andCallidIsNotNull() {
            addCriterion("callid is not null");
            return (Criteria) this;
        }

        public Criteria andCallidEqualTo(String value) {
            addCriterion("callid =", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidNotEqualTo(String value) {
            addCriterion("callid <>", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidGreaterThan(String value) {
            addCriterion("callid >", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidGreaterThanOrEqualTo(String value) {
            addCriterion("callid >=", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidLessThan(String value) {
            addCriterion("callid <", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidLessThanOrEqualTo(String value) {
            addCriterion("callid <=", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidLike(String value) {
            addCriterion("callid like", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidNotLike(String value) {
            addCriterion("callid not like", value, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidIn(List<String> values) {
            addCriterion("callid in", values, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidNotIn(List<String> values) {
            addCriterion("callid not in", values, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidBetween(String value1, String value2) {
            addCriterion("callid between", value1, value2, "callid");
            return (Criteria) this;
        }

        public Criteria andCallidNotBetween(String value1, String value2) {
            addCriterion("callid not between", value1, value2, "callid");
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

        public Criteria andCustnameIsNull() {
            addCriterion("custname is null");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNotNull() {
            addCriterion("custname is not null");
            return (Criteria) this;
        }

        public Criteria andCustnameEqualTo(String value) {
            addCriterion("custname =", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotEqualTo(String value) {
            addCriterion("custname <>", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThan(String value) {
            addCriterion("custname >", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThanOrEqualTo(String value) {
            addCriterion("custname >=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThan(String value) {
            addCriterion("custname <", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThanOrEqualTo(String value) {
            addCriterion("custname <=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLike(String value) {
            addCriterion("custname like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotLike(String value) {
            addCriterion("custname not like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameIn(List<String> values) {
            addCriterion("custname in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotIn(List<String> values) {
            addCriterion("custname not in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameBetween(String value1, String value2) {
            addCriterion("custname between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotBetween(String value1, String value2) {
            addCriterion("custname not between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustphoneIsNull() {
            addCriterion("custphone is null");
            return (Criteria) this;
        }

        public Criteria andCustphoneIsNotNull() {
            addCriterion("custphone is not null");
            return (Criteria) this;
        }

        public Criteria andCustphoneEqualTo(String value) {
            addCriterion("custphone =", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotEqualTo(String value) {
            addCriterion("custphone <>", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneGreaterThan(String value) {
            addCriterion("custphone >", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneGreaterThanOrEqualTo(String value) {
            addCriterion("custphone >=", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneLessThan(String value) {
            addCriterion("custphone <", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneLessThanOrEqualTo(String value) {
            addCriterion("custphone <=", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneLike(String value) {
            addCriterion("custphone like", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotLike(String value) {
            addCriterion("custphone not like", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneIn(List<String> values) {
            addCriterion("custphone in", values, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotIn(List<String> values) {
            addCriterion("custphone not in", values, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneBetween(String value1, String value2) {
            addCriterion("custphone between", value1, value2, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotBetween(String value1, String value2) {
            addCriterion("custphone not between", value1, value2, "custphone");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNull() {
            addCriterion("custtype is null");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNotNull() {
            addCriterion("custtype is not null");
            return (Criteria) this;
        }

        public Criteria andCusttypeEqualTo(String value) {
            addCriterion("custtype =", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotEqualTo(String value) {
            addCriterion("custtype <>", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThan(String value) {
            addCriterion("custtype >", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThanOrEqualTo(String value) {
            addCriterion("custtype >=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThan(String value) {
            addCriterion("custtype <", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThanOrEqualTo(String value) {
            addCriterion("custtype <=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLike(String value) {
            addCriterion("custtype like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotLike(String value) {
            addCriterion("custtype not like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeIn(List<String> values) {
            addCriterion("custtype in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotIn(List<String> values) {
            addCriterion("custtype not in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeBetween(String value1, String value2) {
            addCriterion("custtype between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotBetween(String value1, String value2) {
            addCriterion("custtype not between", value1, value2, "custtype");
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