package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccessruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessruleExample() {
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

        public Criteria andProductnoIsNull() {
            addCriterion("productno is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("productno is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("productno =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("productno <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("productno >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("productno >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("productno <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("productno <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("productno like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("productno not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("productno in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("productno not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("productno between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("productno not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andRulenameIsNull() {
            addCriterion("rulename is null");
            return (Criteria) this;
        }

        public Criteria andRulenameIsNotNull() {
            addCriterion("rulename is not null");
            return (Criteria) this;
        }

        public Criteria andRulenameEqualTo(String value) {
            addCriterion("rulename =", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotEqualTo(String value) {
            addCriterion("rulename <>", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameGreaterThan(String value) {
            addCriterion("rulename >", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameGreaterThanOrEqualTo(String value) {
            addCriterion("rulename >=", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLessThan(String value) {
            addCriterion("rulename <", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLessThanOrEqualTo(String value) {
            addCriterion("rulename <=", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameLike(String value) {
            addCriterion("rulename like", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotLike(String value) {
            addCriterion("rulename not like", value, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameIn(List<String> values) {
            addCriterion("rulename in", values, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotIn(List<String> values) {
            addCriterion("rulename not in", values, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameBetween(String value1, String value2) {
            addCriterion("rulename between", value1, value2, "rulename");
            return (Criteria) this;
        }

        public Criteria andRulenameNotBetween(String value1, String value2) {
            addCriterion("rulename not between", value1, value2, "rulename");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNull() {
            addCriterion("expression is null");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNotNull() {
            addCriterion("expression is not null");
            return (Criteria) this;
        }

        public Criteria andExpressionEqualTo(String value) {
            addCriterion("expression =", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotEqualTo(String value) {
            addCriterion("expression <>", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThan(String value) {
            addCriterion("expression >", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("expression >=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThan(String value) {
            addCriterion("expression <", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThanOrEqualTo(String value) {
            addCriterion("expression <=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLike(String value) {
            addCriterion("expression like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotLike(String value) {
            addCriterion("expression not like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionIn(List<String> values) {
            addCriterion("expression in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotIn(List<String> values) {
            addCriterion("expression not in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionBetween(String value1, String value2) {
            addCriterion("expression between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotBetween(String value1, String value2) {
            addCriterion("expression not between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeIsNull() {
            addCriterion("admittancetype is null");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeIsNotNull() {
            addCriterion("admittancetype is not null");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeEqualTo(String value) {
            addCriterion("admittancetype =", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeNotEqualTo(String value) {
            addCriterion("admittancetype <>", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeGreaterThan(String value) {
            addCriterion("admittancetype >", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeGreaterThanOrEqualTo(String value) {
            addCriterion("admittancetype >=", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeLessThan(String value) {
            addCriterion("admittancetype <", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeLessThanOrEqualTo(String value) {
            addCriterion("admittancetype <=", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeLike(String value) {
            addCriterion("admittancetype like", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeNotLike(String value) {
            addCriterion("admittancetype not like", value, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeIn(List<String> values) {
            addCriterion("admittancetype in", values, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeNotIn(List<String> values) {
            addCriterion("admittancetype not in", values, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeBetween(String value1, String value2) {
            addCriterion("admittancetype between", value1, value2, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andAdmittancetypeNotBetween(String value1, String value2) {
            addCriterion("admittancetype not between", value1, value2, "admittancetype");
            return (Criteria) this;
        }

        public Criteria andIsattentionIsNull() {
            addCriterion("isattention is null");
            return (Criteria) this;
        }

        public Criteria andIsattentionIsNotNull() {
            addCriterion("isattention is not null");
            return (Criteria) this;
        }

        public Criteria andIsattentionEqualTo(String value) {
            addCriterion("isattention =", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionNotEqualTo(String value) {
            addCriterion("isattention <>", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionGreaterThan(String value) {
            addCriterion("isattention >", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionGreaterThanOrEqualTo(String value) {
            addCriterion("isattention >=", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionLessThan(String value) {
            addCriterion("isattention <", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionLessThanOrEqualTo(String value) {
            addCriterion("isattention <=", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionLike(String value) {
            addCriterion("isattention like", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionNotLike(String value) {
            addCriterion("isattention not like", value, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionIn(List<String> values) {
            addCriterion("isattention in", values, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionNotIn(List<String> values) {
            addCriterion("isattention not in", values, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionBetween(String value1, String value2) {
            addCriterion("isattention between", value1, value2, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsattentionNotBetween(String value1, String value2) {
            addCriterion("isattention not between", value1, value2, "isattention");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeIsNull() {
            addCriterion("isworkidtice is null");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeIsNotNull() {
            addCriterion("isworkidtice is not null");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeEqualTo(String value) {
            addCriterion("isworkidtice =", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeNotEqualTo(String value) {
            addCriterion("isworkidtice <>", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeGreaterThan(String value) {
            addCriterion("isworkidtice >", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeGreaterThanOrEqualTo(String value) {
            addCriterion("isworkidtice >=", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeLessThan(String value) {
            addCriterion("isworkidtice <", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeLessThanOrEqualTo(String value) {
            addCriterion("isworkidtice <=", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeLike(String value) {
            addCriterion("isworkidtice like", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeNotLike(String value) {
            addCriterion("isworkidtice not like", value, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeIn(List<String> values) {
            addCriterion("isworkidtice in", values, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeNotIn(List<String> values) {
            addCriterion("isworkidtice not in", values, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeBetween(String value1, String value2) {
            addCriterion("isworkidtice between", value1, value2, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andIsworkidticeNotBetween(String value1, String value2) {
            addCriterion("isworkidtice not between", value1, value2, "isworkidtice");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andValidtypeIsNull() {
            addCriterion("validtype is null");
            return (Criteria) this;
        }

        public Criteria andValidtypeIsNotNull() {
            addCriterion("validtype is not null");
            return (Criteria) this;
        }

        public Criteria andValidtypeEqualTo(String value) {
            addCriterion("validtype =", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeNotEqualTo(String value) {
            addCriterion("validtype <>", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeGreaterThan(String value) {
            addCriterion("validtype >", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("validtype >=", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeLessThan(String value) {
            addCriterion("validtype <", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeLessThanOrEqualTo(String value) {
            addCriterion("validtype <=", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeLike(String value) {
            addCriterion("validtype like", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeNotLike(String value) {
            addCriterion("validtype not like", value, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeIn(List<String> values) {
            addCriterion("validtype in", values, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeNotIn(List<String> values) {
            addCriterion("validtype not in", values, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeBetween(String value1, String value2) {
            addCriterion("validtype between", value1, value2, "validtype");
            return (Criteria) this;
        }

        public Criteria andValidtypeNotBetween(String value1, String value2) {
            addCriterion("validtype not between", value1, value2, "validtype");
            return (Criteria) this;
        }

        public Criteria andRulestypeIsNull() {
            addCriterion("rulestype is null");
            return (Criteria) this;
        }

        public Criteria andRulestypeIsNotNull() {
            addCriterion("rulestype is not null");
            return (Criteria) this;
        }

        public Criteria andRulestypeEqualTo(String value) {
            addCriterion("rulestype =", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeNotEqualTo(String value) {
            addCriterion("rulestype <>", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeGreaterThan(String value) {
            addCriterion("rulestype >", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeGreaterThanOrEqualTo(String value) {
            addCriterion("rulestype >=", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeLessThan(String value) {
            addCriterion("rulestype <", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeLessThanOrEqualTo(String value) {
            addCriterion("rulestype <=", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeLike(String value) {
            addCriterion("rulestype like", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeNotLike(String value) {
            addCriterion("rulestype not like", value, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeIn(List<String> values) {
            addCriterion("rulestype in", values, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeNotIn(List<String> values) {
            addCriterion("rulestype not in", values, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeBetween(String value1, String value2) {
            addCriterion("rulestype between", value1, value2, "rulestype");
            return (Criteria) this;
        }

        public Criteria andRulestypeNotBetween(String value1, String value2) {
            addCriterion("rulestype not between", value1, value2, "rulestype");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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