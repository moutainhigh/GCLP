package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessappinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessappinfoExample() {
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

        public Criteria andLoanchangeflgIsNull() {
            addCriterion("loanchangeflg is null");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgIsNotNull() {
            addCriterion("loanchangeflg is not null");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgEqualTo(String value) {
            addCriterion("loanchangeflg =", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgNotEqualTo(String value) {
            addCriterion("loanchangeflg <>", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgGreaterThan(String value) {
            addCriterion("loanchangeflg >", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgGreaterThanOrEqualTo(String value) {
            addCriterion("loanchangeflg >=", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgLessThan(String value) {
            addCriterion("loanchangeflg <", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgLessThanOrEqualTo(String value) {
            addCriterion("loanchangeflg <=", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgLike(String value) {
            addCriterion("loanchangeflg like", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgNotLike(String value) {
            addCriterion("loanchangeflg not like", value, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgIn(List<String> values) {
            addCriterion("loanchangeflg in", values, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgNotIn(List<String> values) {
            addCriterion("loanchangeflg not in", values, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgBetween(String value1, String value2) {
            addCriterion("loanchangeflg between", value1, value2, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andLoanchangeflgNotBetween(String value1, String value2) {
            addCriterion("loanchangeflg not between", value1, value2, "loanchangeflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgIsNull() {
            addCriterion("agreeloanflg is null");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgIsNotNull() {
            addCriterion("agreeloanflg is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgEqualTo(String value) {
            addCriterion("agreeloanflg =", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgNotEqualTo(String value) {
            addCriterion("agreeloanflg <>", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgGreaterThan(String value) {
            addCriterion("agreeloanflg >", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgGreaterThanOrEqualTo(String value) {
            addCriterion("agreeloanflg >=", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgLessThan(String value) {
            addCriterion("agreeloanflg <", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgLessThanOrEqualTo(String value) {
            addCriterion("agreeloanflg <=", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgLike(String value) {
            addCriterion("agreeloanflg like", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgNotLike(String value) {
            addCriterion("agreeloanflg not like", value, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgIn(List<String> values) {
            addCriterion("agreeloanflg in", values, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgNotIn(List<String> values) {
            addCriterion("agreeloanflg not in", values, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgBetween(String value1, String value2) {
            addCriterion("agreeloanflg between", value1, value2, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeloanflgNotBetween(String value1, String value2) {
            addCriterion("agreeloanflg not between", value1, value2, "agreeloanflg");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNull() {
            addCriterion("applyamount is null");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNotNull() {
            addCriterion("applyamount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyamountEqualTo(BigDecimal value) {
            addCriterion("applyamount =", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotEqualTo(BigDecimal value) {
            addCriterion("applyamount <>", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThan(BigDecimal value) {
            addCriterion("applyamount >", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("applyamount >=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThan(BigDecimal value) {
            addCriterion("applyamount <", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("applyamount <=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountIn(List<BigDecimal> values) {
            addCriterion("applyamount in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotIn(List<BigDecimal> values) {
            addCriterion("applyamount not in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applyamount between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applyamount not between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyrateIsNull() {
            addCriterion("applyrate is null");
            return (Criteria) this;
        }

        public Criteria andApplyrateIsNotNull() {
            addCriterion("applyrate is not null");
            return (Criteria) this;
        }

        public Criteria andApplyrateEqualTo(BigDecimal value) {
            addCriterion("applyrate =", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateNotEqualTo(BigDecimal value) {
            addCriterion("applyrate <>", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateGreaterThan(BigDecimal value) {
            addCriterion("applyrate >", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("applyrate >=", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateLessThan(BigDecimal value) {
            addCriterion("applyrate <", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("applyrate <=", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateIn(List<BigDecimal> values) {
            addCriterion("applyrate in", values, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateNotIn(List<BigDecimal> values) {
            addCriterion("applyrate not in", values, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applyrate between", value1, value2, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applyrate not between", value1, value2, "applyrate");
            return (Criteria) this;
        }

        public Criteria andYearofapplyIsNull() {
            addCriterion("yearofapply is null");
            return (Criteria) this;
        }

        public Criteria andYearofapplyIsNotNull() {
            addCriterion("yearofapply is not null");
            return (Criteria) this;
        }

        public Criteria andYearofapplyEqualTo(String value) {
            addCriterion("yearofapply =", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyNotEqualTo(String value) {
            addCriterion("yearofapply <>", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyGreaterThan(String value) {
            addCriterion("yearofapply >", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyGreaterThanOrEqualTo(String value) {
            addCriterion("yearofapply >=", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyLessThan(String value) {
            addCriterion("yearofapply <", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyLessThanOrEqualTo(String value) {
            addCriterion("yearofapply <=", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyLike(String value) {
            addCriterion("yearofapply like", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyNotLike(String value) {
            addCriterion("yearofapply not like", value, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyIn(List<String> values) {
            addCriterion("yearofapply in", values, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyNotIn(List<String> values) {
            addCriterion("yearofapply not in", values, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyBetween(String value1, String value2) {
            addCriterion("yearofapply between", value1, value2, "yearofapply");
            return (Criteria) this;
        }

        public Criteria andYearofapplyNotBetween(String value1, String value2) {
            addCriterion("yearofapply not between", value1, value2, "yearofapply");
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

        public Criteria andCheckresultIsNull() {
            addCriterion("checkresult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("checkresult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("checkresult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("checkresult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("checkresult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("checkresult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("checkresult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("checkresult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("checkresult like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("checkresult not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("checkresult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("checkresult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("checkresult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("checkresult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIsNull() {
            addCriterion("approvetype is null");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIsNotNull() {
            addCriterion("approvetype is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetypeEqualTo(String value) {
            addCriterion("approvetype =", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotEqualTo(String value) {
            addCriterion("approvetype <>", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeGreaterThan(String value) {
            addCriterion("approvetype >", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeGreaterThanOrEqualTo(String value) {
            addCriterion("approvetype >=", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLessThan(String value) {
            addCriterion("approvetype <", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLessThanOrEqualTo(String value) {
            addCriterion("approvetype <=", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeLike(String value) {
            addCriterion("approvetype like", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotLike(String value) {
            addCriterion("approvetype not like", value, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeIn(List<String> values) {
            addCriterion("approvetype in", values, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotIn(List<String> values) {
            addCriterion("approvetype not in", values, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeBetween(String value1, String value2) {
            addCriterion("approvetype between", value1, value2, "approvetype");
            return (Criteria) this;
        }

        public Criteria andApprovetypeNotBetween(String value1, String value2) {
            addCriterion("approvetype not between", value1, value2, "approvetype");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoIsNull() {
            addCriterion("additionalinfo is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoIsNotNull() {
            addCriterion("additionalinfo is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoEqualTo(String value) {
            addCriterion("additionalinfo =", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoNotEqualTo(String value) {
            addCriterion("additionalinfo <>", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoGreaterThan(String value) {
            addCriterion("additionalinfo >", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoGreaterThanOrEqualTo(String value) {
            addCriterion("additionalinfo >=", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoLessThan(String value) {
            addCriterion("additionalinfo <", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoLessThanOrEqualTo(String value) {
            addCriterion("additionalinfo <=", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoLike(String value) {
            addCriterion("additionalinfo like", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoNotLike(String value) {
            addCriterion("additionalinfo not like", value, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoIn(List<String> values) {
            addCriterion("additionalinfo in", values, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoNotIn(List<String> values) {
            addCriterion("additionalinfo not in", values, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoBetween(String value1, String value2) {
            addCriterion("additionalinfo between", value1, value2, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalinfoNotBetween(String value1, String value2) {
            addCriterion("additionalinfo not between", value1, value2, "additionalinfo");
            return (Criteria) this;
        }

        public Criteria andApprovepersonIsNull() {
            addCriterion("approveperson is null");
            return (Criteria) this;
        }

        public Criteria andApprovepersonIsNotNull() {
            addCriterion("approveperson is not null");
            return (Criteria) this;
        }

        public Criteria andApprovepersonEqualTo(String value) {
            addCriterion("approveperson =", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonNotEqualTo(String value) {
            addCriterion("approveperson <>", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonGreaterThan(String value) {
            addCriterion("approveperson >", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonGreaterThanOrEqualTo(String value) {
            addCriterion("approveperson >=", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonLessThan(String value) {
            addCriterion("approveperson <", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonLessThanOrEqualTo(String value) {
            addCriterion("approveperson <=", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonLike(String value) {
            addCriterion("approveperson like", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonNotLike(String value) {
            addCriterion("approveperson not like", value, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonIn(List<String> values) {
            addCriterion("approveperson in", values, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonNotIn(List<String> values) {
            addCriterion("approveperson not in", values, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonBetween(String value1, String value2) {
            addCriterion("approveperson between", value1, value2, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovepersonNotBetween(String value1, String value2) {
            addCriterion("approveperson not between", value1, value2, "approveperson");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNull() {
            addCriterion("approvetime is null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNotNull() {
            addCriterion("approvetime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeEqualTo(Date value) {
            addCriterion("approvetime =", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotEqualTo(Date value) {
            addCriterion("approvetime <>", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThan(Date value) {
            addCriterion("approvetime >", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approvetime >=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThan(Date value) {
            addCriterion("approvetime <", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThanOrEqualTo(Date value) {
            addCriterion("approvetime <=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIn(List<Date> values) {
            addCriterion("approvetime in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotIn(List<Date> values) {
            addCriterion("approvetime not in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeBetween(Date value1, Date value2) {
            addCriterion("approvetime between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotBetween(Date value1, Date value2) {
            addCriterion("approvetime not between", value1, value2, "approvetime");
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