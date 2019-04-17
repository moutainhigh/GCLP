package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetinfoExample() {
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

        public Criteria andAssettypeIsNull() {
            addCriterion("assettype is null");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNotNull() {
            addCriterion("assettype is not null");
            return (Criteria) this;
        }

        public Criteria andAssettypeEqualTo(String value) {
            addCriterion("assettype =", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotEqualTo(String value) {
            addCriterion("assettype <>", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThan(String value) {
            addCriterion("assettype >", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThanOrEqualTo(String value) {
            addCriterion("assettype >=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThan(String value) {
            addCriterion("assettype <", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThanOrEqualTo(String value) {
            addCriterion("assettype <=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLike(String value) {
            addCriterion("assettype like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotLike(String value) {
            addCriterion("assettype not like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeIn(List<String> values) {
            addCriterion("assettype in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotIn(List<String> values) {
            addCriterion("assettype not in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeBetween(String value1, String value2) {
            addCriterion("assettype between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotBetween(String value1, String value2) {
            addCriterion("assettype not between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAddresssareaIsNull() {
            addCriterion("addresssarea is null");
            return (Criteria) this;
        }

        public Criteria andAddresssareaIsNotNull() {
            addCriterion("addresssarea is not null");
            return (Criteria) this;
        }

        public Criteria andAddresssareaEqualTo(String value) {
            addCriterion("addresssarea =", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaNotEqualTo(String value) {
            addCriterion("addresssarea <>", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaGreaterThan(String value) {
            addCriterion("addresssarea >", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaGreaterThanOrEqualTo(String value) {
            addCriterion("addresssarea >=", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaLessThan(String value) {
            addCriterion("addresssarea <", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaLessThanOrEqualTo(String value) {
            addCriterion("addresssarea <=", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaLike(String value) {
            addCriterion("addresssarea like", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaNotLike(String value) {
            addCriterion("addresssarea not like", value, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaIn(List<String> values) {
            addCriterion("addresssarea in", values, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaNotIn(List<String> values) {
            addCriterion("addresssarea not in", values, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaBetween(String value1, String value2) {
            addCriterion("addresssarea between", value1, value2, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresssareaNotBetween(String value1, String value2) {
            addCriterion("addresssarea not between", value1, value2, "addresssarea");
            return (Criteria) this;
        }

        public Criteria andAddresscityIsNull() {
            addCriterion("addresscity is null");
            return (Criteria) this;
        }

        public Criteria andAddresscityIsNotNull() {
            addCriterion("addresscity is not null");
            return (Criteria) this;
        }

        public Criteria andAddresscityEqualTo(String value) {
            addCriterion("addresscity =", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotEqualTo(String value) {
            addCriterion("addresscity <>", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityGreaterThan(String value) {
            addCriterion("addresscity >", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("addresscity >=", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLessThan(String value) {
            addCriterion("addresscity <", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLessThanOrEqualTo(String value) {
            addCriterion("addresscity <=", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLike(String value) {
            addCriterion("addresscity like", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotLike(String value) {
            addCriterion("addresscity not like", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityIn(List<String> values) {
            addCriterion("addresscity in", values, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotIn(List<String> values) {
            addCriterion("addresscity not in", values, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityBetween(String value1, String value2) {
            addCriterion("addresscity between", value1, value2, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotBetween(String value1, String value2) {
            addCriterion("addresscity not between", value1, value2, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddressprovIsNull() {
            addCriterion("addressprov is null");
            return (Criteria) this;
        }

        public Criteria andAddressprovIsNotNull() {
            addCriterion("addressprov is not null");
            return (Criteria) this;
        }

        public Criteria andAddressprovEqualTo(String value) {
            addCriterion("addressprov =", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotEqualTo(String value) {
            addCriterion("addressprov <>", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovGreaterThan(String value) {
            addCriterion("addressprov >", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovGreaterThanOrEqualTo(String value) {
            addCriterion("addressprov >=", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovLessThan(String value) {
            addCriterion("addressprov <", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovLessThanOrEqualTo(String value) {
            addCriterion("addressprov <=", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovLike(String value) {
            addCriterion("addressprov like", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotLike(String value) {
            addCriterion("addressprov not like", value, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovIn(List<String> values) {
            addCriterion("addressprov in", values, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotIn(List<String> values) {
            addCriterion("addressprov not in", values, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovBetween(String value1, String value2) {
            addCriterion("addressprov between", value1, value2, "addressprov");
            return (Criteria) this;
        }

        public Criteria andAddressprovNotBetween(String value1, String value2) {
            addCriterion("addressprov not between", value1, value2, "addressprov");
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

        public Criteria andIsprovidepaperIsNull() {
            addCriterion("isprovidepaper is null");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperIsNotNull() {
            addCriterion("isprovidepaper is not null");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperEqualTo(String value) {
            addCriterion("isprovidepaper =", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperNotEqualTo(String value) {
            addCriterion("isprovidepaper <>", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperGreaterThan(String value) {
            addCriterion("isprovidepaper >", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperGreaterThanOrEqualTo(String value) {
            addCriterion("isprovidepaper >=", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperLessThan(String value) {
            addCriterion("isprovidepaper <", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperLessThanOrEqualTo(String value) {
            addCriterion("isprovidepaper <=", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperLike(String value) {
            addCriterion("isprovidepaper like", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperNotLike(String value) {
            addCriterion("isprovidepaper not like", value, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperIn(List<String> values) {
            addCriterion("isprovidepaper in", values, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperNotIn(List<String> values) {
            addCriterion("isprovidepaper not in", values, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperBetween(String value1, String value2) {
            addCriterion("isprovidepaper between", value1, value2, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andIsprovidepaperNotBetween(String value1, String value2) {
            addCriterion("isprovidepaper not between", value1, value2, "isprovidepaper");
            return (Criteria) this;
        }

        public Criteria andPropertyownerIsNull() {
            addCriterion("propertyowner is null");
            return (Criteria) this;
        }

        public Criteria andPropertyownerIsNotNull() {
            addCriterion("propertyowner is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyownerEqualTo(String value) {
            addCriterion("propertyowner =", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotEqualTo(String value) {
            addCriterion("propertyowner <>", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerGreaterThan(String value) {
            addCriterion("propertyowner >", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerGreaterThanOrEqualTo(String value) {
            addCriterion("propertyowner >=", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerLessThan(String value) {
            addCriterion("propertyowner <", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerLessThanOrEqualTo(String value) {
            addCriterion("propertyowner <=", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerLike(String value) {
            addCriterion("propertyowner like", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotLike(String value) {
            addCriterion("propertyowner not like", value, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerIn(List<String> values) {
            addCriterion("propertyowner in", values, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotIn(List<String> values) {
            addCriterion("propertyowner not in", values, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerBetween(String value1, String value2) {
            addCriterion("propertyowner between", value1, value2, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andPropertyownerNotBetween(String value1, String value2) {
            addCriterion("propertyowner not between", value1, value2, "propertyowner");
            return (Criteria) this;
        }

        public Criteria andHousenatureIsNull() {
            addCriterion("housenature is null");
            return (Criteria) this;
        }

        public Criteria andHousenatureIsNotNull() {
            addCriterion("housenature is not null");
            return (Criteria) this;
        }

        public Criteria andHousenatureEqualTo(String value) {
            addCriterion("housenature =", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureNotEqualTo(String value) {
            addCriterion("housenature <>", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureGreaterThan(String value) {
            addCriterion("housenature >", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureGreaterThanOrEqualTo(String value) {
            addCriterion("housenature >=", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureLessThan(String value) {
            addCriterion("housenature <", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureLessThanOrEqualTo(String value) {
            addCriterion("housenature <=", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureLike(String value) {
            addCriterion("housenature like", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureNotLike(String value) {
            addCriterion("housenature not like", value, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureIn(List<String> values) {
            addCriterion("housenature in", values, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureNotIn(List<String> values) {
            addCriterion("housenature not in", values, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureBetween(String value1, String value2) {
            addCriterion("housenature between", value1, value2, "housenature");
            return (Criteria) this;
        }

        public Criteria andHousenatureNotBetween(String value1, String value2) {
            addCriterion("housenature not between", value1, value2, "housenature");
            return (Criteria) this;
        }

        public Criteria andHouseareaIsNull() {
            addCriterion("housearea is null");
            return (Criteria) this;
        }

        public Criteria andHouseareaIsNotNull() {
            addCriterion("housearea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseareaEqualTo(String value) {
            addCriterion("housearea =", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotEqualTo(String value) {
            addCriterion("housearea <>", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaGreaterThan(String value) {
            addCriterion("housearea >", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaGreaterThanOrEqualTo(String value) {
            addCriterion("housearea >=", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLessThan(String value) {
            addCriterion("housearea <", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLessThanOrEqualTo(String value) {
            addCriterion("housearea <=", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLike(String value) {
            addCriterion("housearea like", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotLike(String value) {
            addCriterion("housearea not like", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaIn(List<String> values) {
            addCriterion("housearea in", values, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotIn(List<String> values) {
            addCriterion("housearea not in", values, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaBetween(String value1, String value2) {
            addCriterion("housearea between", value1, value2, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotBetween(String value1, String value2) {
            addCriterion("housearea not between", value1, value2, "housearea");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNull() {
            addCriterion("buytime is null");
            return (Criteria) this;
        }

        public Criteria andBuytimeIsNotNull() {
            addCriterion("buytime is not null");
            return (Criteria) this;
        }

        public Criteria andBuytimeEqualTo(Date value) {
            addCriterion("buytime =", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotEqualTo(Date value) {
            addCriterion("buytime <>", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThan(Date value) {
            addCriterion("buytime >", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buytime >=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThan(Date value) {
            addCriterion("buytime <", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeLessThanOrEqualTo(Date value) {
            addCriterion("buytime <=", value, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeIn(List<Date> values) {
            addCriterion("buytime in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotIn(List<Date> values) {
            addCriterion("buytime not in", values, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeBetween(Date value1, Date value2) {
            addCriterion("buytime between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuytimeNotBetween(Date value1, Date value2) {
            addCriterion("buytime not between", value1, value2, "buytime");
            return (Criteria) this;
        }

        public Criteria andBuypriceIsNull() {
            addCriterion("buyprice is null");
            return (Criteria) this;
        }

        public Criteria andBuypriceIsNotNull() {
            addCriterion("buyprice is not null");
            return (Criteria) this;
        }

        public Criteria andBuypriceEqualTo(BigDecimal value) {
            addCriterion("buyprice =", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceNotEqualTo(BigDecimal value) {
            addCriterion("buyprice <>", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceGreaterThan(BigDecimal value) {
            addCriterion("buyprice >", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buyprice >=", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceLessThan(BigDecimal value) {
            addCriterion("buyprice <", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buyprice <=", value, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceIn(List<BigDecimal> values) {
            addCriterion("buyprice in", values, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceNotIn(List<BigDecimal> values) {
            addCriterion("buyprice not in", values, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyprice between", value1, value2, "buyprice");
            return (Criteria) this;
        }

        public Criteria andBuypriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyprice not between", value1, value2, "buyprice");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeIsNull() {
            addCriterion("docchoosetype is null");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeIsNotNull() {
            addCriterion("docchoosetype is not null");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeEqualTo(String value) {
            addCriterion("docchoosetype =", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeNotEqualTo(String value) {
            addCriterion("docchoosetype <>", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeGreaterThan(String value) {
            addCriterion("docchoosetype >", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeGreaterThanOrEqualTo(String value) {
            addCriterion("docchoosetype >=", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeLessThan(String value) {
            addCriterion("docchoosetype <", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeLessThanOrEqualTo(String value) {
            addCriterion("docchoosetype <=", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeLike(String value) {
            addCriterion("docchoosetype like", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeNotLike(String value) {
            addCriterion("docchoosetype not like", value, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeIn(List<String> values) {
            addCriterion("docchoosetype in", values, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeNotIn(List<String> values) {
            addCriterion("docchoosetype not in", values, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeBetween(String value1, String value2) {
            addCriterion("docchoosetype between", value1, value2, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andDocchoosetypeNotBetween(String value1, String value2) {
            addCriterion("docchoosetype not between", value1, value2, "docchoosetype");
            return (Criteria) this;
        }

        public Criteria andAssetsituationIsNull() {
            addCriterion("assetsituation is null");
            return (Criteria) this;
        }

        public Criteria andAssetsituationIsNotNull() {
            addCriterion("assetsituation is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsituationEqualTo(String value) {
            addCriterion("assetsituation =", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationNotEqualTo(String value) {
            addCriterion("assetsituation <>", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationGreaterThan(String value) {
            addCriterion("assetsituation >", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationGreaterThanOrEqualTo(String value) {
            addCriterion("assetsituation >=", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationLessThan(String value) {
            addCriterion("assetsituation <", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationLessThanOrEqualTo(String value) {
            addCriterion("assetsituation <=", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationLike(String value) {
            addCriterion("assetsituation like", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationNotLike(String value) {
            addCriterion("assetsituation not like", value, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationIn(List<String> values) {
            addCriterion("assetsituation in", values, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationNotIn(List<String> values) {
            addCriterion("assetsituation not in", values, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationBetween(String value1, String value2) {
            addCriterion("assetsituation between", value1, value2, "assetsituation");
            return (Criteria) this;
        }

        public Criteria andAssetsituationNotBetween(String value1, String value2) {
            addCriterion("assetsituation not between", value1, value2, "assetsituation");
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