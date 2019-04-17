package com.grape.model.db;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andPltipIsNull() {
            addCriterion("pltip is null");
            return (Criteria) this;
        }

        public Criteria andPltipIsNotNull() {
            addCriterion("pltip is not null");
            return (Criteria) this;
        }

        public Criteria andPltipEqualTo(String value) {
            addCriterion("pltip =", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipNotEqualTo(String value) {
            addCriterion("pltip <>", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipGreaterThan(String value) {
            addCriterion("pltip >", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipGreaterThanOrEqualTo(String value) {
            addCriterion("pltip >=", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipLessThan(String value) {
            addCriterion("pltip <", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipLessThanOrEqualTo(String value) {
            addCriterion("pltip <=", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipLike(String value) {
            addCriterion("pltip like", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipNotLike(String value) {
            addCriterion("pltip not like", value, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipIn(List<String> values) {
            addCriterion("pltip in", values, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipNotIn(List<String> values) {
            addCriterion("pltip not in", values, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipBetween(String value1, String value2) {
            addCriterion("pltip between", value1, value2, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltipNotBetween(String value1, String value2) {
            addCriterion("pltip not between", value1, value2, "pltip");
            return (Criteria) this;
        }

        public Criteria andPltportIsNull() {
            addCriterion("pltport is null");
            return (Criteria) this;
        }

        public Criteria andPltportIsNotNull() {
            addCriterion("pltport is not null");
            return (Criteria) this;
        }

        public Criteria andPltportEqualTo(String value) {
            addCriterion("pltport =", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportNotEqualTo(String value) {
            addCriterion("pltport <>", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportGreaterThan(String value) {
            addCriterion("pltport >", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportGreaterThanOrEqualTo(String value) {
            addCriterion("pltport >=", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportLessThan(String value) {
            addCriterion("pltport <", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportLessThanOrEqualTo(String value) {
            addCriterion("pltport <=", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportLike(String value) {
            addCriterion("pltport like", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportNotLike(String value) {
            addCriterion("pltport not like", value, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportIn(List<String> values) {
            addCriterion("pltport in", values, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportNotIn(List<String> values) {
            addCriterion("pltport not in", values, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportBetween(String value1, String value2) {
            addCriterion("pltport between", value1, value2, "pltport");
            return (Criteria) this;
        }

        public Criteria andPltportNotBetween(String value1, String value2) {
            addCriterion("pltport not between", value1, value2, "pltport");
            return (Criteria) this;
        }

        public Criteria andMcuuserIsNull() {
            addCriterion("mcuuser is null");
            return (Criteria) this;
        }

        public Criteria andMcuuserIsNotNull() {
            addCriterion("mcuuser is not null");
            return (Criteria) this;
        }

        public Criteria andMcuuserEqualTo(String value) {
            addCriterion("mcuuser =", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserNotEqualTo(String value) {
            addCriterion("mcuuser <>", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserGreaterThan(String value) {
            addCriterion("mcuuser >", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserGreaterThanOrEqualTo(String value) {
            addCriterion("mcuuser >=", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserLessThan(String value) {
            addCriterion("mcuuser <", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserLessThanOrEqualTo(String value) {
            addCriterion("mcuuser <=", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserLike(String value) {
            addCriterion("mcuuser like", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserNotLike(String value) {
            addCriterion("mcuuser not like", value, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserIn(List<String> values) {
            addCriterion("mcuuser in", values, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserNotIn(List<String> values) {
            addCriterion("mcuuser not in", values, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserBetween(String value1, String value2) {
            addCriterion("mcuuser between", value1, value2, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcuuserNotBetween(String value1, String value2) {
            addCriterion("mcuuser not between", value1, value2, "mcuuser");
            return (Criteria) this;
        }

        public Criteria andMcupwdIsNull() {
            addCriterion("mcupwd is null");
            return (Criteria) this;
        }

        public Criteria andMcupwdIsNotNull() {
            addCriterion("mcupwd is not null");
            return (Criteria) this;
        }

        public Criteria andMcupwdEqualTo(String value) {
            addCriterion("mcupwd =", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdNotEqualTo(String value) {
            addCriterion("mcupwd <>", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdGreaterThan(String value) {
            addCriterion("mcupwd >", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdGreaterThanOrEqualTo(String value) {
            addCriterion("mcupwd >=", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdLessThan(String value) {
            addCriterion("mcupwd <", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdLessThanOrEqualTo(String value) {
            addCriterion("mcupwd <=", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdLike(String value) {
            addCriterion("mcupwd like", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdNotLike(String value) {
            addCriterion("mcupwd not like", value, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdIn(List<String> values) {
            addCriterion("mcupwd in", values, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdNotIn(List<String> values) {
            addCriterion("mcupwd not in", values, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdBetween(String value1, String value2) {
            addCriterion("mcupwd between", value1, value2, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andMcupwdNotBetween(String value1, String value2) {
            addCriterion("mcupwd not between", value1, value2, "mcupwd");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceid is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceid is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("deviceid =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("deviceid <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("deviceid >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceid >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("deviceid <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("deviceid <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("deviceid like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("deviceid not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("deviceid in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("deviceid not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("deviceid between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("deviceid not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andSrcIsNull() {
            addCriterion("src is null");
            return (Criteria) this;
        }

        public Criteria andSrcIsNotNull() {
            addCriterion("src is not null");
            return (Criteria) this;
        }

        public Criteria andSrcEqualTo(String value) {
            addCriterion("src =", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotEqualTo(String value) {
            addCriterion("src <>", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThan(String value) {
            addCriterion("src >", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThanOrEqualTo(String value) {
            addCriterion("src >=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThan(String value) {
            addCriterion("src <", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThanOrEqualTo(String value) {
            addCriterion("src <=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLike(String value) {
            addCriterion("src like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotLike(String value) {
            addCriterion("src not like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcIn(List<String> values) {
            addCriterion("src in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotIn(List<String> values) {
            addCriterion("src not in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcBetween(String value1, String value2) {
            addCriterion("src between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotBetween(String value1, String value2) {
            addCriterion("src not between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andChanIsNull() {
            addCriterion("chan is null");
            return (Criteria) this;
        }

        public Criteria andChanIsNotNull() {
            addCriterion("chan is not null");
            return (Criteria) this;
        }

        public Criteria andChanEqualTo(String value) {
            addCriterion("chan =", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanNotEqualTo(String value) {
            addCriterion("chan <>", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanGreaterThan(String value) {
            addCriterion("chan >", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanGreaterThanOrEqualTo(String value) {
            addCriterion("chan >=", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanLessThan(String value) {
            addCriterion("chan <", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanLessThanOrEqualTo(String value) {
            addCriterion("chan <=", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanLike(String value) {
            addCriterion("chan like", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanNotLike(String value) {
            addCriterion("chan not like", value, "chan");
            return (Criteria) this;
        }

        public Criteria andChanIn(List<String> values) {
            addCriterion("chan in", values, "chan");
            return (Criteria) this;
        }

        public Criteria andChanNotIn(List<String> values) {
            addCriterion("chan not in", values, "chan");
            return (Criteria) this;
        }

        public Criteria andChanBetween(String value1, String value2) {
            addCriterion("chan between", value1, value2, "chan");
            return (Criteria) this;
        }

        public Criteria andChanNotBetween(String value1, String value2) {
            addCriterion("chan not between", value1, value2, "chan");
            return (Criteria) this;
        }

        public Criteria andManuIsNull() {
            addCriterion("manu is null");
            return (Criteria) this;
        }

        public Criteria andManuIsNotNull() {
            addCriterion("manu is not null");
            return (Criteria) this;
        }

        public Criteria andManuEqualTo(String value) {
            addCriterion("manu =", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotEqualTo(String value) {
            addCriterion("manu <>", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuGreaterThan(String value) {
            addCriterion("manu >", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuGreaterThanOrEqualTo(String value) {
            addCriterion("manu >=", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuLessThan(String value) {
            addCriterion("manu <", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuLessThanOrEqualTo(String value) {
            addCriterion("manu <=", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuLike(String value) {
            addCriterion("manu like", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotLike(String value) {
            addCriterion("manu not like", value, "manu");
            return (Criteria) this;
        }

        public Criteria andManuIn(List<String> values) {
            addCriterion("manu in", values, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotIn(List<String> values) {
            addCriterion("manu not in", values, "manu");
            return (Criteria) this;
        }

        public Criteria andManuBetween(String value1, String value2) {
            addCriterion("manu between", value1, value2, "manu");
            return (Criteria) this;
        }

        public Criteria andManuNotBetween(String value1, String value2) {
            addCriterion("manu not between", value1, value2, "manu");
            return (Criteria) this;
        }

        public Criteria andDomainidIsNull() {
            addCriterion("domainid is null");
            return (Criteria) this;
        }

        public Criteria andDomainidIsNotNull() {
            addCriterion("domainid is not null");
            return (Criteria) this;
        }

        public Criteria andDomainidEqualTo(String value) {
            addCriterion("domainid =", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidNotEqualTo(String value) {
            addCriterion("domainid <>", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidGreaterThan(String value) {
            addCriterion("domainid >", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidGreaterThanOrEqualTo(String value) {
            addCriterion("domainid >=", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidLessThan(String value) {
            addCriterion("domainid <", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidLessThanOrEqualTo(String value) {
            addCriterion("domainid <=", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidLike(String value) {
            addCriterion("domainid like", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidNotLike(String value) {
            addCriterion("domainid not like", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidIn(List<String> values) {
            addCriterion("domainid in", values, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidNotIn(List<String> values) {
            addCriterion("domainid not in", values, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidBetween(String value1, String value2) {
            addCriterion("domainid between", value1, value2, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidNotBetween(String value1, String value2) {
            addCriterion("domainid not between", value1, value2, "domainid");
            return (Criteria) this;
        }

        public Criteria andPuidIsNull() {
            addCriterion("puid is null");
            return (Criteria) this;
        }

        public Criteria andPuidIsNotNull() {
            addCriterion("puid is not null");
            return (Criteria) this;
        }

        public Criteria andPuidEqualTo(String value) {
            addCriterion("puid =", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotEqualTo(String value) {
            addCriterion("puid <>", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThan(String value) {
            addCriterion("puid >", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThanOrEqualTo(String value) {
            addCriterion("puid >=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThan(String value) {
            addCriterion("puid <", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThanOrEqualTo(String value) {
            addCriterion("puid <=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLike(String value) {
            addCriterion("puid like", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotLike(String value) {
            addCriterion("puid not like", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidIn(List<String> values) {
            addCriterion("puid in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotIn(List<String> values) {
            addCriterion("puid not in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidBetween(String value1, String value2) {
            addCriterion("puid between", value1, value2, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotBetween(String value1, String value2) {
            addCriterion("puid not between", value1, value2, "puid");
            return (Criteria) this;
        }

        public Criteria andHighportIsNull() {
            addCriterion("\" highport\" is null");
            return (Criteria) this;
        }

        public Criteria andHighportIsNotNull() {
            addCriterion("\" highport\" is not null");
            return (Criteria) this;
        }

        public Criteria andHighportEqualTo(String value) {
            addCriterion("\" highport\" =", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportNotEqualTo(String value) {
            addCriterion("\" highport\" <>", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportGreaterThan(String value) {
            addCriterion("\" highport\" >", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportGreaterThanOrEqualTo(String value) {
            addCriterion("\" highport\" >=", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportLessThan(String value) {
            addCriterion("\" highport\" <", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportLessThanOrEqualTo(String value) {
            addCriterion("\" highport\" <=", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportLike(String value) {
            addCriterion("\" highport\" like", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportNotLike(String value) {
            addCriterion("\" highport\" not like", value, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportIn(List<String> values) {
            addCriterion("\" highport\" in", values, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportNotIn(List<String> values) {
            addCriterion("\" highport\" not in", values, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportBetween(String value1, String value2) {
            addCriterion("\" highport\" between", value1, value2, "highport");
            return (Criteria) this;
        }

        public Criteria andHighportNotBetween(String value1, String value2) {
            addCriterion("\" highport\" not between", value1, value2, "highport");
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