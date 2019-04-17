package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroomapprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroomapprovalExample() {
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

        public Criteria andDebtbackflgIsNull() {
            addCriterion("debtbackflg is null");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgIsNotNull() {
            addCriterion("debtbackflg is not null");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgEqualTo(String value) {
            addCriterion("debtbackflg =", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgNotEqualTo(String value) {
            addCriterion("debtbackflg <>", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgGreaterThan(String value) {
            addCriterion("debtbackflg >", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgGreaterThanOrEqualTo(String value) {
            addCriterion("debtbackflg >=", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgLessThan(String value) {
            addCriterion("debtbackflg <", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgLessThanOrEqualTo(String value) {
            addCriterion("debtbackflg <=", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgLike(String value) {
            addCriterion("debtbackflg like", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgNotLike(String value) {
            addCriterion("debtbackflg not like", value, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgIn(List<String> values) {
            addCriterion("debtbackflg in", values, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgNotIn(List<String> values) {
            addCriterion("debtbackflg not in", values, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgBetween(String value1, String value2) {
            addCriterion("debtbackflg between", value1, value2, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbackflgNotBetween(String value1, String value2) {
            addCriterion("debtbackflg not between", value1, value2, "debtbackflg");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteIsNull() {
            addCriterion("debtbacknote is null");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteIsNotNull() {
            addCriterion("debtbacknote is not null");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteEqualTo(String value) {
            addCriterion("debtbacknote =", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteNotEqualTo(String value) {
            addCriterion("debtbacknote <>", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteGreaterThan(String value) {
            addCriterion("debtbacknote >", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteGreaterThanOrEqualTo(String value) {
            addCriterion("debtbacknote >=", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteLessThan(String value) {
            addCriterion("debtbacknote <", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteLessThanOrEqualTo(String value) {
            addCriterion("debtbacknote <=", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteLike(String value) {
            addCriterion("debtbacknote like", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteNotLike(String value) {
            addCriterion("debtbacknote not like", value, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteIn(List<String> values) {
            addCriterion("debtbacknote in", values, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteNotIn(List<String> values) {
            addCriterion("debtbacknote not in", values, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteBetween(String value1, String value2) {
            addCriterion("debtbacknote between", value1, value2, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andDebtbacknoteNotBetween(String value1, String value2) {
            addCriterion("debtbacknote not between", value1, value2, "debtbacknote");
            return (Criteria) this;
        }

        public Criteria andGroombackflgIsNull() {
            addCriterion("groombackflg is null");
            return (Criteria) this;
        }

        public Criteria andGroombackflgIsNotNull() {
            addCriterion("groombackflg is not null");
            return (Criteria) this;
        }

        public Criteria andGroombackflgEqualTo(String value) {
            addCriterion("groombackflg =", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgNotEqualTo(String value) {
            addCriterion("groombackflg <>", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgGreaterThan(String value) {
            addCriterion("groombackflg >", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgGreaterThanOrEqualTo(String value) {
            addCriterion("groombackflg >=", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgLessThan(String value) {
            addCriterion("groombackflg <", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgLessThanOrEqualTo(String value) {
            addCriterion("groombackflg <=", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgLike(String value) {
            addCriterion("groombackflg like", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgNotLike(String value) {
            addCriterion("groombackflg not like", value, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgIn(List<String> values) {
            addCriterion("groombackflg in", values, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgNotIn(List<String> values) {
            addCriterion("groombackflg not in", values, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgBetween(String value1, String value2) {
            addCriterion("groombackflg between", value1, value2, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombackflgNotBetween(String value1, String value2) {
            addCriterion("groombackflg not between", value1, value2, "groombackflg");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteIsNull() {
            addCriterion("groombacknote is null");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteIsNotNull() {
            addCriterion("groombacknote is not null");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteEqualTo(String value) {
            addCriterion("groombacknote =", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteNotEqualTo(String value) {
            addCriterion("groombacknote <>", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteGreaterThan(String value) {
            addCriterion("groombacknote >", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteGreaterThanOrEqualTo(String value) {
            addCriterion("groombacknote >=", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteLessThan(String value) {
            addCriterion("groombacknote <", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteLessThanOrEqualTo(String value) {
            addCriterion("groombacknote <=", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteLike(String value) {
            addCriterion("groombacknote like", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteNotLike(String value) {
            addCriterion("groombacknote not like", value, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteIn(List<String> values) {
            addCriterion("groombacknote in", values, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteNotIn(List<String> values) {
            addCriterion("groombacknote not in", values, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteBetween(String value1, String value2) {
            addCriterion("groombacknote between", value1, value2, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andGroombacknoteNotBetween(String value1, String value2) {
            addCriterion("groombacknote not between", value1, value2, "groombacknote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteIsNull() {
            addCriterion("chanpromisenote is null");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteIsNotNull() {
            addCriterion("chanpromisenote is not null");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteEqualTo(String value) {
            addCriterion("chanpromisenote =", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteNotEqualTo(String value) {
            addCriterion("chanpromisenote <>", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteGreaterThan(String value) {
            addCriterion("chanpromisenote >", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteGreaterThanOrEqualTo(String value) {
            addCriterion("chanpromisenote >=", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteLessThan(String value) {
            addCriterion("chanpromisenote <", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteLessThanOrEqualTo(String value) {
            addCriterion("chanpromisenote <=", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteLike(String value) {
            addCriterion("chanpromisenote like", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteNotLike(String value) {
            addCriterion("chanpromisenote not like", value, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteIn(List<String> values) {
            addCriterion("chanpromisenote in", values, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteNotIn(List<String> values) {
            addCriterion("chanpromisenote not in", values, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteBetween(String value1, String value2) {
            addCriterion("chanpromisenote between", value1, value2, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromisenoteNotBetween(String value1, String value2) {
            addCriterion("chanpromisenote not between", value1, value2, "chanpromisenote");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgIsNull() {
            addCriterion("chanpromiseflg is null");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgIsNotNull() {
            addCriterion("chanpromiseflg is not null");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgEqualTo(String value) {
            addCriterion("chanpromiseflg =", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgNotEqualTo(String value) {
            addCriterion("chanpromiseflg <>", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgGreaterThan(String value) {
            addCriterion("chanpromiseflg >", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgGreaterThanOrEqualTo(String value) {
            addCriterion("chanpromiseflg >=", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgLessThan(String value) {
            addCriterion("chanpromiseflg <", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgLessThanOrEqualTo(String value) {
            addCriterion("chanpromiseflg <=", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgLike(String value) {
            addCriterion("chanpromiseflg like", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgNotLike(String value) {
            addCriterion("chanpromiseflg not like", value, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgIn(List<String> values) {
            addCriterion("chanpromiseflg in", values, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgNotIn(List<String> values) {
            addCriterion("chanpromiseflg not in", values, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgBetween(String value1, String value2) {
            addCriterion("chanpromiseflg between", value1, value2, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andChanpromiseflgNotBetween(String value1, String value2) {
            addCriterion("chanpromiseflg not between", value1, value2, "chanpromiseflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgIsNull() {
            addCriterion("preoutloanbackflg is null");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgIsNotNull() {
            addCriterion("preoutloanbackflg is not null");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgEqualTo(String value) {
            addCriterion("preoutloanbackflg =", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgNotEqualTo(String value) {
            addCriterion("preoutloanbackflg <>", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgGreaterThan(String value) {
            addCriterion("preoutloanbackflg >", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgGreaterThanOrEqualTo(String value) {
            addCriterion("preoutloanbackflg >=", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgLessThan(String value) {
            addCriterion("preoutloanbackflg <", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgLessThanOrEqualTo(String value) {
            addCriterion("preoutloanbackflg <=", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgLike(String value) {
            addCriterion("preoutloanbackflg like", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgNotLike(String value) {
            addCriterion("preoutloanbackflg not like", value, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgIn(List<String> values) {
            addCriterion("preoutloanbackflg in", values, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgNotIn(List<String> values) {
            addCriterion("preoutloanbackflg not in", values, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgBetween(String value1, String value2) {
            addCriterion("preoutloanbackflg between", value1, value2, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbackflgNotBetween(String value1, String value2) {
            addCriterion("preoutloanbackflg not between", value1, value2, "preoutloanbackflg");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteIsNull() {
            addCriterion("preoutloanbacknote is null");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteIsNotNull() {
            addCriterion("preoutloanbacknote is not null");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteEqualTo(String value) {
            addCriterion("preoutloanbacknote =", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteNotEqualTo(String value) {
            addCriterion("preoutloanbacknote <>", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteGreaterThan(String value) {
            addCriterion("preoutloanbacknote >", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteGreaterThanOrEqualTo(String value) {
            addCriterion("preoutloanbacknote >=", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteLessThan(String value) {
            addCriterion("preoutloanbacknote <", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteLessThanOrEqualTo(String value) {
            addCriterion("preoutloanbacknote <=", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteLike(String value) {
            addCriterion("preoutloanbacknote like", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteNotLike(String value) {
            addCriterion("preoutloanbacknote not like", value, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteIn(List<String> values) {
            addCriterion("preoutloanbacknote in", values, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteNotIn(List<String> values) {
            addCriterion("preoutloanbacknote not in", values, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteBetween(String value1, String value2) {
            addCriterion("preoutloanbacknote between", value1, value2, "preoutloanbacknote");
            return (Criteria) this;
        }

        public Criteria andPreoutloanbacknoteNotBetween(String value1, String value2) {
            addCriterion("preoutloanbacknote not between", value1, value2, "preoutloanbacknote");
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