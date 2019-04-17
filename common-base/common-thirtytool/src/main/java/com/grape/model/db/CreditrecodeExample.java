package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditrecodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditrecodeExample() {
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

        public Criteria andCreditreportdateIsNull() {
            addCriterion("creditreportdate is null");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateIsNotNull() {
            addCriterion("creditreportdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateEqualTo(Date value) {
            addCriterion("creditreportdate =", value, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateNotEqualTo(Date value) {
            addCriterion("creditreportdate <>", value, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateGreaterThan(Date value) {
            addCriterion("creditreportdate >", value, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateGreaterThanOrEqualTo(Date value) {
            addCriterion("creditreportdate >=", value, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateLessThan(Date value) {
            addCriterion("creditreportdate <", value, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateLessThanOrEqualTo(Date value) {
            addCriterion("creditreportdate <=", value, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateIn(List<Date> values) {
            addCriterion("creditreportdate in", values, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateNotIn(List<Date> values) {
            addCriterion("creditreportdate not in", values, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateBetween(Date value1, Date value2) {
            addCriterion("creditreportdate between", value1, value2, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andCreditreportdateNotBetween(Date value1, Date value2) {
            addCriterion("creditreportdate not between", value1, value2, "creditreportdate");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditIsNull() {
            addCriterion("isblackofloancredit is null");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditIsNotNull() {
            addCriterion("isblackofloancredit is not null");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditEqualTo(String value) {
            addCriterion("isblackofloancredit =", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditNotEqualTo(String value) {
            addCriterion("isblackofloancredit <>", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditGreaterThan(String value) {
            addCriterion("isblackofloancredit >", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditGreaterThanOrEqualTo(String value) {
            addCriterion("isblackofloancredit >=", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditLessThan(String value) {
            addCriterion("isblackofloancredit <", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditLessThanOrEqualTo(String value) {
            addCriterion("isblackofloancredit <=", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditLike(String value) {
            addCriterion("isblackofloancredit like", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditNotLike(String value) {
            addCriterion("isblackofloancredit not like", value, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditIn(List<String> values) {
            addCriterion("isblackofloancredit in", values, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditNotIn(List<String> values) {
            addCriterion("isblackofloancredit not in", values, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditBetween(String value1, String value2) {
            addCriterion("isblackofloancredit between", value1, value2, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancreditNotBetween(String value1, String value2) {
            addCriterion("isblackofloancredit not between", value1, value2, "isblackofloancredit");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2IsNull() {
            addCriterion("isblackofcreditcard2 is null");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2IsNotNull() {
            addCriterion("isblackofcreditcard2 is not null");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2EqualTo(String value) {
            addCriterion("isblackofcreditcard2 =", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2NotEqualTo(String value) {
            addCriterion("isblackofcreditcard2 <>", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2GreaterThan(String value) {
            addCriterion("isblackofcreditcard2 >", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2GreaterThanOrEqualTo(String value) {
            addCriterion("isblackofcreditcard2 >=", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2LessThan(String value) {
            addCriterion("isblackofcreditcard2 <", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2LessThanOrEqualTo(String value) {
            addCriterion("isblackofcreditcard2 <=", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2Like(String value) {
            addCriterion("isblackofcreditcard2 like", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2NotLike(String value) {
            addCriterion("isblackofcreditcard2 not like", value, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2In(List<String> values) {
            addCriterion("isblackofcreditcard2 in", values, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2NotIn(List<String> values) {
            addCriterion("isblackofcreditcard2 not in", values, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2Between(String value1, String value2) {
            addCriterion("isblackofcreditcard2 between", value1, value2, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcard2NotBetween(String value1, String value2) {
            addCriterion("isblackofcreditcard2 not between", value1, value2, "isblackofcreditcard2");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardIsNull() {
            addCriterion("isblackofcreditcard is null");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardIsNotNull() {
            addCriterion("isblackofcreditcard is not null");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardEqualTo(String value) {
            addCriterion("isblackofcreditcard =", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardNotEqualTo(String value) {
            addCriterion("isblackofcreditcard <>", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardGreaterThan(String value) {
            addCriterion("isblackofcreditcard >", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardGreaterThanOrEqualTo(String value) {
            addCriterion("isblackofcreditcard >=", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardLessThan(String value) {
            addCriterion("isblackofcreditcard <", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardLessThanOrEqualTo(String value) {
            addCriterion("isblackofcreditcard <=", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardLike(String value) {
            addCriterion("isblackofcreditcard like", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardNotLike(String value) {
            addCriterion("isblackofcreditcard not like", value, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardIn(List<String> values) {
            addCriterion("isblackofcreditcard in", values, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardNotIn(List<String> values) {
            addCriterion("isblackofcreditcard not in", values, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardBetween(String value1, String value2) {
            addCriterion("isblackofcreditcard between", value1, value2, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofcreditcardNotBetween(String value1, String value2) {
            addCriterion("isblackofcreditcard not between", value1, value2, "isblackofcreditcard");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2IsNull() {
            addCriterion("isblackofloancredit2 is null");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2IsNotNull() {
            addCriterion("isblackofloancredit2 is not null");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2EqualTo(String value) {
            addCriterion("isblackofloancredit2 =", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2NotEqualTo(String value) {
            addCriterion("isblackofloancredit2 <>", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2GreaterThan(String value) {
            addCriterion("isblackofloancredit2 >", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2GreaterThanOrEqualTo(String value) {
            addCriterion("isblackofloancredit2 >=", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2LessThan(String value) {
            addCriterion("isblackofloancredit2 <", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2LessThanOrEqualTo(String value) {
            addCriterion("isblackofloancredit2 <=", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2Like(String value) {
            addCriterion("isblackofloancredit2 like", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2NotLike(String value) {
            addCriterion("isblackofloancredit2 not like", value, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2In(List<String> values) {
            addCriterion("isblackofloancredit2 in", values, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2NotIn(List<String> values) {
            addCriterion("isblackofloancredit2 not in", values, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2Between(String value1, String value2) {
            addCriterion("isblackofloancredit2 between", value1, value2, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIsblackofloancredit2NotBetween(String value1, String value2) {
            addCriterion("isblackofloancredit2 not between", value1, value2, "isblackofloancredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2IsNull() {
            addCriterion("iswarnofcredit2 is null");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2IsNotNull() {
            addCriterion("iswarnofcredit2 is not null");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2EqualTo(String value) {
            addCriterion("iswarnofcredit2 =", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2NotEqualTo(String value) {
            addCriterion("iswarnofcredit2 <>", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2GreaterThan(String value) {
            addCriterion("iswarnofcredit2 >", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2GreaterThanOrEqualTo(String value) {
            addCriterion("iswarnofcredit2 >=", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2LessThan(String value) {
            addCriterion("iswarnofcredit2 <", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2LessThanOrEqualTo(String value) {
            addCriterion("iswarnofcredit2 <=", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2Like(String value) {
            addCriterion("iswarnofcredit2 like", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2NotLike(String value) {
            addCriterion("iswarnofcredit2 not like", value, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2In(List<String> values) {
            addCriterion("iswarnofcredit2 in", values, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2NotIn(List<String> values) {
            addCriterion("iswarnofcredit2 not in", values, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2Between(String value1, String value2) {
            addCriterion("iswarnofcredit2 between", value1, value2, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcredit2NotBetween(String value1, String value2) {
            addCriterion("iswarnofcredit2 not between", value1, value2, "iswarnofcredit2");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditIsNull() {
            addCriterion("iswarnofcredit is null");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditIsNotNull() {
            addCriterion("iswarnofcredit is not null");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditEqualTo(String value) {
            addCriterion("iswarnofcredit =", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditNotEqualTo(String value) {
            addCriterion("iswarnofcredit <>", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditGreaterThan(String value) {
            addCriterion("iswarnofcredit >", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditGreaterThanOrEqualTo(String value) {
            addCriterion("iswarnofcredit >=", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditLessThan(String value) {
            addCriterion("iswarnofcredit <", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditLessThanOrEqualTo(String value) {
            addCriterion("iswarnofcredit <=", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditLike(String value) {
            addCriterion("iswarnofcredit like", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditNotLike(String value) {
            addCriterion("iswarnofcredit not like", value, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditIn(List<String> values) {
            addCriterion("iswarnofcredit in", values, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditNotIn(List<String> values) {
            addCriterion("iswarnofcredit not in", values, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditBetween(String value1, String value2) {
            addCriterion("iswarnofcredit between", value1, value2, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIswarnofcreditNotBetween(String value1, String value2) {
            addCriterion("iswarnofcredit not between", value1, value2, "iswarnofcredit");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2IsNull() {
            addCriterion("isoverdue2 is null");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2IsNotNull() {
            addCriterion("isoverdue2 is not null");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2EqualTo(String value) {
            addCriterion("isoverdue2 =", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2NotEqualTo(String value) {
            addCriterion("isoverdue2 <>", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2GreaterThan(String value) {
            addCriterion("isoverdue2 >", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2GreaterThanOrEqualTo(String value) {
            addCriterion("isoverdue2 >=", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2LessThan(String value) {
            addCriterion("isoverdue2 <", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2LessThanOrEqualTo(String value) {
            addCriterion("isoverdue2 <=", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2Like(String value) {
            addCriterion("isoverdue2 like", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2NotLike(String value) {
            addCriterion("isoverdue2 not like", value, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2In(List<String> values) {
            addCriterion("isoverdue2 in", values, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2NotIn(List<String> values) {
            addCriterion("isoverdue2 not in", values, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2Between(String value1, String value2) {
            addCriterion("isoverdue2 between", value1, value2, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdue2NotBetween(String value1, String value2) {
            addCriterion("isoverdue2 not between", value1, value2, "isoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueIsNull() {
            addCriterion("isoverdue is null");
            return (Criteria) this;
        }

        public Criteria andIsoverdueIsNotNull() {
            addCriterion("isoverdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsoverdueEqualTo(String value) {
            addCriterion("isoverdue =", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueNotEqualTo(String value) {
            addCriterion("isoverdue <>", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueGreaterThan(String value) {
            addCriterion("isoverdue >", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueGreaterThanOrEqualTo(String value) {
            addCriterion("isoverdue >=", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueLessThan(String value) {
            addCriterion("isoverdue <", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueLessThanOrEqualTo(String value) {
            addCriterion("isoverdue <=", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueLike(String value) {
            addCriterion("isoverdue like", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueNotLike(String value) {
            addCriterion("isoverdue not like", value, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueIn(List<String> values) {
            addCriterion("isoverdue in", values, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueNotIn(List<String> values) {
            addCriterion("isoverdue not in", values, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueBetween(String value1, String value2) {
            addCriterion("isoverdue between", value1, value2, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsoverdueNotBetween(String value1, String value2) {
            addCriterion("isoverdue not between", value1, value2, "isoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2IsNull() {
            addCriterion("isrecentoverdue2 is null");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2IsNotNull() {
            addCriterion("isrecentoverdue2 is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2EqualTo(String value) {
            addCriterion("isrecentoverdue2 =", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2NotEqualTo(String value) {
            addCriterion("isrecentoverdue2 <>", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2GreaterThan(String value) {
            addCriterion("isrecentoverdue2 >", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2GreaterThanOrEqualTo(String value) {
            addCriterion("isrecentoverdue2 >=", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2LessThan(String value) {
            addCriterion("isrecentoverdue2 <", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2LessThanOrEqualTo(String value) {
            addCriterion("isrecentoverdue2 <=", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2Like(String value) {
            addCriterion("isrecentoverdue2 like", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2NotLike(String value) {
            addCriterion("isrecentoverdue2 not like", value, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2In(List<String> values) {
            addCriterion("isrecentoverdue2 in", values, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2NotIn(List<String> values) {
            addCriterion("isrecentoverdue2 not in", values, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2Between(String value1, String value2) {
            addCriterion("isrecentoverdue2 between", value1, value2, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdue2NotBetween(String value1, String value2) {
            addCriterion("isrecentoverdue2 not between", value1, value2, "isrecentoverdue2");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueIsNull() {
            addCriterion("isrecentoverdue is null");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueIsNotNull() {
            addCriterion("isrecentoverdue is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueEqualTo(String value) {
            addCriterion("isrecentoverdue =", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueNotEqualTo(String value) {
            addCriterion("isrecentoverdue <>", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueGreaterThan(String value) {
            addCriterion("isrecentoverdue >", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueGreaterThanOrEqualTo(String value) {
            addCriterion("isrecentoverdue >=", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueLessThan(String value) {
            addCriterion("isrecentoverdue <", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueLessThanOrEqualTo(String value) {
            addCriterion("isrecentoverdue <=", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueLike(String value) {
            addCriterion("isrecentoverdue like", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueNotLike(String value) {
            addCriterion("isrecentoverdue not like", value, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueIn(List<String> values) {
            addCriterion("isrecentoverdue in", values, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueNotIn(List<String> values) {
            addCriterion("isrecentoverdue not in", values, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueBetween(String value1, String value2) {
            addCriterion("isrecentoverdue between", value1, value2, "isrecentoverdue");
            return (Criteria) this;
        }

        public Criteria andIsrecentoverdueNotBetween(String value1, String value2) {
            addCriterion("isrecentoverdue not between", value1, value2, "isrecentoverdue");
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

        public Criteria andOverdueclearflg2IsNull() {
            addCriterion("overdueclearflg2 is null");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2IsNotNull() {
            addCriterion("overdueclearflg2 is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2EqualTo(String value) {
            addCriterion("overdueclearflg2 =", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2NotEqualTo(String value) {
            addCriterion("overdueclearflg2 <>", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2GreaterThan(String value) {
            addCriterion("overdueclearflg2 >", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2GreaterThanOrEqualTo(String value) {
            addCriterion("overdueclearflg2 >=", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2LessThan(String value) {
            addCriterion("overdueclearflg2 <", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2LessThanOrEqualTo(String value) {
            addCriterion("overdueclearflg2 <=", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2Like(String value) {
            addCriterion("overdueclearflg2 like", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2NotLike(String value) {
            addCriterion("overdueclearflg2 not like", value, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2In(List<String> values) {
            addCriterion("overdueclearflg2 in", values, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2NotIn(List<String> values) {
            addCriterion("overdueclearflg2 not in", values, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2Between(String value1, String value2) {
            addCriterion("overdueclearflg2 between", value1, value2, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflg2NotBetween(String value1, String value2) {
            addCriterion("overdueclearflg2 not between", value1, value2, "overdueclearflg2");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgIsNull() {
            addCriterion("overdueclearflg is null");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgIsNotNull() {
            addCriterion("overdueclearflg is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgEqualTo(String value) {
            addCriterion("overdueclearflg =", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgNotEqualTo(String value) {
            addCriterion("overdueclearflg <>", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgGreaterThan(String value) {
            addCriterion("overdueclearflg >", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgGreaterThanOrEqualTo(String value) {
            addCriterion("overdueclearflg >=", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgLessThan(String value) {
            addCriterion("overdueclearflg <", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgLessThanOrEqualTo(String value) {
            addCriterion("overdueclearflg <=", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgLike(String value) {
            addCriterion("overdueclearflg like", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgNotLike(String value) {
            addCriterion("overdueclearflg not like", value, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgIn(List<String> values) {
            addCriterion("overdueclearflg in", values, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgNotIn(List<String> values) {
            addCriterion("overdueclearflg not in", values, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgBetween(String value1, String value2) {
            addCriterion("overdueclearflg between", value1, value2, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverdueclearflgNotBetween(String value1, String value2) {
            addCriterion("overdueclearflg not between", value1, value2, "overdueclearflg");
            return (Criteria) this;
        }

        public Criteria andOverduecount2IsNull() {
            addCriterion("overduecount2 is null");
            return (Criteria) this;
        }

        public Criteria andOverduecount2IsNotNull() {
            addCriterion("overduecount2 is not null");
            return (Criteria) this;
        }

        public Criteria andOverduecount2EqualTo(String value) {
            addCriterion("overduecount2 =", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2NotEqualTo(String value) {
            addCriterion("overduecount2 <>", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2GreaterThan(String value) {
            addCriterion("overduecount2 >", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2GreaterThanOrEqualTo(String value) {
            addCriterion("overduecount2 >=", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2LessThan(String value) {
            addCriterion("overduecount2 <", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2LessThanOrEqualTo(String value) {
            addCriterion("overduecount2 <=", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2Like(String value) {
            addCriterion("overduecount2 like", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2NotLike(String value) {
            addCriterion("overduecount2 not like", value, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2In(List<String> values) {
            addCriterion("overduecount2 in", values, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2NotIn(List<String> values) {
            addCriterion("overduecount2 not in", values, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2Between(String value1, String value2) {
            addCriterion("overduecount2 between", value1, value2, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecount2NotBetween(String value1, String value2) {
            addCriterion("overduecount2 not between", value1, value2, "overduecount2");
            return (Criteria) this;
        }

        public Criteria andOverduecountIsNull() {
            addCriterion("overduecount is null");
            return (Criteria) this;
        }

        public Criteria andOverduecountIsNotNull() {
            addCriterion("overduecount is not null");
            return (Criteria) this;
        }

        public Criteria andOverduecountEqualTo(String value) {
            addCriterion("overduecount =", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountNotEqualTo(String value) {
            addCriterion("overduecount <>", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountGreaterThan(String value) {
            addCriterion("overduecount >", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountGreaterThanOrEqualTo(String value) {
            addCriterion("overduecount >=", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountLessThan(String value) {
            addCriterion("overduecount <", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountLessThanOrEqualTo(String value) {
            addCriterion("overduecount <=", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountLike(String value) {
            addCriterion("overduecount like", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountNotLike(String value) {
            addCriterion("overduecount not like", value, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountIn(List<String> values) {
            addCriterion("overduecount in", values, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountNotIn(List<String> values) {
            addCriterion("overduecount not in", values, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountBetween(String value1, String value2) {
            addCriterion("overduecount between", value1, value2, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverduecountNotBetween(String value1, String value2) {
            addCriterion("overduecount not between", value1, value2, "overduecount");
            return (Criteria) this;
        }

        public Criteria andOverdueday2IsNull() {
            addCriterion("overdueday2 is null");
            return (Criteria) this;
        }

        public Criteria andOverdueday2IsNotNull() {
            addCriterion("overdueday2 is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueday2EqualTo(String value) {
            addCriterion("overdueday2 =", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2NotEqualTo(String value) {
            addCriterion("overdueday2 <>", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2GreaterThan(String value) {
            addCriterion("overdueday2 >", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2GreaterThanOrEqualTo(String value) {
            addCriterion("overdueday2 >=", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2LessThan(String value) {
            addCriterion("overdueday2 <", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2LessThanOrEqualTo(String value) {
            addCriterion("overdueday2 <=", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2Like(String value) {
            addCriterion("overdueday2 like", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2NotLike(String value) {
            addCriterion("overdueday2 not like", value, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2In(List<String> values) {
            addCriterion("overdueday2 in", values, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2NotIn(List<String> values) {
            addCriterion("overdueday2 not in", values, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2Between(String value1, String value2) {
            addCriterion("overdueday2 between", value1, value2, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverdueday2NotBetween(String value1, String value2) {
            addCriterion("overdueday2 not between", value1, value2, "overdueday2");
            return (Criteria) this;
        }

        public Criteria andOverduedayIsNull() {
            addCriterion("overdueday is null");
            return (Criteria) this;
        }

        public Criteria andOverduedayIsNotNull() {
            addCriterion("overdueday is not null");
            return (Criteria) this;
        }

        public Criteria andOverduedayEqualTo(String value) {
            addCriterion("overdueday =", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotEqualTo(String value) {
            addCriterion("overdueday <>", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayGreaterThan(String value) {
            addCriterion("overdueday >", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayGreaterThanOrEqualTo(String value) {
            addCriterion("overdueday >=", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayLessThan(String value) {
            addCriterion("overdueday <", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayLessThanOrEqualTo(String value) {
            addCriterion("overdueday <=", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayLike(String value) {
            addCriterion("overdueday like", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotLike(String value) {
            addCriterion("overdueday not like", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayIn(List<String> values) {
            addCriterion("overdueday in", values, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotIn(List<String> values) {
            addCriterion("overdueday not in", values, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayBetween(String value1, String value2) {
            addCriterion("overdueday between", value1, value2, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotBetween(String value1, String value2) {
            addCriterion("overdueday not between", value1, value2, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2IsNull() {
            addCriterion("overdueamount2 is null");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2IsNotNull() {
            addCriterion("overdueamount2 is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2EqualTo(BigDecimal value) {
            addCriterion("overdueamount2 =", value, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2NotEqualTo(BigDecimal value) {
            addCriterion("overdueamount2 <>", value, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2GreaterThan(BigDecimal value) {
            addCriterion("overdueamount2 >", value, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueamount2 >=", value, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2LessThan(BigDecimal value) {
            addCriterion("overdueamount2 <", value, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueamount2 <=", value, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2In(List<BigDecimal> values) {
            addCriterion("overdueamount2 in", values, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2NotIn(List<BigDecimal> values) {
            addCriterion("overdueamount2 not in", values, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueamount2 between", value1, value2, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamount2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueamount2 not between", value1, value2, "overdueamount2");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIsNull() {
            addCriterion("overdueamount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIsNotNull() {
            addCriterion("overdueamount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueamountEqualTo(BigDecimal value) {
            addCriterion("overdueamount =", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotEqualTo(BigDecimal value) {
            addCriterion("overdueamount <>", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThan(BigDecimal value) {
            addCriterion("overdueamount >", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueamount >=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThan(BigDecimal value) {
            addCriterion("overdueamount <", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueamount <=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIn(List<BigDecimal> values) {
            addCriterion("overdueamount in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotIn(List<BigDecimal> values) {
            addCriterion("overdueamount not in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueamount between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueamount not between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2IsNull() {
            addCriterion("maxoverduecount2 is null");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2IsNotNull() {
            addCriterion("maxoverduecount2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2EqualTo(String value) {
            addCriterion("maxoverduecount2 =", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2NotEqualTo(String value) {
            addCriterion("maxoverduecount2 <>", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2GreaterThan(String value) {
            addCriterion("maxoverduecount2 >", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2GreaterThanOrEqualTo(String value) {
            addCriterion("maxoverduecount2 >=", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2LessThan(String value) {
            addCriterion("maxoverduecount2 <", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2LessThanOrEqualTo(String value) {
            addCriterion("maxoverduecount2 <=", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2Like(String value) {
            addCriterion("maxoverduecount2 like", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2NotLike(String value) {
            addCriterion("maxoverduecount2 not like", value, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2In(List<String> values) {
            addCriterion("maxoverduecount2 in", values, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2NotIn(List<String> values) {
            addCriterion("maxoverduecount2 not in", values, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2Between(String value1, String value2) {
            addCriterion("maxoverduecount2 between", value1, value2, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecount2NotBetween(String value1, String value2) {
            addCriterion("maxoverduecount2 not between", value1, value2, "maxoverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountIsNull() {
            addCriterion("maxoverduecount is null");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountIsNotNull() {
            addCriterion("maxoverduecount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountEqualTo(String value) {
            addCriterion("maxoverduecount =", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountNotEqualTo(String value) {
            addCriterion("maxoverduecount <>", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountGreaterThan(String value) {
            addCriterion("maxoverduecount >", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountGreaterThanOrEqualTo(String value) {
            addCriterion("maxoverduecount >=", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountLessThan(String value) {
            addCriterion("maxoverduecount <", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountLessThanOrEqualTo(String value) {
            addCriterion("maxoverduecount <=", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountLike(String value) {
            addCriterion("maxoverduecount like", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountNotLike(String value) {
            addCriterion("maxoverduecount not like", value, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountIn(List<String> values) {
            addCriterion("maxoverduecount in", values, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountNotIn(List<String> values) {
            addCriterion("maxoverduecount not in", values, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountBetween(String value1, String value2) {
            addCriterion("maxoverduecount between", value1, value2, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andMaxoverduecountNotBetween(String value1, String value2) {
            addCriterion("maxoverduecount not between", value1, value2, "maxoverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2IsNull() {
            addCriterion("totaloverduecount2 is null");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2IsNotNull() {
            addCriterion("totaloverduecount2 is not null");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2EqualTo(String value) {
            addCriterion("totaloverduecount2 =", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2NotEqualTo(String value) {
            addCriterion("totaloverduecount2 <>", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2GreaterThan(String value) {
            addCriterion("totaloverduecount2 >", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2GreaterThanOrEqualTo(String value) {
            addCriterion("totaloverduecount2 >=", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2LessThan(String value) {
            addCriterion("totaloverduecount2 <", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2LessThanOrEqualTo(String value) {
            addCriterion("totaloverduecount2 <=", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2Like(String value) {
            addCriterion("totaloverduecount2 like", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2NotLike(String value) {
            addCriterion("totaloverduecount2 not like", value, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2In(List<String> values) {
            addCriterion("totaloverduecount2 in", values, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2NotIn(List<String> values) {
            addCriterion("totaloverduecount2 not in", values, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2Between(String value1, String value2) {
            addCriterion("totaloverduecount2 between", value1, value2, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecount2NotBetween(String value1, String value2) {
            addCriterion("totaloverduecount2 not between", value1, value2, "totaloverduecount2");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayIsNull() {
            addCriterion("maxoverdueday is null");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayIsNotNull() {
            addCriterion("maxoverdueday is not null");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayEqualTo(String value) {
            addCriterion("maxoverdueday =", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayNotEqualTo(String value) {
            addCriterion("maxoverdueday <>", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayGreaterThan(String value) {
            addCriterion("maxoverdueday >", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayGreaterThanOrEqualTo(String value) {
            addCriterion("maxoverdueday >=", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayLessThan(String value) {
            addCriterion("maxoverdueday <", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayLessThanOrEqualTo(String value) {
            addCriterion("maxoverdueday <=", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayLike(String value) {
            addCriterion("maxoverdueday like", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayNotLike(String value) {
            addCriterion("maxoverdueday not like", value, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayIn(List<String> values) {
            addCriterion("maxoverdueday in", values, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayNotIn(List<String> values) {
            addCriterion("maxoverdueday not in", values, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayBetween(String value1, String value2) {
            addCriterion("maxoverdueday between", value1, value2, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverduedayNotBetween(String value1, String value2) {
            addCriterion("maxoverdueday not between", value1, value2, "maxoverdueday");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2IsNull() {
            addCriterion("maxoverdueday2 is null");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2IsNotNull() {
            addCriterion("maxoverdueday2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2EqualTo(String value) {
            addCriterion("maxoverdueday2 =", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2NotEqualTo(String value) {
            addCriterion("maxoverdueday2 <>", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2GreaterThan(String value) {
            addCriterion("maxoverdueday2 >", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2GreaterThanOrEqualTo(String value) {
            addCriterion("maxoverdueday2 >=", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2LessThan(String value) {
            addCriterion("maxoverdueday2 <", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2LessThanOrEqualTo(String value) {
            addCriterion("maxoverdueday2 <=", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2Like(String value) {
            addCriterion("maxoverdueday2 like", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2NotLike(String value) {
            addCriterion("maxoverdueday2 not like", value, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2In(List<String> values) {
            addCriterion("maxoverdueday2 in", values, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2NotIn(List<String> values) {
            addCriterion("maxoverdueday2 not in", values, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2Between(String value1, String value2) {
            addCriterion("maxoverdueday2 between", value1, value2, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andMaxoverdueday2NotBetween(String value1, String value2) {
            addCriterion("maxoverdueday2 not between", value1, value2, "maxoverdueday2");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountIsNull() {
            addCriterion("totaloverduecount is null");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountIsNotNull() {
            addCriterion("totaloverduecount is not null");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountEqualTo(String value) {
            addCriterion("totaloverduecount =", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountNotEqualTo(String value) {
            addCriterion("totaloverduecount <>", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountGreaterThan(String value) {
            addCriterion("totaloverduecount >", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountGreaterThanOrEqualTo(String value) {
            addCriterion("totaloverduecount >=", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountLessThan(String value) {
            addCriterion("totaloverduecount <", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountLessThanOrEqualTo(String value) {
            addCriterion("totaloverduecount <=", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountLike(String value) {
            addCriterion("totaloverduecount like", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountNotLike(String value) {
            addCriterion("totaloverduecount not like", value, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountIn(List<String> values) {
            addCriterion("totaloverduecount in", values, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountNotIn(List<String> values) {
            addCriterion("totaloverduecount not in", values, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountBetween(String value1, String value2) {
            addCriterion("totaloverduecount between", value1, value2, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andTotaloverduecountNotBetween(String value1, String value2) {
            addCriterion("totaloverduecount not between", value1, value2, "totaloverduecount");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayIsNull() {
            addCriterion("isoverdueforpay is null");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayIsNotNull() {
            addCriterion("isoverdueforpay is not null");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayEqualTo(String value) {
            addCriterion("isoverdueforpay =", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayNotEqualTo(String value) {
            addCriterion("isoverdueforpay <>", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayGreaterThan(String value) {
            addCriterion("isoverdueforpay >", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayGreaterThanOrEqualTo(String value) {
            addCriterion("isoverdueforpay >=", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayLessThan(String value) {
            addCriterion("isoverdueforpay <", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayLessThanOrEqualTo(String value) {
            addCriterion("isoverdueforpay <=", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayLike(String value) {
            addCriterion("isoverdueforpay like", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayNotLike(String value) {
            addCriterion("isoverdueforpay not like", value, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayIn(List<String> values) {
            addCriterion("isoverdueforpay in", values, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayNotIn(List<String> values) {
            addCriterion("isoverdueforpay not in", values, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayBetween(String value1, String value2) {
            addCriterion("isoverdueforpay between", value1, value2, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpayNotBetween(String value1, String value2) {
            addCriterion("isoverdueforpay not between", value1, value2, "isoverdueforpay");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2IsNull() {
            addCriterion("isoverdueforpay2 is null");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2IsNotNull() {
            addCriterion("isoverdueforpay2 is not null");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2EqualTo(String value) {
            addCriterion("isoverdueforpay2 =", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2NotEqualTo(String value) {
            addCriterion("isoverdueforpay2 <>", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2GreaterThan(String value) {
            addCriterion("isoverdueforpay2 >", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2GreaterThanOrEqualTo(String value) {
            addCriterion("isoverdueforpay2 >=", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2LessThan(String value) {
            addCriterion("isoverdueforpay2 <", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2LessThanOrEqualTo(String value) {
            addCriterion("isoverdueforpay2 <=", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2Like(String value) {
            addCriterion("isoverdueforpay2 like", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2NotLike(String value) {
            addCriterion("isoverdueforpay2 not like", value, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2In(List<String> values) {
            addCriterion("isoverdueforpay2 in", values, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2NotIn(List<String> values) {
            addCriterion("isoverdueforpay2 not in", values, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2Between(String value1, String value2) {
            addCriterion("isoverdueforpay2 between", value1, value2, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsoverdueforpay2NotBetween(String value1, String value2) {
            addCriterion("isoverdueforpay2 not between", value1, value2, "isoverdueforpay2");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeIsNull() {
            addCriterion("isguarantee is null");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeIsNotNull() {
            addCriterion("isguarantee is not null");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeEqualTo(String value) {
            addCriterion("isguarantee =", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeNotEqualTo(String value) {
            addCriterion("isguarantee <>", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeGreaterThan(String value) {
            addCriterion("isguarantee >", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("isguarantee >=", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeLessThan(String value) {
            addCriterion("isguarantee <", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeLessThanOrEqualTo(String value) {
            addCriterion("isguarantee <=", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeLike(String value) {
            addCriterion("isguarantee like", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeNotLike(String value) {
            addCriterion("isguarantee not like", value, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeIn(List<String> values) {
            addCriterion("isguarantee in", values, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeNotIn(List<String> values) {
            addCriterion("isguarantee not in", values, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeBetween(String value1, String value2) {
            addCriterion("isguarantee between", value1, value2, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andIsguaranteeNotBetween(String value1, String value2) {
            addCriterion("isguarantee not between", value1, value2, "isguarantee");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodIsNull() {
            addCriterion("overdueperiod is null");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodIsNotNull() {
            addCriterion("overdueperiod is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodEqualTo(String value) {
            addCriterion("overdueperiod =", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodNotEqualTo(String value) {
            addCriterion("overdueperiod <>", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodGreaterThan(String value) {
            addCriterion("overdueperiod >", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodGreaterThanOrEqualTo(String value) {
            addCriterion("overdueperiod >=", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodLessThan(String value) {
            addCriterion("overdueperiod <", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodLessThanOrEqualTo(String value) {
            addCriterion("overdueperiod <=", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodLike(String value) {
            addCriterion("overdueperiod like", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodNotLike(String value) {
            addCriterion("overdueperiod not like", value, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodIn(List<String> values) {
            addCriterion("overdueperiod in", values, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodNotIn(List<String> values) {
            addCriterion("overdueperiod not in", values, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodBetween(String value1, String value2) {
            addCriterion("overdueperiod between", value1, value2, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiodNotBetween(String value1, String value2) {
            addCriterion("overdueperiod not between", value1, value2, "overdueperiod");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2IsNull() {
            addCriterion("overdueperiod2 is null");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2IsNotNull() {
            addCriterion("overdueperiod2 is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2EqualTo(String value) {
            addCriterion("overdueperiod2 =", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2NotEqualTo(String value) {
            addCriterion("overdueperiod2 <>", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2GreaterThan(String value) {
            addCriterion("overdueperiod2 >", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2GreaterThanOrEqualTo(String value) {
            addCriterion("overdueperiod2 >=", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2LessThan(String value) {
            addCriterion("overdueperiod2 <", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2LessThanOrEqualTo(String value) {
            addCriterion("overdueperiod2 <=", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2Like(String value) {
            addCriterion("overdueperiod2 like", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2NotLike(String value) {
            addCriterion("overdueperiod2 not like", value, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2In(List<String> values) {
            addCriterion("overdueperiod2 in", values, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2NotIn(List<String> values) {
            addCriterion("overdueperiod2 not in", values, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2Between(String value1, String value2) {
            addCriterion("overdueperiod2 between", value1, value2, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andOverdueperiod2NotBetween(String value1, String value2) {
            addCriterion("overdueperiod2 not between", value1, value2, "overdueperiod2");
            return (Criteria) this;
        }

        public Criteria andIsclearedupIsNull() {
            addCriterion("isclearedup is null");
            return (Criteria) this;
        }

        public Criteria andIsclearedupIsNotNull() {
            addCriterion("isclearedup is not null");
            return (Criteria) this;
        }

        public Criteria andIsclearedupEqualTo(String value) {
            addCriterion("isclearedup =", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupNotEqualTo(String value) {
            addCriterion("isclearedup <>", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupGreaterThan(String value) {
            addCriterion("isclearedup >", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupGreaterThanOrEqualTo(String value) {
            addCriterion("isclearedup >=", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupLessThan(String value) {
            addCriterion("isclearedup <", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupLessThanOrEqualTo(String value) {
            addCriterion("isclearedup <=", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupLike(String value) {
            addCriterion("isclearedup like", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupNotLike(String value) {
            addCriterion("isclearedup not like", value, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupIn(List<String> values) {
            addCriterion("isclearedup in", values, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupNotIn(List<String> values) {
            addCriterion("isclearedup not in", values, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupBetween(String value1, String value2) {
            addCriterion("isclearedup between", value1, value2, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andIsclearedupNotBetween(String value1, String value2) {
            addCriterion("isclearedup not between", value1, value2, "isclearedup");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeIsNull() {
            addCriterion("fiveguarantee is null");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeIsNotNull() {
            addCriterion("fiveguarantee is not null");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeEqualTo(String value) {
            addCriterion("fiveguarantee =", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeNotEqualTo(String value) {
            addCriterion("fiveguarantee <>", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeGreaterThan(String value) {
            addCriterion("fiveguarantee >", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("fiveguarantee >=", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeLessThan(String value) {
            addCriterion("fiveguarantee <", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeLessThanOrEqualTo(String value) {
            addCriterion("fiveguarantee <=", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeLike(String value) {
            addCriterion("fiveguarantee like", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeNotLike(String value) {
            addCriterion("fiveguarantee not like", value, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeIn(List<String> values) {
            addCriterion("fiveguarantee in", values, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeNotIn(List<String> values) {
            addCriterion("fiveguarantee not in", values, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeBetween(String value1, String value2) {
            addCriterion("fiveguarantee between", value1, value2, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFiveguaranteeNotBetween(String value1, String value2) {
            addCriterion("fiveguarantee not between", value1, value2, "fiveguarantee");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryIsNull() {
            addCriterion("frequencyofenquiry is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryIsNotNull() {
            addCriterion("frequencyofenquiry is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryEqualTo(String value) {
            addCriterion("frequencyofenquiry =", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryNotEqualTo(String value) {
            addCriterion("frequencyofenquiry <>", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryGreaterThan(String value) {
            addCriterion("frequencyofenquiry >", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryGreaterThanOrEqualTo(String value) {
            addCriterion("frequencyofenquiry >=", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryLessThan(String value) {
            addCriterion("frequencyofenquiry <", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryLessThanOrEqualTo(String value) {
            addCriterion("frequencyofenquiry <=", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryLike(String value) {
            addCriterion("frequencyofenquiry like", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryNotLike(String value) {
            addCriterion("frequencyofenquiry not like", value, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryIn(List<String> values) {
            addCriterion("frequencyofenquiry in", values, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryNotIn(List<String> values) {
            addCriterion("frequencyofenquiry not in", values, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryBetween(String value1, String value2) {
            addCriterion("frequencyofenquiry between", value1, value2, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andFrequencyofenquiryNotBetween(String value1, String value2) {
            addCriterion("frequencyofenquiry not between", value1, value2, "frequencyofenquiry");
            return (Criteria) this;
        }

        public Criteria andInquireIsNull() {
            addCriterion("inquire is null");
            return (Criteria) this;
        }

        public Criteria andInquireIsNotNull() {
            addCriterion("inquire is not null");
            return (Criteria) this;
        }

        public Criteria andInquireEqualTo(String value) {
            addCriterion("inquire =", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireNotEqualTo(String value) {
            addCriterion("inquire <>", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireGreaterThan(String value) {
            addCriterion("inquire >", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireGreaterThanOrEqualTo(String value) {
            addCriterion("inquire >=", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireLessThan(String value) {
            addCriterion("inquire <", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireLessThanOrEqualTo(String value) {
            addCriterion("inquire <=", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireLike(String value) {
            addCriterion("inquire like", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireNotLike(String value) {
            addCriterion("inquire not like", value, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireIn(List<String> values) {
            addCriterion("inquire in", values, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireNotIn(List<String> values) {
            addCriterion("inquire not in", values, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireBetween(String value1, String value2) {
            addCriterion("inquire between", value1, value2, "inquire");
            return (Criteria) this;
        }

        public Criteria andInquireNotBetween(String value1, String value2) {
            addCriterion("inquire not between", value1, value2, "inquire");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalIsNull() {
            addCriterion("loanapproval is null");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalIsNotNull() {
            addCriterion("loanapproval is not null");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalEqualTo(String value) {
            addCriterion("loanapproval =", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalNotEqualTo(String value) {
            addCriterion("loanapproval <>", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalGreaterThan(String value) {
            addCriterion("loanapproval >", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalGreaterThanOrEqualTo(String value) {
            addCriterion("loanapproval >=", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalLessThan(String value) {
            addCriterion("loanapproval <", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalLessThanOrEqualTo(String value) {
            addCriterion("loanapproval <=", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalLike(String value) {
            addCriterion("loanapproval like", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalNotLike(String value) {
            addCriterion("loanapproval not like", value, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalIn(List<String> values) {
            addCriterion("loanapproval in", values, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalNotIn(List<String> values) {
            addCriterion("loanapproval not in", values, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalBetween(String value1, String value2) {
            addCriterion("loanapproval between", value1, value2, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andLoanapprovalNotBetween(String value1, String value2) {
            addCriterion("loanapproval not between", value1, value2, "loanapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalIsNull() {
            addCriterion("creditapproval is null");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalIsNotNull() {
            addCriterion("creditapproval is not null");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalEqualTo(String value) {
            addCriterion("creditapproval =", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalNotEqualTo(String value) {
            addCriterion("creditapproval <>", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalGreaterThan(String value) {
            addCriterion("creditapproval >", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalGreaterThanOrEqualTo(String value) {
            addCriterion("creditapproval >=", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalLessThan(String value) {
            addCriterion("creditapproval <", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalLessThanOrEqualTo(String value) {
            addCriterion("creditapproval <=", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalLike(String value) {
            addCriterion("creditapproval like", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalNotLike(String value) {
            addCriterion("creditapproval not like", value, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalIn(List<String> values) {
            addCriterion("creditapproval in", values, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalNotIn(List<String> values) {
            addCriterion("creditapproval not in", values, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalBetween(String value1, String value2) {
            addCriterion("creditapproval between", value1, value2, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andCreditapprovalNotBetween(String value1, String value2) {
            addCriterion("creditapproval not between", value1, value2, "creditapproval");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaIsNull() {
            addCriterion("postloanmana is null");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaIsNotNull() {
            addCriterion("postloanmana is not null");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaEqualTo(String value) {
            addCriterion("postloanmana =", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaNotEqualTo(String value) {
            addCriterion("postloanmana <>", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaGreaterThan(String value) {
            addCriterion("postloanmana >", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaGreaterThanOrEqualTo(String value) {
            addCriterion("postloanmana >=", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaLessThan(String value) {
            addCriterion("postloanmana <", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaLessThanOrEqualTo(String value) {
            addCriterion("postloanmana <=", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaLike(String value) {
            addCriterion("postloanmana like", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaNotLike(String value) {
            addCriterion("postloanmana not like", value, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaIn(List<String> values) {
            addCriterion("postloanmana in", values, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaNotIn(List<String> values) {
            addCriterion("postloanmana not in", values, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaBetween(String value1, String value2) {
            addCriterion("postloanmana between", value1, value2, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andPostloanmanaNotBetween(String value1, String value2) {
            addCriterion("postloanmana not between", value1, value2, "postloanmana");
            return (Criteria) this;
        }

        public Criteria andGqexaminationIsNull() {
            addCriterion("gqexamination is null");
            return (Criteria) this;
        }

        public Criteria andGqexaminationIsNotNull() {
            addCriterion("gqexamination is not null");
            return (Criteria) this;
        }

        public Criteria andGqexaminationEqualTo(String value) {
            addCriterion("gqexamination =", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationNotEqualTo(String value) {
            addCriterion("gqexamination <>", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationGreaterThan(String value) {
            addCriterion("gqexamination >", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationGreaterThanOrEqualTo(String value) {
            addCriterion("gqexamination >=", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationLessThan(String value) {
            addCriterion("gqexamination <", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationLessThanOrEqualTo(String value) {
            addCriterion("gqexamination <=", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationLike(String value) {
            addCriterion("gqexamination like", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationNotLike(String value) {
            addCriterion("gqexamination not like", value, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationIn(List<String> values) {
            addCriterion("gqexamination in", values, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationNotIn(List<String> values) {
            addCriterion("gqexamination not in", values, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationBetween(String value1, String value2) {
            addCriterion("gqexamination between", value1, value2, "gqexamination");
            return (Criteria) this;
        }

        public Criteria andGqexaminationNotBetween(String value1, String value2) {
            addCriterion("gqexamination not between", value1, value2, "gqexamination");
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