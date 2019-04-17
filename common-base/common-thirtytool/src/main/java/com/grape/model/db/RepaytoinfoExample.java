package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepaytoinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaytoinfoExample() {
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

        public Criteria andBatchorgIsNull() {
            addCriterion("batchorg is null");
            return (Criteria) this;
        }

        public Criteria andBatchorgIsNotNull() {
            addCriterion("batchorg is not null");
            return (Criteria) this;
        }

        public Criteria andBatchorgEqualTo(String value) {
            addCriterion("batchorg =", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgNotEqualTo(String value) {
            addCriterion("batchorg <>", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgGreaterThan(String value) {
            addCriterion("batchorg >", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgGreaterThanOrEqualTo(String value) {
            addCriterion("batchorg >=", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgLessThan(String value) {
            addCriterion("batchorg <", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgLessThanOrEqualTo(String value) {
            addCriterion("batchorg <=", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgLike(String value) {
            addCriterion("batchorg like", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgNotLike(String value) {
            addCriterion("batchorg not like", value, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgIn(List<String> values) {
            addCriterion("batchorg in", values, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgNotIn(List<String> values) {
            addCriterion("batchorg not in", values, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgBetween(String value1, String value2) {
            addCriterion("batchorg between", value1, value2, "batchorg");
            return (Criteria) this;
        }

        public Criteria andBatchorgNotBetween(String value1, String value2) {
            addCriterion("batchorg not between", value1, value2, "batchorg");
            return (Criteria) this;
        }

        public Criteria andSumofamountIsNull() {
            addCriterion("sumofamount is null");
            return (Criteria) this;
        }

        public Criteria andSumofamountIsNotNull() {
            addCriterion("sumofamount is not null");
            return (Criteria) this;
        }

        public Criteria andSumofamountEqualTo(BigDecimal value) {
            addCriterion("sumofamount =", value, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountNotEqualTo(BigDecimal value) {
            addCriterion("sumofamount <>", value, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountGreaterThan(BigDecimal value) {
            addCriterion("sumofamount >", value, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sumofamount >=", value, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountLessThan(BigDecimal value) {
            addCriterion("sumofamount <", value, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sumofamount <=", value, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountIn(List<BigDecimal> values) {
            addCriterion("sumofamount in", values, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountNotIn(List<BigDecimal> values) {
            addCriterion("sumofamount not in", values, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sumofamount between", value1, value2, "sumofamount");
            return (Criteria) this;
        }

        public Criteria andSumofamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sumofamount not between", value1, value2, "sumofamount");
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

        public Criteria andLoanlimittimeIsNull() {
            addCriterion("loanlimittime is null");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeIsNotNull() {
            addCriterion("loanlimittime is not null");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeEqualTo(String value) {
            addCriterion("loanlimittime =", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeNotEqualTo(String value) {
            addCriterion("loanlimittime <>", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeGreaterThan(String value) {
            addCriterion("loanlimittime >", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeGreaterThanOrEqualTo(String value) {
            addCriterion("loanlimittime >=", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeLessThan(String value) {
            addCriterion("loanlimittime <", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeLessThanOrEqualTo(String value) {
            addCriterion("loanlimittime <=", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeLike(String value) {
            addCriterion("loanlimittime like", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeNotLike(String value) {
            addCriterion("loanlimittime not like", value, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeIn(List<String> values) {
            addCriterion("loanlimittime in", values, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeNotIn(List<String> values) {
            addCriterion("loanlimittime not in", values, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeBetween(String value1, String value2) {
            addCriterion("loanlimittime between", value1, value2, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andLoanlimittimeNotBetween(String value1, String value2) {
            addCriterion("loanlimittime not between", value1, value2, "loanlimittime");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountIsNull() {
            addCriterion("isagreeexceptamount is null");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountIsNotNull() {
            addCriterion("isagreeexceptamount is not null");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountEqualTo(String value) {
            addCriterion("isagreeexceptamount =", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountNotEqualTo(String value) {
            addCriterion("isagreeexceptamount <>", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountGreaterThan(String value) {
            addCriterion("isagreeexceptamount >", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountGreaterThanOrEqualTo(String value) {
            addCriterion("isagreeexceptamount >=", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountLessThan(String value) {
            addCriterion("isagreeexceptamount <", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountLessThanOrEqualTo(String value) {
            addCriterion("isagreeexceptamount <=", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountLike(String value) {
            addCriterion("isagreeexceptamount like", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountNotLike(String value) {
            addCriterion("isagreeexceptamount not like", value, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountIn(List<String> values) {
            addCriterion("isagreeexceptamount in", values, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountNotIn(List<String> values) {
            addCriterion("isagreeexceptamount not in", values, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountBetween(String value1, String value2) {
            addCriterion("isagreeexceptamount between", value1, value2, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andIsagreeexceptamountNotBetween(String value1, String value2) {
            addCriterion("isagreeexceptamount not between", value1, value2, "isagreeexceptamount");
            return (Criteria) this;
        }

        public Criteria andTotalusetermIsNull() {
            addCriterion("totaluseterm is null");
            return (Criteria) this;
        }

        public Criteria andTotalusetermIsNotNull() {
            addCriterion("totaluseterm is not null");
            return (Criteria) this;
        }

        public Criteria andTotalusetermEqualTo(String value) {
            addCriterion("totaluseterm =", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermNotEqualTo(String value) {
            addCriterion("totaluseterm <>", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermGreaterThan(String value) {
            addCriterion("totaluseterm >", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermGreaterThanOrEqualTo(String value) {
            addCriterion("totaluseterm >=", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermLessThan(String value) {
            addCriterion("totaluseterm <", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermLessThanOrEqualTo(String value) {
            addCriterion("totaluseterm <=", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermLike(String value) {
            addCriterion("totaluseterm like", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermNotLike(String value) {
            addCriterion("totaluseterm not like", value, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermIn(List<String> values) {
            addCriterion("totaluseterm in", values, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermNotIn(List<String> values) {
            addCriterion("totaluseterm not in", values, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermBetween(String value1, String value2) {
            addCriterion("totaluseterm between", value1, value2, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotalusetermNotBetween(String value1, String value2) {
            addCriterion("totaluseterm not between", value1, value2, "totaluseterm");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountIsNull() {
            addCriterion("totaluseamount is null");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountIsNotNull() {
            addCriterion("totaluseamount is not null");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountEqualTo(BigDecimal value) {
            addCriterion("totaluseamount =", value, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountNotEqualTo(BigDecimal value) {
            addCriterion("totaluseamount <>", value, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountGreaterThan(BigDecimal value) {
            addCriterion("totaluseamount >", value, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totaluseamount >=", value, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountLessThan(BigDecimal value) {
            addCriterion("totaluseamount <", value, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totaluseamount <=", value, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountIn(List<BigDecimal> values) {
            addCriterion("totaluseamount in", values, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountNotIn(List<BigDecimal> values) {
            addCriterion("totaluseamount not in", values, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totaluseamount between", value1, value2, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andTotaluseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totaluseamount not between", value1, value2, "totaluseamount");
            return (Criteria) this;
        }

        public Criteria andUseofloanIsNull() {
            addCriterion("useofloan is null");
            return (Criteria) this;
        }

        public Criteria andUseofloanIsNotNull() {
            addCriterion("useofloan is not null");
            return (Criteria) this;
        }

        public Criteria andUseofloanEqualTo(String value) {
            addCriterion("useofloan =", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanNotEqualTo(String value) {
            addCriterion("useofloan <>", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanGreaterThan(String value) {
            addCriterion("useofloan >", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanGreaterThanOrEqualTo(String value) {
            addCriterion("useofloan >=", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanLessThan(String value) {
            addCriterion("useofloan <", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanLessThanOrEqualTo(String value) {
            addCriterion("useofloan <=", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanLike(String value) {
            addCriterion("useofloan like", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanNotLike(String value) {
            addCriterion("useofloan not like", value, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanIn(List<String> values) {
            addCriterion("useofloan in", values, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanNotIn(List<String> values) {
            addCriterion("useofloan not in", values, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanBetween(String value1, String value2) {
            addCriterion("useofloan between", value1, value2, "useofloan");
            return (Criteria) this;
        }

        public Criteria andUseofloanNotBetween(String value1, String value2) {
            addCriterion("useofloan not between", value1, value2, "useofloan");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgIsNull() {
            addCriterion("isfinilyflg is null");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgIsNotNull() {
            addCriterion("isfinilyflg is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgEqualTo(String value) {
            addCriterion("isfinilyflg =", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgNotEqualTo(String value) {
            addCriterion("isfinilyflg <>", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgGreaterThan(String value) {
            addCriterion("isfinilyflg >", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgGreaterThanOrEqualTo(String value) {
            addCriterion("isfinilyflg >=", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgLessThan(String value) {
            addCriterion("isfinilyflg <", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgLessThanOrEqualTo(String value) {
            addCriterion("isfinilyflg <=", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgLike(String value) {
            addCriterion("isfinilyflg like", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgNotLike(String value) {
            addCriterion("isfinilyflg not like", value, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgIn(List<String> values) {
            addCriterion("isfinilyflg in", values, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgNotIn(List<String> values) {
            addCriterion("isfinilyflg not in", values, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgBetween(String value1, String value2) {
            addCriterion("isfinilyflg between", value1, value2, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andIsfinilyflgNotBetween(String value1, String value2) {
            addCriterion("isfinilyflg not between", value1, value2, "isfinilyflg");
            return (Criteria) this;
        }

        public Criteria andSelectorgIsNull() {
            addCriterion("selectorg is null");
            return (Criteria) this;
        }

        public Criteria andSelectorgIsNotNull() {
            addCriterion("selectorg is not null");
            return (Criteria) this;
        }

        public Criteria andSelectorgEqualTo(String value) {
            addCriterion("selectorg =", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgNotEqualTo(String value) {
            addCriterion("selectorg <>", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgGreaterThan(String value) {
            addCriterion("selectorg >", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgGreaterThanOrEqualTo(String value) {
            addCriterion("selectorg >=", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgLessThan(String value) {
            addCriterion("selectorg <", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgLessThanOrEqualTo(String value) {
            addCriterion("selectorg <=", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgLike(String value) {
            addCriterion("selectorg like", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgNotLike(String value) {
            addCriterion("selectorg not like", value, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgIn(List<String> values) {
            addCriterion("selectorg in", values, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgNotIn(List<String> values) {
            addCriterion("selectorg not in", values, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgBetween(String value1, String value2) {
            addCriterion("selectorg between", value1, value2, "selectorg");
            return (Criteria) this;
        }

        public Criteria andSelectorgNotBetween(String value1, String value2) {
            addCriterion("selectorg not between", value1, value2, "selectorg");
            return (Criteria) this;
        }

        public Criteria andChooseassureIsNull() {
            addCriterion("chooseassure is null");
            return (Criteria) this;
        }

        public Criteria andChooseassureIsNotNull() {
            addCriterion("chooseassure is not null");
            return (Criteria) this;
        }

        public Criteria andChooseassureEqualTo(String value) {
            addCriterion("chooseassure =", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureNotEqualTo(String value) {
            addCriterion("chooseassure <>", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureGreaterThan(String value) {
            addCriterion("chooseassure >", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureGreaterThanOrEqualTo(String value) {
            addCriterion("chooseassure >=", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureLessThan(String value) {
            addCriterion("chooseassure <", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureLessThanOrEqualTo(String value) {
            addCriterion("chooseassure <=", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureLike(String value) {
            addCriterion("chooseassure like", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureNotLike(String value) {
            addCriterion("chooseassure not like", value, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureIn(List<String> values) {
            addCriterion("chooseassure in", values, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureNotIn(List<String> values) {
            addCriterion("chooseassure not in", values, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureBetween(String value1, String value2) {
            addCriterion("chooseassure between", value1, value2, "chooseassure");
            return (Criteria) this;
        }

        public Criteria andChooseassureNotBetween(String value1, String value2) {
            addCriterion("chooseassure not between", value1, value2, "chooseassure");
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