package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class WorkassignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkassignExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("roleid like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("roleid not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
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