package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SusongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SusongExample() {
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

        public Criteria andKeyidIsNull() {
            addCriterion("keyid is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("keyid is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(String value) {
            addCriterion("keyid =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(String value) {
            addCriterion("keyid <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(String value) {
            addCriterion("keyid >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("keyid >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(String value) {
            addCriterion("keyid <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(String value) {
            addCriterion("keyid <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLike(String value) {
            addCriterion("keyid like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotLike(String value) {
            addCriterion("keyid not like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<String> values) {
            addCriterion("keyid in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<String> values) {
            addCriterion("keyid not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(String value1, String value2) {
            addCriterion("keyid between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(String value1, String value2) {
            addCriterion("keyid not between", value1, value2, "keyid");
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

        public Criteria andTypetIsNull() {
            addCriterion("typet is null");
            return (Criteria) this;
        }

        public Criteria andTypetIsNotNull() {
            addCriterion("typet is not null");
            return (Criteria) this;
        }

        public Criteria andTypetEqualTo(String value) {
            addCriterion("typet =", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotEqualTo(String value) {
            addCriterion("typet <>", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetGreaterThan(String value) {
            addCriterion("typet >", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetGreaterThanOrEqualTo(String value) {
            addCriterion("typet >=", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetLessThan(String value) {
            addCriterion("typet <", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetLessThanOrEqualTo(String value) {
            addCriterion("typet <=", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetLike(String value) {
            addCriterion("typet like", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotLike(String value) {
            addCriterion("typet not like", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetIn(List<String> values) {
            addCriterion("typet in", values, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotIn(List<String> values) {
            addCriterion("typet not in", values, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetBetween(String value1, String value2) {
            addCriterion("typet between", value1, value2, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotBetween(String value1, String value2) {
            addCriterion("typet not between", value1, value2, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetnameIsNull() {
            addCriterion("typetname is null");
            return (Criteria) this;
        }

        public Criteria andTypetnameIsNotNull() {
            addCriterion("typetname is not null");
            return (Criteria) this;
        }

        public Criteria andTypetnameEqualTo(String value) {
            addCriterion("typetname =", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameNotEqualTo(String value) {
            addCriterion("typetname <>", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameGreaterThan(String value) {
            addCriterion("typetname >", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameGreaterThanOrEqualTo(String value) {
            addCriterion("typetname >=", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameLessThan(String value) {
            addCriterion("typetname <", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameLessThanOrEqualTo(String value) {
            addCriterion("typetname <=", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameLike(String value) {
            addCriterion("typetname like", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameNotLike(String value) {
            addCriterion("typetname not like", value, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameIn(List<String> values) {
            addCriterion("typetname in", values, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameNotIn(List<String> values) {
            addCriterion("typetname not in", values, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameBetween(String value1, String value2) {
            addCriterion("typetname between", value1, value2, "typetname");
            return (Criteria) this;
        }

        public Criteria andTypetnameNotBetween(String value1, String value2) {
            addCriterion("typetname not between", value1, value2, "typetname");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSslongIsNull() {
            addCriterion("sslong is null");
            return (Criteria) this;
        }

        public Criteria andSslongIsNotNull() {
            addCriterion("sslong is not null");
            return (Criteria) this;
        }

        public Criteria andSslongEqualTo(String value) {
            addCriterion("sslong =", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongNotEqualTo(String value) {
            addCriterion("sslong <>", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongGreaterThan(String value) {
            addCriterion("sslong >", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongGreaterThanOrEqualTo(String value) {
            addCriterion("sslong >=", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongLessThan(String value) {
            addCriterion("sslong <", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongLessThanOrEqualTo(String value) {
            addCriterion("sslong <=", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongLike(String value) {
            addCriterion("sslong like", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongNotLike(String value) {
            addCriterion("sslong not like", value, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongIn(List<String> values) {
            addCriterion("sslong in", values, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongNotIn(List<String> values) {
            addCriterion("sslong not in", values, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongBetween(String value1, String value2) {
            addCriterion("sslong between", value1, value2, "sslong");
            return (Criteria) this;
        }

        public Criteria andSslongNotBetween(String value1, String value2) {
            addCriterion("sslong not between", value1, value2, "sslong");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("personid is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("personid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(String value) {
            addCriterion("personid =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(String value) {
            addCriterion("personid <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(String value) {
            addCriterion("personid >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(String value) {
            addCriterion("personid >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(String value) {
            addCriterion("personid <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(String value) {
            addCriterion("personid <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLike(String value) {
            addCriterion("personid like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotLike(String value) {
            addCriterion("personid not like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<String> values) {
            addCriterion("personid in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<String> values) {
            addCriterion("personid not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(String value1, String value2) {
            addCriterion("personid between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(String value1, String value2) {
            addCriterion("personid not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andCasenumIsNull() {
            addCriterion("casenum is null");
            return (Criteria) this;
        }

        public Criteria andCasenumIsNotNull() {
            addCriterion("casenum is not null");
            return (Criteria) this;
        }

        public Criteria andCasenumEqualTo(String value) {
            addCriterion("casenum =", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotEqualTo(String value) {
            addCriterion("casenum <>", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumGreaterThan(String value) {
            addCriterion("casenum >", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumGreaterThanOrEqualTo(String value) {
            addCriterion("casenum >=", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumLessThan(String value) {
            addCriterion("casenum <", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumLessThanOrEqualTo(String value) {
            addCriterion("casenum <=", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumLike(String value) {
            addCriterion("casenum like", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotLike(String value) {
            addCriterion("casenum not like", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumIn(List<String> values) {
            addCriterion("casenum in", values, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotIn(List<String> values) {
            addCriterion("casenum not in", values, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumBetween(String value1, String value2) {
            addCriterion("casenum between", value1, value2, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotBetween(String value1, String value2) {
            addCriterion("casenum not between", value1, value2, "casenum");
            return (Criteria) this;
        }

        public Criteria andCourtIsNull() {
            addCriterion("court is null");
            return (Criteria) this;
        }

        public Criteria andCourtIsNotNull() {
            addCriterion("court is not null");
            return (Criteria) this;
        }

        public Criteria andCourtEqualTo(String value) {
            addCriterion("court =", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotEqualTo(String value) {
            addCriterion("court <>", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThan(String value) {
            addCriterion("court >", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThanOrEqualTo(String value) {
            addCriterion("court >=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThan(String value) {
            addCriterion("court <", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThanOrEqualTo(String value) {
            addCriterion("court <=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLike(String value) {
            addCriterion("court like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotLike(String value) {
            addCriterion("court not like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtIn(List<String> values) {
            addCriterion("court in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotIn(List<String> values) {
            addCriterion("court not in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtBetween(String value1, String value2) {
            addCriterion("court between", value1, value2, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotBetween(String value1, String value2) {
            addCriterion("court not between", value1, value2, "court");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andZblongIsNull() {
            addCriterion("zblong is null");
            return (Criteria) this;
        }

        public Criteria andZblongIsNotNull() {
            addCriterion("zblong is not null");
            return (Criteria) this;
        }

        public Criteria andZblongEqualTo(String value) {
            addCriterion("zblong =", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongNotEqualTo(String value) {
            addCriterion("zblong <>", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongGreaterThan(String value) {
            addCriterion("zblong >", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongGreaterThanOrEqualTo(String value) {
            addCriterion("zblong >=", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongLessThan(String value) {
            addCriterion("zblong <", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongLessThanOrEqualTo(String value) {
            addCriterion("zblong <=", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongLike(String value) {
            addCriterion("zblong like", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongNotLike(String value) {
            addCriterion("zblong not like", value, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongIn(List<String> values) {
            addCriterion("zblong in", values, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongNotIn(List<String> values) {
            addCriterion("zblong not in", values, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongBetween(String value1, String value2) {
            addCriterion("zblong between", value1, value2, "zblong");
            return (Criteria) this;
        }

        public Criteria andZblongNotBetween(String value1, String value2) {
            addCriterion("zblong not between", value1, value2, "zblong");
            return (Criteria) this;
        }

        public Criteria andWlmoneyIsNull() {
            addCriterion("wlmoney is null");
            return (Criteria) this;
        }

        public Criteria andWlmoneyIsNotNull() {
            addCriterion("wlmoney is not null");
            return (Criteria) this;
        }

        public Criteria andWlmoneyEqualTo(String value) {
            addCriterion("wlmoney =", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyNotEqualTo(String value) {
            addCriterion("wlmoney <>", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyGreaterThan(String value) {
            addCriterion("wlmoney >", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("wlmoney >=", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyLessThan(String value) {
            addCriterion("wlmoney <", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyLessThanOrEqualTo(String value) {
            addCriterion("wlmoney <=", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyLike(String value) {
            addCriterion("wlmoney like", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyNotLike(String value) {
            addCriterion("wlmoney not like", value, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyIn(List<String> values) {
            addCriterion("wlmoney in", values, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyNotIn(List<String> values) {
            addCriterion("wlmoney not in", values, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyBetween(String value1, String value2) {
            addCriterion("wlmoney between", value1, value2, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andWlmoneyNotBetween(String value1, String value2) {
            addCriterion("wlmoney not between", value1, value2, "wlmoney");
            return (Criteria) this;
        }

        public Criteria andApplyIsNull() {
            addCriterion("apply is null");
            return (Criteria) this;
        }

        public Criteria andApplyIsNotNull() {
            addCriterion("apply is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEqualTo(String value) {
            addCriterion("apply =", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotEqualTo(String value) {
            addCriterion("apply <>", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThan(String value) {
            addCriterion("apply >", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThanOrEqualTo(String value) {
            addCriterion("apply >=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThan(String value) {
            addCriterion("apply <", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThanOrEqualTo(String value) {
            addCriterion("apply <=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLike(String value) {
            addCriterion("apply like", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotLike(String value) {
            addCriterion("apply not like", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyIn(List<String> values) {
            addCriterion("apply in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotIn(List<String> values) {
            addCriterion("apply not in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyBetween(String value1, String value2) {
            addCriterion("apply between", value1, value2, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotBetween(String value1, String value2) {
            addCriterion("apply not between", value1, value2, "apply");
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