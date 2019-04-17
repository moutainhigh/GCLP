package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RepayplanmainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepayplanmainExample() {
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

        public Criteria andTotalcreditlineIsNull() {
            addCriterion("totalcreditline is null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineIsNotNull() {
            addCriterion("totalcreditline is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineEqualTo(BigDecimal value) {
            addCriterion("totalcreditline =", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineNotEqualTo(BigDecimal value) {
            addCriterion("totalcreditline <>", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineGreaterThan(BigDecimal value) {
            addCriterion("totalcreditline >", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalcreditline >=", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineLessThan(BigDecimal value) {
            addCriterion("totalcreditline <", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalcreditline <=", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineIn(List<BigDecimal> values) {
            addCriterion("totalcreditline in", values, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineNotIn(List<BigDecimal> values) {
            addCriterion("totalcreditline not in", values, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalcreditline between", value1, value2, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalcreditline not between", value1, value2, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodIsNull() {
            addCriterion("generalcreditperiod is null");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodIsNotNull() {
            addCriterion("generalcreditperiod is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodEqualTo(Integer value) {
            addCriterion("generalcreditperiod =", value, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodNotEqualTo(Integer value) {
            addCriterion("generalcreditperiod <>", value, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodGreaterThan(Integer value) {
            addCriterion("generalcreditperiod >", value, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("generalcreditperiod >=", value, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodLessThan(Integer value) {
            addCriterion("generalcreditperiod <", value, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodLessThanOrEqualTo(Integer value) {
            addCriterion("generalcreditperiod <=", value, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodIn(List<Integer> values) {
            addCriterion("generalcreditperiod in", values, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodNotIn(List<Integer> values) {
            addCriterion("generalcreditperiod not in", values, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodBetween(Integer value1, Integer value2) {
            addCriterion("generalcreditperiod between", value1, value2, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andGeneralcreditperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("generalcreditperiod not between", value1, value2, "generalcreditperiod");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalIsNull() {
            addCriterion("loanprincipal is null");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalIsNotNull() {
            addCriterion("loanprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalEqualTo(BigDecimal value) {
            addCriterion("loanprincipal =", value, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalNotEqualTo(BigDecimal value) {
            addCriterion("loanprincipal <>", value, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalGreaterThan(BigDecimal value) {
            addCriterion("loanprincipal >", value, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loanprincipal >=", value, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalLessThan(BigDecimal value) {
            addCriterion("loanprincipal <", value, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loanprincipal <=", value, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalIn(List<BigDecimal> values) {
            addCriterion("loanprincipal in", values, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalNotIn(List<BigDecimal> values) {
            addCriterion("loanprincipal not in", values, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanprincipal between", value1, value2, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andLoanprincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanprincipal not between", value1, value2, "loanprincipal");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoIsNull() {
            addCriterion("borrowinginto is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoIsNotNull() {
            addCriterion("borrowinginto is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoEqualTo(String value) {
            addCriterion("borrowinginto =", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoNotEqualTo(String value) {
            addCriterion("borrowinginto <>", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoGreaterThan(String value) {
            addCriterion("borrowinginto >", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoGreaterThanOrEqualTo(String value) {
            addCriterion("borrowinginto >=", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoLessThan(String value) {
            addCriterion("borrowinginto <", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoLessThanOrEqualTo(String value) {
            addCriterion("borrowinginto <=", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoLike(String value) {
            addCriterion("borrowinginto like", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoNotLike(String value) {
            addCriterion("borrowinginto not like", value, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoIn(List<String> values) {
            addCriterion("borrowinginto in", values, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoNotIn(List<String> values) {
            addCriterion("borrowinginto not in", values, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoBetween(String value1, String value2) {
            addCriterion("borrowinginto between", value1, value2, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andBorrowingintoNotBetween(String value1, String value2) {
            addCriterion("borrowinginto not between", value1, value2, "borrowinginto");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsIsNull() {
            addCriterion("loanperiods is null");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsIsNotNull() {
            addCriterion("loanperiods is not null");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsEqualTo(Integer value) {
            addCriterion("loanperiods =", value, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsNotEqualTo(Integer value) {
            addCriterion("loanperiods <>", value, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsGreaterThan(Integer value) {
            addCriterion("loanperiods >", value, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("loanperiods >=", value, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsLessThan(Integer value) {
            addCriterion("loanperiods <", value, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsLessThanOrEqualTo(Integer value) {
            addCriterion("loanperiods <=", value, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsIn(List<Integer> values) {
            addCriterion("loanperiods in", values, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsNotIn(List<Integer> values) {
            addCriterion("loanperiods not in", values, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsBetween(Integer value1, Integer value2) {
            addCriterion("loanperiods between", value1, value2, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andLoanperiodsNotBetween(Integer value1, Integer value2) {
            addCriterion("loanperiods not between", value1, value2, "loanperiods");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesIsNull() {
            addCriterion("borrowingrates is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesIsNotNull() {
            addCriterion("borrowingrates is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesEqualTo(BigDecimal value) {
            addCriterion("borrowingrates =", value, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesNotEqualTo(BigDecimal value) {
            addCriterion("borrowingrates <>", value, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesGreaterThan(BigDecimal value) {
            addCriterion("borrowingrates >", value, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowingrates >=", value, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesLessThan(BigDecimal value) {
            addCriterion("borrowingrates <", value, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowingrates <=", value, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesIn(List<BigDecimal> values) {
            addCriterion("borrowingrates in", values, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesNotIn(List<BigDecimal> values) {
            addCriterion("borrowingrates not in", values, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowingrates between", value1, value2, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andBorrowingratesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowingrates not between", value1, value2, "borrowingrates");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankIsNull() {
            addCriterion("reimbursementbank is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankIsNotNull() {
            addCriterion("reimbursementbank is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankEqualTo(String value) {
            addCriterion("reimbursementbank =", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankNotEqualTo(String value) {
            addCriterion("reimbursementbank <>", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankGreaterThan(String value) {
            addCriterion("reimbursementbank >", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankGreaterThanOrEqualTo(String value) {
            addCriterion("reimbursementbank >=", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankLessThan(String value) {
            addCriterion("reimbursementbank <", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankLessThanOrEqualTo(String value) {
            addCriterion("reimbursementbank <=", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankLike(String value) {
            addCriterion("reimbursementbank like", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankNotLike(String value) {
            addCriterion("reimbursementbank not like", value, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankIn(List<String> values) {
            addCriterion("reimbursementbank in", values, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankNotIn(List<String> values) {
            addCriterion("reimbursementbank not in", values, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankBetween(String value1, String value2) {
            addCriterion("reimbursementbank between", value1, value2, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andReimbursementbankNotBetween(String value1, String value2) {
            addCriterion("reimbursementbank not between", value1, value2, "reimbursementbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameIsNull() {
            addCriterion("repaymentname is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameIsNotNull() {
            addCriterion("repaymentname is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameEqualTo(String value) {
            addCriterion("repaymentname =", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotEqualTo(String value) {
            addCriterion("repaymentname <>", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameGreaterThan(String value) {
            addCriterion("repaymentname >", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentname >=", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameLessThan(String value) {
            addCriterion("repaymentname <", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameLessThanOrEqualTo(String value) {
            addCriterion("repaymentname <=", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameLike(String value) {
            addCriterion("repaymentname like", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotLike(String value) {
            addCriterion("repaymentname not like", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameIn(List<String> values) {
            addCriterion("repaymentname in", values, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotIn(List<String> values) {
            addCriterion("repaymentname not in", values, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameBetween(String value1, String value2) {
            addCriterion("repaymentname between", value1, value2, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotBetween(String value1, String value2) {
            addCriterion("repaymentname not between", value1, value2, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountIsNull() {
            addCriterion("repaymentaccount is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountIsNotNull() {
            addCriterion("repaymentaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountEqualTo(String value) {
            addCriterion("repaymentaccount =", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotEqualTo(String value) {
            addCriterion("repaymentaccount <>", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountGreaterThan(String value) {
            addCriterion("repaymentaccount >", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentaccount >=", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountLessThan(String value) {
            addCriterion("repaymentaccount <", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountLessThanOrEqualTo(String value) {
            addCriterion("repaymentaccount <=", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountLike(String value) {
            addCriterion("repaymentaccount like", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotLike(String value) {
            addCriterion("repaymentaccount not like", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountIn(List<String> values) {
            addCriterion("repaymentaccount in", values, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotIn(List<String> values) {
            addCriterion("repaymentaccount not in", values, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountBetween(String value1, String value2) {
            addCriterion("repaymentaccount between", value1, value2, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotBetween(String value1, String value2) {
            addCriterion("repaymentaccount not between", value1, value2, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansIsNull() {
            addCriterion("reimbursementmeans is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansIsNotNull() {
            addCriterion("reimbursementmeans is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansEqualTo(String value) {
            addCriterion("reimbursementmeans =", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansNotEqualTo(String value) {
            addCriterion("reimbursementmeans <>", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansGreaterThan(String value) {
            addCriterion("reimbursementmeans >", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansGreaterThanOrEqualTo(String value) {
            addCriterion("reimbursementmeans >=", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansLessThan(String value) {
            addCriterion("reimbursementmeans <", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansLessThanOrEqualTo(String value) {
            addCriterion("reimbursementmeans <=", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansLike(String value) {
            addCriterion("reimbursementmeans like", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansNotLike(String value) {
            addCriterion("reimbursementmeans not like", value, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansIn(List<String> values) {
            addCriterion("reimbursementmeans in", values, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansNotIn(List<String> values) {
            addCriterion("reimbursementmeans not in", values, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansBetween(String value1, String value2) {
            addCriterion("reimbursementmeans between", value1, value2, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementmeansNotBetween(String value1, String value2) {
            addCriterion("reimbursementmeans not between", value1, value2, "reimbursementmeans");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteIsNull() {
            addCriterion("reimbursementnote is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteIsNotNull() {
            addCriterion("reimbursementnote is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteEqualTo(String value) {
            addCriterion("reimbursementnote =", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteNotEqualTo(String value) {
            addCriterion("reimbursementnote <>", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteGreaterThan(String value) {
            addCriterion("reimbursementnote >", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteGreaterThanOrEqualTo(String value) {
            addCriterion("reimbursementnote >=", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteLessThan(String value) {
            addCriterion("reimbursementnote <", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteLessThanOrEqualTo(String value) {
            addCriterion("reimbursementnote <=", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteLike(String value) {
            addCriterion("reimbursementnote like", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteNotLike(String value) {
            addCriterion("reimbursementnote not like", value, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteIn(List<String> values) {
            addCriterion("reimbursementnote in", values, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteNotIn(List<String> values) {
            addCriterion("reimbursementnote not in", values, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteBetween(String value1, String value2) {
            addCriterion("reimbursementnote between", value1, value2, "reimbursementnote");
            return (Criteria) this;
        }

        public Criteria andReimbursementnoteNotBetween(String value1, String value2) {
            addCriterion("reimbursementnote not between", value1, value2, "reimbursementnote");
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