package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRolenameIsNull() {
            addCriterion("rolename is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("rolename is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("rolename =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("rolename <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("rolename >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("rolename >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("rolename <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("rolename <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("rolename like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("rolename not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("rolename in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("rolename not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("rolename between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("rolename not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoIsNull() {
            addCriterion("organizationno is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoIsNotNull() {
            addCriterion("organizationno is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoEqualTo(String value) {
            addCriterion("organizationno =", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotEqualTo(String value) {
            addCriterion("organizationno <>", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoGreaterThan(String value) {
            addCriterion("organizationno >", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoGreaterThanOrEqualTo(String value) {
            addCriterion("organizationno >=", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoLessThan(String value) {
            addCriterion("organizationno <", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoLessThanOrEqualTo(String value) {
            addCriterion("organizationno <=", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoLike(String value) {
            addCriterion("organizationno like", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotLike(String value) {
            addCriterion("organizationno not like", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoIn(List<String> values) {
            addCriterion("organizationno in", values, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotIn(List<String> values) {
            addCriterion("organizationno not in", values, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoBetween(String value1, String value2) {
            addCriterion("organizationno between", value1, value2, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotBetween(String value1, String value2) {
            addCriterion("organizationno not between", value1, value2, "organizationno");
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

        public Criteria andComnoIsNull() {
            addCriterion("comno is null");
            return (Criteria) this;
        }

        public Criteria andComnoIsNotNull() {
            addCriterion("comno is not null");
            return (Criteria) this;
        }

        public Criteria andComnoEqualTo(String value) {
            addCriterion("comno =", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotEqualTo(String value) {
            addCriterion("comno <>", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThan(String value) {
            addCriterion("comno >", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThanOrEqualTo(String value) {
            addCriterion("comno >=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThan(String value) {
            addCriterion("comno <", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThanOrEqualTo(String value) {
            addCriterion("comno <=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLike(String value) {
            addCriterion("comno like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotLike(String value) {
            addCriterion("comno not like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoIn(List<String> values) {
            addCriterion("comno in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotIn(List<String> values) {
            addCriterion("comno not in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoBetween(String value1, String value2) {
            addCriterion("comno between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotBetween(String value1, String value2) {
            addCriterion("comno not between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andUseflgIsNull() {
            addCriterion("useflg is null");
            return (Criteria) this;
        }

        public Criteria andUseflgIsNotNull() {
            addCriterion("useflg is not null");
            return (Criteria) this;
        }

        public Criteria andUseflgEqualTo(String value) {
            addCriterion("useflg =", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotEqualTo(String value) {
            addCriterion("useflg <>", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgGreaterThan(String value) {
            addCriterion("useflg >", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgGreaterThanOrEqualTo(String value) {
            addCriterion("useflg >=", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgLessThan(String value) {
            addCriterion("useflg <", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgLessThanOrEqualTo(String value) {
            addCriterion("useflg <=", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgLike(String value) {
            addCriterion("useflg like", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotLike(String value) {
            addCriterion("useflg not like", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgIn(List<String> values) {
            addCriterion("useflg in", values, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotIn(List<String> values) {
            addCriterion("useflg not in", values, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgBetween(String value1, String value2) {
            addCriterion("useflg between", value1, value2, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotBetween(String value1, String value2) {
            addCriterion("useflg not between", value1, value2, "useflg");
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