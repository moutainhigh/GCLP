package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostloaninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostloaninfoExample() {
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

        public Criteria andApprovedmoneyIsNull() {
            addCriterion("approvedmoney is null");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyIsNotNull() {
            addCriterion("approvedmoney is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyEqualTo(BigDecimal value) {
            addCriterion("approvedmoney =", value, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyNotEqualTo(BigDecimal value) {
            addCriterion("approvedmoney <>", value, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyGreaterThan(BigDecimal value) {
            addCriterion("approvedmoney >", value, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("approvedmoney >=", value, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyLessThan(BigDecimal value) {
            addCriterion("approvedmoney <", value, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("approvedmoney <=", value, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyIn(List<BigDecimal> values) {
            addCriterion("approvedmoney in", values, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyNotIn(List<BigDecimal> values) {
            addCriterion("approvedmoney not in", values, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approvedmoney between", value1, value2, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andApprovedmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approvedmoney not between", value1, value2, "approvedmoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyIsNull() {
            addCriterion("alreadymoney is null");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyIsNotNull() {
            addCriterion("alreadymoney is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyEqualTo(BigDecimal value) {
            addCriterion("alreadymoney =", value, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyNotEqualTo(BigDecimal value) {
            addCriterion("alreadymoney <>", value, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyGreaterThan(BigDecimal value) {
            addCriterion("alreadymoney >", value, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("alreadymoney >=", value, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyLessThan(BigDecimal value) {
            addCriterion("alreadymoney <", value, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("alreadymoney <=", value, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyIn(List<BigDecimal> values) {
            addCriterion("alreadymoney in", values, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyNotIn(List<BigDecimal> values) {
            addCriterion("alreadymoney not in", values, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("alreadymoney between", value1, value2, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andAlreadymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("alreadymoney not between", value1, value2, "alreadymoney");
            return (Criteria) this;
        }

        public Criteria andRemainamountIsNull() {
            addCriterion("remainamount is null");
            return (Criteria) this;
        }

        public Criteria andRemainamountIsNotNull() {
            addCriterion("remainamount is not null");
            return (Criteria) this;
        }

        public Criteria andRemainamountEqualTo(BigDecimal value) {
            addCriterion("remainamount =", value, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountNotEqualTo(BigDecimal value) {
            addCriterion("remainamount <>", value, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountGreaterThan(BigDecimal value) {
            addCriterion("remainamount >", value, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remainamount >=", value, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountLessThan(BigDecimal value) {
            addCriterion("remainamount <", value, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remainamount <=", value, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountIn(List<BigDecimal> values) {
            addCriterion("remainamount in", values, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountNotIn(List<BigDecimal> values) {
            addCriterion("remainamount not in", values, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remainamount between", value1, value2, "remainamount");
            return (Criteria) this;
        }

        public Criteria andRemainamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remainamount not between", value1, value2, "remainamount");
            return (Criteria) this;
        }

        public Criteria andFirstloandateIsNull() {
            addCriterion("firstloandate is null");
            return (Criteria) this;
        }

        public Criteria andFirstloandateIsNotNull() {
            addCriterion("firstloandate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstloandateEqualTo(Date value) {
            addCriterion("firstloandate =", value, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateNotEqualTo(Date value) {
            addCriterion("firstloandate <>", value, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateGreaterThan(Date value) {
            addCriterion("firstloandate >", value, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateGreaterThanOrEqualTo(Date value) {
            addCriterion("firstloandate >=", value, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateLessThan(Date value) {
            addCriterion("firstloandate <", value, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateLessThanOrEqualTo(Date value) {
            addCriterion("firstloandate <=", value, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateIn(List<Date> values) {
            addCriterion("firstloandate in", values, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateNotIn(List<Date> values) {
            addCriterion("firstloandate not in", values, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateBetween(Date value1, Date value2) {
            addCriterion("firstloandate between", value1, value2, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andFirstloandateNotBetween(Date value1, Date value2) {
            addCriterion("firstloandate not between", value1, value2, "firstloandate");
            return (Criteria) this;
        }

        public Criteria andSettledateIsNull() {
            addCriterion("settledate is null");
            return (Criteria) this;
        }

        public Criteria andSettledateIsNotNull() {
            addCriterion("settledate is not null");
            return (Criteria) this;
        }

        public Criteria andSettledateEqualTo(Date value) {
            addCriterion("settledate =", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotEqualTo(Date value) {
            addCriterion("settledate <>", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateGreaterThan(Date value) {
            addCriterion("settledate >", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateGreaterThanOrEqualTo(Date value) {
            addCriterion("settledate >=", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateLessThan(Date value) {
            addCriterion("settledate <", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateLessThanOrEqualTo(Date value) {
            addCriterion("settledate <=", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateIn(List<Date> values) {
            addCriterion("settledate in", values, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotIn(List<Date> values) {
            addCriterion("settledate not in", values, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateBetween(Date value1, Date value2) {
            addCriterion("settledate between", value1, value2, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotBetween(Date value1, Date value2) {
            addCriterion("settledate not between", value1, value2, "settledate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIsNull() {
            addCriterion("maturitydate is null");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIsNotNull() {
            addCriterion("maturitydate is not null");
            return (Criteria) this;
        }

        public Criteria andMaturitydateEqualTo(Date value) {
            addCriterion("maturitydate =", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotEqualTo(Date value) {
            addCriterion("maturitydate <>", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateGreaterThan(Date value) {
            addCriterion("maturitydate >", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateGreaterThanOrEqualTo(Date value) {
            addCriterion("maturitydate >=", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLessThan(Date value) {
            addCriterion("maturitydate <", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateLessThanOrEqualTo(Date value) {
            addCriterion("maturitydate <=", value, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateIn(List<Date> values) {
            addCriterion("maturitydate in", values, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotIn(List<Date> values) {
            addCriterion("maturitydate not in", values, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateBetween(Date value1, Date value2) {
            addCriterion("maturitydate between", value1, value2, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andMaturitydateNotBetween(Date value1, Date value2) {
            addCriterion("maturitydate not between", value1, value2, "maturitydate");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitIsNull() {
            addCriterion("loantimelimit is null");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitIsNotNull() {
            addCriterion("loantimelimit is not null");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitEqualTo(String value) {
            addCriterion("loantimelimit =", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitNotEqualTo(String value) {
            addCriterion("loantimelimit <>", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitGreaterThan(String value) {
            addCriterion("loantimelimit >", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitGreaterThanOrEqualTo(String value) {
            addCriterion("loantimelimit >=", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitLessThan(String value) {
            addCriterion("loantimelimit <", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitLessThanOrEqualTo(String value) {
            addCriterion("loantimelimit <=", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitLike(String value) {
            addCriterion("loantimelimit like", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitNotLike(String value) {
            addCriterion("loantimelimit not like", value, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitIn(List<String> values) {
            addCriterion("loantimelimit in", values, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitNotIn(List<String> values) {
            addCriterion("loantimelimit not in", values, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitBetween(String value1, String value2) {
            addCriterion("loantimelimit between", value1, value2, "loantimelimit");
            return (Criteria) this;
        }

        public Criteria andLoantimelimitNotBetween(String value1, String value2) {
            addCriterion("loantimelimit not between", value1, value2, "loantimelimit");
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

        public Criteria andInterestrateIsNull() {
            addCriterion("interestrate is null");
            return (Criteria) this;
        }

        public Criteria andInterestrateIsNotNull() {
            addCriterion("interestrate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestrateEqualTo(BigDecimal value) {
            addCriterion("interestrate =", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotEqualTo(BigDecimal value) {
            addCriterion("interestrate <>", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateGreaterThan(BigDecimal value) {
            addCriterion("interestrate >", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interestrate >=", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateLessThan(BigDecimal value) {
            addCriterion("interestrate <", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interestrate <=", value, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateIn(List<BigDecimal> values) {
            addCriterion("interestrate in", values, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotIn(List<BigDecimal> values) {
            addCriterion("interestrate not in", values, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestrate between", value1, value2, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestrate not between", value1, value2, "interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeIsNull() {
            addCriterion("interestratetype is null");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeIsNotNull() {
            addCriterion("interestratetype is not null");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeEqualTo(String value) {
            addCriterion("interestratetype =", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeNotEqualTo(String value) {
            addCriterion("interestratetype <>", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeGreaterThan(String value) {
            addCriterion("interestratetype >", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeGreaterThanOrEqualTo(String value) {
            addCriterion("interestratetype >=", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeLessThan(String value) {
            addCriterion("interestratetype <", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeLessThanOrEqualTo(String value) {
            addCriterion("interestratetype <=", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeLike(String value) {
            addCriterion("interestratetype like", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeNotLike(String value) {
            addCriterion("interestratetype not like", value, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeIn(List<String> values) {
            addCriterion("interestratetype in", values, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeNotIn(List<String> values) {
            addCriterion("interestratetype not in", values, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeBetween(String value1, String value2) {
            addCriterion("interestratetype between", value1, value2, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andInterestratetypeNotBetween(String value1, String value2) {
            addCriterion("interestratetype not between", value1, value2, "interestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateIsNull() {
            addCriterion("realinterestrate is null");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateIsNotNull() {
            addCriterion("realinterestrate is not null");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateEqualTo(BigDecimal value) {
            addCriterion("realinterestrate =", value, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateNotEqualTo(BigDecimal value) {
            addCriterion("realinterestrate <>", value, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateGreaterThan(BigDecimal value) {
            addCriterion("realinterestrate >", value, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("realinterestrate >=", value, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateLessThan(BigDecimal value) {
            addCriterion("realinterestrate <", value, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("realinterestrate <=", value, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateIn(List<BigDecimal> values) {
            addCriterion("realinterestrate in", values, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateNotIn(List<BigDecimal> values) {
            addCriterion("realinterestrate not in", values, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realinterestrate between", value1, value2, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realinterestrate not between", value1, value2, "realinterestrate");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeIsNull() {
            addCriterion("realinterestratetype is null");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeIsNotNull() {
            addCriterion("realinterestratetype is not null");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeEqualTo(String value) {
            addCriterion("realinterestratetype =", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeNotEqualTo(String value) {
            addCriterion("realinterestratetype <>", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeGreaterThan(String value) {
            addCriterion("realinterestratetype >", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeGreaterThanOrEqualTo(String value) {
            addCriterion("realinterestratetype >=", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeLessThan(String value) {
            addCriterion("realinterestratetype <", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeLessThanOrEqualTo(String value) {
            addCriterion("realinterestratetype <=", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeLike(String value) {
            addCriterion("realinterestratetype like", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeNotLike(String value) {
            addCriterion("realinterestratetype not like", value, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeIn(List<String> values) {
            addCriterion("realinterestratetype in", values, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeNotIn(List<String> values) {
            addCriterion("realinterestratetype not in", values, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeBetween(String value1, String value2) {
            addCriterion("realinterestratetype between", value1, value2, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andRealinterestratetypeNotBetween(String value1, String value2) {
            addCriterion("realinterestratetype not between", value1, value2, "realinterestratetype");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceIsNull() {
            addCriterion("loanbalance is null");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceIsNotNull() {
            addCriterion("loanbalance is not null");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceEqualTo(BigDecimal value) {
            addCriterion("loanbalance =", value, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceNotEqualTo(BigDecimal value) {
            addCriterion("loanbalance <>", value, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceGreaterThan(BigDecimal value) {
            addCriterion("loanbalance >", value, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loanbalance >=", value, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceLessThan(BigDecimal value) {
            addCriterion("loanbalance <", value, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loanbalance <=", value, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceIn(List<BigDecimal> values) {
            addCriterion("loanbalance in", values, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceNotIn(List<BigDecimal> values) {
            addCriterion("loanbalance not in", values, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanbalance between", value1, value2, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andLoanbalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanbalance not between", value1, value2, "loanbalance");
            return (Criteria) this;
        }

        public Criteria andAccountstateIsNull() {
            addCriterion("accountstate is null");
            return (Criteria) this;
        }

        public Criteria andAccountstateIsNotNull() {
            addCriterion("accountstate is not null");
            return (Criteria) this;
        }

        public Criteria andAccountstateEqualTo(String value) {
            addCriterion("accountstate =", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotEqualTo(String value) {
            addCriterion("accountstate <>", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateGreaterThan(String value) {
            addCriterion("accountstate >", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateGreaterThanOrEqualTo(String value) {
            addCriterion("accountstate >=", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateLessThan(String value) {
            addCriterion("accountstate <", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateLessThanOrEqualTo(String value) {
            addCriterion("accountstate <=", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateLike(String value) {
            addCriterion("accountstate like", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotLike(String value) {
            addCriterion("accountstate not like", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateIn(List<String> values) {
            addCriterion("accountstate in", values, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotIn(List<String> values) {
            addCriterion("accountstate not in", values, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateBetween(String value1, String value2) {
            addCriterion("accountstate between", value1, value2, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotBetween(String value1, String value2) {
            addCriterion("accountstate not between", value1, value2, "accountstate");
            return (Criteria) this;
        }

        public Criteria andOverdueflgIsNull() {
            addCriterion("overdueflg is null");
            return (Criteria) this;
        }

        public Criteria andOverdueflgIsNotNull() {
            addCriterion("overdueflg is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueflgEqualTo(String value) {
            addCriterion("overdueflg =", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgNotEqualTo(String value) {
            addCriterion("overdueflg <>", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgGreaterThan(String value) {
            addCriterion("overdueflg >", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgGreaterThanOrEqualTo(String value) {
            addCriterion("overdueflg >=", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgLessThan(String value) {
            addCriterion("overdueflg <", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgLessThanOrEqualTo(String value) {
            addCriterion("overdueflg <=", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgLike(String value) {
            addCriterion("overdueflg like", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgNotLike(String value) {
            addCriterion("overdueflg not like", value, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgIn(List<String> values) {
            addCriterion("overdueflg in", values, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgNotIn(List<String> values) {
            addCriterion("overdueflg not in", values, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgBetween(String value1, String value2) {
            addCriterion("overdueflg between", value1, value2, "overdueflg");
            return (Criteria) this;
        }

        public Criteria andOverdueflgNotBetween(String value1, String value2) {
            addCriterion("overdueflg not between", value1, value2, "overdueflg");
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

        public Criteria andOverduedateIsNull() {
            addCriterion("overduedate is null");
            return (Criteria) this;
        }

        public Criteria andOverduedateIsNotNull() {
            addCriterion("overduedate is not null");
            return (Criteria) this;
        }

        public Criteria andOverduedateEqualTo(Date value) {
            addCriterion("overduedate =", value, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateNotEqualTo(Date value) {
            addCriterion("overduedate <>", value, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateGreaterThan(Date value) {
            addCriterion("overduedate >", value, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateGreaterThanOrEqualTo(Date value) {
            addCriterion("overduedate >=", value, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateLessThan(Date value) {
            addCriterion("overduedate <", value, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateLessThanOrEqualTo(Date value) {
            addCriterion("overduedate <=", value, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateIn(List<Date> values) {
            addCriterion("overduedate in", values, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateNotIn(List<Date> values) {
            addCriterion("overduedate not in", values, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateBetween(Date value1, Date value2) {
            addCriterion("overduedate between", value1, value2, "overduedate");
            return (Criteria) this;
        }

        public Criteria andOverduedateNotBetween(Date value1, Date value2) {
            addCriterion("overduedate not between", value1, value2, "overduedate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIsNull() {
            addCriterion("nextrepaydate is null");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIsNotNull() {
            addCriterion("nextrepaydate is not null");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateEqualTo(Date value) {
            addCriterion("nextrepaydate =", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotEqualTo(Date value) {
            addCriterion("nextrepaydate <>", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateGreaterThan(Date value) {
            addCriterion("nextrepaydate >", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("nextrepaydate >=", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateLessThan(Date value) {
            addCriterion("nextrepaydate <", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateLessThanOrEqualTo(Date value) {
            addCriterion("nextrepaydate <=", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIn(List<Date> values) {
            addCriterion("nextrepaydate in", values, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotIn(List<Date> values) {
            addCriterion("nextrepaydate not in", values, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateBetween(Date value1, Date value2) {
            addCriterion("nextrepaydate between", value1, value2, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotBetween(Date value1, Date value2) {
            addCriterion("nextrepaydate not between", value1, value2, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyIsNull() {
            addCriterion("nextrefundmoney is null");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyIsNotNull() {
            addCriterion("nextrefundmoney is not null");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyEqualTo(BigDecimal value) {
            addCriterion("nextrefundmoney =", value, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyNotEqualTo(BigDecimal value) {
            addCriterion("nextrefundmoney <>", value, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyGreaterThan(BigDecimal value) {
            addCriterion("nextrefundmoney >", value, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nextrefundmoney >=", value, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyLessThan(BigDecimal value) {
            addCriterion("nextrefundmoney <", value, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nextrefundmoney <=", value, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyIn(List<BigDecimal> values) {
            addCriterion("nextrefundmoney in", values, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyNotIn(List<BigDecimal> values) {
            addCriterion("nextrefundmoney not in", values, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nextrefundmoney between", value1, value2, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nextrefundmoney not between", value1, value2, "nextrefundmoney");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueIsNull() {
            addCriterion("nextrefundissue is null");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueIsNotNull() {
            addCriterion("nextrefundissue is not null");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueEqualTo(Integer value) {
            addCriterion("nextrefundissue =", value, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueNotEqualTo(Integer value) {
            addCriterion("nextrefundissue <>", value, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueGreaterThan(Integer value) {
            addCriterion("nextrefundissue >", value, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueGreaterThanOrEqualTo(Integer value) {
            addCriterion("nextrefundissue >=", value, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueLessThan(Integer value) {
            addCriterion("nextrefundissue <", value, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueLessThanOrEqualTo(Integer value) {
            addCriterion("nextrefundissue <=", value, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueIn(List<Integer> values) {
            addCriterion("nextrefundissue in", values, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueNotIn(List<Integer> values) {
            addCriterion("nextrefundissue not in", values, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueBetween(Integer value1, Integer value2) {
            addCriterion("nextrefundissue between", value1, value2, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andNextrefundissueNotBetween(Integer value1, Integer value2) {
            addCriterion("nextrefundissue not between", value1, value2, "nextrefundissue");
            return (Criteria) this;
        }

        public Criteria andOverduenumIsNull() {
            addCriterion("overduenum is null");
            return (Criteria) this;
        }

        public Criteria andOverduenumIsNotNull() {
            addCriterion("overduenum is not null");
            return (Criteria) this;
        }

        public Criteria andOverduenumEqualTo(Integer value) {
            addCriterion("overduenum =", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumNotEqualTo(Integer value) {
            addCriterion("overduenum <>", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumGreaterThan(Integer value) {
            addCriterion("overduenum >", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("overduenum >=", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumLessThan(Integer value) {
            addCriterion("overduenum <", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumLessThanOrEqualTo(Integer value) {
            addCriterion("overduenum <=", value, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumIn(List<Integer> values) {
            addCriterion("overduenum in", values, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumNotIn(List<Integer> values) {
            addCriterion("overduenum not in", values, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumBetween(Integer value1, Integer value2) {
            addCriterion("overduenum between", value1, value2, "overduenum");
            return (Criteria) this;
        }

        public Criteria andOverduenumNotBetween(Integer value1, Integer value2) {
            addCriterion("overduenum not between", value1, value2, "overduenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumIsNull() {
            addCriterion("addoverduedaynum is null");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumIsNotNull() {
            addCriterion("addoverduedaynum is not null");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumEqualTo(Integer value) {
            addCriterion("addoverduedaynum =", value, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumNotEqualTo(Integer value) {
            addCriterion("addoverduedaynum <>", value, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumGreaterThan(Integer value) {
            addCriterion("addoverduedaynum >", value, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("addoverduedaynum >=", value, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumLessThan(Integer value) {
            addCriterion("addoverduedaynum <", value, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumLessThanOrEqualTo(Integer value) {
            addCriterion("addoverduedaynum <=", value, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumIn(List<Integer> values) {
            addCriterion("addoverduedaynum in", values, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumNotIn(List<Integer> values) {
            addCriterion("addoverduedaynum not in", values, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumBetween(Integer value1, Integer value2) {
            addCriterion("addoverduedaynum between", value1, value2, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduedaynumNotBetween(Integer value1, Integer value2) {
            addCriterion("addoverduedaynum not between", value1, value2, "addoverduedaynum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumIsNull() {
            addCriterion("addoverduetimenum is null");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumIsNotNull() {
            addCriterion("addoverduetimenum is not null");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumEqualTo(Integer value) {
            addCriterion("addoverduetimenum =", value, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumNotEqualTo(Integer value) {
            addCriterion("addoverduetimenum <>", value, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumGreaterThan(Integer value) {
            addCriterion("addoverduetimenum >", value, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("addoverduetimenum >=", value, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumLessThan(Integer value) {
            addCriterion("addoverduetimenum <", value, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumLessThanOrEqualTo(Integer value) {
            addCriterion("addoverduetimenum <=", value, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumIn(List<Integer> values) {
            addCriterion("addoverduetimenum in", values, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumNotIn(List<Integer> values) {
            addCriterion("addoverduetimenum not in", values, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumBetween(Integer value1, Integer value2) {
            addCriterion("addoverduetimenum between", value1, value2, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andAddoverduetimenumNotBetween(Integer value1, Integer value2) {
            addCriterion("addoverduetimenum not between", value1, value2, "addoverduetimenum");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthIsNull() {
            addCriterion("repaydateofmonth is null");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthIsNotNull() {
            addCriterion("repaydateofmonth is not null");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthEqualTo(String value) {
            addCriterion("repaydateofmonth =", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthNotEqualTo(String value) {
            addCriterion("repaydateofmonth <>", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthGreaterThan(String value) {
            addCriterion("repaydateofmonth >", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthGreaterThanOrEqualTo(String value) {
            addCriterion("repaydateofmonth >=", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthLessThan(String value) {
            addCriterion("repaydateofmonth <", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthLessThanOrEqualTo(String value) {
            addCriterion("repaydateofmonth <=", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthLike(String value) {
            addCriterion("repaydateofmonth like", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthNotLike(String value) {
            addCriterion("repaydateofmonth not like", value, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthIn(List<String> values) {
            addCriterion("repaydateofmonth in", values, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthNotIn(List<String> values) {
            addCriterion("repaydateofmonth not in", values, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthBetween(String value1, String value2) {
            addCriterion("repaydateofmonth between", value1, value2, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andRepaydateofmonthNotBetween(String value1, String value2) {
            addCriterion("repaydateofmonth not between", value1, value2, "repaydateofmonth");
            return (Criteria) this;
        }

        public Criteria andIshavereadIsNull() {
            addCriterion("ishaveread is null");
            return (Criteria) this;
        }

        public Criteria andIshavereadIsNotNull() {
            addCriterion("ishaveread is not null");
            return (Criteria) this;
        }

        public Criteria andIshavereadEqualTo(String value) {
            addCriterion("ishaveread =", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadNotEqualTo(String value) {
            addCriterion("ishaveread <>", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadGreaterThan(String value) {
            addCriterion("ishaveread >", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadGreaterThanOrEqualTo(String value) {
            addCriterion("ishaveread >=", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadLessThan(String value) {
            addCriterion("ishaveread <", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadLessThanOrEqualTo(String value) {
            addCriterion("ishaveread <=", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadLike(String value) {
            addCriterion("ishaveread like", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadNotLike(String value) {
            addCriterion("ishaveread not like", value, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadIn(List<String> values) {
            addCriterion("ishaveread in", values, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadNotIn(List<String> values) {
            addCriterion("ishaveread not in", values, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadBetween(String value1, String value2) {
            addCriterion("ishaveread between", value1, value2, "ishaveread");
            return (Criteria) this;
        }

        public Criteria andIshavereadNotBetween(String value1, String value2) {
            addCriterion("ishaveread not between", value1, value2, "ishaveread");
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