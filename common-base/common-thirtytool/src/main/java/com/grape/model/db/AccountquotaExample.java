package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountquotaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountquotaExample() {
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

        public Criteria andLinenumberIsNull() {
            addCriterion("linenumber is null");
            return (Criteria) this;
        }

        public Criteria andLinenumberIsNotNull() {
            addCriterion("linenumber is not null");
            return (Criteria) this;
        }

        public Criteria andLinenumberEqualTo(String value) {
            addCriterion("linenumber =", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotEqualTo(String value) {
            addCriterion("linenumber <>", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberGreaterThan(String value) {
            addCriterion("linenumber >", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberGreaterThanOrEqualTo(String value) {
            addCriterion("linenumber >=", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLessThan(String value) {
            addCriterion("linenumber <", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLessThanOrEqualTo(String value) {
            addCriterion("linenumber <=", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLike(String value) {
            addCriterion("linenumber like", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotLike(String value) {
            addCriterion("linenumber not like", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberIn(List<String> values) {
            addCriterion("linenumber in", values, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotIn(List<String> values) {
            addCriterion("linenumber not in", values, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberBetween(String value1, String value2) {
            addCriterion("linenumber between", value1, value2, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotBetween(String value1, String value2) {
            addCriterion("linenumber not between", value1, value2, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorIsNull() {
            addCriterion("linenumbersenior is null");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorIsNotNull() {
            addCriterion("linenumbersenior is not null");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorEqualTo(String value) {
            addCriterion("linenumbersenior =", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorNotEqualTo(String value) {
            addCriterion("linenumbersenior <>", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorGreaterThan(String value) {
            addCriterion("linenumbersenior >", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorGreaterThanOrEqualTo(String value) {
            addCriterion("linenumbersenior >=", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorLessThan(String value) {
            addCriterion("linenumbersenior <", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorLessThanOrEqualTo(String value) {
            addCriterion("linenumbersenior <=", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorLike(String value) {
            addCriterion("linenumbersenior like", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorNotLike(String value) {
            addCriterion("linenumbersenior not like", value, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorIn(List<String> values) {
            addCriterion("linenumbersenior in", values, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorNotIn(List<String> values) {
            addCriterion("linenumbersenior not in", values, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorBetween(String value1, String value2) {
            addCriterion("linenumbersenior between", value1, value2, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andLinenumberseniorNotBetween(String value1, String value2) {
            addCriterion("linenumbersenior not between", value1, value2, "linenumbersenior");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineIsNull() {
            addCriterion("totalcreditline is null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineIsNotNull() {
            addCriterion("totalcreditline is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineEqualTo(BigDecimal value) {
            addCriterion("totalcreditline =", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineNotEqualTo(BigDecimal value) {
            addCriterion("totalcreditline <>", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineGreaterThan(BigDecimal value) {
            addCriterion("totalcreditline >", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalcreditline >=", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineLessThan(BigDecimal value) {
            addCriterion("totalcreditline <", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalcreditline <=", value, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineIn(List<BigDecimal> values) {
            addCriterion("totalcreditline in", values, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineNotIn(List<BigDecimal> values) {
            addCriterion("totalcreditline not in", values, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalcreditline between", value1, value2, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andTotalcreditlineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalcreditline not between", value1, value2, "totalcreditline");
            return (Criteria) this;
        }

        public Criteria andMortgageamountIsNull() {
            addCriterion("mortgageamount is null");
            return (Criteria) this;
        }

        public Criteria andMortgageamountIsNotNull() {
            addCriterion("mortgageamount is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageamountEqualTo(BigDecimal value) {
            addCriterion("mortgageamount =", value, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountNotEqualTo(BigDecimal value) {
            addCriterion("mortgageamount <>", value, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountGreaterThan(BigDecimal value) {
            addCriterion("mortgageamount >", value, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgageamount >=", value, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountLessThan(BigDecimal value) {
            addCriterion("mortgageamount <", value, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgageamount <=", value, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountIn(List<BigDecimal> values) {
            addCriterion("mortgageamount in", values, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountNotIn(List<BigDecimal> values) {
            addCriterion("mortgageamount not in", values, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgageamount between", value1, value2, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andMortgageamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgageamount not between", value1, value2, "mortgageamount");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesIsNull() {
            addCriterion("foreclosurefloorlines is null");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesIsNotNull() {
            addCriterion("foreclosurefloorlines is not null");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorlines =", value, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesNotEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorlines <>", value, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesGreaterThan(BigDecimal value) {
            addCriterion("foreclosurefloorlines >", value, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorlines >=", value, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesLessThan(BigDecimal value) {
            addCriterion("foreclosurefloorlines <", value, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorlines <=", value, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesIn(List<BigDecimal> values) {
            addCriterion("foreclosurefloorlines in", values, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesNotIn(List<BigDecimal> values) {
            addCriterion("foreclosurefloorlines not in", values, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreclosurefloorlines between", value1, value2, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorlinesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreclosurefloorlines not between", value1, value2, "foreclosurefloorlines");
            return (Criteria) this;
        }

        public Criteria andRemainingamountIsNull() {
            addCriterion("remainingamount is null");
            return (Criteria) this;
        }

        public Criteria andRemainingamountIsNotNull() {
            addCriterion("remainingamount is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingamountEqualTo(BigDecimal value) {
            addCriterion("remainingamount =", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountNotEqualTo(BigDecimal value) {
            addCriterion("remainingamount <>", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountGreaterThan(BigDecimal value) {
            addCriterion("remainingamount >", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remainingamount >=", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountLessThan(BigDecimal value) {
            addCriterion("remainingamount <", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remainingamount <=", value, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountIn(List<BigDecimal> values) {
            addCriterion("remainingamount in", values, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountNotIn(List<BigDecimal> values) {
            addCriterion("remainingamount not in", values, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remainingamount between", value1, value2, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andRemainingamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remainingamount not between", value1, value2, "remainingamount");
            return (Criteria) this;
        }

        public Criteria andMortgageratioIsNull() {
            addCriterion("mortgageratio is null");
            return (Criteria) this;
        }

        public Criteria andMortgageratioIsNotNull() {
            addCriterion("mortgageratio is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageratioEqualTo(BigDecimal value) {
            addCriterion("mortgageratio =", value, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioNotEqualTo(BigDecimal value) {
            addCriterion("mortgageratio <>", value, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioGreaterThan(BigDecimal value) {
            addCriterion("mortgageratio >", value, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgageratio >=", value, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioLessThan(BigDecimal value) {
            addCriterion("mortgageratio <", value, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mortgageratio <=", value, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioIn(List<BigDecimal> values) {
            addCriterion("mortgageratio in", values, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioNotIn(List<BigDecimal> values) {
            addCriterion("mortgageratio not in", values, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgageratio between", value1, value2, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andMortgageratioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mortgageratio not between", value1, value2, "mortgageratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioIsNull() {
            addCriterion("foreclosurefloorratio is null");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioIsNotNull() {
            addCriterion("foreclosurefloorratio is not null");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorratio =", value, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioNotEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorratio <>", value, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioGreaterThan(BigDecimal value) {
            addCriterion("foreclosurefloorratio >", value, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorratio >=", value, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioLessThan(BigDecimal value) {
            addCriterion("foreclosurefloorratio <", value, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("foreclosurefloorratio <=", value, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioIn(List<BigDecimal> values) {
            addCriterion("foreclosurefloorratio in", values, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioNotIn(List<BigDecimal> values) {
            addCriterion("foreclosurefloorratio not in", values, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreclosurefloorratio between", value1, value2, "foreclosurefloorratio");
            return (Criteria) this;
        }

        public Criteria andForeclosurefloorratioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreclosurefloorratio not between", value1, value2, "foreclosurefloorratio");
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