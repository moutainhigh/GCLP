package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class ExcompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExcompanyExample() {
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

        public Criteria andComnoIsNull() {
            addCriterion("comno is null");
            return (Criteria) this;
        }

        public Criteria andComnoIsNotNull() {
            addCriterion("comno is not null");
            return (Criteria) this;
        }

        public Criteria andComnoEqualTo(String value) {
            addCriterion("comno =", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotEqualTo(String value) {
            addCriterion("comno <>", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThan(String value) {
            addCriterion("comno >", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoGreaterThanOrEqualTo(String value) {
            addCriterion("comno >=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThan(String value) {
            addCriterion("comno <", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLessThanOrEqualTo(String value) {
            addCriterion("comno <=", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoLike(String value) {
            addCriterion("comno like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotLike(String value) {
            addCriterion("comno not like", value, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoIn(List<String> values) {
            addCriterion("comno in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotIn(List<String> values) {
            addCriterion("comno not in", values, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoBetween(String value1, String value2) {
            addCriterion("comno between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andComnoNotBetween(String value1, String value2) {
            addCriterion("comno not between", value1, value2, "comno");
            return (Criteria) this;
        }

        public Criteria andComnameIsNull() {
            addCriterion("comname is null");
            return (Criteria) this;
        }

        public Criteria andComnameIsNotNull() {
            addCriterion("comname is not null");
            return (Criteria) this;
        }

        public Criteria andComnameEqualTo(String value) {
            addCriterion("comname =", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotEqualTo(String value) {
            addCriterion("comname <>", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThan(String value) {
            addCriterion("comname >", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThanOrEqualTo(String value) {
            addCriterion("comname >=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThan(String value) {
            addCriterion("comname <", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThanOrEqualTo(String value) {
            addCriterion("comname <=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLike(String value) {
            addCriterion("comname like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotLike(String value) {
            addCriterion("comname not like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameIn(List<String> values) {
            addCriterion("comname in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotIn(List<String> values) {
            addCriterion("comname not in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameBetween(String value1, String value2) {
            addCriterion("comname between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotBetween(String value1, String value2) {
            addCriterion("comname not between", value1, value2, "comname");
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

        public Criteria andUserkeyidIsNull() {
            addCriterion("userKeyId is null");
            return (Criteria) this;
        }

        public Criteria andUserkeyidIsNotNull() {
            addCriterion("userKeyId is not null");
            return (Criteria) this;
        }

        public Criteria andUserkeyidEqualTo(String value) {
            addCriterion("userKeyId =", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidNotEqualTo(String value) {
            addCriterion("userKeyId <>", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidGreaterThan(String value) {
            addCriterion("userKeyId >", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidGreaterThanOrEqualTo(String value) {
            addCriterion("userKeyId >=", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidLessThan(String value) {
            addCriterion("userKeyId <", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidLessThanOrEqualTo(String value) {
            addCriterion("userKeyId <=", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidLike(String value) {
            addCriterion("userKeyId like", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidNotLike(String value) {
            addCriterion("userKeyId not like", value, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidIn(List<String> values) {
            addCriterion("userKeyId in", values, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidNotIn(List<String> values) {
            addCriterion("userKeyId not in", values, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidBetween(String value1, String value2) {
            addCriterion("userKeyId between", value1, value2, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andUserkeyidNotBetween(String value1, String value2) {
            addCriterion("userKeyId not between", value1, value2, "userkeyid");
            return (Criteria) this;
        }

        public Criteria andAccesskeyIsNull() {
            addCriterion("accesskey is null");
            return (Criteria) this;
        }

        public Criteria andAccesskeyIsNotNull() {
            addCriterion("accesskey is not null");
            return (Criteria) this;
        }

        public Criteria andAccesskeyEqualTo(String value) {
            addCriterion("accesskey =", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyNotEqualTo(String value) {
            addCriterion("accesskey <>", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyGreaterThan(String value) {
            addCriterion("accesskey >", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyGreaterThanOrEqualTo(String value) {
            addCriterion("accesskey >=", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyLessThan(String value) {
            addCriterion("accesskey <", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyLessThanOrEqualTo(String value) {
            addCriterion("accesskey <=", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyLike(String value) {
            addCriterion("accesskey like", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyNotLike(String value) {
            addCriterion("accesskey not like", value, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyIn(List<String> values) {
            addCriterion("accesskey in", values, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyNotIn(List<String> values) {
            addCriterion("accesskey not in", values, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyBetween(String value1, String value2) {
            addCriterion("accesskey between", value1, value2, "accesskey");
            return (Criteria) this;
        }

        public Criteria andAccesskeyNotBetween(String value1, String value2) {
            addCriterion("accesskey not between", value1, value2, "accesskey");
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

        public Criteria andUrl1IsNull() {
            addCriterion("url1 is null");
            return (Criteria) this;
        }

        public Criteria andUrl1IsNotNull() {
            addCriterion("url1 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl1EqualTo(String value) {
            addCriterion("url1 =", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotEqualTo(String value) {
            addCriterion("url1 <>", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1GreaterThan(String value) {
            addCriterion("url1 >", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("url1 >=", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1LessThan(String value) {
            addCriterion("url1 <", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1LessThanOrEqualTo(String value) {
            addCriterion("url1 <=", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1Like(String value) {
            addCriterion("url1 like", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotLike(String value) {
            addCriterion("url1 not like", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1In(List<String> values) {
            addCriterion("url1 in", values, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotIn(List<String> values) {
            addCriterion("url1 not in", values, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1Between(String value1, String value2) {
            addCriterion("url1 between", value1, value2, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotBetween(String value1, String value2) {
            addCriterion("url1 not between", value1, value2, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl2IsNull() {
            addCriterion("url2 is null");
            return (Criteria) this;
        }

        public Criteria andUrl2IsNotNull() {
            addCriterion("url2 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl2EqualTo(String value) {
            addCriterion("url2 =", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotEqualTo(String value) {
            addCriterion("url2 <>", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2GreaterThan(String value) {
            addCriterion("url2 >", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("url2 >=", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2LessThan(String value) {
            addCriterion("url2 <", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2LessThanOrEqualTo(String value) {
            addCriterion("url2 <=", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2Like(String value) {
            addCriterion("url2 like", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotLike(String value) {
            addCriterion("url2 not like", value, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2In(List<String> values) {
            addCriterion("url2 in", values, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotIn(List<String> values) {
            addCriterion("url2 not in", values, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2Between(String value1, String value2) {
            addCriterion("url2 between", value1, value2, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl2NotBetween(String value1, String value2) {
            addCriterion("url2 not between", value1, value2, "url2");
            return (Criteria) this;
        }

        public Criteria andUrl3IsNull() {
            addCriterion("url3 is null");
            return (Criteria) this;
        }

        public Criteria andUrl3IsNotNull() {
            addCriterion("url3 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl3EqualTo(String value) {
            addCriterion("url3 =", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotEqualTo(String value) {
            addCriterion("url3 <>", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3GreaterThan(String value) {
            addCriterion("url3 >", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("url3 >=", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3LessThan(String value) {
            addCriterion("url3 <", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3LessThanOrEqualTo(String value) {
            addCriterion("url3 <=", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3Like(String value) {
            addCriterion("url3 like", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotLike(String value) {
            addCriterion("url3 not like", value, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3In(List<String> values) {
            addCriterion("url3 in", values, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotIn(List<String> values) {
            addCriterion("url3 not in", values, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3Between(String value1, String value2) {
            addCriterion("url3 between", value1, value2, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl3NotBetween(String value1, String value2) {
            addCriterion("url3 not between", value1, value2, "url3");
            return (Criteria) this;
        }

        public Criteria andUrl4IsNull() {
            addCriterion("url4 is null");
            return (Criteria) this;
        }

        public Criteria andUrl4IsNotNull() {
            addCriterion("url4 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl4EqualTo(String value) {
            addCriterion("url4 =", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotEqualTo(String value) {
            addCriterion("url4 <>", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4GreaterThan(String value) {
            addCriterion("url4 >", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4GreaterThanOrEqualTo(String value) {
            addCriterion("url4 >=", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4LessThan(String value) {
            addCriterion("url4 <", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4LessThanOrEqualTo(String value) {
            addCriterion("url4 <=", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4Like(String value) {
            addCriterion("url4 like", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotLike(String value) {
            addCriterion("url4 not like", value, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4In(List<String> values) {
            addCriterion("url4 in", values, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotIn(List<String> values) {
            addCriterion("url4 not in", values, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4Between(String value1, String value2) {
            addCriterion("url4 between", value1, value2, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl4NotBetween(String value1, String value2) {
            addCriterion("url4 not between", value1, value2, "url4");
            return (Criteria) this;
        }

        public Criteria andUrl5IsNull() {
            addCriterion("url5 is null");
            return (Criteria) this;
        }

        public Criteria andUrl5IsNotNull() {
            addCriterion("url5 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl5EqualTo(String value) {
            addCriterion("url5 =", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotEqualTo(String value) {
            addCriterion("url5 <>", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5GreaterThan(String value) {
            addCriterion("url5 >", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5GreaterThanOrEqualTo(String value) {
            addCriterion("url5 >=", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5LessThan(String value) {
            addCriterion("url5 <", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5LessThanOrEqualTo(String value) {
            addCriterion("url5 <=", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5Like(String value) {
            addCriterion("url5 like", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotLike(String value) {
            addCriterion("url5 not like", value, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5In(List<String> values) {
            addCriterion("url5 in", values, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotIn(List<String> values) {
            addCriterion("url5 not in", values, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5Between(String value1, String value2) {
            addCriterion("url5 between", value1, value2, "url5");
            return (Criteria) this;
        }

        public Criteria andUrl5NotBetween(String value1, String value2) {
            addCriterion("url5 not between", value1, value2, "url5");
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