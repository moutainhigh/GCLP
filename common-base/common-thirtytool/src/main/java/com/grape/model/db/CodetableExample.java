package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodetableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodetableExample() {
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

        public Criteria andCodtypIsNull() {
            addCriterion("codtyp is null");
            return (Criteria) this;
        }

        public Criteria andCodtypIsNotNull() {
            addCriterion("codtyp is not null");
            return (Criteria) this;
        }

        public Criteria andCodtypEqualTo(String value) {
            addCriterion("codtyp =", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypNotEqualTo(String value) {
            addCriterion("codtyp <>", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypGreaterThan(String value) {
            addCriterion("codtyp >", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypGreaterThanOrEqualTo(String value) {
            addCriterion("codtyp >=", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypLessThan(String value) {
            addCriterion("codtyp <", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypLessThanOrEqualTo(String value) {
            addCriterion("codtyp <=", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypLike(String value) {
            addCriterion("codtyp like", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypNotLike(String value) {
            addCriterion("codtyp not like", value, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypIn(List<String> values) {
            addCriterion("codtyp in", values, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypNotIn(List<String> values) {
            addCriterion("codtyp not in", values, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypBetween(String value1, String value2) {
            addCriterion("codtyp between", value1, value2, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodtypNotBetween(String value1, String value2) {
            addCriterion("codtyp not between", value1, value2, "codtyp");
            return (Criteria) this;
        }

        public Criteria andCodflgIsNull() {
            addCriterion("codflg is null");
            return (Criteria) this;
        }

        public Criteria andCodflgIsNotNull() {
            addCriterion("codflg is not null");
            return (Criteria) this;
        }

        public Criteria andCodflgEqualTo(String value) {
            addCriterion("codflg =", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgNotEqualTo(String value) {
            addCriterion("codflg <>", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgGreaterThan(String value) {
            addCriterion("codflg >", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgGreaterThanOrEqualTo(String value) {
            addCriterion("codflg >=", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgLessThan(String value) {
            addCriterion("codflg <", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgLessThanOrEqualTo(String value) {
            addCriterion("codflg <=", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgLike(String value) {
            addCriterion("codflg like", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgNotLike(String value) {
            addCriterion("codflg not like", value, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgIn(List<String> values) {
            addCriterion("codflg in", values, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgNotIn(List<String> values) {
            addCriterion("codflg not in", values, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgBetween(String value1, String value2) {
            addCriterion("codflg between", value1, value2, "codflg");
            return (Criteria) this;
        }

        public Criteria andCodflgNotBetween(String value1, String value2) {
            addCriterion("codflg not between", value1, value2, "codflg");
            return (Criteria) this;
        }

        public Criteria andCoddesIsNull() {
            addCriterion("coddes is null");
            return (Criteria) this;
        }

        public Criteria andCoddesIsNotNull() {
            addCriterion("coddes is not null");
            return (Criteria) this;
        }

        public Criteria andCoddesEqualTo(String value) {
            addCriterion("coddes =", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesNotEqualTo(String value) {
            addCriterion("coddes <>", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesGreaterThan(String value) {
            addCriterion("coddes >", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesGreaterThanOrEqualTo(String value) {
            addCriterion("coddes >=", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesLessThan(String value) {
            addCriterion("coddes <", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesLessThanOrEqualTo(String value) {
            addCriterion("coddes <=", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesLike(String value) {
            addCriterion("coddes like", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesNotLike(String value) {
            addCriterion("coddes not like", value, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesIn(List<String> values) {
            addCriterion("coddes in", values, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesNotIn(List<String> values) {
            addCriterion("coddes not in", values, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesBetween(String value1, String value2) {
            addCriterion("coddes between", value1, value2, "coddes");
            return (Criteria) this;
        }

        public Criteria andCoddesNotBetween(String value1, String value2) {
            addCriterion("coddes not between", value1, value2, "coddes");
            return (Criteria) this;
        }

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Integer value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Integer value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Integer value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Integer value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Integer value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Integer> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Integer> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Integer value1, Integer value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIsNull() {
            addCriterion("removeflg is null");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIsNotNull() {
            addCriterion("removeflg is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveflgEqualTo(String value) {
            addCriterion("removeflg =", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotEqualTo(String value) {
            addCriterion("removeflg <>", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgGreaterThan(String value) {
            addCriterion("removeflg >", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgGreaterThanOrEqualTo(String value) {
            addCriterion("removeflg >=", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLessThan(String value) {
            addCriterion("removeflg <", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLessThanOrEqualTo(String value) {
            addCriterion("removeflg <=", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLike(String value) {
            addCriterion("removeflg like", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotLike(String value) {
            addCriterion("removeflg not like", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIn(List<String> values) {
            addCriterion("removeflg in", values, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotIn(List<String> values) {
            addCriterion("removeflg not in", values, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgBetween(String value1, String value2) {
            addCriterion("removeflg between", value1, value2, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotBetween(String value1, String value2) {
            addCriterion("removeflg not between", value1, value2, "removeflg");
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

        public Criteria andDescriptionsIsNull() {
            addCriterion("descriptions is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIsNotNull() {
            addCriterion("descriptions is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionsEqualTo(String value) {
            addCriterion("descriptions =", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotEqualTo(String value) {
            addCriterion("descriptions <>", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThan(String value) {
            addCriterion("descriptions >", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsGreaterThanOrEqualTo(String value) {
            addCriterion("descriptions >=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThan(String value) {
            addCriterion("descriptions <", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLessThanOrEqualTo(String value) {
            addCriterion("descriptions <=", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsLike(String value) {
            addCriterion("descriptions like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotLike(String value) {
            addCriterion("descriptions not like", value, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsIn(List<String> values) {
            addCriterion("descriptions in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotIn(List<String> values) {
            addCriterion("descriptions not in", values, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsBetween(String value1, String value2) {
            addCriterion("descriptions between", value1, value2, "descriptions");
            return (Criteria) this;
        }

        public Criteria andDescriptionsNotBetween(String value1, String value2) {
            addCriterion("descriptions not between", value1, value2, "descriptions");
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