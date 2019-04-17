package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImageidIsNull() {
            addCriterion("imageid is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("imageid is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(String value) {
            addCriterion("imageid =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(String value) {
            addCriterion("imageid <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(String value) {
            addCriterion("imageid >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(String value) {
            addCriterion("imageid >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(String value) {
            addCriterion("imageid <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(String value) {
            addCriterion("imageid <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLike(String value) {
            addCriterion("imageid like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotLike(String value) {
            addCriterion("imageid not like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<String> values) {
            addCriterion("imageid in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<String> values) {
            addCriterion("imageid not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(String value1, String value2) {
            addCriterion("imageid between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(String value1, String value2) {
            addCriterion("imageid not between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImagetypeIsNull() {
            addCriterion("imagetype is null");
            return (Criteria) this;
        }

        public Criteria andImagetypeIsNotNull() {
            addCriterion("imagetype is not null");
            return (Criteria) this;
        }

        public Criteria andImagetypeEqualTo(String value) {
            addCriterion("imagetype =", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotEqualTo(String value) {
            addCriterion("imagetype <>", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeGreaterThan(String value) {
            addCriterion("imagetype >", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("imagetype >=", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeLessThan(String value) {
            addCriterion("imagetype <", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeLessThanOrEqualTo(String value) {
            addCriterion("imagetype <=", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeLike(String value) {
            addCriterion("imagetype like", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotLike(String value) {
            addCriterion("imagetype not like", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeIn(List<String> values) {
            addCriterion("imagetype in", values, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotIn(List<String> values) {
            addCriterion("imagetype not in", values, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeBetween(String value1, String value2) {
            addCriterion("imagetype between", value1, value2, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotBetween(String value1, String value2) {
            addCriterion("imagetype not between", value1, value2, "imagetype");
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

        public Criteria andRootdirIsNull() {
            addCriterion("rootdir is null");
            return (Criteria) this;
        }

        public Criteria andRootdirIsNotNull() {
            addCriterion("rootdir is not null");
            return (Criteria) this;
        }

        public Criteria andRootdirEqualTo(String value) {
            addCriterion("rootdir =", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirNotEqualTo(String value) {
            addCriterion("rootdir <>", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirGreaterThan(String value) {
            addCriterion("rootdir >", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirGreaterThanOrEqualTo(String value) {
            addCriterion("rootdir >=", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirLessThan(String value) {
            addCriterion("rootdir <", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirLessThanOrEqualTo(String value) {
            addCriterion("rootdir <=", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirLike(String value) {
            addCriterion("rootdir like", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirNotLike(String value) {
            addCriterion("rootdir not like", value, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirIn(List<String> values) {
            addCriterion("rootdir in", values, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirNotIn(List<String> values) {
            addCriterion("rootdir not in", values, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirBetween(String value1, String value2) {
            addCriterion("rootdir between", value1, value2, "rootdir");
            return (Criteria) this;
        }

        public Criteria andRootdirNotBetween(String value1, String value2) {
            addCriterion("rootdir not between", value1, value2, "rootdir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirIsNull() {
            addCriterion("absolutedir is null");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirIsNotNull() {
            addCriterion("absolutedir is not null");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirEqualTo(String value) {
            addCriterion("absolutedir =", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirNotEqualTo(String value) {
            addCriterion("absolutedir <>", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirGreaterThan(String value) {
            addCriterion("absolutedir >", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirGreaterThanOrEqualTo(String value) {
            addCriterion("absolutedir >=", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirLessThan(String value) {
            addCriterion("absolutedir <", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirLessThanOrEqualTo(String value) {
            addCriterion("absolutedir <=", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirLike(String value) {
            addCriterion("absolutedir like", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirNotLike(String value) {
            addCriterion("absolutedir not like", value, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirIn(List<String> values) {
            addCriterion("absolutedir in", values, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirNotIn(List<String> values) {
            addCriterion("absolutedir not in", values, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirBetween(String value1, String value2) {
            addCriterion("absolutedir between", value1, value2, "absolutedir");
            return (Criteria) this;
        }

        public Criteria andAbsolutedirNotBetween(String value1, String value2) {
            addCriterion("absolutedir not between", value1, value2, "absolutedir");
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

        public Criteria andSavetypeIsNull() {
            addCriterion("savetype is null");
            return (Criteria) this;
        }

        public Criteria andSavetypeIsNotNull() {
            addCriterion("savetype is not null");
            return (Criteria) this;
        }

        public Criteria andSavetypeEqualTo(String value) {
            addCriterion("savetype =", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeNotEqualTo(String value) {
            addCriterion("savetype <>", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeGreaterThan(String value) {
            addCriterion("savetype >", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeGreaterThanOrEqualTo(String value) {
            addCriterion("savetype >=", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeLessThan(String value) {
            addCriterion("savetype <", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeLessThanOrEqualTo(String value) {
            addCriterion("savetype <=", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeLike(String value) {
            addCriterion("savetype like", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeNotLike(String value) {
            addCriterion("savetype not like", value, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeIn(List<String> values) {
            addCriterion("savetype in", values, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeNotIn(List<String> values) {
            addCriterion("savetype not in", values, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeBetween(String value1, String value2) {
            addCriterion("savetype between", value1, value2, "savetype");
            return (Criteria) this;
        }

        public Criteria andSavetypeNotBetween(String value1, String value2) {
            addCriterion("savetype not between", value1, value2, "savetype");
            return (Criteria) this;
        }

        public Criteria andSaveaddressIsNull() {
            addCriterion("saveaddress is null");
            return (Criteria) this;
        }

        public Criteria andSaveaddressIsNotNull() {
            addCriterion("saveaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaveaddressEqualTo(String value) {
            addCriterion("saveaddress =", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressNotEqualTo(String value) {
            addCriterion("saveaddress <>", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressGreaterThan(String value) {
            addCriterion("saveaddress >", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("saveaddress >=", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressLessThan(String value) {
            addCriterion("saveaddress <", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressLessThanOrEqualTo(String value) {
            addCriterion("saveaddress <=", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressLike(String value) {
            addCriterion("saveaddress like", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressNotLike(String value) {
            addCriterion("saveaddress not like", value, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressIn(List<String> values) {
            addCriterion("saveaddress in", values, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressNotIn(List<String> values) {
            addCriterion("saveaddress not in", values, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressBetween(String value1, String value2) {
            addCriterion("saveaddress between", value1, value2, "saveaddress");
            return (Criteria) this;
        }

        public Criteria andSaveaddressNotBetween(String value1, String value2) {
            addCriterion("saveaddress not between", value1, value2, "saveaddress");
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