package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustinfoExample() {
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

        public Criteria andCustnoIsNull() {
            addCriterion("custno is null");
            return (Criteria) this;
        }

        public Criteria andCustnoIsNotNull() {
            addCriterion("custno is not null");
            return (Criteria) this;
        }

        public Criteria andCustnoEqualTo(String value) {
            addCriterion("custno =", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotEqualTo(String value) {
            addCriterion("custno <>", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoGreaterThan(String value) {
            addCriterion("custno >", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoGreaterThanOrEqualTo(String value) {
            addCriterion("custno >=", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLessThan(String value) {
            addCriterion("custno <", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLessThanOrEqualTo(String value) {
            addCriterion("custno <=", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoLike(String value) {
            addCriterion("custno like", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotLike(String value) {
            addCriterion("custno not like", value, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoIn(List<String> values) {
            addCriterion("custno in", values, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotIn(List<String> values) {
            addCriterion("custno not in", values, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoBetween(String value1, String value2) {
            addCriterion("custno between", value1, value2, "custno");
            return (Criteria) this;
        }

        public Criteria andCustnoNotBetween(String value1, String value2) {
            addCriterion("custno not between", value1, value2, "custno");
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

        public Criteria andCerdtypeIsNull() {
            addCriterion("cerdtype is null");
            return (Criteria) this;
        }

        public Criteria andCerdtypeIsNotNull() {
            addCriterion("cerdtype is not null");
            return (Criteria) this;
        }

        public Criteria andCerdtypeEqualTo(String value) {
            addCriterion("cerdtype =", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeNotEqualTo(String value) {
            addCriterion("cerdtype <>", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeGreaterThan(String value) {
            addCriterion("cerdtype >", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cerdtype >=", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeLessThan(String value) {
            addCriterion("cerdtype <", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeLessThanOrEqualTo(String value) {
            addCriterion("cerdtype <=", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeLike(String value) {
            addCriterion("cerdtype like", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeNotLike(String value) {
            addCriterion("cerdtype not like", value, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeIn(List<String> values) {
            addCriterion("cerdtype in", values, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeNotIn(List<String> values) {
            addCriterion("cerdtype not in", values, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeBetween(String value1, String value2) {
            addCriterion("cerdtype between", value1, value2, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andCerdtypeNotBetween(String value1, String value2) {
            addCriterion("cerdtype not between", value1, value2, "cerdtype");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
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

        public Criteria andFamilyaddressprovinceIsNull() {
            addCriterion("familyaddressprovince is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceIsNotNull() {
            addCriterion("familyaddressprovince is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceEqualTo(String value) {
            addCriterion("familyaddressprovince =", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceNotEqualTo(String value) {
            addCriterion("familyaddressprovince <>", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceGreaterThan(String value) {
            addCriterion("familyaddressprovince >", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("familyaddressprovince >=", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceLessThan(String value) {
            addCriterion("familyaddressprovince <", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceLessThanOrEqualTo(String value) {
            addCriterion("familyaddressprovince <=", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceLike(String value) {
            addCriterion("familyaddressprovince like", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceNotLike(String value) {
            addCriterion("familyaddressprovince not like", value, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceIn(List<String> values) {
            addCriterion("familyaddressprovince in", values, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceNotIn(List<String> values) {
            addCriterion("familyaddressprovince not in", values, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceBetween(String value1, String value2) {
            addCriterion("familyaddressprovince between", value1, value2, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressprovinceNotBetween(String value1, String value2) {
            addCriterion("familyaddressprovince not between", value1, value2, "familyaddressprovince");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityIsNull() {
            addCriterion("familyaddresscity is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityIsNotNull() {
            addCriterion("familyaddresscity is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityEqualTo(String value) {
            addCriterion("familyaddresscity =", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityNotEqualTo(String value) {
            addCriterion("familyaddresscity <>", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityGreaterThan(String value) {
            addCriterion("familyaddresscity >", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("familyaddresscity >=", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityLessThan(String value) {
            addCriterion("familyaddresscity <", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityLessThanOrEqualTo(String value) {
            addCriterion("familyaddresscity <=", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityLike(String value) {
            addCriterion("familyaddresscity like", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityNotLike(String value) {
            addCriterion("familyaddresscity not like", value, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityIn(List<String> values) {
            addCriterion("familyaddresscity in", values, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityNotIn(List<String> values) {
            addCriterion("familyaddresscity not in", values, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityBetween(String value1, String value2) {
            addCriterion("familyaddresscity between", value1, value2, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddresscityNotBetween(String value1, String value2) {
            addCriterion("familyaddresscity not between", value1, value2, "familyaddresscity");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaIsNull() {
            addCriterion("familyaddressarea is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaIsNotNull() {
            addCriterion("familyaddressarea is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaEqualTo(String value) {
            addCriterion("familyaddressarea =", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaNotEqualTo(String value) {
            addCriterion("familyaddressarea <>", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaGreaterThan(String value) {
            addCriterion("familyaddressarea >", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaGreaterThanOrEqualTo(String value) {
            addCriterion("familyaddressarea >=", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaLessThan(String value) {
            addCriterion("familyaddressarea <", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaLessThanOrEqualTo(String value) {
            addCriterion("familyaddressarea <=", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaLike(String value) {
            addCriterion("familyaddressarea like", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaNotLike(String value) {
            addCriterion("familyaddressarea not like", value, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaIn(List<String> values) {
            addCriterion("familyaddressarea in", values, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaNotIn(List<String> values) {
            addCriterion("familyaddressarea not in", values, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaBetween(String value1, String value2) {
            addCriterion("familyaddressarea between", value1, value2, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressareaNotBetween(String value1, String value2) {
            addCriterion("familyaddressarea not between", value1, value2, "familyaddressarea");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailIsNull() {
            addCriterion("familyaddressdetail is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailIsNotNull() {
            addCriterion("familyaddressdetail is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailEqualTo(String value) {
            addCriterion("familyaddressdetail =", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailNotEqualTo(String value) {
            addCriterion("familyaddressdetail <>", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailGreaterThan(String value) {
            addCriterion("familyaddressdetail >", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailGreaterThanOrEqualTo(String value) {
            addCriterion("familyaddressdetail >=", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailLessThan(String value) {
            addCriterion("familyaddressdetail <", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailLessThanOrEqualTo(String value) {
            addCriterion("familyaddressdetail <=", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailLike(String value) {
            addCriterion("familyaddressdetail like", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailNotLike(String value) {
            addCriterion("familyaddressdetail not like", value, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailIn(List<String> values) {
            addCriterion("familyaddressdetail in", values, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailNotIn(List<String> values) {
            addCriterion("familyaddressdetail not in", values, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailBetween(String value1, String value2) {
            addCriterion("familyaddressdetail between", value1, value2, "familyaddressdetail");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressdetailNotBetween(String value1, String value2) {
            addCriterion("familyaddressdetail not between", value1, value2, "familyaddressdetail");
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

        public Criteria andCensusregisterprovvinceIsNull() {
            addCriterion("censusregisterprovvince is null");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceIsNotNull() {
            addCriterion("censusregisterprovvince is not null");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceEqualTo(String value) {
            addCriterion("censusregisterprovvince =", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceNotEqualTo(String value) {
            addCriterion("censusregisterprovvince <>", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceGreaterThan(String value) {
            addCriterion("censusregisterprovvince >", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceGreaterThanOrEqualTo(String value) {
            addCriterion("censusregisterprovvince >=", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceLessThan(String value) {
            addCriterion("censusregisterprovvince <", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceLessThanOrEqualTo(String value) {
            addCriterion("censusregisterprovvince <=", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceLike(String value) {
            addCriterion("censusregisterprovvince like", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceNotLike(String value) {
            addCriterion("censusregisterprovvince not like", value, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceIn(List<String> values) {
            addCriterion("censusregisterprovvince in", values, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceNotIn(List<String> values) {
            addCriterion("censusregisterprovvince not in", values, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceBetween(String value1, String value2) {
            addCriterion("censusregisterprovvince between", value1, value2, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregisterprovvinceNotBetween(String value1, String value2) {
            addCriterion("censusregisterprovvince not between", value1, value2, "censusregisterprovvince");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityIsNull() {
            addCriterion("censusregistercity is null");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityIsNotNull() {
            addCriterion("censusregistercity is not null");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityEqualTo(String value) {
            addCriterion("censusregistercity =", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityNotEqualTo(String value) {
            addCriterion("censusregistercity <>", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityGreaterThan(String value) {
            addCriterion("censusregistercity >", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityGreaterThanOrEqualTo(String value) {
            addCriterion("censusregistercity >=", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityLessThan(String value) {
            addCriterion("censusregistercity <", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityLessThanOrEqualTo(String value) {
            addCriterion("censusregistercity <=", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityLike(String value) {
            addCriterion("censusregistercity like", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityNotLike(String value) {
            addCriterion("censusregistercity not like", value, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityIn(List<String> values) {
            addCriterion("censusregistercity in", values, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityNotIn(List<String> values) {
            addCriterion("censusregistercity not in", values, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityBetween(String value1, String value2) {
            addCriterion("censusregistercity between", value1, value2, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andCensusregistercityNotBetween(String value1, String value2) {
            addCriterion("censusregistercity not between", value1, value2, "censusregistercity");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalstatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalstatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalstatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalstatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalstatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalstatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalstatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalstatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalstatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalstatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalstatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalstatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andIslitigationIsNull() {
            addCriterion("islitigation is null");
            return (Criteria) this;
        }

        public Criteria andIslitigationIsNotNull() {
            addCriterion("islitigation is not null");
            return (Criteria) this;
        }

        public Criteria andIslitigationEqualTo(String value) {
            addCriterion("islitigation =", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationNotEqualTo(String value) {
            addCriterion("islitigation <>", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationGreaterThan(String value) {
            addCriterion("islitigation >", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationGreaterThanOrEqualTo(String value) {
            addCriterion("islitigation >=", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationLessThan(String value) {
            addCriterion("islitigation <", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationLessThanOrEqualTo(String value) {
            addCriterion("islitigation <=", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationLike(String value) {
            addCriterion("islitigation like", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationNotLike(String value) {
            addCriterion("islitigation not like", value, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationIn(List<String> values) {
            addCriterion("islitigation in", values, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationNotIn(List<String> values) {
            addCriterion("islitigation not in", values, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationBetween(String value1, String value2) {
            addCriterion("islitigation between", value1, value2, "islitigation");
            return (Criteria) this;
        }

        public Criteria andIslitigationNotBetween(String value1, String value2) {
            addCriterion("islitigation not between", value1, value2, "islitigation");
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

        public Criteria andApplymainIsNull() {
            addCriterion("applymain is null");
            return (Criteria) this;
        }

        public Criteria andApplymainIsNotNull() {
            addCriterion("applymain is not null");
            return (Criteria) this;
        }

        public Criteria andApplymainEqualTo(String value) {
            addCriterion("applymain =", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainNotEqualTo(String value) {
            addCriterion("applymain <>", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainGreaterThan(String value) {
            addCriterion("applymain >", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainGreaterThanOrEqualTo(String value) {
            addCriterion("applymain >=", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainLessThan(String value) {
            addCriterion("applymain <", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainLessThanOrEqualTo(String value) {
            addCriterion("applymain <=", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainLike(String value) {
            addCriterion("applymain like", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainNotLike(String value) {
            addCriterion("applymain not like", value, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainIn(List<String> values) {
            addCriterion("applymain in", values, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainNotIn(List<String> values) {
            addCriterion("applymain not in", values, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainBetween(String value1, String value2) {
            addCriterion("applymain between", value1, value2, "applymain");
            return (Criteria) this;
        }

        public Criteria andApplymainNotBetween(String value1, String value2) {
            addCriterion("applymain not between", value1, value2, "applymain");
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

        public Criteria andComproperty1IsNull() {
            addCriterion("comproperty1 is null");
            return (Criteria) this;
        }

        public Criteria andComproperty1IsNotNull() {
            addCriterion("comproperty1 is not null");
            return (Criteria) this;
        }

        public Criteria andComproperty1EqualTo(String value) {
            addCriterion("comproperty1 =", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1NotEqualTo(String value) {
            addCriterion("comproperty1 <>", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1GreaterThan(String value) {
            addCriterion("comproperty1 >", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1GreaterThanOrEqualTo(String value) {
            addCriterion("comproperty1 >=", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1LessThan(String value) {
            addCriterion("comproperty1 <", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1LessThanOrEqualTo(String value) {
            addCriterion("comproperty1 <=", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1Like(String value) {
            addCriterion("comproperty1 like", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1NotLike(String value) {
            addCriterion("comproperty1 not like", value, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1In(List<String> values) {
            addCriterion("comproperty1 in", values, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1NotIn(List<String> values) {
            addCriterion("comproperty1 not in", values, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1Between(String value1, String value2) {
            addCriterion("comproperty1 between", value1, value2, "comproperty1");
            return (Criteria) this;
        }

        public Criteria andComproperty1NotBetween(String value1, String value2) {
            addCriterion("comproperty1 not between", value1, value2, "comproperty1");
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

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andBusilicenceIsNull() {
            addCriterion("busilicence is null");
            return (Criteria) this;
        }

        public Criteria andBusilicenceIsNotNull() {
            addCriterion("busilicence is not null");
            return (Criteria) this;
        }

        public Criteria andBusilicenceEqualTo(String value) {
            addCriterion("busilicence =", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceNotEqualTo(String value) {
            addCriterion("busilicence <>", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceGreaterThan(String value) {
            addCriterion("busilicence >", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceGreaterThanOrEqualTo(String value) {
            addCriterion("busilicence >=", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceLessThan(String value) {
            addCriterion("busilicence <", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceLessThanOrEqualTo(String value) {
            addCriterion("busilicence <=", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceLike(String value) {
            addCriterion("busilicence like", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceNotLike(String value) {
            addCriterion("busilicence not like", value, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceIn(List<String> values) {
            addCriterion("busilicence in", values, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceNotIn(List<String> values) {
            addCriterion("busilicence not in", values, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceBetween(String value1, String value2) {
            addCriterion("busilicence between", value1, value2, "busilicence");
            return (Criteria) this;
        }

        public Criteria andBusilicenceNotBetween(String value1, String value2) {
            addCriterion("busilicence not between", value1, value2, "busilicence");
            return (Criteria) this;
        }

        public Criteria andCerditaddressIsNull() {
            addCriterion("cerditaddress is null");
            return (Criteria) this;
        }

        public Criteria andCerditaddressIsNotNull() {
            addCriterion("cerditaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCerditaddressEqualTo(String value) {
            addCriterion("cerditaddress =", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressNotEqualTo(String value) {
            addCriterion("cerditaddress <>", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressGreaterThan(String value) {
            addCriterion("cerditaddress >", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressGreaterThanOrEqualTo(String value) {
            addCriterion("cerditaddress >=", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressLessThan(String value) {
            addCriterion("cerditaddress <", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressLessThanOrEqualTo(String value) {
            addCriterion("cerditaddress <=", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressLike(String value) {
            addCriterion("cerditaddress like", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressNotLike(String value) {
            addCriterion("cerditaddress not like", value, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressIn(List<String> values) {
            addCriterion("cerditaddress in", values, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressNotIn(List<String> values) {
            addCriterion("cerditaddress not in", values, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressBetween(String value1, String value2) {
            addCriterion("cerditaddress between", value1, value2, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCerditaddressNotBetween(String value1, String value2) {
            addCriterion("cerditaddress not between", value1, value2, "cerditaddress");
            return (Criteria) this;
        }

        public Criteria andCreditimageIsNull() {
            addCriterion("creditimage is null");
            return (Criteria) this;
        }

        public Criteria andCreditimageIsNotNull() {
            addCriterion("creditimage is not null");
            return (Criteria) this;
        }

        public Criteria andCreditimageEqualTo(String value) {
            addCriterion("creditimage =", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageNotEqualTo(String value) {
            addCriterion("creditimage <>", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageGreaterThan(String value) {
            addCriterion("creditimage >", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageGreaterThanOrEqualTo(String value) {
            addCriterion("creditimage >=", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageLessThan(String value) {
            addCriterion("creditimage <", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageLessThanOrEqualTo(String value) {
            addCriterion("creditimage <=", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageLike(String value) {
            addCriterion("creditimage like", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageNotLike(String value) {
            addCriterion("creditimage not like", value, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageIn(List<String> values) {
            addCriterion("creditimage in", values, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageNotIn(List<String> values) {
            addCriterion("creditimage not in", values, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageBetween(String value1, String value2) {
            addCriterion("creditimage between", value1, value2, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimageNotBetween(String value1, String value2) {
            addCriterion("creditimage not between", value1, value2, "creditimage");
            return (Criteria) this;
        }

        public Criteria andCreditimage2IsNull() {
            addCriterion("creditimage2 is null");
            return (Criteria) this;
        }

        public Criteria andCreditimage2IsNotNull() {
            addCriterion("creditimage2 is not null");
            return (Criteria) this;
        }

        public Criteria andCreditimage2EqualTo(String value) {
            addCriterion("creditimage2 =", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2NotEqualTo(String value) {
            addCriterion("creditimage2 <>", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2GreaterThan(String value) {
            addCriterion("creditimage2 >", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2GreaterThanOrEqualTo(String value) {
            addCriterion("creditimage2 >=", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2LessThan(String value) {
            addCriterion("creditimage2 <", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2LessThanOrEqualTo(String value) {
            addCriterion("creditimage2 <=", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2Like(String value) {
            addCriterion("creditimage2 like", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2NotLike(String value) {
            addCriterion("creditimage2 not like", value, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2In(List<String> values) {
            addCriterion("creditimage2 in", values, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2NotIn(List<String> values) {
            addCriterion("creditimage2 not in", values, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2Between(String value1, String value2) {
            addCriterion("creditimage2 between", value1, value2, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andCreditimage2NotBetween(String value1, String value2) {
            addCriterion("creditimage2 not between", value1, value2, "creditimage2");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceIsNull() {
            addCriterion("nativeplaceprovince is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceIsNotNull() {
            addCriterion("nativeplaceprovince is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceEqualTo(String value) {
            addCriterion("nativeplaceprovince =", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceNotEqualTo(String value) {
            addCriterion("nativeplaceprovince <>", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceGreaterThan(String value) {
            addCriterion("nativeplaceprovince >", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplaceprovince >=", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceLessThan(String value) {
            addCriterion("nativeplaceprovince <", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceLessThanOrEqualTo(String value) {
            addCriterion("nativeplaceprovince <=", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceLike(String value) {
            addCriterion("nativeplaceprovince like", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceNotLike(String value) {
            addCriterion("nativeplaceprovince not like", value, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceIn(List<String> values) {
            addCriterion("nativeplaceprovince in", values, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceNotIn(List<String> values) {
            addCriterion("nativeplaceprovince not in", values, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceBetween(String value1, String value2) {
            addCriterion("nativeplaceprovince between", value1, value2, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplaceprovinceNotBetween(String value1, String value2) {
            addCriterion("nativeplaceprovince not between", value1, value2, "nativeplaceprovince");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityIsNull() {
            addCriterion("nativeplacecity is null");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityIsNotNull() {
            addCriterion("nativeplacecity is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityEqualTo(String value) {
            addCriterion("nativeplacecity =", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityNotEqualTo(String value) {
            addCriterion("nativeplacecity <>", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityGreaterThan(String value) {
            addCriterion("nativeplacecity >", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplacecity >=", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityLessThan(String value) {
            addCriterion("nativeplacecity <", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityLessThanOrEqualTo(String value) {
            addCriterion("nativeplacecity <=", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityLike(String value) {
            addCriterion("nativeplacecity like", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityNotLike(String value) {
            addCriterion("nativeplacecity not like", value, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityIn(List<String> values) {
            addCriterion("nativeplacecity in", values, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityNotIn(List<String> values) {
            addCriterion("nativeplacecity not in", values, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityBetween(String value1, String value2) {
            addCriterion("nativeplacecity between", value1, value2, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplacecityNotBetween(String value1, String value2) {
            addCriterion("nativeplacecity not between", value1, value2, "nativeplacecity");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaIsNull() {
            addCriterion("nativeplacearea is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaIsNotNull() {
            addCriterion("nativeplacearea is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaEqualTo(String value) {
            addCriterion("nativeplacearea =", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaNotEqualTo(String value) {
            addCriterion("nativeplacearea <>", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaGreaterThan(String value) {
            addCriterion("nativeplacearea >", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplacearea >=", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaLessThan(String value) {
            addCriterion("nativeplacearea <", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaLessThanOrEqualTo(String value) {
            addCriterion("nativeplacearea <=", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaLike(String value) {
            addCriterion("nativeplacearea like", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaNotLike(String value) {
            addCriterion("nativeplacearea not like", value, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaIn(List<String> values) {
            addCriterion("nativeplacearea in", values, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaNotIn(List<String> values) {
            addCriterion("nativeplacearea not in", values, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaBetween(String value1, String value2) {
            addCriterion("nativeplacearea between", value1, value2, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andNativeplaceareaNotBetween(String value1, String value2) {
            addCriterion("nativeplacearea not between", value1, value2, "nativeplacearea");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateIsNull() {
            addCriterion("discoverdate is null");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateIsNotNull() {
            addCriterion("discoverdate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateEqualTo(Date value) {
            addCriterion("discoverdate =", value, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateNotEqualTo(Date value) {
            addCriterion("discoverdate <>", value, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateGreaterThan(Date value) {
            addCriterion("discoverdate >", value, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("discoverdate >=", value, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateLessThan(Date value) {
            addCriterion("discoverdate <", value, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateLessThanOrEqualTo(Date value) {
            addCriterion("discoverdate <=", value, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateIn(List<Date> values) {
            addCriterion("discoverdate in", values, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateNotIn(List<Date> values) {
            addCriterion("discoverdate not in", values, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateBetween(Date value1, Date value2) {
            addCriterion("discoverdate between", value1, value2, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoverdateNotBetween(Date value1, Date value2) {
            addCriterion("discoverdate not between", value1, value2, "discoverdate");
            return (Criteria) this;
        }

        public Criteria andDiscoversignIsNull() {
            addCriterion("discoversign is null");
            return (Criteria) this;
        }

        public Criteria andDiscoversignIsNotNull() {
            addCriterion("discoversign is not null");
            return (Criteria) this;
        }

        public Criteria andDiscoversignEqualTo(String value) {
            addCriterion("discoversign =", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignNotEqualTo(String value) {
            addCriterion("discoversign <>", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignGreaterThan(String value) {
            addCriterion("discoversign >", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignGreaterThanOrEqualTo(String value) {
            addCriterion("discoversign >=", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignLessThan(String value) {
            addCriterion("discoversign <", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignLessThanOrEqualTo(String value) {
            addCriterion("discoversign <=", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignLike(String value) {
            addCriterion("discoversign like", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignNotLike(String value) {
            addCriterion("discoversign not like", value, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignIn(List<String> values) {
            addCriterion("discoversign in", values, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignNotIn(List<String> values) {
            addCriterion("discoversign not in", values, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignBetween(String value1, String value2) {
            addCriterion("discoversign between", value1, value2, "discoversign");
            return (Criteria) this;
        }

        public Criteria andDiscoversignNotBetween(String value1, String value2) {
            addCriterion("discoversign not between", value1, value2, "discoversign");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionIsNull() {
            addCriterion("estatedescription is null");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionIsNotNull() {
            addCriterion("estatedescription is not null");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionEqualTo(String value) {
            addCriterion("estatedescription =", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionNotEqualTo(String value) {
            addCriterion("estatedescription <>", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionGreaterThan(String value) {
            addCriterion("estatedescription >", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("estatedescription >=", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionLessThan(String value) {
            addCriterion("estatedescription <", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionLessThanOrEqualTo(String value) {
            addCriterion("estatedescription <=", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionLike(String value) {
            addCriterion("estatedescription like", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionNotLike(String value) {
            addCriterion("estatedescription not like", value, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionIn(List<String> values) {
            addCriterion("estatedescription in", values, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionNotIn(List<String> values) {
            addCriterion("estatedescription not in", values, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionBetween(String value1, String value2) {
            addCriterion("estatedescription between", value1, value2, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andEstatedescriptionNotBetween(String value1, String value2) {
            addCriterion("estatedescription not between", value1, value2, "estatedescription");
            return (Criteria) this;
        }

        public Criteria andHavachildflgIsNull() {
            addCriterion("havachildflg is null");
            return (Criteria) this;
        }

        public Criteria andHavachildflgIsNotNull() {
            addCriterion("havachildflg is not null");
            return (Criteria) this;
        }

        public Criteria andHavachildflgEqualTo(String value) {
            addCriterion("havachildflg =", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgNotEqualTo(String value) {
            addCriterion("havachildflg <>", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgGreaterThan(String value) {
            addCriterion("havachildflg >", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgGreaterThanOrEqualTo(String value) {
            addCriterion("havachildflg >=", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgLessThan(String value) {
            addCriterion("havachildflg <", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgLessThanOrEqualTo(String value) {
            addCriterion("havachildflg <=", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgLike(String value) {
            addCriterion("havachildflg like", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgNotLike(String value) {
            addCriterion("havachildflg not like", value, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgIn(List<String> values) {
            addCriterion("havachildflg in", values, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgNotIn(List<String> values) {
            addCriterion("havachildflg not in", values, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgBetween(String value1, String value2) {
            addCriterion("havachildflg between", value1, value2, "havachildflg");
            return (Criteria) this;
        }

        public Criteria andHavachildflgNotBetween(String value1, String value2) {
            addCriterion("havachildflg not between", value1, value2, "havachildflg");
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

        public Criteria andDangerjobIsNull() {
            addCriterion("dangerjob is null");
            return (Criteria) this;
        }

        public Criteria andDangerjobIsNotNull() {
            addCriterion("dangerjob is not null");
            return (Criteria) this;
        }

        public Criteria andDangerjobEqualTo(String value) {
            addCriterion("dangerjob =", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobNotEqualTo(String value) {
            addCriterion("dangerjob <>", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobGreaterThan(String value) {
            addCriterion("dangerjob >", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobGreaterThanOrEqualTo(String value) {
            addCriterion("dangerjob >=", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobLessThan(String value) {
            addCriterion("dangerjob <", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobLessThanOrEqualTo(String value) {
            addCriterion("dangerjob <=", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobLike(String value) {
            addCriterion("dangerjob like", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobNotLike(String value) {
            addCriterion("dangerjob not like", value, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobIn(List<String> values) {
            addCriterion("dangerjob in", values, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobNotIn(List<String> values) {
            addCriterion("dangerjob not in", values, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobBetween(String value1, String value2) {
            addCriterion("dangerjob between", value1, value2, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andDangerjobNotBetween(String value1, String value2) {
            addCriterion("dangerjob not between", value1, value2, "dangerjob");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("relationship is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("relationship is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("relationship =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("relationship <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("relationship >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("relationship >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("relationship <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("relationship <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("relationship like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("relationship not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("relationship in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("relationship not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("relationship between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("relationship not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidIsNull() {
            addCriterion("relationcerdid is null");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidIsNotNull() {
            addCriterion("relationcerdid is not null");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidEqualTo(String value) {
            addCriterion("relationcerdid =", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidNotEqualTo(String value) {
            addCriterion("relationcerdid <>", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidGreaterThan(String value) {
            addCriterion("relationcerdid >", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidGreaterThanOrEqualTo(String value) {
            addCriterion("relationcerdid >=", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidLessThan(String value) {
            addCriterion("relationcerdid <", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidLessThanOrEqualTo(String value) {
            addCriterion("relationcerdid <=", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidLike(String value) {
            addCriterion("relationcerdid like", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidNotLike(String value) {
            addCriterion("relationcerdid not like", value, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidIn(List<String> values) {
            addCriterion("relationcerdid in", values, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidNotIn(List<String> values) {
            addCriterion("relationcerdid not in", values, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidBetween(String value1, String value2) {
            addCriterion("relationcerdid between", value1, value2, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andRelationcerdidNotBetween(String value1, String value2) {
            addCriterion("relationcerdid not between", value1, value2, "relationcerdid");
            return (Criteria) this;
        }

        public Criteria andIsmarrowIsNull() {
            addCriterion("ismarrow is null");
            return (Criteria) this;
        }

        public Criteria andIsmarrowIsNotNull() {
            addCriterion("ismarrow is not null");
            return (Criteria) this;
        }

        public Criteria andIsmarrowEqualTo(String value) {
            addCriterion("ismarrow =", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowNotEqualTo(String value) {
            addCriterion("ismarrow <>", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowGreaterThan(String value) {
            addCriterion("ismarrow >", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowGreaterThanOrEqualTo(String value) {
            addCriterion("ismarrow >=", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowLessThan(String value) {
            addCriterion("ismarrow <", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowLessThanOrEqualTo(String value) {
            addCriterion("ismarrow <=", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowLike(String value) {
            addCriterion("ismarrow like", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowNotLike(String value) {
            addCriterion("ismarrow not like", value, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowIn(List<String> values) {
            addCriterion("ismarrow in", values, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowNotIn(List<String> values) {
            addCriterion("ismarrow not in", values, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowBetween(String value1, String value2) {
            addCriterion("ismarrow between", value1, value2, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andIsmarrowNotBetween(String value1, String value2) {
            addCriterion("ismarrow not between", value1, value2, "ismarrow");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatIsNull() {
            addCriterion("comhavelitigat is null");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatIsNotNull() {
            addCriterion("comhavelitigat is not null");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatEqualTo(String value) {
            addCriterion("comhavelitigat =", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatNotEqualTo(String value) {
            addCriterion("comhavelitigat <>", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatGreaterThan(String value) {
            addCriterion("comhavelitigat >", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatGreaterThanOrEqualTo(String value) {
            addCriterion("comhavelitigat >=", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatLessThan(String value) {
            addCriterion("comhavelitigat <", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatLessThanOrEqualTo(String value) {
            addCriterion("comhavelitigat <=", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatLike(String value) {
            addCriterion("comhavelitigat like", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatNotLike(String value) {
            addCriterion("comhavelitigat not like", value, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatIn(List<String> values) {
            addCriterion("comhavelitigat in", values, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatNotIn(List<String> values) {
            addCriterion("comhavelitigat not in", values, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatBetween(String value1, String value2) {
            addCriterion("comhavelitigat between", value1, value2, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavelitigatNotBetween(String value1, String value2) {
            addCriterion("comhavelitigat not between", value1, value2, "comhavelitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatIsNull() {
            addCriterion("comhavalitigat is null");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatIsNotNull() {
            addCriterion("comhavalitigat is not null");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatEqualTo(String value) {
            addCriterion("comhavalitigat =", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatNotEqualTo(String value) {
            addCriterion("comhavalitigat <>", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatGreaterThan(String value) {
            addCriterion("comhavalitigat >", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatGreaterThanOrEqualTo(String value) {
            addCriterion("comhavalitigat >=", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatLessThan(String value) {
            addCriterion("comhavalitigat <", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatLessThanOrEqualTo(String value) {
            addCriterion("comhavalitigat <=", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatLike(String value) {
            addCriterion("comhavalitigat like", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatNotLike(String value) {
            addCriterion("comhavalitigat not like", value, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatIn(List<String> values) {
            addCriterion("comhavalitigat in", values, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatNotIn(List<String> values) {
            addCriterion("comhavalitigat not in", values, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatBetween(String value1, String value2) {
            addCriterion("comhavalitigat between", value1, value2, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andComhavalitigatNotBetween(String value1, String value2) {
            addCriterion("comhavalitigat not between", value1, value2, "comhavalitigat");
            return (Criteria) this;
        }

        public Criteria andJobnationIsNull() {
            addCriterion("jobnation is null");
            return (Criteria) this;
        }

        public Criteria andJobnationIsNotNull() {
            addCriterion("jobnation is not null");
            return (Criteria) this;
        }

        public Criteria andJobnationEqualTo(String value) {
            addCriterion("jobnation =", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationNotEqualTo(String value) {
            addCriterion("jobnation <>", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationGreaterThan(String value) {
            addCriterion("jobnation >", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationGreaterThanOrEqualTo(String value) {
            addCriterion("jobnation >=", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationLessThan(String value) {
            addCriterion("jobnation <", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationLessThanOrEqualTo(String value) {
            addCriterion("jobnation <=", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationLike(String value) {
            addCriterion("jobnation like", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationNotLike(String value) {
            addCriterion("jobnation not like", value, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationIn(List<String> values) {
            addCriterion("jobnation in", values, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationNotIn(List<String> values) {
            addCriterion("jobnation not in", values, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationBetween(String value1, String value2) {
            addCriterion("jobnation between", value1, value2, "jobnation");
            return (Criteria) this;
        }

        public Criteria andJobnationNotBetween(String value1, String value2) {
            addCriterion("jobnation not between", value1, value2, "jobnation");
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