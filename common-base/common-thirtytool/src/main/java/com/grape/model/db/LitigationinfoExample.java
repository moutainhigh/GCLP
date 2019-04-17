package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LitigationinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LitigationinfoExample() {
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

        public Criteria andCerdidIsNull() {
            addCriterion("cerdid is null");
            return (Criteria) this;
        }

        public Criteria andCerdidIsNotNull() {
            addCriterion("cerdid is not null");
            return (Criteria) this;
        }

        public Criteria andCerdidEqualTo(String value) {
            addCriterion("cerdid =", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotEqualTo(String value) {
            addCriterion("cerdid <>", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidGreaterThan(String value) {
            addCriterion("cerdid >", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidGreaterThanOrEqualTo(String value) {
            addCriterion("cerdid >=", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidLessThan(String value) {
            addCriterion("cerdid <", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidLessThanOrEqualTo(String value) {
            addCriterion("cerdid <=", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidLike(String value) {
            addCriterion("cerdid like", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotLike(String value) {
            addCriterion("cerdid not like", value, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidIn(List<String> values) {
            addCriterion("cerdid in", values, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotIn(List<String> values) {
            addCriterion("cerdid not in", values, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidBetween(String value1, String value2) {
            addCriterion("cerdid between", value1, value2, "cerdid");
            return (Criteria) this;
        }

        public Criteria andCerdidNotBetween(String value1, String value2) {
            addCriterion("cerdid not between", value1, value2, "cerdid");
            return (Criteria) this;
        }

        public Criteria andQuerytypeIsNull() {
            addCriterion("querytype is null");
            return (Criteria) this;
        }

        public Criteria andQuerytypeIsNotNull() {
            addCriterion("querytype is not null");
            return (Criteria) this;
        }

        public Criteria andQuerytypeEqualTo(String value) {
            addCriterion("querytype =", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotEqualTo(String value) {
            addCriterion("querytype <>", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeGreaterThan(String value) {
            addCriterion("querytype >", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeGreaterThanOrEqualTo(String value) {
            addCriterion("querytype >=", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeLessThan(String value) {
            addCriterion("querytype <", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeLessThanOrEqualTo(String value) {
            addCriterion("querytype <=", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeLike(String value) {
            addCriterion("querytype like", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotLike(String value) {
            addCriterion("querytype not like", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeIn(List<String> values) {
            addCriterion("querytype in", values, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotIn(List<String> values) {
            addCriterion("querytype not in", values, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeBetween(String value1, String value2) {
            addCriterion("querytype between", value1, value2, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotBetween(String value1, String value2) {
            addCriterion("querytype not between", value1, value2, "querytype");
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

        public Criteria andIsborrlitigationIsNull() {
            addCriterion("isborrlitigation is null");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationIsNotNull() {
            addCriterion("isborrlitigation is not null");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationEqualTo(String value) {
            addCriterion("isborrlitigation =", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationNotEqualTo(String value) {
            addCriterion("isborrlitigation <>", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationGreaterThan(String value) {
            addCriterion("isborrlitigation >", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationGreaterThanOrEqualTo(String value) {
            addCriterion("isborrlitigation >=", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationLessThan(String value) {
            addCriterion("isborrlitigation <", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationLessThanOrEqualTo(String value) {
            addCriterion("isborrlitigation <=", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationLike(String value) {
            addCriterion("isborrlitigation like", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationNotLike(String value) {
            addCriterion("isborrlitigation not like", value, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationIn(List<String> values) {
            addCriterion("isborrlitigation in", values, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationNotIn(List<String> values) {
            addCriterion("isborrlitigation not in", values, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationBetween(String value1, String value2) {
            addCriterion("isborrlitigation between", value1, value2, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIsborrlitigationNotBetween(String value1, String value2) {
            addCriterion("isborrlitigation not between", value1, value2, "isborrlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationIsNull() {
            addCriterion("iscomlitigation is null");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationIsNotNull() {
            addCriterion("iscomlitigation is not null");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationEqualTo(String value) {
            addCriterion("iscomlitigation =", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationNotEqualTo(String value) {
            addCriterion("iscomlitigation <>", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationGreaterThan(String value) {
            addCriterion("iscomlitigation >", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationGreaterThanOrEqualTo(String value) {
            addCriterion("iscomlitigation >=", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationLessThan(String value) {
            addCriterion("iscomlitigation <", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationLessThanOrEqualTo(String value) {
            addCriterion("iscomlitigation <=", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationLike(String value) {
            addCriterion("iscomlitigation like", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationNotLike(String value) {
            addCriterion("iscomlitigation not like", value, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationIn(List<String> values) {
            addCriterion("iscomlitigation in", values, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationNotIn(List<String> values) {
            addCriterion("iscomlitigation not in", values, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationBetween(String value1, String value2) {
            addCriterion("iscomlitigation between", value1, value2, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andIscomlitigationNotBetween(String value1, String value2) {
            addCriterion("iscomlitigation not between", value1, value2, "iscomlitigation");
            return (Criteria) this;
        }

        public Criteria andLitigationstateIsNull() {
            addCriterion("litigationstate is null");
            return (Criteria) this;
        }

        public Criteria andLitigationstateIsNotNull() {
            addCriterion("litigationstate is not null");
            return (Criteria) this;
        }

        public Criteria andLitigationstateEqualTo(String value) {
            addCriterion("litigationstate =", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateNotEqualTo(String value) {
            addCriterion("litigationstate <>", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateGreaterThan(String value) {
            addCriterion("litigationstate >", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateGreaterThanOrEqualTo(String value) {
            addCriterion("litigationstate >=", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateLessThan(String value) {
            addCriterion("litigationstate <", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateLessThanOrEqualTo(String value) {
            addCriterion("litigationstate <=", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateLike(String value) {
            addCriterion("litigationstate like", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateNotLike(String value) {
            addCriterion("litigationstate not like", value, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateIn(List<String> values) {
            addCriterion("litigationstate in", values, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateNotIn(List<String> values) {
            addCriterion("litigationstate not in", values, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateBetween(String value1, String value2) {
            addCriterion("litigationstate between", value1, value2, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andLitigationstateNotBetween(String value1, String value2) {
            addCriterion("litigationstate not between", value1, value2, "litigationstate");
            return (Criteria) this;
        }

        public Criteria andTargetamountIsNull() {
            addCriterion("targetamount is null");
            return (Criteria) this;
        }

        public Criteria andTargetamountIsNotNull() {
            addCriterion("targetamount is not null");
            return (Criteria) this;
        }

        public Criteria andTargetamountEqualTo(BigDecimal value) {
            addCriterion("targetamount =", value, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountNotEqualTo(BigDecimal value) {
            addCriterion("targetamount <>", value, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountGreaterThan(BigDecimal value) {
            addCriterion("targetamount >", value, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("targetamount >=", value, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountLessThan(BigDecimal value) {
            addCriterion("targetamount <", value, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("targetamount <=", value, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountIn(List<BigDecimal> values) {
            addCriterion("targetamount in", values, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountNotIn(List<BigDecimal> values) {
            addCriterion("targetamount not in", values, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("targetamount between", value1, value2, "targetamount");
            return (Criteria) this;
        }

        public Criteria andTargetamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("targetamount not between", value1, value2, "targetamount");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeIsNull() {
            addCriterion("litigationtype is null");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeIsNotNull() {
            addCriterion("litigationtype is not null");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeEqualTo(String value) {
            addCriterion("litigationtype =", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeNotEqualTo(String value) {
            addCriterion("litigationtype <>", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeGreaterThan(String value) {
            addCriterion("litigationtype >", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("litigationtype >=", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeLessThan(String value) {
            addCriterion("litigationtype <", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeLessThanOrEqualTo(String value) {
            addCriterion("litigationtype <=", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeLike(String value) {
            addCriterion("litigationtype like", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeNotLike(String value) {
            addCriterion("litigationtype not like", value, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeIn(List<String> values) {
            addCriterion("litigationtype in", values, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeNotIn(List<String> values) {
            addCriterion("litigationtype not in", values, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeBetween(String value1, String value2) {
            addCriterion("litigationtype between", value1, value2, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andLitigationtypeNotBetween(String value1, String value2) {
            addCriterion("litigationtype not between", value1, value2, "litigationtype");
            return (Criteria) this;
        }

        public Criteria andIsdishonestIsNull() {
            addCriterion("isdishonest is null");
            return (Criteria) this;
        }

        public Criteria andIsdishonestIsNotNull() {
            addCriterion("isdishonest is not null");
            return (Criteria) this;
        }

        public Criteria andIsdishonestEqualTo(String value) {
            addCriterion("isdishonest =", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestNotEqualTo(String value) {
            addCriterion("isdishonest <>", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestGreaterThan(String value) {
            addCriterion("isdishonest >", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestGreaterThanOrEqualTo(String value) {
            addCriterion("isdishonest >=", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestLessThan(String value) {
            addCriterion("isdishonest <", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestLessThanOrEqualTo(String value) {
            addCriterion("isdishonest <=", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestLike(String value) {
            addCriterion("isdishonest like", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestNotLike(String value) {
            addCriterion("isdishonest not like", value, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestIn(List<String> values) {
            addCriterion("isdishonest in", values, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestNotIn(List<String> values) {
            addCriterion("isdishonest not in", values, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestBetween(String value1, String value2) {
            addCriterion("isdishonest between", value1, value2, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andIsdishonestNotBetween(String value1, String value2) {
            addCriterion("isdishonest not between", value1, value2, "isdishonest");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainIsNull() {
            addCriterion("litigationexplain is null");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainIsNotNull() {
            addCriterion("litigationexplain is not null");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainEqualTo(String value) {
            addCriterion("litigationexplain =", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainNotEqualTo(String value) {
            addCriterion("litigationexplain <>", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainGreaterThan(String value) {
            addCriterion("litigationexplain >", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainGreaterThanOrEqualTo(String value) {
            addCriterion("litigationexplain >=", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainLessThan(String value) {
            addCriterion("litigationexplain <", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainLessThanOrEqualTo(String value) {
            addCriterion("litigationexplain <=", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainLike(String value) {
            addCriterion("litigationexplain like", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainNotLike(String value) {
            addCriterion("litigationexplain not like", value, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainIn(List<String> values) {
            addCriterion("litigationexplain in", values, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainNotIn(List<String> values) {
            addCriterion("litigationexplain not in", values, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainBetween(String value1, String value2) {
            addCriterion("litigationexplain between", value1, value2, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andLitigationexplainNotBetween(String value1, String value2) {
            addCriterion("litigationexplain not between", value1, value2, "litigationexplain");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNull() {
            addCriterion("imagename is null");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNotNull() {
            addCriterion("imagename is not null");
            return (Criteria) this;
        }

        public Criteria andImagenameEqualTo(String value) {
            addCriterion("imagename =", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotEqualTo(String value) {
            addCriterion("imagename <>", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThan(String value) {
            addCriterion("imagename >", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThanOrEqualTo(String value) {
            addCriterion("imagename >=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThan(String value) {
            addCriterion("imagename <", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThanOrEqualTo(String value) {
            addCriterion("imagename <=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLike(String value) {
            addCriterion("imagename like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotLike(String value) {
            addCriterion("imagename not like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameIn(List<String> values) {
            addCriterion("imagename in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotIn(List<String> values) {
            addCriterion("imagename not in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameBetween(String value1, String value2) {
            addCriterion("imagename between", value1, value2, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotBetween(String value1, String value2) {
            addCriterion("imagename not between", value1, value2, "imagename");
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