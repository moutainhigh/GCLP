package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIsNull() {
            addCriterion("departmentno is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIsNotNull() {
            addCriterion("departmentno is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoEqualTo(String value) {
            addCriterion("departmentno =", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotEqualTo(String value) {
            addCriterion("departmentno <>", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoGreaterThan(String value) {
            addCriterion("departmentno >", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoGreaterThanOrEqualTo(String value) {
            addCriterion("departmentno >=", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLessThan(String value) {
            addCriterion("departmentno <", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLessThanOrEqualTo(String value) {
            addCriterion("departmentno <=", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoLike(String value) {
            addCriterion("departmentno like", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotLike(String value) {
            addCriterion("departmentno not like", value, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoIn(List<String> values) {
            addCriterion("departmentno in", values, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotIn(List<String> values) {
            addCriterion("departmentno not in", values, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoBetween(String value1, String value2) {
            addCriterion("departmentno between", value1, value2, "departmentno");
            return (Criteria) this;
        }

        public Criteria andDepartmentnoNotBetween(String value1, String value2) {
            addCriterion("departmentno not between", value1, value2, "departmentno");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andDepartmentcodeIsNull() {
            addCriterion("departmentcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIsNotNull() {
            addCriterion("departmentcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeEqualTo(String value) {
            addCriterion("departmentcode =", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotEqualTo(String value) {
            addCriterion("departmentcode <>", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThan(String value) {
            addCriterion("departmentcode >", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentcode >=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThan(String value) {
            addCriterion("departmentcode <", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLessThanOrEqualTo(String value) {
            addCriterion("departmentcode <=", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeLike(String value) {
            addCriterion("departmentcode like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotLike(String value) {
            addCriterion("departmentcode not like", value, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeIn(List<String> values) {
            addCriterion("departmentcode in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotIn(List<String> values) {
            addCriterion("departmentcode not in", values, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeBetween(String value1, String value2) {
            addCriterion("departmentcode between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentcodeNotBetween(String value1, String value2) {
            addCriterion("departmentcode not between", value1, value2, "departmentcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvIsNull() {
            addCriterion("departmentlv is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvIsNotNull() {
            addCriterion("departmentlv is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvEqualTo(String value) {
            addCriterion("departmentlv =", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvNotEqualTo(String value) {
            addCriterion("departmentlv <>", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvGreaterThan(String value) {
            addCriterion("departmentlv >", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvGreaterThanOrEqualTo(String value) {
            addCriterion("departmentlv >=", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvLessThan(String value) {
            addCriterion("departmentlv <", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvLessThanOrEqualTo(String value) {
            addCriterion("departmentlv <=", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvLike(String value) {
            addCriterion("departmentlv like", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvNotLike(String value) {
            addCriterion("departmentlv not like", value, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvIn(List<String> values) {
            addCriterion("departmentlv in", values, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvNotIn(List<String> values) {
            addCriterion("departmentlv not in", values, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvBetween(String value1, String value2) {
            addCriterion("departmentlv between", value1, value2, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentlvNotBetween(String value1, String value2) {
            addCriterion("departmentlv not between", value1, value2, "departmentlv");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentname is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentname =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentname <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentname >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentname >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentname <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentname <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentname like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentname not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentname in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentname not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentname between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentname not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoIsNull() {
            addCriterion("depbelongsto is null");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoIsNotNull() {
            addCriterion("depbelongsto is not null");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoEqualTo(String value) {
            addCriterion("depbelongsto =", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoNotEqualTo(String value) {
            addCriterion("depbelongsto <>", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoGreaterThan(String value) {
            addCriterion("depbelongsto >", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoGreaterThanOrEqualTo(String value) {
            addCriterion("depbelongsto >=", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoLessThan(String value) {
            addCriterion("depbelongsto <", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoLessThanOrEqualTo(String value) {
            addCriterion("depbelongsto <=", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoLike(String value) {
            addCriterion("depbelongsto like", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoNotLike(String value) {
            addCriterion("depbelongsto not like", value, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoIn(List<String> values) {
            addCriterion("depbelongsto in", values, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoNotIn(List<String> values) {
            addCriterion("depbelongsto not in", values, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoBetween(String value1, String value2) {
            addCriterion("depbelongsto between", value1, value2, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andDepbelongstoNotBetween(String value1, String value2) {
            addCriterion("depbelongsto not between", value1, value2, "depbelongsto");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoIsNull() {
            addCriterion("hidepartmentno is null");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoIsNotNull() {
            addCriterion("hidepartmentno is not null");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoEqualTo(String value) {
            addCriterion("hidepartmentno =", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoNotEqualTo(String value) {
            addCriterion("hidepartmentno <>", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoGreaterThan(String value) {
            addCriterion("hidepartmentno >", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoGreaterThanOrEqualTo(String value) {
            addCriterion("hidepartmentno >=", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoLessThan(String value) {
            addCriterion("hidepartmentno <", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoLessThanOrEqualTo(String value) {
            addCriterion("hidepartmentno <=", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoLike(String value) {
            addCriterion("hidepartmentno like", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoNotLike(String value) {
            addCriterion("hidepartmentno not like", value, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoIn(List<String> values) {
            addCriterion("hidepartmentno in", values, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoNotIn(List<String> values) {
            addCriterion("hidepartmentno not in", values, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoBetween(String value1, String value2) {
            addCriterion("hidepartmentno between", value1, value2, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andHidepartmentnoNotBetween(String value1, String value2) {
            addCriterion("hidepartmentno not between", value1, value2, "hidepartmentno");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoIsNull() {
            addCriterion("organizationno is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoIsNotNull() {
            addCriterion("organizationno is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoEqualTo(String value) {
            addCriterion("organizationno =", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotEqualTo(String value) {
            addCriterion("organizationno <>", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoGreaterThan(String value) {
            addCriterion("organizationno >", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoGreaterThanOrEqualTo(String value) {
            addCriterion("organizationno >=", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoLessThan(String value) {
            addCriterion("organizationno <", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoLessThanOrEqualTo(String value) {
            addCriterion("organizationno <=", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoLike(String value) {
            addCriterion("organizationno like", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotLike(String value) {
            addCriterion("organizationno not like", value, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoIn(List<String> values) {
            addCriterion("organizationno in", values, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotIn(List<String> values) {
            addCriterion("organizationno not in", values, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoBetween(String value1, String value2) {
            addCriterion("organizationno between", value1, value2, "organizationno");
            return (Criteria) this;
        }

        public Criteria andOrganizationnoNotBetween(String value1, String value2) {
            addCriterion("organizationno not between", value1, value2, "organizationno");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNull() {
            addCriterion("telnumber is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("telnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("telnumber =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("telnumber <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("telnumber >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("telnumber >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("telnumber <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("telnumber <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("telnumber like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("telnumber not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("telnumber in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("telnumber not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("telnumber between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("telnumber not between", value1, value2, "telnumber");
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