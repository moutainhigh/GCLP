package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiskapprovalformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskapprovalformExample() {
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

        public Criteria andPactsignflgIsNull() {
            addCriterion("pactsignflg is null");
            return (Criteria) this;
        }

        public Criteria andPactsignflgIsNotNull() {
            addCriterion("pactsignflg is not null");
            return (Criteria) this;
        }

        public Criteria andPactsignflgEqualTo(String value) {
            addCriterion("pactsignflg =", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgNotEqualTo(String value) {
            addCriterion("pactsignflg <>", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgGreaterThan(String value) {
            addCriterion("pactsignflg >", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgGreaterThanOrEqualTo(String value) {
            addCriterion("pactsignflg >=", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgLessThan(String value) {
            addCriterion("pactsignflg <", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgLessThanOrEqualTo(String value) {
            addCriterion("pactsignflg <=", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgLike(String value) {
            addCriterion("pactsignflg like", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgNotLike(String value) {
            addCriterion("pactsignflg not like", value, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgIn(List<String> values) {
            addCriterion("pactsignflg in", values, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgNotIn(List<String> values) {
            addCriterion("pactsignflg not in", values, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgBetween(String value1, String value2) {
            addCriterion("pactsignflg between", value1, value2, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignflgNotBetween(String value1, String value2) {
            addCriterion("pactsignflg not between", value1, value2, "pactsignflg");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteIsNull() {
            addCriterion("pactsignnote is null");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteIsNotNull() {
            addCriterion("pactsignnote is not null");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteEqualTo(String value) {
            addCriterion("pactsignnote =", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteNotEqualTo(String value) {
            addCriterion("pactsignnote <>", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteGreaterThan(String value) {
            addCriterion("pactsignnote >", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteGreaterThanOrEqualTo(String value) {
            addCriterion("pactsignnote >=", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteLessThan(String value) {
            addCriterion("pactsignnote <", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteLessThanOrEqualTo(String value) {
            addCriterion("pactsignnote <=", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteLike(String value) {
            addCriterion("pactsignnote like", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteNotLike(String value) {
            addCriterion("pactsignnote not like", value, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteIn(List<String> values) {
            addCriterion("pactsignnote in", values, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteNotIn(List<String> values) {
            addCriterion("pactsignnote not in", values, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteBetween(String value1, String value2) {
            addCriterion("pactsignnote between", value1, value2, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andPactsignnoteNotBetween(String value1, String value2) {
            addCriterion("pactsignnote not between", value1, value2, "pactsignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignflgIsNull() {
            addCriterion("statesignflg is null");
            return (Criteria) this;
        }

        public Criteria andStatesignflgIsNotNull() {
            addCriterion("statesignflg is not null");
            return (Criteria) this;
        }

        public Criteria andStatesignflgEqualTo(String value) {
            addCriterion("statesignflg =", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgNotEqualTo(String value) {
            addCriterion("statesignflg <>", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgGreaterThan(String value) {
            addCriterion("statesignflg >", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgGreaterThanOrEqualTo(String value) {
            addCriterion("statesignflg >=", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgLessThan(String value) {
            addCriterion("statesignflg <", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgLessThanOrEqualTo(String value) {
            addCriterion("statesignflg <=", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgLike(String value) {
            addCriterion("statesignflg like", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgNotLike(String value) {
            addCriterion("statesignflg not like", value, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgIn(List<String> values) {
            addCriterion("statesignflg in", values, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgNotIn(List<String> values) {
            addCriterion("statesignflg not in", values, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgBetween(String value1, String value2) {
            addCriterion("statesignflg between", value1, value2, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignflgNotBetween(String value1, String value2) {
            addCriterion("statesignflg not between", value1, value2, "statesignflg");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteIsNull() {
            addCriterion("statesignnote is null");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteIsNotNull() {
            addCriterion("statesignnote is not null");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteEqualTo(String value) {
            addCriterion("statesignnote =", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteNotEqualTo(String value) {
            addCriterion("statesignnote <>", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteGreaterThan(String value) {
            addCriterion("statesignnote >", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteGreaterThanOrEqualTo(String value) {
            addCriterion("statesignnote >=", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteLessThan(String value) {
            addCriterion("statesignnote <", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteLessThanOrEqualTo(String value) {
            addCriterion("statesignnote <=", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteLike(String value) {
            addCriterion("statesignnote like", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteNotLike(String value) {
            addCriterion("statesignnote not like", value, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteIn(List<String> values) {
            addCriterion("statesignnote in", values, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteNotIn(List<String> values) {
            addCriterion("statesignnote not in", values, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteBetween(String value1, String value2) {
            addCriterion("statesignnote between", value1, value2, "statesignnote");
            return (Criteria) this;
        }

        public Criteria andStatesignnoteNotBetween(String value1, String value2) {
            addCriterion("statesignnote not between", value1, value2, "statesignnote");
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