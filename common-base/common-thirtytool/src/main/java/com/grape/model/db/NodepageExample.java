package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class NodepageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodepageExample() {
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

        public Criteria andPageidIsNull() {
            addCriterion("pageid is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("pageid is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(String value) {
            addCriterion("pageid =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(String value) {
            addCriterion("pageid <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(String value) {
            addCriterion("pageid >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(String value) {
            addCriterion("pageid >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(String value) {
            addCriterion("pageid <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(String value) {
            addCriterion("pageid <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLike(String value) {
            addCriterion("pageid like", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotLike(String value) {
            addCriterion("pageid not like", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<String> values) {
            addCriterion("pageid in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<String> values) {
            addCriterion("pageid not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(String value1, String value2) {
            addCriterion("pageid between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(String value1, String value2) {
            addCriterion("pageid not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andEditflgIsNull() {
            addCriterion("editflg is null");
            return (Criteria) this;
        }

        public Criteria andEditflgIsNotNull() {
            addCriterion("editflg is not null");
            return (Criteria) this;
        }

        public Criteria andEditflgEqualTo(String value) {
            addCriterion("editflg =", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgNotEqualTo(String value) {
            addCriterion("editflg <>", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgGreaterThan(String value) {
            addCriterion("editflg >", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgGreaterThanOrEqualTo(String value) {
            addCriterion("editflg >=", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgLessThan(String value) {
            addCriterion("editflg <", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgLessThanOrEqualTo(String value) {
            addCriterion("editflg <=", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgLike(String value) {
            addCriterion("editflg like", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgNotLike(String value) {
            addCriterion("editflg not like", value, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgIn(List<String> values) {
            addCriterion("editflg in", values, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgNotIn(List<String> values) {
            addCriterion("editflg not in", values, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgBetween(String value1, String value2) {
            addCriterion("editflg between", value1, value2, "editflg");
            return (Criteria) this;
        }

        public Criteria andEditflgNotBetween(String value1, String value2) {
            addCriterion("editflg not between", value1, value2, "editflg");
            return (Criteria) this;
        }

        public Criteria andViewflgIsNull() {
            addCriterion("viewflg is null");
            return (Criteria) this;
        }

        public Criteria andViewflgIsNotNull() {
            addCriterion("viewflg is not null");
            return (Criteria) this;
        }

        public Criteria andViewflgEqualTo(String value) {
            addCriterion("viewflg =", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgNotEqualTo(String value) {
            addCriterion("viewflg <>", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgGreaterThan(String value) {
            addCriterion("viewflg >", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgGreaterThanOrEqualTo(String value) {
            addCriterion("viewflg >=", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgLessThan(String value) {
            addCriterion("viewflg <", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgLessThanOrEqualTo(String value) {
            addCriterion("viewflg <=", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgLike(String value) {
            addCriterion("viewflg like", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgNotLike(String value) {
            addCriterion("viewflg not like", value, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgIn(List<String> values) {
            addCriterion("viewflg in", values, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgNotIn(List<String> values) {
            addCriterion("viewflg not in", values, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgBetween(String value1, String value2) {
            addCriterion("viewflg between", value1, value2, "viewflg");
            return (Criteria) this;
        }

        public Criteria andViewflgNotBetween(String value1, String value2) {
            addCriterion("viewflg not between", value1, value2, "viewflg");
            return (Criteria) this;
        }

        public Criteria andPagebuttonIsNull() {
            addCriterion("pagebutton is null");
            return (Criteria) this;
        }

        public Criteria andPagebuttonIsNotNull() {
            addCriterion("pagebutton is not null");
            return (Criteria) this;
        }

        public Criteria andPagebuttonEqualTo(String value) {
            addCriterion("pagebutton =", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonNotEqualTo(String value) {
            addCriterion("pagebutton <>", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonGreaterThan(String value) {
            addCriterion("pagebutton >", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonGreaterThanOrEqualTo(String value) {
            addCriterion("pagebutton >=", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonLessThan(String value) {
            addCriterion("pagebutton <", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonLessThanOrEqualTo(String value) {
            addCriterion("pagebutton <=", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonLike(String value) {
            addCriterion("pagebutton like", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonNotLike(String value) {
            addCriterion("pagebutton not like", value, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonIn(List<String> values) {
            addCriterion("pagebutton in", values, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonNotIn(List<String> values) {
            addCriterion("pagebutton not in", values, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonBetween(String value1, String value2) {
            addCriterion("pagebutton between", value1, value2, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andPagebuttonNotBetween(String value1, String value2) {
            addCriterion("pagebutton not between", value1, value2, "pagebutton");
            return (Criteria) this;
        }

        public Criteria andBasepageflgIsNull() {
            addCriterion("basepageflg is null");
            return (Criteria) this;
        }

        public Criteria andBasepageflgIsNotNull() {
            addCriterion("basepageflg is not null");
            return (Criteria) this;
        }

        public Criteria andBasepageflgEqualTo(String value) {
            addCriterion("basepageflg =", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgNotEqualTo(String value) {
            addCriterion("basepageflg <>", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgGreaterThan(String value) {
            addCriterion("basepageflg >", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgGreaterThanOrEqualTo(String value) {
            addCriterion("basepageflg >=", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgLessThan(String value) {
            addCriterion("basepageflg <", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgLessThanOrEqualTo(String value) {
            addCriterion("basepageflg <=", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgLike(String value) {
            addCriterion("basepageflg like", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgNotLike(String value) {
            addCriterion("basepageflg not like", value, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgIn(List<String> values) {
            addCriterion("basepageflg in", values, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgNotIn(List<String> values) {
            addCriterion("basepageflg not in", values, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgBetween(String value1, String value2) {
            addCriterion("basepageflg between", value1, value2, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andBasepageflgNotBetween(String value1, String value2) {
            addCriterion("basepageflg not between", value1, value2, "basepageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgIsNull() {
            addCriterion("approvalpageflg is null");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgIsNotNull() {
            addCriterion("approvalpageflg is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgEqualTo(String value) {
            addCriterion("approvalpageflg =", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgNotEqualTo(String value) {
            addCriterion("approvalpageflg <>", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgGreaterThan(String value) {
            addCriterion("approvalpageflg >", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgGreaterThanOrEqualTo(String value) {
            addCriterion("approvalpageflg >=", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgLessThan(String value) {
            addCriterion("approvalpageflg <", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgLessThanOrEqualTo(String value) {
            addCriterion("approvalpageflg <=", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgLike(String value) {
            addCriterion("approvalpageflg like", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgNotLike(String value) {
            addCriterion("approvalpageflg not like", value, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgIn(List<String> values) {
            addCriterion("approvalpageflg in", values, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgNotIn(List<String> values) {
            addCriterion("approvalpageflg not in", values, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgBetween(String value1, String value2) {
            addCriterion("approvalpageflg between", value1, value2, "approvalpageflg");
            return (Criteria) this;
        }

        public Criteria andApprovalpageflgNotBetween(String value1, String value2) {
            addCriterion("approvalpageflg not between", value1, value2, "approvalpageflg");
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

        public Criteria andChgdtEqualTo(String value) {
            addCriterion("chgdt =", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtNotEqualTo(String value) {
            addCriterion("chgdt <>", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtGreaterThan(String value) {
            addCriterion("chgdt >", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtGreaterThanOrEqualTo(String value) {
            addCriterion("chgdt >=", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtLessThan(String value) {
            addCriterion("chgdt <", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtLessThanOrEqualTo(String value) {
            addCriterion("chgdt <=", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtLike(String value) {
            addCriterion("chgdt like", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtNotLike(String value) {
            addCriterion("chgdt not like", value, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtIn(List<String> values) {
            addCriterion("chgdt in", values, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtNotIn(List<String> values) {
            addCriterion("chgdt not in", values, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtBetween(String value1, String value2) {
            addCriterion("chgdt between", value1, value2, "chgdt");
            return (Criteria) this;
        }

        public Criteria andChgdtNotBetween(String value1, String value2) {
            addCriterion("chgdt not between", value1, value2, "chgdt");
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