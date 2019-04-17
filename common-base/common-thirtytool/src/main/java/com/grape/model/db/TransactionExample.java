package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionExample() {
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

        public Criteria andAccountnoIsNull() {
            addCriterion("accountno is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("accountno is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("accountno =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("accountno <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("accountno >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("accountno >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("accountno <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("accountno <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("accountno like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("accountno not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("accountno in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("accountno not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("accountno between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("accountno not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andBalancetypeIsNull() {
            addCriterion("balancetype is null");
            return (Criteria) this;
        }

        public Criteria andBalancetypeIsNotNull() {
            addCriterion("balancetype is not null");
            return (Criteria) this;
        }

        public Criteria andBalancetypeEqualTo(String value) {
            addCriterion("balancetype =", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeNotEqualTo(String value) {
            addCriterion("balancetype <>", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeGreaterThan(String value) {
            addCriterion("balancetype >", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeGreaterThanOrEqualTo(String value) {
            addCriterion("balancetype >=", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeLessThan(String value) {
            addCriterion("balancetype <", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeLessThanOrEqualTo(String value) {
            addCriterion("balancetype <=", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeLike(String value) {
            addCriterion("balancetype like", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeNotLike(String value) {
            addCriterion("balancetype not like", value, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeIn(List<String> values) {
            addCriterion("balancetype in", values, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeNotIn(List<String> values) {
            addCriterion("balancetype not in", values, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeBetween(String value1, String value2) {
            addCriterion("balancetype between", value1, value2, "balancetype");
            return (Criteria) this;
        }

        public Criteria andBalancetypeNotBetween(String value1, String value2) {
            addCriterion("balancetype not between", value1, value2, "balancetype");
            return (Criteria) this;
        }

        public Criteria andTransnameIsNull() {
            addCriterion("transname is null");
            return (Criteria) this;
        }

        public Criteria andTransnameIsNotNull() {
            addCriterion("transname is not null");
            return (Criteria) this;
        }

        public Criteria andTransnameEqualTo(String value) {
            addCriterion("transname =", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotEqualTo(String value) {
            addCriterion("transname <>", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameGreaterThan(String value) {
            addCriterion("transname >", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameGreaterThanOrEqualTo(String value) {
            addCriterion("transname >=", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameLessThan(String value) {
            addCriterion("transname <", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameLessThanOrEqualTo(String value) {
            addCriterion("transname <=", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameLike(String value) {
            addCriterion("transname like", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotLike(String value) {
            addCriterion("transname not like", value, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameIn(List<String> values) {
            addCriterion("transname in", values, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotIn(List<String> values) {
            addCriterion("transname not in", values, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameBetween(String value1, String value2) {
            addCriterion("transname between", value1, value2, "transname");
            return (Criteria) this;
        }

        public Criteria andTransnameNotBetween(String value1, String value2) {
            addCriterion("transname not between", value1, value2, "transname");
            return (Criteria) this;
        }

        public Criteria andTransaccountIsNull() {
            addCriterion("transaccount is null");
            return (Criteria) this;
        }

        public Criteria andTransaccountIsNotNull() {
            addCriterion("transaccount is not null");
            return (Criteria) this;
        }

        public Criteria andTransaccountEqualTo(String value) {
            addCriterion("transaccount =", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountNotEqualTo(String value) {
            addCriterion("transaccount <>", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountGreaterThan(String value) {
            addCriterion("transaccount >", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountGreaterThanOrEqualTo(String value) {
            addCriterion("transaccount >=", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountLessThan(String value) {
            addCriterion("transaccount <", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountLessThanOrEqualTo(String value) {
            addCriterion("transaccount <=", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountLike(String value) {
            addCriterion("transaccount like", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountNotLike(String value) {
            addCriterion("transaccount not like", value, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountIn(List<String> values) {
            addCriterion("transaccount in", values, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountNotIn(List<String> values) {
            addCriterion("transaccount not in", values, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountBetween(String value1, String value2) {
            addCriterion("transaccount between", value1, value2, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTransaccountNotBetween(String value1, String value2) {
            addCriterion("transaccount not between", value1, value2, "transaccount");
            return (Criteria) this;
        }

        public Criteria andTranswayIsNull() {
            addCriterion("transway is null");
            return (Criteria) this;
        }

        public Criteria andTranswayIsNotNull() {
            addCriterion("transway is not null");
            return (Criteria) this;
        }

        public Criteria andTranswayEqualTo(String value) {
            addCriterion("transway =", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayNotEqualTo(String value) {
            addCriterion("transway <>", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayGreaterThan(String value) {
            addCriterion("transway >", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayGreaterThanOrEqualTo(String value) {
            addCriterion("transway >=", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayLessThan(String value) {
            addCriterion("transway <", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayLessThanOrEqualTo(String value) {
            addCriterion("transway <=", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayLike(String value) {
            addCriterion("transway like", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayNotLike(String value) {
            addCriterion("transway not like", value, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayIn(List<String> values) {
            addCriterion("transway in", values, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayNotIn(List<String> values) {
            addCriterion("transway not in", values, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayBetween(String value1, String value2) {
            addCriterion("transway between", value1, value2, "transway");
            return (Criteria) this;
        }

        public Criteria andTranswayNotBetween(String value1, String value2) {
            addCriterion("transway not between", value1, value2, "transway");
            return (Criteria) this;
        }

        public Criteria andTransamountIsNull() {
            addCriterion("transamount is null");
            return (Criteria) this;
        }

        public Criteria andTransamountIsNotNull() {
            addCriterion("transamount is not null");
            return (Criteria) this;
        }

        public Criteria andTransamountEqualTo(BigDecimal value) {
            addCriterion("transamount =", value, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountNotEqualTo(BigDecimal value) {
            addCriterion("transamount <>", value, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountGreaterThan(BigDecimal value) {
            addCriterion("transamount >", value, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transamount >=", value, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountLessThan(BigDecimal value) {
            addCriterion("transamount <", value, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transamount <=", value, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountIn(List<BigDecimal> values) {
            addCriterion("transamount in", values, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountNotIn(List<BigDecimal> values) {
            addCriterion("transamount not in", values, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transamount between", value1, value2, "transamount");
            return (Criteria) this;
        }

        public Criteria andTransamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transamount not between", value1, value2, "transamount");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("transtime is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("transtime is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(Date value) {
            addCriterion("transtime =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(Date value) {
            addCriterion("transtime <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(Date value) {
            addCriterion("transtime >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transtime >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(Date value) {
            addCriterion("transtime <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(Date value) {
            addCriterion("transtime <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<Date> values) {
            addCriterion("transtime in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<Date> values) {
            addCriterion("transtime not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(Date value1, Date value2) {
            addCriterion("transtime between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(Date value1, Date value2) {
            addCriterion("transtime not between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTradingnoteIsNull() {
            addCriterion("tradingnote is null");
            return (Criteria) this;
        }

        public Criteria andTradingnoteIsNotNull() {
            addCriterion("tradingnote is not null");
            return (Criteria) this;
        }

        public Criteria andTradingnoteEqualTo(String value) {
            addCriterion("tradingnote =", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteNotEqualTo(String value) {
            addCriterion("tradingnote <>", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteGreaterThan(String value) {
            addCriterion("tradingnote >", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteGreaterThanOrEqualTo(String value) {
            addCriterion("tradingnote >=", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteLessThan(String value) {
            addCriterion("tradingnote <", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteLessThanOrEqualTo(String value) {
            addCriterion("tradingnote <=", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteLike(String value) {
            addCriterion("tradingnote like", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteNotLike(String value) {
            addCriterion("tradingnote not like", value, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteIn(List<String> values) {
            addCriterion("tradingnote in", values, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteNotIn(List<String> values) {
            addCriterion("tradingnote not in", values, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteBetween(String value1, String value2) {
            addCriterion("tradingnote between", value1, value2, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andTradingnoteNotBetween(String value1, String value2) {
            addCriterion("tradingnote not between", value1, value2, "tradingnote");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNull() {
            addCriterion("accountamount is null");
            return (Criteria) this;
        }

        public Criteria andAccountamountIsNotNull() {
            addCriterion("accountamount is not null");
            return (Criteria) this;
        }

        public Criteria andAccountamountEqualTo(BigDecimal value) {
            addCriterion("accountamount =", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotEqualTo(BigDecimal value) {
            addCriterion("accountamount <>", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThan(BigDecimal value) {
            addCriterion("accountamount >", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accountamount >=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThan(BigDecimal value) {
            addCriterion("accountamount <", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accountamount <=", value, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountIn(List<BigDecimal> values) {
            addCriterion("accountamount in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotIn(List<BigDecimal> values) {
            addCriterion("accountamount not in", values, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountamount between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andAccountamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountamount not between", value1, value2, "accountamount");
            return (Criteria) this;
        }

        public Criteria andDealmanIsNull() {
            addCriterion("dealman is null");
            return (Criteria) this;
        }

        public Criteria andDealmanIsNotNull() {
            addCriterion("dealman is not null");
            return (Criteria) this;
        }

        public Criteria andDealmanEqualTo(String value) {
            addCriterion("dealman =", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanNotEqualTo(String value) {
            addCriterion("dealman <>", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanGreaterThan(String value) {
            addCriterion("dealman >", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanGreaterThanOrEqualTo(String value) {
            addCriterion("dealman >=", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanLessThan(String value) {
            addCriterion("dealman <", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanLessThanOrEqualTo(String value) {
            addCriterion("dealman <=", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanLike(String value) {
            addCriterion("dealman like", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanNotLike(String value) {
            addCriterion("dealman not like", value, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanIn(List<String> values) {
            addCriterion("dealman in", values, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanNotIn(List<String> values) {
            addCriterion("dealman not in", values, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanBetween(String value1, String value2) {
            addCriterion("dealman between", value1, value2, "dealman");
            return (Criteria) this;
        }

        public Criteria andDealmanNotBetween(String value1, String value2) {
            addCriterion("dealman not between", value1, value2, "dealman");
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