package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShixinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShixinExample() {
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

        public Criteria andTimetypeIsNull() {
            addCriterion("timetype is null");
            return (Criteria) this;
        }

        public Criteria andTimetypeIsNotNull() {
            addCriterion("timetype is not null");
            return (Criteria) this;
        }

        public Criteria andTimetypeEqualTo(String value) {
            addCriterion("timetype =", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotEqualTo(String value) {
            addCriterion("timetype <>", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeGreaterThan(String value) {
            addCriterion("timetype >", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeGreaterThanOrEqualTo(String value) {
            addCriterion("timetype >=", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLessThan(String value) {
            addCriterion("timetype <", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLessThanOrEqualTo(String value) {
            addCriterion("timetype <=", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeLike(String value) {
            addCriterion("timetype like", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotLike(String value) {
            addCriterion("timetype not like", value, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeIn(List<String> values) {
            addCriterion("timetype in", values, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotIn(List<String> values) {
            addCriterion("timetype not in", values, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeBetween(String value1, String value2) {
            addCriterion("timetype between", value1, value2, "timetype");
            return (Criteria) this;
        }

        public Criteria andTimetypeNotBetween(String value1, String value2) {
            addCriterion("timetype not between", value1, value2, "timetype");
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

        public Criteria andSxSfIsNull() {
            addCriterion("sx_sf is null");
            return (Criteria) this;
        }

        public Criteria andSxSfIsNotNull() {
            addCriterion("sx_sf is not null");
            return (Criteria) this;
        }

        public Criteria andSxSfEqualTo(String value) {
            addCriterion("sx_sf =", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfNotEqualTo(String value) {
            addCriterion("sx_sf <>", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfGreaterThan(String value) {
            addCriterion("sx_sf >", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfGreaterThanOrEqualTo(String value) {
            addCriterion("sx_sf >=", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfLessThan(String value) {
            addCriterion("sx_sf <", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfLessThanOrEqualTo(String value) {
            addCriterion("sx_sf <=", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfLike(String value) {
            addCriterion("sx_sf like", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfNotLike(String value) {
            addCriterion("sx_sf not like", value, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfIn(List<String> values) {
            addCriterion("sx_sf in", values, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfNotIn(List<String> values) {
            addCriterion("sx_sf not in", values, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfBetween(String value1, String value2) {
            addCriterion("sx_sf between", value1, value2, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxSfNotBetween(String value1, String value2) {
            addCriterion("sx_sf not between", value1, value2, "sxSf");
            return (Criteria) this;
        }

        public Criteria andSxFbIsNull() {
            addCriterion("sx_fb is null");
            return (Criteria) this;
        }

        public Criteria andSxFbIsNotNull() {
            addCriterion("sx_fb is not null");
            return (Criteria) this;
        }

        public Criteria andSxFbEqualTo(String value) {
            addCriterion("sx_fb =", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbNotEqualTo(String value) {
            addCriterion("sx_fb <>", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbGreaterThan(String value) {
            addCriterion("sx_fb >", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbGreaterThanOrEqualTo(String value) {
            addCriterion("sx_fb >=", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbLessThan(String value) {
            addCriterion("sx_fb <", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbLessThanOrEqualTo(String value) {
            addCriterion("sx_fb <=", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbLike(String value) {
            addCriterion("sx_fb like", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbNotLike(String value) {
            addCriterion("sx_fb not like", value, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbIn(List<String> values) {
            addCriterion("sx_fb in", values, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbNotIn(List<String> values) {
            addCriterion("sx_fb not in", values, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbBetween(String value1, String value2) {
            addCriterion("sx_fb between", value1, value2, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxFbNotBetween(String value1, String value2) {
            addCriterion("sx_fb not between", value1, value2, "sxFb");
            return (Criteria) this;
        }

        public Criteria andSxWhIsNull() {
            addCriterion("sx_wh is null");
            return (Criteria) this;
        }

        public Criteria andSxWhIsNotNull() {
            addCriterion("sx_wh is not null");
            return (Criteria) this;
        }

        public Criteria andSxWhEqualTo(String value) {
            addCriterion("sx_wh =", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhNotEqualTo(String value) {
            addCriterion("sx_wh <>", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhGreaterThan(String value) {
            addCriterion("sx_wh >", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhGreaterThanOrEqualTo(String value) {
            addCriterion("sx_wh >=", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhLessThan(String value) {
            addCriterion("sx_wh <", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhLessThanOrEqualTo(String value) {
            addCriterion("sx_wh <=", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhLike(String value) {
            addCriterion("sx_wh like", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhNotLike(String value) {
            addCriterion("sx_wh not like", value, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhIn(List<String> values) {
            addCriterion("sx_wh in", values, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhNotIn(List<String> values) {
            addCriterion("sx_wh not in", values, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhBetween(String value1, String value2) {
            addCriterion("sx_wh between", value1, value2, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxWhNotBetween(String value1, String value2) {
            addCriterion("sx_wh not between", value1, value2, "sxWh");
            return (Criteria) this;
        }

        public Criteria andSxDwIsNull() {
            addCriterion("sx_dw is null");
            return (Criteria) this;
        }

        public Criteria andSxDwIsNotNull() {
            addCriterion("sx_dw is not null");
            return (Criteria) this;
        }

        public Criteria andSxDwEqualTo(String value) {
            addCriterion("sx_dw =", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwNotEqualTo(String value) {
            addCriterion("sx_dw <>", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwGreaterThan(String value) {
            addCriterion("sx_dw >", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwGreaterThanOrEqualTo(String value) {
            addCriterion("sx_dw >=", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwLessThan(String value) {
            addCriterion("sx_dw <", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwLessThanOrEqualTo(String value) {
            addCriterion("sx_dw <=", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwLike(String value) {
            addCriterion("sx_dw like", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwNotLike(String value) {
            addCriterion("sx_dw not like", value, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwIn(List<String> values) {
            addCriterion("sx_dw in", values, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwNotIn(List<String> values) {
            addCriterion("sx_dw not in", values, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwBetween(String value1, String value2) {
            addCriterion("sx_dw between", value1, value2, "sxDw");
            return (Criteria) this;
        }

        public Criteria andSxDwNotBetween(String value1, String value2) {
            addCriterion("sx_dw not between", value1, value2, "sxDw");
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