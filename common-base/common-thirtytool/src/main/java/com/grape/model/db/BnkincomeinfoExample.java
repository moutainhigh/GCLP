package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BnkincomeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BnkincomeinfoExample() {
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

        public Criteria andAmountsourceIsNull() {
            addCriterion("amountsource is null");
            return (Criteria) this;
        }

        public Criteria andAmountsourceIsNotNull() {
            addCriterion("amountsource is not null");
            return (Criteria) this;
        }

        public Criteria andAmountsourceEqualTo(String value) {
            addCriterion("amountsource =", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceNotEqualTo(String value) {
            addCriterion("amountsource <>", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceGreaterThan(String value) {
            addCriterion("amountsource >", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceGreaterThanOrEqualTo(String value) {
            addCriterion("amountsource >=", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceLessThan(String value) {
            addCriterion("amountsource <", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceLessThanOrEqualTo(String value) {
            addCriterion("amountsource <=", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceLike(String value) {
            addCriterion("amountsource like", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceNotLike(String value) {
            addCriterion("amountsource not like", value, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceIn(List<String> values) {
            addCriterion("amountsource in", values, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceNotIn(List<String> values) {
            addCriterion("amountsource not in", values, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceBetween(String value1, String value2) {
            addCriterion("amountsource between", value1, value2, "amountsource");
            return (Criteria) this;
        }

        public Criteria andAmountsourceNotBetween(String value1, String value2) {
            addCriterion("amountsource not between", value1, value2, "amountsource");
            return (Criteria) this;
        }

        public Criteria andIncomewayIsNull() {
            addCriterion("incomeway is null");
            return (Criteria) this;
        }

        public Criteria andIncomewayIsNotNull() {
            addCriterion("incomeway is not null");
            return (Criteria) this;
        }

        public Criteria andIncomewayEqualTo(String value) {
            addCriterion("incomeway =", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayNotEqualTo(String value) {
            addCriterion("incomeway <>", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayGreaterThan(String value) {
            addCriterion("incomeway >", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayGreaterThanOrEqualTo(String value) {
            addCriterion("incomeway >=", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayLessThan(String value) {
            addCriterion("incomeway <", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayLessThanOrEqualTo(String value) {
            addCriterion("incomeway <=", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayLike(String value) {
            addCriterion("incomeway like", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayNotLike(String value) {
            addCriterion("incomeway not like", value, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayIn(List<String> values) {
            addCriterion("incomeway in", values, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayNotIn(List<String> values) {
            addCriterion("incomeway not in", values, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayBetween(String value1, String value2) {
            addCriterion("incomeway between", value1, value2, "incomeway");
            return (Criteria) this;
        }

        public Criteria andIncomewayNotBetween(String value1, String value2) {
            addCriterion("incomeway not between", value1, value2, "incomeway");
            return (Criteria) this;
        }

        public Criteria andBnknameIsNull() {
            addCriterion("bnkname is null");
            return (Criteria) this;
        }

        public Criteria andBnknameIsNotNull() {
            addCriterion("bnkname is not null");
            return (Criteria) this;
        }

        public Criteria andBnknameEqualTo(String value) {
            addCriterion("bnkname =", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameNotEqualTo(String value) {
            addCriterion("bnkname <>", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameGreaterThan(String value) {
            addCriterion("bnkname >", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameGreaterThanOrEqualTo(String value) {
            addCriterion("bnkname >=", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameLessThan(String value) {
            addCriterion("bnkname <", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameLessThanOrEqualTo(String value) {
            addCriterion("bnkname <=", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameLike(String value) {
            addCriterion("bnkname like", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameNotLike(String value) {
            addCriterion("bnkname not like", value, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameIn(List<String> values) {
            addCriterion("bnkname in", values, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameNotIn(List<String> values) {
            addCriterion("bnkname not in", values, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameBetween(String value1, String value2) {
            addCriterion("bnkname between", value1, value2, "bnkname");
            return (Criteria) this;
        }

        public Criteria andBnknameNotBetween(String value1, String value2) {
            addCriterion("bnkname not between", value1, value2, "bnkname");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountIsNull() {
            addCriterion("bnkaccount is null");
            return (Criteria) this;
        }

        public Criteria andBnkaccountIsNotNull() {
            addCriterion("bnkaccount is not null");
            return (Criteria) this;
        }

        public Criteria andBnkaccountEqualTo(String value) {
            addCriterion("bnkaccount =", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountNotEqualTo(String value) {
            addCriterion("bnkaccount <>", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountGreaterThan(String value) {
            addCriterion("bnkaccount >", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountGreaterThanOrEqualTo(String value) {
            addCriterion("bnkaccount >=", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountLessThan(String value) {
            addCriterion("bnkaccount <", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountLessThanOrEqualTo(String value) {
            addCriterion("bnkaccount <=", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountLike(String value) {
            addCriterion("bnkaccount like", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountNotLike(String value) {
            addCriterion("bnkaccount not like", value, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountIn(List<String> values) {
            addCriterion("bnkaccount in", values, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountNotIn(List<String> values) {
            addCriterion("bnkaccount not in", values, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountBetween(String value1, String value2) {
            addCriterion("bnkaccount between", value1, value2, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andBnkaccountNotBetween(String value1, String value2) {
            addCriterion("bnkaccount not between", value1, value2, "bnkaccount");
            return (Criteria) this;
        }

        public Criteria andIncomedateIsNull() {
            addCriterion("incomedate is null");
            return (Criteria) this;
        }

        public Criteria andIncomedateIsNotNull() {
            addCriterion("incomedate is not null");
            return (Criteria) this;
        }

        public Criteria andIncomedateEqualTo(Date value) {
            addCriterion("incomedate =", value, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateNotEqualTo(Date value) {
            addCriterion("incomedate <>", value, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateGreaterThan(Date value) {
            addCriterion("incomedate >", value, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateGreaterThanOrEqualTo(Date value) {
            addCriterion("incomedate >=", value, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateLessThan(Date value) {
            addCriterion("incomedate <", value, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateLessThanOrEqualTo(Date value) {
            addCriterion("incomedate <=", value, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateIn(List<Date> values) {
            addCriterion("incomedate in", values, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateNotIn(List<Date> values) {
            addCriterion("incomedate not in", values, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateBetween(Date value1, Date value2) {
            addCriterion("incomedate between", value1, value2, "incomedate");
            return (Criteria) this;
        }

        public Criteria andIncomedateNotBetween(Date value1, Date value2) {
            addCriterion("incomedate not between", value1, value2, "incomedate");
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

        public Criteria andBanname2IsNull() {
            addCriterion("banname2 is null");
            return (Criteria) this;
        }

        public Criteria andBanname2IsNotNull() {
            addCriterion("banname2 is not null");
            return (Criteria) this;
        }

        public Criteria andBanname2EqualTo(String value) {
            addCriterion("banname2 =", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2NotEqualTo(String value) {
            addCriterion("banname2 <>", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2GreaterThan(String value) {
            addCriterion("banname2 >", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2GreaterThanOrEqualTo(String value) {
            addCriterion("banname2 >=", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2LessThan(String value) {
            addCriterion("banname2 <", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2LessThanOrEqualTo(String value) {
            addCriterion("banname2 <=", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2Like(String value) {
            addCriterion("banname2 like", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2NotLike(String value) {
            addCriterion("banname2 not like", value, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2In(List<String> values) {
            addCriterion("banname2 in", values, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2NotIn(List<String> values) {
            addCriterion("banname2 not in", values, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2Between(String value1, String value2) {
            addCriterion("banname2 between", value1, value2, "banname2");
            return (Criteria) this;
        }

        public Criteria andBanname2NotBetween(String value1, String value2) {
            addCriterion("banname2 not between", value1, value2, "banname2");
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