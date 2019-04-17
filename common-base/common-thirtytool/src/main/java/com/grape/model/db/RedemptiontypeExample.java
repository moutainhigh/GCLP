package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RedemptiontypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedemptiontypeExample() {
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

        public Criteria andBeloanbankIsNull() {
            addCriterion("beloanbank is null");
            return (Criteria) this;
        }

        public Criteria andBeloanbankIsNotNull() {
            addCriterion("beloanbank is not null");
            return (Criteria) this;
        }

        public Criteria andBeloanbankEqualTo(String value) {
            addCriterion("beloanbank =", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankNotEqualTo(String value) {
            addCriterion("beloanbank <>", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankGreaterThan(String value) {
            addCriterion("beloanbank >", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankGreaterThanOrEqualTo(String value) {
            addCriterion("beloanbank >=", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankLessThan(String value) {
            addCriterion("beloanbank <", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankLessThanOrEqualTo(String value) {
            addCriterion("beloanbank <=", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankLike(String value) {
            addCriterion("beloanbank like", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankNotLike(String value) {
            addCriterion("beloanbank not like", value, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankIn(List<String> values) {
            addCriterion("beloanbank in", values, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankNotIn(List<String> values) {
            addCriterion("beloanbank not in", values, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankBetween(String value1, String value2) {
            addCriterion("beloanbank between", value1, value2, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andBeloanbankNotBetween(String value1, String value2) {
            addCriterion("beloanbank not between", value1, value2, "beloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankIsNull() {
            addCriterion("newloanbank is null");
            return (Criteria) this;
        }

        public Criteria andNewloanbankIsNotNull() {
            addCriterion("newloanbank is not null");
            return (Criteria) this;
        }

        public Criteria andNewloanbankEqualTo(String value) {
            addCriterion("newloanbank =", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankNotEqualTo(String value) {
            addCriterion("newloanbank <>", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankGreaterThan(String value) {
            addCriterion("newloanbank >", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankGreaterThanOrEqualTo(String value) {
            addCriterion("newloanbank >=", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankLessThan(String value) {
            addCriterion("newloanbank <", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankLessThanOrEqualTo(String value) {
            addCriterion("newloanbank <=", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankLike(String value) {
            addCriterion("newloanbank like", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankNotLike(String value) {
            addCriterion("newloanbank not like", value, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankIn(List<String> values) {
            addCriterion("newloanbank in", values, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankNotIn(List<String> values) {
            addCriterion("newloanbank not in", values, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankBetween(String value1, String value2) {
            addCriterion("newloanbank between", value1, value2, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andNewloanbankNotBetween(String value1, String value2) {
            addCriterion("newloanbank not between", value1, value2, "newloanbank");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNull() {
            addCriterion("applyamount is null");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNotNull() {
            addCriterion("applyamount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyamountEqualTo(BigDecimal value) {
            addCriterion("applyamount =", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotEqualTo(BigDecimal value) {
            addCriterion("applyamount <>", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThan(BigDecimal value) {
            addCriterion("applyamount >", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("applyamount >=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThan(BigDecimal value) {
            addCriterion("applyamount <", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("applyamount <=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountIn(List<BigDecimal> values) {
            addCriterion("applyamount in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotIn(List<BigDecimal> values) {
            addCriterion("applyamount not in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applyamount between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("applyamount not between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountIsNull() {
            addCriterion("osumofamount is null");
            return (Criteria) this;
        }

        public Criteria andOsumofamountIsNotNull() {
            addCriterion("osumofamount is not null");
            return (Criteria) this;
        }

        public Criteria andOsumofamountEqualTo(BigDecimal value) {
            addCriterion("osumofamount =", value, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountNotEqualTo(BigDecimal value) {
            addCriterion("osumofamount <>", value, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountGreaterThan(BigDecimal value) {
            addCriterion("osumofamount >", value, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("osumofamount >=", value, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountLessThan(BigDecimal value) {
            addCriterion("osumofamount <", value, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("osumofamount <=", value, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountIn(List<BigDecimal> values) {
            addCriterion("osumofamount in", values, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountNotIn(List<BigDecimal> values) {
            addCriterion("osumofamount not in", values, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("osumofamount between", value1, value2, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andOsumofamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("osumofamount not between", value1, value2, "osumofamount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameIsNull() {
            addCriterion("redemaccountname is null");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameIsNotNull() {
            addCriterion("redemaccountname is not null");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameEqualTo(String value) {
            addCriterion("redemaccountname =", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameNotEqualTo(String value) {
            addCriterion("redemaccountname <>", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameGreaterThan(String value) {
            addCriterion("redemaccountname >", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("redemaccountname >=", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameLessThan(String value) {
            addCriterion("redemaccountname <", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameLessThanOrEqualTo(String value) {
            addCriterion("redemaccountname <=", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameLike(String value) {
            addCriterion("redemaccountname like", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameNotLike(String value) {
            addCriterion("redemaccountname not like", value, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameIn(List<String> values) {
            addCriterion("redemaccountname in", values, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameNotIn(List<String> values) {
            addCriterion("redemaccountname not in", values, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameBetween(String value1, String value2) {
            addCriterion("redemaccountname between", value1, value2, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountnameNotBetween(String value1, String value2) {
            addCriterion("redemaccountname not between", value1, value2, "redemaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameIsNull() {
            addCriterion("orepayaccountname is null");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameIsNotNull() {
            addCriterion("orepayaccountname is not null");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameEqualTo(String value) {
            addCriterion("orepayaccountname =", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameNotEqualTo(String value) {
            addCriterion("orepayaccountname <>", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameGreaterThan(String value) {
            addCriterion("orepayaccountname >", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("orepayaccountname >=", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameLessThan(String value) {
            addCriterion("orepayaccountname <", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameLessThanOrEqualTo(String value) {
            addCriterion("orepayaccountname <=", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameLike(String value) {
            addCriterion("orepayaccountname like", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameNotLike(String value) {
            addCriterion("orepayaccountname not like", value, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameIn(List<String> values) {
            addCriterion("orepayaccountname in", values, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameNotIn(List<String> values) {
            addCriterion("orepayaccountname not in", values, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameBetween(String value1, String value2) {
            addCriterion("orepayaccountname between", value1, value2, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountnameNotBetween(String value1, String value2) {
            addCriterion("orepayaccountname not between", value1, value2, "orepayaccountname");
            return (Criteria) this;
        }

        public Criteria andRedemaccountIsNull() {
            addCriterion("redemaccount is null");
            return (Criteria) this;
        }

        public Criteria andRedemaccountIsNotNull() {
            addCriterion("redemaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRedemaccountEqualTo(String value) {
            addCriterion("redemaccount =", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountNotEqualTo(String value) {
            addCriterion("redemaccount <>", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountGreaterThan(String value) {
            addCriterion("redemaccount >", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountGreaterThanOrEqualTo(String value) {
            addCriterion("redemaccount >=", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountLessThan(String value) {
            addCriterion("redemaccount <", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountLessThanOrEqualTo(String value) {
            addCriterion("redemaccount <=", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountLike(String value) {
            addCriterion("redemaccount like", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountNotLike(String value) {
            addCriterion("redemaccount not like", value, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountIn(List<String> values) {
            addCriterion("redemaccount in", values, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountNotIn(List<String> values) {
            addCriterion("redemaccount not in", values, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountBetween(String value1, String value2) {
            addCriterion("redemaccount between", value1, value2, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andRedemaccountNotBetween(String value1, String value2) {
            addCriterion("redemaccount not between", value1, value2, "redemaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountIsNull() {
            addCriterion("orepayaccount is null");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountIsNotNull() {
            addCriterion("orepayaccount is not null");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountEqualTo(String value) {
            addCriterion("orepayaccount =", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountNotEqualTo(String value) {
            addCriterion("orepayaccount <>", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountGreaterThan(String value) {
            addCriterion("orepayaccount >", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountGreaterThanOrEqualTo(String value) {
            addCriterion("orepayaccount >=", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountLessThan(String value) {
            addCriterion("orepayaccount <", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountLessThanOrEqualTo(String value) {
            addCriterion("orepayaccount <=", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountLike(String value) {
            addCriterion("orepayaccount like", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountNotLike(String value) {
            addCriterion("orepayaccount not like", value, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountIn(List<String> values) {
            addCriterion("orepayaccount in", values, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountNotIn(List<String> values) {
            addCriterion("orepayaccount not in", values, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountBetween(String value1, String value2) {
            addCriterion("orepayaccount between", value1, value2, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountNotBetween(String value1, String value2) {
            addCriterion("orepayaccount not between", value1, value2, "orepayaccount");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkIsNull() {
            addCriterion("orepayaccountbnk is null");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkIsNotNull() {
            addCriterion("orepayaccountbnk is not null");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkEqualTo(String value) {
            addCriterion("orepayaccountbnk =", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkNotEqualTo(String value) {
            addCriterion("orepayaccountbnk <>", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkGreaterThan(String value) {
            addCriterion("orepayaccountbnk >", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkGreaterThanOrEqualTo(String value) {
            addCriterion("orepayaccountbnk >=", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkLessThan(String value) {
            addCriterion("orepayaccountbnk <", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkLessThanOrEqualTo(String value) {
            addCriterion("orepayaccountbnk <=", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkLike(String value) {
            addCriterion("orepayaccountbnk like", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkNotLike(String value) {
            addCriterion("orepayaccountbnk not like", value, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkIn(List<String> values) {
            addCriterion("orepayaccountbnk in", values, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkNotIn(List<String> values) {
            addCriterion("orepayaccountbnk not in", values, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkBetween(String value1, String value2) {
            addCriterion("orepayaccountbnk between", value1, value2, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andOrepayaccountbnkNotBetween(String value1, String value2) {
            addCriterion("orepayaccountbnk not between", value1, value2, "orepayaccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkIsNull() {
            addCriterion("redemccountbnk is null");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkIsNotNull() {
            addCriterion("redemccountbnk is not null");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkEqualTo(String value) {
            addCriterion("redemccountbnk =", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkNotEqualTo(String value) {
            addCriterion("redemccountbnk <>", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkGreaterThan(String value) {
            addCriterion("redemccountbnk >", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkGreaterThanOrEqualTo(String value) {
            addCriterion("redemccountbnk >=", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkLessThan(String value) {
            addCriterion("redemccountbnk <", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkLessThanOrEqualTo(String value) {
            addCriterion("redemccountbnk <=", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkLike(String value) {
            addCriterion("redemccountbnk like", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkNotLike(String value) {
            addCriterion("redemccountbnk not like", value, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkIn(List<String> values) {
            addCriterion("redemccountbnk in", values, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkNotIn(List<String> values) {
            addCriterion("redemccountbnk not in", values, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkBetween(String value1, String value2) {
            addCriterion("redemccountbnk between", value1, value2, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andRedemccountbnkNotBetween(String value1, String value2) {
            addCriterion("redemccountbnk not between", value1, value2, "redemccountbnk");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayIsNull() {
            addCriterion("isthirdpartyrepay is null");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayIsNotNull() {
            addCriterion("isthirdpartyrepay is not null");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayEqualTo(String value) {
            addCriterion("isthirdpartyrepay =", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayNotEqualTo(String value) {
            addCriterion("isthirdpartyrepay <>", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayGreaterThan(String value) {
            addCriterion("isthirdpartyrepay >", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayGreaterThanOrEqualTo(String value) {
            addCriterion("isthirdpartyrepay >=", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayLessThan(String value) {
            addCriterion("isthirdpartyrepay <", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayLessThanOrEqualTo(String value) {
            addCriterion("isthirdpartyrepay <=", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayLike(String value) {
            addCriterion("isthirdpartyrepay like", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayNotLike(String value) {
            addCriterion("isthirdpartyrepay not like", value, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayIn(List<String> values) {
            addCriterion("isthirdpartyrepay in", values, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayNotIn(List<String> values) {
            addCriterion("isthirdpartyrepay not in", values, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayBetween(String value1, String value2) {
            addCriterion("isthirdpartyrepay between", value1, value2, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyrepayNotBetween(String value1, String value2) {
            addCriterion("isthirdpartyrepay not between", value1, value2, "isthirdpartyrepay");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemIsNull() {
            addCriterion("isthirdpartyredem is null");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemIsNotNull() {
            addCriterion("isthirdpartyredem is not null");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemEqualTo(String value) {
            addCriterion("isthirdpartyredem =", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemNotEqualTo(String value) {
            addCriterion("isthirdpartyredem <>", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemGreaterThan(String value) {
            addCriterion("isthirdpartyredem >", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemGreaterThanOrEqualTo(String value) {
            addCriterion("isthirdpartyredem >=", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemLessThan(String value) {
            addCriterion("isthirdpartyredem <", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemLessThanOrEqualTo(String value) {
            addCriterion("isthirdpartyredem <=", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemLike(String value) {
            addCriterion("isthirdpartyredem like", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemNotLike(String value) {
            addCriterion("isthirdpartyredem not like", value, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemIn(List<String> values) {
            addCriterion("isthirdpartyredem in", values, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemNotIn(List<String> values) {
            addCriterion("isthirdpartyredem not in", values, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemBetween(String value1, String value2) {
            addCriterion("isthirdpartyredem between", value1, value2, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyredemNotBetween(String value1, String value2) {
            addCriterion("isthirdpartyredem not between", value1, value2, "isthirdpartyredem");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionIsNull() {
            addCriterion("redemdescription is null");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionIsNotNull() {
            addCriterion("redemdescription is not null");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionEqualTo(String value) {
            addCriterion("redemdescription =", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionNotEqualTo(String value) {
            addCriterion("redemdescription <>", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionGreaterThan(String value) {
            addCriterion("redemdescription >", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("redemdescription >=", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionLessThan(String value) {
            addCriterion("redemdescription <", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionLessThanOrEqualTo(String value) {
            addCriterion("redemdescription <=", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionLike(String value) {
            addCriterion("redemdescription like", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionNotLike(String value) {
            addCriterion("redemdescription not like", value, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionIn(List<String> values) {
            addCriterion("redemdescription in", values, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionNotIn(List<String> values) {
            addCriterion("redemdescription not in", values, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionBetween(String value1, String value2) {
            addCriterion("redemdescription between", value1, value2, "redemdescription");
            return (Criteria) this;
        }

        public Criteria andRedemdescriptionNotBetween(String value1, String value2) {
            addCriterion("redemdescription not between", value1, value2, "redemdescription");
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