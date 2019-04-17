package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DebtinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DebtinfoExample() {
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

        public Criteria andCerdidIsNull() {
            addCriterion("cerdid is null");
            return (Criteria) this;
        }

        public Criteria andCerdidIsNotNull() {
            addCriterion("cerdid is not null");
            return (Criteria) this;
        }

        public Criteria andCerdidEqualTo(String value) {
            addCriterion("cerdid =", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotEqualTo(String value) {
            addCriterion("cerdid <>", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidGreaterThan(String value) {
            addCriterion("cerdid >", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidGreaterThanOrEqualTo(String value) {
            addCriterion("cerdid >=", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidLessThan(String value) {
            addCriterion("cerdid <", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidLessThanOrEqualTo(String value) {
            addCriterion("cerdid <=", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidLike(String value) {
            addCriterion("cerdid like", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotLike(String value) {
            addCriterion("cerdid not like", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidIn(List<String> values) {
            addCriterion("cerdid in", values, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotIn(List<String> values) {
            addCriterion("cerdid not in", values, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidBetween(String value1, String value2) {
            addCriterion("cerdid between", value1, value2, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotBetween(String value1, String value2) {
            addCriterion("cerdid not between", value1, value2, "cerdid");
            return (Criteria) this;
        }

        public Criteria andDebttypeIsNull() {
            addCriterion("debttype is null");
            return (Criteria) this;
        }

        public Criteria andDebttypeIsNotNull() {
            addCriterion("debttype is not null");
            return (Criteria) this;
        }

        public Criteria andDebttypeEqualTo(String value) {
            addCriterion("debttype =", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeNotEqualTo(String value) {
            addCriterion("debttype <>", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeGreaterThan(String value) {
            addCriterion("debttype >", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeGreaterThanOrEqualTo(String value) {
            addCriterion("debttype >=", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeLessThan(String value) {
            addCriterion("debttype <", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeLessThanOrEqualTo(String value) {
            addCriterion("debttype <=", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeLike(String value) {
            addCriterion("debttype like", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeNotLike(String value) {
            addCriterion("debttype not like", value, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeIn(List<String> values) {
            addCriterion("debttype in", values, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeNotIn(List<String> values) {
            addCriterion("debttype not in", values, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeBetween(String value1, String value2) {
            addCriterion("debttype between", value1, value2, "debttype");
            return (Criteria) this;
        }

        public Criteria andDebttypeNotBetween(String value1, String value2) {
            addCriterion("debttype not between", value1, value2, "debttype");
            return (Criteria) this;
        }

        public Criteria andBorrowmanIsNull() {
            addCriterion("borrowman is null");
            return (Criteria) this;
        }

        public Criteria andBorrowmanIsNotNull() {
            addCriterion("borrowman is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowmanEqualTo(String value) {
            addCriterion("borrowman =", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanNotEqualTo(String value) {
            addCriterion("borrowman <>", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanGreaterThan(String value) {
            addCriterion("borrowman >", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanGreaterThanOrEqualTo(String value) {
            addCriterion("borrowman >=", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanLessThan(String value) {
            addCriterion("borrowman <", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanLessThanOrEqualTo(String value) {
            addCriterion("borrowman <=", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanLike(String value) {
            addCriterion("borrowman like", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanNotLike(String value) {
            addCriterion("borrowman not like", value, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanIn(List<String> values) {
            addCriterion("borrowman in", values, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanNotIn(List<String> values) {
            addCriterion("borrowman not in", values, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanBetween(String value1, String value2) {
            addCriterion("borrowman between", value1, value2, "borrowman");
            return (Criteria) this;
        }

        public Criteria andBorrowmanNotBetween(String value1, String value2) {
            addCriterion("borrowman not between", value1, value2, "borrowman");
            return (Criteria) this;
        }

        public Criteria andFananceorgIsNull() {
            addCriterion("fananceorg is null");
            return (Criteria) this;
        }

        public Criteria andFananceorgIsNotNull() {
            addCriterion("fananceorg is not null");
            return (Criteria) this;
        }

        public Criteria andFananceorgEqualTo(String value) {
            addCriterion("fananceorg =", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgNotEqualTo(String value) {
            addCriterion("fananceorg <>", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgGreaterThan(String value) {
            addCriterion("fananceorg >", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgGreaterThanOrEqualTo(String value) {
            addCriterion("fananceorg >=", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgLessThan(String value) {
            addCriterion("fananceorg <", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgLessThanOrEqualTo(String value) {
            addCriterion("fananceorg <=", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgLike(String value) {
            addCriterion("fananceorg like", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgNotLike(String value) {
            addCriterion("fananceorg not like", value, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgIn(List<String> values) {
            addCriterion("fananceorg in", values, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgNotIn(List<String> values) {
            addCriterion("fananceorg not in", values, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgBetween(String value1, String value2) {
            addCriterion("fananceorg between", value1, value2, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andFananceorgNotBetween(String value1, String value2) {
            addCriterion("fananceorg not between", value1, value2, "fananceorg");
            return (Criteria) this;
        }

        public Criteria andTotalloanIsNull() {
            addCriterion("totalloan is null");
            return (Criteria) this;
        }

        public Criteria andTotalloanIsNotNull() {
            addCriterion("totalloan is not null");
            return (Criteria) this;
        }

        public Criteria andTotalloanEqualTo(BigDecimal value) {
            addCriterion("totalloan =", value, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanNotEqualTo(BigDecimal value) {
            addCriterion("totalloan <>", value, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanGreaterThan(BigDecimal value) {
            addCriterion("totalloan >", value, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalloan >=", value, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanLessThan(BigDecimal value) {
            addCriterion("totalloan <", value, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalloan <=", value, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanIn(List<BigDecimal> values) {
            addCriterion("totalloan in", values, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanNotIn(List<BigDecimal> values) {
            addCriterion("totalloan not in", values, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalloan between", value1, value2, "totalloan");
            return (Criteria) this;
        }

        public Criteria andTotalloanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalloan not between", value1, value2, "totalloan");
            return (Criteria) this;
        }

        public Criteria andBorrowremainIsNull() {
            addCriterion("borrowremain is null");
            return (Criteria) this;
        }

        public Criteria andBorrowremainIsNotNull() {
            addCriterion("borrowremain is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowremainEqualTo(BigDecimal value) {
            addCriterion("borrowremain =", value, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainNotEqualTo(BigDecimal value) {
            addCriterion("borrowremain <>", value, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainGreaterThan(BigDecimal value) {
            addCriterion("borrowremain >", value, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowremain >=", value, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainLessThan(BigDecimal value) {
            addCriterion("borrowremain <", value, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowremain <=", value, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainIn(List<BigDecimal> values) {
            addCriterion("borrowremain in", values, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainNotIn(List<BigDecimal> values) {
            addCriterion("borrowremain not in", values, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowremain between", value1, value2, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andBorrowremainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowremain not between", value1, value2, "borrowremain");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andPledgenoIsNull() {
            addCriterion("pledgeno is null");
            return (Criteria) this;
        }

        public Criteria andPledgenoIsNotNull() {
            addCriterion("pledgeno is not null");
            return (Criteria) this;
        }

        public Criteria andPledgenoEqualTo(String value) {
            addCriterion("pledgeno =", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoNotEqualTo(String value) {
            addCriterion("pledgeno <>", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoGreaterThan(String value) {
            addCriterion("pledgeno >", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoGreaterThanOrEqualTo(String value) {
            addCriterion("pledgeno >=", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoLessThan(String value) {
            addCriterion("pledgeno <", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoLessThanOrEqualTo(String value) {
            addCriterion("pledgeno <=", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoLike(String value) {
            addCriterion("pledgeno like", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoNotLike(String value) {
            addCriterion("pledgeno not like", value, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoIn(List<String> values) {
            addCriterion("pledgeno in", values, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoNotIn(List<String> values) {
            addCriterion("pledgeno not in", values, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoBetween(String value1, String value2) {
            addCriterion("pledgeno between", value1, value2, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgenoNotBetween(String value1, String value2) {
            addCriterion("pledgeno not between", value1, value2, "pledgeno");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressIsNull() {
            addCriterion("pledgeaddress is null");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressIsNotNull() {
            addCriterion("pledgeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressEqualTo(String value) {
            addCriterion("pledgeaddress =", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressNotEqualTo(String value) {
            addCriterion("pledgeaddress <>", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressGreaterThan(String value) {
            addCriterion("pledgeaddress >", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pledgeaddress >=", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressLessThan(String value) {
            addCriterion("pledgeaddress <", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressLessThanOrEqualTo(String value) {
            addCriterion("pledgeaddress <=", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressLike(String value) {
            addCriterion("pledgeaddress like", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressNotLike(String value) {
            addCriterion("pledgeaddress not like", value, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressIn(List<String> values) {
            addCriterion("pledgeaddress in", values, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressNotIn(List<String> values) {
            addCriterion("pledgeaddress not in", values, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressBetween(String value1, String value2) {
            addCriterion("pledgeaddress between", value1, value2, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andPledgeaddressNotBetween(String value1, String value2) {
            addCriterion("pledgeaddress not between", value1, value2, "pledgeaddress");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionIsNull() {
            addCriterion("usefulposition is null");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionIsNotNull() {
            addCriterion("usefulposition is not null");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionEqualTo(BigDecimal value) {
            addCriterion("usefulposition =", value, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionNotEqualTo(BigDecimal value) {
            addCriterion("usefulposition <>", value, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionGreaterThan(BigDecimal value) {
            addCriterion("usefulposition >", value, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usefulposition >=", value, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionLessThan(BigDecimal value) {
            addCriterion("usefulposition <", value, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usefulposition <=", value, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionIn(List<BigDecimal> values) {
            addCriterion("usefulposition in", values, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionNotIn(List<BigDecimal> values) {
            addCriterion("usefulposition not in", values, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usefulposition between", value1, value2, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsefulpositionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usefulposition not between", value1, value2, "usefulposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionIsNull() {
            addCriterion("usedposition is null");
            return (Criteria) this;
        }

        public Criteria andUsedpositionIsNotNull() {
            addCriterion("usedposition is not null");
            return (Criteria) this;
        }

        public Criteria andUsedpositionEqualTo(BigDecimal value) {
            addCriterion("usedposition =", value, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionNotEqualTo(BigDecimal value) {
            addCriterion("usedposition <>", value, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionGreaterThan(BigDecimal value) {
            addCriterion("usedposition >", value, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usedposition >=", value, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionLessThan(BigDecimal value) {
            addCriterion("usedposition <", value, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usedposition <=", value, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionIn(List<BigDecimal> values) {
            addCriterion("usedposition in", values, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionNotIn(List<BigDecimal> values) {
            addCriterion("usedposition not in", values, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedposition between", value1, value2, "usedposition");
            return (Criteria) this;
        }

        public Criteria andUsedpositionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usedposition not between", value1, value2, "usedposition");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkIsNull() {
            addCriterion("debtinforemark is null");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkIsNotNull() {
            addCriterion("debtinforemark is not null");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkEqualTo(String value) {
            addCriterion("debtinforemark =", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkNotEqualTo(String value) {
            addCriterion("debtinforemark <>", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkGreaterThan(String value) {
            addCriterion("debtinforemark >", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkGreaterThanOrEqualTo(String value) {
            addCriterion("debtinforemark >=", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkLessThan(String value) {
            addCriterion("debtinforemark <", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkLessThanOrEqualTo(String value) {
            addCriterion("debtinforemark <=", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkLike(String value) {
            addCriterion("debtinforemark like", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkNotLike(String value) {
            addCriterion("debtinforemark not like", value, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkIn(List<String> values) {
            addCriterion("debtinforemark in", values, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkNotIn(List<String> values) {
            addCriterion("debtinforemark not in", values, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkBetween(String value1, String value2) {
            addCriterion("debtinforemark between", value1, value2, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andDebtinforemarkNotBetween(String value1, String value2) {
            addCriterion("debtinforemark not between", value1, value2, "debtinforemark");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgIsNull() {
            addCriterion("havaloanflg is null");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgIsNotNull() {
            addCriterion("havaloanflg is not null");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgEqualTo(String value) {
            addCriterion("havaloanflg =", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgNotEqualTo(String value) {
            addCriterion("havaloanflg <>", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgGreaterThan(String value) {
            addCriterion("havaloanflg >", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgGreaterThanOrEqualTo(String value) {
            addCriterion("havaloanflg >=", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgLessThan(String value) {
            addCriterion("havaloanflg <", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgLessThanOrEqualTo(String value) {
            addCriterion("havaloanflg <=", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgLike(String value) {
            addCriterion("havaloanflg like", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgNotLike(String value) {
            addCriterion("havaloanflg not like", value, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgIn(List<String> values) {
            addCriterion("havaloanflg in", values, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgNotIn(List<String> values) {
            addCriterion("havaloanflg not in", values, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgBetween(String value1, String value2) {
            addCriterion("havaloanflg between", value1, value2, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andHavaloanflgNotBetween(String value1, String value2) {
            addCriterion("havaloanflg not between", value1, value2, "havaloanflg");
            return (Criteria) this;
        }

        public Criteria andConversionIsNull() {
            addCriterion("conversion is null");
            return (Criteria) this;
        }

        public Criteria andConversionIsNotNull() {
            addCriterion("conversion is not null");
            return (Criteria) this;
        }

        public Criteria andConversionEqualTo(BigDecimal value) {
            addCriterion("conversion =", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionNotEqualTo(BigDecimal value) {
            addCriterion("conversion <>", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionGreaterThan(BigDecimal value) {
            addCriterion("conversion >", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("conversion >=", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionLessThan(BigDecimal value) {
            addCriterion("conversion <", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("conversion <=", value, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionIn(List<BigDecimal> values) {
            addCriterion("conversion in", values, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionNotIn(List<BigDecimal> values) {
            addCriterion("conversion not in", values, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conversion between", value1, value2, "conversion");
            return (Criteria) this;
        }

        public Criteria andConversionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("conversion not between", value1, value2, "conversion");
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

        public Criteria andAddressprovIsNull() {
            addCriterion("addressprov is null");
            return (Criteria) this;
        }

        public Criteria andAddressprovIsNotNull() {
            addCriterion("addressprov is not null");
            return (Criteria) this;
        }

        public Criteria andAddressprovEqualTo(String value) {
            addCriterion("addressprov =", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotEqualTo(String value) {
            addCriterion("addressprov <>", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovGreaterThan(String value) {
            addCriterion("addressprov >", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovGreaterThanOrEqualTo(String value) {
            addCriterion("addressprov >=", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovLessThan(String value) {
            addCriterion("addressprov <", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovLessThanOrEqualTo(String value) {
            addCriterion("addressprov <=", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovLike(String value) {
            addCriterion("addressprov like", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotLike(String value) {
            addCriterion("addressprov not like", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovIn(List<String> values) {
            addCriterion("addressprov in", values, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotIn(List<String> values) {
            addCriterion("addressprov not in", values, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovBetween(String value1, String value2) {
            addCriterion("addressprov between", value1, value2, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotBetween(String value1, String value2) {
            addCriterion("addressprov not between", value1, value2, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddresscityIsNull() {
            addCriterion("addresscity is null");
            return (Criteria) this;
        }

        public Criteria andAddresscityIsNotNull() {
            addCriterion("addresscity is not null");
            return (Criteria) this;
        }

        public Criteria andAddresscityEqualTo(String value) {
            addCriterion("addresscity =", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotEqualTo(String value) {
            addCriterion("addresscity <>", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityGreaterThan(String value) {
            addCriterion("addresscity >", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("addresscity >=", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLessThan(String value) {
            addCriterion("addresscity <", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLessThanOrEqualTo(String value) {
            addCriterion("addresscity <=", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLike(String value) {
            addCriterion("addresscity like", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotLike(String value) {
            addCriterion("addresscity not like", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityIn(List<String> values) {
            addCriterion("addresscity in", values, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotIn(List<String> values) {
            addCriterion("addresscity not in", values, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityBetween(String value1, String value2) {
            addCriterion("addresscity between", value1, value2, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotBetween(String value1, String value2) {
            addCriterion("addresscity not between", value1, value2, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddressareaIsNull() {
            addCriterion("addressarea is null");
            return (Criteria) this;
        }

        public Criteria andAddressareaIsNotNull() {
            addCriterion("addressarea is not null");
            return (Criteria) this;
        }

        public Criteria andAddressareaEqualTo(String value) {
            addCriterion("addressarea =", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotEqualTo(String value) {
            addCriterion("addressarea <>", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaGreaterThan(String value) {
            addCriterion("addressarea >", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaGreaterThanOrEqualTo(String value) {
            addCriterion("addressarea >=", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaLessThan(String value) {
            addCriterion("addressarea <", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaLessThanOrEqualTo(String value) {
            addCriterion("addressarea <=", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaLike(String value) {
            addCriterion("addressarea like", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotLike(String value) {
            addCriterion("addressarea not like", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaIn(List<String> values) {
            addCriterion("addressarea in", values, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotIn(List<String> values) {
            addCriterion("addressarea not in", values, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaBetween(String value1, String value2) {
            addCriterion("addressarea between", value1, value2, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotBetween(String value1, String value2) {
            addCriterion("addressarea not between", value1, value2, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgIsNull() {
            addCriterion("historicalhavaloanflg is null");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgIsNotNull() {
            addCriterion("historicalhavaloanflg is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgEqualTo(String value) {
            addCriterion("historicalhavaloanflg =", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgNotEqualTo(String value) {
            addCriterion("historicalhavaloanflg <>", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgGreaterThan(String value) {
            addCriterion("historicalhavaloanflg >", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgGreaterThanOrEqualTo(String value) {
            addCriterion("historicalhavaloanflg >=", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgLessThan(String value) {
            addCriterion("historicalhavaloanflg <", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgLessThanOrEqualTo(String value) {
            addCriterion("historicalhavaloanflg <=", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgLike(String value) {
            addCriterion("historicalhavaloanflg like", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgNotLike(String value) {
            addCriterion("historicalhavaloanflg not like", value, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgIn(List<String> values) {
            addCriterion("historicalhavaloanflg in", values, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgNotIn(List<String> values) {
            addCriterion("historicalhavaloanflg not in", values, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgBetween(String value1, String value2) {
            addCriterion("historicalhavaloanflg between", value1, value2, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andHistoricalhavaloanflgNotBetween(String value1, String value2) {
            addCriterion("historicalhavaloanflg not between", value1, value2, "historicalhavaloanflg");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateIsNull() {
            addCriterion("noofcertificate is null");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateIsNotNull() {
            addCriterion("noofcertificate is not null");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateEqualTo(String value) {
            addCriterion("noofcertificate =", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateNotEqualTo(String value) {
            addCriterion("noofcertificate <>", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateGreaterThan(String value) {
            addCriterion("noofcertificate >", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateGreaterThanOrEqualTo(String value) {
            addCriterion("noofcertificate >=", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateLessThan(String value) {
            addCriterion("noofcertificate <", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateLessThanOrEqualTo(String value) {
            addCriterion("noofcertificate <=", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateLike(String value) {
            addCriterion("noofcertificate like", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateNotLike(String value) {
            addCriterion("noofcertificate not like", value, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateIn(List<String> values) {
            addCriterion("noofcertificate in", values, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateNotIn(List<String> values) {
            addCriterion("noofcertificate not in", values, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateBetween(String value1, String value2) {
            addCriterion("noofcertificate between", value1, value2, "noofcertificate");
            return (Criteria) this;
        }

        public Criteria andNoofcertificateNotBetween(String value1, String value2) {
            addCriterion("noofcertificate not between", value1, value2, "noofcertificate");
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