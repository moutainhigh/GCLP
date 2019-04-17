package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BnkaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BnkaccountExample() {
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

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andBnkIsNull() {
            addCriterion("bnk is null");
            return (Criteria) this;
        }

        public Criteria andBnkIsNotNull() {
            addCriterion("bnk is not null");
            return (Criteria) this;
        }

        public Criteria andBnkEqualTo(String value) {
            addCriterion("bnk =", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotEqualTo(String value) {
            addCriterion("bnk <>", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkGreaterThan(String value) {
            addCriterion("bnk >", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkGreaterThanOrEqualTo(String value) {
            addCriterion("bnk >=", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkLessThan(String value) {
            addCriterion("bnk <", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkLessThanOrEqualTo(String value) {
            addCriterion("bnk <=", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkLike(String value) {
            addCriterion("bnk like", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotLike(String value) {
            addCriterion("bnk not like", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkIn(List<String> values) {
            addCriterion("bnk in", values, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotIn(List<String> values) {
            addCriterion("bnk not in", values, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkBetween(String value1, String value2) {
            addCriterion("bnk between", value1, value2, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotBetween(String value1, String value2) {
            addCriterion("bnk not between", value1, value2, "bnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkIsNull() {
            addCriterion("repayaccountbnk is null");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkIsNotNull() {
            addCriterion("repayaccountbnk is not null");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkEqualTo(String value) {
            addCriterion("repayaccountbnk =", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkNotEqualTo(String value) {
            addCriterion("repayaccountbnk <>", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkGreaterThan(String value) {
            addCriterion("repayaccountbnk >", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkGreaterThanOrEqualTo(String value) {
            addCriterion("repayaccountbnk >=", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkLessThan(String value) {
            addCriterion("repayaccountbnk <", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkLessThanOrEqualTo(String value) {
            addCriterion("repayaccountbnk <=", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkLike(String value) {
            addCriterion("repayaccountbnk like", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkNotLike(String value) {
            addCriterion("repayaccountbnk not like", value, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkIn(List<String> values) {
            addCriterion("repayaccountbnk in", values, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkNotIn(List<String> values) {
            addCriterion("repayaccountbnk not in", values, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkBetween(String value1, String value2) {
            addCriterion("repayaccountbnk between", value1, value2, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountbnkNotBetween(String value1, String value2) {
            addCriterion("repayaccountbnk not between", value1, value2, "repayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameIsNull() {
            addCriterion("repayaccountname is null");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameIsNotNull() {
            addCriterion("repayaccountname is not null");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameEqualTo(String value) {
            addCriterion("repayaccountname =", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameNotEqualTo(String value) {
            addCriterion("repayaccountname <>", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameGreaterThan(String value) {
            addCriterion("repayaccountname >", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("repayaccountname >=", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameLessThan(String value) {
            addCriterion("repayaccountname <", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameLessThanOrEqualTo(String value) {
            addCriterion("repayaccountname <=", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameLike(String value) {
            addCriterion("repayaccountname like", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameNotLike(String value) {
            addCriterion("repayaccountname not like", value, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameIn(List<String> values) {
            addCriterion("repayaccountname in", values, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameNotIn(List<String> values) {
            addCriterion("repayaccountname not in", values, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameBetween(String value1, String value2) {
            addCriterion("repayaccountname between", value1, value2, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountnameNotBetween(String value1, String value2) {
            addCriterion("repayaccountname not between", value1, value2, "repayaccountname");
            return (Criteria) this;
        }

        public Criteria andRepayaccountIsNull() {
            addCriterion("repayaccount is null");
            return (Criteria) this;
        }

        public Criteria andRepayaccountIsNotNull() {
            addCriterion("repayaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRepayaccountEqualTo(String value) {
            addCriterion("repayaccount =", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountNotEqualTo(String value) {
            addCriterion("repayaccount <>", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountGreaterThan(String value) {
            addCriterion("repayaccount >", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountGreaterThanOrEqualTo(String value) {
            addCriterion("repayaccount >=", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountLessThan(String value) {
            addCriterion("repayaccount <", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountLessThanOrEqualTo(String value) {
            addCriterion("repayaccount <=", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountLike(String value) {
            addCriterion("repayaccount like", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountNotLike(String value) {
            addCriterion("repayaccount not like", value, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountIn(List<String> values) {
            addCriterion("repayaccount in", values, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountNotIn(List<String> values) {
            addCriterion("repayaccount not in", values, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountBetween(String value1, String value2) {
            addCriterion("repayaccount between", value1, value2, "repayaccount");
            return (Criteria) this;
        }

        public Criteria andRepayaccountNotBetween(String value1, String value2) {
            addCriterion("repayaccount not between", value1, value2, "repayaccount");
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