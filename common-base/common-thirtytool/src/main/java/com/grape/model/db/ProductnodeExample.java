package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductnodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductnodeExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andNodenameIsNull() {
            addCriterion("nodename is null");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNotNull() {
            addCriterion("nodename is not null");
            return (Criteria) this;
        }

        public Criteria andNodenameEqualTo(String value) {
            addCriterion("nodename =", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotEqualTo(String value) {
            addCriterion("nodename <>", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThan(String value) {
            addCriterion("nodename >", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThanOrEqualTo(String value) {
            addCriterion("nodename >=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThan(String value) {
            addCriterion("nodename <", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThanOrEqualTo(String value) {
            addCriterion("nodename <=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLike(String value) {
            addCriterion("nodename like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotLike(String value) {
            addCriterion("nodename not like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameIn(List<String> values) {
            addCriterion("nodename in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotIn(List<String> values) {
            addCriterion("nodename not in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameBetween(String value1, String value2) {
            addCriterion("nodename between", value1, value2, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotBetween(String value1, String value2) {
            addCriterion("nodename not between", value1, value2, "nodename");
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

        public Criteria andForkIsNull() {
            addCriterion("fork is null");
            return (Criteria) this;
        }

        public Criteria andForkIsNotNull() {
            addCriterion("fork is not null");
            return (Criteria) this;
        }

        public Criteria andForkEqualTo(String value) {
            addCriterion("fork =", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkNotEqualTo(String value) {
            addCriterion("fork <>", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkGreaterThan(String value) {
            addCriterion("fork >", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkGreaterThanOrEqualTo(String value) {
            addCriterion("fork >=", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkLessThan(String value) {
            addCriterion("fork <", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkLessThanOrEqualTo(String value) {
            addCriterion("fork <=", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkLike(String value) {
            addCriterion("fork like", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkNotLike(String value) {
            addCriterion("fork not like", value, "fork");
            return (Criteria) this;
        }

        public Criteria andForkIn(List<String> values) {
            addCriterion("fork in", values, "fork");
            return (Criteria) this;
        }

        public Criteria andForkNotIn(List<String> values) {
            addCriterion("fork not in", values, "fork");
            return (Criteria) this;
        }

        public Criteria andForkBetween(String value1, String value2) {
            addCriterion("fork between", value1, value2, "fork");
            return (Criteria) this;
        }

        public Criteria andForkNotBetween(String value1, String value2) {
            addCriterion("fork not between", value1, value2, "fork");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andTonodeIsNull() {
            addCriterion("tonode is null");
            return (Criteria) this;
        }

        public Criteria andTonodeIsNotNull() {
            addCriterion("tonode is not null");
            return (Criteria) this;
        }

        public Criteria andTonodeEqualTo(String value) {
            addCriterion("tonode =", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotEqualTo(String value) {
            addCriterion("tonode <>", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeGreaterThan(String value) {
            addCriterion("tonode >", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeGreaterThanOrEqualTo(String value) {
            addCriterion("tonode >=", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeLessThan(String value) {
            addCriterion("tonode <", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeLessThanOrEqualTo(String value) {
            addCriterion("tonode <=", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeLike(String value) {
            addCriterion("tonode like", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotLike(String value) {
            addCriterion("tonode not like", value, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeIn(List<String> values) {
            addCriterion("tonode in", values, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotIn(List<String> values) {
            addCriterion("tonode not in", values, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeBetween(String value1, String value2) {
            addCriterion("tonode between", value1, value2, "tonode");
            return (Criteria) this;
        }

        public Criteria andTonodeNotBetween(String value1, String value2) {
            addCriterion("tonode not between", value1, value2, "tonode");
            return (Criteria) this;
        }

        public Criteria andLaneIsNull() {
            addCriterion("lane is null");
            return (Criteria) this;
        }

        public Criteria andLaneIsNotNull() {
            addCriterion("lane is not null");
            return (Criteria) this;
        }

        public Criteria andLaneEqualTo(String value) {
            addCriterion("lane =", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneNotEqualTo(String value) {
            addCriterion("lane <>", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneGreaterThan(String value) {
            addCriterion("lane >", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneGreaterThanOrEqualTo(String value) {
            addCriterion("lane >=", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneLessThan(String value) {
            addCriterion("lane <", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneLessThanOrEqualTo(String value) {
            addCriterion("lane <=", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneLike(String value) {
            addCriterion("lane like", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneNotLike(String value) {
            addCriterion("lane not like", value, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneIn(List<String> values) {
            addCriterion("lane in", values, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneNotIn(List<String> values) {
            addCriterion("lane not in", values, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneBetween(String value1, String value2) {
            addCriterion("lane between", value1, value2, "lane");
            return (Criteria) this;
        }

        public Criteria andLaneNotBetween(String value1, String value2) {
            addCriterion("lane not between", value1, value2, "lane");
            return (Criteria) this;
        }

        public Criteria andAssignmodeIsNull() {
            addCriterion("assignmode is null");
            return (Criteria) this;
        }

        public Criteria andAssignmodeIsNotNull() {
            addCriterion("assignmode is not null");
            return (Criteria) this;
        }

        public Criteria andAssignmodeEqualTo(String value) {
            addCriterion("assignmode =", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeNotEqualTo(String value) {
            addCriterion("assignmode <>", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeGreaterThan(String value) {
            addCriterion("assignmode >", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeGreaterThanOrEqualTo(String value) {
            addCriterion("assignmode >=", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeLessThan(String value) {
            addCriterion("assignmode <", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeLessThanOrEqualTo(String value) {
            addCriterion("assignmode <=", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeLike(String value) {
            addCriterion("assignmode like", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeNotLike(String value) {
            addCriterion("assignmode not like", value, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeIn(List<String> values) {
            addCriterion("assignmode in", values, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeNotIn(List<String> values) {
            addCriterion("assignmode not in", values, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeBetween(String value1, String value2) {
            addCriterion("assignmode between", value1, value2, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAssignmodeNotBetween(String value1, String value2) {
            addCriterion("assignmode not between", value1, value2, "assignmode");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(String value) {
            addCriterion("authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(String value) {
            addCriterion("authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(String value) {
            addCriterion("authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(String value) {
            addCriterion("authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(String value) {
            addCriterion("authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLike(String value) {
            addCriterion("authority like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotLike(String value) {
            addCriterion("authority not like", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<String> values) {
            addCriterion("authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<String> values) {
            addCriterion("authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(String value1, String value2) {
            addCriterion("authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(String value1, String value2) {
            addCriterion("authority not between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("stage is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("stage is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("stage =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("stage <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("stage >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("stage >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("stage <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("stage <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("stage like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("stage not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("stage in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("stage not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeIsNull() {
            addCriterion("assigntagnode is null");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeIsNotNull() {
            addCriterion("assigntagnode is not null");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeEqualTo(String value) {
            addCriterion("assigntagnode =", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeNotEqualTo(String value) {
            addCriterion("assigntagnode <>", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeGreaterThan(String value) {
            addCriterion("assigntagnode >", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeGreaterThanOrEqualTo(String value) {
            addCriterion("assigntagnode >=", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeLessThan(String value) {
            addCriterion("assigntagnode <", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeLessThanOrEqualTo(String value) {
            addCriterion("assigntagnode <=", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeLike(String value) {
            addCriterion("assigntagnode like", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeNotLike(String value) {
            addCriterion("assigntagnode not like", value, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeIn(List<String> values) {
            addCriterion("assigntagnode in", values, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeNotIn(List<String> values) {
            addCriterion("assigntagnode not in", values, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeBetween(String value1, String value2) {
            addCriterion("assigntagnode between", value1, value2, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andAssigntagnodeNotBetween(String value1, String value2) {
            addCriterion("assigntagnode not between", value1, value2, "assigntagnode");
            return (Criteria) this;
        }

        public Criteria andProcesstimeIsNull() {
            addCriterion("processtime is null");
            return (Criteria) this;
        }

        public Criteria andProcesstimeIsNotNull() {
            addCriterion("processtime is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstimeEqualTo(String value) {
            addCriterion("processtime =", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotEqualTo(String value) {
            addCriterion("processtime <>", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeGreaterThan(String value) {
            addCriterion("processtime >", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeGreaterThanOrEqualTo(String value) {
            addCriterion("processtime >=", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeLessThan(String value) {
            addCriterion("processtime <", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeLessThanOrEqualTo(String value) {
            addCriterion("processtime <=", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeLike(String value) {
            addCriterion("processtime like", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotLike(String value) {
            addCriterion("processtime not like", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeIn(List<String> values) {
            addCriterion("processtime in", values, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotIn(List<String> values) {
            addCriterion("processtime not in", values, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeBetween(String value1, String value2) {
            addCriterion("processtime between", value1, value2, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotBetween(String value1, String value2) {
            addCriterion("processtime not between", value1, value2, "processtime");
            return (Criteria) this;
        }

        public Criteria andApprovenumIsNull() {
            addCriterion("approvenum is null");
            return (Criteria) this;
        }

        public Criteria andApprovenumIsNotNull() {
            addCriterion("approvenum is not null");
            return (Criteria) this;
        }

        public Criteria andApprovenumEqualTo(String value) {
            addCriterion("approvenum =", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumNotEqualTo(String value) {
            addCriterion("approvenum <>", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumGreaterThan(String value) {
            addCriterion("approvenum >", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumGreaterThanOrEqualTo(String value) {
            addCriterion("approvenum >=", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumLessThan(String value) {
            addCriterion("approvenum <", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumLessThanOrEqualTo(String value) {
            addCriterion("approvenum <=", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumLike(String value) {
            addCriterion("approvenum like", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumNotLike(String value) {
            addCriterion("approvenum not like", value, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumIn(List<String> values) {
            addCriterion("approvenum in", values, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumNotIn(List<String> values) {
            addCriterion("approvenum not in", values, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumBetween(String value1, String value2) {
            addCriterion("approvenum between", value1, value2, "approvenum");
            return (Criteria) this;
        }

        public Criteria andApprovenumNotBetween(String value1, String value2) {
            addCriterion("approvenum not between", value1, value2, "approvenum");
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

        public Criteria andIstruenodeIsNull() {
            addCriterion("istruenode is null");
            return (Criteria) this;
        }

        public Criteria andIstruenodeIsNotNull() {
            addCriterion("istruenode is not null");
            return (Criteria) this;
        }

        public Criteria andIstruenodeEqualTo(String value) {
            addCriterion("istruenode =", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeNotEqualTo(String value) {
            addCriterion("istruenode <>", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeGreaterThan(String value) {
            addCriterion("istruenode >", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeGreaterThanOrEqualTo(String value) {
            addCriterion("istruenode >=", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeLessThan(String value) {
            addCriterion("istruenode <", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeLessThanOrEqualTo(String value) {
            addCriterion("istruenode <=", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeLike(String value) {
            addCriterion("istruenode like", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeNotLike(String value) {
            addCriterion("istruenode not like", value, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeIn(List<String> values) {
            addCriterion("istruenode in", values, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeNotIn(List<String> values) {
            addCriterion("istruenode not in", values, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeBetween(String value1, String value2) {
            addCriterion("istruenode between", value1, value2, "istruenode");
            return (Criteria) this;
        }

        public Criteria andIstruenodeNotBetween(String value1, String value2) {
            addCriterion("istruenode not between", value1, value2, "istruenode");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeIsNull() {
            addCriterion("bussinesstype is null");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeIsNotNull() {
            addCriterion("bussinesstype is not null");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeEqualTo(String value) {
            addCriterion("bussinesstype =", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeNotEqualTo(String value) {
            addCriterion("bussinesstype <>", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeGreaterThan(String value) {
            addCriterion("bussinesstype >", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("bussinesstype >=", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeLessThan(String value) {
            addCriterion("bussinesstype <", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeLessThanOrEqualTo(String value) {
            addCriterion("bussinesstype <=", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeLike(String value) {
            addCriterion("bussinesstype like", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeNotLike(String value) {
            addCriterion("bussinesstype not like", value, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeIn(List<String> values) {
            addCriterion("bussinesstype in", values, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeNotIn(List<String> values) {
            addCriterion("bussinesstype not in", values, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeBetween(String value1, String value2) {
            addCriterion("bussinesstype between", value1, value2, "bussinesstype");
            return (Criteria) this;
        }

        public Criteria andBussinesstypeNotBetween(String value1, String value2) {
            addCriterion("bussinesstype not between", value1, value2, "bussinesstype");
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