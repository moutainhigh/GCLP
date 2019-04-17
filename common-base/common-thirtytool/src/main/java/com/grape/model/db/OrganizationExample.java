package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOrganizationnameIsNull() {
            addCriterion("organizationname is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNotNull() {
            addCriterion("organizationname is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameEqualTo(String value) {
            addCriterion("organizationname =", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotEqualTo(String value) {
            addCriterion("organizationname <>", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThan(String value) {
            addCriterion("organizationname >", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThanOrEqualTo(String value) {
            addCriterion("organizationname >=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThan(String value) {
            addCriterion("organizationname <", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThanOrEqualTo(String value) {
            addCriterion("organizationname <=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLike(String value) {
            addCriterion("organizationname like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotLike(String value) {
            addCriterion("organizationname not like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIn(List<String> values) {
            addCriterion("organizationname in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotIn(List<String> values) {
            addCriterion("organizationname not in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameBetween(String value1, String value2) {
            addCriterion("organizationname between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotBetween(String value1, String value2) {
            addCriterion("organizationname not between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoIsNull() {
            addCriterion("orgbelongsto is null");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoIsNotNull() {
            addCriterion("orgbelongsto is not null");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoEqualTo(String value) {
            addCriterion("orgbelongsto =", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoNotEqualTo(String value) {
            addCriterion("orgbelongsto <>", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoGreaterThan(String value) {
            addCriterion("orgbelongsto >", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoGreaterThanOrEqualTo(String value) {
            addCriterion("orgbelongsto >=", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoLessThan(String value) {
            addCriterion("orgbelongsto <", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoLessThanOrEqualTo(String value) {
            addCriterion("orgbelongsto <=", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoLike(String value) {
            addCriterion("orgbelongsto like", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoNotLike(String value) {
            addCriterion("orgbelongsto not like", value, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoIn(List<String> values) {
            addCriterion("orgbelongsto in", values, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoNotIn(List<String> values) {
            addCriterion("orgbelongsto not in", values, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoBetween(String value1, String value2) {
            addCriterion("orgbelongsto between", value1, value2, "orgbelongsto");
            return (Criteria) this;
        }

        public Criteria andOrgbelongstoNotBetween(String value1, String value2) {
            addCriterion("orgbelongsto not between", value1, value2, "orgbelongsto");
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

        public Criteria andOrganizationcodeIsNull() {
            addCriterion("organizationcode is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNotNull() {
            addCriterion("organizationcode is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeEqualTo(String value) {
            addCriterion("organizationcode =", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotEqualTo(String value) {
            addCriterion("organizationcode <>", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThan(String value) {
            addCriterion("organizationcode >", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("organizationcode >=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThan(String value) {
            addCriterion("organizationcode <", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThanOrEqualTo(String value) {
            addCriterion("organizationcode <=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLike(String value) {
            addCriterion("organizationcode like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotLike(String value) {
            addCriterion("organizationcode not like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIn(List<String> values) {
            addCriterion("organizationcode in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotIn(List<String> values) {
            addCriterion("organizationcode not in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeBetween(String value1, String value2) {
            addCriterion("organizationcode between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotBetween(String value1, String value2) {
            addCriterion("organizationcode not between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrgleavelIsNull() {
            addCriterion("orgleavel is null");
            return (Criteria) this;
        }

        public Criteria andOrgleavelIsNotNull() {
            addCriterion("orgleavel is not null");
            return (Criteria) this;
        }

        public Criteria andOrgleavelEqualTo(String value) {
            addCriterion("orgleavel =", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelNotEqualTo(String value) {
            addCriterion("orgleavel <>", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelGreaterThan(String value) {
            addCriterion("orgleavel >", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelGreaterThanOrEqualTo(String value) {
            addCriterion("orgleavel >=", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelLessThan(String value) {
            addCriterion("orgleavel <", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelLessThanOrEqualTo(String value) {
            addCriterion("orgleavel <=", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelLike(String value) {
            addCriterion("orgleavel like", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelNotLike(String value) {
            addCriterion("orgleavel not like", value, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelIn(List<String> values) {
            addCriterion("orgleavel in", values, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelNotIn(List<String> values) {
            addCriterion("orgleavel not in", values, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelBetween(String value1, String value2) {
            addCriterion("orgleavel between", value1, value2, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgleavelNotBetween(String value1, String value2) {
            addCriterion("orgleavel not between", value1, value2, "orgleavel");
            return (Criteria) this;
        }

        public Criteria andOrgofchIsNull() {
            addCriterion("orgofch is null");
            return (Criteria) this;
        }

        public Criteria andOrgofchIsNotNull() {
            addCriterion("orgofch is not null");
            return (Criteria) this;
        }

        public Criteria andOrgofchEqualTo(String value) {
            addCriterion("orgofch =", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchNotEqualTo(String value) {
            addCriterion("orgofch <>", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchGreaterThan(String value) {
            addCriterion("orgofch >", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchGreaterThanOrEqualTo(String value) {
            addCriterion("orgofch >=", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchLessThan(String value) {
            addCriterion("orgofch <", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchLessThanOrEqualTo(String value) {
            addCriterion("orgofch <=", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchLike(String value) {
            addCriterion("orgofch like", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchNotLike(String value) {
            addCriterion("orgofch not like", value, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchIn(List<String> values) {
            addCriterion("orgofch in", values, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchNotIn(List<String> values) {
            addCriterion("orgofch not in", values, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchBetween(String value1, String value2) {
            addCriterion("orgofch between", value1, value2, "orgofch");
            return (Criteria) this;
        }

        public Criteria andOrgofchNotBetween(String value1, String value2) {
            addCriterion("orgofch not between", value1, value2, "orgofch");
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