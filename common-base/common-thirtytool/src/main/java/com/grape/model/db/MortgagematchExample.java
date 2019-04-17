package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MortgagematchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MortgagematchExample() {
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

        public Criteria andMatchnoIsNull() {
            addCriterion("matchno is null");
            return (Criteria) this;
        }

        public Criteria andMatchnoIsNotNull() {
            addCriterion("matchno is not null");
            return (Criteria) this;
        }

        public Criteria andMatchnoEqualTo(String value) {
            addCriterion("matchno =", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoNotEqualTo(String value) {
            addCriterion("matchno <>", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoGreaterThan(String value) {
            addCriterion("matchno >", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("matchno >=", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoLessThan(String value) {
            addCriterion("matchno <", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoLessThanOrEqualTo(String value) {
            addCriterion("matchno <=", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoLike(String value) {
            addCriterion("matchno like", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoNotLike(String value) {
            addCriterion("matchno not like", value, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoIn(List<String> values) {
            addCriterion("matchno in", values, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoNotIn(List<String> values) {
            addCriterion("matchno not in", values, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoBetween(String value1, String value2) {
            addCriterion("matchno between", value1, value2, "matchno");
            return (Criteria) this;
        }

        public Criteria andMatchnoNotBetween(String value1, String value2) {
            addCriterion("matchno not between", value1, value2, "matchno");
            return (Criteria) this;
        }

        public Criteria andSimilarwordIsNull() {
            addCriterion("similarword is null");
            return (Criteria) this;
        }

        public Criteria andSimilarwordIsNotNull() {
            addCriterion("similarword is not null");
            return (Criteria) this;
        }

        public Criteria andSimilarwordEqualTo(String value) {
            addCriterion("similarword =", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordNotEqualTo(String value) {
            addCriterion("similarword <>", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordGreaterThan(String value) {
            addCriterion("similarword >", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordGreaterThanOrEqualTo(String value) {
            addCriterion("similarword >=", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordLessThan(String value) {
            addCriterion("similarword <", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordLessThanOrEqualTo(String value) {
            addCriterion("similarword <=", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordLike(String value) {
            addCriterion("similarword like", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordNotLike(String value) {
            addCriterion("similarword not like", value, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordIn(List<String> values) {
            addCriterion("similarword in", values, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordNotIn(List<String> values) {
            addCriterion("similarword not in", values, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordBetween(String value1, String value2) {
            addCriterion("similarword between", value1, value2, "similarword");
            return (Criteria) this;
        }

        public Criteria andSimilarwordNotBetween(String value1, String value2) {
            addCriterion("similarword not between", value1, value2, "similarword");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNull() {
            addCriterion("houseaddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNotNull() {
            addCriterion("houseaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressEqualTo(String value) {
            addCriterion("houseaddress =", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotEqualTo(String value) {
            addCriterion("houseaddress <>", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThan(String value) {
            addCriterion("houseaddress >", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddress >=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThan(String value) {
            addCriterion("houseaddress <", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThanOrEqualTo(String value) {
            addCriterion("houseaddress <=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLike(String value) {
            addCriterion("houseaddress like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotLike(String value) {
            addCriterion("houseaddress not like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIn(List<String> values) {
            addCriterion("houseaddress in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotIn(List<String> values) {
            addCriterion("houseaddress not in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressBetween(String value1, String value2) {
            addCriterion("houseaddress between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotBetween(String value1, String value2) {
            addCriterion("houseaddress not between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andMatchflagIsNull() {
            addCriterion("matchflag is null");
            return (Criteria) this;
        }

        public Criteria andMatchflagIsNotNull() {
            addCriterion("matchflag is not null");
            return (Criteria) this;
        }

        public Criteria andMatchflagEqualTo(String value) {
            addCriterion("matchflag =", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagNotEqualTo(String value) {
            addCriterion("matchflag <>", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagGreaterThan(String value) {
            addCriterion("matchflag >", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagGreaterThanOrEqualTo(String value) {
            addCriterion("matchflag >=", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagLessThan(String value) {
            addCriterion("matchflag <", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagLessThanOrEqualTo(String value) {
            addCriterion("matchflag <=", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagLike(String value) {
            addCriterion("matchflag like", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagNotLike(String value) {
            addCriterion("matchflag not like", value, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagIn(List<String> values) {
            addCriterion("matchflag in", values, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagNotIn(List<String> values) {
            addCriterion("matchflag not in", values, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagBetween(String value1, String value2) {
            addCriterion("matchflag between", value1, value2, "matchflag");
            return (Criteria) this;
        }

        public Criteria andMatchflagNotBetween(String value1, String value2) {
            addCriterion("matchflag not between", value1, value2, "matchflag");
            return (Criteria) this;
        }

        public Criteria andCommunityidIsNull() {
            addCriterion("communityid is null");
            return (Criteria) this;
        }

        public Criteria andCommunityidIsNotNull() {
            addCriterion("communityid is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityidEqualTo(String value) {
            addCriterion("communityid =", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotEqualTo(String value) {
            addCriterion("communityid <>", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidGreaterThan(String value) {
            addCriterion("communityid >", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidGreaterThanOrEqualTo(String value) {
            addCriterion("communityid >=", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidLessThan(String value) {
            addCriterion("communityid <", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidLessThanOrEqualTo(String value) {
            addCriterion("communityid <=", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidLike(String value) {
            addCriterion("communityid like", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotLike(String value) {
            addCriterion("communityid not like", value, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidIn(List<String> values) {
            addCriterion("communityid in", values, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotIn(List<String> values) {
            addCriterion("communityid not in", values, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidBetween(String value1, String value2) {
            addCriterion("communityid between", value1, value2, "communityid");
            return (Criteria) this;
        }

        public Criteria andCommunityidNotBetween(String value1, String value2) {
            addCriterion("communityid not between", value1, value2, "communityid");
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

        public Criteria andCdgtlIsNull() {
            addCriterion("cdgtl is null");
            return (Criteria) this;
        }

        public Criteria andCdgtlIsNotNull() {
            addCriterion("cdgtl is not null");
            return (Criteria) this;
        }

        public Criteria andCdgtlEqualTo(String value) {
            addCriterion("cdgtl =", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlNotEqualTo(String value) {
            addCriterion("cdgtl <>", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlGreaterThan(String value) {
            addCriterion("cdgtl >", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlGreaterThanOrEqualTo(String value) {
            addCriterion("cdgtl >=", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlLessThan(String value) {
            addCriterion("cdgtl <", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlLessThanOrEqualTo(String value) {
            addCriterion("cdgtl <=", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlLike(String value) {
            addCriterion("cdgtl like", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlNotLike(String value) {
            addCriterion("cdgtl not like", value, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlIn(List<String> values) {
            addCriterion("cdgtl in", values, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlNotIn(List<String> values) {
            addCriterion("cdgtl not in", values, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlBetween(String value1, String value2) {
            addCriterion("cdgtl between", value1, value2, "cdgtl");
            return (Criteria) this;
        }

        public Criteria andCdgtlNotBetween(String value1, String value2) {
            addCriterion("cdgtl not between", value1, value2, "cdgtl");
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