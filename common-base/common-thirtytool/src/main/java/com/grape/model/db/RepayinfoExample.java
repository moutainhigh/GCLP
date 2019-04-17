package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepayinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepayinfoExample() {
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

        public Criteria andRefundissueIsNull() {
            addCriterion("refundissue is null");
            return (Criteria) this;
        }

        public Criteria andRefundissueIsNotNull() {
            addCriterion("refundissue is not null");
            return (Criteria) this;
        }

        public Criteria andRefundissueEqualTo(Integer value) {
            addCriterion("refundissue =", value, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueNotEqualTo(Integer value) {
            addCriterion("refundissue <>", value, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueGreaterThan(Integer value) {
            addCriterion("refundissue >", value, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundissue >=", value, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueLessThan(Integer value) {
            addCriterion("refundissue <", value, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueLessThanOrEqualTo(Integer value) {
            addCriterion("refundissue <=", value, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueIn(List<Integer> values) {
            addCriterion("refundissue in", values, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueNotIn(List<Integer> values) {
            addCriterion("refundissue not in", values, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueBetween(Integer value1, Integer value2) {
            addCriterion("refundissue between", value1, value2, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundissueNotBetween(Integer value1, Integer value2) {
            addCriterion("refundissue not between", value1, value2, "refundissue");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyIsNull() {
            addCriterion("refundmoney is null");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyIsNotNull() {
            addCriterion("refundmoney is not null");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyEqualTo(BigDecimal value) {
            addCriterion("refundmoney =", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyNotEqualTo(BigDecimal value) {
            addCriterion("refundmoney <>", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyGreaterThan(BigDecimal value) {
            addCriterion("refundmoney >", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundmoney >=", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyLessThan(BigDecimal value) {
            addCriterion("refundmoney <", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundmoney <=", value, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyIn(List<BigDecimal> values) {
            addCriterion("refundmoney in", values, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyNotIn(List<BigDecimal> values) {
            addCriterion("refundmoney not in", values, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundmoney between", value1, value2, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundmoney not between", value1, value2, "refundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundinterestIsNull() {
            addCriterion("refundinterest is null");
            return (Criteria) this;
        }

        public Criteria andRefundinterestIsNotNull() {
            addCriterion("refundinterest is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinterestEqualTo(BigDecimal value) {
            addCriterion("refundinterest =", value, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestNotEqualTo(BigDecimal value) {
            addCriterion("refundinterest <>", value, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestGreaterThan(BigDecimal value) {
            addCriterion("refundinterest >", value, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundinterest >=", value, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestLessThan(BigDecimal value) {
            addCriterion("refundinterest <", value, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundinterest <=", value, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestIn(List<BigDecimal> values) {
            addCriterion("refundinterest in", values, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestNotIn(List<BigDecimal> values) {
            addCriterion("refundinterest not in", values, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundinterest between", value1, value2, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRefundinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundinterest not between", value1, value2, "refundinterest");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateIsNull() {
            addCriterion("realityrefunddate is null");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateIsNotNull() {
            addCriterion("realityrefunddate is not null");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateEqualTo(Date value) {
            addCriterion("realityrefunddate =", value, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateNotEqualTo(Date value) {
            addCriterion("realityrefunddate <>", value, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateGreaterThan(Date value) {
            addCriterion("realityrefunddate >", value, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateGreaterThanOrEqualTo(Date value) {
            addCriterion("realityrefunddate >=", value, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateLessThan(Date value) {
            addCriterion("realityrefunddate <", value, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateLessThanOrEqualTo(Date value) {
            addCriterion("realityrefunddate <=", value, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateIn(List<Date> values) {
            addCriterion("realityrefunddate in", values, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateNotIn(List<Date> values) {
            addCriterion("realityrefunddate not in", values, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateBetween(Date value1, Date value2) {
            addCriterion("realityrefunddate between", value1, value2, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andRealityrefunddateNotBetween(Date value1, Date value2) {
            addCriterion("realityrefunddate not between", value1, value2, "realityrefunddate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyIsNull() {
            addCriterion("interestmoney is null");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyIsNotNull() {
            addCriterion("interestmoney is not null");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyEqualTo(BigDecimal value) {
            addCriterion("interestmoney =", value, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyNotEqualTo(BigDecimal value) {
            addCriterion("interestmoney <>", value, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyGreaterThan(BigDecimal value) {
            addCriterion("interestmoney >", value, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interestmoney >=", value, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyLessThan(BigDecimal value) {
            addCriterion("interestmoney <", value, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interestmoney <=", value, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyIn(List<BigDecimal> values) {
            addCriterion("interestmoney in", values, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyNotIn(List<BigDecimal> values) {
            addCriterion("interestmoney not in", values, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestmoney between", value1, value2, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestmoney not between", value1, value2, "interestmoney");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateIsNull() {
            addCriterion("interestmoneydate is null");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateIsNotNull() {
            addCriterion("interestmoneydate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateEqualTo(Date value) {
            addCriterion("interestmoneydate =", value, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateNotEqualTo(Date value) {
            addCriterion("interestmoneydate <>", value, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateGreaterThan(Date value) {
            addCriterion("interestmoneydate >", value, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateGreaterThanOrEqualTo(Date value) {
            addCriterion("interestmoneydate >=", value, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateLessThan(Date value) {
            addCriterion("interestmoneydate <", value, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateLessThanOrEqualTo(Date value) {
            addCriterion("interestmoneydate <=", value, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateIn(List<Date> values) {
            addCriterion("interestmoneydate in", values, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateNotIn(List<Date> values) {
            addCriterion("interestmoneydate not in", values, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateBetween(Date value1, Date value2) {
            addCriterion("interestmoneydate between", value1, value2, "interestmoneydate");
            return (Criteria) this;
        }

        public Criteria andInterestmoneydateNotBetween(Date value1, Date value2) {
            addCriterion("interestmoneydate not between", value1, value2, "interestmoneydate");
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

        public Criteria andDelayingpaymentdateIsNull() {
            addCriterion("delayingpaymentdate is null");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateIsNotNull() {
            addCriterion("delayingpaymentdate is not null");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateEqualTo(Date value) {
            addCriterion("delayingpaymentdate =", value, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateNotEqualTo(Date value) {
            addCriterion("delayingpaymentdate <>", value, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateGreaterThan(Date value) {
            addCriterion("delayingpaymentdate >", value, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("delayingpaymentdate >=", value, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateLessThan(Date value) {
            addCriterion("delayingpaymentdate <", value, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("delayingpaymentdate <=", value, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateIn(List<Date> values) {
            addCriterion("delayingpaymentdate in", values, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateNotIn(List<Date> values) {
            addCriterion("delayingpaymentdate not in", values, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateBetween(Date value1, Date value2) {
            addCriterion("delayingpaymentdate between", value1, value2, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andDelayingpaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("delayingpaymentdate not between", value1, value2, "delayingpaymentdate");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractIsNull() {
            addCriterion("breachofcontract is null");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractIsNotNull() {
            addCriterion("breachofcontract is not null");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractEqualTo(BigDecimal value) {
            addCriterion("breachofcontract =", value, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractNotEqualTo(BigDecimal value) {
            addCriterion("breachofcontract <>", value, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractGreaterThan(BigDecimal value) {
            addCriterion("breachofcontract >", value, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("breachofcontract >=", value, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractLessThan(BigDecimal value) {
            addCriterion("breachofcontract <", value, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractLessThanOrEqualTo(BigDecimal value) {
            addCriterion("breachofcontract <=", value, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractIn(List<BigDecimal> values) {
            addCriterion("breachofcontract in", values, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractNotIn(List<BigDecimal> values) {
            addCriterion("breachofcontract not in", values, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("breachofcontract between", value1, value2, "breachofcontract");
            return (Criteria) this;
        }

        public Criteria andBreachofcontractNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("breachofcontract not between", value1, value2, "breachofcontract");
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

        public Criteria andWhetheroverdueIsNull() {
            addCriterion("whetheroverdue is null");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueIsNotNull() {
            addCriterion("whetheroverdue is not null");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueEqualTo(String value) {
            addCriterion("whetheroverdue =", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueNotEqualTo(String value) {
            addCriterion("whetheroverdue <>", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueGreaterThan(String value) {
            addCriterion("whetheroverdue >", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueGreaterThanOrEqualTo(String value) {
            addCriterion("whetheroverdue >=", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueLessThan(String value) {
            addCriterion("whetheroverdue <", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueLessThanOrEqualTo(String value) {
            addCriterion("whetheroverdue <=", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueLike(String value) {
            addCriterion("whetheroverdue like", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueNotLike(String value) {
            addCriterion("whetheroverdue not like", value, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueIn(List<String> values) {
            addCriterion("whetheroverdue in", values, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueNotIn(List<String> values) {
            addCriterion("whetheroverdue not in", values, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueBetween(String value1, String value2) {
            addCriterion("whetheroverdue between", value1, value2, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andWhetheroverdueNotBetween(String value1, String value2) {
            addCriterion("whetheroverdue not between", value1, value2, "whetheroverdue");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeIsNull() {
            addCriterion("unifiedtime is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeIsNotNull() {
            addCriterion("unifiedtime is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeEqualTo(Date value) {
            addCriterion("unifiedtime =", value, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeNotEqualTo(Date value) {
            addCriterion("unifiedtime <>", value, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeGreaterThan(Date value) {
            addCriterion("unifiedtime >", value, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unifiedtime >=", value, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeLessThan(Date value) {
            addCriterion("unifiedtime <", value, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeLessThanOrEqualTo(Date value) {
            addCriterion("unifiedtime <=", value, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeIn(List<Date> values) {
            addCriterion("unifiedtime in", values, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeNotIn(List<Date> values) {
            addCriterion("unifiedtime not in", values, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeBetween(Date value1, Date value2) {
            addCriterion("unifiedtime between", value1, value2, "unifiedtime");
            return (Criteria) this;
        }

        public Criteria andUnifiedtimeNotBetween(Date value1, Date value2) {
            addCriterion("unifiedtime not between", value1, value2, "unifiedtime");
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

        public Criteria andRepaybankIsNull() {
            addCriterion("repaybank is null");
            return (Criteria) this;
        }

        public Criteria andRepaybankIsNotNull() {
            addCriterion("repaybank is not null");
            return (Criteria) this;
        }

        public Criteria andRepaybankEqualTo(String value) {
            addCriterion("repaybank =", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankNotEqualTo(String value) {
            addCriterion("repaybank <>", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankGreaterThan(String value) {
            addCriterion("repaybank >", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankGreaterThanOrEqualTo(String value) {
            addCriterion("repaybank >=", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankLessThan(String value) {
            addCriterion("repaybank <", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankLessThanOrEqualTo(String value) {
            addCriterion("repaybank <=", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankLike(String value) {
            addCriterion("repaybank like", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankNotLike(String value) {
            addCriterion("repaybank not like", value, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankIn(List<String> values) {
            addCriterion("repaybank in", values, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankNotIn(List<String> values) {
            addCriterion("repaybank not in", values, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankBetween(String value1, String value2) {
            addCriterion("repaybank between", value1, value2, "repaybank");
            return (Criteria) this;
        }

        public Criteria andRepaybankNotBetween(String value1, String value2) {
            addCriterion("repaybank not between", value1, value2, "repaybank");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNull() {
            addCriterion("accountnumber is null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNotNull() {
            addCriterion("accountnumber is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberEqualTo(String value) {
            addCriterion("accountnumber =", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotEqualTo(String value) {
            addCriterion("accountnumber <>", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThan(String value) {
            addCriterion("accountnumber >", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("accountnumber >=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThan(String value) {
            addCriterion("accountnumber <", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThanOrEqualTo(String value) {
            addCriterion("accountnumber <=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLike(String value) {
            addCriterion("accountnumber like", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotLike(String value) {
            addCriterion("accountnumber not like", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIn(List<String> values) {
            addCriterion("accountnumber in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotIn(List<String> values) {
            addCriterion("accountnumber not in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberBetween(String value1, String value2) {
            addCriterion("accountnumber between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotBetween(String value1, String value2) {
            addCriterion("accountnumber not between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("payee like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("payee not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("payee not between", value1, value2, "payee");
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