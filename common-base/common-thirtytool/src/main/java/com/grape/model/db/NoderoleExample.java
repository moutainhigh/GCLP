package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoderoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoderoleExample() {
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

        public Criteria andRedirecttypeIsNull() {
            addCriterion("redirecttype is null");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeIsNotNull() {
            addCriterion("redirecttype is not null");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeEqualTo(String value) {
            addCriterion("redirecttype =", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeNotEqualTo(String value) {
            addCriterion("redirecttype <>", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeGreaterThan(String value) {
            addCriterion("redirecttype >", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("redirecttype >=", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeLessThan(String value) {
            addCriterion("redirecttype <", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeLessThanOrEqualTo(String value) {
            addCriterion("redirecttype <=", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeLike(String value) {
            addCriterion("redirecttype like", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeNotLike(String value) {
            addCriterion("redirecttype not like", value, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeIn(List<String> values) {
            addCriterion("redirecttype in", values, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeNotIn(List<String> values) {
            addCriterion("redirecttype not in", values, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeBetween(String value1, String value2) {
            addCriterion("redirecttype between", value1, value2, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andRedirecttypeNotBetween(String value1, String value2) {
            addCriterion("redirecttype not between", value1, value2, "redirecttype");
            return (Criteria) this;
        }

        public Criteria andLastnodeIsNull() {
            addCriterion("lastnode is null");
            return (Criteria) this;
        }

        public Criteria andLastnodeIsNotNull() {
            addCriterion("lastnode is not null");
            return (Criteria) this;
        }

        public Criteria andLastnodeEqualTo(String value) {
            addCriterion("lastnode =", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeNotEqualTo(String value) {
            addCriterion("lastnode <>", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeGreaterThan(String value) {
            addCriterion("lastnode >", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeGreaterThanOrEqualTo(String value) {
            addCriterion("lastnode >=", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeLessThan(String value) {
            addCriterion("lastnode <", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeLessThanOrEqualTo(String value) {
            addCriterion("lastnode <=", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeLike(String value) {
            addCriterion("lastnode like", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeNotLike(String value) {
            addCriterion("lastnode not like", value, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeIn(List<String> values) {
            addCriterion("lastnode in", values, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeNotIn(List<String> values) {
            addCriterion("lastnode not in", values, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeBetween(String value1, String value2) {
            addCriterion("lastnode between", value1, value2, "lastnode");
            return (Criteria) this;
        }

        public Criteria andLastnodeNotBetween(String value1, String value2) {
            addCriterion("lastnode not between", value1, value2, "lastnode");
            return (Criteria) this;
        }

        public Criteria andEnterconditionIsNull() {
            addCriterion("entercondition is null");
            return (Criteria) this;
        }

        public Criteria andEnterconditionIsNotNull() {
            addCriterion("entercondition is not null");
            return (Criteria) this;
        }

        public Criteria andEnterconditionEqualTo(String value) {
            addCriterion("entercondition =", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionNotEqualTo(String value) {
            addCriterion("entercondition <>", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionGreaterThan(String value) {
            addCriterion("entercondition >", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionGreaterThanOrEqualTo(String value) {
            addCriterion("entercondition >=", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionLessThan(String value) {
            addCriterion("entercondition <", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionLessThanOrEqualTo(String value) {
            addCriterion("entercondition <=", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionLike(String value) {
            addCriterion("entercondition like", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionNotLike(String value) {
            addCriterion("entercondition not like", value, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionIn(List<String> values) {
            addCriterion("entercondition in", values, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionNotIn(List<String> values) {
            addCriterion("entercondition not in", values, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionBetween(String value1, String value2) {
            addCriterion("entercondition between", value1, value2, "entercondition");
            return (Criteria) this;
        }

        public Criteria andEnterconditionNotBetween(String value1, String value2) {
            addCriterion("entercondition not between", value1, value2, "entercondition");
            return (Criteria) this;
        }

        public Criteria andNodetimeIsNull() {
            addCriterion("nodetime is null");
            return (Criteria) this;
        }

        public Criteria andNodetimeIsNotNull() {
            addCriterion("nodetime is not null");
            return (Criteria) this;
        }

        public Criteria andNodetimeEqualTo(String value) {
            addCriterion("nodetime =", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeNotEqualTo(String value) {
            addCriterion("nodetime <>", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeGreaterThan(String value) {
            addCriterion("nodetime >", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeGreaterThanOrEqualTo(String value) {
            addCriterion("nodetime >=", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeLessThan(String value) {
            addCriterion("nodetime <", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeLessThanOrEqualTo(String value) {
            addCriterion("nodetime <=", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeLike(String value) {
            addCriterion("nodetime like", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeNotLike(String value) {
            addCriterion("nodetime not like", value, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeIn(List<String> values) {
            addCriterion("nodetime in", values, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeNotIn(List<String> values) {
            addCriterion("nodetime not in", values, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeBetween(String value1, String value2) {
            addCriterion("nodetime between", value1, value2, "nodetime");
            return (Criteria) this;
        }

        public Criteria andNodetimeNotBetween(String value1, String value2) {
            addCriterion("nodetime not between", value1, value2, "nodetime");
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

        public Criteria andChgtlIsNull() {
            addCriterion("chgtl is null");
            return (Criteria) this;
        }

        public Criteria andChgtlIsNotNull() {
            addCriterion("chgtl is not null");
            return (Criteria) this;
        }

        public Criteria andChgtlEqualTo(Date value) {
            addCriterion("chgtl =", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlNotEqualTo(Date value) {
            addCriterion("chgtl <>", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlGreaterThan(Date value) {
            addCriterion("chgtl >", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlGreaterThanOrEqualTo(Date value) {
            addCriterion("chgtl >=", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlLessThan(Date value) {
            addCriterion("chgtl <", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlLessThanOrEqualTo(Date value) {
            addCriterion("chgtl <=", value, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlIn(List<Date> values) {
            addCriterion("chgtl in", values, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlNotIn(List<Date> values) {
            addCriterion("chgtl not in", values, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlBetween(Date value1, Date value2) {
            addCriterion("chgtl between", value1, value2, "chgtl");
            return (Criteria) this;
        }

        public Criteria andChgtlNotBetween(Date value1, Date value2) {
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