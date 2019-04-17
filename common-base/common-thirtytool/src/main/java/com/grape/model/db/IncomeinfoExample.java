package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncomeinfoExample() {
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

        public Criteria andHalfyearreceiptIsNull() {
            addCriterion("halfyearreceipt is null");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptIsNotNull() {
            addCriterion("halfyearreceipt is not null");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptEqualTo(BigDecimal value) {
            addCriterion("halfyearreceipt =", value, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptNotEqualTo(BigDecimal value) {
            addCriterion("halfyearreceipt <>", value, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptGreaterThan(BigDecimal value) {
            addCriterion("halfyearreceipt >", value, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("halfyearreceipt >=", value, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptLessThan(BigDecimal value) {
            addCriterion("halfyearreceipt <", value, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptLessThanOrEqualTo(BigDecimal value) {
            addCriterion("halfyearreceipt <=", value, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptIn(List<BigDecimal> values) {
            addCriterion("halfyearreceipt in", values, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptNotIn(List<BigDecimal> values) {
            addCriterion("halfyearreceipt not in", values, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("halfyearreceipt between", value1, value2, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyearreceiptNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("halfyearreceipt not between", value1, value2, "halfyearreceipt");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeIsNull() {
            addCriterion("halfyaerincome is null");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeIsNotNull() {
            addCriterion("halfyaerincome is not null");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeEqualTo(BigDecimal value) {
            addCriterion("halfyaerincome =", value, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeNotEqualTo(BigDecimal value) {
            addCriterion("halfyaerincome <>", value, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeGreaterThan(BigDecimal value) {
            addCriterion("halfyaerincome >", value, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("halfyaerincome >=", value, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeLessThan(BigDecimal value) {
            addCriterion("halfyaerincome <", value, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("halfyaerincome <=", value, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeIn(List<BigDecimal> values) {
            addCriterion("halfyaerincome in", values, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeNotIn(List<BigDecimal> values) {
            addCriterion("halfyaerincome not in", values, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("halfyaerincome between", value1, value2, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andHalfyaerincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("halfyaerincome not between", value1, value2, "halfyaerincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeIsNull() {
            addCriterion("rentincome is null");
            return (Criteria) this;
        }

        public Criteria andRentincomeIsNotNull() {
            addCriterion("rentincome is not null");
            return (Criteria) this;
        }

        public Criteria andRentincomeEqualTo(BigDecimal value) {
            addCriterion("rentincome =", value, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeNotEqualTo(BigDecimal value) {
            addCriterion("rentincome <>", value, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeGreaterThan(BigDecimal value) {
            addCriterion("rentincome >", value, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rentincome >=", value, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeLessThan(BigDecimal value) {
            addCriterion("rentincome <", value, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rentincome <=", value, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeIn(List<BigDecimal> values) {
            addCriterion("rentincome in", values, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeNotIn(List<BigDecimal> values) {
            addCriterion("rentincome not in", values, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rentincome between", value1, value2, "rentincome");
            return (Criteria) this;
        }

        public Criteria andRentincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rentincome not between", value1, value2, "rentincome");
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

        public Criteria andIncomestatementIsNull() {
            addCriterion("incomestatement is null");
            return (Criteria) this;
        }

        public Criteria andIncomestatementIsNotNull() {
            addCriterion("incomestatement is not null");
            return (Criteria) this;
        }

        public Criteria andIncomestatementEqualTo(String value) {
            addCriterion("incomestatement =", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementNotEqualTo(String value) {
            addCriterion("incomestatement <>", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementGreaterThan(String value) {
            addCriterion("incomestatement >", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementGreaterThanOrEqualTo(String value) {
            addCriterion("incomestatement >=", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementLessThan(String value) {
            addCriterion("incomestatement <", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementLessThanOrEqualTo(String value) {
            addCriterion("incomestatement <=", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementLike(String value) {
            addCriterion("incomestatement like", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementNotLike(String value) {
            addCriterion("incomestatement not like", value, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementIn(List<String> values) {
            addCriterion("incomestatement in", values, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementNotIn(List<String> values) {
            addCriterion("incomestatement not in", values, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementBetween(String value1, String value2) {
            addCriterion("incomestatement between", value1, value2, "incomestatement");
            return (Criteria) this;
        }

        public Criteria andIncomestatementNotBetween(String value1, String value2) {
            addCriterion("incomestatement not between", value1, value2, "incomestatement");
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

        public Criteria andNetmarginEqualTo(String value) {
            addCriterion("netmargin =", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginNotEqualTo(String value) {
            addCriterion("netmargin <>", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginGreaterThan(String value) {
            addCriterion("netmargin >", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginGreaterThanOrEqualTo(String value) {
            addCriterion("netmargin >=", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginLessThan(String value) {
            addCriterion("netmargin <", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginLessThanOrEqualTo(String value) {
            addCriterion("netmargin <=", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginLike(String value) {
            addCriterion("netmargin like", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginNotLike(String value) {
            addCriterion("netmargin not like", value, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginIn(List<String> values) {
            addCriterion("netmargin in", values, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginNotIn(List<String> values) {
            addCriterion("netmargin not in", values, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginBetween(String value1, String value2) {
            addCriterion("netmargin between", value1, value2, "netmargin");
            return (Criteria) this;
        }

        public Criteria andNetmarginNotBetween(String value1, String value2) {
            addCriterion("netmargin not between", value1, value2, "netmargin");
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