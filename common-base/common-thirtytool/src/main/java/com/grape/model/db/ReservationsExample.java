package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReservationsExample() {
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

        public Criteria andReservationtimeIsNull() {
            addCriterion("reservationtime is null");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIsNotNull() {
            addCriterion("reservationtime is not null");
            return (Criteria) this;
        }

        public Criteria andReservationtimeEqualTo(Date value) {
            addCriterion("reservationtime =", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotEqualTo(Date value) {
            addCriterion("reservationtime <>", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeGreaterThan(Date value) {
            addCriterion("reservationtime >", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reservationtime >=", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeLessThan(Date value) {
            addCriterion("reservationtime <", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeLessThanOrEqualTo(Date value) {
            addCriterion("reservationtime <=", value, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeIn(List<Date> values) {
            addCriterion("reservationtime in", values, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotIn(List<Date> values) {
            addCriterion("reservationtime not in", values, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeBetween(Date value1, Date value2) {
            addCriterion("reservationtime between", value1, value2, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andReservationtimeNotBetween(Date value1, Date value2) {
            addCriterion("reservationtime not between", value1, value2, "reservationtime");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNull() {
            addCriterion("custname is null");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNotNull() {
            addCriterion("custname is not null");
            return (Criteria) this;
        }

        public Criteria andCustnameEqualTo(String value) {
            addCriterion("custname =", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotEqualTo(String value) {
            addCriterion("custname <>", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThan(String value) {
            addCriterion("custname >", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThanOrEqualTo(String value) {
            addCriterion("custname >=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThan(String value) {
            addCriterion("custname <", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThanOrEqualTo(String value) {
            addCriterion("custname <=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLike(String value) {
            addCriterion("custname like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotLike(String value) {
            addCriterion("custname not like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameIn(List<String> values) {
            addCriterion("custname in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotIn(List<String> values) {
            addCriterion("custname not in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameBetween(String value1, String value2) {
            addCriterion("custname between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotBetween(String value1, String value2) {
            addCriterion("custname not between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andReservationplaceIsNull() {
            addCriterion("reservationplace is null");
            return (Criteria) this;
        }

        public Criteria andReservationplaceIsNotNull() {
            addCriterion("reservationplace is not null");
            return (Criteria) this;
        }

        public Criteria andReservationplaceEqualTo(String value) {
            addCriterion("reservationplace =", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceNotEqualTo(String value) {
            addCriterion("reservationplace <>", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceGreaterThan(String value) {
            addCriterion("reservationplace >", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceGreaterThanOrEqualTo(String value) {
            addCriterion("reservationplace >=", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceLessThan(String value) {
            addCriterion("reservationplace <", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceLessThanOrEqualTo(String value) {
            addCriterion("reservationplace <=", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceLike(String value) {
            addCriterion("reservationplace like", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceNotLike(String value) {
            addCriterion("reservationplace not like", value, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceIn(List<String> values) {
            addCriterion("reservationplace in", values, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceNotIn(List<String> values) {
            addCriterion("reservationplace not in", values, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceBetween(String value1, String value2) {
            addCriterion("reservationplace between", value1, value2, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andReservationplaceNotBetween(String value1, String value2) {
            addCriterion("reservationplace not between", value1, value2, "reservationplace");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayIsNull() {
            addCriterion("custcontactway is null");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayIsNotNull() {
            addCriterion("custcontactway is not null");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayEqualTo(String value) {
            addCriterion("custcontactway =", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayNotEqualTo(String value) {
            addCriterion("custcontactway <>", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayGreaterThan(String value) {
            addCriterion("custcontactway >", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayGreaterThanOrEqualTo(String value) {
            addCriterion("custcontactway >=", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayLessThan(String value) {
            addCriterion("custcontactway <", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayLessThanOrEqualTo(String value) {
            addCriterion("custcontactway <=", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayLike(String value) {
            addCriterion("custcontactway like", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayNotLike(String value) {
            addCriterion("custcontactway not like", value, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayIn(List<String> values) {
            addCriterion("custcontactway in", values, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayNotIn(List<String> values) {
            addCriterion("custcontactway not in", values, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayBetween(String value1, String value2) {
            addCriterion("custcontactway between", value1, value2, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andCustcontactwayNotBetween(String value1, String value2) {
            addCriterion("custcontactway not between", value1, value2, "custcontactway");
            return (Criteria) this;
        }

        public Criteria andDueofplanformIsNull() {
            addCriterion("dueofplanform is null");
            return (Criteria) this;
        }

        public Criteria andDueofplanformIsNotNull() {
            addCriterion("dueofplanform is not null");
            return (Criteria) this;
        }

        public Criteria andDueofplanformEqualTo(String value) {
            addCriterion("dueofplanform =", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformNotEqualTo(String value) {
            addCriterion("dueofplanform <>", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformGreaterThan(String value) {
            addCriterion("dueofplanform >", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformGreaterThanOrEqualTo(String value) {
            addCriterion("dueofplanform >=", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformLessThan(String value) {
            addCriterion("dueofplanform <", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformLessThanOrEqualTo(String value) {
            addCriterion("dueofplanform <=", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformLike(String value) {
            addCriterion("dueofplanform like", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformNotLike(String value) {
            addCriterion("dueofplanform not like", value, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformIn(List<String> values) {
            addCriterion("dueofplanform in", values, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformNotIn(List<String> values) {
            addCriterion("dueofplanform not in", values, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformBetween(String value1, String value2) {
            addCriterion("dueofplanform between", value1, value2, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andDueofplanformNotBetween(String value1, String value2) {
            addCriterion("dueofplanform not between", value1, value2, "dueofplanform");
            return (Criteria) this;
        }

        public Criteria andChanassistantIsNull() {
            addCriterion("chanassistant is null");
            return (Criteria) this;
        }

        public Criteria andChanassistantIsNotNull() {
            addCriterion("chanassistant is not null");
            return (Criteria) this;
        }

        public Criteria andChanassistantEqualTo(String value) {
            addCriterion("chanassistant =", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantNotEqualTo(String value) {
            addCriterion("chanassistant <>", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantGreaterThan(String value) {
            addCriterion("chanassistant >", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantGreaterThanOrEqualTo(String value) {
            addCriterion("chanassistant >=", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantLessThan(String value) {
            addCriterion("chanassistant <", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantLessThanOrEqualTo(String value) {
            addCriterion("chanassistant <=", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantLike(String value) {
            addCriterion("chanassistant like", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantNotLike(String value) {
            addCriterion("chanassistant not like", value, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantIn(List<String> values) {
            addCriterion("chanassistant in", values, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantNotIn(List<String> values) {
            addCriterion("chanassistant not in", values, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantBetween(String value1, String value2) {
            addCriterion("chanassistant between", value1, value2, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andChanassistantNotBetween(String value1, String value2) {
            addCriterion("chanassistant not between", value1, value2, "chanassistant");
            return (Criteria) this;
        }

        public Criteria andRelationworkidIsNull() {
            addCriterion("relationworkid is null");
            return (Criteria) this;
        }

        public Criteria andRelationworkidIsNotNull() {
            addCriterion("relationworkid is not null");
            return (Criteria) this;
        }

        public Criteria andRelationworkidEqualTo(String value) {
            addCriterion("relationworkid =", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidNotEqualTo(String value) {
            addCriterion("relationworkid <>", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidGreaterThan(String value) {
            addCriterion("relationworkid >", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidGreaterThanOrEqualTo(String value) {
            addCriterion("relationworkid >=", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidLessThan(String value) {
            addCriterion("relationworkid <", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidLessThanOrEqualTo(String value) {
            addCriterion("relationworkid <=", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidLike(String value) {
            addCriterion("relationworkid like", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidNotLike(String value) {
            addCriterion("relationworkid not like", value, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidIn(List<String> values) {
            addCriterion("relationworkid in", values, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidNotIn(List<String> values) {
            addCriterion("relationworkid not in", values, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidBetween(String value1, String value2) {
            addCriterion("relationworkid between", value1, value2, "relationworkid");
            return (Criteria) this;
        }

        public Criteria andRelationworkidNotBetween(String value1, String value2) {
            addCriterion("relationworkid not between", value1, value2, "relationworkid");
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