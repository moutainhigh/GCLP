package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andTypevalueIsNull() {
            addCriterion("typevalue is null");
            return (Criteria) this;
        }

        public Criteria andTypevalueIsNotNull() {
            addCriterion("typevalue is not null");
            return (Criteria) this;
        }

        public Criteria andTypevalueEqualTo(String value) {
            addCriterion("typevalue =", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotEqualTo(String value) {
            addCriterion("typevalue <>", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueGreaterThan(String value) {
            addCriterion("typevalue >", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueGreaterThanOrEqualTo(String value) {
            addCriterion("typevalue >=", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLessThan(String value) {
            addCriterion("typevalue <", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLessThanOrEqualTo(String value) {
            addCriterion("typevalue <=", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueLike(String value) {
            addCriterion("typevalue like", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotLike(String value) {
            addCriterion("typevalue not like", value, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueIn(List<String> values) {
            addCriterion("typevalue in", values, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotIn(List<String> values) {
            addCriterion("typevalue not in", values, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueBetween(String value1, String value2) {
            addCriterion("typevalue between", value1, value2, "typevalue");
            return (Criteria) this;
        }

        public Criteria andTypevalueNotBetween(String value1, String value2) {
            addCriterion("typevalue not between", value1, value2, "typevalue");
            return (Criteria) this;
        }

        public Criteria andChecktlIsNull() {
            addCriterion("checktl is null");
            return (Criteria) this;
        }

        public Criteria andChecktlIsNotNull() {
            addCriterion("checktl is not null");
            return (Criteria) this;
        }

        public Criteria andChecktlEqualTo(String value) {
            addCriterion("checktl =", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlNotEqualTo(String value) {
            addCriterion("checktl <>", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlGreaterThan(String value) {
            addCriterion("checktl >", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlGreaterThanOrEqualTo(String value) {
            addCriterion("checktl >=", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlLessThan(String value) {
            addCriterion("checktl <", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlLessThanOrEqualTo(String value) {
            addCriterion("checktl <=", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlLike(String value) {
            addCriterion("checktl like", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlNotLike(String value) {
            addCriterion("checktl not like", value, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlIn(List<String> values) {
            addCriterion("checktl in", values, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlNotIn(List<String> values) {
            addCriterion("checktl not in", values, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlBetween(String value1, String value2) {
            addCriterion("checktl between", value1, value2, "checktl");
            return (Criteria) this;
        }

        public Criteria andChecktlNotBetween(String value1, String value2) {
            addCriterion("checktl not between", value1, value2, "checktl");
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

        public Criteria andRefLogidIsNull() {
            addCriterion("ref_logid is null");
            return (Criteria) this;
        }

        public Criteria andRefLogidIsNotNull() {
            addCriterion("ref_logid is not null");
            return (Criteria) this;
        }

        public Criteria andRefLogidEqualTo(String value) {
            addCriterion("ref_logid =", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidNotEqualTo(String value) {
            addCriterion("ref_logid <>", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidGreaterThan(String value) {
            addCriterion("ref_logid >", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidGreaterThanOrEqualTo(String value) {
            addCriterion("ref_logid >=", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidLessThan(String value) {
            addCriterion("ref_logid <", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidLessThanOrEqualTo(String value) {
            addCriterion("ref_logid <=", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidLike(String value) {
            addCriterion("ref_logid like", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidNotLike(String value) {
            addCriterion("ref_logid not like", value, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidIn(List<String> values) {
            addCriterion("ref_logid in", values, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidNotIn(List<String> values) {
            addCriterion("ref_logid not in", values, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidBetween(String value1, String value2) {
            addCriterion("ref_logid between", value1, value2, "refLogid");
            return (Criteria) this;
        }

        public Criteria andRefLogidNotBetween(String value1, String value2) {
            addCriterion("ref_logid not between", value1, value2, "refLogid");
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