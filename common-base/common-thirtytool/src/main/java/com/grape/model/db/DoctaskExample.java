package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctaskExample() {
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

        public Criteria andDepartmentnoIsNull() {
            addCriterion("departmentno is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIsNotNull() {
            addCriterion("departmentno is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoEqualTo(String value) {
            addCriterion("departmentno =", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotEqualTo(String value) {
            addCriterion("departmentno <>", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoGreaterThan(String value) {
            addCriterion("departmentno >", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoGreaterThanOrEqualTo(String value) {
            addCriterion("departmentno >=", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLessThan(String value) {
            addCriterion("departmentno <", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLessThanOrEqualTo(String value) {
            addCriterion("departmentno <=", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLike(String value) {
            addCriterion("departmentno like", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotLike(String value) {
            addCriterion("departmentno not like", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIn(List<String> values) {
            addCriterion("departmentno in", values, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotIn(List<String> values) {
            addCriterion("departmentno not in", values, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoBetween(String value1, String value2) {
            addCriterion("departmentno between", value1, value2, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotBetween(String value1, String value2) {
            addCriterion("departmentno not between", value1, value2, "departmentno");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("areaid like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("areaid not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andChannelnoIsNull() {
            addCriterion("channelno is null");
            return (Criteria) this;
        }

        public Criteria andChannelnoIsNotNull() {
            addCriterion("channelno is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnoEqualTo(String value) {
            addCriterion("channelno =", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotEqualTo(String value) {
            addCriterion("channelno <>", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoGreaterThan(String value) {
            addCriterion("channelno >", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoGreaterThanOrEqualTo(String value) {
            addCriterion("channelno >=", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLessThan(String value) {
            addCriterion("channelno <", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLessThanOrEqualTo(String value) {
            addCriterion("channelno <=", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLike(String value) {
            addCriterion("channelno like", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotLike(String value) {
            addCriterion("channelno not like", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoIn(List<String> values) {
            addCriterion("channelno in", values, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotIn(List<String> values) {
            addCriterion("channelno not in", values, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoBetween(String value1, String value2) {
            addCriterion("channelno between", value1, value2, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotBetween(String value1, String value2) {
            addCriterion("channelno not between", value1, value2, "channelno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoIsNull() {
            addCriterion("terrcaeno is null");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoIsNotNull() {
            addCriterion("terrcaeno is not null");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoEqualTo(String value) {
            addCriterion("terrcaeno =", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoNotEqualTo(String value) {
            addCriterion("terrcaeno <>", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoGreaterThan(String value) {
            addCriterion("terrcaeno >", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoGreaterThanOrEqualTo(String value) {
            addCriterion("terrcaeno >=", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoLessThan(String value) {
            addCriterion("terrcaeno <", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoLessThanOrEqualTo(String value) {
            addCriterion("terrcaeno <=", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoLike(String value) {
            addCriterion("terrcaeno like", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoNotLike(String value) {
            addCriterion("terrcaeno not like", value, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoIn(List<String> values) {
            addCriterion("terrcaeno in", values, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoNotIn(List<String> values) {
            addCriterion("terrcaeno not in", values, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoBetween(String value1, String value2) {
            addCriterion("terrcaeno between", value1, value2, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andTerrcaenoNotBetween(String value1, String value2) {
            addCriterion("terrcaeno not between", value1, value2, "terrcaeno");
            return (Criteria) this;
        }

        public Criteria andAislenoIsNull() {
            addCriterion("aisleno is null");
            return (Criteria) this;
        }

        public Criteria andAislenoIsNotNull() {
            addCriterion("aisleno is not null");
            return (Criteria) this;
        }

        public Criteria andAislenoEqualTo(String value) {
            addCriterion("aisleno =", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotEqualTo(String value) {
            addCriterion("aisleno <>", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoGreaterThan(String value) {
            addCriterion("aisleno >", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoGreaterThanOrEqualTo(String value) {
            addCriterion("aisleno >=", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoLessThan(String value) {
            addCriterion("aisleno <", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoLessThanOrEqualTo(String value) {
            addCriterion("aisleno <=", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoLike(String value) {
            addCriterion("aisleno like", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotLike(String value) {
            addCriterion("aisleno not like", value, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoIn(List<String> values) {
            addCriterion("aisleno in", values, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotIn(List<String> values) {
            addCriterion("aisleno not in", values, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoBetween(String value1, String value2) {
            addCriterion("aisleno between", value1, value2, "aisleno");
            return (Criteria) this;
        }

        public Criteria andAislenoNotBetween(String value1, String value2) {
            addCriterion("aisleno not between", value1, value2, "aisleno");
            return (Criteria) this;
        }

        public Criteria andFundnoIsNull() {
            addCriterion("fundno is null");
            return (Criteria) this;
        }

        public Criteria andFundnoIsNotNull() {
            addCriterion("fundno is not null");
            return (Criteria) this;
        }

        public Criteria andFundnoEqualTo(String value) {
            addCriterion("fundno =", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotEqualTo(String value) {
            addCriterion("fundno <>", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoGreaterThan(String value) {
            addCriterion("fundno >", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoGreaterThanOrEqualTo(String value) {
            addCriterion("fundno >=", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoLessThan(String value) {
            addCriterion("fundno <", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoLessThanOrEqualTo(String value) {
            addCriterion("fundno <=", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoLike(String value) {
            addCriterion("fundno like", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotLike(String value) {
            addCriterion("fundno not like", value, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoIn(List<String> values) {
            addCriterion("fundno in", values, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotIn(List<String> values) {
            addCriterion("fundno not in", values, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoBetween(String value1, String value2) {
            addCriterion("fundno between", value1, value2, "fundno");
            return (Criteria) this;
        }

        public Criteria andFundnoNotBetween(String value1, String value2) {
            addCriterion("fundno not between", value1, value2, "fundno");
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

        public Criteria andApplydateIsNull() {
            addCriterion("applydate is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("applydate is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("applydate =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("applydate <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("applydate >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("applydate >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("applydate <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("applydate <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("applydate in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("applydate not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("applydate between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("applydate not between", value1, value2, "applydate");
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

        public Criteria andSubsidycomnoIsNull() {
            addCriterion("subsidycomno is null");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoIsNotNull() {
            addCriterion("subsidycomno is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoEqualTo(String value) {
            addCriterion("subsidycomno =", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotEqualTo(String value) {
            addCriterion("subsidycomno <>", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoGreaterThan(String value) {
            addCriterion("subsidycomno >", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoGreaterThanOrEqualTo(String value) {
            addCriterion("subsidycomno >=", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoLessThan(String value) {
            addCriterion("subsidycomno <", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoLessThanOrEqualTo(String value) {
            addCriterion("subsidycomno <=", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoLike(String value) {
            addCriterion("subsidycomno like", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotLike(String value) {
            addCriterion("subsidycomno not like", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoIn(List<String> values) {
            addCriterion("subsidycomno in", values, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotIn(List<String> values) {
            addCriterion("subsidycomno not in", values, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoBetween(String value1, String value2) {
            addCriterion("subsidycomno between", value1, value2, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotBetween(String value1, String value2) {
            addCriterion("subsidycomno not between", value1, value2, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNull() {
            addCriterion("contractno is null");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNotNull() {
            addCriterion("contractno is not null");
            return (Criteria) this;
        }

        public Criteria andContractnoEqualTo(String value) {
            addCriterion("contractno =", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotEqualTo(String value) {
            addCriterion("contractno <>", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThan(String value) {
            addCriterion("contractno >", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThanOrEqualTo(String value) {
            addCriterion("contractno >=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThan(String value) {
            addCriterion("contractno <", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThanOrEqualTo(String value) {
            addCriterion("contractno <=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLike(String value) {
            addCriterion("contractno like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotLike(String value) {
            addCriterion("contractno not like", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoIn(List<String> values) {
            addCriterion("contractno in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotIn(List<String> values) {
            addCriterion("contractno not in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoBetween(String value1, String value2) {
            addCriterion("contractno between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotBetween(String value1, String value2) {
            addCriterion("contractno not between", value1, value2, "contractno");
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

        public Criteria andIntostateIsNull() {
            addCriterion("intostate is null");
            return (Criteria) this;
        }

        public Criteria andIntostateIsNotNull() {
            addCriterion("intostate is not null");
            return (Criteria) this;
        }

        public Criteria andIntostateEqualTo(String value) {
            addCriterion("intostate =", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateNotEqualTo(String value) {
            addCriterion("intostate <>", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateGreaterThan(String value) {
            addCriterion("intostate >", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateGreaterThanOrEqualTo(String value) {
            addCriterion("intostate >=", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateLessThan(String value) {
            addCriterion("intostate <", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateLessThanOrEqualTo(String value) {
            addCriterion("intostate <=", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateLike(String value) {
            addCriterion("intostate like", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateNotLike(String value) {
            addCriterion("intostate not like", value, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateIn(List<String> values) {
            addCriterion("intostate in", values, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateNotIn(List<String> values) {
            addCriterion("intostate not in", values, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateBetween(String value1, String value2) {
            addCriterion("intostate between", value1, value2, "intostate");
            return (Criteria) this;
        }

        public Criteria andIntostateNotBetween(String value1, String value2) {
            addCriterion("intostate not between", value1, value2, "intostate");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceid is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceid is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("deviceid =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("deviceid <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("deviceid >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceid >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("deviceid <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("deviceid <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("deviceid like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("deviceid not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("deviceid in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("deviceid not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("deviceid between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("deviceid not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIstoliveIsNull() {
            addCriterion("istolive is null");
            return (Criteria) this;
        }

        public Criteria andIstoliveIsNotNull() {
            addCriterion("istolive is not null");
            return (Criteria) this;
        }

        public Criteria andIstoliveEqualTo(String value) {
            addCriterion("istolive =", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveNotEqualTo(String value) {
            addCriterion("istolive <>", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveGreaterThan(String value) {
            addCriterion("istolive >", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveGreaterThanOrEqualTo(String value) {
            addCriterion("istolive >=", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveLessThan(String value) {
            addCriterion("istolive <", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveLessThanOrEqualTo(String value) {
            addCriterion("istolive <=", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveLike(String value) {
            addCriterion("istolive like", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveNotLike(String value) {
            addCriterion("istolive not like", value, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveIn(List<String> values) {
            addCriterion("istolive in", values, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveNotIn(List<String> values) {
            addCriterion("istolive not in", values, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveBetween(String value1, String value2) {
            addCriterion("istolive between", value1, value2, "istolive");
            return (Criteria) this;
        }

        public Criteria andIstoliveNotBetween(String value1, String value2) {
            addCriterion("istolive not between", value1, value2, "istolive");
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