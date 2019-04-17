package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverduefollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OverduefollowExample() {
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

        public Criteria andFollowmanIsNull() {
            addCriterion("followman is null");
            return (Criteria) this;
        }

        public Criteria andFollowmanIsNotNull() {
            addCriterion("followman is not null");
            return (Criteria) this;
        }

        public Criteria andFollowmanEqualTo(String value) {
            addCriterion("followman =", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotEqualTo(String value) {
            addCriterion("followman <>", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanGreaterThan(String value) {
            addCriterion("followman >", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanGreaterThanOrEqualTo(String value) {
            addCriterion("followman >=", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanLessThan(String value) {
            addCriterion("followman <", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanLessThanOrEqualTo(String value) {
            addCriterion("followman <=", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanLike(String value) {
            addCriterion("followman like", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotLike(String value) {
            addCriterion("followman not like", value, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanIn(List<String> values) {
            addCriterion("followman in", values, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotIn(List<String> values) {
            addCriterion("followman not in", values, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanBetween(String value1, String value2) {
            addCriterion("followman between", value1, value2, "followman");
            return (Criteria) this;
        }

        public Criteria andFollowmanNotBetween(String value1, String value2) {
            addCriterion("followman not between", value1, value2, "followman");
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

        public Criteria andOverduecustIsNull() {
            addCriterion("overduecust is null");
            return (Criteria) this;
        }

        public Criteria andOverduecustIsNotNull() {
            addCriterion("overduecust is not null");
            return (Criteria) this;
        }

        public Criteria andOverduecustEqualTo(String value) {
            addCriterion("overduecust =", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustNotEqualTo(String value) {
            addCriterion("overduecust <>", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustGreaterThan(String value) {
            addCriterion("overduecust >", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustGreaterThanOrEqualTo(String value) {
            addCriterion("overduecust >=", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustLessThan(String value) {
            addCriterion("overduecust <", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustLessThanOrEqualTo(String value) {
            addCriterion("overduecust <=", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustLike(String value) {
            addCriterion("overduecust like", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustNotLike(String value) {
            addCriterion("overduecust not like", value, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustIn(List<String> values) {
            addCriterion("overduecust in", values, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustNotIn(List<String> values) {
            addCriterion("overduecust not in", values, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustBetween(String value1, String value2) {
            addCriterion("overduecust between", value1, value2, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverduecustNotBetween(String value1, String value2) {
            addCriterion("overduecust not between", value1, value2, "overduecust");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIsNull() {
            addCriterion("overdueamount is null");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIsNotNull() {
            addCriterion("overdueamount is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueamountEqualTo(BigDecimal value) {
            addCriterion("overdueamount =", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotEqualTo(BigDecimal value) {
            addCriterion("overdueamount <>", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThan(BigDecimal value) {
            addCriterion("overdueamount >", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueamount >=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThan(BigDecimal value) {
            addCriterion("overdueamount <", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overdueamount <=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIn(List<BigDecimal> values) {
            addCriterion("overdueamount in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotIn(List<BigDecimal> values) {
            addCriterion("overdueamount not in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueamount between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overdueamount not between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverduedayIsNull() {
            addCriterion("overdueday is null");
            return (Criteria) this;
        }

        public Criteria andOverduedayIsNotNull() {
            addCriterion("overdueday is not null");
            return (Criteria) this;
        }

        public Criteria andOverduedayEqualTo(String value) {
            addCriterion("overdueday =", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotEqualTo(String value) {
            addCriterion("overdueday <>", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayGreaterThan(String value) {
            addCriterion("overdueday >", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayGreaterThanOrEqualTo(String value) {
            addCriterion("overdueday >=", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayLessThan(String value) {
            addCriterion("overdueday <", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayLessThanOrEqualTo(String value) {
            addCriterion("overdueday <=", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayLike(String value) {
            addCriterion("overdueday like", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotLike(String value) {
            addCriterion("overdueday not like", value, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayIn(List<String> values) {
            addCriterion("overdueday in", values, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotIn(List<String> values) {
            addCriterion("overdueday not in", values, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayBetween(String value1, String value2) {
            addCriterion("overdueday between", value1, value2, "overdueday");
            return (Criteria) this;
        }

        public Criteria andOverduedayNotBetween(String value1, String value2) {
            addCriterion("overdueday not between", value1, value2, "overdueday");
            return (Criteria) this;
        }

        public Criteria andFollowdateIsNull() {
            addCriterion("followdate is null");
            return (Criteria) this;
        }

        public Criteria andFollowdateIsNotNull() {
            addCriterion("followdate is not null");
            return (Criteria) this;
        }

        public Criteria andFollowdateEqualTo(Date value) {
            addCriterion("followdate =", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateNotEqualTo(Date value) {
            addCriterion("followdate <>", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateGreaterThan(Date value) {
            addCriterion("followdate >", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateGreaterThanOrEqualTo(Date value) {
            addCriterion("followdate >=", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateLessThan(Date value) {
            addCriterion("followdate <", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateLessThanOrEqualTo(Date value) {
            addCriterion("followdate <=", value, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateIn(List<Date> values) {
            addCriterion("followdate in", values, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateNotIn(List<Date> values) {
            addCriterion("followdate not in", values, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateBetween(Date value1, Date value2) {
            addCriterion("followdate between", value1, value2, "followdate");
            return (Criteria) this;
        }

        public Criteria andFollowdateNotBetween(Date value1, Date value2) {
            addCriterion("followdate not between", value1, value2, "followdate");
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