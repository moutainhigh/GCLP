package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchannelExample() {
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

        public Criteria andChannelnoIsNull() {
            addCriterion("channelno is null");
            return (Criteria) this;
        }

        public Criteria andChannelnoIsNotNull() {
            addCriterion("channelno is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnoEqualTo(String value) {
            addCriterion("channelno =", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotEqualTo(String value) {
            addCriterion("channelno <>", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoGreaterThan(String value) {
            addCriterion("channelno >", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoGreaterThanOrEqualTo(String value) {
            addCriterion("channelno >=", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLessThan(String value) {
            addCriterion("channelno <", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLessThanOrEqualTo(String value) {
            addCriterion("channelno <=", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoLike(String value) {
            addCriterion("channelno like", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotLike(String value) {
            addCriterion("channelno not like", value, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoIn(List<String> values) {
            addCriterion("channelno in", values, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotIn(List<String> values) {
            addCriterion("channelno not in", values, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoBetween(String value1, String value2) {
            addCriterion("channelno between", value1, value2, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnoNotBetween(String value1, String value2) {
            addCriterion("channelno not between", value1, value2, "channelno");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNull() {
            addCriterion("channelname is null");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNotNull() {
            addCriterion("channelname is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnameEqualTo(String value) {
            addCriterion("channelname =", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotEqualTo(String value) {
            addCriterion("channelname <>", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThan(String value) {
            addCriterion("channelname >", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("channelname >=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThan(String value) {
            addCriterion("channelname <", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThanOrEqualTo(String value) {
            addCriterion("channelname <=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLike(String value) {
            addCriterion("channelname like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotLike(String value) {
            addCriterion("channelname not like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIn(List<String> values) {
            addCriterion("channelname in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotIn(List<String> values) {
            addCriterion("channelname not in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameBetween(String value1, String value2) {
            addCriterion("channelname between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotBetween(String value1, String value2) {
            addCriterion("channelname not between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andSecretIsNull() {
            addCriterion("secret is null");
            return (Criteria) this;
        }

        public Criteria andSecretIsNotNull() {
            addCriterion("secret is not null");
            return (Criteria) this;
        }

        public Criteria andSecretEqualTo(String value) {
            addCriterion("secret =", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotEqualTo(String value) {
            addCriterion("secret <>", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThan(String value) {
            addCriterion("secret >", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThanOrEqualTo(String value) {
            addCriterion("secret >=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThan(String value) {
            addCriterion("secret <", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThanOrEqualTo(String value) {
            addCriterion("secret <=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLike(String value) {
            addCriterion("secret like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotLike(String value) {
            addCriterion("secret not like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretIn(List<String> values) {
            addCriterion("secret in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotIn(List<String> values) {
            addCriterion("secret not in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretBetween(String value1, String value2) {
            addCriterion("secret between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotBetween(String value1, String value2) {
            addCriterion("secret not between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andConidIsNull() {
            addCriterion("conid is null");
            return (Criteria) this;
        }

        public Criteria andConidIsNotNull() {
            addCriterion("conid is not null");
            return (Criteria) this;
        }

        public Criteria andConidEqualTo(String value) {
            addCriterion("conid =", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotEqualTo(String value) {
            addCriterion("conid <>", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThan(String value) {
            addCriterion("conid >", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThanOrEqualTo(String value) {
            addCriterion("conid >=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThan(String value) {
            addCriterion("conid <", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThanOrEqualTo(String value) {
            addCriterion("conid <=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLike(String value) {
            addCriterion("conid like", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotLike(String value) {
            addCriterion("conid not like", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidIn(List<String> values) {
            addCriterion("conid in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotIn(List<String> values) {
            addCriterion("conid not in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidBetween(String value1, String value2) {
            addCriterion("conid between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotBetween(String value1, String value2) {
            addCriterion("conid not between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPushdomainIsNull() {
            addCriterion("pushdomain is null");
            return (Criteria) this;
        }

        public Criteria andPushdomainIsNotNull() {
            addCriterion("pushdomain is not null");
            return (Criteria) this;
        }

        public Criteria andPushdomainEqualTo(String value) {
            addCriterion("pushdomain =", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainNotEqualTo(String value) {
            addCriterion("pushdomain <>", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainGreaterThan(String value) {
            addCriterion("pushdomain >", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainGreaterThanOrEqualTo(String value) {
            addCriterion("pushdomain >=", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainLessThan(String value) {
            addCriterion("pushdomain <", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainLessThanOrEqualTo(String value) {
            addCriterion("pushdomain <=", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainLike(String value) {
            addCriterion("pushdomain like", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainNotLike(String value) {
            addCriterion("pushdomain not like", value, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainIn(List<String> values) {
            addCriterion("pushdomain in", values, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainNotIn(List<String> values) {
            addCriterion("pushdomain not in", values, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainBetween(String value1, String value2) {
            addCriterion("pushdomain between", value1, value2, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andPushdomainNotBetween(String value1, String value2) {
            addCriterion("pushdomain not between", value1, value2, "pushdomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainIsNull() {
            addCriterion("livedomain is null");
            return (Criteria) this;
        }

        public Criteria andLivedomainIsNotNull() {
            addCriterion("livedomain is not null");
            return (Criteria) this;
        }

        public Criteria andLivedomainEqualTo(String value) {
            addCriterion("livedomain =", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainNotEqualTo(String value) {
            addCriterion("livedomain <>", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainGreaterThan(String value) {
            addCriterion("livedomain >", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainGreaterThanOrEqualTo(String value) {
            addCriterion("livedomain >=", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainLessThan(String value) {
            addCriterion("livedomain <", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainLessThanOrEqualTo(String value) {
            addCriterion("livedomain <=", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainLike(String value) {
            addCriterion("livedomain like", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainNotLike(String value) {
            addCriterion("livedomain not like", value, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainIn(List<String> values) {
            addCriterion("livedomain in", values, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainNotIn(List<String> values) {
            addCriterion("livedomain not in", values, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainBetween(String value1, String value2) {
            addCriterion("livedomain between", value1, value2, "livedomain");
            return (Criteria) this;
        }

        public Criteria andLivedomainNotBetween(String value1, String value2) {
            addCriterion("livedomain not between", value1, value2, "livedomain");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("appname is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("appname is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("appname =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("appname <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("appname >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appname >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("appname <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("appname <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("appname like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("appname not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("appname in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("appname not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("appname between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("appname not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andLivekeyIsNull() {
            addCriterion("livekey is null");
            return (Criteria) this;
        }

        public Criteria andLivekeyIsNotNull() {
            addCriterion("livekey is not null");
            return (Criteria) this;
        }

        public Criteria andLivekeyEqualTo(String value) {
            addCriterion("livekey =", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyNotEqualTo(String value) {
            addCriterion("livekey <>", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyGreaterThan(String value) {
            addCriterion("livekey >", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyGreaterThanOrEqualTo(String value) {
            addCriterion("livekey >=", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyLessThan(String value) {
            addCriterion("livekey <", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyLessThanOrEqualTo(String value) {
            addCriterion("livekey <=", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyLike(String value) {
            addCriterion("livekey like", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyNotLike(String value) {
            addCriterion("livekey not like", value, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyIn(List<String> values) {
            addCriterion("livekey in", values, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyNotIn(List<String> values) {
            addCriterion("livekey not in", values, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyBetween(String value1, String value2) {
            addCriterion("livekey between", value1, value2, "livekey");
            return (Criteria) this;
        }

        public Criteria andLivekeyNotBetween(String value1, String value2) {
            addCriterion("livekey not between", value1, value2, "livekey");
            return (Criteria) this;
        }

        public Criteria andPushkeyIsNull() {
            addCriterion("pushkey is null");
            return (Criteria) this;
        }

        public Criteria andPushkeyIsNotNull() {
            addCriterion("pushkey is not null");
            return (Criteria) this;
        }

        public Criteria andPushkeyEqualTo(String value) {
            addCriterion("pushkey =", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyNotEqualTo(String value) {
            addCriterion("pushkey <>", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyGreaterThan(String value) {
            addCriterion("pushkey >", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyGreaterThanOrEqualTo(String value) {
            addCriterion("pushkey >=", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyLessThan(String value) {
            addCriterion("pushkey <", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyLessThanOrEqualTo(String value) {
            addCriterion("pushkey <=", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyLike(String value) {
            addCriterion("pushkey like", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyNotLike(String value) {
            addCriterion("pushkey not like", value, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyIn(List<String> values) {
            addCriterion("pushkey in", values, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyNotIn(List<String> values) {
            addCriterion("pushkey not in", values, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyBetween(String value1, String value2) {
            addCriterion("pushkey between", value1, value2, "pushkey");
            return (Criteria) this;
        }

        public Criteria andPushkeyNotBetween(String value1, String value2) {
            addCriterion("pushkey not between", value1, value2, "pushkey");
            return (Criteria) this;
        }

        public Criteria andVideocenterIsNull() {
            addCriterion("videocenter is null");
            return (Criteria) this;
        }

        public Criteria andVideocenterIsNotNull() {
            addCriterion("videocenter is not null");
            return (Criteria) this;
        }

        public Criteria andVideocenterEqualTo(String value) {
            addCriterion("videocenter =", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterNotEqualTo(String value) {
            addCriterion("videocenter <>", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterGreaterThan(String value) {
            addCriterion("videocenter >", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterGreaterThanOrEqualTo(String value) {
            addCriterion("videocenter >=", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterLessThan(String value) {
            addCriterion("videocenter <", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterLessThanOrEqualTo(String value) {
            addCriterion("videocenter <=", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterLike(String value) {
            addCriterion("videocenter like", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterNotLike(String value) {
            addCriterion("videocenter not like", value, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterIn(List<String> values) {
            addCriterion("videocenter in", values, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterNotIn(List<String> values) {
            addCriterion("videocenter not in", values, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterBetween(String value1, String value2) {
            addCriterion("videocenter between", value1, value2, "videocenter");
            return (Criteria) this;
        }

        public Criteria andVideocenterNotBetween(String value1, String value2) {
            addCriterion("videocenter not between", value1, value2, "videocenter");
            return (Criteria) this;
        }

        public Criteria andOpenflgIsNull() {
            addCriterion("openflg is null");
            return (Criteria) this;
        }

        public Criteria andOpenflgIsNotNull() {
            addCriterion("openflg is not null");
            return (Criteria) this;
        }

        public Criteria andOpenflgEqualTo(String value) {
            addCriterion("openflg =", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgNotEqualTo(String value) {
            addCriterion("openflg <>", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgGreaterThan(String value) {
            addCriterion("openflg >", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgGreaterThanOrEqualTo(String value) {
            addCriterion("openflg >=", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgLessThan(String value) {
            addCriterion("openflg <", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgLessThanOrEqualTo(String value) {
            addCriterion("openflg <=", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgLike(String value) {
            addCriterion("openflg like", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgNotLike(String value) {
            addCriterion("openflg not like", value, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgIn(List<String> values) {
            addCriterion("openflg in", values, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgNotIn(List<String> values) {
            addCriterion("openflg not in", values, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgBetween(String value1, String value2) {
            addCriterion("openflg between", value1, value2, "openflg");
            return (Criteria) this;
        }

        public Criteria andOpenflgNotBetween(String value1, String value2) {
            addCriterion("openflg not between", value1, value2, "openflg");
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