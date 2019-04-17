package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AssessmodelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessmodelExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineIsNull() {
            addCriterion("float_online is null");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineIsNotNull() {
            addCriterion("float_online is not null");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineEqualTo(Float value) {
            addCriterion("float_online =", value, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineNotEqualTo(Float value) {
            addCriterion("float_online <>", value, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineGreaterThan(Float value) {
            addCriterion("float_online >", value, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineGreaterThanOrEqualTo(Float value) {
            addCriterion("float_online >=", value, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineLessThan(Float value) {
            addCriterion("float_online <", value, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineLessThanOrEqualTo(Float value) {
            addCriterion("float_online <=", value, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineIn(List<Float> values) {
            addCriterion("float_online in", values, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineNotIn(List<Float> values) {
            addCriterion("float_online not in", values, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineBetween(Float value1, Float value2) {
            addCriterion("float_online between", value1, value2, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andFloatOnlineNotBetween(Float value1, Float value2) {
            addCriterion("float_online not between", value1, value2, "floatOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineIsNull() {
            addCriterion("tonevalue_online is null");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineIsNotNull() {
            addCriterion("tonevalue_online is not null");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineEqualTo(BigDecimal value) {
            addCriterion("tonevalue_online =", value, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineNotEqualTo(BigDecimal value) {
            addCriterion("tonevalue_online <>", value, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineGreaterThan(BigDecimal value) {
            addCriterion("tonevalue_online >", value, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tonevalue_online >=", value, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineLessThan(BigDecimal value) {
            addCriterion("tonevalue_online <", value, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tonevalue_online <=", value, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineIn(List<BigDecimal> values) {
            addCriterion("tonevalue_online in", values, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineNotIn(List<BigDecimal> values) {
            addCriterion("tonevalue_online not in", values, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonevalue_online between", value1, value2, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andTonevalueOnlineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonevalue_online not between", value1, value2, "tonevalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineIsNull() {
            addCriterion("lowervalue_online is null");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineIsNotNull() {
            addCriterion("lowervalue_online is not null");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineEqualTo(BigDecimal value) {
            addCriterion("lowervalue_online =", value, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineNotEqualTo(BigDecimal value) {
            addCriterion("lowervalue_online <>", value, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineGreaterThan(BigDecimal value) {
            addCriterion("lowervalue_online >", value, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowervalue_online >=", value, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineLessThan(BigDecimal value) {
            addCriterion("lowervalue_online <", value, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowervalue_online <=", value, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineIn(List<BigDecimal> values) {
            addCriterion("lowervalue_online in", values, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineNotIn(List<BigDecimal> values) {
            addCriterion("lowervalue_online not in", values, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowervalue_online between", value1, value2, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andLowervalueOnlineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowervalue_online not between", value1, value2, "lowervalueOnline");
            return (Criteria) this;
        }

        public Criteria andFloatBngIsNull() {
            addCriterion("float_bng is null");
            return (Criteria) this;
        }

        public Criteria andFloatBngIsNotNull() {
            addCriterion("float_bng is not null");
            return (Criteria) this;
        }

        public Criteria andFloatBngEqualTo(Float value) {
            addCriterion("float_bng =", value, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngNotEqualTo(Float value) {
            addCriterion("float_bng <>", value, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngGreaterThan(Float value) {
            addCriterion("float_bng >", value, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngGreaterThanOrEqualTo(Float value) {
            addCriterion("float_bng >=", value, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngLessThan(Float value) {
            addCriterion("float_bng <", value, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngLessThanOrEqualTo(Float value) {
            addCriterion("float_bng <=", value, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngIn(List<Float> values) {
            addCriterion("float_bng in", values, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngNotIn(List<Float> values) {
            addCriterion("float_bng not in", values, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngBetween(Float value1, Float value2) {
            addCriterion("float_bng between", value1, value2, "floatBng");
            return (Criteria) this;
        }

        public Criteria andFloatBngNotBetween(Float value1, Float value2) {
            addCriterion("float_bng not between", value1, value2, "floatBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngIsNull() {
            addCriterion("tonevalue_bng is null");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngIsNotNull() {
            addCriterion("tonevalue_bng is not null");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngEqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng =", value, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngNotEqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng <>", value, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngGreaterThan(BigDecimal value) {
            addCriterion("tonevalue_bng >", value, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng >=", value, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngLessThan(BigDecimal value) {
            addCriterion("tonevalue_bng <", value, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng <=", value, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngIn(List<BigDecimal> values) {
            addCriterion("tonevalue_bng in", values, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngNotIn(List<BigDecimal> values) {
            addCriterion("tonevalue_bng not in", values, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonevalue_bng between", value1, value2, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonevalue_bng not between", value1, value2, "tonevalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngIsNull() {
            addCriterion("lowervalue_bng is null");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngIsNotNull() {
            addCriterion("lowervalue_bng is not null");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngEqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng =", value, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngNotEqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng <>", value, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngGreaterThan(BigDecimal value) {
            addCriterion("lowervalue_bng >", value, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng >=", value, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngLessThan(BigDecimal value) {
            addCriterion("lowervalue_bng <", value, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng <=", value, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngIn(List<BigDecimal> values) {
            addCriterion("lowervalue_bng in", values, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngNotIn(List<BigDecimal> values) {
            addCriterion("lowervalue_bng not in", values, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowervalue_bng between", value1, value2, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andLowervalueBngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowervalue_bng not between", value1, value2, "lowervalueBng");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2IsNull() {
            addCriterion("tonevalue_bng2 is null");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2IsNotNull() {
            addCriterion("tonevalue_bng2 is not null");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2EqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng2 =", value, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2NotEqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng2 <>", value, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2GreaterThan(BigDecimal value) {
            addCriterion("tonevalue_bng2 >", value, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng2 >=", value, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2LessThan(BigDecimal value) {
            addCriterion("tonevalue_bng2 <", value, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("tonevalue_bng2 <=", value, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2In(List<BigDecimal> values) {
            addCriterion("tonevalue_bng2 in", values, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2NotIn(List<BigDecimal> values) {
            addCriterion("tonevalue_bng2 not in", values, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonevalue_bng2 between", value1, value2, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andTonevalueBng2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonevalue_bng2 not between", value1, value2, "tonevalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2IsNull() {
            addCriterion("lowervalue_bng2 is null");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2IsNotNull() {
            addCriterion("lowervalue_bng2 is not null");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2EqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng2 =", value, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2NotEqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng2 <>", value, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2GreaterThan(BigDecimal value) {
            addCriterion("lowervalue_bng2 >", value, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng2 >=", value, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2LessThan(BigDecimal value) {
            addCriterion("lowervalue_bng2 <", value, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowervalue_bng2 <=", value, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2In(List<BigDecimal> values) {
            addCriterion("lowervalue_bng2 in", values, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2NotIn(List<BigDecimal> values) {
            addCriterion("lowervalue_bng2 not in", values, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowervalue_bng2 between", value1, value2, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andLowervalueBng2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowervalue_bng2 not between", value1, value2, "lowervalueBng2");
            return (Criteria) this;
        }

        public Criteria andFloatCnoIsNull() {
            addCriterion("float_cno is null");
            return (Criteria) this;
        }

        public Criteria andFloatCnoIsNotNull() {
            addCriterion("float_cno is not null");
            return (Criteria) this;
        }

        public Criteria andFloatCnoEqualTo(Float value) {
            addCriterion("float_cno =", value, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoNotEqualTo(Float value) {
            addCriterion("float_cno <>", value, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoGreaterThan(Float value) {
            addCriterion("float_cno >", value, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoGreaterThanOrEqualTo(Float value) {
            addCriterion("float_cno >=", value, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoLessThan(Float value) {
            addCriterion("float_cno <", value, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoLessThanOrEqualTo(Float value) {
            addCriterion("float_cno <=", value, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoIn(List<Float> values) {
            addCriterion("float_cno in", values, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoNotIn(List<Float> values) {
            addCriterion("float_cno not in", values, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoBetween(Float value1, Float value2) {
            addCriterion("float_cno between", value1, value2, "floatCno");
            return (Criteria) this;
        }

        public Criteria andFloatCnoNotBetween(Float value1, Float value2) {
            addCriterion("float_cno not between", value1, value2, "floatCno");
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