package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkitemExample() {
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

        public Criteria andNodeIsNull() {
            addCriterion("node is null");
            return (Criteria) this;
        }

        public Criteria andNodeIsNotNull() {
            addCriterion("node is not null");
            return (Criteria) this;
        }

        public Criteria andNodeEqualTo(String value) {
            addCriterion("node =", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotEqualTo(String value) {
            addCriterion("node <>", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThan(String value) {
            addCriterion("node >", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeGreaterThanOrEqualTo(String value) {
            addCriterion("node >=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThan(String value) {
            addCriterion("node <", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLessThanOrEqualTo(String value) {
            addCriterion("node <=", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeLike(String value) {
            addCriterion("node like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotLike(String value) {
            addCriterion("node not like", value, "node");
            return (Criteria) this;
        }

        public Criteria andNodeIn(List<String> values) {
            addCriterion("node in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotIn(List<String> values) {
            addCriterion("node not in", values, "node");
            return (Criteria) this;
        }

        public Criteria andNodeBetween(String value1, String value2) {
            addCriterion("node between", value1, value2, "node");
            return (Criteria) this;
        }

        public Criteria andNodeNotBetween(String value1, String value2) {
            addCriterion("node not between", value1, value2, "node");
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Date value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Date value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Date value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Date value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Date value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Date value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Date> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Date> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Date value1, Date value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Date value1, Date value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAuthuseridIsNull() {
            addCriterion("authuserid is null");
            return (Criteria) this;
        }

        public Criteria andAuthuseridIsNotNull() {
            addCriterion("authuserid is not null");
            return (Criteria) this;
        }

        public Criteria andAuthuseridEqualTo(String value) {
            addCriterion("authuserid =", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotEqualTo(String value) {
            addCriterion("authuserid <>", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridGreaterThan(String value) {
            addCriterion("authuserid >", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridGreaterThanOrEqualTo(String value) {
            addCriterion("authuserid >=", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridLessThan(String value) {
            addCriterion("authuserid <", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridLessThanOrEqualTo(String value) {
            addCriterion("authuserid <=", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridLike(String value) {
            addCriterion("authuserid like", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotLike(String value) {
            addCriterion("authuserid not like", value, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridIn(List<String> values) {
            addCriterion("authuserid in", values, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotIn(List<String> values) {
            addCriterion("authuserid not in", values, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridBetween(String value1, String value2) {
            addCriterion("authuserid between", value1, value2, "authuserid");
            return (Criteria) this;
        }

        public Criteria andAuthuseridNotBetween(String value1, String value2) {
            addCriterion("authuserid not between", value1, value2, "authuserid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNull() {
            addCriterion("realtime is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNotNull() {
            addCriterion("realtime is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeEqualTo(Date value) {
            addCriterion("realtime =", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotEqualTo(Date value) {
            addCriterion("realtime <>", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThan(Date value) {
            addCriterion("realtime >", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("realtime >=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThan(Date value) {
            addCriterion("realtime <", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThanOrEqualTo(Date value) {
            addCriterion("realtime <=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeIn(List<Date> values) {
            addCriterion("realtime in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotIn(List<Date> values) {
            addCriterion("realtime not in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeBetween(Date value1, Date value2) {
            addCriterion("realtime between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotBetween(Date value1, Date value2) {
            addCriterion("realtime not between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andReturnflgIsNull() {
            addCriterion("returnflg is null");
            return (Criteria) this;
        }

        public Criteria andReturnflgIsNotNull() {
            addCriterion("returnflg is not null");
            return (Criteria) this;
        }

        public Criteria andReturnflgEqualTo(String value) {
            addCriterion("returnflg =", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgNotEqualTo(String value) {
            addCriterion("returnflg <>", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgGreaterThan(String value) {
            addCriterion("returnflg >", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgGreaterThanOrEqualTo(String value) {
            addCriterion("returnflg >=", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgLessThan(String value) {
            addCriterion("returnflg <", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgLessThanOrEqualTo(String value) {
            addCriterion("returnflg <=", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgLike(String value) {
            addCriterion("returnflg like", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgNotLike(String value) {
            addCriterion("returnflg not like", value, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgIn(List<String> values) {
            addCriterion("returnflg in", values, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgNotIn(List<String> values) {
            addCriterion("returnflg not in", values, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgBetween(String value1, String value2) {
            addCriterion("returnflg between", value1, value2, "returnflg");
            return (Criteria) this;
        }

        public Criteria andReturnflgNotBetween(String value1, String value2) {
            addCriterion("returnflg not between", value1, value2, "returnflg");
            return (Criteria) this;
        }

        public Criteria andRetscnodeIsNull() {
            addCriterion("retscnode is null");
            return (Criteria) this;
        }

        public Criteria andRetscnodeIsNotNull() {
            addCriterion("retscnode is not null");
            return (Criteria) this;
        }

        public Criteria andRetscnodeEqualTo(String value) {
            addCriterion("retscnode =", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeNotEqualTo(String value) {
            addCriterion("retscnode <>", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeGreaterThan(String value) {
            addCriterion("retscnode >", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeGreaterThanOrEqualTo(String value) {
            addCriterion("retscnode >=", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeLessThan(String value) {
            addCriterion("retscnode <", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeLessThanOrEqualTo(String value) {
            addCriterion("retscnode <=", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeLike(String value) {
            addCriterion("retscnode like", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeNotLike(String value) {
            addCriterion("retscnode not like", value, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeIn(List<String> values) {
            addCriterion("retscnode in", values, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeNotIn(List<String> values) {
            addCriterion("retscnode not in", values, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeBetween(String value1, String value2) {
            addCriterion("retscnode between", value1, value2, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscnodeNotBetween(String value1, String value2) {
            addCriterion("retscnode not between", value1, value2, "retscnode");
            return (Criteria) this;
        }

        public Criteria andRetscperIsNull() {
            addCriterion("retscper is null");
            return (Criteria) this;
        }

        public Criteria andRetscperIsNotNull() {
            addCriterion("retscper is not null");
            return (Criteria) this;
        }

        public Criteria andRetscperEqualTo(String value) {
            addCriterion("retscper =", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperNotEqualTo(String value) {
            addCriterion("retscper <>", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperGreaterThan(String value) {
            addCriterion("retscper >", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperGreaterThanOrEqualTo(String value) {
            addCriterion("retscper >=", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperLessThan(String value) {
            addCriterion("retscper <", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperLessThanOrEqualTo(String value) {
            addCriterion("retscper <=", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperLike(String value) {
            addCriterion("retscper like", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperNotLike(String value) {
            addCriterion("retscper not like", value, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperIn(List<String> values) {
            addCriterion("retscper in", values, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperNotIn(List<String> values) {
            addCriterion("retscper not in", values, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperBetween(String value1, String value2) {
            addCriterion("retscper between", value1, value2, "retscper");
            return (Criteria) this;
        }

        public Criteria andRetscperNotBetween(String value1, String value2) {
            addCriterion("retscper not between", value1, value2, "retscper");
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