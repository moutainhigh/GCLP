package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundmentExample() {
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

        public Criteria andOtherreceIsNull() {
            addCriterion("otherrece is null");
            return (Criteria) this;
        }

        public Criteria andOtherreceIsNotNull() {
            addCriterion("otherrece is not null");
            return (Criteria) this;
        }

        public Criteria andOtherreceEqualTo(String value) {
            addCriterion("otherrece =", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceNotEqualTo(String value) {
            addCriterion("otherrece <>", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceGreaterThan(String value) {
            addCriterion("otherrece >", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceGreaterThanOrEqualTo(String value) {
            addCriterion("otherrece >=", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceLessThan(String value) {
            addCriterion("otherrece <", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceLessThanOrEqualTo(String value) {
            addCriterion("otherrece <=", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceLike(String value) {
            addCriterion("otherrece like", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceNotLike(String value) {
            addCriterion("otherrece not like", value, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceIn(List<String> values) {
            addCriterion("otherrece in", values, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceNotIn(List<String> values) {
            addCriterion("otherrece not in", values, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceBetween(String value1, String value2) {
            addCriterion("otherrece between", value1, value2, "otherrece");
            return (Criteria) this;
        }

        public Criteria andOtherreceNotBetween(String value1, String value2) {
            addCriterion("otherrece not between", value1, value2, "otherrece");
            return (Criteria) this;
        }

        public Criteria andReceivablesIsNull() {
            addCriterion("receivables is null");
            return (Criteria) this;
        }

        public Criteria andReceivablesIsNotNull() {
            addCriterion("receivables is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablesEqualTo(String value) {
            addCriterion("receivables =", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotEqualTo(String value) {
            addCriterion("receivables <>", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesGreaterThan(String value) {
            addCriterion("receivables >", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesGreaterThanOrEqualTo(String value) {
            addCriterion("receivables >=", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesLessThan(String value) {
            addCriterion("receivables <", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesLessThanOrEqualTo(String value) {
            addCriterion("receivables <=", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesLike(String value) {
            addCriterion("receivables like", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotLike(String value) {
            addCriterion("receivables not like", value, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesIn(List<String> values) {
            addCriterion("receivables in", values, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotIn(List<String> values) {
            addCriterion("receivables not in", values, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesBetween(String value1, String value2) {
            addCriterion("receivables between", value1, value2, "receivables");
            return (Criteria) this;
        }

        public Criteria andReceivablesNotBetween(String value1, String value2) {
            addCriterion("receivables not between", value1, value2, "receivables");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("paydate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("paydate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("paydate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("paydate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("paydate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("paydate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("paydate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("paydate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("paydate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("paydate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("paydate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("paydate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeIsNull() {
            addCriterion("otherrefundtype is null");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeIsNotNull() {
            addCriterion("otherrefundtype is not null");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeEqualTo(String value) {
            addCriterion("otherrefundtype =", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeNotEqualTo(String value) {
            addCriterion("otherrefundtype <>", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeGreaterThan(String value) {
            addCriterion("otherrefundtype >", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeGreaterThanOrEqualTo(String value) {
            addCriterion("otherrefundtype >=", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeLessThan(String value) {
            addCriterion("otherrefundtype <", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeLessThanOrEqualTo(String value) {
            addCriterion("otherrefundtype <=", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeLike(String value) {
            addCriterion("otherrefundtype like", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeNotLike(String value) {
            addCriterion("otherrefundtype not like", value, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeIn(List<String> values) {
            addCriterion("otherrefundtype in", values, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeNotIn(List<String> values) {
            addCriterion("otherrefundtype not in", values, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeBetween(String value1, String value2) {
            addCriterion("otherrefundtype between", value1, value2, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andOtherrefundtypeNotBetween(String value1, String value2) {
            addCriterion("otherrefundtype not between", value1, value2, "otherrefundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeIsNull() {
            addCriterion("refundtype is null");
            return (Criteria) this;
        }

        public Criteria andRefundtypeIsNotNull() {
            addCriterion("refundtype is not null");
            return (Criteria) this;
        }

        public Criteria andRefundtypeEqualTo(String value) {
            addCriterion("refundtype =", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeNotEqualTo(String value) {
            addCriterion("refundtype <>", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeGreaterThan(String value) {
            addCriterion("refundtype >", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeGreaterThanOrEqualTo(String value) {
            addCriterion("refundtype >=", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeLessThan(String value) {
            addCriterion("refundtype <", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeLessThanOrEqualTo(String value) {
            addCriterion("refundtype <=", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeLike(String value) {
            addCriterion("refundtype like", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeNotLike(String value) {
            addCriterion("refundtype not like", value, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeIn(List<String> values) {
            addCriterion("refundtype in", values, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeNotIn(List<String> values) {
            addCriterion("refundtype not in", values, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeBetween(String value1, String value2) {
            addCriterion("refundtype between", value1, value2, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRefundtypeNotBetween(String value1, String value2) {
            addCriterion("refundtype not between", value1, value2, "refundtype");
            return (Criteria) this;
        }

        public Criteria andRemoveamountIsNull() {
            addCriterion("removeamount is null");
            return (Criteria) this;
        }

        public Criteria andRemoveamountIsNotNull() {
            addCriterion("removeamount is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveamountEqualTo(BigDecimal value) {
            addCriterion("removeamount =", value, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountNotEqualTo(BigDecimal value) {
            addCriterion("removeamount <>", value, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountGreaterThan(BigDecimal value) {
            addCriterion("removeamount >", value, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("removeamount >=", value, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountLessThan(BigDecimal value) {
            addCriterion("removeamount <", value, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("removeamount <=", value, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountIn(List<BigDecimal> values) {
            addCriterion("removeamount in", values, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountNotIn(List<BigDecimal> values) {
            addCriterion("removeamount not in", values, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("removeamount between", value1, value2, "removeamount");
            return (Criteria) this;
        }

        public Criteria andRemoveamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("removeamount not between", value1, value2, "removeamount");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentIsNull() {
            addCriterion("interestrepayment is null");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentIsNotNull() {
            addCriterion("interestrepayment is not null");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentEqualTo(BigDecimal value) {
            addCriterion("interestrepayment =", value, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentNotEqualTo(BigDecimal value) {
            addCriterion("interestrepayment <>", value, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentGreaterThan(BigDecimal value) {
            addCriterion("interestrepayment >", value, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interestrepayment >=", value, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentLessThan(BigDecimal value) {
            addCriterion("interestrepayment <", value, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interestrepayment <=", value, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentIn(List<BigDecimal> values) {
            addCriterion("interestrepayment in", values, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentNotIn(List<BigDecimal> values) {
            addCriterion("interestrepayment not in", values, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestrepayment between", value1, value2, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andInterestrepaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestrepayment not between", value1, value2, "interestrepayment");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondIsNull() {
            addCriterion("channelsinglebond is null");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondIsNotNull() {
            addCriterion("channelsinglebond is not null");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond =", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondNotEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond <>", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondGreaterThan(BigDecimal value) {
            addCriterion("channelsinglebond >", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond >=", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondLessThan(BigDecimal value) {
            addCriterion("channelsinglebond <", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondLessThanOrEqualTo(BigDecimal value) {
            addCriterion("channelsinglebond <=", value, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondIn(List<BigDecimal> values) {
            addCriterion("channelsinglebond in", values, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondNotIn(List<BigDecimal> values) {
            addCriterion("channelsinglebond not in", values, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channelsinglebond between", value1, value2, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andChannelsinglebondNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("channelsinglebond not between", value1, value2, "channelsinglebond");
            return (Criteria) this;
        }

        public Criteria andOtheramountsIsNull() {
            addCriterion("otheramounts is null");
            return (Criteria) this;
        }

        public Criteria andOtheramountsIsNotNull() {
            addCriterion("otheramounts is not null");
            return (Criteria) this;
        }

        public Criteria andOtheramountsEqualTo(BigDecimal value) {
            addCriterion("otheramounts =", value, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsNotEqualTo(BigDecimal value) {
            addCriterion("otheramounts <>", value, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsGreaterThan(BigDecimal value) {
            addCriterion("otheramounts >", value, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("otheramounts >=", value, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsLessThan(BigDecimal value) {
            addCriterion("otheramounts <", value, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("otheramounts <=", value, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsIn(List<BigDecimal> values) {
            addCriterion("otheramounts in", values, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsNotIn(List<BigDecimal> values) {
            addCriterion("otheramounts not in", values, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("otheramounts between", value1, value2, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andOtheramountsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("otheramounts not between", value1, value2, "otheramounts");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNull() {
            addCriterion("cleardate is null");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNotNull() {
            addCriterion("cleardate is not null");
            return (Criteria) this;
        }

        public Criteria andCleardateEqualTo(Date value) {
            addCriterion("cleardate =", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotEqualTo(Date value) {
            addCriterion("cleardate <>", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThan(Date value) {
            addCriterion("cleardate >", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThanOrEqualTo(Date value) {
            addCriterion("cleardate >=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThan(Date value) {
            addCriterion("cleardate <", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThanOrEqualTo(Date value) {
            addCriterion("cleardate <=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateIn(List<Date> values) {
            addCriterion("cleardate in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotIn(List<Date> values) {
            addCriterion("cleardate not in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateBetween(Date value1, Date value2) {
            addCriterion("cleardate between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotBetween(Date value1, Date value2) {
            addCriterion("cleardate not between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestIsNull() {
            addCriterion("prepaidinterest is null");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestIsNotNull() {
            addCriterion("prepaidinterest is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestEqualTo(BigDecimal value) {
            addCriterion("prepaidinterest =", value, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestNotEqualTo(BigDecimal value) {
            addCriterion("prepaidinterest <>", value, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestGreaterThan(BigDecimal value) {
            addCriterion("prepaidinterest >", value, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepaidinterest >=", value, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestLessThan(BigDecimal value) {
            addCriterion("prepaidinterest <", value, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepaidinterest <=", value, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestIn(List<BigDecimal> values) {
            addCriterion("prepaidinterest in", values, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestNotIn(List<BigDecimal> values) {
            addCriterion("prepaidinterest not in", values, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepaidinterest between", value1, value2, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andPrepaidinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepaidinterest not between", value1, value2, "prepaidinterest");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateIsNull() {
            addCriterion("chanquotationrate is null");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateIsNotNull() {
            addCriterion("chanquotationrate is not null");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateEqualTo(BigDecimal value) {
            addCriterion("chanquotationrate =", value, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateNotEqualTo(BigDecimal value) {
            addCriterion("chanquotationrate <>", value, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateGreaterThan(BigDecimal value) {
            addCriterion("chanquotationrate >", value, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chanquotationrate >=", value, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateLessThan(BigDecimal value) {
            addCriterion("chanquotationrate <", value, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chanquotationrate <=", value, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateIn(List<BigDecimal> values) {
            addCriterion("chanquotationrate in", values, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateNotIn(List<BigDecimal> values) {
            addCriterion("chanquotationrate not in", values, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chanquotationrate between", value1, value2, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andChanquotationrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chanquotationrate not between", value1, value2, "chanquotationrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateIsNull() {
            addCriterion("comrealrate is null");
            return (Criteria) this;
        }

        public Criteria andComrealrateIsNotNull() {
            addCriterion("comrealrate is not null");
            return (Criteria) this;
        }

        public Criteria andComrealrateEqualTo(BigDecimal value) {
            addCriterion("comrealrate =", value, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateNotEqualTo(BigDecimal value) {
            addCriterion("comrealrate <>", value, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateGreaterThan(BigDecimal value) {
            addCriterion("comrealrate >", value, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("comrealrate >=", value, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateLessThan(BigDecimal value) {
            addCriterion("comrealrate <", value, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("comrealrate <=", value, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateIn(List<BigDecimal> values) {
            addCriterion("comrealrate in", values, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateNotIn(List<BigDecimal> values) {
            addCriterion("comrealrate not in", values, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comrealrate between", value1, value2, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andComrealrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comrealrate not between", value1, value2, "comrealrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateIsNull() {
            addCriterion("monthrate is null");
            return (Criteria) this;
        }

        public Criteria andMonthrateIsNotNull() {
            addCriterion("monthrate is not null");
            return (Criteria) this;
        }

        public Criteria andMonthrateEqualTo(BigDecimal value) {
            addCriterion("monthrate =", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateNotEqualTo(BigDecimal value) {
            addCriterion("monthrate <>", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateGreaterThan(BigDecimal value) {
            addCriterion("monthrate >", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthrate >=", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateLessThan(BigDecimal value) {
            addCriterion("monthrate <", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthrate <=", value, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateIn(List<BigDecimal> values) {
            addCriterion("monthrate in", values, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateNotIn(List<BigDecimal> values) {
            addCriterion("monthrate not in", values, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthrate between", value1, value2, "monthrate");
            return (Criteria) this;
        }

        public Criteria andMonthrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthrate not between", value1, value2, "monthrate");
            return (Criteria) this;
        }

        public Criteria andBorrowtermIsNull() {
            addCriterion("borrowterm is null");
            return (Criteria) this;
        }

        public Criteria andBorrowtermIsNotNull() {
            addCriterion("borrowterm is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowtermEqualTo(String value) {
            addCriterion("borrowterm =", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermNotEqualTo(String value) {
            addCriterion("borrowterm <>", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermGreaterThan(String value) {
            addCriterion("borrowterm >", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermGreaterThanOrEqualTo(String value) {
            addCriterion("borrowterm >=", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermLessThan(String value) {
            addCriterion("borrowterm <", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermLessThanOrEqualTo(String value) {
            addCriterion("borrowterm <=", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermLike(String value) {
            addCriterion("borrowterm like", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermNotLike(String value) {
            addCriterion("borrowterm not like", value, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermIn(List<String> values) {
            addCriterion("borrowterm in", values, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermNotIn(List<String> values) {
            addCriterion("borrowterm not in", values, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermBetween(String value1, String value2) {
            addCriterion("borrowterm between", value1, value2, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBorrowtermNotBetween(String value1, String value2) {
            addCriterion("borrowterm not between", value1, value2, "borrowterm");
            return (Criteria) this;
        }

        public Criteria andBackchanamountIsNull() {
            addCriterion("backchanamount is null");
            return (Criteria) this;
        }

        public Criteria andBackchanamountIsNotNull() {
            addCriterion("backchanamount is not null");
            return (Criteria) this;
        }

        public Criteria andBackchanamountEqualTo(BigDecimal value) {
            addCriterion("backchanamount =", value, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountNotEqualTo(BigDecimal value) {
            addCriterion("backchanamount <>", value, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountGreaterThan(BigDecimal value) {
            addCriterion("backchanamount >", value, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("backchanamount >=", value, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountLessThan(BigDecimal value) {
            addCriterion("backchanamount <", value, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("backchanamount <=", value, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountIn(List<BigDecimal> values) {
            addCriterion("backchanamount in", values, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountNotIn(List<BigDecimal> values) {
            addCriterion("backchanamount not in", values, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backchanamount between", value1, value2, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andBackchanamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backchanamount not between", value1, value2, "backchanamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountIsNull() {
            addCriterion("realbackamount is null");
            return (Criteria) this;
        }

        public Criteria andRealbackamountIsNotNull() {
            addCriterion("realbackamount is not null");
            return (Criteria) this;
        }

        public Criteria andRealbackamountEqualTo(BigDecimal value) {
            addCriterion("realbackamount =", value, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountNotEqualTo(BigDecimal value) {
            addCriterion("realbackamount <>", value, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountGreaterThan(BigDecimal value) {
            addCriterion("realbackamount >", value, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("realbackamount >=", value, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountLessThan(BigDecimal value) {
            addCriterion("realbackamount <", value, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("realbackamount <=", value, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountIn(List<BigDecimal> values) {
            addCriterion("realbackamount in", values, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountNotIn(List<BigDecimal> values) {
            addCriterion("realbackamount not in", values, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realbackamount between", value1, value2, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andRealbackamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("realbackamount not between", value1, value2, "realbackamount");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkIsNull() {
            addCriterion("backaccountbnk is null");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkIsNotNull() {
            addCriterion("backaccountbnk is not null");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkEqualTo(String value) {
            addCriterion("backaccountbnk =", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkNotEqualTo(String value) {
            addCriterion("backaccountbnk <>", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkGreaterThan(String value) {
            addCriterion("backaccountbnk >", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkGreaterThanOrEqualTo(String value) {
            addCriterion("backaccountbnk >=", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkLessThan(String value) {
            addCriterion("backaccountbnk <", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkLessThanOrEqualTo(String value) {
            addCriterion("backaccountbnk <=", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkLike(String value) {
            addCriterion("backaccountbnk like", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkNotLike(String value) {
            addCriterion("backaccountbnk not like", value, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkIn(List<String> values) {
            addCriterion("backaccountbnk in", values, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkNotIn(List<String> values) {
            addCriterion("backaccountbnk not in", values, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkBetween(String value1, String value2) {
            addCriterion("backaccountbnk between", value1, value2, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountbnkNotBetween(String value1, String value2) {
            addCriterion("backaccountbnk not between", value1, value2, "backaccountbnk");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameIsNull() {
            addCriterion("backaccountname is null");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameIsNotNull() {
            addCriterion("backaccountname is not null");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameEqualTo(String value) {
            addCriterion("backaccountname =", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameNotEqualTo(String value) {
            addCriterion("backaccountname <>", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameGreaterThan(String value) {
            addCriterion("backaccountname >", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("backaccountname >=", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameLessThan(String value) {
            addCriterion("backaccountname <", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameLessThanOrEqualTo(String value) {
            addCriterion("backaccountname <=", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameLike(String value) {
            addCriterion("backaccountname like", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameNotLike(String value) {
            addCriterion("backaccountname not like", value, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameIn(List<String> values) {
            addCriterion("backaccountname in", values, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameNotIn(List<String> values) {
            addCriterion("backaccountname not in", values, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameBetween(String value1, String value2) {
            addCriterion("backaccountname between", value1, value2, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andBackaccountnameNotBetween(String value1, String value2) {
            addCriterion("backaccountname not between", value1, value2, "backaccountname");
            return (Criteria) this;
        }

        public Criteria andRefundaccountIsNull() {
            addCriterion("refundaccount is null");
            return (Criteria) this;
        }

        public Criteria andRefundaccountIsNotNull() {
            addCriterion("refundaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundaccountEqualTo(String value) {
            addCriterion("refundaccount =", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountNotEqualTo(String value) {
            addCriterion("refundaccount <>", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountGreaterThan(String value) {
            addCriterion("refundaccount >", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountGreaterThanOrEqualTo(String value) {
            addCriterion("refundaccount >=", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountLessThan(String value) {
            addCriterion("refundaccount <", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountLessThanOrEqualTo(String value) {
            addCriterion("refundaccount <=", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountLike(String value) {
            addCriterion("refundaccount like", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountNotLike(String value) {
            addCriterion("refundaccount not like", value, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountIn(List<String> values) {
            addCriterion("refundaccount in", values, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountNotIn(List<String> values) {
            addCriterion("refundaccount not in", values, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountBetween(String value1, String value2) {
            addCriterion("refundaccount between", value1, value2, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundaccountNotBetween(String value1, String value2) {
            addCriterion("refundaccount not between", value1, value2, "refundaccount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNull() {
            addCriterion("refundamount is null");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNotNull() {
            addCriterion("refundamount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundamountEqualTo(BigDecimal value) {
            addCriterion("refundamount =", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotEqualTo(BigDecimal value) {
            addCriterion("refundamount <>", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThan(BigDecimal value) {
            addCriterion("refundamount >", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refundamount >=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThan(BigDecimal value) {
            addCriterion("refundamount <", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refundamount <=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIn(List<BigDecimal> values) {
            addCriterion("refundamount in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotIn(List<BigDecimal> values) {
            addCriterion("refundamount not in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundamount between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refundamount not between", value1, value2, "refundamount");
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

        public Criteria andChargesbeforeIsNull() {
            addCriterion("chargesbefore is null");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeIsNotNull() {
            addCriterion("chargesbefore is not null");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeEqualTo(BigDecimal value) {
            addCriterion("chargesbefore =", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeNotEqualTo(BigDecimal value) {
            addCriterion("chargesbefore <>", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeGreaterThan(BigDecimal value) {
            addCriterion("chargesbefore >", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chargesbefore >=", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeLessThan(BigDecimal value) {
            addCriterion("chargesbefore <", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chargesbefore <=", value, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeIn(List<BigDecimal> values) {
            addCriterion("chargesbefore in", values, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeNotIn(List<BigDecimal> values) {
            addCriterion("chargesbefore not in", values, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargesbefore between", value1, value2, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andChargesbeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargesbefore not between", value1, value2, "chargesbefore");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestIsNull() {
            addCriterion("custprepaidinterest is null");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestIsNotNull() {
            addCriterion("custprepaidinterest is not null");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest =", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestNotEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest <>", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestGreaterThan(BigDecimal value) {
            addCriterion("custprepaidinterest >", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest >=", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestLessThan(BigDecimal value) {
            addCriterion("custprepaidinterest <", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("custprepaidinterest <=", value, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestIn(List<BigDecimal> values) {
            addCriterion("custprepaidinterest in", values, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestNotIn(List<BigDecimal> values) {
            addCriterion("custprepaidinterest not in", values, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custprepaidinterest between", value1, value2, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andCustprepaidinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("custprepaidinterest not between", value1, value2, "custprepaidinterest");
            return (Criteria) this;
        }

        public Criteria andActualdaysIsNull() {
            addCriterion("actualdays is null");
            return (Criteria) this;
        }

        public Criteria andActualdaysIsNotNull() {
            addCriterion("actualdays is not null");
            return (Criteria) this;
        }

        public Criteria andActualdaysEqualTo(String value) {
            addCriterion("actualdays =", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotEqualTo(String value) {
            addCriterion("actualdays <>", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysGreaterThan(String value) {
            addCriterion("actualdays >", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysGreaterThanOrEqualTo(String value) {
            addCriterion("actualdays >=", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysLessThan(String value) {
            addCriterion("actualdays <", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysLessThanOrEqualTo(String value) {
            addCriterion("actualdays <=", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysLike(String value) {
            addCriterion("actualdays like", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotLike(String value) {
            addCriterion("actualdays not like", value, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysIn(List<String> values) {
            addCriterion("actualdays in", values, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotIn(List<String> values) {
            addCriterion("actualdays not in", values, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysBetween(String value1, String value2) {
            addCriterion("actualdays between", value1, value2, "actualdays");
            return (Criteria) this;
        }

        public Criteria andActualdaysNotBetween(String value1, String value2) {
            addCriterion("actualdays not between", value1, value2, "actualdays");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableIsNull() {
            addCriterion("interestreceivable is null");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableIsNotNull() {
            addCriterion("interestreceivable is not null");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableEqualTo(BigDecimal value) {
            addCriterion("interestreceivable =", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableNotEqualTo(BigDecimal value) {
            addCriterion("interestreceivable <>", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableGreaterThan(BigDecimal value) {
            addCriterion("interestreceivable >", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interestreceivable >=", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableLessThan(BigDecimal value) {
            addCriterion("interestreceivable <", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interestreceivable <=", value, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableIn(List<BigDecimal> values) {
            addCriterion("interestreceivable in", values, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableNotIn(List<BigDecimal> values) {
            addCriterion("interestreceivable not in", values, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestreceivable between", value1, value2, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andInterestreceivableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interestreceivable not between", value1, value2, "interestreceivable");
            return (Criteria) this;
        }

        public Criteria andHavechandepositIsNull() {
            addCriterion("havechandeposit is null");
            return (Criteria) this;
        }

        public Criteria andHavechandepositIsNotNull() {
            addCriterion("havechandeposit is not null");
            return (Criteria) this;
        }

        public Criteria andHavechandepositEqualTo(String value) {
            addCriterion("havechandeposit =", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotEqualTo(String value) {
            addCriterion("havechandeposit <>", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositGreaterThan(String value) {
            addCriterion("havechandeposit >", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositGreaterThanOrEqualTo(String value) {
            addCriterion("havechandeposit >=", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositLessThan(String value) {
            addCriterion("havechandeposit <", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositLessThanOrEqualTo(String value) {
            addCriterion("havechandeposit <=", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositLike(String value) {
            addCriterion("havechandeposit like", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotLike(String value) {
            addCriterion("havechandeposit not like", value, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositIn(List<String> values) {
            addCriterion("havechandeposit in", values, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotIn(List<String> values) {
            addCriterion("havechandeposit not in", values, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositBetween(String value1, String value2) {
            addCriterion("havechandeposit between", value1, value2, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andHavechandepositNotBetween(String value1, String value2) {
            addCriterion("havechandeposit not between", value1, value2, "havechandeposit");
            return (Criteria) this;
        }

        public Criteria andPayamountIsNull() {
            addCriterion("payamount is null");
            return (Criteria) this;
        }

        public Criteria andPayamountIsNotNull() {
            addCriterion("payamount is not null");
            return (Criteria) this;
        }

        public Criteria andPayamountEqualTo(BigDecimal value) {
            addCriterion("payamount =", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotEqualTo(BigDecimal value) {
            addCriterion("payamount <>", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThan(BigDecimal value) {
            addCriterion("payamount >", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payamount >=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThan(BigDecimal value) {
            addCriterion("payamount <", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payamount <=", value, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountIn(List<BigDecimal> values) {
            addCriterion("payamount in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotIn(List<BigDecimal> values) {
            addCriterion("payamount not in", values, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payamount between", value1, value2, "payamount");
            return (Criteria) this;
        }

        public Criteria andPayamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payamount not between", value1, value2, "payamount");
            return (Criteria) this;
        }

        public Criteria andBackamountIsNull() {
            addCriterion("backamount is null");
            return (Criteria) this;
        }

        public Criteria andBackamountIsNotNull() {
            addCriterion("backamount is not null");
            return (Criteria) this;
        }

        public Criteria andBackamountEqualTo(BigDecimal value) {
            addCriterion("backamount =", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountNotEqualTo(BigDecimal value) {
            addCriterion("backamount <>", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountGreaterThan(BigDecimal value) {
            addCriterion("backamount >", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("backamount >=", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountLessThan(BigDecimal value) {
            addCriterion("backamount <", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("backamount <=", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountIn(List<BigDecimal> values) {
            addCriterion("backamount in", values, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountNotIn(List<BigDecimal> values) {
            addCriterion("backamount not in", values, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backamount between", value1, value2, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("backamount not between", value1, value2, "backamount");
            return (Criteria) this;
        }

        public Criteria andOutloandateIsNull() {
            addCriterion("outloandate is null");
            return (Criteria) this;
        }

        public Criteria andOutloandateIsNotNull() {
            addCriterion("outloandate is not null");
            return (Criteria) this;
        }

        public Criteria andOutloandateEqualTo(Date value) {
            addCriterion("outloandate =", value, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateNotEqualTo(Date value) {
            addCriterion("outloandate <>", value, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateGreaterThan(Date value) {
            addCriterion("outloandate >", value, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateGreaterThanOrEqualTo(Date value) {
            addCriterion("outloandate >=", value, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateLessThan(Date value) {
            addCriterion("outloandate <", value, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateLessThanOrEqualTo(Date value) {
            addCriterion("outloandate <=", value, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateIn(List<Date> values) {
            addCriterion("outloandate in", values, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateNotIn(List<Date> values) {
            addCriterion("outloandate not in", values, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateBetween(Date value1, Date value2) {
            addCriterion("outloandate between", value1, value2, "outloandate");
            return (Criteria) this;
        }

        public Criteria andOutloandateNotBetween(Date value1, Date value2) {
            addCriterion("outloandate not between", value1, value2, "outloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateIsNull() {
            addCriterion("backloandate is null");
            return (Criteria) this;
        }

        public Criteria andBackloandateIsNotNull() {
            addCriterion("backloandate is not null");
            return (Criteria) this;
        }

        public Criteria andBackloandateEqualTo(Date value) {
            addCriterion("backloandate =", value, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateNotEqualTo(Date value) {
            addCriterion("backloandate <>", value, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateGreaterThan(Date value) {
            addCriterion("backloandate >", value, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateGreaterThanOrEqualTo(Date value) {
            addCriterion("backloandate >=", value, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateLessThan(Date value) {
            addCriterion("backloandate <", value, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateLessThanOrEqualTo(Date value) {
            addCriterion("backloandate <=", value, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateIn(List<Date> values) {
            addCriterion("backloandate in", values, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateNotIn(List<Date> values) {
            addCriterion("backloandate not in", values, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateBetween(Date value1, Date value2) {
            addCriterion("backloandate between", value1, value2, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBackloandateNotBetween(Date value1, Date value2) {
            addCriterion("backloandate not between", value1, value2, "backloandate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateIsNull() {
            addCriterion("borrowrate is null");
            return (Criteria) this;
        }

        public Criteria andBorrowrateIsNotNull() {
            addCriterion("borrowrate is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowrateEqualTo(BigDecimal value) {
            addCriterion("borrowrate =", value, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateNotEqualTo(BigDecimal value) {
            addCriterion("borrowrate <>", value, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateGreaterThan(BigDecimal value) {
            addCriterion("borrowrate >", value, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowrate >=", value, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateLessThan(BigDecimal value) {
            addCriterion("borrowrate <", value, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowrate <=", value, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateIn(List<BigDecimal> values) {
            addCriterion("borrowrate in", values, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateNotIn(List<BigDecimal> values) {
            addCriterion("borrowrate not in", values, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowrate between", value1, value2, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andBorrowrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowrate not between", value1, value2, "borrowrate");
            return (Criteria) this;
        }

        public Criteria andPretakedayIsNull() {
            addCriterion("pretakeday is null");
            return (Criteria) this;
        }

        public Criteria andPretakedayIsNotNull() {
            addCriterion("pretakeday is not null");
            return (Criteria) this;
        }

        public Criteria andPretakedayEqualTo(String value) {
            addCriterion("pretakeday =", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayNotEqualTo(String value) {
            addCriterion("pretakeday <>", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayGreaterThan(String value) {
            addCriterion("pretakeday >", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayGreaterThanOrEqualTo(String value) {
            addCriterion("pretakeday >=", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayLessThan(String value) {
            addCriterion("pretakeday <", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayLessThanOrEqualTo(String value) {
            addCriterion("pretakeday <=", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayLike(String value) {
            addCriterion("pretakeday like", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayNotLike(String value) {
            addCriterion("pretakeday not like", value, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayIn(List<String> values) {
            addCriterion("pretakeday in", values, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayNotIn(List<String> values) {
            addCriterion("pretakeday not in", values, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayBetween(String value1, String value2) {
            addCriterion("pretakeday between", value1, value2, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andPretakedayNotBetween(String value1, String value2) {
            addCriterion("pretakeday not between", value1, value2, "pretakeday");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountIsNull() {
            addCriterion("shouldbackamount is null");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountIsNotNull() {
            addCriterion("shouldbackamount is not null");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountEqualTo(BigDecimal value) {
            addCriterion("shouldbackamount =", value, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountNotEqualTo(BigDecimal value) {
            addCriterion("shouldbackamount <>", value, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountGreaterThan(BigDecimal value) {
            addCriterion("shouldbackamount >", value, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shouldbackamount >=", value, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountLessThan(BigDecimal value) {
            addCriterion("shouldbackamount <", value, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shouldbackamount <=", value, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountIn(List<BigDecimal> values) {
            addCriterion("shouldbackamount in", values, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountNotIn(List<BigDecimal> values) {
            addCriterion("shouldbackamount not in", values, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shouldbackamount between", value1, value2, "shouldbackamount");
            return (Criteria) this;
        }

        public Criteria andShouldbackamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shouldbackamount not between", value1, value2, "shouldbackamount");
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