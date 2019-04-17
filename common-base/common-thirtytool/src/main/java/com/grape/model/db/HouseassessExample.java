package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseassessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseassessExample() {
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

        public Criteria andMortgagenoIsNull() {
            addCriterion("mortgageno is null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoIsNotNull() {
            addCriterion("mortgageno is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagenoEqualTo(String value) {
            addCriterion("mortgageno =", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotEqualTo(String value) {
            addCriterion("mortgageno <>", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoGreaterThan(String value) {
            addCriterion("mortgageno >", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageno >=", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLessThan(String value) {
            addCriterion("mortgageno <", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLessThanOrEqualTo(String value) {
            addCriterion("mortgageno <=", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoLike(String value) {
            addCriterion("mortgageno like", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotLike(String value) {
            addCriterion("mortgageno not like", value, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoIn(List<String> values) {
            addCriterion("mortgageno in", values, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotIn(List<String> values) {
            addCriterion("mortgageno not in", values, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoBetween(String value1, String value2) {
            addCriterion("mortgageno between", value1, value2, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andMortgagenoNotBetween(String value1, String value2) {
            addCriterion("mortgageno not between", value1, value2, "mortgageno");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceIsNull() {
            addCriterion("assess_online_price is null");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceIsNotNull() {
            addCriterion("assess_online_price is not null");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceEqualTo(BigDecimal value) {
            addCriterion("assess_online_price =", value, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceNotEqualTo(BigDecimal value) {
            addCriterion("assess_online_price <>", value, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceGreaterThan(BigDecimal value) {
            addCriterion("assess_online_price >", value, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_online_price >=", value, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceLessThan(BigDecimal value) {
            addCriterion("assess_online_price <", value, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_online_price <=", value, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceIn(List<BigDecimal> values) {
            addCriterion("assess_online_price in", values, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceNotIn(List<BigDecimal> values) {
            addCriterion("assess_online_price not in", values, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_online_price between", value1, value2, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlinePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_online_price not between", value1, value2, "assessOnlinePrice");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalIsNull() {
            addCriterion("assess_online_total is null");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalIsNotNull() {
            addCriterion("assess_online_total is not null");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalEqualTo(BigDecimal value) {
            addCriterion("assess_online_total =", value, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalNotEqualTo(BigDecimal value) {
            addCriterion("assess_online_total <>", value, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalGreaterThan(BigDecimal value) {
            addCriterion("assess_online_total >", value, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_online_total >=", value, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalLessThan(BigDecimal value) {
            addCriterion("assess_online_total <", value, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_online_total <=", value, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalIn(List<BigDecimal> values) {
            addCriterion("assess_online_total in", values, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalNotIn(List<BigDecimal> values) {
            addCriterion("assess_online_total not in", values, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_online_total between", value1, value2, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessOnlineTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_online_total not between", value1, value2, "assessOnlineTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalIsNull() {
            addCriterion("assess_control_total is null");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalIsNotNull() {
            addCriterion("assess_control_total is not null");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalEqualTo(BigDecimal value) {
            addCriterion("assess_control_total =", value, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalNotEqualTo(BigDecimal value) {
            addCriterion("assess_control_total <>", value, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalGreaterThan(BigDecimal value) {
            addCriterion("assess_control_total >", value, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_control_total >=", value, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalLessThan(BigDecimal value) {
            addCriterion("assess_control_total <", value, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_control_total <=", value, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalIn(List<BigDecimal> values) {
            addCriterion("assess_control_total in", values, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalNotIn(List<BigDecimal> values) {
            addCriterion("assess_control_total not in", values, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_control_total between", value1, value2, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_control_total not between", value1, value2, "assessControlTotal");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceIsNull() {
            addCriterion("assess_control_price is null");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceIsNotNull() {
            addCriterion("assess_control_price is not null");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceEqualTo(BigDecimal value) {
            addCriterion("assess_control_price =", value, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceNotEqualTo(BigDecimal value) {
            addCriterion("assess_control_price <>", value, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceGreaterThan(BigDecimal value) {
            addCriterion("assess_control_price >", value, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_control_price >=", value, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceLessThan(BigDecimal value) {
            addCriterion("assess_control_price <", value, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_control_price <=", value, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceIn(List<BigDecimal> values) {
            addCriterion("assess_control_price in", values, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceNotIn(List<BigDecimal> values) {
            addCriterion("assess_control_price not in", values, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_control_price between", value1, value2, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessControlPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_control_price not between", value1, value2, "assessControlPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceIsNull() {
            addCriterion("assess_again_price is null");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceIsNotNull() {
            addCriterion("assess_again_price is not null");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceEqualTo(BigDecimal value) {
            addCriterion("assess_again_price =", value, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceNotEqualTo(BigDecimal value) {
            addCriterion("assess_again_price <>", value, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceGreaterThan(BigDecimal value) {
            addCriterion("assess_again_price >", value, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_again_price >=", value, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceLessThan(BigDecimal value) {
            addCriterion("assess_again_price <", value, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_again_price <=", value, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceIn(List<BigDecimal> values) {
            addCriterion("assess_again_price in", values, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceNotIn(List<BigDecimal> values) {
            addCriterion("assess_again_price not in", values, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_again_price between", value1, value2, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_again_price not between", value1, value2, "assessAgainPrice");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalIsNull() {
            addCriterion("assess_again_total is null");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalIsNotNull() {
            addCriterion("assess_again_total is not null");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalEqualTo(BigDecimal value) {
            addCriterion("assess_again_total =", value, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalNotEqualTo(BigDecimal value) {
            addCriterion("assess_again_total <>", value, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalGreaterThan(BigDecimal value) {
            addCriterion("assess_again_total >", value, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_again_total >=", value, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalLessThan(BigDecimal value) {
            addCriterion("assess_again_total <", value, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assess_again_total <=", value, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalIn(List<BigDecimal> values) {
            addCriterion("assess_again_total in", values, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalNotIn(List<BigDecimal> values) {
            addCriterion("assess_again_total not in", values, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_again_total between", value1, value2, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andAssessAgainTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assess_again_total not between", value1, value2, "assessAgainTotal");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceIsNull() {
            addCriterion("quick_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceIsNotNull() {
            addCriterion("quick_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceEqualTo(BigDecimal value) {
            addCriterion("quick_unit_price =", value, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("quick_unit_price <>", value, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("quick_unit_price >", value, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quick_unit_price >=", value, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceLessThan(BigDecimal value) {
            addCriterion("quick_unit_price <", value, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quick_unit_price <=", value, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceIn(List<BigDecimal> values) {
            addCriterion("quick_unit_price in", values, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("quick_unit_price not in", values, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quick_unit_price between", value1, value2, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andQuickUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quick_unit_price not between", value1, value2, "quickUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceIsNull() {
            addCriterion("general_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceIsNotNull() {
            addCriterion("general_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceEqualTo(BigDecimal value) {
            addCriterion("general_unit_price =", value, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("general_unit_price <>", value, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("general_unit_price >", value, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("general_unit_price >=", value, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceLessThan(BigDecimal value) {
            addCriterion("general_unit_price <", value, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("general_unit_price <=", value, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceIn(List<BigDecimal> values) {
            addCriterion("general_unit_price in", values, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("general_unit_price not in", values, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("general_unit_price between", value1, value2, "generalUnitPrice");
            return (Criteria) this;
        }

        public Criteria andGeneralUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("general_unit_price not between", value1, value2, "generalUnitPrice");
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

        public Criteria andChannelnameIsNull() {
            addCriterion("channelname is null");
            return (Criteria) this;
        }

        public Criteria andChannelnameIsNotNull() {
            addCriterion("channelname is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnameEqualTo(String value) {
            addCriterion("channelname =", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotEqualTo(String value) {
            addCriterion("channelname <>", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThan(String value) {
            addCriterion("channelname >", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameGreaterThanOrEqualTo(String value) {
            addCriterion("channelname >=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThan(String value) {
            addCriterion("channelname <", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLessThanOrEqualTo(String value) {
            addCriterion("channelname <=", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameLike(String value) {
            addCriterion("channelname like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotLike(String value) {
            addCriterion("channelname not like", value, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameIn(List<String> values) {
            addCriterion("channelname in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotIn(List<String> values) {
            addCriterion("channelname not in", values, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameBetween(String value1, String value2) {
            addCriterion("channelname between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andChannelnameNotBetween(String value1, String value2) {
            addCriterion("channelname not between", value1, value2, "channelname");
            return (Criteria) this;
        }

        public Criteria andAssessaddressIsNull() {
            addCriterion("assessaddress is null");
            return (Criteria) this;
        }

        public Criteria andAssessaddressIsNotNull() {
            addCriterion("assessaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAssessaddressEqualTo(String value) {
            addCriterion("assessaddress =", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressNotEqualTo(String value) {
            addCriterion("assessaddress <>", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressGreaterThan(String value) {
            addCriterion("assessaddress >", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressGreaterThanOrEqualTo(String value) {
            addCriterion("assessaddress >=", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressLessThan(String value) {
            addCriterion("assessaddress <", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressLessThanOrEqualTo(String value) {
            addCriterion("assessaddress <=", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressLike(String value) {
            addCriterion("assessaddress like", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressNotLike(String value) {
            addCriterion("assessaddress not like", value, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressIn(List<String> values) {
            addCriterion("assessaddress in", values, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressNotIn(List<String> values) {
            addCriterion("assessaddress not in", values, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressBetween(String value1, String value2) {
            addCriterion("assessaddress between", value1, value2, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessaddressNotBetween(String value1, String value2) {
            addCriterion("assessaddress not between", value1, value2, "assessaddress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressIsNull() {
            addCriterion("assessprogress is null");
            return (Criteria) this;
        }

        public Criteria andAssessprogressIsNotNull() {
            addCriterion("assessprogress is not null");
            return (Criteria) this;
        }

        public Criteria andAssessprogressEqualTo(String value) {
            addCriterion("assessprogress =", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressNotEqualTo(String value) {
            addCriterion("assessprogress <>", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressGreaterThan(String value) {
            addCriterion("assessprogress >", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressGreaterThanOrEqualTo(String value) {
            addCriterion("assessprogress >=", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressLessThan(String value) {
            addCriterion("assessprogress <", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressLessThanOrEqualTo(String value) {
            addCriterion("assessprogress <=", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressLike(String value) {
            addCriterion("assessprogress like", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressNotLike(String value) {
            addCriterion("assessprogress not like", value, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressIn(List<String> values) {
            addCriterion("assessprogress in", values, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressNotIn(List<String> values) {
            addCriterion("assessprogress not in", values, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressBetween(String value1, String value2) {
            addCriterion("assessprogress between", value1, value2, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andAssessprogressNotBetween(String value1, String value2) {
            addCriterion("assessprogress not between", value1, value2, "assessprogress");
            return (Criteria) this;
        }

        public Criteria andValuetypeIsNull() {
            addCriterion("valuetype is null");
            return (Criteria) this;
        }

        public Criteria andValuetypeIsNotNull() {
            addCriterion("valuetype is not null");
            return (Criteria) this;
        }

        public Criteria andValuetypeEqualTo(String value) {
            addCriterion("valuetype =", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotEqualTo(String value) {
            addCriterion("valuetype <>", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeGreaterThan(String value) {
            addCriterion("valuetype >", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeGreaterThanOrEqualTo(String value) {
            addCriterion("valuetype >=", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLessThan(String value) {
            addCriterion("valuetype <", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLessThanOrEqualTo(String value) {
            addCriterion("valuetype <=", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeLike(String value) {
            addCriterion("valuetype like", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotLike(String value) {
            addCriterion("valuetype not like", value, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeIn(List<String> values) {
            addCriterion("valuetype in", values, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotIn(List<String> values) {
            addCriterion("valuetype not in", values, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeBetween(String value1, String value2) {
            addCriterion("valuetype between", value1, value2, "valuetype");
            return (Criteria) this;
        }

        public Criteria andValuetypeNotBetween(String value1, String value2) {
            addCriterion("valuetype not between", value1, value2, "valuetype");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
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