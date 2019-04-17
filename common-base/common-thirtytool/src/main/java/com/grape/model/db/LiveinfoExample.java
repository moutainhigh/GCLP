package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveinfoExample() {
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

        public Criteria andMortgagenoIsNull() {
            addCriterion("mortgageno is null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoIsNotNull() {
            addCriterion("mortgageno is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoEqualTo(String value) {
            addCriterion("mortgageno =", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotEqualTo(String value) {
            addCriterion("mortgageno <>", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoGreaterThan(String value) {
            addCriterion("mortgageno >", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageno >=", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLessThan(String value) {
            addCriterion("mortgageno <", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLessThanOrEqualTo(String value) {
            addCriterion("mortgageno <=", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLike(String value) {
            addCriterion("mortgageno like", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotLike(String value) {
            addCriterion("mortgageno not like", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoIn(List<String> values) {
            addCriterion("mortgageno in", values, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotIn(List<String> values) {
            addCriterion("mortgageno not in", values, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoBetween(String value1, String value2) {
            addCriterion("mortgageno between", value1, value2, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotBetween(String value1, String value2) {
            addCriterion("mortgageno not between", value1, value2, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andLivepersonIsNull() {
            addCriterion("liveperson is null");
            return (Criteria) this;
        }

        public Criteria andLivepersonIsNotNull() {
            addCriterion("liveperson is not null");
            return (Criteria) this;
        }

        public Criteria andLivepersonEqualTo(String value) {
            addCriterion("liveperson =", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonNotEqualTo(String value) {
            addCriterion("liveperson <>", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonGreaterThan(String value) {
            addCriterion("liveperson >", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonGreaterThanOrEqualTo(String value) {
            addCriterion("liveperson >=", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonLessThan(String value) {
            addCriterion("liveperson <", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonLessThanOrEqualTo(String value) {
            addCriterion("liveperson <=", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonLike(String value) {
            addCriterion("liveperson like", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonNotLike(String value) {
            addCriterion("liveperson not like", value, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonIn(List<String> values) {
            addCriterion("liveperson in", values, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonNotIn(List<String> values) {
            addCriterion("liveperson not in", values, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonBetween(String value1, String value2) {
            addCriterion("liveperson between", value1, value2, "liveperson");
            return (Criteria) this;
        }

        public Criteria andLivepersonNotBetween(String value1, String value2) {
            addCriterion("liveperson not between", value1, value2, "liveperson");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNull() {
            addCriterion("monitor is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIsNotNull() {
            addCriterion("monitor is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorEqualTo(String value) {
            addCriterion("monitor =", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotEqualTo(String value) {
            addCriterion("monitor <>", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThan(String value) {
            addCriterion("monitor >", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorGreaterThanOrEqualTo(String value) {
            addCriterion("monitor >=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThan(String value) {
            addCriterion("monitor <", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLessThanOrEqualTo(String value) {
            addCriterion("monitor <=", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorLike(String value) {
            addCriterion("monitor like", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotLike(String value) {
            addCriterion("monitor not like", value, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorIn(List<String> values) {
            addCriterion("monitor in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotIn(List<String> values) {
            addCriterion("monitor not in", values, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorBetween(String value1, String value2) {
            addCriterion("monitor between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andMonitorNotBetween(String value1, String value2) {
            addCriterion("monitor not between", value1, value2, "monitor");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeIsNull() {
            addCriterion("livestarttime is null");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeIsNotNull() {
            addCriterion("livestarttime is not null");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeEqualTo(Date value) {
            addCriterion("livestarttime =", value, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeNotEqualTo(Date value) {
            addCriterion("livestarttime <>", value, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeGreaterThan(Date value) {
            addCriterion("livestarttime >", value, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("livestarttime >=", value, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeLessThan(Date value) {
            addCriterion("livestarttime <", value, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeLessThanOrEqualTo(Date value) {
            addCriterion("livestarttime <=", value, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeIn(List<Date> values) {
            addCriterion("livestarttime in", values, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeNotIn(List<Date> values) {
            addCriterion("livestarttime not in", values, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeBetween(Date value1, Date value2) {
            addCriterion("livestarttime between", value1, value2, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLivestarttimeNotBetween(Date value1, Date value2) {
            addCriterion("livestarttime not between", value1, value2, "livestarttime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeIsNull() {
            addCriterion("liveendtime is null");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeIsNotNull() {
            addCriterion("liveendtime is not null");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeEqualTo(Date value) {
            addCriterion("liveendtime =", value, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeNotEqualTo(Date value) {
            addCriterion("liveendtime <>", value, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeGreaterThan(Date value) {
            addCriterion("liveendtime >", value, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("liveendtime >=", value, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeLessThan(Date value) {
            addCriterion("liveendtime <", value, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeLessThanOrEqualTo(Date value) {
            addCriterion("liveendtime <=", value, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeIn(List<Date> values) {
            addCriterion("liveendtime in", values, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeNotIn(List<Date> values) {
            addCriterion("liveendtime not in", values, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeBetween(Date value1, Date value2) {
            addCriterion("liveendtime between", value1, value2, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andLiveendtimeNotBetween(Date value1, Date value2) {
            addCriterion("liveendtime not between", value1, value2, "liveendtime");
            return (Criteria) this;
        }

        public Criteria andIsliveIsNull() {
            addCriterion("islive is null");
            return (Criteria) this;
        }

        public Criteria andIsliveIsNotNull() {
            addCriterion("islive is not null");
            return (Criteria) this;
        }

        public Criteria andIsliveEqualTo(String value) {
            addCriterion("islive =", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveNotEqualTo(String value) {
            addCriterion("islive <>", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveGreaterThan(String value) {
            addCriterion("islive >", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveGreaterThanOrEqualTo(String value) {
            addCriterion("islive >=", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveLessThan(String value) {
            addCriterion("islive <", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveLessThanOrEqualTo(String value) {
            addCriterion("islive <=", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveLike(String value) {
            addCriterion("islive like", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveNotLike(String value) {
            addCriterion("islive not like", value, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveIn(List<String> values) {
            addCriterion("islive in", values, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveNotIn(List<String> values) {
            addCriterion("islive not in", values, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveBetween(String value1, String value2) {
            addCriterion("islive between", value1, value2, "islive");
            return (Criteria) this;
        }

        public Criteria andIsliveNotBetween(String value1, String value2) {
            addCriterion("islive not between", value1, value2, "islive");
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