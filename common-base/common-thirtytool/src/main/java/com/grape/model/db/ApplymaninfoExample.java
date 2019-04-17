package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplymaninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplymaninfoExample() {
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

        public Criteria andCusttypeIsNull() {
            addCriterion("custtype is null");
            return (Criteria) this;
        }

        public Criteria andCusttypeIsNotNull() {
            addCriterion("custtype is not null");
            return (Criteria) this;
        }

        public Criteria andCusttypeEqualTo(String value) {
            addCriterion("custtype =", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotEqualTo(String value) {
            addCriterion("custtype <>", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThan(String value) {
            addCriterion("custtype >", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeGreaterThanOrEqualTo(String value) {
            addCriterion("custtype >=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThan(String value) {
            addCriterion("custtype <", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLessThanOrEqualTo(String value) {
            addCriterion("custtype <=", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeLike(String value) {
            addCriterion("custtype like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotLike(String value) {
            addCriterion("custtype not like", value, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeIn(List<String> values) {
            addCriterion("custtype in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotIn(List<String> values) {
            addCriterion("custtype not in", values, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeBetween(String value1, String value2) {
            addCriterion("custtype between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andCusttypeNotBetween(String value1, String value2) {
            addCriterion("custtype not between", value1, value2, "custtype");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNull() {
            addCriterion("custname is null");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNotNull() {
            addCriterion("custname is not null");
            return (Criteria) this;
        }

        public Criteria andCustnameEqualTo(String value) {
            addCriterion("custname =", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotEqualTo(String value) {
            addCriterion("custname <>", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThan(String value) {
            addCriterion("custname >", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThanOrEqualTo(String value) {
            addCriterion("custname >=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThan(String value) {
            addCriterion("custname <", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThanOrEqualTo(String value) {
            addCriterion("custname <=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLike(String value) {
            addCriterion("custname like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotLike(String value) {
            addCriterion("custname not like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameIn(List<String> values) {
            addCriterion("custname in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotIn(List<String> values) {
            addCriterion("custname not in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameBetween(String value1, String value2) {
            addCriterion("custname between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotBetween(String value1, String value2) {
            addCriterion("custname not between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressIsNull() {
            addCriterion("cerdidaddress is null");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressIsNotNull() {
            addCriterion("cerdidaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressEqualTo(String value) {
            addCriterion("cerdidaddress =", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressNotEqualTo(String value) {
            addCriterion("cerdidaddress <>", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressGreaterThan(String value) {
            addCriterion("cerdidaddress >", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressGreaterThanOrEqualTo(String value) {
            addCriterion("cerdidaddress >=", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressLessThan(String value) {
            addCriterion("cerdidaddress <", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressLessThanOrEqualTo(String value) {
            addCriterion("cerdidaddress <=", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressLike(String value) {
            addCriterion("cerdidaddress like", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressNotLike(String value) {
            addCriterion("cerdidaddress not like", value, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressIn(List<String> values) {
            addCriterion("cerdidaddress in", values, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressNotIn(List<String> values) {
            addCriterion("cerdidaddress not in", values, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressBetween(String value1, String value2) {
            addCriterion("cerdidaddress between", value1, value2, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andCerdidaddressNotBetween(String value1, String value2) {
            addCriterion("cerdidaddress not between", value1, value2, "cerdidaddress");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterion("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterion("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterion("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterion("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterion("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterion("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterion("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterion("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterion("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNull() {
            addCriterion("telnumber is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("telnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("telnumber =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("telnumber <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("telnumber >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("telnumber >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("telnumber <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("telnumber <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("telnumber like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("telnumber not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("telnumber in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("telnumber not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("telnumber between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("telnumber not between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIsNull() {
            addCriterion("familyaddress is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIsNotNull() {
            addCriterion("familyaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressEqualTo(String value) {
            addCriterion("familyaddress =", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotEqualTo(String value) {
            addCriterion("familyaddress <>", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressGreaterThan(String value) {
            addCriterion("familyaddress >", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("familyaddress >=", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLessThan(String value) {
            addCriterion("familyaddress <", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLessThanOrEqualTo(String value) {
            addCriterion("familyaddress <=", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLike(String value) {
            addCriterion("familyaddress like", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotLike(String value) {
            addCriterion("familyaddress not like", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIn(List<String> values) {
            addCriterion("familyaddress in", values, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotIn(List<String> values) {
            addCriterion("familyaddress not in", values, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressBetween(String value1, String value2) {
            addCriterion("familyaddress between", value1, value2, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotBetween(String value1, String value2) {
            addCriterion("familyaddress not between", value1, value2, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativeplace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativeplace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativeplace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativeplace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativeplace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativeplace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativeplace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativeplace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativeplace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativeplace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativeplace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andMarrystateIsNull() {
            addCriterion("marrystate is null");
            return (Criteria) this;
        }

        public Criteria andMarrystateIsNotNull() {
            addCriterion("marrystate is not null");
            return (Criteria) this;
        }

        public Criteria andMarrystateEqualTo(String value) {
            addCriterion("marrystate =", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateNotEqualTo(String value) {
            addCriterion("marrystate <>", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateGreaterThan(String value) {
            addCriterion("marrystate >", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateGreaterThanOrEqualTo(String value) {
            addCriterion("marrystate >=", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateLessThan(String value) {
            addCriterion("marrystate <", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateLessThanOrEqualTo(String value) {
            addCriterion("marrystate <=", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateLike(String value) {
            addCriterion("marrystate like", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateNotLike(String value) {
            addCriterion("marrystate not like", value, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateIn(List<String> values) {
            addCriterion("marrystate in", values, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateNotIn(List<String> values) {
            addCriterion("marrystate not in", values, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateBetween(String value1, String value2) {
            addCriterion("marrystate between", value1, value2, "marrystate");
            return (Criteria) this;
        }

        public Criteria andMarrystateNotBetween(String value1, String value2) {
            addCriterion("marrystate not between", value1, value2, "marrystate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateIsNull() {
            addCriterion("divorcedate is null");
            return (Criteria) this;
        }

        public Criteria andDivorcedateIsNotNull() {
            addCriterion("divorcedate is not null");
            return (Criteria) this;
        }

        public Criteria andDivorcedateEqualTo(Date value) {
            addCriterion("divorcedate =", value, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateNotEqualTo(Date value) {
            addCriterion("divorcedate <>", value, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateGreaterThan(Date value) {
            addCriterion("divorcedate >", value, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateGreaterThanOrEqualTo(Date value) {
            addCriterion("divorcedate >=", value, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateLessThan(Date value) {
            addCriterion("divorcedate <", value, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateLessThanOrEqualTo(Date value) {
            addCriterion("divorcedate <=", value, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateIn(List<Date> values) {
            addCriterion("divorcedate in", values, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateNotIn(List<Date> values) {
            addCriterion("divorcedate not in", values, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateBetween(Date value1, Date value2) {
            addCriterion("divorcedate between", value1, value2, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcedateNotBetween(Date value1, Date value2) {
            addCriterion("divorcedate not between", value1, value2, "divorcedate");
            return (Criteria) this;
        }

        public Criteria andDivorcesignIsNull() {
            addCriterion("divorcesign is null");
            return (Criteria) this;
        }

        public Criteria andDivorcesignIsNotNull() {
            addCriterion("divorcesign is not null");
            return (Criteria) this;
        }

        public Criteria andDivorcesignEqualTo(String value) {
            addCriterion("divorcesign =", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignNotEqualTo(String value) {
            addCriterion("divorcesign <>", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignGreaterThan(String value) {
            addCriterion("divorcesign >", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignGreaterThanOrEqualTo(String value) {
            addCriterion("divorcesign >=", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignLessThan(String value) {
            addCriterion("divorcesign <", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignLessThanOrEqualTo(String value) {
            addCriterion("divorcesign <=", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignLike(String value) {
            addCriterion("divorcesign like", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignNotLike(String value) {
            addCriterion("divorcesign not like", value, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignIn(List<String> values) {
            addCriterion("divorcesign in", values, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignNotIn(List<String> values) {
            addCriterion("divorcesign not in", values, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignBetween(String value1, String value2) {
            addCriterion("divorcesign between", value1, value2, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andDivorcesignNotBetween(String value1, String value2) {
            addCriterion("divorcesign not between", value1, value2, "divorcesign");
            return (Criteria) this;
        }

        public Criteria andEstatestateIsNull() {
            addCriterion("estatestate is null");
            return (Criteria) this;
        }

        public Criteria andEstatestateIsNotNull() {
            addCriterion("estatestate is not null");
            return (Criteria) this;
        }

        public Criteria andEstatestateEqualTo(String value) {
            addCriterion("estatestate =", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateNotEqualTo(String value) {
            addCriterion("estatestate <>", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateGreaterThan(String value) {
            addCriterion("estatestate >", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateGreaterThanOrEqualTo(String value) {
            addCriterion("estatestate >=", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateLessThan(String value) {
            addCriterion("estatestate <", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateLessThanOrEqualTo(String value) {
            addCriterion("estatestate <=", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateLike(String value) {
            addCriterion("estatestate like", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateNotLike(String value) {
            addCriterion("estatestate not like", value, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateIn(List<String> values) {
            addCriterion("estatestate in", values, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateNotIn(List<String> values) {
            addCriterion("estatestate not in", values, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateBetween(String value1, String value2) {
            addCriterion("estatestate between", value1, value2, "estatestate");
            return (Criteria) this;
        }

        public Criteria andEstatestateNotBetween(String value1, String value2) {
            addCriterion("estatestate not between", value1, value2, "estatestate");
            return (Criteria) this;
        }

        public Criteria andHavechildflgIsNull() {
            addCriterion("havechildflg is null");
            return (Criteria) this;
        }

        public Criteria andHavechildflgIsNotNull() {
            addCriterion("havechildflg is not null");
            return (Criteria) this;
        }

        public Criteria andHavechildflgEqualTo(String value) {
            addCriterion("havechildflg =", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgNotEqualTo(String value) {
            addCriterion("havechildflg <>", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgGreaterThan(String value) {
            addCriterion("havechildflg >", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgGreaterThanOrEqualTo(String value) {
            addCriterion("havechildflg >=", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgLessThan(String value) {
            addCriterion("havechildflg <", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgLessThanOrEqualTo(String value) {
            addCriterion("havechildflg <=", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgLike(String value) {
            addCriterion("havechildflg like", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgNotLike(String value) {
            addCriterion("havechildflg not like", value, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgIn(List<String> values) {
            addCriterion("havechildflg in", values, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgNotIn(List<String> values) {
            addCriterion("havechildflg not in", values, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgBetween(String value1, String value2) {
            addCriterion("havechildflg between", value1, value2, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andHavechildflgNotBetween(String value1, String value2) {
            addCriterion("havechildflg not between", value1, value2, "havechildflg");
            return (Criteria) this;
        }

        public Criteria andChildcountIsNull() {
            addCriterion("childcount is null");
            return (Criteria) this;
        }

        public Criteria andChildcountIsNotNull() {
            addCriterion("childcount is not null");
            return (Criteria) this;
        }

        public Criteria andChildcountEqualTo(String value) {
            addCriterion("childcount =", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountNotEqualTo(String value) {
            addCriterion("childcount <>", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountGreaterThan(String value) {
            addCriterion("childcount >", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountGreaterThanOrEqualTo(String value) {
            addCriterion("childcount >=", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountLessThan(String value) {
            addCriterion("childcount <", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountLessThanOrEqualTo(String value) {
            addCriterion("childcount <=", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountLike(String value) {
            addCriterion("childcount like", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountNotLike(String value) {
            addCriterion("childcount not like", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountIn(List<String> values) {
            addCriterion("childcount in", values, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountNotIn(List<String> values) {
            addCriterion("childcount not in", values, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountBetween(String value1, String value2) {
            addCriterion("childcount between", value1, value2, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountNotBetween(String value1, String value2) {
            addCriterion("childcount not between", value1, value2, "childcount");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionIsNull() {
            addCriterion("childdescription is null");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionIsNotNull() {
            addCriterion("childdescription is not null");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionEqualTo(String value) {
            addCriterion("childdescription =", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionNotEqualTo(String value) {
            addCriterion("childdescription <>", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionGreaterThan(String value) {
            addCriterion("childdescription >", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("childdescription >=", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionLessThan(String value) {
            addCriterion("childdescription <", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionLessThanOrEqualTo(String value) {
            addCriterion("childdescription <=", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionLike(String value) {
            addCriterion("childdescription like", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionNotLike(String value) {
            addCriterion("childdescription not like", value, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionIn(List<String> values) {
            addCriterion("childdescription in", values, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionNotIn(List<String> values) {
            addCriterion("childdescription not in", values, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionBetween(String value1, String value2) {
            addCriterion("childdescription between", value1, value2, "childdescription");
            return (Criteria) this;
        }

        public Criteria andChilddescriptionNotBetween(String value1, String value2) {
            addCriterion("childdescription not between", value1, value2, "childdescription");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgIsNull() {
            addCriterion("dangerjobflg is null");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgIsNotNull() {
            addCriterion("dangerjobflg is not null");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgEqualTo(String value) {
            addCriterion("dangerjobflg =", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgNotEqualTo(String value) {
            addCriterion("dangerjobflg <>", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgGreaterThan(String value) {
            addCriterion("dangerjobflg >", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgGreaterThanOrEqualTo(String value) {
            addCriterion("dangerjobflg >=", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgLessThan(String value) {
            addCriterion("dangerjobflg <", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgLessThanOrEqualTo(String value) {
            addCriterion("dangerjobflg <=", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgLike(String value) {
            addCriterion("dangerjobflg like", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgNotLike(String value) {
            addCriterion("dangerjobflg not like", value, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgIn(List<String> values) {
            addCriterion("dangerjobflg in", values, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgNotIn(List<String> values) {
            addCriterion("dangerjobflg not in", values, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgBetween(String value1, String value2) {
            addCriterion("dangerjobflg between", value1, value2, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andDangerjobflgNotBetween(String value1, String value2) {
            addCriterion("dangerjobflg not between", value1, value2, "dangerjobflg");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
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

        public Criteria andCompropertyIsNull() {
            addCriterion("comproperty is null");
            return (Criteria) this;
        }

        public Criteria andCompropertyIsNotNull() {
            addCriterion("comproperty is not null");
            return (Criteria) this;
        }

        public Criteria andCompropertyEqualTo(String value) {
            addCriterion("comproperty =", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyNotEqualTo(String value) {
            addCriterion("comproperty <>", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyGreaterThan(String value) {
            addCriterion("comproperty >", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyGreaterThanOrEqualTo(String value) {
            addCriterion("comproperty >=", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyLessThan(String value) {
            addCriterion("comproperty <", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyLessThanOrEqualTo(String value) {
            addCriterion("comproperty <=", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyLike(String value) {
            addCriterion("comproperty like", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyNotLike(String value) {
            addCriterion("comproperty not like", value, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyIn(List<String> values) {
            addCriterion("comproperty in", values, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyNotIn(List<String> values) {
            addCriterion("comproperty not in", values, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyBetween(String value1, String value2) {
            addCriterion("comproperty between", value1, value2, "comproperty");
            return (Criteria) this;
        }

        public Criteria andCompropertyNotBetween(String value1, String value2) {
            addCriterion("comproperty not between", value1, value2, "comproperty");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andMonthincomeIsNull() {
            addCriterion("monthincome is null");
            return (Criteria) this;
        }

        public Criteria andMonthincomeIsNotNull() {
            addCriterion("monthincome is not null");
            return (Criteria) this;
        }

        public Criteria andMonthincomeEqualTo(BigDecimal value) {
            addCriterion("monthincome =", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeNotEqualTo(BigDecimal value) {
            addCriterion("monthincome <>", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeGreaterThan(BigDecimal value) {
            addCriterion("monthincome >", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthincome >=", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeLessThan(BigDecimal value) {
            addCriterion("monthincome <", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthincome <=", value, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeIn(List<BigDecimal> values) {
            addCriterion("monthincome in", values, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeNotIn(List<BigDecimal> values) {
            addCriterion("monthincome not in", values, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthincome between", value1, value2, "monthincome");
            return (Criteria) this;
        }

        public Criteria andMonthincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthincome not between", value1, value2, "monthincome");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressIsNull() {
            addCriterion("realcomaddress is null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressIsNotNull() {
            addCriterion("realcomaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressEqualTo(String value) {
            addCriterion("realcomaddress =", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotEqualTo(String value) {
            addCriterion("realcomaddress <>", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressGreaterThan(String value) {
            addCriterion("realcomaddress >", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressGreaterThanOrEqualTo(String value) {
            addCriterion("realcomaddress >=", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressLessThan(String value) {
            addCriterion("realcomaddress <", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressLessThanOrEqualTo(String value) {
            addCriterion("realcomaddress <=", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressLike(String value) {
            addCriterion("realcomaddress like", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotLike(String value) {
            addCriterion("realcomaddress not like", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressIn(List<String> values) {
            addCriterion("realcomaddress in", values, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotIn(List<String> values) {
            addCriterion("realcomaddress not in", values, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressBetween(String value1, String value2) {
            addCriterion("realcomaddress between", value1, value2, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotBetween(String value1, String value2) {
            addCriterion("realcomaddress not between", value1, value2, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNull() {
            addCriterion("receipt is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIsNotNull() {
            addCriterion("receipt is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEqualTo(BigDecimal value) {
            addCriterion("receipt =", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotEqualTo(BigDecimal value) {
            addCriterion("receipt <>", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThan(BigDecimal value) {
            addCriterion("receipt >", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("receipt >=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThan(BigDecimal value) {
            addCriterion("receipt <", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptLessThanOrEqualTo(BigDecimal value) {
            addCriterion("receipt <=", value, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptIn(List<BigDecimal> values) {
            addCriterion("receipt in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotIn(List<BigDecimal> values) {
            addCriterion("receipt not in", values, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipt between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andReceiptNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("receipt not between", value1, value2, "receipt");
            return (Criteria) this;
        }

        public Criteria andNetmarginIsNull() {
            addCriterion("netmargin is null");
            return (Criteria) this;
        }

        public Criteria andNetmarginIsNotNull() {
            addCriterion("netmargin is not null");
            return (Criteria) this;
        }

        public Criteria andNetmarginEqualTo(BigDecimal value) {
            addCriterion("netmargin =", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginNotEqualTo(BigDecimal value) {
            addCriterion("netmargin <>", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginGreaterThan(BigDecimal value) {
            addCriterion("netmargin >", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("netmargin >=", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginLessThan(BigDecimal value) {
            addCriterion("netmargin <", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("netmargin <=", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginIn(List<BigDecimal> values) {
            addCriterion("netmargin in", values, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginNotIn(List<BigDecimal> values) {
            addCriterion("netmargin not in", values, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netmargin between", value1, value2, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netmargin not between", value1, value2, "netmargin");
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