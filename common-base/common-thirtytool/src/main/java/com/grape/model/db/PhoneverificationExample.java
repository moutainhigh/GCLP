package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhoneverificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhoneverificationExample() {
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

        public Criteria andMarriageabnormalIsNull() {
            addCriterion("marriageabnormal is null");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalIsNotNull() {
            addCriterion("marriageabnormal is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalEqualTo(String value) {
            addCriterion("marriageabnormal =", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalNotEqualTo(String value) {
            addCriterion("marriageabnormal <>", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalGreaterThan(String value) {
            addCriterion("marriageabnormal >", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalGreaterThanOrEqualTo(String value) {
            addCriterion("marriageabnormal >=", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalLessThan(String value) {
            addCriterion("marriageabnormal <", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalLessThanOrEqualTo(String value) {
            addCriterion("marriageabnormal <=", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalLike(String value) {
            addCriterion("marriageabnormal like", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalNotLike(String value) {
            addCriterion("marriageabnormal not like", value, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalIn(List<String> values) {
            addCriterion("marriageabnormal in", values, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalNotIn(List<String> values) {
            addCriterion("marriageabnormal not in", values, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalBetween(String value1, String value2) {
            addCriterion("marriageabnormal between", value1, value2, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalNotBetween(String value1, String value2) {
            addCriterion("marriageabnormal not between", value1, value2, "marriageabnormal");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsIsNull() {
            addCriterion("marriageabnormalins is null");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsIsNotNull() {
            addCriterion("marriageabnormalins is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsEqualTo(String value) {
            addCriterion("marriageabnormalins =", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsNotEqualTo(String value) {
            addCriterion("marriageabnormalins <>", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsGreaterThan(String value) {
            addCriterion("marriageabnormalins >", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsGreaterThanOrEqualTo(String value) {
            addCriterion("marriageabnormalins >=", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsLessThan(String value) {
            addCriterion("marriageabnormalins <", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsLessThanOrEqualTo(String value) {
            addCriterion("marriageabnormalins <=", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsLike(String value) {
            addCriterion("marriageabnormalins like", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsNotLike(String value) {
            addCriterion("marriageabnormalins not like", value, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsIn(List<String> values) {
            addCriterion("marriageabnormalins in", values, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsNotIn(List<String> values) {
            addCriterion("marriageabnormalins not in", values, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsBetween(String value1, String value2) {
            addCriterion("marriageabnormalins between", value1, value2, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andMarriageabnormalinsNotBetween(String value1, String value2) {
            addCriterion("marriageabnormalins not between", value1, value2, "marriageabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalIsNull() {
            addCriterion("creditabnormal is null");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalIsNotNull() {
            addCriterion("creditabnormal is not null");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalEqualTo(String value) {
            addCriterion("creditabnormal =", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalNotEqualTo(String value) {
            addCriterion("creditabnormal <>", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalGreaterThan(String value) {
            addCriterion("creditabnormal >", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalGreaterThanOrEqualTo(String value) {
            addCriterion("creditabnormal >=", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalLessThan(String value) {
            addCriterion("creditabnormal <", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalLessThanOrEqualTo(String value) {
            addCriterion("creditabnormal <=", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalLike(String value) {
            addCriterion("creditabnormal like", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalNotLike(String value) {
            addCriterion("creditabnormal not like", value, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalIn(List<String> values) {
            addCriterion("creditabnormal in", values, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalNotIn(List<String> values) {
            addCriterion("creditabnormal not in", values, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalBetween(String value1, String value2) {
            addCriterion("creditabnormal between", value1, value2, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalNotBetween(String value1, String value2) {
            addCriterion("creditabnormal not between", value1, value2, "creditabnormal");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsIsNull() {
            addCriterion("creditabnormalins is null");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsIsNotNull() {
            addCriterion("creditabnormalins is not null");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsEqualTo(String value) {
            addCriterion("creditabnormalins =", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsNotEqualTo(String value) {
            addCriterion("creditabnormalins <>", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsGreaterThan(String value) {
            addCriterion("creditabnormalins >", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsGreaterThanOrEqualTo(String value) {
            addCriterion("creditabnormalins >=", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsLessThan(String value) {
            addCriterion("creditabnormalins <", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsLessThanOrEqualTo(String value) {
            addCriterion("creditabnormalins <=", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsLike(String value) {
            addCriterion("creditabnormalins like", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsNotLike(String value) {
            addCriterion("creditabnormalins not like", value, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsIn(List<String> values) {
            addCriterion("creditabnormalins in", values, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsNotIn(List<String> values) {
            addCriterion("creditabnormalins not in", values, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsBetween(String value1, String value2) {
            addCriterion("creditabnormalins between", value1, value2, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andCreditabnormalinsNotBetween(String value1, String value2) {
            addCriterion("creditabnormalins not between", value1, value2, "creditabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalIsNull() {
            addCriterion("litigationabnormal is null");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalIsNotNull() {
            addCriterion("litigationabnormal is not null");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalEqualTo(String value) {
            addCriterion("litigationabnormal =", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalNotEqualTo(String value) {
            addCriterion("litigationabnormal <>", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalGreaterThan(String value) {
            addCriterion("litigationabnormal >", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalGreaterThanOrEqualTo(String value) {
            addCriterion("litigationabnormal >=", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalLessThan(String value) {
            addCriterion("litigationabnormal <", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalLessThanOrEqualTo(String value) {
            addCriterion("litigationabnormal <=", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalLike(String value) {
            addCriterion("litigationabnormal like", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalNotLike(String value) {
            addCriterion("litigationabnormal not like", value, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalIn(List<String> values) {
            addCriterion("litigationabnormal in", values, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalNotIn(List<String> values) {
            addCriterion("litigationabnormal not in", values, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalBetween(String value1, String value2) {
            addCriterion("litigationabnormal between", value1, value2, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalNotBetween(String value1, String value2) {
            addCriterion("litigationabnormal not between", value1, value2, "litigationabnormal");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsIsNull() {
            addCriterion("litigationabnormalins is null");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsIsNotNull() {
            addCriterion("litigationabnormalins is not null");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsEqualTo(String value) {
            addCriterion("litigationabnormalins =", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsNotEqualTo(String value) {
            addCriterion("litigationabnormalins <>", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsGreaterThan(String value) {
            addCriterion("litigationabnormalins >", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsGreaterThanOrEqualTo(String value) {
            addCriterion("litigationabnormalins >=", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsLessThan(String value) {
            addCriterion("litigationabnormalins <", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsLessThanOrEqualTo(String value) {
            addCriterion("litigationabnormalins <=", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsLike(String value) {
            addCriterion("litigationabnormalins like", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsNotLike(String value) {
            addCriterion("litigationabnormalins not like", value, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsIn(List<String> values) {
            addCriterion("litigationabnormalins in", values, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsNotIn(List<String> values) {
            addCriterion("litigationabnormalins not in", values, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsBetween(String value1, String value2) {
            addCriterion("litigationabnormalins between", value1, value2, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andLitigationabnormalinsNotBetween(String value1, String value2) {
            addCriterion("litigationabnormalins not between", value1, value2, "litigationabnormalins");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesIsNull() {
            addCriterion("borrowingpurposes is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesIsNotNull() {
            addCriterion("borrowingpurposes is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesEqualTo(String value) {
            addCriterion("borrowingpurposes =", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesNotEqualTo(String value) {
            addCriterion("borrowingpurposes <>", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesGreaterThan(String value) {
            addCriterion("borrowingpurposes >", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesGreaterThanOrEqualTo(String value) {
            addCriterion("borrowingpurposes >=", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesLessThan(String value) {
            addCriterion("borrowingpurposes <", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesLessThanOrEqualTo(String value) {
            addCriterion("borrowingpurposes <=", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesLike(String value) {
            addCriterion("borrowingpurposes like", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesNotLike(String value) {
            addCriterion("borrowingpurposes not like", value, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesIn(List<String> values) {
            addCriterion("borrowingpurposes in", values, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesNotIn(List<String> values) {
            addCriterion("borrowingpurposes not in", values, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesBetween(String value1, String value2) {
            addCriterion("borrowingpurposes between", value1, value2, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andBorrowingpurposesNotBetween(String value1, String value2) {
            addCriterion("borrowingpurposes not between", value1, value2, "borrowingpurposes");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceIsNull() {
            addCriterion("repaymentsource is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceIsNotNull() {
            addCriterion("repaymentsource is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceEqualTo(String value) {
            addCriterion("repaymentsource =", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceNotEqualTo(String value) {
            addCriterion("repaymentsource <>", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceGreaterThan(String value) {
            addCriterion("repaymentsource >", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentsource >=", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceLessThan(String value) {
            addCriterion("repaymentsource <", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceLessThanOrEqualTo(String value) {
            addCriterion("repaymentsource <=", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceLike(String value) {
            addCriterion("repaymentsource like", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceNotLike(String value) {
            addCriterion("repaymentsource not like", value, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceIn(List<String> values) {
            addCriterion("repaymentsource in", values, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceNotIn(List<String> values) {
            addCriterion("repaymentsource not in", values, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceBetween(String value1, String value2) {
            addCriterion("repaymentsource between", value1, value2, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andRepaymentsourceNotBetween(String value1, String value2) {
            addCriterion("repaymentsource not between", value1, value2, "repaymentsource");
            return (Criteria) this;
        }

        public Criteria andOthermappersIsNull() {
            addCriterion("othermappers is null");
            return (Criteria) this;
        }

        public Criteria andOthermappersIsNotNull() {
            addCriterion("othermappers is not null");
            return (Criteria) this;
        }

        public Criteria andOthermappersEqualTo(String value) {
            addCriterion("othermappers =", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersNotEqualTo(String value) {
            addCriterion("othermappers <>", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersGreaterThan(String value) {
            addCriterion("othermappers >", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersGreaterThanOrEqualTo(String value) {
            addCriterion("othermappers >=", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersLessThan(String value) {
            addCriterion("othermappers <", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersLessThanOrEqualTo(String value) {
            addCriterion("othermappers <=", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersLike(String value) {
            addCriterion("othermappers like", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersNotLike(String value) {
            addCriterion("othermappers not like", value, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersIn(List<String> values) {
            addCriterion("othermappers in", values, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersNotIn(List<String> values) {
            addCriterion("othermappers not in", values, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersBetween(String value1, String value2) {
            addCriterion("othermappers between", value1, value2, "othermappers");
            return (Criteria) this;
        }

        public Criteria andOthermappersNotBetween(String value1, String value2) {
            addCriterion("othermappers not between", value1, value2, "othermappers");
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