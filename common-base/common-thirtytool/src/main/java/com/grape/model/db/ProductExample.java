package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("producttype is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("producttype is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("producttype =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("producttype <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("producttype >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("producttype >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("producttype <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("producttype <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("producttype like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("producttype not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("producttype in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("producttype not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("producttype between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("producttype not between", value1, value2, "producttype");
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

        public Criteria andMinloanamountIsNull() {
            addCriterion("minloanamount is null");
            return (Criteria) this;
        }

        public Criteria andMinloanamountIsNotNull() {
            addCriterion("minloanamount is not null");
            return (Criteria) this;
        }

        public Criteria andMinloanamountEqualTo(BigDecimal value) {
            addCriterion("minloanamount =", value, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountNotEqualTo(BigDecimal value) {
            addCriterion("minloanamount <>", value, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountGreaterThan(BigDecimal value) {
            addCriterion("minloanamount >", value, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minloanamount >=", value, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountLessThan(BigDecimal value) {
            addCriterion("minloanamount <", value, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minloanamount <=", value, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountIn(List<BigDecimal> values) {
            addCriterion("minloanamount in", values, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountNotIn(List<BigDecimal> values) {
            addCriterion("minloanamount not in", values, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minloanamount between", value1, value2, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMinloanamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minloanamount not between", value1, value2, "minloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountIsNull() {
            addCriterion("maxloanamount is null");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountIsNotNull() {
            addCriterion("maxloanamount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountEqualTo(BigDecimal value) {
            addCriterion("maxloanamount =", value, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountNotEqualTo(BigDecimal value) {
            addCriterion("maxloanamount <>", value, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountGreaterThan(BigDecimal value) {
            addCriterion("maxloanamount >", value, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maxloanamount >=", value, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountLessThan(BigDecimal value) {
            addCriterion("maxloanamount <", value, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maxloanamount <=", value, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountIn(List<BigDecimal> values) {
            addCriterion("maxloanamount in", values, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountNotIn(List<BigDecimal> values) {
            addCriterion("maxloanamount not in", values, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxloanamount between", value1, value2, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andMaxloanamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxloanamount not between", value1, value2, "maxloanamount");
            return (Criteria) this;
        }

        public Criteria andRatetypeIsNull() {
            addCriterion("ratetype is null");
            return (Criteria) this;
        }

        public Criteria andRatetypeIsNotNull() {
            addCriterion("ratetype is not null");
            return (Criteria) this;
        }

        public Criteria andRatetypeEqualTo(String value) {
            addCriterion("ratetype =", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotEqualTo(String value) {
            addCriterion("ratetype <>", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeGreaterThan(String value) {
            addCriterion("ratetype >", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ratetype >=", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeLessThan(String value) {
            addCriterion("ratetype <", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeLessThanOrEqualTo(String value) {
            addCriterion("ratetype <=", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeLike(String value) {
            addCriterion("ratetype like", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotLike(String value) {
            addCriterion("ratetype not like", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeIn(List<String> values) {
            addCriterion("ratetype in", values, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotIn(List<String> values) {
            addCriterion("ratetype not in", values, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeBetween(String value1, String value2) {
            addCriterion("ratetype between", value1, value2, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotBetween(String value1, String value2) {
            addCriterion("ratetype not between", value1, value2, "ratetype");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearIsNull() {
            addCriterion("minrateofyear is null");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearIsNotNull() {
            addCriterion("minrateofyear is not null");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearEqualTo(BigDecimal value) {
            addCriterion("minrateofyear =", value, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearNotEqualTo(BigDecimal value) {
            addCriterion("minrateofyear <>", value, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearGreaterThan(BigDecimal value) {
            addCriterion("minrateofyear >", value, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minrateofyear >=", value, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearLessThan(BigDecimal value) {
            addCriterion("minrateofyear <", value, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minrateofyear <=", value, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearIn(List<BigDecimal> values) {
            addCriterion("minrateofyear in", values, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearNotIn(List<BigDecimal> values) {
            addCriterion("minrateofyear not in", values, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minrateofyear between", value1, value2, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMinrateofyearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minrateofyear not between", value1, value2, "minrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearIsNull() {
            addCriterion("maxrateofyear is null");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearIsNotNull() {
            addCriterion("maxrateofyear is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearEqualTo(BigDecimal value) {
            addCriterion("maxrateofyear =", value, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearNotEqualTo(BigDecimal value) {
            addCriterion("maxrateofyear <>", value, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearGreaterThan(BigDecimal value) {
            addCriterion("maxrateofyear >", value, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maxrateofyear >=", value, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearLessThan(BigDecimal value) {
            addCriterion("maxrateofyear <", value, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maxrateofyear <=", value, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearIn(List<BigDecimal> values) {
            addCriterion("maxrateofyear in", values, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearNotIn(List<BigDecimal> values) {
            addCriterion("maxrateofyear not in", values, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxrateofyear between", value1, value2, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andMaxrateofyearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxrateofyear not between", value1, value2, "maxrateofyear");
            return (Criteria) this;
        }

        public Criteria andFundcomnoIsNull() {
            addCriterion("fundcomno is null");
            return (Criteria) this;
        }

        public Criteria andFundcomnoIsNotNull() {
            addCriterion("fundcomno is not null");
            return (Criteria) this;
        }

        public Criteria andFundcomnoEqualTo(String value) {
            addCriterion("fundcomno =", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoNotEqualTo(String value) {
            addCriterion("fundcomno <>", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoGreaterThan(String value) {
            addCriterion("fundcomno >", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoGreaterThanOrEqualTo(String value) {
            addCriterion("fundcomno >=", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoLessThan(String value) {
            addCriterion("fundcomno <", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoLessThanOrEqualTo(String value) {
            addCriterion("fundcomno <=", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoLike(String value) {
            addCriterion("fundcomno like", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoNotLike(String value) {
            addCriterion("fundcomno not like", value, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoIn(List<String> values) {
            addCriterion("fundcomno in", values, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoNotIn(List<String> values) {
            addCriterion("fundcomno not in", values, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoBetween(String value1, String value2) {
            addCriterion("fundcomno between", value1, value2, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andFundcomnoNotBetween(String value1, String value2) {
            addCriterion("fundcomno not between", value1, value2, "fundcomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoIsNull() {
            addCriterion("aislecomno is null");
            return (Criteria) this;
        }

        public Criteria andAislecomnoIsNotNull() {
            addCriterion("aislecomno is not null");
            return (Criteria) this;
        }

        public Criteria andAislecomnoEqualTo(String value) {
            addCriterion("aislecomno =", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoNotEqualTo(String value) {
            addCriterion("aislecomno <>", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoGreaterThan(String value) {
            addCriterion("aislecomno >", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoGreaterThanOrEqualTo(String value) {
            addCriterion("aislecomno >=", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoLessThan(String value) {
            addCriterion("aislecomno <", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoLessThanOrEqualTo(String value) {
            addCriterion("aislecomno <=", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoLike(String value) {
            addCriterion("aislecomno like", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoNotLike(String value) {
            addCriterion("aislecomno not like", value, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoIn(List<String> values) {
            addCriterion("aislecomno in", values, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoNotIn(List<String> values) {
            addCriterion("aislecomno not in", values, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoBetween(String value1, String value2) {
            addCriterion("aislecomno between", value1, value2, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andAislecomnoNotBetween(String value1, String value2) {
            addCriterion("aislecomno not between", value1, value2, "aislecomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoIsNull() {
            addCriterion("subsidycomno is null");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoIsNotNull() {
            addCriterion("subsidycomno is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoEqualTo(String value) {
            addCriterion("subsidycomno =", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotEqualTo(String value) {
            addCriterion("subsidycomno <>", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoGreaterThan(String value) {
            addCriterion("subsidycomno >", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoGreaterThanOrEqualTo(String value) {
            addCriterion("subsidycomno >=", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoLessThan(String value) {
            addCriterion("subsidycomno <", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoLessThanOrEqualTo(String value) {
            addCriterion("subsidycomno <=", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoLike(String value) {
            addCriterion("subsidycomno like", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotLike(String value) {
            addCriterion("subsidycomno not like", value, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoIn(List<String> values) {
            addCriterion("subsidycomno in", values, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotIn(List<String> values) {
            addCriterion("subsidycomno not in", values, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoBetween(String value1, String value2) {
            addCriterion("subsidycomno between", value1, value2, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andSubsidycomnoNotBetween(String value1, String value2) {
            addCriterion("subsidycomno not between", value1, value2, "subsidycomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoIsNull() {
            addCriterion("docmanagecomno is null");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoIsNotNull() {
            addCriterion("docmanagecomno is not null");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoEqualTo(String value) {
            addCriterion("docmanagecomno =", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoNotEqualTo(String value) {
            addCriterion("docmanagecomno <>", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoGreaterThan(String value) {
            addCriterion("docmanagecomno >", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoGreaterThanOrEqualTo(String value) {
            addCriterion("docmanagecomno >=", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoLessThan(String value) {
            addCriterion("docmanagecomno <", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoLessThanOrEqualTo(String value) {
            addCriterion("docmanagecomno <=", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoLike(String value) {
            addCriterion("docmanagecomno like", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoNotLike(String value) {
            addCriterion("docmanagecomno not like", value, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoIn(List<String> values) {
            addCriterion("docmanagecomno in", values, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoNotIn(List<String> values) {
            addCriterion("docmanagecomno not in", values, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoBetween(String value1, String value2) {
            addCriterion("docmanagecomno between", value1, value2, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andDocmanagecomnoNotBetween(String value1, String value2) {
            addCriterion("docmanagecomno not between", value1, value2, "docmanagecomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoIsNull() {
            addCriterion("receivedoccomno is null");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoIsNotNull() {
            addCriterion("receivedoccomno is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoEqualTo(String value) {
            addCriterion("receivedoccomno =", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoNotEqualTo(String value) {
            addCriterion("receivedoccomno <>", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoGreaterThan(String value) {
            addCriterion("receivedoccomno >", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoGreaterThanOrEqualTo(String value) {
            addCriterion("receivedoccomno >=", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoLessThan(String value) {
            addCriterion("receivedoccomno <", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoLessThanOrEqualTo(String value) {
            addCriterion("receivedoccomno <=", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoLike(String value) {
            addCriterion("receivedoccomno like", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoNotLike(String value) {
            addCriterion("receivedoccomno not like", value, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoIn(List<String> values) {
            addCriterion("receivedoccomno in", values, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoNotIn(List<String> values) {
            addCriterion("receivedoccomno not in", values, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoBetween(String value1, String value2) {
            addCriterion("receivedoccomno between", value1, value2, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andReceivedoccomnoNotBetween(String value1, String value2) {
            addCriterion("receivedoccomno not between", value1, value2, "receivedoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoIsNull() {
            addCriterion("outloandoccomno is null");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoIsNotNull() {
            addCriterion("outloandoccomno is not null");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoEqualTo(String value) {
            addCriterion("outloandoccomno =", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoNotEqualTo(String value) {
            addCriterion("outloandoccomno <>", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoGreaterThan(String value) {
            addCriterion("outloandoccomno >", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoGreaterThanOrEqualTo(String value) {
            addCriterion("outloandoccomno >=", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoLessThan(String value) {
            addCriterion("outloandoccomno <", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoLessThanOrEqualTo(String value) {
            addCriterion("outloandoccomno <=", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoLike(String value) {
            addCriterion("outloandoccomno like", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoNotLike(String value) {
            addCriterion("outloandoccomno not like", value, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoIn(List<String> values) {
            addCriterion("outloandoccomno in", values, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoNotIn(List<String> values) {
            addCriterion("outloandoccomno not in", values, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoBetween(String value1, String value2) {
            addCriterion("outloandoccomno between", value1, value2, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andOutloandoccomnoNotBetween(String value1, String value2) {
            addCriterion("outloandoccomno not between", value1, value2, "outloandoccomno");
            return (Criteria) this;
        }

        public Criteria andButtmodeIsNull() {
            addCriterion("buttmode is null");
            return (Criteria) this;
        }

        public Criteria andButtmodeIsNotNull() {
            addCriterion("buttmode is not null");
            return (Criteria) this;
        }

        public Criteria andButtmodeEqualTo(String value) {
            addCriterion("buttmode =", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeNotEqualTo(String value) {
            addCriterion("buttmode <>", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeGreaterThan(String value) {
            addCriterion("buttmode >", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeGreaterThanOrEqualTo(String value) {
            addCriterion("buttmode >=", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeLessThan(String value) {
            addCriterion("buttmode <", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeLessThanOrEqualTo(String value) {
            addCriterion("buttmode <=", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeLike(String value) {
            addCriterion("buttmode like", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeNotLike(String value) {
            addCriterion("buttmode not like", value, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeIn(List<String> values) {
            addCriterion("buttmode in", values, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeNotIn(List<String> values) {
            addCriterion("buttmode not in", values, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeBetween(String value1, String value2) {
            addCriterion("buttmode between", value1, value2, "buttmode");
            return (Criteria) this;
        }

        public Criteria andButtmodeNotBetween(String value1, String value2) {
            addCriterion("buttmode not between", value1, value2, "buttmode");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgIsNull() {
            addCriterion("duediligenceflg is null");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgIsNotNull() {
            addCriterion("duediligenceflg is not null");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgEqualTo(String value) {
            addCriterion("duediligenceflg =", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgNotEqualTo(String value) {
            addCriterion("duediligenceflg <>", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgGreaterThan(String value) {
            addCriterion("duediligenceflg >", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgGreaterThanOrEqualTo(String value) {
            addCriterion("duediligenceflg >=", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgLessThan(String value) {
            addCriterion("duediligenceflg <", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgLessThanOrEqualTo(String value) {
            addCriterion("duediligenceflg <=", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgLike(String value) {
            addCriterion("duediligenceflg like", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgNotLike(String value) {
            addCriterion("duediligenceflg not like", value, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgIn(List<String> values) {
            addCriterion("duediligenceflg in", values, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgNotIn(List<String> values) {
            addCriterion("duediligenceflg not in", values, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgBetween(String value1, String value2) {
            addCriterion("duediligenceflg between", value1, value2, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andDuediligenceflgNotBetween(String value1, String value2) {
            addCriterion("duediligenceflg not between", value1, value2, "duediligenceflg");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeIsNull() {
            addCriterion("mortgagetype is null");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeIsNotNull() {
            addCriterion("mortgagetype is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeEqualTo(String value) {
            addCriterion("mortgagetype =", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotEqualTo(String value) {
            addCriterion("mortgagetype <>", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeGreaterThan(String value) {
            addCriterion("mortgagetype >", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagetype >=", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeLessThan(String value) {
            addCriterion("mortgagetype <", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeLessThanOrEqualTo(String value) {
            addCriterion("mortgagetype <=", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeLike(String value) {
            addCriterion("mortgagetype like", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotLike(String value) {
            addCriterion("mortgagetype not like", value, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeIn(List<String> values) {
            addCriterion("mortgagetype in", values, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotIn(List<String> values) {
            addCriterion("mortgagetype not in", values, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeBetween(String value1, String value2) {
            addCriterion("mortgagetype between", value1, value2, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andMortgagetypeNotBetween(String value1, String value2) {
            addCriterion("mortgagetype not between", value1, value2, "mortgagetype");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgIsNull() {
            addCriterion("takeeffectflg is null");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgIsNotNull() {
            addCriterion("takeeffectflg is not null");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgEqualTo(String value) {
            addCriterion("takeeffectflg =", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgNotEqualTo(String value) {
            addCriterion("takeeffectflg <>", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgGreaterThan(String value) {
            addCriterion("takeeffectflg >", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgGreaterThanOrEqualTo(String value) {
            addCriterion("takeeffectflg >=", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgLessThan(String value) {
            addCriterion("takeeffectflg <", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgLessThanOrEqualTo(String value) {
            addCriterion("takeeffectflg <=", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgLike(String value) {
            addCriterion("takeeffectflg like", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgNotLike(String value) {
            addCriterion("takeeffectflg not like", value, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgIn(List<String> values) {
            addCriterion("takeeffectflg in", values, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgNotIn(List<String> values) {
            addCriterion("takeeffectflg not in", values, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgBetween(String value1, String value2) {
            addCriterion("takeeffectflg between", value1, value2, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andTakeeffectflgNotBetween(String value1, String value2) {
            addCriterion("takeeffectflg not between", value1, value2, "takeeffectflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgIsNull() {
            addCriterion("permitchandueflg is null");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgIsNotNull() {
            addCriterion("permitchandueflg is not null");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgEqualTo(String value) {
            addCriterion("permitchandueflg =", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgNotEqualTo(String value) {
            addCriterion("permitchandueflg <>", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgGreaterThan(String value) {
            addCriterion("permitchandueflg >", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgGreaterThanOrEqualTo(String value) {
            addCriterion("permitchandueflg >=", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgLessThan(String value) {
            addCriterion("permitchandueflg <", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgLessThanOrEqualTo(String value) {
            addCriterion("permitchandueflg <=", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgLike(String value) {
            addCriterion("permitchandueflg like", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgNotLike(String value) {
            addCriterion("permitchandueflg not like", value, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgIn(List<String> values) {
            addCriterion("permitchandueflg in", values, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgNotIn(List<String> values) {
            addCriterion("permitchandueflg not in", values, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgBetween(String value1, String value2) {
            addCriterion("permitchandueflg between", value1, value2, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitchandueflgNotBetween(String value1, String value2) {
            addCriterion("permitchandueflg not between", value1, value2, "permitchandueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgIsNull() {
            addCriterion("permitfunddueflg is null");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgIsNotNull() {
            addCriterion("permitfunddueflg is not null");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgEqualTo(String value) {
            addCriterion("permitfunddueflg =", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgNotEqualTo(String value) {
            addCriterion("permitfunddueflg <>", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgGreaterThan(String value) {
            addCriterion("permitfunddueflg >", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgGreaterThanOrEqualTo(String value) {
            addCriterion("permitfunddueflg >=", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgLessThan(String value) {
            addCriterion("permitfunddueflg <", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgLessThanOrEqualTo(String value) {
            addCriterion("permitfunddueflg <=", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgLike(String value) {
            addCriterion("permitfunddueflg like", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgNotLike(String value) {
            addCriterion("permitfunddueflg not like", value, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgIn(List<String> values) {
            addCriterion("permitfunddueflg in", values, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgNotIn(List<String> values) {
            addCriterion("permitfunddueflg not in", values, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgBetween(String value1, String value2) {
            addCriterion("permitfunddueflg between", value1, value2, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitfunddueflgNotBetween(String value1, String value2) {
            addCriterion("permitfunddueflg not between", value1, value2, "permitfunddueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgIsNull() {
            addCriterion("permitplaformdueflg is null");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgIsNotNull() {
            addCriterion("permitplaformdueflg is not null");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgEqualTo(String value) {
            addCriterion("permitplaformdueflg =", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgNotEqualTo(String value) {
            addCriterion("permitplaformdueflg <>", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgGreaterThan(String value) {
            addCriterion("permitplaformdueflg >", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgGreaterThanOrEqualTo(String value) {
            addCriterion("permitplaformdueflg >=", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgLessThan(String value) {
            addCriterion("permitplaformdueflg <", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgLessThanOrEqualTo(String value) {
            addCriterion("permitplaformdueflg <=", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgLike(String value) {
            addCriterion("permitplaformdueflg like", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgNotLike(String value) {
            addCriterion("permitplaformdueflg not like", value, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgIn(List<String> values) {
            addCriterion("permitplaformdueflg in", values, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgNotIn(List<String> values) {
            addCriterion("permitplaformdueflg not in", values, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgBetween(String value1, String value2) {
            addCriterion("permitplaformdueflg between", value1, value2, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformdueflgNotBetween(String value1, String value2) {
            addCriterion("permitplaformdueflg not between", value1, value2, "permitplaformdueflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgIsNull() {
            addCriterion("duesystemflg is null");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgIsNotNull() {
            addCriterion("duesystemflg is not null");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgEqualTo(String value) {
            addCriterion("duesystemflg =", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgNotEqualTo(String value) {
            addCriterion("duesystemflg <>", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgGreaterThan(String value) {
            addCriterion("duesystemflg >", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgGreaterThanOrEqualTo(String value) {
            addCriterion("duesystemflg >=", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgLessThan(String value) {
            addCriterion("duesystemflg <", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgLessThanOrEqualTo(String value) {
            addCriterion("duesystemflg <=", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgLike(String value) {
            addCriterion("duesystemflg like", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgNotLike(String value) {
            addCriterion("duesystemflg not like", value, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgIn(List<String> values) {
            addCriterion("duesystemflg in", values, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgNotIn(List<String> values) {
            addCriterion("duesystemflg not in", values, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgBetween(String value1, String value2) {
            addCriterion("duesystemflg between", value1, value2, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andDuesystemflgNotBetween(String value1, String value2) {
            addCriterion("duesystemflg not between", value1, value2, "duesystemflg");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelIsNull() {
            addCriterion("issysriskapprovel is null");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelIsNotNull() {
            addCriterion("issysriskapprovel is not null");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelEqualTo(String value) {
            addCriterion("issysriskapprovel =", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelNotEqualTo(String value) {
            addCriterion("issysriskapprovel <>", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelGreaterThan(String value) {
            addCriterion("issysriskapprovel >", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelGreaterThanOrEqualTo(String value) {
            addCriterion("issysriskapprovel >=", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelLessThan(String value) {
            addCriterion("issysriskapprovel <", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelLessThanOrEqualTo(String value) {
            addCriterion("issysriskapprovel <=", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelLike(String value) {
            addCriterion("issysriskapprovel like", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelNotLike(String value) {
            addCriterion("issysriskapprovel not like", value, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelIn(List<String> values) {
            addCriterion("issysriskapprovel in", values, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelNotIn(List<String> values) {
            addCriterion("issysriskapprovel not in", values, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelBetween(String value1, String value2) {
            addCriterion("issysriskapprovel between", value1, value2, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysriskapprovelNotBetween(String value1, String value2) {
            addCriterion("issysriskapprovel not between", value1, value2, "issysriskapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelIsNull() {
            addCriterion("issysgrantapprovel is null");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelIsNotNull() {
            addCriterion("issysgrantapprovel is not null");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelEqualTo(String value) {
            addCriterion("issysgrantapprovel =", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelNotEqualTo(String value) {
            addCriterion("issysgrantapprovel <>", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelGreaterThan(String value) {
            addCriterion("issysgrantapprovel >", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelGreaterThanOrEqualTo(String value) {
            addCriterion("issysgrantapprovel >=", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelLessThan(String value) {
            addCriterion("issysgrantapprovel <", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelLessThanOrEqualTo(String value) {
            addCriterion("issysgrantapprovel <=", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelLike(String value) {
            addCriterion("issysgrantapprovel like", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelNotLike(String value) {
            addCriterion("issysgrantapprovel not like", value, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelIn(List<String> values) {
            addCriterion("issysgrantapprovel in", values, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelNotIn(List<String> values) {
            addCriterion("issysgrantapprovel not in", values, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelBetween(String value1, String value2) {
            addCriterion("issysgrantapprovel between", value1, value2, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andIssysgrantapprovelNotBetween(String value1, String value2) {
            addCriterion("issysgrantapprovel not between", value1, value2, "issysgrantapprovel");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgIsNull() {
            addCriterion("permitplaformmortflg is null");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgIsNotNull() {
            addCriterion("permitplaformmortflg is not null");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgEqualTo(String value) {
            addCriterion("permitplaformmortflg =", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgNotEqualTo(String value) {
            addCriterion("permitplaformmortflg <>", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgGreaterThan(String value) {
            addCriterion("permitplaformmortflg >", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgGreaterThanOrEqualTo(String value) {
            addCriterion("permitplaformmortflg >=", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgLessThan(String value) {
            addCriterion("permitplaformmortflg <", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgLessThanOrEqualTo(String value) {
            addCriterion("permitplaformmortflg <=", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgLike(String value) {
            addCriterion("permitplaformmortflg like", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgNotLike(String value) {
            addCriterion("permitplaformmortflg not like", value, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgIn(List<String> values) {
            addCriterion("permitplaformmortflg in", values, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgNotIn(List<String> values) {
            addCriterion("permitplaformmortflg not in", values, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgBetween(String value1, String value2) {
            addCriterion("permitplaformmortflg between", value1, value2, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitplaformmortflgNotBetween(String value1, String value2) {
            addCriterion("permitplaformmortflg not between", value1, value2, "permitplaformmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgIsNull() {
            addCriterion("permitchanmortflg is null");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgIsNotNull() {
            addCriterion("permitchanmortflg is not null");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgEqualTo(String value) {
            addCriterion("permitchanmortflg =", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgNotEqualTo(String value) {
            addCriterion("permitchanmortflg <>", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgGreaterThan(String value) {
            addCriterion("permitchanmortflg >", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgGreaterThanOrEqualTo(String value) {
            addCriterion("permitchanmortflg >=", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgLessThan(String value) {
            addCriterion("permitchanmortflg <", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgLessThanOrEqualTo(String value) {
            addCriterion("permitchanmortflg <=", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgLike(String value) {
            addCriterion("permitchanmortflg like", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgNotLike(String value) {
            addCriterion("permitchanmortflg not like", value, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgIn(List<String> values) {
            addCriterion("permitchanmortflg in", values, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgNotIn(List<String> values) {
            addCriterion("permitchanmortflg not in", values, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgBetween(String value1, String value2) {
            addCriterion("permitchanmortflg between", value1, value2, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitchanmortflgNotBetween(String value1, String value2) {
            addCriterion("permitchanmortflg not between", value1, value2, "permitchanmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgIsNull() {
            addCriterion("permitfundmortflg is null");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgIsNotNull() {
            addCriterion("permitfundmortflg is not null");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgEqualTo(String value) {
            addCriterion("permitfundmortflg =", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgNotEqualTo(String value) {
            addCriterion("permitfundmortflg <>", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgGreaterThan(String value) {
            addCriterion("permitfundmortflg >", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgGreaterThanOrEqualTo(String value) {
            addCriterion("permitfundmortflg >=", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgLessThan(String value) {
            addCriterion("permitfundmortflg <", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgLessThanOrEqualTo(String value) {
            addCriterion("permitfundmortflg <=", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgLike(String value) {
            addCriterion("permitfundmortflg like", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgNotLike(String value) {
            addCriterion("permitfundmortflg not like", value, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgIn(List<String> values) {
            addCriterion("permitfundmortflg in", values, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgNotIn(List<String> values) {
            addCriterion("permitfundmortflg not in", values, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgBetween(String value1, String value2) {
            addCriterion("permitfundmortflg between", value1, value2, "permitfundmortflg");
            return (Criteria) this;
        }

        public Criteria andPermitfundmortflgNotBetween(String value1, String value2) {
            addCriterion("permitfundmortflg not between", value1, value2, "permitfundmortflg");
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

        public Criteria andCheckfrequencyIsNull() {
            addCriterion("checkfrequency is null");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyIsNotNull() {
            addCriterion("checkfrequency is not null");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyEqualTo(String value) {
            addCriterion("checkfrequency =", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotEqualTo(String value) {
            addCriterion("checkfrequency <>", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyGreaterThan(String value) {
            addCriterion("checkfrequency >", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("checkfrequency >=", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyLessThan(String value) {
            addCriterion("checkfrequency <", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyLessThanOrEqualTo(String value) {
            addCriterion("checkfrequency <=", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyLike(String value) {
            addCriterion("checkfrequency like", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotLike(String value) {
            addCriterion("checkfrequency not like", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyIn(List<String> values) {
            addCriterion("checkfrequency in", values, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotIn(List<String> values) {
            addCriterion("checkfrequency not in", values, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyBetween(String value1, String value2) {
            addCriterion("checkfrequency between", value1, value2, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotBetween(String value1, String value2) {
            addCriterion("checkfrequency not between", value1, value2, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgIsNull() {
            addCriterion("companydiligenceflg is null");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgIsNotNull() {
            addCriterion("companydiligenceflg is not null");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgEqualTo(String value) {
            addCriterion("companydiligenceflg =", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgNotEqualTo(String value) {
            addCriterion("companydiligenceflg <>", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgGreaterThan(String value) {
            addCriterion("companydiligenceflg >", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgGreaterThanOrEqualTo(String value) {
            addCriterion("companydiligenceflg >=", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgLessThan(String value) {
            addCriterion("companydiligenceflg <", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgLessThanOrEqualTo(String value) {
            addCriterion("companydiligenceflg <=", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgLike(String value) {
            addCriterion("companydiligenceflg like", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgNotLike(String value) {
            addCriterion("companydiligenceflg not like", value, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgIn(List<String> values) {
            addCriterion("companydiligenceflg in", values, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgNotIn(List<String> values) {
            addCriterion("companydiligenceflg not in", values, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgBetween(String value1, String value2) {
            addCriterion("companydiligenceflg between", value1, value2, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andCompanydiligenceflgNotBetween(String value1, String value2) {
            addCriterion("companydiligenceflg not between", value1, value2, "companydiligenceflg");
            return (Criteria) this;
        }

        public Criteria andRepaymethodIsNull() {
            addCriterion("repaymethod is null");
            return (Criteria) this;
        }

        public Criteria andRepaymethodIsNotNull() {
            addCriterion("repaymethod is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymethodEqualTo(String value) {
            addCriterion("repaymethod =", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotEqualTo(String value) {
            addCriterion("repaymethod <>", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodGreaterThan(String value) {
            addCriterion("repaymethod >", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodGreaterThanOrEqualTo(String value) {
            addCriterion("repaymethod >=", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodLessThan(String value) {
            addCriterion("repaymethod <", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodLessThanOrEqualTo(String value) {
            addCriterion("repaymethod <=", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodLike(String value) {
            addCriterion("repaymethod like", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotLike(String value) {
            addCriterion("repaymethod not like", value, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodIn(List<String> values) {
            addCriterion("repaymethod in", values, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotIn(List<String> values) {
            addCriterion("repaymethod not in", values, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodBetween(String value1, String value2) {
            addCriterion("repaymethod between", value1, value2, "repaymethod");
            return (Criteria) this;
        }

        public Criteria andRepaymethodNotBetween(String value1, String value2) {
            addCriterion("repaymethod not between", value1, value2, "repaymethod");
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