package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChanapprovalformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChanapprovalformExample() {
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

        public Criteria andSuggestusetermIsNull() {
            addCriterion("suggestuseterm is null");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermIsNotNull() {
            addCriterion("suggestuseterm is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermEqualTo(String value) {
            addCriterion("suggestuseterm =", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermNotEqualTo(String value) {
            addCriterion("suggestuseterm <>", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermGreaterThan(String value) {
            addCriterion("suggestuseterm >", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermGreaterThanOrEqualTo(String value) {
            addCriterion("suggestuseterm >=", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermLessThan(String value) {
            addCriterion("suggestuseterm <", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermLessThanOrEqualTo(String value) {
            addCriterion("suggestuseterm <=", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermLike(String value) {
            addCriterion("suggestuseterm like", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermNotLike(String value) {
            addCriterion("suggestuseterm not like", value, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermIn(List<String> values) {
            addCriterion("suggestuseterm in", values, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermNotIn(List<String> values) {
            addCriterion("suggestuseterm not in", values, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermBetween(String value1, String value2) {
            addCriterion("suggestuseterm between", value1, value2, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestusetermNotBetween(String value1, String value2) {
            addCriterion("suggestuseterm not between", value1, value2, "suggestuseterm");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountIsNull() {
            addCriterion("suggestuseamount is null");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountIsNotNull() {
            addCriterion("suggestuseamount is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountEqualTo(BigDecimal value) {
            addCriterion("suggestuseamount =", value, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountNotEqualTo(BigDecimal value) {
            addCriterion("suggestuseamount <>", value, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountGreaterThan(BigDecimal value) {
            addCriterion("suggestuseamount >", value, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestuseamount >=", value, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountLessThan(BigDecimal value) {
            addCriterion("suggestuseamount <", value, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestuseamount <=", value, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountIn(List<BigDecimal> values) {
            addCriterion("suggestuseamount in", values, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountNotIn(List<BigDecimal> values) {
            addCriterion("suggestuseamount not in", values, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestuseamount between", value1, value2, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andSuggestuseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestuseamount not between", value1, value2, "suggestuseamount");
            return (Criteria) this;
        }

        public Criteria andFacesignflgIsNull() {
            addCriterion("facesignflg is null");
            return (Criteria) this;
        }

        public Criteria andFacesignflgIsNotNull() {
            addCriterion("facesignflg is not null");
            return (Criteria) this;
        }

        public Criteria andFacesignflgEqualTo(String value) {
            addCriterion("facesignflg =", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotEqualTo(String value) {
            addCriterion("facesignflg <>", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgGreaterThan(String value) {
            addCriterion("facesignflg >", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgGreaterThanOrEqualTo(String value) {
            addCriterion("facesignflg >=", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgLessThan(String value) {
            addCriterion("facesignflg <", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgLessThanOrEqualTo(String value) {
            addCriterion("facesignflg <=", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgLike(String value) {
            addCriterion("facesignflg like", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotLike(String value) {
            addCriterion("facesignflg not like", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgIn(List<String> values) {
            addCriterion("facesignflg in", values, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotIn(List<String> values) {
            addCriterion("facesignflg not in", values, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgBetween(String value1, String value2) {
            addCriterion("facesignflg between", value1, value2, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotBetween(String value1, String value2) {
            addCriterion("facesignflg not between", value1, value2, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgIsNull() {
            addCriterion("agreeexpectloanflg is null");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgIsNotNull() {
            addCriterion("agreeexpectloanflg is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgEqualTo(String value) {
            addCriterion("agreeexpectloanflg =", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgNotEqualTo(String value) {
            addCriterion("agreeexpectloanflg <>", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgGreaterThan(String value) {
            addCriterion("agreeexpectloanflg >", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgGreaterThanOrEqualTo(String value) {
            addCriterion("agreeexpectloanflg >=", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgLessThan(String value) {
            addCriterion("agreeexpectloanflg <", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgLessThanOrEqualTo(String value) {
            addCriterion("agreeexpectloanflg <=", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgLike(String value) {
            addCriterion("agreeexpectloanflg like", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgNotLike(String value) {
            addCriterion("agreeexpectloanflg not like", value, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgIn(List<String> values) {
            addCriterion("agreeexpectloanflg in", values, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgNotIn(List<String> values) {
            addCriterion("agreeexpectloanflg not in", values, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgBetween(String value1, String value2) {
            addCriterion("agreeexpectloanflg between", value1, value2, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andAgreeexpectloanflgNotBetween(String value1, String value2) {
            addCriterion("agreeexpectloanflg not between", value1, value2, "agreeexpectloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateIsNull() {
            addCriterion("suggestapplyrate is null");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateIsNotNull() {
            addCriterion("suggestapplyrate is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateEqualTo(BigDecimal value) {
            addCriterion("suggestapplyrate =", value, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateNotEqualTo(BigDecimal value) {
            addCriterion("suggestapplyrate <>", value, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateGreaterThan(BigDecimal value) {
            addCriterion("suggestapplyrate >", value, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestapplyrate >=", value, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateLessThan(BigDecimal value) {
            addCriterion("suggestapplyrate <", value, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestapplyrate <=", value, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateIn(List<BigDecimal> values) {
            addCriterion("suggestapplyrate in", values, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateNotIn(List<BigDecimal> values) {
            addCriterion("suggestapplyrate not in", values, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestapplyrate between", value1, value2, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestapplyrate not between", value1, value2, "suggestapplyrate");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelIsNull() {
            addCriterion("suggestleavel is null");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelIsNotNull() {
            addCriterion("suggestleavel is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelEqualTo(String value) {
            addCriterion("suggestleavel =", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelNotEqualTo(String value) {
            addCriterion("suggestleavel <>", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelGreaterThan(String value) {
            addCriterion("suggestleavel >", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelGreaterThanOrEqualTo(String value) {
            addCriterion("suggestleavel >=", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelLessThan(String value) {
            addCriterion("suggestleavel <", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelLessThanOrEqualTo(String value) {
            addCriterion("suggestleavel <=", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelLike(String value) {
            addCriterion("suggestleavel like", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelNotLike(String value) {
            addCriterion("suggestleavel not like", value, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelIn(List<String> values) {
            addCriterion("suggestleavel in", values, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelNotIn(List<String> values) {
            addCriterion("suggestleavel not in", values, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelBetween(String value1, String value2) {
            addCriterion("suggestleavel between", value1, value2, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestleavelNotBetween(String value1, String value2) {
            addCriterion("suggestleavel not between", value1, value2, "suggestleavel");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountIsNull() {
            addCriterion("suggestapplyamount is null");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountIsNotNull() {
            addCriterion("suggestapplyamount is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountEqualTo(BigDecimal value) {
            addCriterion("suggestapplyamount =", value, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountNotEqualTo(BigDecimal value) {
            addCriterion("suggestapplyamount <>", value, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountGreaterThan(BigDecimal value) {
            addCriterion("suggestapplyamount >", value, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestapplyamount >=", value, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountLessThan(BigDecimal value) {
            addCriterion("suggestapplyamount <", value, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestapplyamount <=", value, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountIn(List<BigDecimal> values) {
            addCriterion("suggestapplyamount in", values, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountNotIn(List<BigDecimal> values) {
            addCriterion("suggestapplyamount not in", values, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestapplyamount between", value1, value2, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplyamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestapplyamount not between", value1, value2, "suggestapplyamount");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermIsNull() {
            addCriterion("suggestapplyterm is null");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermIsNotNull() {
            addCriterion("suggestapplyterm is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermEqualTo(String value) {
            addCriterion("suggestapplyterm =", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermNotEqualTo(String value) {
            addCriterion("suggestapplyterm <>", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermGreaterThan(String value) {
            addCriterion("suggestapplyterm >", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermGreaterThanOrEqualTo(String value) {
            addCriterion("suggestapplyterm >=", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermLessThan(String value) {
            addCriterion("suggestapplyterm <", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermLessThanOrEqualTo(String value) {
            addCriterion("suggestapplyterm <=", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermLike(String value) {
            addCriterion("suggestapplyterm like", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermNotLike(String value) {
            addCriterion("suggestapplyterm not like", value, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermIn(List<String> values) {
            addCriterion("suggestapplyterm in", values, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermNotIn(List<String> values) {
            addCriterion("suggestapplyterm not in", values, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermBetween(String value1, String value2) {
            addCriterion("suggestapplyterm between", value1, value2, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestapplytermNotBetween(String value1, String value2) {
            addCriterion("suggestapplyterm not between", value1, value2, "suggestapplyterm");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayIsNull() {
            addCriterion("suggestrepayway is null");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayIsNotNull() {
            addCriterion("suggestrepayway is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayEqualTo(String value) {
            addCriterion("suggestrepayway =", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayNotEqualTo(String value) {
            addCriterion("suggestrepayway <>", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayGreaterThan(String value) {
            addCriterion("suggestrepayway >", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayGreaterThanOrEqualTo(String value) {
            addCriterion("suggestrepayway >=", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayLessThan(String value) {
            addCriterion("suggestrepayway <", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayLessThanOrEqualTo(String value) {
            addCriterion("suggestrepayway <=", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayLike(String value) {
            addCriterion("suggestrepayway like", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayNotLike(String value) {
            addCriterion("suggestrepayway not like", value, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayIn(List<String> values) {
            addCriterion("suggestrepayway in", values, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayNotIn(List<String> values) {
            addCriterion("suggestrepayway not in", values, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayBetween(String value1, String value2) {
            addCriterion("suggestrepayway between", value1, value2, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andSuggestrepaywayNotBetween(String value1, String value2) {
            addCriterion("suggestrepayway not between", value1, value2, "suggestrepayway");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteIsNull() {
            addCriterion("personchecknote is null");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteIsNotNull() {
            addCriterion("personchecknote is not null");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteEqualTo(String value) {
            addCriterion("personchecknote =", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteNotEqualTo(String value) {
            addCriterion("personchecknote <>", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteGreaterThan(String value) {
            addCriterion("personchecknote >", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteGreaterThanOrEqualTo(String value) {
            addCriterion("personchecknote >=", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteLessThan(String value) {
            addCriterion("personchecknote <", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteLessThanOrEqualTo(String value) {
            addCriterion("personchecknote <=", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteLike(String value) {
            addCriterion("personchecknote like", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteNotLike(String value) {
            addCriterion("personchecknote not like", value, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteIn(List<String> values) {
            addCriterion("personchecknote in", values, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteNotIn(List<String> values) {
            addCriterion("personchecknote not in", values, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteBetween(String value1, String value2) {
            addCriterion("personchecknote between", value1, value2, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andPersonchecknoteNotBetween(String value1, String value2) {
            addCriterion("personchecknote not between", value1, value2, "personchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteIsNull() {
            addCriterion("lawchecknote is null");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteIsNotNull() {
            addCriterion("lawchecknote is not null");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteEqualTo(String value) {
            addCriterion("lawchecknote =", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteNotEqualTo(String value) {
            addCriterion("lawchecknote <>", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteGreaterThan(String value) {
            addCriterion("lawchecknote >", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteGreaterThanOrEqualTo(String value) {
            addCriterion("lawchecknote >=", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteLessThan(String value) {
            addCriterion("lawchecknote <", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteLessThanOrEqualTo(String value) {
            addCriterion("lawchecknote <=", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteLike(String value) {
            addCriterion("lawchecknote like", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteNotLike(String value) {
            addCriterion("lawchecknote not like", value, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteIn(List<String> values) {
            addCriterion("lawchecknote in", values, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteNotIn(List<String> values) {
            addCriterion("lawchecknote not in", values, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteBetween(String value1, String value2) {
            addCriterion("lawchecknote between", value1, value2, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawchecknoteNotBetween(String value1, String value2) {
            addCriterion("lawchecknote not between", value1, value2, "lawchecknote");
            return (Criteria) this;
        }

        public Criteria andLawnoteIsNull() {
            addCriterion("lawnote is null");
            return (Criteria) this;
        }

        public Criteria andLawnoteIsNotNull() {
            addCriterion("lawnote is not null");
            return (Criteria) this;
        }

        public Criteria andLawnoteEqualTo(String value) {
            addCriterion("lawnote =", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteNotEqualTo(String value) {
            addCriterion("lawnote <>", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteGreaterThan(String value) {
            addCriterion("lawnote >", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteGreaterThanOrEqualTo(String value) {
            addCriterion("lawnote >=", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteLessThan(String value) {
            addCriterion("lawnote <", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteLessThanOrEqualTo(String value) {
            addCriterion("lawnote <=", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteLike(String value) {
            addCriterion("lawnote like", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteNotLike(String value) {
            addCriterion("lawnote not like", value, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteIn(List<String> values) {
            addCriterion("lawnote in", values, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteNotIn(List<String> values) {
            addCriterion("lawnote not in", values, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteBetween(String value1, String value2) {
            addCriterion("lawnote between", value1, value2, "lawnote");
            return (Criteria) this;
        }

        public Criteria andLawnoteNotBetween(String value1, String value2) {
            addCriterion("lawnote not between", value1, value2, "lawnote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteIsNull() {
            addCriterion("incomenote is null");
            return (Criteria) this;
        }

        public Criteria andIncomenoteIsNotNull() {
            addCriterion("incomenote is not null");
            return (Criteria) this;
        }

        public Criteria andIncomenoteEqualTo(String value) {
            addCriterion("incomenote =", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteNotEqualTo(String value) {
            addCriterion("incomenote <>", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteGreaterThan(String value) {
            addCriterion("incomenote >", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteGreaterThanOrEqualTo(String value) {
            addCriterion("incomenote >=", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteLessThan(String value) {
            addCriterion("incomenote <", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteLessThanOrEqualTo(String value) {
            addCriterion("incomenote <=", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteLike(String value) {
            addCriterion("incomenote like", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteNotLike(String value) {
            addCriterion("incomenote not like", value, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteIn(List<String> values) {
            addCriterion("incomenote in", values, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteNotIn(List<String> values) {
            addCriterion("incomenote not in", values, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteBetween(String value1, String value2) {
            addCriterion("incomenote between", value1, value2, "incomenote");
            return (Criteria) this;
        }

        public Criteria andIncomenoteNotBetween(String value1, String value2) {
            addCriterion("incomenote not between", value1, value2, "incomenote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteIsNull() {
            addCriterion("assetnote is null");
            return (Criteria) this;
        }

        public Criteria andAssetnoteIsNotNull() {
            addCriterion("assetnote is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnoteEqualTo(String value) {
            addCriterion("assetnote =", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteNotEqualTo(String value) {
            addCriterion("assetnote <>", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteGreaterThan(String value) {
            addCriterion("assetnote >", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteGreaterThanOrEqualTo(String value) {
            addCriterion("assetnote >=", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteLessThan(String value) {
            addCriterion("assetnote <", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteLessThanOrEqualTo(String value) {
            addCriterion("assetnote <=", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteLike(String value) {
            addCriterion("assetnote like", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteNotLike(String value) {
            addCriterion("assetnote not like", value, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteIn(List<String> values) {
            addCriterion("assetnote in", values, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteNotIn(List<String> values) {
            addCriterion("assetnote not in", values, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteBetween(String value1, String value2) {
            addCriterion("assetnote between", value1, value2, "assetnote");
            return (Criteria) this;
        }

        public Criteria andAssetnoteNotBetween(String value1, String value2) {
            addCriterion("assetnote not between", value1, value2, "assetnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteIsNull() {
            addCriterion("debtnote is null");
            return (Criteria) this;
        }

        public Criteria andDebtnoteIsNotNull() {
            addCriterion("debtnote is not null");
            return (Criteria) this;
        }

        public Criteria andDebtnoteEqualTo(String value) {
            addCriterion("debtnote =", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteNotEqualTo(String value) {
            addCriterion("debtnote <>", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteGreaterThan(String value) {
            addCriterion("debtnote >", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteGreaterThanOrEqualTo(String value) {
            addCriterion("debtnote >=", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteLessThan(String value) {
            addCriterion("debtnote <", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteLessThanOrEqualTo(String value) {
            addCriterion("debtnote <=", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteLike(String value) {
            addCriterion("debtnote like", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteNotLike(String value) {
            addCriterion("debtnote not like", value, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteIn(List<String> values) {
            addCriterion("debtnote in", values, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteNotIn(List<String> values) {
            addCriterion("debtnote not in", values, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteBetween(String value1, String value2) {
            addCriterion("debtnote between", value1, value2, "debtnote");
            return (Criteria) this;
        }

        public Criteria andDebtnoteNotBetween(String value1, String value2) {
            addCriterion("debtnote not between", value1, value2, "debtnote");
            return (Criteria) this;
        }

        public Criteria andNatationIsNull() {
            addCriterion("natation is null");
            return (Criteria) this;
        }

        public Criteria andNatationIsNotNull() {
            addCriterion("natation is not null");
            return (Criteria) this;
        }

        public Criteria andNatationEqualTo(String value) {
            addCriterion("natation =", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationNotEqualTo(String value) {
            addCriterion("natation <>", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationGreaterThan(String value) {
            addCriterion("natation >", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationGreaterThanOrEqualTo(String value) {
            addCriterion("natation >=", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationLessThan(String value) {
            addCriterion("natation <", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationLessThanOrEqualTo(String value) {
            addCriterion("natation <=", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationLike(String value) {
            addCriterion("natation like", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationNotLike(String value) {
            addCriterion("natation not like", value, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationIn(List<String> values) {
            addCriterion("natation in", values, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationNotIn(List<String> values) {
            addCriterion("natation not in", values, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationBetween(String value1, String value2) {
            addCriterion("natation between", value1, value2, "natation");
            return (Criteria) this;
        }

        public Criteria andNatationNotBetween(String value1, String value2) {
            addCriterion("natation not between", value1, value2, "natation");
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

        public Criteria andSituationnoteIsNull() {
            addCriterion("situationnote is null");
            return (Criteria) this;
        }

        public Criteria andSituationnoteIsNotNull() {
            addCriterion("situationnote is not null");
            return (Criteria) this;
        }

        public Criteria andSituationnoteEqualTo(String value) {
            addCriterion("situationnote =", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteNotEqualTo(String value) {
            addCriterion("situationnote <>", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteGreaterThan(String value) {
            addCriterion("situationnote >", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteGreaterThanOrEqualTo(String value) {
            addCriterion("situationnote >=", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteLessThan(String value) {
            addCriterion("situationnote <", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteLessThanOrEqualTo(String value) {
            addCriterion("situationnote <=", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteLike(String value) {
            addCriterion("situationnote like", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteNotLike(String value) {
            addCriterion("situationnote not like", value, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteIn(List<String> values) {
            addCriterion("situationnote in", values, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteNotIn(List<String> values) {
            addCriterion("situationnote not in", values, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteBetween(String value1, String value2) {
            addCriterion("situationnote between", value1, value2, "situationnote");
            return (Criteria) this;
        }

        public Criteria andSituationnoteNotBetween(String value1, String value2) {
            addCriterion("situationnote not between", value1, value2, "situationnote");
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

        public Criteria andApprovaldateIsNull() {
            addCriterion("approvaldate is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNotNull() {
            addCriterion("approvaldate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateEqualTo(Date value) {
            addCriterion("approvaldate =", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotEqualTo(Date value) {
            addCriterion("approvaldate <>", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThan(Date value) {
            addCriterion("approvaldate >", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("approvaldate >=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThan(Date value) {
            addCriterion("approvaldate <", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThanOrEqualTo(Date value) {
            addCriterion("approvaldate <=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIn(List<Date> values) {
            addCriterion("approvaldate in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotIn(List<Date> values) {
            addCriterion("approvaldate not in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateBetween(Date value1, Date value2) {
            addCriterion("approvaldate between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotBetween(Date value1, Date value2) {
            addCriterion("approvaldate not between", value1, value2, "approvaldate");
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

        public Criteria andTotalmortgageIsNull() {
            addCriterion("totalmortgage is null");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageIsNotNull() {
            addCriterion("totalmortgage is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageEqualTo(BigDecimal value) {
            addCriterion("totalmortgage =", value, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageNotEqualTo(BigDecimal value) {
            addCriterion("totalmortgage <>", value, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageGreaterThan(BigDecimal value) {
            addCriterion("totalmortgage >", value, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalmortgage >=", value, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageLessThan(BigDecimal value) {
            addCriterion("totalmortgage <", value, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalmortgage <=", value, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageIn(List<BigDecimal> values) {
            addCriterion("totalmortgage in", values, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageNotIn(List<BigDecimal> values) {
            addCriterion("totalmortgage not in", values, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalmortgage between", value1, value2, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andTotalmortgageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalmortgage not between", value1, value2, "totalmortgage");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateIsNull() {
            addCriterion("mortgagefeerate is null");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateIsNotNull() {
            addCriterion("mortgagefeerate is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateEqualTo(BigDecimal value) {
            addCriterion("mortgagefeerate =", value, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateNotEqualTo(BigDecimal value) {
            addCriterion("mortgagefeerate <>", value, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateGreaterThan(BigDecimal value) {
            addCriterion("mortgagefeerate >", value, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagefeerate >=", value, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateLessThan(BigDecimal value) {
            addCriterion("mortgagefeerate <", value, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagefeerate <=", value, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateIn(List<BigDecimal> values) {
            addCriterion("mortgagefeerate in", values, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateNotIn(List<BigDecimal> values) {
            addCriterion("mortgagefeerate not in", values, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagefeerate between", value1, value2, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andMortgagefeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagefeerate not between", value1, value2, "mortgagefeerate");
            return (Criteria) this;
        }

        public Criteria andProductremarkIsNull() {
            addCriterion("productremark is null");
            return (Criteria) this;
        }

        public Criteria andProductremarkIsNotNull() {
            addCriterion("productremark is not null");
            return (Criteria) this;
        }

        public Criteria andProductremarkEqualTo(String value) {
            addCriterion("productremark =", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotEqualTo(String value) {
            addCriterion("productremark <>", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkGreaterThan(String value) {
            addCriterion("productremark >", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkGreaterThanOrEqualTo(String value) {
            addCriterion("productremark >=", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkLessThan(String value) {
            addCriterion("productremark <", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkLessThanOrEqualTo(String value) {
            addCriterion("productremark <=", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkLike(String value) {
            addCriterion("productremark like", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotLike(String value) {
            addCriterion("productremark not like", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkIn(List<String> values) {
            addCriterion("productremark in", values, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotIn(List<String> values) {
            addCriterion("productremark not in", values, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkBetween(String value1, String value2) {
            addCriterion("productremark between", value1, value2, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotBetween(String value1, String value2) {
            addCriterion("productremark not between", value1, value2, "productremark");
            return (Criteria) this;
        }

        public Criteria andOtherideaIsNull() {
            addCriterion("otheridea is null");
            return (Criteria) this;
        }

        public Criteria andOtherideaIsNotNull() {
            addCriterion("otheridea is not null");
            return (Criteria) this;
        }

        public Criteria andOtherideaEqualTo(String value) {
            addCriterion("otheridea =", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaNotEqualTo(String value) {
            addCriterion("otheridea <>", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaGreaterThan(String value) {
            addCriterion("otheridea >", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaGreaterThanOrEqualTo(String value) {
            addCriterion("otheridea >=", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaLessThan(String value) {
            addCriterion("otheridea <", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaLessThanOrEqualTo(String value) {
            addCriterion("otheridea <=", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaLike(String value) {
            addCriterion("otheridea like", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaNotLike(String value) {
            addCriterion("otheridea not like", value, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaIn(List<String> values) {
            addCriterion("otheridea in", values, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaNotIn(List<String> values) {
            addCriterion("otheridea not in", values, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaBetween(String value1, String value2) {
            addCriterion("otheridea between", value1, value2, "otheridea");
            return (Criteria) this;
        }

        public Criteria andOtherideaNotBetween(String value1, String value2) {
            addCriterion("otheridea not between", value1, value2, "otheridea");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteIsNull() {
            addCriterion("mortgagenote is null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteIsNotNull() {
            addCriterion("mortgagenote is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteEqualTo(String value) {
            addCriterion("mortgagenote =", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotEqualTo(String value) {
            addCriterion("mortgagenote <>", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteGreaterThan(String value) {
            addCriterion("mortgagenote >", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagenote >=", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteLessThan(String value) {
            addCriterion("mortgagenote <", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteLessThanOrEqualTo(String value) {
            addCriterion("mortgagenote <=", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteLike(String value) {
            addCriterion("mortgagenote like", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotLike(String value) {
            addCriterion("mortgagenote not like", value, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteIn(List<String> values) {
            addCriterion("mortgagenote in", values, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotIn(List<String> values) {
            addCriterion("mortgagenote not in", values, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteBetween(String value1, String value2) {
            addCriterion("mortgagenote between", value1, value2, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andMortgagenoteNotBetween(String value1, String value2) {
            addCriterion("mortgagenote not between", value1, value2, "mortgagenote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteIsNull() {
            addCriterion("baseinfonote is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteIsNotNull() {
            addCriterion("baseinfonote is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteEqualTo(String value) {
            addCriterion("baseinfonote =", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteNotEqualTo(String value) {
            addCriterion("baseinfonote <>", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteGreaterThan(String value) {
            addCriterion("baseinfonote >", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteGreaterThanOrEqualTo(String value) {
            addCriterion("baseinfonote >=", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteLessThan(String value) {
            addCriterion("baseinfonote <", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteLessThanOrEqualTo(String value) {
            addCriterion("baseinfonote <=", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteLike(String value) {
            addCriterion("baseinfonote like", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteNotLike(String value) {
            addCriterion("baseinfonote not like", value, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteIn(List<String> values) {
            addCriterion("baseinfonote in", values, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteNotIn(List<String> values) {
            addCriterion("baseinfonote not in", values, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteBetween(String value1, String value2) {
            addCriterion("baseinfonote between", value1, value2, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonoteNotBetween(String value1, String value2) {
            addCriterion("baseinfonote not between", value1, value2, "baseinfonote");
            return (Criteria) this;
        }

        public Criteria andLoannoteIsNull() {
            addCriterion("loannote is null");
            return (Criteria) this;
        }

        public Criteria andLoannoteIsNotNull() {
            addCriterion("loannote is not null");
            return (Criteria) this;
        }

        public Criteria andLoannoteEqualTo(String value) {
            addCriterion("loannote =", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteNotEqualTo(String value) {
            addCriterion("loannote <>", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteGreaterThan(String value) {
            addCriterion("loannote >", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteGreaterThanOrEqualTo(String value) {
            addCriterion("loannote >=", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteLessThan(String value) {
            addCriterion("loannote <", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteLessThanOrEqualTo(String value) {
            addCriterion("loannote <=", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteLike(String value) {
            addCriterion("loannote like", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteNotLike(String value) {
            addCriterion("loannote not like", value, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteIn(List<String> values) {
            addCriterion("loannote in", values, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteNotIn(List<String> values) {
            addCriterion("loannote not in", values, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteBetween(String value1, String value2) {
            addCriterion("loannote between", value1, value2, "loannote");
            return (Criteria) this;
        }

        public Criteria andLoannoteNotBetween(String value1, String value2) {
            addCriterion("loannote not between", value1, value2, "loannote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteIsNull() {
            addCriterion("creditinfonote is null");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteIsNotNull() {
            addCriterion("creditinfonote is not null");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteEqualTo(String value) {
            addCriterion("creditinfonote =", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteNotEqualTo(String value) {
            addCriterion("creditinfonote <>", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteGreaterThan(String value) {
            addCriterion("creditinfonote >", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteGreaterThanOrEqualTo(String value) {
            addCriterion("creditinfonote >=", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteLessThan(String value) {
            addCriterion("creditinfonote <", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteLessThanOrEqualTo(String value) {
            addCriterion("creditinfonote <=", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteLike(String value) {
            addCriterion("creditinfonote like", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteNotLike(String value) {
            addCriterion("creditinfonote not like", value, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteIn(List<String> values) {
            addCriterion("creditinfonote in", values, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteNotIn(List<String> values) {
            addCriterion("creditinfonote not in", values, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteBetween(String value1, String value2) {
            addCriterion("creditinfonote between", value1, value2, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinfonoteNotBetween(String value1, String value2) {
            addCriterion("creditinfonote not between", value1, value2, "creditinfonote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteIsNull() {
            addCriterion("creditinvestnote is null");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteIsNotNull() {
            addCriterion("creditinvestnote is not null");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteEqualTo(String value) {
            addCriterion("creditinvestnote =", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteNotEqualTo(String value) {
            addCriterion("creditinvestnote <>", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteGreaterThan(String value) {
            addCriterion("creditinvestnote >", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteGreaterThanOrEqualTo(String value) {
            addCriterion("creditinvestnote >=", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteLessThan(String value) {
            addCriterion("creditinvestnote <", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteLessThanOrEqualTo(String value) {
            addCriterion("creditinvestnote <=", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteLike(String value) {
            addCriterion("creditinvestnote like", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteNotLike(String value) {
            addCriterion("creditinvestnote not like", value, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteIn(List<String> values) {
            addCriterion("creditinvestnote in", values, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteNotIn(List<String> values) {
            addCriterion("creditinvestnote not in", values, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteBetween(String value1, String value2) {
            addCriterion("creditinvestnote between", value1, value2, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andCreditinvestnoteNotBetween(String value1, String value2) {
            addCriterion("creditinvestnote not between", value1, value2, "creditinvestnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteIsNull() {
            addCriterion("revertnote is null");
            return (Criteria) this;
        }

        public Criteria andRevertnoteIsNotNull() {
            addCriterion("revertnote is not null");
            return (Criteria) this;
        }

        public Criteria andRevertnoteEqualTo(String value) {
            addCriterion("revertnote =", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteNotEqualTo(String value) {
            addCriterion("revertnote <>", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteGreaterThan(String value) {
            addCriterion("revertnote >", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteGreaterThanOrEqualTo(String value) {
            addCriterion("revertnote >=", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteLessThan(String value) {
            addCriterion("revertnote <", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteLessThanOrEqualTo(String value) {
            addCriterion("revertnote <=", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteLike(String value) {
            addCriterion("revertnote like", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteNotLike(String value) {
            addCriterion("revertnote not like", value, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteIn(List<String> values) {
            addCriterion("revertnote in", values, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteNotIn(List<String> values) {
            addCriterion("revertnote not in", values, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteBetween(String value1, String value2) {
            addCriterion("revertnote between", value1, value2, "revertnote");
            return (Criteria) this;
        }

        public Criteria andRevertnoteNotBetween(String value1, String value2) {
            addCriterion("revertnote not between", value1, value2, "revertnote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteIsNull() {
            addCriterion("companyrepaynote is null");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteIsNotNull() {
            addCriterion("companyrepaynote is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteEqualTo(String value) {
            addCriterion("companyrepaynote =", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteNotEqualTo(String value) {
            addCriterion("companyrepaynote <>", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteGreaterThan(String value) {
            addCriterion("companyrepaynote >", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteGreaterThanOrEqualTo(String value) {
            addCriterion("companyrepaynote >=", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteLessThan(String value) {
            addCriterion("companyrepaynote <", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteLessThanOrEqualTo(String value) {
            addCriterion("companyrepaynote <=", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteLike(String value) {
            addCriterion("companyrepaynote like", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteNotLike(String value) {
            addCriterion("companyrepaynote not like", value, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteIn(List<String> values) {
            addCriterion("companyrepaynote in", values, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteNotIn(List<String> values) {
            addCriterion("companyrepaynote not in", values, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteBetween(String value1, String value2) {
            addCriterion("companyrepaynote between", value1, value2, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andCompanyrepaynoteNotBetween(String value1, String value2) {
            addCriterion("companyrepaynote not between", value1, value2, "companyrepaynote");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1IsNull() {
            addCriterion("baseinfonote1 is null");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1IsNotNull() {
            addCriterion("baseinfonote1 is not null");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1EqualTo(String value) {
            addCriterion("baseinfonote1 =", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1NotEqualTo(String value) {
            addCriterion("baseinfonote1 <>", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1GreaterThan(String value) {
            addCriterion("baseinfonote1 >", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1GreaterThanOrEqualTo(String value) {
            addCriterion("baseinfonote1 >=", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1LessThan(String value) {
            addCriterion("baseinfonote1 <", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1LessThanOrEqualTo(String value) {
            addCriterion("baseinfonote1 <=", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1Like(String value) {
            addCriterion("baseinfonote1 like", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1NotLike(String value) {
            addCriterion("baseinfonote1 not like", value, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1In(List<String> values) {
            addCriterion("baseinfonote1 in", values, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1NotIn(List<String> values) {
            addCriterion("baseinfonote1 not in", values, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1Between(String value1, String value2) {
            addCriterion("baseinfonote1 between", value1, value2, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andBaseinfonote1NotBetween(String value1, String value2) {
            addCriterion("baseinfonote1 not between", value1, value2, "baseinfonote1");
            return (Criteria) this;
        }

        public Criteria andLownote1IsNull() {
            addCriterion("lownote1 is null");
            return (Criteria) this;
        }

        public Criteria andLownote1IsNotNull() {
            addCriterion("lownote1 is not null");
            return (Criteria) this;
        }

        public Criteria andLownote1EqualTo(String value) {
            addCriterion("lownote1 =", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1NotEqualTo(String value) {
            addCriterion("lownote1 <>", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1GreaterThan(String value) {
            addCriterion("lownote1 >", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1GreaterThanOrEqualTo(String value) {
            addCriterion("lownote1 >=", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1LessThan(String value) {
            addCriterion("lownote1 <", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1LessThanOrEqualTo(String value) {
            addCriterion("lownote1 <=", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1Like(String value) {
            addCriterion("lownote1 like", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1NotLike(String value) {
            addCriterion("lownote1 not like", value, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1In(List<String> values) {
            addCriterion("lownote1 in", values, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1NotIn(List<String> values) {
            addCriterion("lownote1 not in", values, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1Between(String value1, String value2) {
            addCriterion("lownote1 between", value1, value2, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLownote1NotBetween(String value1, String value2) {
            addCriterion("lownote1 not between", value1, value2, "lownote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1IsNull() {
            addCriterion("loaninfonote1 is null");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1IsNotNull() {
            addCriterion("loaninfonote1 is not null");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1EqualTo(String value) {
            addCriterion("loaninfonote1 =", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1NotEqualTo(String value) {
            addCriterion("loaninfonote1 <>", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1GreaterThan(String value) {
            addCriterion("loaninfonote1 >", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1GreaterThanOrEqualTo(String value) {
            addCriterion("loaninfonote1 >=", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1LessThan(String value) {
            addCriterion("loaninfonote1 <", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1LessThanOrEqualTo(String value) {
            addCriterion("loaninfonote1 <=", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1Like(String value) {
            addCriterion("loaninfonote1 like", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1NotLike(String value) {
            addCriterion("loaninfonote1 not like", value, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1In(List<String> values) {
            addCriterion("loaninfonote1 in", values, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1NotIn(List<String> values) {
            addCriterion("loaninfonote1 not in", values, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1Between(String value1, String value2) {
            addCriterion("loaninfonote1 between", value1, value2, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andLoaninfonote1NotBetween(String value1, String value2) {
            addCriterion("loaninfonote1 not between", value1, value2, "loaninfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1IsNull() {
            addCriterion("creditinfonote1 is null");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1IsNotNull() {
            addCriterion("creditinfonote1 is not null");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1EqualTo(String value) {
            addCriterion("creditinfonote1 =", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1NotEqualTo(String value) {
            addCriterion("creditinfonote1 <>", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1GreaterThan(String value) {
            addCriterion("creditinfonote1 >", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1GreaterThanOrEqualTo(String value) {
            addCriterion("creditinfonote1 >=", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1LessThan(String value) {
            addCriterion("creditinfonote1 <", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1LessThanOrEqualTo(String value) {
            addCriterion("creditinfonote1 <=", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1Like(String value) {
            addCriterion("creditinfonote1 like", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1NotLike(String value) {
            addCriterion("creditinfonote1 not like", value, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1In(List<String> values) {
            addCriterion("creditinfonote1 in", values, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1NotIn(List<String> values) {
            addCriterion("creditinfonote1 not in", values, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1Between(String value1, String value2) {
            addCriterion("creditinfonote1 between", value1, value2, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinfonote1NotBetween(String value1, String value2) {
            addCriterion("creditinfonote1 not between", value1, value2, "creditinfonote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1IsNull() {
            addCriterion("creditinverstnote1 is null");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1IsNotNull() {
            addCriterion("creditinverstnote1 is not null");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1EqualTo(String value) {
            addCriterion("creditinverstnote1 =", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1NotEqualTo(String value) {
            addCriterion("creditinverstnote1 <>", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1GreaterThan(String value) {
            addCriterion("creditinverstnote1 >", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1GreaterThanOrEqualTo(String value) {
            addCriterion("creditinverstnote1 >=", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1LessThan(String value) {
            addCriterion("creditinverstnote1 <", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1LessThanOrEqualTo(String value) {
            addCriterion("creditinverstnote1 <=", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1Like(String value) {
            addCriterion("creditinverstnote1 like", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1NotLike(String value) {
            addCriterion("creditinverstnote1 not like", value, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1In(List<String> values) {
            addCriterion("creditinverstnote1 in", values, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1NotIn(List<String> values) {
            addCriterion("creditinverstnote1 not in", values, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1Between(String value1, String value2) {
            addCriterion("creditinverstnote1 between", value1, value2, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andCreditinverstnote1NotBetween(String value1, String value2) {
            addCriterion("creditinverstnote1 not between", value1, value2, "creditinverstnote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1IsNull() {
            addCriterion("assetinfonote1 is null");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1IsNotNull() {
            addCriterion("assetinfonote1 is not null");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1EqualTo(String value) {
            addCriterion("assetinfonote1 =", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1NotEqualTo(String value) {
            addCriterion("assetinfonote1 <>", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1GreaterThan(String value) {
            addCriterion("assetinfonote1 >", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1GreaterThanOrEqualTo(String value) {
            addCriterion("assetinfonote1 >=", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1LessThan(String value) {
            addCriterion("assetinfonote1 <", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1LessThanOrEqualTo(String value) {
            addCriterion("assetinfonote1 <=", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1Like(String value) {
            addCriterion("assetinfonote1 like", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1NotLike(String value) {
            addCriterion("assetinfonote1 not like", value, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1In(List<String> values) {
            addCriterion("assetinfonote1 in", values, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1NotIn(List<String> values) {
            addCriterion("assetinfonote1 not in", values, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1Between(String value1, String value2) {
            addCriterion("assetinfonote1 between", value1, value2, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andAssetinfonote1NotBetween(String value1, String value2) {
            addCriterion("assetinfonote1 not between", value1, value2, "assetinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1IsNull() {
            addCriterion("debtinfonote1 is null");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1IsNotNull() {
            addCriterion("debtinfonote1 is not null");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1EqualTo(String value) {
            addCriterion("debtinfonote1 =", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1NotEqualTo(String value) {
            addCriterion("debtinfonote1 <>", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1GreaterThan(String value) {
            addCriterion("debtinfonote1 >", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1GreaterThanOrEqualTo(String value) {
            addCriterion("debtinfonote1 >=", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1LessThan(String value) {
            addCriterion("debtinfonote1 <", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1LessThanOrEqualTo(String value) {
            addCriterion("debtinfonote1 <=", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1Like(String value) {
            addCriterion("debtinfonote1 like", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1NotLike(String value) {
            addCriterion("debtinfonote1 not like", value, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1In(List<String> values) {
            addCriterion("debtinfonote1 in", values, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1NotIn(List<String> values) {
            addCriterion("debtinfonote1 not in", values, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1Between(String value1, String value2) {
            addCriterion("debtinfonote1 between", value1, value2, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andDebtinfonote1NotBetween(String value1, String value2) {
            addCriterion("debtinfonote1 not between", value1, value2, "debtinfonote1");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateIsNull() {
            addCriterion("suggestmortgagerate is null");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateIsNotNull() {
            addCriterion("suggestmortgagerate is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateEqualTo(BigDecimal value) {
            addCriterion("suggestmortgagerate =", value, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateNotEqualTo(BigDecimal value) {
            addCriterion("suggestmortgagerate <>", value, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateGreaterThan(BigDecimal value) {
            addCriterion("suggestmortgagerate >", value, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestmortgagerate >=", value, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateLessThan(BigDecimal value) {
            addCriterion("suggestmortgagerate <", value, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("suggestmortgagerate <=", value, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateIn(List<BigDecimal> values) {
            addCriterion("suggestmortgagerate in", values, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateNotIn(List<BigDecimal> values) {
            addCriterion("suggestmortgagerate not in", values, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestmortgagerate between", value1, value2, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andSuggestmortgagerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suggestmortgagerate not between", value1, value2, "suggestmortgagerate");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteIsNull() {
            addCriterion("mortgageratenote is null");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteIsNotNull() {
            addCriterion("mortgageratenote is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteEqualTo(String value) {
            addCriterion("mortgageratenote =", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteNotEqualTo(String value) {
            addCriterion("mortgageratenote <>", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteGreaterThan(String value) {
            addCriterion("mortgageratenote >", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageratenote >=", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteLessThan(String value) {
            addCriterion("mortgageratenote <", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteLessThanOrEqualTo(String value) {
            addCriterion("mortgageratenote <=", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteLike(String value) {
            addCriterion("mortgageratenote like", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteNotLike(String value) {
            addCriterion("mortgageratenote not like", value, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteIn(List<String> values) {
            addCriterion("mortgageratenote in", values, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteNotIn(List<String> values) {
            addCriterion("mortgageratenote not in", values, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteBetween(String value1, String value2) {
            addCriterion("mortgageratenote between", value1, value2, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andMortgageratenoteNotBetween(String value1, String value2) {
            addCriterion("mortgageratenote not between", value1, value2, "mortgageratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateIsNull() {
            addCriterion("afterloandebtrate is null");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateIsNotNull() {
            addCriterion("afterloandebtrate is not null");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateEqualTo(BigDecimal value) {
            addCriterion("afterloandebtrate =", value, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateNotEqualTo(BigDecimal value) {
            addCriterion("afterloandebtrate <>", value, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateGreaterThan(BigDecimal value) {
            addCriterion("afterloandebtrate >", value, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("afterloandebtrate >=", value, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateLessThan(BigDecimal value) {
            addCriterion("afterloandebtrate <", value, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("afterloandebtrate <=", value, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateIn(List<BigDecimal> values) {
            addCriterion("afterloandebtrate in", values, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateNotIn(List<BigDecimal> values) {
            addCriterion("afterloandebtrate not in", values, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afterloandebtrate between", value1, value2, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("afterloandebtrate not between", value1, value2, "afterloandebtrate");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteIsNull() {
            addCriterion("afterloandebtratenote is null");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteIsNotNull() {
            addCriterion("afterloandebtratenote is not null");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteEqualTo(String value) {
            addCriterion("afterloandebtratenote =", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteNotEqualTo(String value) {
            addCriterion("afterloandebtratenote <>", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteGreaterThan(String value) {
            addCriterion("afterloandebtratenote >", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteGreaterThanOrEqualTo(String value) {
            addCriterion("afterloandebtratenote >=", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteLessThan(String value) {
            addCriterion("afterloandebtratenote <", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteLessThanOrEqualTo(String value) {
            addCriterion("afterloandebtratenote <=", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteLike(String value) {
            addCriterion("afterloandebtratenote like", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteNotLike(String value) {
            addCriterion("afterloandebtratenote not like", value, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteIn(List<String> values) {
            addCriterion("afterloandebtratenote in", values, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteNotIn(List<String> values) {
            addCriterion("afterloandebtratenote not in", values, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteBetween(String value1, String value2) {
            addCriterion("afterloandebtratenote between", value1, value2, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andAfterloandebtratenoteNotBetween(String value1, String value2) {
            addCriterion("afterloandebtratenote not between", value1, value2, "afterloandebtratenote");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountIsNull() {
            addCriterion("mortgagerateamount is null");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountIsNotNull() {
            addCriterion("mortgagerateamount is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountEqualTo(BigDecimal value) {
            addCriterion("mortgagerateamount =", value, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountNotEqualTo(BigDecimal value) {
            addCriterion("mortgagerateamount <>", value, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountGreaterThan(BigDecimal value) {
            addCriterion("mortgagerateamount >", value, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagerateamount >=", value, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountLessThan(BigDecimal value) {
            addCriterion("mortgagerateamount <", value, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgagerateamount <=", value, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountIn(List<BigDecimal> values) {
            addCriterion("mortgagerateamount in", values, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountNotIn(List<BigDecimal> values) {
            addCriterion("mortgagerateamount not in", values, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagerateamount between", value1, value2, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andMortgagerateamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgagerateamount not between", value1, value2, "mortgagerateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountIsNull() {
            addCriterion("debtrateamount is null");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountIsNotNull() {
            addCriterion("debtrateamount is not null");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountEqualTo(BigDecimal value) {
            addCriterion("debtrateamount =", value, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountNotEqualTo(BigDecimal value) {
            addCriterion("debtrateamount <>", value, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountGreaterThan(BigDecimal value) {
            addCriterion("debtrateamount >", value, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("debtrateamount >=", value, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountLessThan(BigDecimal value) {
            addCriterion("debtrateamount <", value, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("debtrateamount <=", value, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountIn(List<BigDecimal> values) {
            addCriterion("debtrateamount in", values, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountNotIn(List<BigDecimal> values) {
            addCriterion("debtrateamount not in", values, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("debtrateamount between", value1, value2, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andDebtrateamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("debtrateamount not between", value1, value2, "debtrateamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountIsNull() {
            addCriterion("maxcreditamount is null");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountIsNotNull() {
            addCriterion("maxcreditamount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountEqualTo(BigDecimal value) {
            addCriterion("maxcreditamount =", value, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountNotEqualTo(BigDecimal value) {
            addCriterion("maxcreditamount <>", value, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountGreaterThan(BigDecimal value) {
            addCriterion("maxcreditamount >", value, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maxcreditamount >=", value, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountLessThan(BigDecimal value) {
            addCriterion("maxcreditamount <", value, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maxcreditamount <=", value, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountIn(List<BigDecimal> values) {
            addCriterion("maxcreditamount in", values, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountNotIn(List<BigDecimal> values) {
            addCriterion("maxcreditamount not in", values, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxcreditamount between", value1, value2, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andMaxcreditamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxcreditamount not between", value1, value2, "maxcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountIsNull() {
            addCriterion("realcreditamount is null");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountIsNotNull() {
            addCriterion("realcreditamount is not null");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountEqualTo(BigDecimal value) {
            addCriterion("realcreditamount =", value, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountNotEqualTo(BigDecimal value) {
            addCriterion("realcreditamount <>", value, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountGreaterThan(BigDecimal value) {
            addCriterion("realcreditamount >", value, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("realcreditamount >=", value, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountLessThan(BigDecimal value) {
            addCriterion("realcreditamount <", value, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("realcreditamount <=", value, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountIn(List<BigDecimal> values) {
            addCriterion("realcreditamount in", values, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountNotIn(List<BigDecimal> values) {
            addCriterion("realcreditamount not in", values, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realcreditamount between", value1, value2, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andRealcreditamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realcreditamount not between", value1, value2, "realcreditamount");
            return (Criteria) this;
        }

        public Criteria andColumnselectIsNull() {
            addCriterion("columnselect is null");
            return (Criteria) this;
        }

        public Criteria andColumnselectIsNotNull() {
            addCriterion("columnselect is not null");
            return (Criteria) this;
        }

        public Criteria andColumnselectEqualTo(String value) {
            addCriterion("columnselect =", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectNotEqualTo(String value) {
            addCriterion("columnselect <>", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectGreaterThan(String value) {
            addCriterion("columnselect >", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectGreaterThanOrEqualTo(String value) {
            addCriterion("columnselect >=", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectLessThan(String value) {
            addCriterion("columnselect <", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectLessThanOrEqualTo(String value) {
            addCriterion("columnselect <=", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectLike(String value) {
            addCriterion("columnselect like", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectNotLike(String value) {
            addCriterion("columnselect not like", value, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectIn(List<String> values) {
            addCriterion("columnselect in", values, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectNotIn(List<String> values) {
            addCriterion("columnselect not in", values, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectBetween(String value1, String value2) {
            addCriterion("columnselect between", value1, value2, "columnselect");
            return (Criteria) this;
        }

        public Criteria andColumnselectNotBetween(String value1, String value2) {
            addCriterion("columnselect not between", value1, value2, "columnselect");
            return (Criteria) this;
        }

        public Criteria andTempflgIsNull() {
            addCriterion("tempflg is null");
            return (Criteria) this;
        }

        public Criteria andTempflgIsNotNull() {
            addCriterion("tempflg is not null");
            return (Criteria) this;
        }

        public Criteria andTempflgEqualTo(String value) {
            addCriterion("tempflg =", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgNotEqualTo(String value) {
            addCriterion("tempflg <>", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgGreaterThan(String value) {
            addCriterion("tempflg >", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgGreaterThanOrEqualTo(String value) {
            addCriterion("tempflg >=", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgLessThan(String value) {
            addCriterion("tempflg <", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgLessThanOrEqualTo(String value) {
            addCriterion("tempflg <=", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgLike(String value) {
            addCriterion("tempflg like", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgNotLike(String value) {
            addCriterion("tempflg not like", value, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgIn(List<String> values) {
            addCriterion("tempflg in", values, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgNotIn(List<String> values) {
            addCriterion("tempflg not in", values, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgBetween(String value1, String value2) {
            addCriterion("tempflg between", value1, value2, "tempflg");
            return (Criteria) this;
        }

        public Criteria andTempflgNotBetween(String value1, String value2) {
            addCriterion("tempflg not between", value1, value2, "tempflg");
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