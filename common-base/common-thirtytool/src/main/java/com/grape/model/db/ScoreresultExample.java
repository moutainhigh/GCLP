package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreresultExample() {
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

        public Criteria andCustgradeIsNull() {
            addCriterion("custgrade is null");
            return (Criteria) this;
        }

        public Criteria andCustgradeIsNotNull() {
            addCriterion("custgrade is not null");
            return (Criteria) this;
        }

        public Criteria andCustgradeEqualTo(BigDecimal value) {
            addCriterion("custgrade =", value, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeNotEqualTo(BigDecimal value) {
            addCriterion("custgrade <>", value, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeGreaterThan(BigDecimal value) {
            addCriterion("custgrade >", value, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custgrade >=", value, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeLessThan(BigDecimal value) {
            addCriterion("custgrade <", value, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custgrade <=", value, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeIn(List<BigDecimal> values) {
            addCriterion("custgrade in", values, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeNotIn(List<BigDecimal> values) {
            addCriterion("custgrade not in", values, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custgrade between", value1, value2, "custgrade");
            return (Criteria) this;
        }

        public Criteria andCustgradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custgrade not between", value1, value2, "custgrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeIsNull() {
            addCriterion("pledgegrade is null");
            return (Criteria) this;
        }

        public Criteria andPledgegradeIsNotNull() {
            addCriterion("pledgegrade is not null");
            return (Criteria) this;
        }

        public Criteria andPledgegradeEqualTo(BigDecimal value) {
            addCriterion("pledgegrade =", value, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeNotEqualTo(BigDecimal value) {
            addCriterion("pledgegrade <>", value, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeGreaterThan(BigDecimal value) {
            addCriterion("pledgegrade >", value, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pledgegrade >=", value, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeLessThan(BigDecimal value) {
            addCriterion("pledgegrade <", value, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pledgegrade <=", value, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeIn(List<BigDecimal> values) {
            addCriterion("pledgegrade in", values, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeNotIn(List<BigDecimal> values) {
            addCriterion("pledgegrade not in", values, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pledgegrade between", value1, value2, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andPledgegradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pledgegrade not between", value1, value2, "pledgegrade");
            return (Criteria) this;
        }

        public Criteria andCreditidIsNull() {
            addCriterion("creditid is null");
            return (Criteria) this;
        }

        public Criteria andCreditidIsNotNull() {
            addCriterion("creditid is not null");
            return (Criteria) this;
        }

        public Criteria andCreditidEqualTo(String value) {
            addCriterion("creditid =", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidNotEqualTo(String value) {
            addCriterion("creditid <>", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidGreaterThan(String value) {
            addCriterion("creditid >", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidGreaterThanOrEqualTo(String value) {
            addCriterion("creditid >=", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidLessThan(String value) {
            addCriterion("creditid <", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidLessThanOrEqualTo(String value) {
            addCriterion("creditid <=", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidLike(String value) {
            addCriterion("creditid like", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidNotLike(String value) {
            addCriterion("creditid not like", value, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidIn(List<String> values) {
            addCriterion("creditid in", values, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidNotIn(List<String> values) {
            addCriterion("creditid not in", values, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidBetween(String value1, String value2) {
            addCriterion("creditid between", value1, value2, "creditid");
            return (Criteria) this;
        }

        public Criteria andCreditidNotBetween(String value1, String value2) {
            addCriterion("creditid not between", value1, value2, "creditid");
            return (Criteria) this;
        }

        public Criteria andRategradeIsNull() {
            addCriterion("rategrade is null");
            return (Criteria) this;
        }

        public Criteria andRategradeIsNotNull() {
            addCriterion("rategrade is not null");
            return (Criteria) this;
        }

        public Criteria andRategradeEqualTo(BigDecimal value) {
            addCriterion("rategrade =", value, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeNotEqualTo(BigDecimal value) {
            addCriterion("rategrade <>", value, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeGreaterThan(BigDecimal value) {
            addCriterion("rategrade >", value, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rategrade >=", value, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeLessThan(BigDecimal value) {
            addCriterion("rategrade <", value, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rategrade <=", value, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeIn(List<BigDecimal> values) {
            addCriterion("rategrade in", values, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeNotIn(List<BigDecimal> values) {
            addCriterion("rategrade not in", values, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rategrade between", value1, value2, "rategrade");
            return (Criteria) this;
        }

        public Criteria andRategradeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rategrade not between", value1, value2, "rategrade");
            return (Criteria) this;
        }

        public Criteria andMortgagerateIsNull() {
            addCriterion("mortgagerate is null");
            return (Criteria) this;
        }

        public Criteria andMortgagerateIsNotNull() {
            addCriterion("mortgagerate is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagerateEqualTo(BigDecimal value) {
            addCriterion("mortgagerate =", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateNotEqualTo(BigDecimal value) {
            addCriterion("mortgagerate <>", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateGreaterThan(BigDecimal value) {
            addCriterion("mortgagerate >", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagerate >=", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateLessThan(BigDecimal value) {
            addCriterion("mortgagerate <", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagerate <=", value, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateIn(List<BigDecimal> values) {
            addCriterion("mortgagerate in", values, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateNotIn(List<BigDecimal> values) {
            addCriterion("mortgagerate not in", values, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagerate between", value1, value2, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgagerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagerate not between", value1, value2, "mortgagerate");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPledgeidIsNull() {
            addCriterion("pledgeid is null");
            return (Criteria) this;
        }

        public Criteria andPledgeidIsNotNull() {
            addCriterion("pledgeid is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeidEqualTo(String value) {
            addCriterion("pledgeid =", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidNotEqualTo(String value) {
            addCriterion("pledgeid <>", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidGreaterThan(String value) {
            addCriterion("pledgeid >", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidGreaterThanOrEqualTo(String value) {
            addCriterion("pledgeid >=", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidLessThan(String value) {
            addCriterion("pledgeid <", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidLessThanOrEqualTo(String value) {
            addCriterion("pledgeid <=", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidLike(String value) {
            addCriterion("pledgeid like", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidNotLike(String value) {
            addCriterion("pledgeid not like", value, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidIn(List<String> values) {
            addCriterion("pledgeid in", values, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidNotIn(List<String> values) {
            addCriterion("pledgeid not in", values, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidBetween(String value1, String value2) {
            addCriterion("pledgeid between", value1, value2, "pledgeid");
            return (Criteria) this;
        }

        public Criteria andPledgeidNotBetween(String value1, String value2) {
            addCriterion("pledgeid not between", value1, value2, "pledgeid");
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