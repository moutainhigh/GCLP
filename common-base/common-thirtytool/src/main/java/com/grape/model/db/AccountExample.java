package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAccountnoIsNull() {
            addCriterion("accountno is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("accountno is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("accountno =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("accountno <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("accountno >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("accountno >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("accountno <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("accountno <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("accountno like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("accountno not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("accountno in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("accountno not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("accountno between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("accountno not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andLinenumberIsNull() {
            addCriterion("linenumber is null");
            return (Criteria) this;
        }

        public Criteria andLinenumberIsNotNull() {
            addCriterion("linenumber is not null");
            return (Criteria) this;
        }

        public Criteria andLinenumberEqualTo(String value) {
            addCriterion("linenumber =", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotEqualTo(String value) {
            addCriterion("linenumber <>", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberGreaterThan(String value) {
            addCriterion("linenumber >", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberGreaterThanOrEqualTo(String value) {
            addCriterion("linenumber >=", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLessThan(String value) {
            addCriterion("linenumber <", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLessThanOrEqualTo(String value) {
            addCriterion("linenumber <=", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLike(String value) {
            addCriterion("linenumber like", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotLike(String value) {
            addCriterion("linenumber not like", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberIn(List<String> values) {
            addCriterion("linenumber in", values, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotIn(List<String> values) {
            addCriterion("linenumber not in", values, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberBetween(String value1, String value2) {
            addCriterion("linenumber between", value1, value2, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotBetween(String value1, String value2) {
            addCriterion("linenumber not between", value1, value2, "linenumber");
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

        public Criteria andAccountbaknoIsNull() {
            addCriterion("accountbakno is null");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoIsNotNull() {
            addCriterion("accountbakno is not null");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoEqualTo(String value) {
            addCriterion("accountbakno =", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoNotEqualTo(String value) {
            addCriterion("accountbakno <>", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoGreaterThan(String value) {
            addCriterion("accountbakno >", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoGreaterThanOrEqualTo(String value) {
            addCriterion("accountbakno >=", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoLessThan(String value) {
            addCriterion("accountbakno <", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoLessThanOrEqualTo(String value) {
            addCriterion("accountbakno <=", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoLike(String value) {
            addCriterion("accountbakno like", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoNotLike(String value) {
            addCriterion("accountbakno not like", value, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoIn(List<String> values) {
            addCriterion("accountbakno in", values, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoNotIn(List<String> values) {
            addCriterion("accountbakno not in", values, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoBetween(String value1, String value2) {
            addCriterion("accountbakno between", value1, value2, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountbaknoNotBetween(String value1, String value2) {
            addCriterion("accountbakno not between", value1, value2, "accountbakno");
            return (Criteria) this;
        }

        public Criteria andAccountorgIsNull() {
            addCriterion("accountorg is null");
            return (Criteria) this;
        }

        public Criteria andAccountorgIsNotNull() {
            addCriterion("accountorg is not null");
            return (Criteria) this;
        }

        public Criteria andAccountorgEqualTo(String value) {
            addCriterion("accountorg =", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotEqualTo(String value) {
            addCriterion("accountorg <>", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgGreaterThan(String value) {
            addCriterion("accountorg >", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgGreaterThanOrEqualTo(String value) {
            addCriterion("accountorg >=", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgLessThan(String value) {
            addCriterion("accountorg <", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgLessThanOrEqualTo(String value) {
            addCriterion("accountorg <=", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgLike(String value) {
            addCriterion("accountorg like", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotLike(String value) {
            addCriterion("accountorg not like", value, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgIn(List<String> values) {
            addCriterion("accountorg in", values, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotIn(List<String> values) {
            addCriterion("accountorg not in", values, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgBetween(String value1, String value2) {
            addCriterion("accountorg between", value1, value2, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccountorgNotBetween(String value1, String value2) {
            addCriterion("accountorg not between", value1, value2, "accountorg");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNull() {
            addCriterion("accounttype is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("accounttype is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(String value) {
            addCriterion("accounttype =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(String value) {
            addCriterion("accounttype <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(String value) {
            addCriterion("accounttype >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("accounttype >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(String value) {
            addCriterion("accounttype <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(String value) {
            addCriterion("accounttype <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLike(String value) {
            addCriterion("accounttype like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotLike(String value) {
            addCriterion("accounttype not like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<String> values) {
            addCriterion("accounttype in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<String> values) {
            addCriterion("accounttype not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(String value1, String value2) {
            addCriterion("accounttype between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(String value1, String value2) {
            addCriterion("accounttype not between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccountremianIsNull() {
            addCriterion("accountremian is null");
            return (Criteria) this;
        }

        public Criteria andAccountremianIsNotNull() {
            addCriterion("accountremian is not null");
            return (Criteria) this;
        }

        public Criteria andAccountremianEqualTo(BigDecimal value) {
            addCriterion("accountremian =", value, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianNotEqualTo(BigDecimal value) {
            addCriterion("accountremian <>", value, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianGreaterThan(BigDecimal value) {
            addCriterion("accountremian >", value, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accountremian >=", value, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianLessThan(BigDecimal value) {
            addCriterion("accountremian <", value, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accountremian <=", value, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianIn(List<BigDecimal> values) {
            addCriterion("accountremian in", values, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianNotIn(List<BigDecimal> values) {
            addCriterion("accountremian not in", values, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountremian between", value1, value2, "accountremian");
            return (Criteria) this;
        }

        public Criteria andAccountremianNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountremian not between", value1, value2, "accountremian");
            return (Criteria) this;
        }

        public Criteria andFreezeamountIsNull() {
            addCriterion("freezeamount is null");
            return (Criteria) this;
        }

        public Criteria andFreezeamountIsNotNull() {
            addCriterion("freezeamount is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeamountEqualTo(BigDecimal value) {
            addCriterion("freezeamount =", value, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountNotEqualTo(BigDecimal value) {
            addCriterion("freezeamount <>", value, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountGreaterThan(BigDecimal value) {
            addCriterion("freezeamount >", value, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freezeamount >=", value, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountLessThan(BigDecimal value) {
            addCriterion("freezeamount <", value, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freezeamount <=", value, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountIn(List<BigDecimal> values) {
            addCriterion("freezeamount in", values, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountNotIn(List<BigDecimal> values) {
            addCriterion("freezeamount not in", values, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezeamount between", value1, value2, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andFreezeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezeamount not between", value1, value2, "freezeamount");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceIsNull() {
            addCriterion("marginbalance is null");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceIsNotNull() {
            addCriterion("marginbalance is not null");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceEqualTo(BigDecimal value) {
            addCriterion("marginbalance =", value, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceNotEqualTo(BigDecimal value) {
            addCriterion("marginbalance <>", value, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceGreaterThan(BigDecimal value) {
            addCriterion("marginbalance >", value, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("marginbalance >=", value, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceLessThan(BigDecimal value) {
            addCriterion("marginbalance <", value, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("marginbalance <=", value, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceIn(List<BigDecimal> values) {
            addCriterion("marginbalance in", values, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceNotIn(List<BigDecimal> values) {
            addCriterion("marginbalance not in", values, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marginbalance between", value1, value2, "marginbalance");
            return (Criteria) this;
        }

        public Criteria andMarginbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marginbalance not between", value1, value2, "marginbalance");
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