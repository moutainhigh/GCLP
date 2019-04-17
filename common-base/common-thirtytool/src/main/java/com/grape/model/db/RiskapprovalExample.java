package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskapprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskapprovalExample() {
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

        public Criteria andConditiondownflgIsNull() {
            addCriterion("conditiondownflg is null");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgIsNotNull() {
            addCriterion("conditiondownflg is not null");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgEqualTo(String value) {
            addCriterion("conditiondownflg =", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgNotEqualTo(String value) {
            addCriterion("conditiondownflg <>", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgGreaterThan(String value) {
            addCriterion("conditiondownflg >", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgGreaterThanOrEqualTo(String value) {
            addCriterion("conditiondownflg >=", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgLessThan(String value) {
            addCriterion("conditiondownflg <", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgLessThanOrEqualTo(String value) {
            addCriterion("conditiondownflg <=", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgLike(String value) {
            addCriterion("conditiondownflg like", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgNotLike(String value) {
            addCriterion("conditiondownflg not like", value, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgIn(List<String> values) {
            addCriterion("conditiondownflg in", values, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgNotIn(List<String> values) {
            addCriterion("conditiondownflg not in", values, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgBetween(String value1, String value2) {
            addCriterion("conditiondownflg between", value1, value2, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownflgNotBetween(String value1, String value2) {
            addCriterion("conditiondownflg not between", value1, value2, "conditiondownflg");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteIsNull() {
            addCriterion("conditiondownnote is null");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteIsNotNull() {
            addCriterion("conditiondownnote is not null");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteEqualTo(String value) {
            addCriterion("conditiondownnote =", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteNotEqualTo(String value) {
            addCriterion("conditiondownnote <>", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteGreaterThan(String value) {
            addCriterion("conditiondownnote >", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteGreaterThanOrEqualTo(String value) {
            addCriterion("conditiondownnote >=", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteLessThan(String value) {
            addCriterion("conditiondownnote <", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteLessThanOrEqualTo(String value) {
            addCriterion("conditiondownnote <=", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteLike(String value) {
            addCriterion("conditiondownnote like", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteNotLike(String value) {
            addCriterion("conditiondownnote not like", value, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteIn(List<String> values) {
            addCriterion("conditiondownnote in", values, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteNotIn(List<String> values) {
            addCriterion("conditiondownnote not in", values, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteBetween(String value1, String value2) {
            addCriterion("conditiondownnote between", value1, value2, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andConditiondownnoteNotBetween(String value1, String value2) {
            addCriterion("conditiondownnote not between", value1, value2, "conditiondownnote");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgIsNull() {
            addCriterion("suggestloanflg is null");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgIsNotNull() {
            addCriterion("suggestloanflg is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgEqualTo(String value) {
            addCriterion("suggestloanflg =", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotEqualTo(String value) {
            addCriterion("suggestloanflg <>", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgGreaterThan(String value) {
            addCriterion("suggestloanflg >", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgGreaterThanOrEqualTo(String value) {
            addCriterion("suggestloanflg >=", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgLessThan(String value) {
            addCriterion("suggestloanflg <", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgLessThanOrEqualTo(String value) {
            addCriterion("suggestloanflg <=", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgLike(String value) {
            addCriterion("suggestloanflg like", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotLike(String value) {
            addCriterion("suggestloanflg not like", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgIn(List<String> values) {
            addCriterion("suggestloanflg in", values, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotIn(List<String> values) {
            addCriterion("suggestloanflg not in", values, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgBetween(String value1, String value2) {
            addCriterion("suggestloanflg between", value1, value2, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotBetween(String value1, String value2) {
            addCriterion("suggestloanflg not between", value1, value2, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteIsNull() {
            addCriterion("suggestloannote is null");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteIsNotNull() {
            addCriterion("suggestloannote is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteEqualTo(String value) {
            addCriterion("suggestloannote =", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteNotEqualTo(String value) {
            addCriterion("suggestloannote <>", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteGreaterThan(String value) {
            addCriterion("suggestloannote >", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteGreaterThanOrEqualTo(String value) {
            addCriterion("suggestloannote >=", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteLessThan(String value) {
            addCriterion("suggestloannote <", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteLessThanOrEqualTo(String value) {
            addCriterion("suggestloannote <=", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteLike(String value) {
            addCriterion("suggestloannote like", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteNotLike(String value) {
            addCriterion("suggestloannote not like", value, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteIn(List<String> values) {
            addCriterion("suggestloannote in", values, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteNotIn(List<String> values) {
            addCriterion("suggestloannote not in", values, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteBetween(String value1, String value2) {
            addCriterion("suggestloannote between", value1, value2, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andSuggestloannoteNotBetween(String value1, String value2) {
            addCriterion("suggestloannote not between", value1, value2, "suggestloannote");
            return (Criteria) this;
        }

        public Criteria andNotationIsNull() {
            addCriterion("notation is null");
            return (Criteria) this;
        }

        public Criteria andNotationIsNotNull() {
            addCriterion("notation is not null");
            return (Criteria) this;
        }

        public Criteria andNotationEqualTo(String value) {
            addCriterion("notation =", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotEqualTo(String value) {
            addCriterion("notation <>", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationGreaterThan(String value) {
            addCriterion("notation >", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationGreaterThanOrEqualTo(String value) {
            addCriterion("notation >=", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationLessThan(String value) {
            addCriterion("notation <", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationLessThanOrEqualTo(String value) {
            addCriterion("notation <=", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationLike(String value) {
            addCriterion("notation like", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotLike(String value) {
            addCriterion("notation not like", value, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationIn(List<String> values) {
            addCriterion("notation in", values, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotIn(List<String> values) {
            addCriterion("notation not in", values, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationBetween(String value1, String value2) {
            addCriterion("notation between", value1, value2, "notation");
            return (Criteria) this;
        }

        public Criteria andNotationNotBetween(String value1, String value2) {
            addCriterion("notation not between", value1, value2, "notation");
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