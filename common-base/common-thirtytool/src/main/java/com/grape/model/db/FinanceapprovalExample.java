package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceapprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceapprovalExample() {
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

        public Criteria andRepayplanrightflgIsNull() {
            addCriterion("repayplanrightflg is null");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgIsNotNull() {
            addCriterion("repayplanrightflg is not null");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgEqualTo(String value) {
            addCriterion("repayplanrightflg =", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgNotEqualTo(String value) {
            addCriterion("repayplanrightflg <>", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgGreaterThan(String value) {
            addCriterion("repayplanrightflg >", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgGreaterThanOrEqualTo(String value) {
            addCriterion("repayplanrightflg >=", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgLessThan(String value) {
            addCriterion("repayplanrightflg <", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgLessThanOrEqualTo(String value) {
            addCriterion("repayplanrightflg <=", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgLike(String value) {
            addCriterion("repayplanrightflg like", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgNotLike(String value) {
            addCriterion("repayplanrightflg not like", value, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgIn(List<String> values) {
            addCriterion("repayplanrightflg in", values, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgNotIn(List<String> values) {
            addCriterion("repayplanrightflg not in", values, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgBetween(String value1, String value2) {
            addCriterion("repayplanrightflg between", value1, value2, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightflgNotBetween(String value1, String value2) {
            addCriterion("repayplanrightflg not between", value1, value2, "repayplanrightflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteIsNull() {
            addCriterion("repayplanrightnote is null");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteIsNotNull() {
            addCriterion("repayplanrightnote is not null");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteEqualTo(String value) {
            addCriterion("repayplanrightnote =", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteNotEqualTo(String value) {
            addCriterion("repayplanrightnote <>", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteGreaterThan(String value) {
            addCriterion("repayplanrightnote >", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteGreaterThanOrEqualTo(String value) {
            addCriterion("repayplanrightnote >=", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteLessThan(String value) {
            addCriterion("repayplanrightnote <", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteLessThanOrEqualTo(String value) {
            addCriterion("repayplanrightnote <=", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteLike(String value) {
            addCriterion("repayplanrightnote like", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteNotLike(String value) {
            addCriterion("repayplanrightnote not like", value, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteIn(List<String> values) {
            addCriterion("repayplanrightnote in", values, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteNotIn(List<String> values) {
            addCriterion("repayplanrightnote not in", values, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteBetween(String value1, String value2) {
            addCriterion("repayplanrightnote between", value1, value2, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andRepayplanrightnoteNotBetween(String value1, String value2) {
            addCriterion("repayplanrightnote not between", value1, value2, "repayplanrightnote");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andLoannotationIsNull() {
            addCriterion("loannotation is null");
            return (Criteria) this;
        }

        public Criteria andLoannotationIsNotNull() {
            addCriterion("loannotation is not null");
            return (Criteria) this;
        }

        public Criteria andLoannotationEqualTo(String value) {
            addCriterion("loannotation =", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationNotEqualTo(String value) {
            addCriterion("loannotation <>", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationGreaterThan(String value) {
            addCriterion("loannotation >", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationGreaterThanOrEqualTo(String value) {
            addCriterion("loannotation >=", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationLessThan(String value) {
            addCriterion("loannotation <", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationLessThanOrEqualTo(String value) {
            addCriterion("loannotation <=", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationLike(String value) {
            addCriterion("loannotation like", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationNotLike(String value) {
            addCriterion("loannotation not like", value, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationIn(List<String> values) {
            addCriterion("loannotation in", values, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationNotIn(List<String> values) {
            addCriterion("loannotation not in", values, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationBetween(String value1, String value2) {
            addCriterion("loannotation between", value1, value2, "loannotation");
            return (Criteria) this;
        }

        public Criteria andLoannotationNotBetween(String value1, String value2) {
            addCriterion("loannotation not between", value1, value2, "loannotation");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNull() {
            addCriterion("nodeid is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("nodeid is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(String value) {
            addCriterion("nodeid =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(String value) {
            addCriterion("nodeid <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(String value) {
            addCriterion("nodeid >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(String value) {
            addCriterion("nodeid >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(String value) {
            addCriterion("nodeid <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(String value) {
            addCriterion("nodeid <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLike(String value) {
            addCriterion("nodeid like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotLike(String value) {
            addCriterion("nodeid not like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<String> values) {
            addCriterion("nodeid in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<String> values) {
            addCriterion("nodeid not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(String value1, String value2) {
            addCriterion("nodeid between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(String value1, String value2) {
            addCriterion("nodeid not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andCapitaldateIsNull() {
            addCriterion("capitaldate is null");
            return (Criteria) this;
        }

        public Criteria andCapitaldateIsNotNull() {
            addCriterion("capitaldate is not null");
            return (Criteria) this;
        }

        public Criteria andCapitaldateEqualTo(Date value) {
            addCriterion("capitaldate =", value, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateNotEqualTo(Date value) {
            addCriterion("capitaldate <>", value, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateGreaterThan(Date value) {
            addCriterion("capitaldate >", value, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("capitaldate >=", value, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateLessThan(Date value) {
            addCriterion("capitaldate <", value, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateLessThanOrEqualTo(Date value) {
            addCriterion("capitaldate <=", value, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateIn(List<Date> values) {
            addCriterion("capitaldate in", values, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateNotIn(List<Date> values) {
            addCriterion("capitaldate not in", values, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateBetween(Date value1, Date value2) {
            addCriterion("capitaldate between", value1, value2, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitaldateNotBetween(Date value1, Date value2) {
            addCriterion("capitaldate not between", value1, value2, "capitaldate");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(BigDecimal value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(BigDecimal value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(BigDecimal value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(BigDecimal value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<BigDecimal> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<BigDecimal> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital not between", value1, value2, "capital");
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

        public Criteria andPrepaymentdateIsNull() {
            addCriterion("prepaymentdate is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateIsNotNull() {
            addCriterion("prepaymentdate is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateEqualTo(Date value) {
            addCriterion("prepaymentdate =", value, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateNotEqualTo(Date value) {
            addCriterion("prepaymentdate <>", value, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateGreaterThan(Date value) {
            addCriterion("prepaymentdate >", value, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("prepaymentdate >=", value, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateLessThan(Date value) {
            addCriterion("prepaymentdate <", value, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateLessThanOrEqualTo(Date value) {
            addCriterion("prepaymentdate <=", value, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateIn(List<Date> values) {
            addCriterion("prepaymentdate in", values, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateNotIn(List<Date> values) {
            addCriterion("prepaymentdate not in", values, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateBetween(Date value1, Date value2) {
            addCriterion("prepaymentdate between", value1, value2, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentdateNotBetween(Date value1, Date value2) {
            addCriterion("prepaymentdate not between", value1, value2, "prepaymentdate");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeIsNull() {
            addCriterion("prepaymentfee is null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeIsNotNull() {
            addCriterion("prepaymentfee is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeEqualTo(BigDecimal value) {
            addCriterion("prepaymentfee =", value, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeNotEqualTo(BigDecimal value) {
            addCriterion("prepaymentfee <>", value, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeGreaterThan(BigDecimal value) {
            addCriterion("prepaymentfee >", value, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepaymentfee >=", value, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeLessThan(BigDecimal value) {
            addCriterion("prepaymentfee <", value, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepaymentfee <=", value, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeIn(List<BigDecimal> values) {
            addCriterion("prepaymentfee in", values, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeNotIn(List<BigDecimal> values) {
            addCriterion("prepaymentfee not in", values, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepaymentfee between", value1, value2, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andPrepaymentfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepaymentfee not between", value1, value2, "prepaymentfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateIsNull() {
            addCriterion("approvalfeedate is null");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateIsNotNull() {
            addCriterion("approvalfeedate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateEqualTo(Date value) {
            addCriterion("approvalfeedate =", value, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateNotEqualTo(Date value) {
            addCriterion("approvalfeedate <>", value, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateGreaterThan(Date value) {
            addCriterion("approvalfeedate >", value, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateGreaterThanOrEqualTo(Date value) {
            addCriterion("approvalfeedate >=", value, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateLessThan(Date value) {
            addCriterion("approvalfeedate <", value, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateLessThanOrEqualTo(Date value) {
            addCriterion("approvalfeedate <=", value, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateIn(List<Date> values) {
            addCriterion("approvalfeedate in", values, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateNotIn(List<Date> values) {
            addCriterion("approvalfeedate not in", values, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateBetween(Date value1, Date value2) {
            addCriterion("approvalfeedate between", value1, value2, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeedateNotBetween(Date value1, Date value2) {
            addCriterion("approvalfeedate not between", value1, value2, "approvalfeedate");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeIsNull() {
            addCriterion("approvalfee is null");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeIsNotNull() {
            addCriterion("approvalfee is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeEqualTo(BigDecimal value) {
            addCriterion("approvalfee =", value, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeNotEqualTo(BigDecimal value) {
            addCriterion("approvalfee <>", value, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeGreaterThan(BigDecimal value) {
            addCriterion("approvalfee >", value, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("approvalfee >=", value, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeLessThan(BigDecimal value) {
            addCriterion("approvalfee <", value, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("approvalfee <=", value, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeIn(List<BigDecimal> values) {
            addCriterion("approvalfee in", values, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeNotIn(List<BigDecimal> values) {
            addCriterion("approvalfee not in", values, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approvalfee between", value1, value2, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andApprovalfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("approvalfee not between", value1, value2, "approvalfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeIsNull() {
            addCriterion("serverfee is null");
            return (Criteria) this;
        }

        public Criteria andServerfeeIsNotNull() {
            addCriterion("serverfee is not null");
            return (Criteria) this;
        }

        public Criteria andServerfeeEqualTo(BigDecimal value) {
            addCriterion("serverfee =", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotEqualTo(BigDecimal value) {
            addCriterion("serverfee <>", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeGreaterThan(BigDecimal value) {
            addCriterion("serverfee >", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("serverfee >=", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeLessThan(BigDecimal value) {
            addCriterion("serverfee <", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("serverfee <=", value, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeIn(List<BigDecimal> values) {
            addCriterion("serverfee in", values, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotIn(List<BigDecimal> values) {
            addCriterion("serverfee not in", values, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("serverfee between", value1, value2, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("serverfee not between", value1, value2, "serverfee");
            return (Criteria) this;
        }

        public Criteria andServerfeedateIsNull() {
            addCriterion("serverfeedate is null");
            return (Criteria) this;
        }

        public Criteria andServerfeedateIsNotNull() {
            addCriterion("serverfeedate is not null");
            return (Criteria) this;
        }

        public Criteria andServerfeedateEqualTo(Date value) {
            addCriterion("serverfeedate =", value, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateNotEqualTo(Date value) {
            addCriterion("serverfeedate <>", value, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateGreaterThan(Date value) {
            addCriterion("serverfeedate >", value, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateGreaterThanOrEqualTo(Date value) {
            addCriterion("serverfeedate >=", value, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateLessThan(Date value) {
            addCriterion("serverfeedate <", value, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateLessThanOrEqualTo(Date value) {
            addCriterion("serverfeedate <=", value, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateIn(List<Date> values) {
            addCriterion("serverfeedate in", values, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateNotIn(List<Date> values) {
            addCriterion("serverfeedate not in", values, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateBetween(Date value1, Date value2) {
            addCriterion("serverfeedate between", value1, value2, "serverfeedate");
            return (Criteria) this;
        }

        public Criteria andServerfeedateNotBetween(Date value1, Date value2) {
            addCriterion("serverfeedate not between", value1, value2, "serverfeedate");
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