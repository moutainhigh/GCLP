package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class MenuinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuinfoExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuid is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(String value) {
            addCriterion("menuid =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(String value) {
            addCriterion("menuid <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(String value) {
            addCriterion("menuid >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(String value) {
            addCriterion("menuid >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(String value) {
            addCriterion("menuid <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(String value) {
            addCriterion("menuid <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLike(String value) {
            addCriterion("menuid like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotLike(String value) {
            addCriterion("menuid not like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<String> values) {
            addCriterion("menuid in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<String> values) {
            addCriterion("menuid not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(String value1, String value2) {
            addCriterion("menuid between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(String value1, String value2) {
            addCriterion("menuid not between", value1, value2, "menuid");
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

        public Criteria andMenunameIsNull() {
            addCriterion("menuname is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuname is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuname =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuname <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuname >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuname >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuname <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuname <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuname like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuname not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuname in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuname not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuname between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuname not between", value1, value2, "menuname");
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