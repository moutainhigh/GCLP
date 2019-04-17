package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroommortgageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroommortgageExample() {
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

        public Criteria andMortgageidIsNull() {
            addCriterion("mortgageid is null");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNotNull() {
            addCriterion("mortgageid is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageidEqualTo(String value) {
            addCriterion("mortgageid =", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotEqualTo(String value) {
            addCriterion("mortgageid <>", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThan(String value) {
            addCriterion("mortgageid >", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageid >=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThan(String value) {
            addCriterion("mortgageid <", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThanOrEqualTo(String value) {
            addCriterion("mortgageid <=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLike(String value) {
            addCriterion("mortgageid like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotLike(String value) {
            addCriterion("mortgageid not like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIn(List<String> values) {
            addCriterion("mortgageid in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotIn(List<String> values) {
            addCriterion("mortgageid not in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidBetween(String value1, String value2) {
            addCriterion("mortgageid between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotBetween(String value1, String value2) {
            addCriterion("mortgageid not between", value1, value2, "mortgageid");
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

        public Criteria andHousediplomabackflgIsNull() {
            addCriterion("housediplomabackflg is null");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgIsNotNull() {
            addCriterion("housediplomabackflg is not null");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgEqualTo(String value) {
            addCriterion("housediplomabackflg =", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgNotEqualTo(String value) {
            addCriterion("housediplomabackflg <>", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgGreaterThan(String value) {
            addCriterion("housediplomabackflg >", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgGreaterThanOrEqualTo(String value) {
            addCriterion("housediplomabackflg >=", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgLessThan(String value) {
            addCriterion("housediplomabackflg <", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgLessThanOrEqualTo(String value) {
            addCriterion("housediplomabackflg <=", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgLike(String value) {
            addCriterion("housediplomabackflg like", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgNotLike(String value) {
            addCriterion("housediplomabackflg not like", value, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgIn(List<String> values) {
            addCriterion("housediplomabackflg in", values, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgNotIn(List<String> values) {
            addCriterion("housediplomabackflg not in", values, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgBetween(String value1, String value2) {
            addCriterion("housediplomabackflg between", value1, value2, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabackflgNotBetween(String value1, String value2) {
            addCriterion("housediplomabackflg not between", value1, value2, "housediplomabackflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteIsNull() {
            addCriterion("housediplomabacknote is null");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteIsNotNull() {
            addCriterion("housediplomabacknote is not null");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteEqualTo(String value) {
            addCriterion("housediplomabacknote =", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteNotEqualTo(String value) {
            addCriterion("housediplomabacknote <>", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteGreaterThan(String value) {
            addCriterion("housediplomabacknote >", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteGreaterThanOrEqualTo(String value) {
            addCriterion("housediplomabacknote >=", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteLessThan(String value) {
            addCriterion("housediplomabacknote <", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteLessThanOrEqualTo(String value) {
            addCriterion("housediplomabacknote <=", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteLike(String value) {
            addCriterion("housediplomabacknote like", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteNotLike(String value) {
            addCriterion("housediplomabacknote not like", value, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteIn(List<String> values) {
            addCriterion("housediplomabacknote in", values, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteNotIn(List<String> values) {
            addCriterion("housediplomabacknote not in", values, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteBetween(String value1, String value2) {
            addCriterion("housediplomabacknote between", value1, value2, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomabacknoteNotBetween(String value1, String value2) {
            addCriterion("housediplomabacknote not between", value1, value2, "housediplomabacknote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgIsNull() {
            addCriterion("housediplomaresultflg is null");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgIsNotNull() {
            addCriterion("housediplomaresultflg is not null");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgEqualTo(String value) {
            addCriterion("housediplomaresultflg =", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgNotEqualTo(String value) {
            addCriterion("housediplomaresultflg <>", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgGreaterThan(String value) {
            addCriterion("housediplomaresultflg >", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgGreaterThanOrEqualTo(String value) {
            addCriterion("housediplomaresultflg >=", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgLessThan(String value) {
            addCriterion("housediplomaresultflg <", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgLessThanOrEqualTo(String value) {
            addCriterion("housediplomaresultflg <=", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgLike(String value) {
            addCriterion("housediplomaresultflg like", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgNotLike(String value) {
            addCriterion("housediplomaresultflg not like", value, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgIn(List<String> values) {
            addCriterion("housediplomaresultflg in", values, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgNotIn(List<String> values) {
            addCriterion("housediplomaresultflg not in", values, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgBetween(String value1, String value2) {
            addCriterion("housediplomaresultflg between", value1, value2, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultflgNotBetween(String value1, String value2) {
            addCriterion("housediplomaresultflg not between", value1, value2, "housediplomaresultflg");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteIsNull() {
            addCriterion("housediplomaresultnote is null");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteIsNotNull() {
            addCriterion("housediplomaresultnote is not null");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteEqualTo(String value) {
            addCriterion("housediplomaresultnote =", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteNotEqualTo(String value) {
            addCriterion("housediplomaresultnote <>", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteGreaterThan(String value) {
            addCriterion("housediplomaresultnote >", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteGreaterThanOrEqualTo(String value) {
            addCriterion("housediplomaresultnote >=", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteLessThan(String value) {
            addCriterion("housediplomaresultnote <", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteLessThanOrEqualTo(String value) {
            addCriterion("housediplomaresultnote <=", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteLike(String value) {
            addCriterion("housediplomaresultnote like", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteNotLike(String value) {
            addCriterion("housediplomaresultnote not like", value, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteIn(List<String> values) {
            addCriterion("housediplomaresultnote in", values, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteNotIn(List<String> values) {
            addCriterion("housediplomaresultnote not in", values, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteBetween(String value1, String value2) {
            addCriterion("housediplomaresultnote between", value1, value2, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andHousediplomaresultnoteNotBetween(String value1, String value2) {
            addCriterion("housediplomaresultnote not between", value1, value2, "housediplomaresultnote");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgIsNull() {
            addCriterion("diplomabackflg is null");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgIsNotNull() {
            addCriterion("diplomabackflg is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgEqualTo(String value) {
            addCriterion("diplomabackflg =", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgNotEqualTo(String value) {
            addCriterion("diplomabackflg <>", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgGreaterThan(String value) {
            addCriterion("diplomabackflg >", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgGreaterThanOrEqualTo(String value) {
            addCriterion("diplomabackflg >=", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgLessThan(String value) {
            addCriterion("diplomabackflg <", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgLessThanOrEqualTo(String value) {
            addCriterion("diplomabackflg <=", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgLike(String value) {
            addCriterion("diplomabackflg like", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgNotLike(String value) {
            addCriterion("diplomabackflg not like", value, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgIn(List<String> values) {
            addCriterion("diplomabackflg in", values, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgNotIn(List<String> values) {
            addCriterion("diplomabackflg not in", values, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgBetween(String value1, String value2) {
            addCriterion("diplomabackflg between", value1, value2, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabackflgNotBetween(String value1, String value2) {
            addCriterion("diplomabackflg not between", value1, value2, "diplomabackflg");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteIsNull() {
            addCriterion("diplomabacknote is null");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteIsNotNull() {
            addCriterion("diplomabacknote is not null");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteEqualTo(String value) {
            addCriterion("diplomabacknote =", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteNotEqualTo(String value) {
            addCriterion("diplomabacknote <>", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteGreaterThan(String value) {
            addCriterion("diplomabacknote >", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteGreaterThanOrEqualTo(String value) {
            addCriterion("diplomabacknote >=", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteLessThan(String value) {
            addCriterion("diplomabacknote <", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteLessThanOrEqualTo(String value) {
            addCriterion("diplomabacknote <=", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteLike(String value) {
            addCriterion("diplomabacknote like", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteNotLike(String value) {
            addCriterion("diplomabacknote not like", value, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteIn(List<String> values) {
            addCriterion("diplomabacknote in", values, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteNotIn(List<String> values) {
            addCriterion("diplomabacknote not in", values, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteBetween(String value1, String value2) {
            addCriterion("diplomabacknote between", value1, value2, "diplomabacknote");
            return (Criteria) this;
        }

        public Criteria andDiplomabacknoteNotBetween(String value1, String value2) {
            addCriterion("diplomabacknote not between", value1, value2, "diplomabacknote");
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