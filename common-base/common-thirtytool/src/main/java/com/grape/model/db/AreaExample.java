package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("areaid like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("areaid not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaname is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaname is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaname =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaname <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaname >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaname >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaname <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaname <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaname like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaname not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaname in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaname not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaname between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaname not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaIsNull() {
            addCriterion("superiorarea is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaIsNotNull() {
            addCriterion("superiorarea is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaEqualTo(String value) {
            addCriterion("superiorarea =", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaNotEqualTo(String value) {
            addCriterion("superiorarea <>", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaGreaterThan(String value) {
            addCriterion("superiorarea >", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaGreaterThanOrEqualTo(String value) {
            addCriterion("superiorarea >=", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaLessThan(String value) {
            addCriterion("superiorarea <", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaLessThanOrEqualTo(String value) {
            addCriterion("superiorarea <=", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaLike(String value) {
            addCriterion("superiorarea like", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaNotLike(String value) {
            addCriterion("superiorarea not like", value, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaIn(List<String> values) {
            addCriterion("superiorarea in", values, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaNotIn(List<String> values) {
            addCriterion("superiorarea not in", values, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaBetween(String value1, String value2) {
            addCriterion("superiorarea between", value1, value2, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andSuperiorareaNotBetween(String value1, String value2) {
            addCriterion("superiorarea not between", value1, value2, "superiorarea");
            return (Criteria) this;
        }

        public Criteria andAgentclassIsNull() {
            addCriterion("agentclass is null");
            return (Criteria) this;
        }

        public Criteria andAgentclassIsNotNull() {
            addCriterion("agentclass is not null");
            return (Criteria) this;
        }

        public Criteria andAgentclassEqualTo(String value) {
            addCriterion("agentclass =", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassNotEqualTo(String value) {
            addCriterion("agentclass <>", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassGreaterThan(String value) {
            addCriterion("agentclass >", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassGreaterThanOrEqualTo(String value) {
            addCriterion("agentclass >=", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassLessThan(String value) {
            addCriterion("agentclass <", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassLessThanOrEqualTo(String value) {
            addCriterion("agentclass <=", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassLike(String value) {
            addCriterion("agentclass like", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassNotLike(String value) {
            addCriterion("agentclass not like", value, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassIn(List<String> values) {
            addCriterion("agentclass in", values, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassNotIn(List<String> values) {
            addCriterion("agentclass not in", values, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassBetween(String value1, String value2) {
            addCriterion("agentclass between", value1, value2, "agentclass");
            return (Criteria) this;
        }

        public Criteria andAgentclassNotBetween(String value1, String value2) {
            addCriterion("agentclass not between", value1, value2, "agentclass");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleIsNull() {
            addCriterion("islimitsale is null");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleIsNotNull() {
            addCriterion("islimitsale is not null");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleEqualTo(String value) {
            addCriterion("islimitsale =", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleNotEqualTo(String value) {
            addCriterion("islimitsale <>", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleGreaterThan(String value) {
            addCriterion("islimitsale >", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleGreaterThanOrEqualTo(String value) {
            addCriterion("islimitsale >=", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleLessThan(String value) {
            addCriterion("islimitsale <", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleLessThanOrEqualTo(String value) {
            addCriterion("islimitsale <=", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleLike(String value) {
            addCriterion("islimitsale like", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleNotLike(String value) {
            addCriterion("islimitsale not like", value, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleIn(List<String> values) {
            addCriterion("islimitsale in", values, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleNotIn(List<String> values) {
            addCriterion("islimitsale not in", values, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleBetween(String value1, String value2) {
            addCriterion("islimitsale between", value1, value2, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andIslimitsaleNotBetween(String value1, String value2) {
            addCriterion("islimitsale not between", value1, value2, "islimitsale");
            return (Criteria) this;
        }

        public Criteria andAreaweightIsNull() {
            addCriterion("areaweight is null");
            return (Criteria) this;
        }

        public Criteria andAreaweightIsNotNull() {
            addCriterion("areaweight is not null");
            return (Criteria) this;
        }

        public Criteria andAreaweightEqualTo(BigDecimal value) {
            addCriterion("areaweight =", value, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightNotEqualTo(BigDecimal value) {
            addCriterion("areaweight <>", value, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightGreaterThan(BigDecimal value) {
            addCriterion("areaweight >", value, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("areaweight >=", value, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightLessThan(BigDecimal value) {
            addCriterion("areaweight <", value, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("areaweight <=", value, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightIn(List<BigDecimal> values) {
            addCriterion("areaweight in", values, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightNotIn(List<BigDecimal> values) {
            addCriterion("areaweight not in", values, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("areaweight between", value1, value2, "areaweight");
            return (Criteria) this;
        }

        public Criteria andAreaweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("areaweight not between", value1, value2, "areaweight");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearIsNull() {
            addCriterion("limitsaleyear is null");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearIsNotNull() {
            addCriterion("limitsaleyear is not null");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearEqualTo(String value) {
            addCriterion("limitsaleyear =", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearNotEqualTo(String value) {
            addCriterion("limitsaleyear <>", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearGreaterThan(String value) {
            addCriterion("limitsaleyear >", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearGreaterThanOrEqualTo(String value) {
            addCriterion("limitsaleyear >=", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearLessThan(String value) {
            addCriterion("limitsaleyear <", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearLessThanOrEqualTo(String value) {
            addCriterion("limitsaleyear <=", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearLike(String value) {
            addCriterion("limitsaleyear like", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearNotLike(String value) {
            addCriterion("limitsaleyear not like", value, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearIn(List<String> values) {
            addCriterion("limitsaleyear in", values, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearNotIn(List<String> values) {
            addCriterion("limitsaleyear not in", values, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearBetween(String value1, String value2) {
            addCriterion("limitsaleyear between", value1, value2, "limitsaleyear");
            return (Criteria) this;
        }

        public Criteria andLimitsaleyearNotBetween(String value1, String value2) {
            addCriterion("limitsaleyear not between", value1, value2, "limitsaleyear");
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

        public Criteria andGbcodeIsNull() {
            addCriterion("gbcode is null");
            return (Criteria) this;
        }

        public Criteria andGbcodeIsNotNull() {
            addCriterion("gbcode is not null");
            return (Criteria) this;
        }

        public Criteria andGbcodeEqualTo(String value) {
            addCriterion("gbcode =", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeNotEqualTo(String value) {
            addCriterion("gbcode <>", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeGreaterThan(String value) {
            addCriterion("gbcode >", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeGreaterThanOrEqualTo(String value) {
            addCriterion("gbcode >=", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeLessThan(String value) {
            addCriterion("gbcode <", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeLessThanOrEqualTo(String value) {
            addCriterion("gbcode <=", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeLike(String value) {
            addCriterion("gbcode like", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeNotLike(String value) {
            addCriterion("gbcode not like", value, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeIn(List<String> values) {
            addCriterion("gbcode in", values, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeNotIn(List<String> values) {
            addCriterion("gbcode not in", values, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeBetween(String value1, String value2) {
            addCriterion("gbcode between", value1, value2, "gbcode");
            return (Criteria) this;
        }

        public Criteria andGbcodeNotBetween(String value1, String value2) {
            addCriterion("gbcode not between", value1, value2, "gbcode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNull() {
            addCriterion("areacode is null");
            return (Criteria) this;
        }

        public Criteria andAreacodeIsNotNull() {
            addCriterion("areacode is not null");
            return (Criteria) this;
        }

        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("areacode =", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotEqualTo(String value) {
            addCriterion("areacode <>", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThan(String value) {
            addCriterion("areacode >", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeGreaterThanOrEqualTo(String value) {
            addCriterion("areacode >=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThan(String value) {
            addCriterion("areacode <", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLessThanOrEqualTo(String value) {
            addCriterion("areacode <=", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeLike(String value) {
            addCriterion("areacode like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotLike(String value) {
            addCriterion("areacode not like", value, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeIn(List<String> values) {
            addCriterion("areacode in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotIn(List<String> values) {
            addCriterion("areacode not in", values, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeBetween(String value1, String value2) {
            addCriterion("areacode between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreacodeNotBetween(String value1, String value2) {
            addCriterion("areacode not between", value1, value2, "areacode");
            return (Criteria) this;
        }

        public Criteria andAreatypeIsNull() {
            addCriterion("areatype is null");
            return (Criteria) this;
        }

        public Criteria andAreatypeIsNotNull() {
            addCriterion("areatype is not null");
            return (Criteria) this;
        }

        public Criteria andAreatypeEqualTo(String value) {
            addCriterion("areatype =", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeNotEqualTo(String value) {
            addCriterion("areatype <>", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeGreaterThan(String value) {
            addCriterion("areatype >", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeGreaterThanOrEqualTo(String value) {
            addCriterion("areatype >=", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeLessThan(String value) {
            addCriterion("areatype <", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeLessThanOrEqualTo(String value) {
            addCriterion("areatype <=", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeLike(String value) {
            addCriterion("areatype like", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeNotLike(String value) {
            addCriterion("areatype not like", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeIn(List<String> values) {
            addCriterion("areatype in", values, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeNotIn(List<String> values) {
            addCriterion("areatype not in", values, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeBetween(String value1, String value2) {
            addCriterion("areatype between", value1, value2, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeNotBetween(String value1, String value2) {
            addCriterion("areatype not between", value1, value2, "areatype");
            return (Criteria) this;
        }

        public Criteria andCityabIsNull() {
            addCriterion("cityab is null");
            return (Criteria) this;
        }

        public Criteria andCityabIsNotNull() {
            addCriterion("cityab is not null");
            return (Criteria) this;
        }

        public Criteria andCityabEqualTo(String value) {
            addCriterion("cityab =", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabNotEqualTo(String value) {
            addCriterion("cityab <>", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabGreaterThan(String value) {
            addCriterion("cityab >", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabGreaterThanOrEqualTo(String value) {
            addCriterion("cityab >=", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabLessThan(String value) {
            addCriterion("cityab <", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabLessThanOrEqualTo(String value) {
            addCriterion("cityab <=", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabLike(String value) {
            addCriterion("cityab like", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabNotLike(String value) {
            addCriterion("cityab not like", value, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabIn(List<String> values) {
            addCriterion("cityab in", values, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabNotIn(List<String> values) {
            addCriterion("cityab not in", values, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabBetween(String value1, String value2) {
            addCriterion("cityab between", value1, value2, "cityab");
            return (Criteria) this;
        }

        public Criteria andCityabNotBetween(String value1, String value2) {
            addCriterion("cityab not between", value1, value2, "cityab");
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