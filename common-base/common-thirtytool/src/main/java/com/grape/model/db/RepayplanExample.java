package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepayplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepayplanExample() {
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

        public Criteria andRepaydateIsNull() {
            addCriterion("repaydate is null");
            return (Criteria) this;
        }

        public Criteria andRepaydateIsNotNull() {
            addCriterion("repaydate is not null");
            return (Criteria) this;
        }

        public Criteria andRepaydateEqualTo(Date value) {
            addCriterion("repaydate =", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateNotEqualTo(Date value) {
            addCriterion("repaydate <>", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateGreaterThan(Date value) {
            addCriterion("repaydate >", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("repaydate >=", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateLessThan(Date value) {
            addCriterion("repaydate <", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateLessThanOrEqualTo(Date value) {
            addCriterion("repaydate <=", value, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateIn(List<Date> values) {
            addCriterion("repaydate in", values, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateNotIn(List<Date> values) {
            addCriterion("repaydate not in", values, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateBetween(Date value1, Date value2) {
            addCriterion("repaydate between", value1, value2, "repaydate");
            return (Criteria) this;
        }

        public Criteria andRepaydateNotBetween(Date value1, Date value2) {
            addCriterion("repaydate not between", value1, value2, "repaydate");
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

        public Criteria andRepayamountIsNull() {
            addCriterion("repayamount is null");
            return (Criteria) this;
        }

        public Criteria andRepayamountIsNotNull() {
            addCriterion("repayamount is not null");
            return (Criteria) this;
        }

        public Criteria andRepayamountEqualTo(BigDecimal value) {
            addCriterion("repayamount =", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountNotEqualTo(BigDecimal value) {
            addCriterion("repayamount <>", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountGreaterThan(BigDecimal value) {
            addCriterion("repayamount >", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayamount >=", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountLessThan(BigDecimal value) {
            addCriterion("repayamount <", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayamount <=", value, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountIn(List<BigDecimal> values) {
            addCriterion("repayamount in", values, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountNotIn(List<BigDecimal> values) {
            addCriterion("repayamount not in", values, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayamount between", value1, value2, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepayamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayamount not between", value1, value2, "repayamount");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalIsNull() {
            addCriterion("repaycapital is null");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalIsNotNull() {
            addCriterion("repaycapital is not null");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalEqualTo(BigDecimal value) {
            addCriterion("repaycapital =", value, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalNotEqualTo(BigDecimal value) {
            addCriterion("repaycapital <>", value, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalGreaterThan(BigDecimal value) {
            addCriterion("repaycapital >", value, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repaycapital >=", value, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalLessThan(BigDecimal value) {
            addCriterion("repaycapital <", value, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repaycapital <=", value, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalIn(List<BigDecimal> values) {
            addCriterion("repaycapital in", values, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalNotIn(List<BigDecimal> values) {
            addCriterion("repaycapital not in", values, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaycapital between", value1, value2, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepaycapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repaycapital not between", value1, value2, "repaycapital");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualIsNull() {
            addCriterion("repayaccrual is null");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualIsNotNull() {
            addCriterion("repayaccrual is not null");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualEqualTo(BigDecimal value) {
            addCriterion("repayaccrual =", value, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualNotEqualTo(BigDecimal value) {
            addCriterion("repayaccrual <>", value, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualGreaterThan(BigDecimal value) {
            addCriterion("repayaccrual >", value, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayaccrual >=", value, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualLessThan(BigDecimal value) {
            addCriterion("repayaccrual <", value, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayaccrual <=", value, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualIn(List<BigDecimal> values) {
            addCriterion("repayaccrual in", values, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualNotIn(List<BigDecimal> values) {
            addCriterion("repayaccrual not in", values, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayaccrual between", value1, value2, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepayaccrualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayaccrual not between", value1, value2, "repayaccrual");
            return (Criteria) this;
        }

        public Criteria andRepaytermIsNull() {
            addCriterion("repayterm is null");
            return (Criteria) this;
        }

        public Criteria andRepaytermIsNotNull() {
            addCriterion("repayterm is not null");
            return (Criteria) this;
        }

        public Criteria andRepaytermEqualTo(Integer value) {
            addCriterion("repayterm =", value, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermNotEqualTo(Integer value) {
            addCriterion("repayterm <>", value, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermGreaterThan(Integer value) {
            addCriterion("repayterm >", value, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayterm >=", value, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermLessThan(Integer value) {
            addCriterion("repayterm <", value, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermLessThanOrEqualTo(Integer value) {
            addCriterion("repayterm <=", value, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermIn(List<Integer> values) {
            addCriterion("repayterm in", values, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermNotIn(List<Integer> values) {
            addCriterion("repayterm not in", values, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermBetween(Integer value1, Integer value2) {
            addCriterion("repayterm between", value1, value2, "repayterm");
            return (Criteria) this;
        }

        public Criteria andRepaytermNotBetween(Integer value1, Integer value2) {
            addCriterion("repayterm not between", value1, value2, "repayterm");
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

        public Criteria andRepaypersonIsNull() {
            addCriterion("repayperson is null");
            return (Criteria) this;
        }

        public Criteria andRepaypersonIsNotNull() {
            addCriterion("repayperson is not null");
            return (Criteria) this;
        }

        public Criteria andRepaypersonEqualTo(String value) {
            addCriterion("repayperson =", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonNotEqualTo(String value) {
            addCriterion("repayperson <>", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonGreaterThan(String value) {
            addCriterion("repayperson >", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonGreaterThanOrEqualTo(String value) {
            addCriterion("repayperson >=", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonLessThan(String value) {
            addCriterion("repayperson <", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonLessThanOrEqualTo(String value) {
            addCriterion("repayperson <=", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonLike(String value) {
            addCriterion("repayperson like", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonNotLike(String value) {
            addCriterion("repayperson not like", value, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonIn(List<String> values) {
            addCriterion("repayperson in", values, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonNotIn(List<String> values) {
            addCriterion("repayperson not in", values, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonBetween(String value1, String value2) {
            addCriterion("repayperson between", value1, value2, "repayperson");
            return (Criteria) this;
        }

        public Criteria andRepaypersonNotBetween(String value1, String value2) {
            addCriterion("repayperson not between", value1, value2, "repayperson");
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