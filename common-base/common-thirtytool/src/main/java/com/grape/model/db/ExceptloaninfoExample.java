package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExceptloaninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExceptloaninfoExample() {
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

        public Criteria andExpectapplyamountIsNull() {
            addCriterion("expectapplyamount is null");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountIsNotNull() {
            addCriterion("expectapplyamount is not null");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountEqualTo(BigDecimal value) {
            addCriterion("expectapplyamount =", value, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountNotEqualTo(BigDecimal value) {
            addCriterion("expectapplyamount <>", value, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountGreaterThan(BigDecimal value) {
            addCriterion("expectapplyamount >", value, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expectapplyamount >=", value, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountLessThan(BigDecimal value) {
            addCriterion("expectapplyamount <", value, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expectapplyamount <=", value, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountIn(List<BigDecimal> values) {
            addCriterion("expectapplyamount in", values, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountNotIn(List<BigDecimal> values) {
            addCriterion("expectapplyamount not in", values, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expectapplyamount between", value1, value2, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expectapplyamount not between", value1, value2, "expectapplyamount");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateIsNull() {
            addCriterion("expectapplyrate is null");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateIsNotNull() {
            addCriterion("expectapplyrate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateEqualTo(BigDecimal value) {
            addCriterion("expectapplyrate =", value, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateNotEqualTo(BigDecimal value) {
            addCriterion("expectapplyrate <>", value, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateGreaterThan(BigDecimal value) {
            addCriterion("expectapplyrate >", value, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expectapplyrate >=", value, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateLessThan(BigDecimal value) {
            addCriterion("expectapplyrate <", value, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expectapplyrate <=", value, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateIn(List<BigDecimal> values) {
            addCriterion("expectapplyrate in", values, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateNotIn(List<BigDecimal> values) {
            addCriterion("expectapplyrate not in", values, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expectapplyrate between", value1, value2, "expectapplyrate");
            return (Criteria) this;
        }

        public Criteria andExpectapplyrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expectapplyrate not between", value1, value2, "expectapplyrate");
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

        public Criteria andExpectapplyyearIsNull() {
            addCriterion("expectapplyyear is null");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearIsNotNull() {
            addCriterion("expectapplyyear is not null");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearEqualTo(String value) {
            addCriterion("expectapplyyear =", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearNotEqualTo(String value) {
            addCriterion("expectapplyyear <>", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearGreaterThan(String value) {
            addCriterion("expectapplyyear >", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearGreaterThanOrEqualTo(String value) {
            addCriterion("expectapplyyear >=", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearLessThan(String value) {
            addCriterion("expectapplyyear <", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearLessThanOrEqualTo(String value) {
            addCriterion("expectapplyyear <=", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearLike(String value) {
            addCriterion("expectapplyyear like", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearNotLike(String value) {
            addCriterion("expectapplyyear not like", value, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearIn(List<String> values) {
            addCriterion("expectapplyyear in", values, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearNotIn(List<String> values) {
            addCriterion("expectapplyyear not in", values, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearBetween(String value1, String value2) {
            addCriterion("expectapplyyear between", value1, value2, "expectapplyyear");
            return (Criteria) this;
        }

        public Criteria andExpectapplyyearNotBetween(String value1, String value2) {
            addCriterion("expectapplyyear not between", value1, value2, "expectapplyyear");
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

        public Criteria andMonthamountIsNull() {
            addCriterion("monthamount is null");
            return (Criteria) this;
        }

        public Criteria andMonthamountIsNotNull() {
            addCriterion("monthamount is not null");
            return (Criteria) this;
        }

        public Criteria andMonthamountEqualTo(BigDecimal value) {
            addCriterion("monthamount =", value, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountNotEqualTo(BigDecimal value) {
            addCriterion("monthamount <>", value, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountGreaterThan(BigDecimal value) {
            addCriterion("monthamount >", value, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthamount >=", value, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountLessThan(BigDecimal value) {
            addCriterion("monthamount <", value, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthamount <=", value, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountIn(List<BigDecimal> values) {
            addCriterion("monthamount in", values, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountNotIn(List<BigDecimal> values) {
            addCriterion("monthamount not in", values, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthamount between", value1, value2, "monthamount");
            return (Criteria) this;
        }

        public Criteria andMonthamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthamount not between", value1, value2, "monthamount");
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

        public Criteria andExtotaluseamountIsNull() {
            addCriterion("extotaluseamount is null");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountIsNotNull() {
            addCriterion("extotaluseamount is not null");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountEqualTo(BigDecimal value) {
            addCriterion("extotaluseamount =", value, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountNotEqualTo(BigDecimal value) {
            addCriterion("extotaluseamount <>", value, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountGreaterThan(BigDecimal value) {
            addCriterion("extotaluseamount >", value, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extotaluseamount >=", value, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountLessThan(BigDecimal value) {
            addCriterion("extotaluseamount <", value, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("extotaluseamount <=", value, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountIn(List<BigDecimal> values) {
            addCriterion("extotaluseamount in", values, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountNotIn(List<BigDecimal> values) {
            addCriterion("extotaluseamount not in", values, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extotaluseamount between", value1, value2, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotaluseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extotaluseamount not between", value1, value2, "extotaluseamount");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermIsNull() {
            addCriterion("extotaluseterm is null");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermIsNotNull() {
            addCriterion("extotaluseterm is not null");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermEqualTo(String value) {
            addCriterion("extotaluseterm =", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermNotEqualTo(String value) {
            addCriterion("extotaluseterm <>", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermGreaterThan(String value) {
            addCriterion("extotaluseterm >", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermGreaterThanOrEqualTo(String value) {
            addCriterion("extotaluseterm >=", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermLessThan(String value) {
            addCriterion("extotaluseterm <", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermLessThanOrEqualTo(String value) {
            addCriterion("extotaluseterm <=", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermLike(String value) {
            addCriterion("extotaluseterm like", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermNotLike(String value) {
            addCriterion("extotaluseterm not like", value, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermIn(List<String> values) {
            addCriterion("extotaluseterm in", values, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermNotIn(List<String> values) {
            addCriterion("extotaluseterm not in", values, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermBetween(String value1, String value2) {
            addCriterion("extotaluseterm between", value1, value2, "extotaluseterm");
            return (Criteria) this;
        }

        public Criteria andExtotalusetermNotBetween(String value1, String value2) {
            addCriterion("extotaluseterm not between", value1, value2, "extotaluseterm");
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