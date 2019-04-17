package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsparamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsparamExample() {
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

        public Criteria andAccesskeyidIsNull() {
            addCriterion("accesskeyid is null");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidIsNotNull() {
            addCriterion("accesskeyid is not null");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidEqualTo(String value) {
            addCriterion("accesskeyid =", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidNotEqualTo(String value) {
            addCriterion("accesskeyid <>", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidGreaterThan(String value) {
            addCriterion("accesskeyid >", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidGreaterThanOrEqualTo(String value) {
            addCriterion("accesskeyid >=", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidLessThan(String value) {
            addCriterion("accesskeyid <", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidLessThanOrEqualTo(String value) {
            addCriterion("accesskeyid <=", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidLike(String value) {
            addCriterion("accesskeyid like", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidNotLike(String value) {
            addCriterion("accesskeyid not like", value, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidIn(List<String> values) {
            addCriterion("accesskeyid in", values, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidNotIn(List<String> values) {
            addCriterion("accesskeyid not in", values, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidBetween(String value1, String value2) {
            addCriterion("accesskeyid between", value1, value2, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyidNotBetween(String value1, String value2) {
            addCriterion("accesskeyid not between", value1, value2, "accesskeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretIsNull() {
            addCriterion("accesskeysecret is null");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretIsNotNull() {
            addCriterion("accesskeysecret is not null");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretEqualTo(String value) {
            addCriterion("accesskeysecret =", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretNotEqualTo(String value) {
            addCriterion("accesskeysecret <>", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretGreaterThan(String value) {
            addCriterion("accesskeysecret >", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretGreaterThanOrEqualTo(String value) {
            addCriterion("accesskeysecret >=", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretLessThan(String value) {
            addCriterion("accesskeysecret <", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretLessThanOrEqualTo(String value) {
            addCriterion("accesskeysecret <=", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretLike(String value) {
            addCriterion("accesskeysecret like", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretNotLike(String value) {
            addCriterion("accesskeysecret not like", value, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretIn(List<String> values) {
            addCriterion("accesskeysecret in", values, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretNotIn(List<String> values) {
            addCriterion("accesskeysecret not in", values, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretBetween(String value1, String value2) {
            addCriterion("accesskeysecret between", value1, value2, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andAccesskeysecretNotBetween(String value1, String value2) {
            addCriterion("accesskeysecret not between", value1, value2, "accesskeysecret");
            return (Criteria) this;
        }

        public Criteria andMsgsignIsNull() {
            addCriterion("msgsign is null");
            return (Criteria) this;
        }

        public Criteria andMsgsignIsNotNull() {
            addCriterion("msgsign is not null");
            return (Criteria) this;
        }

        public Criteria andMsgsignEqualTo(String value) {
            addCriterion("msgsign =", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignNotEqualTo(String value) {
            addCriterion("msgsign <>", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignGreaterThan(String value) {
            addCriterion("msgsign >", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignGreaterThanOrEqualTo(String value) {
            addCriterion("msgsign >=", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignLessThan(String value) {
            addCriterion("msgsign <", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignLessThanOrEqualTo(String value) {
            addCriterion("msgsign <=", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignLike(String value) {
            addCriterion("msgsign like", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignNotLike(String value) {
            addCriterion("msgsign not like", value, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignIn(List<String> values) {
            addCriterion("msgsign in", values, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignNotIn(List<String> values) {
            addCriterion("msgsign not in", values, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignBetween(String value1, String value2) {
            addCriterion("msgsign between", value1, value2, "msgsign");
            return (Criteria) this;
        }

        public Criteria andMsgsignNotBetween(String value1, String value2) {
            addCriterion("msgsign not between", value1, value2, "msgsign");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeIsNull() {
            addCriterion("templatecode is null");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeIsNotNull() {
            addCriterion("templatecode is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeEqualTo(String value) {
            addCriterion("templatecode =", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeNotEqualTo(String value) {
            addCriterion("templatecode <>", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeGreaterThan(String value) {
            addCriterion("templatecode >", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("templatecode >=", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeLessThan(String value) {
            addCriterion("templatecode <", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeLessThanOrEqualTo(String value) {
            addCriterion("templatecode <=", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeLike(String value) {
            addCriterion("templatecode like", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeNotLike(String value) {
            addCriterion("templatecode not like", value, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeIn(List<String> values) {
            addCriterion("templatecode in", values, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeNotIn(List<String> values) {
            addCriterion("templatecode not in", values, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeBetween(String value1, String value2) {
            addCriterion("templatecode between", value1, value2, "templatecode");
            return (Criteria) this;
        }

        public Criteria andTemplatecodeNotBetween(String value1, String value2) {
            addCriterion("templatecode not between", value1, value2, "templatecode");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("productno is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("productno is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("productno =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("productno <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("productno >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("productno >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("productno <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("productno <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("productno like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("productno not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("productno in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("productno not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("productno between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("productno not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andSendfreqIsNull() {
            addCriterion("sendfreq is null");
            return (Criteria) this;
        }

        public Criteria andSendfreqIsNotNull() {
            addCriterion("sendfreq is not null");
            return (Criteria) this;
        }

        public Criteria andSendfreqEqualTo(String value) {
            addCriterion("sendfreq =", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqNotEqualTo(String value) {
            addCriterion("sendfreq <>", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqGreaterThan(String value) {
            addCriterion("sendfreq >", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqGreaterThanOrEqualTo(String value) {
            addCriterion("sendfreq >=", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqLessThan(String value) {
            addCriterion("sendfreq <", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqLessThanOrEqualTo(String value) {
            addCriterion("sendfreq <=", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqLike(String value) {
            addCriterion("sendfreq like", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqNotLike(String value) {
            addCriterion("sendfreq not like", value, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqIn(List<String> values) {
            addCriterion("sendfreq in", values, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqNotIn(List<String> values) {
            addCriterion("sendfreq not in", values, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqBetween(String value1, String value2) {
            addCriterion("sendfreq between", value1, value2, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendfreqNotBetween(String value1, String value2) {
            addCriterion("sendfreq not between", value1, value2, "sendfreq");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNull() {
            addCriterion("sendtype is null");
            return (Criteria) this;
        }

        public Criteria andSendtypeIsNotNull() {
            addCriterion("sendtype is not null");
            return (Criteria) this;
        }

        public Criteria andSendtypeEqualTo(String value) {
            addCriterion("sendtype =", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotEqualTo(String value) {
            addCriterion("sendtype <>", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThan(String value) {
            addCriterion("sendtype >", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeGreaterThanOrEqualTo(String value) {
            addCriterion("sendtype >=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThan(String value) {
            addCriterion("sendtype <", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLessThanOrEqualTo(String value) {
            addCriterion("sendtype <=", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeLike(String value) {
            addCriterion("sendtype like", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotLike(String value) {
            addCriterion("sendtype not like", value, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeIn(List<String> values) {
            addCriterion("sendtype in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotIn(List<String> values) {
            addCriterion("sendtype not in", values, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeBetween(String value1, String value2) {
            addCriterion("sendtype between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendtypeNotBetween(String value1, String value2) {
            addCriterion("sendtype not between", value1, value2, "sendtype");
            return (Criteria) this;
        }

        public Criteria andSendchanceIsNull() {
            addCriterion("sendchance is null");
            return (Criteria) this;
        }

        public Criteria andSendchanceIsNotNull() {
            addCriterion("sendchance is not null");
            return (Criteria) this;
        }

        public Criteria andSendchanceEqualTo(String value) {
            addCriterion("sendchance =", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceNotEqualTo(String value) {
            addCriterion("sendchance <>", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceGreaterThan(String value) {
            addCriterion("sendchance >", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceGreaterThanOrEqualTo(String value) {
            addCriterion("sendchance >=", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceLessThan(String value) {
            addCriterion("sendchance <", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceLessThanOrEqualTo(String value) {
            addCriterion("sendchance <=", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceLike(String value) {
            addCriterion("sendchance like", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceNotLike(String value) {
            addCriterion("sendchance not like", value, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceIn(List<String> values) {
            addCriterion("sendchance in", values, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceNotIn(List<String> values) {
            addCriterion("sendchance not in", values, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceBetween(String value1, String value2) {
            addCriterion("sendchance between", value1, value2, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendchanceNotBetween(String value1, String value2) {
            addCriterion("sendchance not between", value1, value2, "sendchance");
            return (Criteria) this;
        }

        public Criteria andSendflgIsNull() {
            addCriterion("sendflg is null");
            return (Criteria) this;
        }

        public Criteria andSendflgIsNotNull() {
            addCriterion("sendflg is not null");
            return (Criteria) this;
        }

        public Criteria andSendflgEqualTo(String value) {
            addCriterion("sendflg =", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgNotEqualTo(String value) {
            addCriterion("sendflg <>", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgGreaterThan(String value) {
            addCriterion("sendflg >", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgGreaterThanOrEqualTo(String value) {
            addCriterion("sendflg >=", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgLessThan(String value) {
            addCriterion("sendflg <", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgLessThanOrEqualTo(String value) {
            addCriterion("sendflg <=", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgLike(String value) {
            addCriterion("sendflg like", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgNotLike(String value) {
            addCriterion("sendflg not like", value, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgIn(List<String> values) {
            addCriterion("sendflg in", values, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgNotIn(List<String> values) {
            addCriterion("sendflg not in", values, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgBetween(String value1, String value2) {
            addCriterion("sendflg between", value1, value2, "sendflg");
            return (Criteria) this;
        }

        public Criteria andSendflgNotBetween(String value1, String value2) {
            addCriterion("sendflg not between", value1, value2, "sendflg");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUseflgIsNull() {
            addCriterion("useflg is null");
            return (Criteria) this;
        }

        public Criteria andUseflgIsNotNull() {
            addCriterion("useflg is not null");
            return (Criteria) this;
        }

        public Criteria andUseflgEqualTo(String value) {
            addCriterion("useflg =", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotEqualTo(String value) {
            addCriterion("useflg <>", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgGreaterThan(String value) {
            addCriterion("useflg >", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgGreaterThanOrEqualTo(String value) {
            addCriterion("useflg >=", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgLessThan(String value) {
            addCriterion("useflg <", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgLessThanOrEqualTo(String value) {
            addCriterion("useflg <=", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgLike(String value) {
            addCriterion("useflg like", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotLike(String value) {
            addCriterion("useflg not like", value, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgIn(List<String> values) {
            addCriterion("useflg in", values, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotIn(List<String> values) {
            addCriterion("useflg not in", values, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgBetween(String value1, String value2) {
            addCriterion("useflg between", value1, value2, "useflg");
            return (Criteria) this;
        }

        public Criteria andUseflgNotBetween(String value1, String value2) {
            addCriterion("useflg not between", value1, value2, "useflg");
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