package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgtemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgtemplateExample() {
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

        public Criteria andTemplatenoIsNull() {
            addCriterion("templateno is null");
            return (Criteria) this;
        }

        public Criteria andTemplatenoIsNotNull() {
            addCriterion("templateno is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatenoEqualTo(String value) {
            addCriterion("templateno =", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoNotEqualTo(String value) {
            addCriterion("templateno <>", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoGreaterThan(String value) {
            addCriterion("templateno >", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoGreaterThanOrEqualTo(String value) {
            addCriterion("templateno >=", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoLessThan(String value) {
            addCriterion("templateno <", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoLessThanOrEqualTo(String value) {
            addCriterion("templateno <=", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoLike(String value) {
            addCriterion("templateno like", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoNotLike(String value) {
            addCriterion("templateno not like", value, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoIn(List<String> values) {
            addCriterion("templateno in", values, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoNotIn(List<String> values) {
            addCriterion("templateno not in", values, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoBetween(String value1, String value2) {
            addCriterion("templateno between", value1, value2, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatenoNotBetween(String value1, String value2) {
            addCriterion("templateno not between", value1, value2, "templateno");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentIsNull() {
            addCriterion("templatecontent is null");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentIsNotNull() {
            addCriterion("templatecontent is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentEqualTo(String value) {
            addCriterion("templatecontent =", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentNotEqualTo(String value) {
            addCriterion("templatecontent <>", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentGreaterThan(String value) {
            addCriterion("templatecontent >", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentGreaterThanOrEqualTo(String value) {
            addCriterion("templatecontent >=", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentLessThan(String value) {
            addCriterion("templatecontent <", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentLessThanOrEqualTo(String value) {
            addCriterion("templatecontent <=", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentLike(String value) {
            addCriterion("templatecontent like", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentNotLike(String value) {
            addCriterion("templatecontent not like", value, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentIn(List<String> values) {
            addCriterion("templatecontent in", values, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentNotIn(List<String> values) {
            addCriterion("templatecontent not in", values, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentBetween(String value1, String value2) {
            addCriterion("templatecontent between", value1, value2, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatecontentNotBetween(String value1, String value2) {
            addCriterion("templatecontent not between", value1, value2, "templatecontent");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIsNull() {
            addCriterion("templatename is null");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIsNotNull() {
            addCriterion("templatename is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatenameEqualTo(String value) {
            addCriterion("templatename =", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotEqualTo(String value) {
            addCriterion("templatename <>", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameGreaterThan(String value) {
            addCriterion("templatename >", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameGreaterThanOrEqualTo(String value) {
            addCriterion("templatename >=", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLessThan(String value) {
            addCriterion("templatename <", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLessThanOrEqualTo(String value) {
            addCriterion("templatename <=", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameLike(String value) {
            addCriterion("templatename like", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotLike(String value) {
            addCriterion("templatename not like", value, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameIn(List<String> values) {
            addCriterion("templatename in", values, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotIn(List<String> values) {
            addCriterion("templatename not in", values, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameBetween(String value1, String value2) {
            addCriterion("templatename between", value1, value2, "templatename");
            return (Criteria) this;
        }

        public Criteria andTemplatenameNotBetween(String value1, String value2) {
            addCriterion("templatename not between", value1, value2, "templatename");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIsNull() {
            addCriterion("noticetype is null");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIsNotNull() {
            addCriterion("noticetype is not null");
            return (Criteria) this;
        }

        public Criteria andNoticetypeEqualTo(String value) {
            addCriterion("noticetype =", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeNotEqualTo(String value) {
            addCriterion("noticetype <>", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeGreaterThan(String value) {
            addCriterion("noticetype >", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeGreaterThanOrEqualTo(String value) {
            addCriterion("noticetype >=", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeLessThan(String value) {
            addCriterion("noticetype <", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeLessThanOrEqualTo(String value) {
            addCriterion("noticetype <=", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeLike(String value) {
            addCriterion("noticetype like", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeNotLike(String value) {
            addCriterion("noticetype not like", value, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeIn(List<String> values) {
            addCriterion("noticetype in", values, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeNotIn(List<String> values) {
            addCriterion("noticetype not in", values, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeBetween(String value1, String value2) {
            addCriterion("noticetype between", value1, value2, "noticetype");
            return (Criteria) this;
        }

        public Criteria andNoticetypeNotBetween(String value1, String value2) {
            addCriterion("noticetype not between", value1, value2, "noticetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeIsNull() {
            addCriterion("templatetype is null");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeIsNotNull() {
            addCriterion("templatetype is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeEqualTo(String value) {
            addCriterion("templatetype =", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeNotEqualTo(String value) {
            addCriterion("templatetype <>", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeGreaterThan(String value) {
            addCriterion("templatetype >", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("templatetype >=", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeLessThan(String value) {
            addCriterion("templatetype <", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeLessThanOrEqualTo(String value) {
            addCriterion("templatetype <=", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeLike(String value) {
            addCriterion("templatetype like", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeNotLike(String value) {
            addCriterion("templatetype not like", value, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeIn(List<String> values) {
            addCriterion("templatetype in", values, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeNotIn(List<String> values) {
            addCriterion("templatetype not in", values, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeBetween(String value1, String value2) {
            addCriterion("templatetype between", value1, value2, "templatetype");
            return (Criteria) this;
        }

        public Criteria andTemplatetypeNotBetween(String value1, String value2) {
            addCriterion("templatetype not between", value1, value2, "templatetype");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIsNull() {
            addCriterion("removeflg is null");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIsNotNull() {
            addCriterion("removeflg is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveflgEqualTo(String value) {
            addCriterion("removeflg =", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotEqualTo(String value) {
            addCriterion("removeflg <>", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgGreaterThan(String value) {
            addCriterion("removeflg >", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgGreaterThanOrEqualTo(String value) {
            addCriterion("removeflg >=", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLessThan(String value) {
            addCriterion("removeflg <", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLessThanOrEqualTo(String value) {
            addCriterion("removeflg <=", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgLike(String value) {
            addCriterion("removeflg like", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotLike(String value) {
            addCriterion("removeflg not like", value, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgIn(List<String> values) {
            addCriterion("removeflg in", values, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotIn(List<String> values) {
            addCriterion("removeflg not in", values, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgBetween(String value1, String value2) {
            addCriterion("removeflg between", value1, value2, "removeflg");
            return (Criteria) this;
        }

        public Criteria andRemoveflgNotBetween(String value1, String value2) {
            addCriterion("removeflg not between", value1, value2, "removeflg");
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