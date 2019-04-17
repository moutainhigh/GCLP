package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundfinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundfinanceExample() {
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

        public Criteria andServeramountIsNull() {
            addCriterion("serveramount is null");
            return (Criteria) this;
        }

        public Criteria andServeramountIsNotNull() {
            addCriterion("serveramount is not null");
            return (Criteria) this;
        }

        public Criteria andServeramountEqualTo(BigDecimal value) {
            addCriterion("serveramount =", value, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountNotEqualTo(BigDecimal value) {
            addCriterion("serveramount <>", value, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountGreaterThan(BigDecimal value) {
            addCriterion("serveramount >", value, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("serveramount >=", value, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountLessThan(BigDecimal value) {
            addCriterion("serveramount <", value, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("serveramount <=", value, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountIn(List<BigDecimal> values) {
            addCriterion("serveramount in", values, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountNotIn(List<BigDecimal> values) {
            addCriterion("serveramount not in", values, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("serveramount between", value1, value2, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServeramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("serveramount not between", value1, value2, "serveramount");
            return (Criteria) this;
        }

        public Criteria andServerdateIsNull() {
            addCriterion("serverdate is null");
            return (Criteria) this;
        }

        public Criteria andServerdateIsNotNull() {
            addCriterion("serverdate is not null");
            return (Criteria) this;
        }

        public Criteria andServerdateEqualTo(Date value) {
            addCriterion("serverdate =", value, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateNotEqualTo(Date value) {
            addCriterion("serverdate <>", value, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateGreaterThan(Date value) {
            addCriterion("serverdate >", value, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateGreaterThanOrEqualTo(Date value) {
            addCriterion("serverdate >=", value, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateLessThan(Date value) {
            addCriterion("serverdate <", value, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateLessThanOrEqualTo(Date value) {
            addCriterion("serverdate <=", value, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateIn(List<Date> values) {
            addCriterion("serverdate in", values, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateNotIn(List<Date> values) {
            addCriterion("serverdate not in", values, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateBetween(Date value1, Date value2) {
            addCriterion("serverdate between", value1, value2, "serverdate");
            return (Criteria) this;
        }

        public Criteria andServerdateNotBetween(Date value1, Date value2) {
            addCriterion("serverdate not between", value1, value2, "serverdate");
            return (Criteria) this;
        }

        public Criteria andApprovalamountIsNull() {
            addCriterion("approvalamount is null");
            return (Criteria) this;
        }

        public Criteria andApprovalamountIsNotNull() {
            addCriterion("approvalamount is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalamountEqualTo(BigDecimal value) {
            addCriterion("approvalamount =", value, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountNotEqualTo(BigDecimal value) {
            addCriterion("approvalamount <>", value, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountGreaterThan(BigDecimal value) {
            addCriterion("approvalamount >", value, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("approvalamount >=", value, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountLessThan(BigDecimal value) {
            addCriterion("approvalamount <", value, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("approvalamount <=", value, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountIn(List<BigDecimal> values) {
            addCriterion("approvalamount in", values, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountNotIn(List<BigDecimal> values) {
            addCriterion("approvalamount not in", values, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approvalamount between", value1, value2, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approvalamount not between", value1, value2, "approvalamount");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNull() {
            addCriterion("approvaldate is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNotNull() {
            addCriterion("approvaldate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateEqualTo(Date value) {
            addCriterion("approvaldate =", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotEqualTo(Date value) {
            addCriterion("approvaldate <>", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThan(Date value) {
            addCriterion("approvaldate >", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("approvaldate >=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThan(Date value) {
            addCriterion("approvaldate <", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("approvaldate <=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIn(List<Date> values) {
            addCriterion("approvaldate in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotIn(List<Date> values) {
            addCriterion("approvaldate not in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateBetween(Date value1, Date value2) {
            addCriterion("approvaldate between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("approvaldate not between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountIsNull() {
            addCriterion("prepaymentamount is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountIsNotNull() {
            addCriterion("prepaymentamount is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountEqualTo(BigDecimal value) {
            addCriterion("prepaymentamount =", value, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountNotEqualTo(BigDecimal value) {
            addCriterion("prepaymentamount <>", value, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountGreaterThan(BigDecimal value) {
            addCriterion("prepaymentamount >", value, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepaymentamount >=", value, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountLessThan(BigDecimal value) {
            addCriterion("prepaymentamount <", value, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepaymentamount <=", value, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountIn(List<BigDecimal> values) {
            addCriterion("prepaymentamount in", values, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountNotIn(List<BigDecimal> values) {
            addCriterion("prepaymentamount not in", values, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepaymentamount between", value1, value2, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymentamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepaymentamount not between", value1, value2, "prepaymentamount");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateIsNull() {
            addCriterion("prepaymemtdate is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateIsNotNull() {
            addCriterion("prepaymemtdate is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateEqualTo(Date value) {
            addCriterion("prepaymemtdate =", value, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateNotEqualTo(Date value) {
            addCriterion("prepaymemtdate <>", value, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateGreaterThan(Date value) {
            addCriterion("prepaymemtdate >", value, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateGreaterThanOrEqualTo(Date value) {
            addCriterion("prepaymemtdate >=", value, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateLessThan(Date value) {
            addCriterion("prepaymemtdate <", value, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateLessThanOrEqualTo(Date value) {
            addCriterion("prepaymemtdate <=", value, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateIn(List<Date> values) {
            addCriterion("prepaymemtdate in", values, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateNotIn(List<Date> values) {
            addCriterion("prepaymemtdate not in", values, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateBetween(Date value1, Date value2) {
            addCriterion("prepaymemtdate between", value1, value2, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymemtdateNotBetween(Date value1, Date value2) {
            addCriterion("prepaymemtdate not between", value1, value2, "prepaymemtdate");
            return (Criteria) this;
        }

        public Criteria andRateamountIsNull() {
            addCriterion("rateamount is null");
            return (Criteria) this;
        }

        public Criteria andRateamountIsNotNull() {
            addCriterion("rateamount is not null");
            return (Criteria) this;
        }

        public Criteria andRateamountEqualTo(BigDecimal value) {
            addCriterion("rateamount =", value, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountNotEqualTo(BigDecimal value) {
            addCriterion("rateamount <>", value, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountGreaterThan(BigDecimal value) {
            addCriterion("rateamount >", value, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rateamount >=", value, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountLessThan(BigDecimal value) {
            addCriterion("rateamount <", value, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rateamount <=", value, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountIn(List<BigDecimal> values) {
            addCriterion("rateamount in", values, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountNotIn(List<BigDecimal> values) {
            addCriterion("rateamount not in", values, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rateamount between", value1, value2, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRateamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rateamount not between", value1, value2, "rateamount");
            return (Criteria) this;
        }

        public Criteria andRatedateIsNull() {
            addCriterion("ratedate is null");
            return (Criteria) this;
        }

        public Criteria andRatedateIsNotNull() {
            addCriterion("ratedate is not null");
            return (Criteria) this;
        }

        public Criteria andRatedateEqualTo(Date value) {
            addCriterion("ratedate =", value, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateNotEqualTo(Date value) {
            addCriterion("ratedate <>", value, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateGreaterThan(Date value) {
            addCriterion("ratedate >", value, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ratedate >=", value, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateLessThan(Date value) {
            addCriterion("ratedate <", value, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateLessThanOrEqualTo(Date value) {
            addCriterion("ratedate <=", value, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateIn(List<Date> values) {
            addCriterion("ratedate in", values, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateNotIn(List<Date> values) {
            addCriterion("ratedate not in", values, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateBetween(Date value1, Date value2) {
            addCriterion("ratedate between", value1, value2, "ratedate");
            return (Criteria) this;
        }

        public Criteria andRatedateNotBetween(Date value1, Date value2) {
            addCriterion("ratedate not between", value1, value2, "ratedate");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("loanamount is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("loanamount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(BigDecimal value) {
            addCriterion("loanamount =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(BigDecimal value) {
            addCriterion("loanamount <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(BigDecimal value) {
            addCriterion("loanamount >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loanamount >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(BigDecimal value) {
            addCriterion("loanamount <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loanamount <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<BigDecimal> values) {
            addCriterion("loanamount in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<BigDecimal> values) {
            addCriterion("loanamount not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanamount between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanamount not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNull() {
            addCriterion("loandate is null");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNotNull() {
            addCriterion("loandate is not null");
            return (Criteria) this;
        }

        public Criteria andLoandateEqualTo(Date value) {
            addCriterion("loandate =", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotEqualTo(Date value) {
            addCriterion("loandate <>", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThan(Date value) {
            addCriterion("loandate >", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThanOrEqualTo(Date value) {
            addCriterion("loandate >=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThan(Date value) {
            addCriterion("loandate <", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThanOrEqualTo(Date value) {
            addCriterion("loandate <=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateIn(List<Date> values) {
            addCriterion("loandate in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotIn(List<Date> values) {
            addCriterion("loandate not in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateBetween(Date value1, Date value2) {
            addCriterion("loandate between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotBetween(Date value1, Date value2) {
            addCriterion("loandate not between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andNotationIsNull() {
            addCriterion("notation is null");
            return (Criteria) this;
        }

        public Criteria andNotationIsNotNull() {
            addCriterion("notation is not null");
            return (Criteria) this;
        }

        public Criteria andNotationEqualTo(String value) {
            addCriterion("notation =", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotEqualTo(String value) {
            addCriterion("notation <>", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationGreaterThan(String value) {
            addCriterion("notation >", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationGreaterThanOrEqualTo(String value) {
            addCriterion("notation >=", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationLessThan(String value) {
            addCriterion("notation <", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationLessThanOrEqualTo(String value) {
            addCriterion("notation <=", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationLike(String value) {
            addCriterion("notation like", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotLike(String value) {
            addCriterion("notation not like", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationIn(List<String> values) {
            addCriterion("notation in", values, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotIn(List<String> values) {
            addCriterion("notation not in", values, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationBetween(String value1, String value2) {
            addCriterion("notation between", value1, value2, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotBetween(String value1, String value2) {
            addCriterion("notation not between", value1, value2, "notation");
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