package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentapplyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentapplyinfoExample() {
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

        public Criteria andLoantypeIsNull() {
            addCriterion("loantype is null");
            return (Criteria) this;
        }

        public Criteria andLoantypeIsNotNull() {
            addCriterion("loantype is not null");
            return (Criteria) this;
        }

        public Criteria andLoantypeEqualTo(String value) {
            addCriterion("loantype =", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotEqualTo(String value) {
            addCriterion("loantype <>", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThan(String value) {
            addCriterion("loantype >", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThanOrEqualTo(String value) {
            addCriterion("loantype >=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThan(String value) {
            addCriterion("loantype <", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThanOrEqualTo(String value) {
            addCriterion("loantype <=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLike(String value) {
            addCriterion("loantype like", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotLike(String value) {
            addCriterion("loantype not like", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeIn(List<String> values) {
            addCriterion("loantype in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotIn(List<String> values) {
            addCriterion("loantype not in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeBetween(String value1, String value2) {
            addCriterion("loantype between", value1, value2, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotBetween(String value1, String value2) {
            addCriterion("loantype not between", value1, value2, "loantype");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeIsNull() {
            addCriterion("applicationtime is null");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeIsNotNull() {
            addCriterion("applicationtime is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeEqualTo(Date value) {
            addCriterion("applicationtime =", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeNotEqualTo(Date value) {
            addCriterion("applicationtime <>", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeGreaterThan(Date value) {
            addCriterion("applicationtime >", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applicationtime >=", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeLessThan(Date value) {
            addCriterion("applicationtime <", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeLessThanOrEqualTo(Date value) {
            addCriterion("applicationtime <=", value, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeIn(List<Date> values) {
            addCriterion("applicationtime in", values, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeNotIn(List<Date> values) {
            addCriterion("applicationtime not in", values, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeBetween(Date value1, Date value2) {
            addCriterion("applicationtime between", value1, value2, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andApplicationtimeNotBetween(Date value1, Date value2) {
            addCriterion("applicationtime not between", value1, value2, "applicationtime");
            return (Criteria) this;
        }

        public Criteria andExaminationrateIsNull() {
            addCriterion("examinationrate is null");
            return (Criteria) this;
        }

        public Criteria andExaminationrateIsNotNull() {
            addCriterion("examinationrate is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationrateEqualTo(BigDecimal value) {
            addCriterion("examinationrate =", value, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateNotEqualTo(BigDecimal value) {
            addCriterion("examinationrate <>", value, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateGreaterThan(BigDecimal value) {
            addCriterion("examinationrate >", value, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("examinationrate >=", value, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateLessThan(BigDecimal value) {
            addCriterion("examinationrate <", value, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("examinationrate <=", value, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateIn(List<BigDecimal> values) {
            addCriterion("examinationrate in", values, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateNotIn(List<BigDecimal> values) {
            addCriterion("examinationrate not in", values, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("examinationrate between", value1, value2, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andExaminationrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("examinationrate not between", value1, value2, "examinationrate");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIsNull() {
            addCriterion("totalfee is null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIsNotNull() {
            addCriterion("totalfee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeEqualTo(BigDecimal value) {
            addCriterion("totalfee =", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotEqualTo(BigDecimal value) {
            addCriterion("totalfee <>", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThan(BigDecimal value) {
            addCriterion("totalfee >", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfee >=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThan(BigDecimal value) {
            addCriterion("totalfee <", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalfee <=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIn(List<BigDecimal> values) {
            addCriterion("totalfee in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotIn(List<BigDecimal> values) {
            addCriterion("totalfee not in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfee between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalfee not between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestIsNull() {
            addCriterion("situationsuggest is null");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestIsNotNull() {
            addCriterion("situationsuggest is not null");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestEqualTo(String value) {
            addCriterion("situationsuggest =", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestNotEqualTo(String value) {
            addCriterion("situationsuggest <>", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestGreaterThan(String value) {
            addCriterion("situationsuggest >", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestGreaterThanOrEqualTo(String value) {
            addCriterion("situationsuggest >=", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestLessThan(String value) {
            addCriterion("situationsuggest <", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestLessThanOrEqualTo(String value) {
            addCriterion("situationsuggest <=", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestLike(String value) {
            addCriterion("situationsuggest like", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestNotLike(String value) {
            addCriterion("situationsuggest not like", value, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestIn(List<String> values) {
            addCriterion("situationsuggest in", values, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestNotIn(List<String> values) {
            addCriterion("situationsuggest not in", values, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestBetween(String value1, String value2) {
            addCriterion("situationsuggest between", value1, value2, "situationsuggest");
            return (Criteria) this;
        }

        public Criteria andSituationsuggestNotBetween(String value1, String value2) {
            addCriterion("situationsuggest not between", value1, value2, "situationsuggest");
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

        public Criteria andPriloanapplynoteIsNull() {
            addCriterion("priloanapplynote is null");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteIsNotNull() {
            addCriterion("priloanapplynote is not null");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteEqualTo(String value) {
            addCriterion("priloanapplynote =", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteNotEqualTo(String value) {
            addCriterion("priloanapplynote <>", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteGreaterThan(String value) {
            addCriterion("priloanapplynote >", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteGreaterThanOrEqualTo(String value) {
            addCriterion("priloanapplynote >=", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteLessThan(String value) {
            addCriterion("priloanapplynote <", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteLessThanOrEqualTo(String value) {
            addCriterion("priloanapplynote <=", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteLike(String value) {
            addCriterion("priloanapplynote like", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteNotLike(String value) {
            addCriterion("priloanapplynote not like", value, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteIn(List<String> values) {
            addCriterion("priloanapplynote in", values, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteNotIn(List<String> values) {
            addCriterion("priloanapplynote not in", values, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteBetween(String value1, String value2) {
            addCriterion("priloanapplynote between", value1, value2, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplynoteNotBetween(String value1, String value2) {
            addCriterion("priloanapplynote not between", value1, value2, "priloanapplynote");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgIsNull() {
            addCriterion("priloanapplyflg is null");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgIsNotNull() {
            addCriterion("priloanapplyflg is not null");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgEqualTo(String value) {
            addCriterion("priloanapplyflg =", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgNotEqualTo(String value) {
            addCriterion("priloanapplyflg <>", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgGreaterThan(String value) {
            addCriterion("priloanapplyflg >", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgGreaterThanOrEqualTo(String value) {
            addCriterion("priloanapplyflg >=", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgLessThan(String value) {
            addCriterion("priloanapplyflg <", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgLessThanOrEqualTo(String value) {
            addCriterion("priloanapplyflg <=", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgLike(String value) {
            addCriterion("priloanapplyflg like", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgNotLike(String value) {
            addCriterion("priloanapplyflg not like", value, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgIn(List<String> values) {
            addCriterion("priloanapplyflg in", values, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgNotIn(List<String> values) {
            addCriterion("priloanapplyflg not in", values, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgBetween(String value1, String value2) {
            addCriterion("priloanapplyflg between", value1, value2, "priloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPriloanapplyflgNotBetween(String value1, String value2) {
            addCriterion("priloanapplyflg not between", value1, value2, "priloanapplyflg");
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

        public Criteria andSuggesttakenoteIsNull() {
            addCriterion("suggesttakenote is null");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteIsNotNull() {
            addCriterion("suggesttakenote is not null");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteEqualTo(String value) {
            addCriterion("suggesttakenote =", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteNotEqualTo(String value) {
            addCriterion("suggesttakenote <>", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteGreaterThan(String value) {
            addCriterion("suggesttakenote >", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteGreaterThanOrEqualTo(String value) {
            addCriterion("suggesttakenote >=", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteLessThan(String value) {
            addCriterion("suggesttakenote <", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteLessThanOrEqualTo(String value) {
            addCriterion("suggesttakenote <=", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteLike(String value) {
            addCriterion("suggesttakenote like", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteNotLike(String value) {
            addCriterion("suggesttakenote not like", value, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteIn(List<String> values) {
            addCriterion("suggesttakenote in", values, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteNotIn(List<String> values) {
            addCriterion("suggesttakenote not in", values, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteBetween(String value1, String value2) {
            addCriterion("suggesttakenote between", value1, value2, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakenoteNotBetween(String value1, String value2) {
            addCriterion("suggesttakenote not between", value1, value2, "suggesttakenote");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgIsNull() {
            addCriterion("suggesttakeflg is null");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgIsNotNull() {
            addCriterion("suggesttakeflg is not null");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgEqualTo(String value) {
            addCriterion("suggesttakeflg =", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgNotEqualTo(String value) {
            addCriterion("suggesttakeflg <>", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgGreaterThan(String value) {
            addCriterion("suggesttakeflg >", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgGreaterThanOrEqualTo(String value) {
            addCriterion("suggesttakeflg >=", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgLessThan(String value) {
            addCriterion("suggesttakeflg <", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgLessThanOrEqualTo(String value) {
            addCriterion("suggesttakeflg <=", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgLike(String value) {
            addCriterion("suggesttakeflg like", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgNotLike(String value) {
            addCriterion("suggesttakeflg not like", value, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgIn(List<String> values) {
            addCriterion("suggesttakeflg in", values, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgNotIn(List<String> values) {
            addCriterion("suggesttakeflg not in", values, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgBetween(String value1, String value2) {
            addCriterion("suggesttakeflg between", value1, value2, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andSuggesttakeflgNotBetween(String value1, String value2) {
            addCriterion("suggesttakeflg not between", value1, value2, "suggesttakeflg");
            return (Criteria) this;
        }

        public Criteria andHavechandepositIsNull() {
            addCriterion("havechandeposit is null");
            return (Criteria) this;
        }

        public Criteria andHavechandepositIsNotNull() {
            addCriterion("havechandeposit is not null");
            return (Criteria) this;
        }

        public Criteria andHavechandepositEqualTo(String value) {
            addCriterion("havechandeposit =", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotEqualTo(String value) {
            addCriterion("havechandeposit <>", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositGreaterThan(String value) {
            addCriterion("havechandeposit >", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositGreaterThanOrEqualTo(String value) {
            addCriterion("havechandeposit >=", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositLessThan(String value) {
            addCriterion("havechandeposit <", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositLessThanOrEqualTo(String value) {
            addCriterion("havechandeposit <=", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositLike(String value) {
            addCriterion("havechandeposit like", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotLike(String value) {
            addCriterion("havechandeposit not like", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositIn(List<String> values) {
            addCriterion("havechandeposit in", values, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotIn(List<String> values) {
            addCriterion("havechandeposit not in", values, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositBetween(String value1, String value2) {
            addCriterion("havechandeposit between", value1, value2, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotBetween(String value1, String value2) {
            addCriterion("havechandeposit not between", value1, value2, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositIsNull() {
            addCriterion("singledeposit is null");
            return (Criteria) this;
        }

        public Criteria andSingledepositIsNotNull() {
            addCriterion("singledeposit is not null");
            return (Criteria) this;
        }

        public Criteria andSingledepositEqualTo(BigDecimal value) {
            addCriterion("singledeposit =", value, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositNotEqualTo(BigDecimal value) {
            addCriterion("singledeposit <>", value, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositGreaterThan(BigDecimal value) {
            addCriterion("singledeposit >", value, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("singledeposit >=", value, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositLessThan(BigDecimal value) {
            addCriterion("singledeposit <", value, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("singledeposit <=", value, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositIn(List<BigDecimal> values) {
            addCriterion("singledeposit in", values, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositNotIn(List<BigDecimal> values) {
            addCriterion("singledeposit not in", values, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singledeposit between", value1, value2, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("singledeposit not between", value1, value2, "singledeposit");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateIsNull() {
            addCriterion("singledepositdate is null");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateIsNotNull() {
            addCriterion("singledepositdate is not null");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateEqualTo(Date value) {
            addCriterion("singledepositdate =", value, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateNotEqualTo(Date value) {
            addCriterion("singledepositdate <>", value, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateGreaterThan(Date value) {
            addCriterion("singledepositdate >", value, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateGreaterThanOrEqualTo(Date value) {
            addCriterion("singledepositdate >=", value, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateLessThan(Date value) {
            addCriterion("singledepositdate <", value, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateLessThanOrEqualTo(Date value) {
            addCriterion("singledepositdate <=", value, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateIn(List<Date> values) {
            addCriterion("singledepositdate in", values, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateNotIn(List<Date> values) {
            addCriterion("singledepositdate not in", values, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateBetween(Date value1, Date value2) {
            addCriterion("singledepositdate between", value1, value2, "singledepositdate");
            return (Criteria) this;
        }

        public Criteria andSingledepositdateNotBetween(Date value1, Date value2) {
            addCriterion("singledepositdate not between", value1, value2, "singledepositdate");
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

        public Criteria andChannelsinglebondIsNull() {
            addCriterion("channelsinglebond is null");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondIsNotNull() {
            addCriterion("channelsinglebond is not null");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond =", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondNotEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond <>", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondGreaterThan(BigDecimal value) {
            addCriterion("channelsinglebond >", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond >=", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondLessThan(BigDecimal value) {
            addCriterion("channelsinglebond <", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondLessThanOrEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond <=", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondIn(List<BigDecimal> values) {
            addCriterion("channelsinglebond in", values, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondNotIn(List<BigDecimal> values) {
            addCriterion("channelsinglebond not in", values, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channelsinglebond between", value1, value2, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channelsinglebond not between", value1, value2, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeIsNull() {
            addCriterion("chargesbefore is null");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeIsNotNull() {
            addCriterion("chargesbefore is not null");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeEqualTo(BigDecimal value) {
            addCriterion("chargesbefore =", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeNotEqualTo(BigDecimal value) {
            addCriterion("chargesbefore <>", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeGreaterThan(BigDecimal value) {
            addCriterion("chargesbefore >", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chargesbefore >=", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeLessThan(BigDecimal value) {
            addCriterion("chargesbefore <", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chargesbefore <=", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeIn(List<BigDecimal> values) {
            addCriterion("chargesbefore in", values, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeNotIn(List<BigDecimal> values) {
            addCriterion("chargesbefore not in", values, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargesbefore between", value1, value2, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargesbefore not between", value1, value2, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestIsNull() {
            addCriterion("custprepaidinterest is null");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestIsNotNull() {
            addCriterion("custprepaidinterest is not null");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest =", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestNotEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest <>", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestGreaterThan(BigDecimal value) {
            addCriterion("custprepaidinterest >", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest >=", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestLessThan(BigDecimal value) {
            addCriterion("custprepaidinterest <", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest <=", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestIn(List<BigDecimal> values) {
            addCriterion("custprepaidinterest in", values, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestNotIn(List<BigDecimal> values) {
            addCriterion("custprepaidinterest not in", values, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custprepaidinterest between", value1, value2, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custprepaidinterest not between", value1, value2, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andActualdaysIsNull() {
            addCriterion("actualdays is null");
            return (Criteria) this;
        }

        public Criteria andActualdaysIsNotNull() {
            addCriterion("actualdays is not null");
            return (Criteria) this;
        }

        public Criteria andActualdaysEqualTo(String value) {
            addCriterion("actualdays =", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotEqualTo(String value) {
            addCriterion("actualdays <>", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysGreaterThan(String value) {
            addCriterion("actualdays >", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysGreaterThanOrEqualTo(String value) {
            addCriterion("actualdays >=", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysLessThan(String value) {
            addCriterion("actualdays <", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysLessThanOrEqualTo(String value) {
            addCriterion("actualdays <=", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysLike(String value) {
            addCriterion("actualdays like", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotLike(String value) {
            addCriterion("actualdays not like", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysIn(List<String> values) {
            addCriterion("actualdays in", values, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotIn(List<String> values) {
            addCriterion("actualdays not in", values, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysBetween(String value1, String value2) {
            addCriterion("actualdays between", value1, value2, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotBetween(String value1, String value2) {
            addCriterion("actualdays not between", value1, value2, "actualdays");
            return (Criteria) this;
        }

        public Criteria andHavebackprocIsNull() {
            addCriterion("havebackproc is null");
            return (Criteria) this;
        }

        public Criteria andHavebackprocIsNotNull() {
            addCriterion("havebackproc is not null");
            return (Criteria) this;
        }

        public Criteria andHavebackprocEqualTo(String value) {
            addCriterion("havebackproc =", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocNotEqualTo(String value) {
            addCriterion("havebackproc <>", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocGreaterThan(String value) {
            addCriterion("havebackproc >", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocGreaterThanOrEqualTo(String value) {
            addCriterion("havebackproc >=", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocLessThan(String value) {
            addCriterion("havebackproc <", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocLessThanOrEqualTo(String value) {
            addCriterion("havebackproc <=", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocLike(String value) {
            addCriterion("havebackproc like", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocNotLike(String value) {
            addCriterion("havebackproc not like", value, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocIn(List<String> values) {
            addCriterion("havebackproc in", values, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocNotIn(List<String> values) {
            addCriterion("havebackproc not in", values, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocBetween(String value1, String value2) {
            addCriterion("havebackproc between", value1, value2, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andHavebackprocNotBetween(String value1, String value2) {
            addCriterion("havebackproc not between", value1, value2, "havebackproc");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableIsNull() {
            addCriterion("interestreceivable is null");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableIsNotNull() {
            addCriterion("interestreceivable is not null");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableEqualTo(BigDecimal value) {
            addCriterion("interestreceivable =", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableNotEqualTo(BigDecimal value) {
            addCriterion("interestreceivable <>", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableGreaterThan(BigDecimal value) {
            addCriterion("interestreceivable >", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interestreceivable >=", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableLessThan(BigDecimal value) {
            addCriterion("interestreceivable <", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interestreceivable <=", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableIn(List<BigDecimal> values) {
            addCriterion("interestreceivable in", values, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableNotIn(List<BigDecimal> values) {
            addCriterion("interestreceivable not in", values, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestreceivable between", value1, value2, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestreceivable not between", value1, value2, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgIsNull() {
            addCriterion("notarizationflg is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgIsNotNull() {
            addCriterion("notarizationflg is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgEqualTo(String value) {
            addCriterion("notarizationflg =", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgNotEqualTo(String value) {
            addCriterion("notarizationflg <>", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgGreaterThan(String value) {
            addCriterion("notarizationflg >", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgGreaterThanOrEqualTo(String value) {
            addCriterion("notarizationflg >=", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgLessThan(String value) {
            addCriterion("notarizationflg <", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgLessThanOrEqualTo(String value) {
            addCriterion("notarizationflg <=", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgLike(String value) {
            addCriterion("notarizationflg like", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgNotLike(String value) {
            addCriterion("notarizationflg not like", value, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgIn(List<String> values) {
            addCriterion("notarizationflg in", values, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgNotIn(List<String> values) {
            addCriterion("notarizationflg not in", values, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgBetween(String value1, String value2) {
            addCriterion("notarizationflg between", value1, value2, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationflgNotBetween(String value1, String value2) {
            addCriterion("notarizationflg not between", value1, value2, "notarizationflg");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteIsNull() {
            addCriterion("notarizationnote is null");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteIsNotNull() {
            addCriterion("notarizationnote is not null");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteEqualTo(String value) {
            addCriterion("notarizationnote =", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteNotEqualTo(String value) {
            addCriterion("notarizationnote <>", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteGreaterThan(String value) {
            addCriterion("notarizationnote >", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteGreaterThanOrEqualTo(String value) {
            addCriterion("notarizationnote >=", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteLessThan(String value) {
            addCriterion("notarizationnote <", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteLessThanOrEqualTo(String value) {
            addCriterion("notarizationnote <=", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteLike(String value) {
            addCriterion("notarizationnote like", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteNotLike(String value) {
            addCriterion("notarizationnote not like", value, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteIn(List<String> values) {
            addCriterion("notarizationnote in", values, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteNotIn(List<String> values) {
            addCriterion("notarizationnote not in", values, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteBetween(String value1, String value2) {
            addCriterion("notarizationnote between", value1, value2, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andNotarizationnoteNotBetween(String value1, String value2) {
            addCriterion("notarizationnote not between", value1, value2, "notarizationnote");
            return (Criteria) this;
        }

        public Criteria andBackcardflgIsNull() {
            addCriterion("backcardflg is null");
            return (Criteria) this;
        }

        public Criteria andBackcardflgIsNotNull() {
            addCriterion("backcardflg is not null");
            return (Criteria) this;
        }

        public Criteria andBackcardflgEqualTo(String value) {
            addCriterion("backcardflg =", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgNotEqualTo(String value) {
            addCriterion("backcardflg <>", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgGreaterThan(String value) {
            addCriterion("backcardflg >", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgGreaterThanOrEqualTo(String value) {
            addCriterion("backcardflg >=", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgLessThan(String value) {
            addCriterion("backcardflg <", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgLessThanOrEqualTo(String value) {
            addCriterion("backcardflg <=", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgLike(String value) {
            addCriterion("backcardflg like", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgNotLike(String value) {
            addCriterion("backcardflg not like", value, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgIn(List<String> values) {
            addCriterion("backcardflg in", values, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgNotIn(List<String> values) {
            addCriterion("backcardflg not in", values, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgBetween(String value1, String value2) {
            addCriterion("backcardflg between", value1, value2, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardflgNotBetween(String value1, String value2) {
            addCriterion("backcardflg not between", value1, value2, "backcardflg");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteIsNull() {
            addCriterion("backcardnote is null");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteIsNotNull() {
            addCriterion("backcardnote is not null");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteEqualTo(String value) {
            addCriterion("backcardnote =", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteNotEqualTo(String value) {
            addCriterion("backcardnote <>", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteGreaterThan(String value) {
            addCriterion("backcardnote >", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteGreaterThanOrEqualTo(String value) {
            addCriterion("backcardnote >=", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteLessThan(String value) {
            addCriterion("backcardnote <", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteLessThanOrEqualTo(String value) {
            addCriterion("backcardnote <=", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteLike(String value) {
            addCriterion("backcardnote like", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteNotLike(String value) {
            addCriterion("backcardnote not like", value, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteIn(List<String> values) {
            addCriterion("backcardnote in", values, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteNotIn(List<String> values) {
            addCriterion("backcardnote not in", values, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteBetween(String value1, String value2) {
            addCriterion("backcardnote between", value1, value2, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andBackcardnoteNotBetween(String value1, String value2) {
            addCriterion("backcardnote not between", value1, value2, "backcardnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgIsNull() {
            addCriterion("redempbuildingflg is null");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgIsNotNull() {
            addCriterion("redempbuildingflg is not null");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgEqualTo(String value) {
            addCriterion("redempbuildingflg =", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgNotEqualTo(String value) {
            addCriterion("redempbuildingflg <>", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgGreaterThan(String value) {
            addCriterion("redempbuildingflg >", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgGreaterThanOrEqualTo(String value) {
            addCriterion("redempbuildingflg >=", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgLessThan(String value) {
            addCriterion("redempbuildingflg <", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgLessThanOrEqualTo(String value) {
            addCriterion("redempbuildingflg <=", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgLike(String value) {
            addCriterion("redempbuildingflg like", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgNotLike(String value) {
            addCriterion("redempbuildingflg not like", value, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgIn(List<String> values) {
            addCriterion("redempbuildingflg in", values, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgNotIn(List<String> values) {
            addCriterion("redempbuildingflg not in", values, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgBetween(String value1, String value2) {
            addCriterion("redempbuildingflg between", value1, value2, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingflgNotBetween(String value1, String value2) {
            addCriterion("redempbuildingflg not between", value1, value2, "redempbuildingflg");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteIsNull() {
            addCriterion("redempbuildingnote is null");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteIsNotNull() {
            addCriterion("redempbuildingnote is not null");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteEqualTo(String value) {
            addCriterion("redempbuildingnote =", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteNotEqualTo(String value) {
            addCriterion("redempbuildingnote <>", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteGreaterThan(String value) {
            addCriterion("redempbuildingnote >", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteGreaterThanOrEqualTo(String value) {
            addCriterion("redempbuildingnote >=", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteLessThan(String value) {
            addCriterion("redempbuildingnote <", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteLessThanOrEqualTo(String value) {
            addCriterion("redempbuildingnote <=", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteLike(String value) {
            addCriterion("redempbuildingnote like", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteNotLike(String value) {
            addCriterion("redempbuildingnote not like", value, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteIn(List<String> values) {
            addCriterion("redempbuildingnote in", values, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteNotIn(List<String> values) {
            addCriterion("redempbuildingnote not in", values, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteBetween(String value1, String value2) {
            addCriterion("redempbuildingnote between", value1, value2, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andRedempbuildingnoteNotBetween(String value1, String value2) {
            addCriterion("redempbuildingnote not between", value1, value2, "redempbuildingnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgIsNull() {
            addCriterion("outandinaccountflg is null");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgIsNotNull() {
            addCriterion("outandinaccountflg is not null");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgEqualTo(String value) {
            addCriterion("outandinaccountflg =", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgNotEqualTo(String value) {
            addCriterion("outandinaccountflg <>", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgGreaterThan(String value) {
            addCriterion("outandinaccountflg >", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgGreaterThanOrEqualTo(String value) {
            addCriterion("outandinaccountflg >=", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgLessThan(String value) {
            addCriterion("outandinaccountflg <", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgLessThanOrEqualTo(String value) {
            addCriterion("outandinaccountflg <=", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgLike(String value) {
            addCriterion("outandinaccountflg like", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgNotLike(String value) {
            addCriterion("outandinaccountflg not like", value, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgIn(List<String> values) {
            addCriterion("outandinaccountflg in", values, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgNotIn(List<String> values) {
            addCriterion("outandinaccountflg not in", values, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgBetween(String value1, String value2) {
            addCriterion("outandinaccountflg between", value1, value2, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountflgNotBetween(String value1, String value2) {
            addCriterion("outandinaccountflg not between", value1, value2, "outandinaccountflg");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteIsNull() {
            addCriterion("outandinaccountnote is null");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteIsNotNull() {
            addCriterion("outandinaccountnote is not null");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteEqualTo(String value) {
            addCriterion("outandinaccountnote =", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteNotEqualTo(String value) {
            addCriterion("outandinaccountnote <>", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteGreaterThan(String value) {
            addCriterion("outandinaccountnote >", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteGreaterThanOrEqualTo(String value) {
            addCriterion("outandinaccountnote >=", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteLessThan(String value) {
            addCriterion("outandinaccountnote <", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteLessThanOrEqualTo(String value) {
            addCriterion("outandinaccountnote <=", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteLike(String value) {
            addCriterion("outandinaccountnote like", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteNotLike(String value) {
            addCriterion("outandinaccountnote not like", value, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteIn(List<String> values) {
            addCriterion("outandinaccountnote in", values, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteNotIn(List<String> values) {
            addCriterion("outandinaccountnote not in", values, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteBetween(String value1, String value2) {
            addCriterion("outandinaccountnote between", value1, value2, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andOutandinaccountnoteNotBetween(String value1, String value2) {
            addCriterion("outandinaccountnote not between", value1, value2, "outandinaccountnote");
            return (Criteria) this;
        }

        public Criteria andFacesignflgIsNull() {
            addCriterion("facesignflg is null");
            return (Criteria) this;
        }

        public Criteria andFacesignflgIsNotNull() {
            addCriterion("facesignflg is not null");
            return (Criteria) this;
        }

        public Criteria andFacesignflgEqualTo(String value) {
            addCriterion("facesignflg =", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotEqualTo(String value) {
            addCriterion("facesignflg <>", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgGreaterThan(String value) {
            addCriterion("facesignflg >", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgGreaterThanOrEqualTo(String value) {
            addCriterion("facesignflg >=", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgLessThan(String value) {
            addCriterion("facesignflg <", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgLessThanOrEqualTo(String value) {
            addCriterion("facesignflg <=", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgLike(String value) {
            addCriterion("facesignflg like", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotLike(String value) {
            addCriterion("facesignflg not like", value, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgIn(List<String> values) {
            addCriterion("facesignflg in", values, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotIn(List<String> values) {
            addCriterion("facesignflg not in", values, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgBetween(String value1, String value2) {
            addCriterion("facesignflg between", value1, value2, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignflgNotBetween(String value1, String value2) {
            addCriterion("facesignflg not between", value1, value2, "facesignflg");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteIsNull() {
            addCriterion("facesignnote is null");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteIsNotNull() {
            addCriterion("facesignnote is not null");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteEqualTo(String value) {
            addCriterion("facesignnote =", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteNotEqualTo(String value) {
            addCriterion("facesignnote <>", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteGreaterThan(String value) {
            addCriterion("facesignnote >", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteGreaterThanOrEqualTo(String value) {
            addCriterion("facesignnote >=", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteLessThan(String value) {
            addCriterion("facesignnote <", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteLessThanOrEqualTo(String value) {
            addCriterion("facesignnote <=", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteLike(String value) {
            addCriterion("facesignnote like", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteNotLike(String value) {
            addCriterion("facesignnote not like", value, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteIn(List<String> values) {
            addCriterion("facesignnote in", values, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteNotIn(List<String> values) {
            addCriterion("facesignnote not in", values, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteBetween(String value1, String value2) {
            addCriterion("facesignnote between", value1, value2, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andFacesignnoteNotBetween(String value1, String value2) {
            addCriterion("facesignnote not between", value1, value2, "facesignnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgIsNull() {
            addCriterion("publiccardflg is null");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgIsNotNull() {
            addCriterion("publiccardflg is not null");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgEqualTo(String value) {
            addCriterion("publiccardflg =", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgNotEqualTo(String value) {
            addCriterion("publiccardflg <>", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgGreaterThan(String value) {
            addCriterion("publiccardflg >", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgGreaterThanOrEqualTo(String value) {
            addCriterion("publiccardflg >=", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgLessThan(String value) {
            addCriterion("publiccardflg <", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgLessThanOrEqualTo(String value) {
            addCriterion("publiccardflg <=", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgLike(String value) {
            addCriterion("publiccardflg like", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgNotLike(String value) {
            addCriterion("publiccardflg not like", value, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgIn(List<String> values) {
            addCriterion("publiccardflg in", values, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgNotIn(List<String> values) {
            addCriterion("publiccardflg not in", values, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgBetween(String value1, String value2) {
            addCriterion("publiccardflg between", value1, value2, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardflgNotBetween(String value1, String value2) {
            addCriterion("publiccardflg not between", value1, value2, "publiccardflg");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteIsNull() {
            addCriterion("publiccardnote is null");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteIsNotNull() {
            addCriterion("publiccardnote is not null");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteEqualTo(String value) {
            addCriterion("publiccardnote =", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteNotEqualTo(String value) {
            addCriterion("publiccardnote <>", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteGreaterThan(String value) {
            addCriterion("publiccardnote >", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteGreaterThanOrEqualTo(String value) {
            addCriterion("publiccardnote >=", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteLessThan(String value) {
            addCriterion("publiccardnote <", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteLessThanOrEqualTo(String value) {
            addCriterion("publiccardnote <=", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteLike(String value) {
            addCriterion("publiccardnote like", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteNotLike(String value) {
            addCriterion("publiccardnote not like", value, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteIn(List<String> values) {
            addCriterion("publiccardnote in", values, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteNotIn(List<String> values) {
            addCriterion("publiccardnote not in", values, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteBetween(String value1, String value2) {
            addCriterion("publiccardnote between", value1, value2, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andPubliccardnoteNotBetween(String value1, String value2) {
            addCriterion("publiccardnote not between", value1, value2, "publiccardnote");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andBnkIsNull() {
            addCriterion("bnk is null");
            return (Criteria) this;
        }

        public Criteria andBnkIsNotNull() {
            addCriterion("bnk is not null");
            return (Criteria) this;
        }

        public Criteria andBnkEqualTo(String value) {
            addCriterion("bnk =", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotEqualTo(String value) {
            addCriterion("bnk <>", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkGreaterThan(String value) {
            addCriterion("bnk >", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkGreaterThanOrEqualTo(String value) {
            addCriterion("bnk >=", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkLessThan(String value) {
            addCriterion("bnk <", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkLessThanOrEqualTo(String value) {
            addCriterion("bnk <=", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkLike(String value) {
            addCriterion("bnk like", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotLike(String value) {
            addCriterion("bnk not like", value, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkIn(List<String> values) {
            addCriterion("bnk in", values, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotIn(List<String> values) {
            addCriterion("bnk not in", values, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkBetween(String value1, String value2) {
            addCriterion("bnk between", value1, value2, "bnk");
            return (Criteria) this;
        }

        public Criteria andBnkNotBetween(String value1, String value2) {
            addCriterion("bnk not between", value1, value2, "bnk");
            return (Criteria) this;
        }

        public Criteria andServicechargeIsNull() {
            addCriterion("servicecharge is null");
            return (Criteria) this;
        }

        public Criteria andServicechargeIsNotNull() {
            addCriterion("servicecharge is not null");
            return (Criteria) this;
        }

        public Criteria andServicechargeEqualTo(BigDecimal value) {
            addCriterion("servicecharge =", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeNotEqualTo(BigDecimal value) {
            addCriterion("servicecharge <>", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeGreaterThan(BigDecimal value) {
            addCriterion("servicecharge >", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("servicecharge >=", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeLessThan(BigDecimal value) {
            addCriterion("servicecharge <", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("servicecharge <=", value, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeIn(List<BigDecimal> values) {
            addCriterion("servicecharge in", values, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeNotIn(List<BigDecimal> values) {
            addCriterion("servicecharge not in", values, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("servicecharge between", value1, value2, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andServicechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("servicecharge not between", value1, value2, "servicecharge");
            return (Criteria) this;
        }

        public Criteria andProxyrateIsNull() {
            addCriterion("proxyrate is null");
            return (Criteria) this;
        }

        public Criteria andProxyrateIsNotNull() {
            addCriterion("proxyrate is not null");
            return (Criteria) this;
        }

        public Criteria andProxyrateEqualTo(BigDecimal value) {
            addCriterion("proxyrate =", value, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateNotEqualTo(BigDecimal value) {
            addCriterion("proxyrate <>", value, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateGreaterThan(BigDecimal value) {
            addCriterion("proxyrate >", value, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("proxyrate >=", value, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateLessThan(BigDecimal value) {
            addCriterion("proxyrate <", value, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("proxyrate <=", value, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateIn(List<BigDecimal> values) {
            addCriterion("proxyrate in", values, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateNotIn(List<BigDecimal> values) {
            addCriterion("proxyrate not in", values, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proxyrate between", value1, value2, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxyrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proxyrate not between", value1, value2, "proxyrate");
            return (Criteria) this;
        }

        public Criteria andProxychargeIsNull() {
            addCriterion("proxycharge is null");
            return (Criteria) this;
        }

        public Criteria andProxychargeIsNotNull() {
            addCriterion("proxycharge is not null");
            return (Criteria) this;
        }

        public Criteria andProxychargeEqualTo(BigDecimal value) {
            addCriterion("proxycharge =", value, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeNotEqualTo(BigDecimal value) {
            addCriterion("proxycharge <>", value, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeGreaterThan(BigDecimal value) {
            addCriterion("proxycharge >", value, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("proxycharge >=", value, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeLessThan(BigDecimal value) {
            addCriterion("proxycharge <", value, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("proxycharge <=", value, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeIn(List<BigDecimal> values) {
            addCriterion("proxycharge in", values, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeNotIn(List<BigDecimal> values) {
            addCriterion("proxycharge not in", values, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proxycharge between", value1, value2, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andProxychargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proxycharge not between", value1, value2, "proxycharge");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeIsNull() {
            addCriterion("examinationfee is null");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeIsNotNull() {
            addCriterion("examinationfee is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeEqualTo(BigDecimal value) {
            addCriterion("examinationfee =", value, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeNotEqualTo(BigDecimal value) {
            addCriterion("examinationfee <>", value, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeGreaterThan(BigDecimal value) {
            addCriterion("examinationfee >", value, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("examinationfee >=", value, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeLessThan(BigDecimal value) {
            addCriterion("examinationfee <", value, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("examinationfee <=", value, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeIn(List<BigDecimal> values) {
            addCriterion("examinationfee in", values, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeNotIn(List<BigDecimal> values) {
            addCriterion("examinationfee not in", values, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("examinationfee between", value1, value2, "examinationfee");
            return (Criteria) this;
        }

        public Criteria andExaminationfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("examinationfee not between", value1, value2, "examinationfee");
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