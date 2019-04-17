package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliapplicateinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliapplicateinfoExample() {
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

        public Criteria andBorrowerIsNull() {
            addCriterion("borrower is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIsNotNull() {
            addCriterion("borrower is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerEqualTo(String value) {
            addCriterion("borrower =", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerNotEqualTo(String value) {
            addCriterion("borrower <>", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerGreaterThan(String value) {
            addCriterion("borrower >", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerGreaterThanOrEqualTo(String value) {
            addCriterion("borrower >=", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerLessThan(String value) {
            addCriterion("borrower <", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerLessThanOrEqualTo(String value) {
            addCriterion("borrower <=", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerLike(String value) {
            addCriterion("borrower like", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerNotLike(String value) {
            addCriterion("borrower not like", value, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerIn(List<String> values) {
            addCriterion("borrower in", values, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerNotIn(List<String> values) {
            addCriterion("borrower not in", values, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerBetween(String value1, String value2) {
            addCriterion("borrower between", value1, value2, "borrower");
            return (Criteria) this;
        }

        public Criteria andBorrowerNotBetween(String value1, String value2) {
            addCriterion("borrower not between", value1, value2, "borrower");
            return (Criteria) this;
        }

        public Criteria andIsserioussickIsNull() {
            addCriterion("isserioussick is null");
            return (Criteria) this;
        }

        public Criteria andIsserioussickIsNotNull() {
            addCriterion("isserioussick is not null");
            return (Criteria) this;
        }

        public Criteria andIsserioussickEqualTo(String value) {
            addCriterion("isserioussick =", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickNotEqualTo(String value) {
            addCriterion("isserioussick <>", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickGreaterThan(String value) {
            addCriterion("isserioussick >", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickGreaterThanOrEqualTo(String value) {
            addCriterion("isserioussick >=", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickLessThan(String value) {
            addCriterion("isserioussick <", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickLessThanOrEqualTo(String value) {
            addCriterion("isserioussick <=", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickLike(String value) {
            addCriterion("isserioussick like", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickNotLike(String value) {
            addCriterion("isserioussick not like", value, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickIn(List<String> values) {
            addCriterion("isserioussick in", values, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickNotIn(List<String> values) {
            addCriterion("isserioussick not in", values, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickBetween(String value1, String value2) {
            addCriterion("isserioussick between", value1, value2, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andIsserioussickNotBetween(String value1, String value2) {
            addCriterion("isserioussick not between", value1, value2, "isserioussick");
            return (Criteria) this;
        }

        public Criteria andSicknotesIsNull() {
            addCriterion("sicknotes is null");
            return (Criteria) this;
        }

        public Criteria andSicknotesIsNotNull() {
            addCriterion("sicknotes is not null");
            return (Criteria) this;
        }

        public Criteria andSicknotesEqualTo(String value) {
            addCriterion("sicknotes =", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesNotEqualTo(String value) {
            addCriterion("sicknotes <>", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesGreaterThan(String value) {
            addCriterion("sicknotes >", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesGreaterThanOrEqualTo(String value) {
            addCriterion("sicknotes >=", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesLessThan(String value) {
            addCriterion("sicknotes <", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesLessThanOrEqualTo(String value) {
            addCriterion("sicknotes <=", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesLike(String value) {
            addCriterion("sicknotes like", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesNotLike(String value) {
            addCriterion("sicknotes not like", value, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesIn(List<String> values) {
            addCriterion("sicknotes in", values, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesNotIn(List<String> values) {
            addCriterion("sicknotes not in", values, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesBetween(String value1, String value2) {
            addCriterion("sicknotes between", value1, value2, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andSicknotesNotBetween(String value1, String value2) {
            addCriterion("sicknotes not between", value1, value2, "sicknotes");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitIsNull() {
            addCriterion("isbadhabbit is null");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitIsNotNull() {
            addCriterion("isbadhabbit is not null");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitEqualTo(String value) {
            addCriterion("isbadhabbit =", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitNotEqualTo(String value) {
            addCriterion("isbadhabbit <>", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitGreaterThan(String value) {
            addCriterion("isbadhabbit >", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitGreaterThanOrEqualTo(String value) {
            addCriterion("isbadhabbit >=", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitLessThan(String value) {
            addCriterion("isbadhabbit <", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitLessThanOrEqualTo(String value) {
            addCriterion("isbadhabbit <=", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitLike(String value) {
            addCriterion("isbadhabbit like", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitNotLike(String value) {
            addCriterion("isbadhabbit not like", value, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitIn(List<String> values) {
            addCriterion("isbadhabbit in", values, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitNotIn(List<String> values) {
            addCriterion("isbadhabbit not in", values, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitBetween(String value1, String value2) {
            addCriterion("isbadhabbit between", value1, value2, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andIsbadhabbitNotBetween(String value1, String value2) {
            addCriterion("isbadhabbit not between", value1, value2, "isbadhabbit");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesIsNull() {
            addCriterion("badhabbitnotes is null");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesIsNotNull() {
            addCriterion("badhabbitnotes is not null");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesEqualTo(String value) {
            addCriterion("badhabbitnotes =", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesNotEqualTo(String value) {
            addCriterion("badhabbitnotes <>", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesGreaterThan(String value) {
            addCriterion("badhabbitnotes >", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesGreaterThanOrEqualTo(String value) {
            addCriterion("badhabbitnotes >=", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesLessThan(String value) {
            addCriterion("badhabbitnotes <", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesLessThanOrEqualTo(String value) {
            addCriterion("badhabbitnotes <=", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesLike(String value) {
            addCriterion("badhabbitnotes like", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesNotLike(String value) {
            addCriterion("badhabbitnotes not like", value, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesIn(List<String> values) {
            addCriterion("badhabbitnotes in", values, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesNotIn(List<String> values) {
            addCriterion("badhabbitnotes not in", values, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesBetween(String value1, String value2) {
            addCriterion("badhabbitnotes between", value1, value2, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andBadhabbitnotesNotBetween(String value1, String value2) {
            addCriterion("badhabbitnotes not between", value1, value2, "badhabbitnotes");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordIsNull() {
            addCriterion("iscriminalrecord is null");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordIsNotNull() {
            addCriterion("iscriminalrecord is not null");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordEqualTo(String value) {
            addCriterion("iscriminalrecord =", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordNotEqualTo(String value) {
            addCriterion("iscriminalrecord <>", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordGreaterThan(String value) {
            addCriterion("iscriminalrecord >", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordGreaterThanOrEqualTo(String value) {
            addCriterion("iscriminalrecord >=", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordLessThan(String value) {
            addCriterion("iscriminalrecord <", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordLessThanOrEqualTo(String value) {
            addCriterion("iscriminalrecord <=", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordLike(String value) {
            addCriterion("iscriminalrecord like", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordNotLike(String value) {
            addCriterion("iscriminalrecord not like", value, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordIn(List<String> values) {
            addCriterion("iscriminalrecord in", values, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordNotIn(List<String> values) {
            addCriterion("iscriminalrecord not in", values, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordBetween(String value1, String value2) {
            addCriterion("iscriminalrecord between", value1, value2, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andIscriminalrecordNotBetween(String value1, String value2) {
            addCriterion("iscriminalrecord not between", value1, value2, "iscriminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesIsNull() {
            addCriterion("criminalnotes is null");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesIsNotNull() {
            addCriterion("criminalnotes is not null");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesEqualTo(String value) {
            addCriterion("criminalnotes =", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesNotEqualTo(String value) {
            addCriterion("criminalnotes <>", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesGreaterThan(String value) {
            addCriterion("criminalnotes >", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesGreaterThanOrEqualTo(String value) {
            addCriterion("criminalnotes >=", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesLessThan(String value) {
            addCriterion("criminalnotes <", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesLessThanOrEqualTo(String value) {
            addCriterion("criminalnotes <=", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesLike(String value) {
            addCriterion("criminalnotes like", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesNotLike(String value) {
            addCriterion("criminalnotes not like", value, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesIn(List<String> values) {
            addCriterion("criminalnotes in", values, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesNotIn(List<String> values) {
            addCriterion("criminalnotes not in", values, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesBetween(String value1, String value2) {
            addCriterion("criminalnotes between", value1, value2, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andCriminalnotesNotBetween(String value1, String value2) {
            addCriterion("criminalnotes not between", value1, value2, "criminalnotes");
            return (Criteria) this;
        }

        public Criteria andIsdivorceIsNull() {
            addCriterion("isdivorce is null");
            return (Criteria) this;
        }

        public Criteria andIsdivorceIsNotNull() {
            addCriterion("isdivorce is not null");
            return (Criteria) this;
        }

        public Criteria andIsdivorceEqualTo(String value) {
            addCriterion("isdivorce =", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceNotEqualTo(String value) {
            addCriterion("isdivorce <>", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceGreaterThan(String value) {
            addCriterion("isdivorce >", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceGreaterThanOrEqualTo(String value) {
            addCriterion("isdivorce >=", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceLessThan(String value) {
            addCriterion("isdivorce <", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceLessThanOrEqualTo(String value) {
            addCriterion("isdivorce <=", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceLike(String value) {
            addCriterion("isdivorce like", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceNotLike(String value) {
            addCriterion("isdivorce not like", value, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceIn(List<String> values) {
            addCriterion("isdivorce in", values, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceNotIn(List<String> values) {
            addCriterion("isdivorce not in", values, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceBetween(String value1, String value2) {
            addCriterion("isdivorce between", value1, value2, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andIsdivorceNotBetween(String value1, String value2) {
            addCriterion("isdivorce not between", value1, value2, "isdivorce");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesIsNull() {
            addCriterion("divorcenotes is null");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesIsNotNull() {
            addCriterion("divorcenotes is not null");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesEqualTo(String value) {
            addCriterion("divorcenotes =", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesNotEqualTo(String value) {
            addCriterion("divorcenotes <>", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesGreaterThan(String value) {
            addCriterion("divorcenotes >", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesGreaterThanOrEqualTo(String value) {
            addCriterion("divorcenotes >=", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesLessThan(String value) {
            addCriterion("divorcenotes <", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesLessThanOrEqualTo(String value) {
            addCriterion("divorcenotes <=", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesLike(String value) {
            addCriterion("divorcenotes like", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesNotLike(String value) {
            addCriterion("divorcenotes not like", value, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesIn(List<String> values) {
            addCriterion("divorcenotes in", values, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesNotIn(List<String> values) {
            addCriterion("divorcenotes not in", values, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesBetween(String value1, String value2) {
            addCriterion("divorcenotes between", value1, value2, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andDivorcenotesNotBetween(String value1, String value2) {
            addCriterion("divorcenotes not between", value1, value2, "divorcenotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedIsNull() {
            addCriterion("isunmarried is null");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedIsNotNull() {
            addCriterion("isunmarried is not null");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedEqualTo(String value) {
            addCriterion("isunmarried =", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedNotEqualTo(String value) {
            addCriterion("isunmarried <>", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedGreaterThan(String value) {
            addCriterion("isunmarried >", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedGreaterThanOrEqualTo(String value) {
            addCriterion("isunmarried >=", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedLessThan(String value) {
            addCriterion("isunmarried <", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedLessThanOrEqualTo(String value) {
            addCriterion("isunmarried <=", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedLike(String value) {
            addCriterion("isunmarried like", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedNotLike(String value) {
            addCriterion("isunmarried not like", value, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedIn(List<String> values) {
            addCriterion("isunmarried in", values, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedNotIn(List<String> values) {
            addCriterion("isunmarried not in", values, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedBetween(String value1, String value2) {
            addCriterion("isunmarried between", value1, value2, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriedNotBetween(String value1, String value2) {
            addCriterion("isunmarried not between", value1, value2, "isunmarried");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesIsNull() {
            addCriterion("isunmarriednotes is null");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesIsNotNull() {
            addCriterion("isunmarriednotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesEqualTo(String value) {
            addCriterion("isunmarriednotes =", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesNotEqualTo(String value) {
            addCriterion("isunmarriednotes <>", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesGreaterThan(String value) {
            addCriterion("isunmarriednotes >", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesGreaterThanOrEqualTo(String value) {
            addCriterion("isunmarriednotes >=", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesLessThan(String value) {
            addCriterion("isunmarriednotes <", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesLessThanOrEqualTo(String value) {
            addCriterion("isunmarriednotes <=", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesLike(String value) {
            addCriterion("isunmarriednotes like", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesNotLike(String value) {
            addCriterion("isunmarriednotes not like", value, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesIn(List<String> values) {
            addCriterion("isunmarriednotes in", values, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesNotIn(List<String> values) {
            addCriterion("isunmarriednotes not in", values, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesBetween(String value1, String value2) {
            addCriterion("isunmarriednotes between", value1, value2, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsunmarriednotesNotBetween(String value1, String value2) {
            addCriterion("isunmarriednotes not between", value1, value2, "isunmarriednotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageIsNull() {
            addCriterion("isshammarriage is null");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageIsNotNull() {
            addCriterion("isshammarriage is not null");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageEqualTo(String value) {
            addCriterion("isshammarriage =", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageNotEqualTo(String value) {
            addCriterion("isshammarriage <>", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageGreaterThan(String value) {
            addCriterion("isshammarriage >", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageGreaterThanOrEqualTo(String value) {
            addCriterion("isshammarriage >=", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageLessThan(String value) {
            addCriterion("isshammarriage <", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageLessThanOrEqualTo(String value) {
            addCriterion("isshammarriage <=", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageLike(String value) {
            addCriterion("isshammarriage like", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageNotLike(String value) {
            addCriterion("isshammarriage not like", value, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageIn(List<String> values) {
            addCriterion("isshammarriage in", values, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageNotIn(List<String> values) {
            addCriterion("isshammarriage not in", values, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageBetween(String value1, String value2) {
            addCriterion("isshammarriage between", value1, value2, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriageNotBetween(String value1, String value2) {
            addCriterion("isshammarriage not between", value1, value2, "isshammarriage");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesIsNull() {
            addCriterion("isshammarriagenotes is null");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesIsNotNull() {
            addCriterion("isshammarriagenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesEqualTo(String value) {
            addCriterion("isshammarriagenotes =", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesNotEqualTo(String value) {
            addCriterion("isshammarriagenotes <>", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesGreaterThan(String value) {
            addCriterion("isshammarriagenotes >", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesGreaterThanOrEqualTo(String value) {
            addCriterion("isshammarriagenotes >=", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesLessThan(String value) {
            addCriterion("isshammarriagenotes <", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesLessThanOrEqualTo(String value) {
            addCriterion("isshammarriagenotes <=", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesLike(String value) {
            addCriterion("isshammarriagenotes like", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesNotLike(String value) {
            addCriterion("isshammarriagenotes not like", value, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesIn(List<String> values) {
            addCriterion("isshammarriagenotes in", values, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesNotIn(List<String> values) {
            addCriterion("isshammarriagenotes not in", values, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesBetween(String value1, String value2) {
            addCriterion("isshammarriagenotes between", value1, value2, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsshammarriagenotesNotBetween(String value1, String value2) {
            addCriterion("isshammarriagenotes not between", value1, value2, "isshammarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageIsNull() {
            addCriterion("isdubiousmarriage is null");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageIsNotNull() {
            addCriterion("isdubiousmarriage is not null");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageEqualTo(String value) {
            addCriterion("isdubiousmarriage =", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageNotEqualTo(String value) {
            addCriterion("isdubiousmarriage <>", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageGreaterThan(String value) {
            addCriterion("isdubiousmarriage >", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageGreaterThanOrEqualTo(String value) {
            addCriterion("isdubiousmarriage >=", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageLessThan(String value) {
            addCriterion("isdubiousmarriage <", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageLessThanOrEqualTo(String value) {
            addCriterion("isdubiousmarriage <=", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageLike(String value) {
            addCriterion("isdubiousmarriage like", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageNotLike(String value) {
            addCriterion("isdubiousmarriage not like", value, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageIn(List<String> values) {
            addCriterion("isdubiousmarriage in", values, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageNotIn(List<String> values) {
            addCriterion("isdubiousmarriage not in", values, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageBetween(String value1, String value2) {
            addCriterion("isdubiousmarriage between", value1, value2, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriageNotBetween(String value1, String value2) {
            addCriterion("isdubiousmarriage not between", value1, value2, "isdubiousmarriage");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesIsNull() {
            addCriterion("isdubiousmarriagenotes is null");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesIsNotNull() {
            addCriterion("isdubiousmarriagenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesEqualTo(String value) {
            addCriterion("isdubiousmarriagenotes =", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesNotEqualTo(String value) {
            addCriterion("isdubiousmarriagenotes <>", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesGreaterThan(String value) {
            addCriterion("isdubiousmarriagenotes >", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesGreaterThanOrEqualTo(String value) {
            addCriterion("isdubiousmarriagenotes >=", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesLessThan(String value) {
            addCriterion("isdubiousmarriagenotes <", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesLessThanOrEqualTo(String value) {
            addCriterion("isdubiousmarriagenotes <=", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesLike(String value) {
            addCriterion("isdubiousmarriagenotes like", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesNotLike(String value) {
            addCriterion("isdubiousmarriagenotes not like", value, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesIn(List<String> values) {
            addCriterion("isdubiousmarriagenotes in", values, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesNotIn(List<String> values) {
            addCriterion("isdubiousmarriagenotes not in", values, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesBetween(String value1, String value2) {
            addCriterion("isdubiousmarriagenotes between", value1, value2, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andIsdubiousmarriagenotesNotBetween(String value1, String value2) {
            addCriterion("isdubiousmarriagenotes not between", value1, value2, "isdubiousmarriagenotes");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueIsNull() {
            addCriterion("reasonofoverdue is null");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueIsNotNull() {
            addCriterion("reasonofoverdue is not null");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueEqualTo(String value) {
            addCriterion("reasonofoverdue =", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueNotEqualTo(String value) {
            addCriterion("reasonofoverdue <>", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueGreaterThan(String value) {
            addCriterion("reasonofoverdue >", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueGreaterThanOrEqualTo(String value) {
            addCriterion("reasonofoverdue >=", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueLessThan(String value) {
            addCriterion("reasonofoverdue <", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueLessThanOrEqualTo(String value) {
            addCriterion("reasonofoverdue <=", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueLike(String value) {
            addCriterion("reasonofoverdue like", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueNotLike(String value) {
            addCriterion("reasonofoverdue not like", value, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueIn(List<String> values) {
            addCriterion("reasonofoverdue in", values, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueNotIn(List<String> values) {
            addCriterion("reasonofoverdue not in", values, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueBetween(String value1, String value2) {
            addCriterion("reasonofoverdue between", value1, value2, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofoverdueNotBetween(String value1, String value2) {
            addCriterion("reasonofoverdue not between", value1, value2, "reasonofoverdue");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonIsNull() {
            addCriterion("badinforeason is null");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonIsNotNull() {
            addCriterion("badinforeason is not null");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonEqualTo(String value) {
            addCriterion("badinforeason =", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonNotEqualTo(String value) {
            addCriterion("badinforeason <>", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonGreaterThan(String value) {
            addCriterion("badinforeason >", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonGreaterThanOrEqualTo(String value) {
            addCriterion("badinforeason >=", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonLessThan(String value) {
            addCriterion("badinforeason <", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonLessThanOrEqualTo(String value) {
            addCriterion("badinforeason <=", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonLike(String value) {
            addCriterion("badinforeason like", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonNotLike(String value) {
            addCriterion("badinforeason not like", value, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonIn(List<String> values) {
            addCriterion("badinforeason in", values, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonNotIn(List<String> values) {
            addCriterion("badinforeason not in", values, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonBetween(String value1, String value2) {
            addCriterion("badinforeason between", value1, value2, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinforeasonNotBetween(String value1, String value2) {
            addCriterion("badinforeason not between", value1, value2, "badinforeason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonIsNull() {
            addCriterion("badinfocreditreason is null");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonIsNotNull() {
            addCriterion("badinfocreditreason is not null");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonEqualTo(String value) {
            addCriterion("badinfocreditreason =", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonNotEqualTo(String value) {
            addCriterion("badinfocreditreason <>", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonGreaterThan(String value) {
            addCriterion("badinfocreditreason >", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonGreaterThanOrEqualTo(String value) {
            addCriterion("badinfocreditreason >=", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonLessThan(String value) {
            addCriterion("badinfocreditreason <", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonLessThanOrEqualTo(String value) {
            addCriterion("badinfocreditreason <=", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonLike(String value) {
            addCriterion("badinfocreditreason like", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonNotLike(String value) {
            addCriterion("badinfocreditreason not like", value, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonIn(List<String> values) {
            addCriterion("badinfocreditreason in", values, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonNotIn(List<String> values) {
            addCriterion("badinfocreditreason not in", values, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonBetween(String value1, String value2) {
            addCriterion("badinfocreditreason between", value1, value2, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andBadinfocreditreasonNotBetween(String value1, String value2) {
            addCriterion("badinfocreditreason not between", value1, value2, "badinfocreditreason");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueIsNull() {
            addCriterion("reasonofcreditoverdue is null");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueIsNotNull() {
            addCriterion("reasonofcreditoverdue is not null");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueEqualTo(String value) {
            addCriterion("reasonofcreditoverdue =", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueNotEqualTo(String value) {
            addCriterion("reasonofcreditoverdue <>", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueGreaterThan(String value) {
            addCriterion("reasonofcreditoverdue >", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueGreaterThanOrEqualTo(String value) {
            addCriterion("reasonofcreditoverdue >=", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueLessThan(String value) {
            addCriterion("reasonofcreditoverdue <", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueLessThanOrEqualTo(String value) {
            addCriterion("reasonofcreditoverdue <=", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueLike(String value) {
            addCriterion("reasonofcreditoverdue like", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueNotLike(String value) {
            addCriterion("reasonofcreditoverdue not like", value, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueIn(List<String> values) {
            addCriterion("reasonofcreditoverdue in", values, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueNotIn(List<String> values) {
            addCriterion("reasonofcreditoverdue not in", values, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueBetween(String value1, String value2) {
            addCriterion("reasonofcreditoverdue between", value1, value2, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andReasonofcreditoverdueNotBetween(String value1, String value2) {
            addCriterion("reasonofcreditoverdue not between", value1, value2, "reasonofcreditoverdue");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesIsNull() {
            addCriterion("isunableprovennotes is null");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesIsNotNull() {
            addCriterion("isunableprovennotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesEqualTo(String value) {
            addCriterion("isunableprovennotes =", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesNotEqualTo(String value) {
            addCriterion("isunableprovennotes <>", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesGreaterThan(String value) {
            addCriterion("isunableprovennotes >", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesGreaterThanOrEqualTo(String value) {
            addCriterion("isunableprovennotes >=", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesLessThan(String value) {
            addCriterion("isunableprovennotes <", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesLessThanOrEqualTo(String value) {
            addCriterion("isunableprovennotes <=", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesLike(String value) {
            addCriterion("isunableprovennotes like", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesNotLike(String value) {
            addCriterion("isunableprovennotes not like", value, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesIn(List<String> values) {
            addCriterion("isunableprovennotes in", values, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesNotIn(List<String> values) {
            addCriterion("isunableprovennotes not in", values, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesBetween(String value1, String value2) {
            addCriterion("isunableprovennotes between", value1, value2, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovennotesNotBetween(String value1, String value2) {
            addCriterion("isunableprovennotes not between", value1, value2, "isunableprovennotes");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenIsNull() {
            addCriterion("isunableproven is null");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenIsNotNull() {
            addCriterion("isunableproven is not null");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenEqualTo(String value) {
            addCriterion("isunableproven =", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenNotEqualTo(String value) {
            addCriterion("isunableproven <>", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenGreaterThan(String value) {
            addCriterion("isunableproven >", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenGreaterThanOrEqualTo(String value) {
            addCriterion("isunableproven >=", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenLessThan(String value) {
            addCriterion("isunableproven <", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenLessThanOrEqualTo(String value) {
            addCriterion("isunableproven <=", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenLike(String value) {
            addCriterion("isunableproven like", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenNotLike(String value) {
            addCriterion("isunableproven not like", value, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenIn(List<String> values) {
            addCriterion("isunableproven in", values, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenNotIn(List<String> values) {
            addCriterion("isunableproven not in", values, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenBetween(String value1, String value2) {
            addCriterion("isunableproven between", value1, value2, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsunableprovenNotBetween(String value1, String value2) {
            addCriterion("isunableproven not between", value1, value2, "isunableproven");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesIsNull() {
            addCriterion("isfalsecasenotes is null");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesIsNotNull() {
            addCriterion("isfalsecasenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesEqualTo(String value) {
            addCriterion("isfalsecasenotes =", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesNotEqualTo(String value) {
            addCriterion("isfalsecasenotes <>", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesGreaterThan(String value) {
            addCriterion("isfalsecasenotes >", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesGreaterThanOrEqualTo(String value) {
            addCriterion("isfalsecasenotes >=", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesLessThan(String value) {
            addCriterion("isfalsecasenotes <", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesLessThanOrEqualTo(String value) {
            addCriterion("isfalsecasenotes <=", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesLike(String value) {
            addCriterion("isfalsecasenotes like", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesNotLike(String value) {
            addCriterion("isfalsecasenotes not like", value, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesIn(List<String> values) {
            addCriterion("isfalsecasenotes in", values, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesNotIn(List<String> values) {
            addCriterion("isfalsecasenotes not in", values, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesBetween(String value1, String value2) {
            addCriterion("isfalsecasenotes between", value1, value2, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecasenotesNotBetween(String value1, String value2) {
            addCriterion("isfalsecasenotes not between", value1, value2, "isfalsecasenotes");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseIsNull() {
            addCriterion("isfalsecase is null");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseIsNotNull() {
            addCriterion("isfalsecase is not null");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseEqualTo(String value) {
            addCriterion("isfalsecase =", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseNotEqualTo(String value) {
            addCriterion("isfalsecase <>", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseGreaterThan(String value) {
            addCriterion("isfalsecase >", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseGreaterThanOrEqualTo(String value) {
            addCriterion("isfalsecase >=", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseLessThan(String value) {
            addCriterion("isfalsecase <", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseLessThanOrEqualTo(String value) {
            addCriterion("isfalsecase <=", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseLike(String value) {
            addCriterion("isfalsecase like", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseNotLike(String value) {
            addCriterion("isfalsecase not like", value, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseIn(List<String> values) {
            addCriterion("isfalsecase in", values, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseNotIn(List<String> values) {
            addCriterion("isfalsecase not in", values, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseBetween(String value1, String value2) {
            addCriterion("isfalsecase between", value1, value2, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsfalsecaseNotBetween(String value1, String value2) {
            addCriterion("isfalsecase not between", value1, value2, "isfalsecase");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesIsNull() {
            addCriterion("isunfulfilleddebtnotes is null");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesIsNotNull() {
            addCriterion("isunfulfilleddebtnotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesEqualTo(String value) {
            addCriterion("isunfulfilleddebtnotes =", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesNotEqualTo(String value) {
            addCriterion("isunfulfilleddebtnotes <>", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesGreaterThan(String value) {
            addCriterion("isunfulfilleddebtnotes >", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesGreaterThanOrEqualTo(String value) {
            addCriterion("isunfulfilleddebtnotes >=", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesLessThan(String value) {
            addCriterion("isunfulfilleddebtnotes <", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesLessThanOrEqualTo(String value) {
            addCriterion("isunfulfilleddebtnotes <=", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesLike(String value) {
            addCriterion("isunfulfilleddebtnotes like", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesNotLike(String value) {
            addCriterion("isunfulfilleddebtnotes not like", value, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesIn(List<String> values) {
            addCriterion("isunfulfilleddebtnotes in", values, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesNotIn(List<String> values) {
            addCriterion("isunfulfilleddebtnotes not in", values, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesBetween(String value1, String value2) {
            addCriterion("isunfulfilleddebtnotes between", value1, value2, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtnotesNotBetween(String value1, String value2) {
            addCriterion("isunfulfilleddebtnotes not between", value1, value2, "isunfulfilleddebtnotes");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtIsNull() {
            addCriterion("isunfulfilleddebt is null");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtIsNotNull() {
            addCriterion("isunfulfilleddebt is not null");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtEqualTo(String value) {
            addCriterion("isunfulfilleddebt =", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtNotEqualTo(String value) {
            addCriterion("isunfulfilleddebt <>", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtGreaterThan(String value) {
            addCriterion("isunfulfilleddebt >", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtGreaterThanOrEqualTo(String value) {
            addCriterion("isunfulfilleddebt >=", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtLessThan(String value) {
            addCriterion("isunfulfilleddebt <", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtLessThanOrEqualTo(String value) {
            addCriterion("isunfulfilleddebt <=", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtLike(String value) {
            addCriterion("isunfulfilleddebt like", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtNotLike(String value) {
            addCriterion("isunfulfilleddebt not like", value, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtIn(List<String> values) {
            addCriterion("isunfulfilleddebt in", values, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtNotIn(List<String> values) {
            addCriterion("isunfulfilleddebt not in", values, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtBetween(String value1, String value2) {
            addCriterion("isunfulfilleddebt between", value1, value2, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsunfulfilleddebtNotBetween(String value1, String value2) {
            addCriterion("isunfulfilleddebt not between", value1, value2, "isunfulfilleddebt");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesIsNull() {
            addCriterion("isenforcedlitigationnotes is null");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesIsNotNull() {
            addCriterion("isenforcedlitigationnotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesEqualTo(String value) {
            addCriterion("isenforcedlitigationnotes =", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesNotEqualTo(String value) {
            addCriterion("isenforcedlitigationnotes <>", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesGreaterThan(String value) {
            addCriterion("isenforcedlitigationnotes >", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesGreaterThanOrEqualTo(String value) {
            addCriterion("isenforcedlitigationnotes >=", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesLessThan(String value) {
            addCriterion("isenforcedlitigationnotes <", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesLessThanOrEqualTo(String value) {
            addCriterion("isenforcedlitigationnotes <=", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesLike(String value) {
            addCriterion("isenforcedlitigationnotes like", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesNotLike(String value) {
            addCriterion("isenforcedlitigationnotes not like", value, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesIn(List<String> values) {
            addCriterion("isenforcedlitigationnotes in", values, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesNotIn(List<String> values) {
            addCriterion("isenforcedlitigationnotes not in", values, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesBetween(String value1, String value2) {
            addCriterion("isenforcedlitigationnotes between", value1, value2, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationnotesNotBetween(String value1, String value2) {
            addCriterion("isenforcedlitigationnotes not between", value1, value2, "isenforcedlitigationnotes");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationIsNull() {
            addCriterion("isenforcedlitigation is null");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationIsNotNull() {
            addCriterion("isenforcedlitigation is not null");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationEqualTo(String value) {
            addCriterion("isenforcedlitigation =", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationNotEqualTo(String value) {
            addCriterion("isenforcedlitigation <>", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationGreaterThan(String value) {
            addCriterion("isenforcedlitigation >", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationGreaterThanOrEqualTo(String value) {
            addCriterion("isenforcedlitigation >=", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationLessThan(String value) {
            addCriterion("isenforcedlitigation <", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationLessThanOrEqualTo(String value) {
            addCriterion("isenforcedlitigation <=", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationLike(String value) {
            addCriterion("isenforcedlitigation like", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationNotLike(String value) {
            addCriterion("isenforcedlitigation not like", value, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationIn(List<String> values) {
            addCriterion("isenforcedlitigation in", values, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationNotIn(List<String> values) {
            addCriterion("isenforcedlitigation not in", values, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationBetween(String value1, String value2) {
            addCriterion("isenforcedlitigation between", value1, value2, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIsenforcedlitigationNotBetween(String value1, String value2) {
            addCriterion("isenforcedlitigation not between", value1, value2, "isenforcedlitigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteIsNull() {
            addCriterion("iiscomcreditigationnote is null");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteIsNotNull() {
            addCriterion("iiscomcreditigationnote is not null");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteEqualTo(String value) {
            addCriterion("iiscomcreditigationnote =", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteNotEqualTo(String value) {
            addCriterion("iiscomcreditigationnote <>", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteGreaterThan(String value) {
            addCriterion("iiscomcreditigationnote >", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteGreaterThanOrEqualTo(String value) {
            addCriterion("iiscomcreditigationnote >=", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteLessThan(String value) {
            addCriterion("iiscomcreditigationnote <", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteLessThanOrEqualTo(String value) {
            addCriterion("iiscomcreditigationnote <=", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteLike(String value) {
            addCriterion("iiscomcreditigationnote like", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteNotLike(String value) {
            addCriterion("iiscomcreditigationnote not like", value, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteIn(List<String> values) {
            addCriterion("iiscomcreditigationnote in", values, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteNotIn(List<String> values) {
            addCriterion("iiscomcreditigationnote not in", values, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteBetween(String value1, String value2) {
            addCriterion("iiscomcreditigationnote between", value1, value2, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationnoteNotBetween(String value1, String value2) {
            addCriterion("iiscomcreditigationnote not between", value1, value2, "iiscomcreditigationnote");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationIsNull() {
            addCriterion("iiscomcreditigation is null");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationIsNotNull() {
            addCriterion("iiscomcreditigation is not null");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationEqualTo(String value) {
            addCriterion("iiscomcreditigation =", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationNotEqualTo(String value) {
            addCriterion("iiscomcreditigation <>", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationGreaterThan(String value) {
            addCriterion("iiscomcreditigation >", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationGreaterThanOrEqualTo(String value) {
            addCriterion("iiscomcreditigation >=", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationLessThan(String value) {
            addCriterion("iiscomcreditigation <", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationLessThanOrEqualTo(String value) {
            addCriterion("iiscomcreditigation <=", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationLike(String value) {
            addCriterion("iiscomcreditigation like", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationNotLike(String value) {
            addCriterion("iiscomcreditigation not like", value, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationIn(List<String> values) {
            addCriterion("iiscomcreditigation in", values, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationNotIn(List<String> values) {
            addCriterion("iiscomcreditigation not in", values, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationBetween(String value1, String value2) {
            addCriterion("iiscomcreditigation between", value1, value2, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIiscomcreditigationNotBetween(String value1, String value2) {
            addCriterion("iiscomcreditigation not between", value1, value2, "iiscomcreditigation");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesIsNull() {
            addCriterion("iskeepoutjobnotes is null");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesIsNotNull() {
            addCriterion("iskeepoutjobnotes is not null");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesEqualTo(String value) {
            addCriterion("iskeepoutjobnotes =", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesNotEqualTo(String value) {
            addCriterion("iskeepoutjobnotes <>", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesGreaterThan(String value) {
            addCriterion("iskeepoutjobnotes >", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesGreaterThanOrEqualTo(String value) {
            addCriterion("iskeepoutjobnotes >=", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesLessThan(String value) {
            addCriterion("iskeepoutjobnotes <", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesLessThanOrEqualTo(String value) {
            addCriterion("iskeepoutjobnotes <=", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesLike(String value) {
            addCriterion("iskeepoutjobnotes like", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesNotLike(String value) {
            addCriterion("iskeepoutjobnotes not like", value, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesIn(List<String> values) {
            addCriterion("iskeepoutjobnotes in", values, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesNotIn(List<String> values) {
            addCriterion("iskeepoutjobnotes not in", values, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesBetween(String value1, String value2) {
            addCriterion("iskeepoutjobnotes between", value1, value2, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobnotesNotBetween(String value1, String value2) {
            addCriterion("iskeepoutjobnotes not between", value1, value2, "iskeepoutjobnotes");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobIsNull() {
            addCriterion("iskeepoutjob is null");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobIsNotNull() {
            addCriterion("iskeepoutjob is not null");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobEqualTo(String value) {
            addCriterion("iskeepoutjob =", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobNotEqualTo(String value) {
            addCriterion("iskeepoutjob <>", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobGreaterThan(String value) {
            addCriterion("iskeepoutjob >", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobGreaterThanOrEqualTo(String value) {
            addCriterion("iskeepoutjob >=", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobLessThan(String value) {
            addCriterion("iskeepoutjob <", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobLessThanOrEqualTo(String value) {
            addCriterion("iskeepoutjob <=", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobLike(String value) {
            addCriterion("iskeepoutjob like", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobNotLike(String value) {
            addCriterion("iskeepoutjob not like", value, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobIn(List<String> values) {
            addCriterion("iskeepoutjob in", values, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobNotIn(List<String> values) {
            addCriterion("iskeepoutjob not in", values, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobBetween(String value1, String value2) {
            addCriterion("iskeepoutjob between", value1, value2, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIskeepoutjobNotBetween(String value1, String value2) {
            addCriterion("iskeepoutjob not between", value1, value2, "iskeepoutjob");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesIsNull() {
            addCriterion("isprudentindustrynotes is null");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesIsNotNull() {
            addCriterion("isprudentindustrynotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesEqualTo(String value) {
            addCriterion("isprudentindustrynotes =", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesNotEqualTo(String value) {
            addCriterion("isprudentindustrynotes <>", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesGreaterThan(String value) {
            addCriterion("isprudentindustrynotes >", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesGreaterThanOrEqualTo(String value) {
            addCriterion("isprudentindustrynotes >=", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesLessThan(String value) {
            addCriterion("isprudentindustrynotes <", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesLessThanOrEqualTo(String value) {
            addCriterion("isprudentindustrynotes <=", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesLike(String value) {
            addCriterion("isprudentindustrynotes like", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesNotLike(String value) {
            addCriterion("isprudentindustrynotes not like", value, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesIn(List<String> values) {
            addCriterion("isprudentindustrynotes in", values, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesNotIn(List<String> values) {
            addCriterion("isprudentindustrynotes not in", values, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesBetween(String value1, String value2) {
            addCriterion("isprudentindustrynotes between", value1, value2, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustrynotesNotBetween(String value1, String value2) {
            addCriterion("isprudentindustrynotes not between", value1, value2, "isprudentindustrynotes");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryIsNull() {
            addCriterion("isprudentindustry is null");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryIsNotNull() {
            addCriterion("isprudentindustry is not null");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryEqualTo(String value) {
            addCriterion("isprudentindustry =", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryNotEqualTo(String value) {
            addCriterion("isprudentindustry <>", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryGreaterThan(String value) {
            addCriterion("isprudentindustry >", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryGreaterThanOrEqualTo(String value) {
            addCriterion("isprudentindustry >=", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryLessThan(String value) {
            addCriterion("isprudentindustry <", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryLessThanOrEqualTo(String value) {
            addCriterion("isprudentindustry <=", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryLike(String value) {
            addCriterion("isprudentindustry like", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryNotLike(String value) {
            addCriterion("isprudentindustry not like", value, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryIn(List<String> values) {
            addCriterion("isprudentindustry in", values, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryNotIn(List<String> values) {
            addCriterion("isprudentindustry not in", values, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryBetween(String value1, String value2) {
            addCriterion("isprudentindustry between", value1, value2, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIsprudentindustryNotBetween(String value1, String value2) {
            addCriterion("isprudentindustry not between", value1, value2, "isprudentindustry");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesIsNull() {
            addCriterion("ishignriskbehaviornotes is null");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesIsNotNull() {
            addCriterion("ishignriskbehaviornotes is not null");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesEqualTo(String value) {
            addCriterion("ishignriskbehaviornotes =", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesNotEqualTo(String value) {
            addCriterion("ishignriskbehaviornotes <>", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesGreaterThan(String value) {
            addCriterion("ishignriskbehaviornotes >", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesGreaterThanOrEqualTo(String value) {
            addCriterion("ishignriskbehaviornotes >=", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesLessThan(String value) {
            addCriterion("ishignriskbehaviornotes <", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesLessThanOrEqualTo(String value) {
            addCriterion("ishignriskbehaviornotes <=", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesLike(String value) {
            addCriterion("ishignriskbehaviornotes like", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesNotLike(String value) {
            addCriterion("ishignriskbehaviornotes not like", value, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesIn(List<String> values) {
            addCriterion("ishignriskbehaviornotes in", values, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesNotIn(List<String> values) {
            addCriterion("ishignriskbehaviornotes not in", values, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesBetween(String value1, String value2) {
            addCriterion("ishignriskbehaviornotes between", value1, value2, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviornotesNotBetween(String value1, String value2) {
            addCriterion("ishignriskbehaviornotes not between", value1, value2, "ishignriskbehaviornotes");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorIsNull() {
            addCriterion("ishignriskbehavior is null");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorIsNotNull() {
            addCriterion("ishignriskbehavior is not null");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorEqualTo(String value) {
            addCriterion("ishignriskbehavior =", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorNotEqualTo(String value) {
            addCriterion("ishignriskbehavior <>", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorGreaterThan(String value) {
            addCriterion("ishignriskbehavior >", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorGreaterThanOrEqualTo(String value) {
            addCriterion("ishignriskbehavior >=", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorLessThan(String value) {
            addCriterion("ishignriskbehavior <", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorLessThanOrEqualTo(String value) {
            addCriterion("ishignriskbehavior <=", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorLike(String value) {
            addCriterion("ishignriskbehavior like", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorNotLike(String value) {
            addCriterion("ishignriskbehavior not like", value, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorIn(List<String> values) {
            addCriterion("ishignriskbehavior in", values, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorNotIn(List<String> values) {
            addCriterion("ishignriskbehavior not in", values, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorBetween(String value1, String value2) {
            addCriterion("ishignriskbehavior between", value1, value2, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andIshignriskbehaviorNotBetween(String value1, String value2) {
            addCriterion("ishignriskbehavior not between", value1, value2, "ishignriskbehavior");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesIsNull() {
            addCriterion("specialnotes is null");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesIsNotNull() {
            addCriterion("specialnotes is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesEqualTo(String value) {
            addCriterion("specialnotes =", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesNotEqualTo(String value) {
            addCriterion("specialnotes <>", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesGreaterThan(String value) {
            addCriterion("specialnotes >", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesGreaterThanOrEqualTo(String value) {
            addCriterion("specialnotes >=", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesLessThan(String value) {
            addCriterion("specialnotes <", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesLessThanOrEqualTo(String value) {
            addCriterion("specialnotes <=", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesLike(String value) {
            addCriterion("specialnotes like", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesNotLike(String value) {
            addCriterion("specialnotes not like", value, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesIn(List<String> values) {
            addCriterion("specialnotes in", values, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesNotIn(List<String> values) {
            addCriterion("specialnotes not in", values, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesBetween(String value1, String value2) {
            addCriterion("specialnotes between", value1, value2, "specialnotes");
            return (Criteria) this;
        }

        public Criteria andSpecialnotesNotBetween(String value1, String value2) {
            addCriterion("specialnotes not between", value1, value2, "specialnotes");
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