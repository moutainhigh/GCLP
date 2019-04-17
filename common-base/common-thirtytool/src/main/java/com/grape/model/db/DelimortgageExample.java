package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DelimortgageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DelimortgageExample() {
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

        public Criteria andHouseaddressnotesIsNull() {
            addCriterion("houseaddressnotes is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesIsNotNull() {
            addCriterion("houseaddressnotes is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesEqualTo(String value) {
            addCriterion("houseaddressnotes =", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesNotEqualTo(String value) {
            addCriterion("houseaddressnotes <>", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesGreaterThan(String value) {
            addCriterion("houseaddressnotes >", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddressnotes >=", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesLessThan(String value) {
            addCriterion("houseaddressnotes <", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesLessThanOrEqualTo(String value) {
            addCriterion("houseaddressnotes <=", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesLike(String value) {
            addCriterion("houseaddressnotes like", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesNotLike(String value) {
            addCriterion("houseaddressnotes not like", value, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesIn(List<String> values) {
            addCriterion("houseaddressnotes in", values, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesNotIn(List<String> values) {
            addCriterion("houseaddressnotes not in", values, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesBetween(String value1, String value2) {
            addCriterion("houseaddressnotes between", value1, value2, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressnotesNotBetween(String value1, String value2) {
            addCriterion("houseaddressnotes not between", value1, value2, "houseaddressnotes");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgIsNull() {
            addCriterion("houseaddressflg is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgIsNotNull() {
            addCriterion("houseaddressflg is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgEqualTo(String value) {
            addCriterion("houseaddressflg =", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgNotEqualTo(String value) {
            addCriterion("houseaddressflg <>", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgGreaterThan(String value) {
            addCriterion("houseaddressflg >", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgGreaterThanOrEqualTo(String value) {
            addCriterion("houseaddressflg >=", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgLessThan(String value) {
            addCriterion("houseaddressflg <", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgLessThanOrEqualTo(String value) {
            addCriterion("houseaddressflg <=", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgLike(String value) {
            addCriterion("houseaddressflg like", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgNotLike(String value) {
            addCriterion("houseaddressflg not like", value, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgIn(List<String> values) {
            addCriterion("houseaddressflg in", values, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgNotIn(List<String> values) {
            addCriterion("houseaddressflg not in", values, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgBetween(String value1, String value2) {
            addCriterion("houseaddressflg between", value1, value2, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andHouseaddressflgNotBetween(String value1, String value2) {
            addCriterion("houseaddressflg not between", value1, value2, "houseaddressflg");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperIsNull() {
            addCriterion("otherdeveloper is null");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperIsNotNull() {
            addCriterion("otherdeveloper is not null");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperEqualTo(String value) {
            addCriterion("otherdeveloper =", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperNotEqualTo(String value) {
            addCriterion("otherdeveloper <>", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperGreaterThan(String value) {
            addCriterion("otherdeveloper >", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("otherdeveloper >=", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperLessThan(String value) {
            addCriterion("otherdeveloper <", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperLessThanOrEqualTo(String value) {
            addCriterion("otherdeveloper <=", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperLike(String value) {
            addCriterion("otherdeveloper like", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperNotLike(String value) {
            addCriterion("otherdeveloper not like", value, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperIn(List<String> values) {
            addCriterion("otherdeveloper in", values, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperNotIn(List<String> values) {
            addCriterion("otherdeveloper not in", values, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperBetween(String value1, String value2) {
            addCriterion("otherdeveloper between", value1, value2, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andOtherdeveloperNotBetween(String value1, String value2) {
            addCriterion("otherdeveloper not between", value1, value2, "otherdeveloper");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andFallpopulationIsNull() {
            addCriterion("fallpopulation is null");
            return (Criteria) this;
        }

        public Criteria andFallpopulationIsNotNull() {
            addCriterion("fallpopulation is not null");
            return (Criteria) this;
        }

        public Criteria andFallpopulationEqualTo(String value) {
            addCriterion("fallpopulation =", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationNotEqualTo(String value) {
            addCriterion("fallpopulation <>", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationGreaterThan(String value) {
            addCriterion("fallpopulation >", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationGreaterThanOrEqualTo(String value) {
            addCriterion("fallpopulation >=", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationLessThan(String value) {
            addCriterion("fallpopulation <", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationLessThanOrEqualTo(String value) {
            addCriterion("fallpopulation <=", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationLike(String value) {
            addCriterion("fallpopulation like", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationNotLike(String value) {
            addCriterion("fallpopulation not like", value, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationIn(List<String> values) {
            addCriterion("fallpopulation in", values, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationNotIn(List<String> values) {
            addCriterion("fallpopulation not in", values, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationBetween(String value1, String value2) {
            addCriterion("fallpopulation between", value1, value2, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andFallpopulationNotBetween(String value1, String value2) {
            addCriterion("fallpopulation not between", value1, value2, "fallpopulation");
            return (Criteria) this;
        }

        public Criteria andLivepeopleIsNull() {
            addCriterion("livepeople is null");
            return (Criteria) this;
        }

        public Criteria andLivepeopleIsNotNull() {
            addCriterion("livepeople is not null");
            return (Criteria) this;
        }

        public Criteria andLivepeopleEqualTo(String value) {
            addCriterion("livepeople =", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleNotEqualTo(String value) {
            addCriterion("livepeople <>", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleGreaterThan(String value) {
            addCriterion("livepeople >", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("livepeople >=", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleLessThan(String value) {
            addCriterion("livepeople <", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleLessThanOrEqualTo(String value) {
            addCriterion("livepeople <=", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleLike(String value) {
            addCriterion("livepeople like", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleNotLike(String value) {
            addCriterion("livepeople not like", value, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleIn(List<String> values) {
            addCriterion("livepeople in", values, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleNotIn(List<String> values) {
            addCriterion("livepeople not in", values, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleBetween(String value1, String value2) {
            addCriterion("livepeople between", value1, value2, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivepeopleNotBetween(String value1, String value2) {
            addCriterion("livepeople not between", value1, value2, "livepeople");
            return (Criteria) this;
        }

        public Criteria andLivesizeIsNull() {
            addCriterion("livesize is null");
            return (Criteria) this;
        }

        public Criteria andLivesizeIsNotNull() {
            addCriterion("livesize is not null");
            return (Criteria) this;
        }

        public Criteria andLivesizeEqualTo(String value) {
            addCriterion("livesize =", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeNotEqualTo(String value) {
            addCriterion("livesize <>", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeGreaterThan(String value) {
            addCriterion("livesize >", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeGreaterThanOrEqualTo(String value) {
            addCriterion("livesize >=", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeLessThan(String value) {
            addCriterion("livesize <", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeLessThanOrEqualTo(String value) {
            addCriterion("livesize <=", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeLike(String value) {
            addCriterion("livesize like", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeNotLike(String value) {
            addCriterion("livesize not like", value, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeIn(List<String> values) {
            addCriterion("livesize in", values, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeNotIn(List<String> values) {
            addCriterion("livesize not in", values, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeBetween(String value1, String value2) {
            addCriterion("livesize between", value1, value2, "livesize");
            return (Criteria) this;
        }

        public Criteria andLivesizeNotBetween(String value1, String value2) {
            addCriterion("livesize not between", value1, value2, "livesize");
            return (Criteria) this;
        }

        public Criteria andAreasizeIsNull() {
            addCriterion("areasize is null");
            return (Criteria) this;
        }

        public Criteria andAreasizeIsNotNull() {
            addCriterion("areasize is not null");
            return (Criteria) this;
        }

        public Criteria andAreasizeEqualTo(String value) {
            addCriterion("areasize =", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeNotEqualTo(String value) {
            addCriterion("areasize <>", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeGreaterThan(String value) {
            addCriterion("areasize >", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeGreaterThanOrEqualTo(String value) {
            addCriterion("areasize >=", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeLessThan(String value) {
            addCriterion("areasize <", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeLessThanOrEqualTo(String value) {
            addCriterion("areasize <=", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeLike(String value) {
            addCriterion("areasize like", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeNotLike(String value) {
            addCriterion("areasize not like", value, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeIn(List<String> values) {
            addCriterion("areasize in", values, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeNotIn(List<String> values) {
            addCriterion("areasize not in", values, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeBetween(String value1, String value2) {
            addCriterion("areasize between", value1, value2, "areasize");
            return (Criteria) this;
        }

        public Criteria andAreasizeNotBetween(String value1, String value2) {
            addCriterion("areasize not between", value1, value2, "areasize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeIsNull() {
            addCriterion("insidesize is null");
            return (Criteria) this;
        }

        public Criteria andInsidesizeIsNotNull() {
            addCriterion("insidesize is not null");
            return (Criteria) this;
        }

        public Criteria andInsidesizeEqualTo(String value) {
            addCriterion("insidesize =", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeNotEqualTo(String value) {
            addCriterion("insidesize <>", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeGreaterThan(String value) {
            addCriterion("insidesize >", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeGreaterThanOrEqualTo(String value) {
            addCriterion("insidesize >=", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeLessThan(String value) {
            addCriterion("insidesize <", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeLessThanOrEqualTo(String value) {
            addCriterion("insidesize <=", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeLike(String value) {
            addCriterion("insidesize like", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeNotLike(String value) {
            addCriterion("insidesize not like", value, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeIn(List<String> values) {
            addCriterion("insidesize in", values, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeNotIn(List<String> values) {
            addCriterion("insidesize not in", values, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeBetween(String value1, String value2) {
            addCriterion("insidesize between", value1, value2, "insidesize");
            return (Criteria) this;
        }

        public Criteria andInsidesizeNotBetween(String value1, String value2) {
            addCriterion("insidesize not between", value1, value2, "insidesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeIsNull() {
            addCriterion("carhousesize is null");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeIsNotNull() {
            addCriterion("carhousesize is not null");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeEqualTo(String value) {
            addCriterion("carhousesize =", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeNotEqualTo(String value) {
            addCriterion("carhousesize <>", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeGreaterThan(String value) {
            addCriterion("carhousesize >", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeGreaterThanOrEqualTo(String value) {
            addCriterion("carhousesize >=", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeLessThan(String value) {
            addCriterion("carhousesize <", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeLessThanOrEqualTo(String value) {
            addCriterion("carhousesize <=", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeLike(String value) {
            addCriterion("carhousesize like", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeNotLike(String value) {
            addCriterion("carhousesize not like", value, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeIn(List<String> values) {
            addCriterion("carhousesize in", values, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeNotIn(List<String> values) {
            addCriterion("carhousesize not in", values, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeBetween(String value1, String value2) {
            addCriterion("carhousesize between", value1, value2, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andCarhousesizeNotBetween(String value1, String value2) {
            addCriterion("carhousesize not between", value1, value2, "carhousesize");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesIsNull() {
            addCriterion("chrhousenotes is null");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesIsNotNull() {
            addCriterion("chrhousenotes is not null");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesEqualTo(String value) {
            addCriterion("chrhousenotes =", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesNotEqualTo(String value) {
            addCriterion("chrhousenotes <>", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesGreaterThan(String value) {
            addCriterion("chrhousenotes >", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesGreaterThanOrEqualTo(String value) {
            addCriterion("chrhousenotes >=", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesLessThan(String value) {
            addCriterion("chrhousenotes <", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesLessThanOrEqualTo(String value) {
            addCriterion("chrhousenotes <=", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesLike(String value) {
            addCriterion("chrhousenotes like", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesNotLike(String value) {
            addCriterion("chrhousenotes not like", value, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesIn(List<String> values) {
            addCriterion("chrhousenotes in", values, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesNotIn(List<String> values) {
            addCriterion("chrhousenotes not in", values, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesBetween(String value1, String value2) {
            addCriterion("chrhousenotes between", value1, value2, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andChrhousenotesNotBetween(String value1, String value2) {
            addCriterion("chrhousenotes not between", value1, value2, "chrhousenotes");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseIsNull() {
            addCriterion("havacarhouse is null");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseIsNotNull() {
            addCriterion("havacarhouse is not null");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseEqualTo(String value) {
            addCriterion("havacarhouse =", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseNotEqualTo(String value) {
            addCriterion("havacarhouse <>", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseGreaterThan(String value) {
            addCriterion("havacarhouse >", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseGreaterThanOrEqualTo(String value) {
            addCriterion("havacarhouse >=", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseLessThan(String value) {
            addCriterion("havacarhouse <", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseLessThanOrEqualTo(String value) {
            addCriterion("havacarhouse <=", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseLike(String value) {
            addCriterion("havacarhouse like", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseNotLike(String value) {
            addCriterion("havacarhouse not like", value, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseIn(List<String> values) {
            addCriterion("havacarhouse in", values, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseNotIn(List<String> values) {
            addCriterion("havacarhouse not in", values, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseBetween(String value1, String value2) {
            addCriterion("havacarhouse between", value1, value2, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andHavacarhouseNotBetween(String value1, String value2) {
            addCriterion("havacarhouse not between", value1, value2, "havacarhouse");
            return (Criteria) this;
        }

        public Criteria andBasementsizeIsNull() {
            addCriterion("basementsize is null");
            return (Criteria) this;
        }

        public Criteria andBasementsizeIsNotNull() {
            addCriterion("basementsize is not null");
            return (Criteria) this;
        }

        public Criteria andBasementsizeEqualTo(String value) {
            addCriterion("basementsize =", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeNotEqualTo(String value) {
            addCriterion("basementsize <>", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeGreaterThan(String value) {
            addCriterion("basementsize >", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeGreaterThanOrEqualTo(String value) {
            addCriterion("basementsize >=", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeLessThan(String value) {
            addCriterion("basementsize <", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeLessThanOrEqualTo(String value) {
            addCriterion("basementsize <=", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeLike(String value) {
            addCriterion("basementsize like", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeNotLike(String value) {
            addCriterion("basementsize not like", value, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeIn(List<String> values) {
            addCriterion("basementsize in", values, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeNotIn(List<String> values) {
            addCriterion("basementsize not in", values, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeBetween(String value1, String value2) {
            addCriterion("basementsize between", value1, value2, "basementsize");
            return (Criteria) this;
        }

        public Criteria andBasementsizeNotBetween(String value1, String value2) {
            addCriterion("basementsize not between", value1, value2, "basementsize");
            return (Criteria) this;
        }

        public Criteria andIsbasementIsNull() {
            addCriterion("isbasement is null");
            return (Criteria) this;
        }

        public Criteria andIsbasementIsNotNull() {
            addCriterion("isbasement is not null");
            return (Criteria) this;
        }

        public Criteria andIsbasementEqualTo(String value) {
            addCriterion("isbasement =", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementNotEqualTo(String value) {
            addCriterion("isbasement <>", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementGreaterThan(String value) {
            addCriterion("isbasement >", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementGreaterThanOrEqualTo(String value) {
            addCriterion("isbasement >=", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementLessThan(String value) {
            addCriterion("isbasement <", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementLessThanOrEqualTo(String value) {
            addCriterion("isbasement <=", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementLike(String value) {
            addCriterion("isbasement like", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementNotLike(String value) {
            addCriterion("isbasement not like", value, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementIn(List<String> values) {
            addCriterion("isbasement in", values, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementNotIn(List<String> values) {
            addCriterion("isbasement not in", values, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementBetween(String value1, String value2) {
            addCriterion("isbasement between", value1, value2, "isbasement");
            return (Criteria) this;
        }

        public Criteria andIsbasementNotBetween(String value1, String value2) {
            addCriterion("isbasement not between", value1, value2, "isbasement");
            return (Criteria) this;
        }

        public Criteria andHousestateIsNull() {
            addCriterion("housestate is null");
            return (Criteria) this;
        }

        public Criteria andHousestateIsNotNull() {
            addCriterion("housestate is not null");
            return (Criteria) this;
        }

        public Criteria andHousestateEqualTo(String value) {
            addCriterion("housestate =", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateNotEqualTo(String value) {
            addCriterion("housestate <>", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateGreaterThan(String value) {
            addCriterion("housestate >", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateGreaterThanOrEqualTo(String value) {
            addCriterion("housestate >=", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateLessThan(String value) {
            addCriterion("housestate <", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateLessThanOrEqualTo(String value) {
            addCriterion("housestate <=", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateLike(String value) {
            addCriterion("housestate like", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateNotLike(String value) {
            addCriterion("housestate not like", value, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateIn(List<String> values) {
            addCriterion("housestate in", values, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateNotIn(List<String> values) {
            addCriterion("housestate not in", values, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateBetween(String value1, String value2) {
            addCriterion("housestate between", value1, value2, "housestate");
            return (Criteria) this;
        }

        public Criteria andHousestateNotBetween(String value1, String value2) {
            addCriterion("housestate not between", value1, value2, "housestate");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeIsNull() {
            addCriterion("follorpurpose is null");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeIsNotNull() {
            addCriterion("follorpurpose is not null");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeEqualTo(String value) {
            addCriterion("follorpurpose =", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeNotEqualTo(String value) {
            addCriterion("follorpurpose <>", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeGreaterThan(String value) {
            addCriterion("follorpurpose >", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeGreaterThanOrEqualTo(String value) {
            addCriterion("follorpurpose >=", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeLessThan(String value) {
            addCriterion("follorpurpose <", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeLessThanOrEqualTo(String value) {
            addCriterion("follorpurpose <=", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeLike(String value) {
            addCriterion("follorpurpose like", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeNotLike(String value) {
            addCriterion("follorpurpose not like", value, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeIn(List<String> values) {
            addCriterion("follorpurpose in", values, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeNotIn(List<String> values) {
            addCriterion("follorpurpose not in", values, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeBetween(String value1, String value2) {
            addCriterion("follorpurpose between", value1, value2, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andFollorpurposeNotBetween(String value1, String value2) {
            addCriterion("follorpurpose not between", value1, value2, "follorpurpose");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesIsNull() {
            addCriterion("ismaritalpropertynotes is null");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesIsNotNull() {
            addCriterion("ismaritalpropertynotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesEqualTo(String value) {
            addCriterion("ismaritalpropertynotes =", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesNotEqualTo(String value) {
            addCriterion("ismaritalpropertynotes <>", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesGreaterThan(String value) {
            addCriterion("ismaritalpropertynotes >", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesGreaterThanOrEqualTo(String value) {
            addCriterion("ismaritalpropertynotes >=", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesLessThan(String value) {
            addCriterion("ismaritalpropertynotes <", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesLessThanOrEqualTo(String value) {
            addCriterion("ismaritalpropertynotes <=", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesLike(String value) {
            addCriterion("ismaritalpropertynotes like", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesNotLike(String value) {
            addCriterion("ismaritalpropertynotes not like", value, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesIn(List<String> values) {
            addCriterion("ismaritalpropertynotes in", values, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesNotIn(List<String> values) {
            addCriterion("ismaritalpropertynotes not in", values, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesBetween(String value1, String value2) {
            addCriterion("ismaritalpropertynotes between", value1, value2, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertynotesNotBetween(String value1, String value2) {
            addCriterion("ismaritalpropertynotes not between", value1, value2, "ismaritalpropertynotes");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyIsNull() {
            addCriterion("ismaritalproperty is null");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyIsNotNull() {
            addCriterion("ismaritalproperty is not null");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyEqualTo(String value) {
            addCriterion("ismaritalproperty =", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyNotEqualTo(String value) {
            addCriterion("ismaritalproperty <>", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyGreaterThan(String value) {
            addCriterion("ismaritalproperty >", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("ismaritalproperty >=", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyLessThan(String value) {
            addCriterion("ismaritalproperty <", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyLessThanOrEqualTo(String value) {
            addCriterion("ismaritalproperty <=", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyLike(String value) {
            addCriterion("ismaritalproperty like", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyNotLike(String value) {
            addCriterion("ismaritalproperty not like", value, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyIn(List<String> values) {
            addCriterion("ismaritalproperty in", values, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyNotIn(List<String> values) {
            addCriterion("ismaritalproperty not in", values, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyBetween(String value1, String value2) {
            addCriterion("ismaritalproperty between", value1, value2, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andIsmaritalpropertyNotBetween(String value1, String value2) {
            addCriterion("ismaritalproperty not between", value1, value2, "ismaritalproperty");
            return (Criteria) this;
        }

        public Criteria andFloorsIsNull() {
            addCriterion("floors is null");
            return (Criteria) this;
        }

        public Criteria andFloorsIsNotNull() {
            addCriterion("floors is not null");
            return (Criteria) this;
        }

        public Criteria andFloorsEqualTo(String value) {
            addCriterion("floors =", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsNotEqualTo(String value) {
            addCriterion("floors <>", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsGreaterThan(String value) {
            addCriterion("floors >", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsGreaterThanOrEqualTo(String value) {
            addCriterion("floors >=", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsLessThan(String value) {
            addCriterion("floors <", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsLessThanOrEqualTo(String value) {
            addCriterion("floors <=", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsLike(String value) {
            addCriterion("floors like", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsNotLike(String value) {
            addCriterion("floors not like", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsIn(List<String> values) {
            addCriterion("floors in", values, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsNotIn(List<String> values) {
            addCriterion("floors not in", values, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsBetween(String value1, String value2) {
            addCriterion("floors between", value1, value2, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsNotBetween(String value1, String value2) {
            addCriterion("floors not between", value1, value2, "floors");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersIsNull() {
            addCriterion("numberoflayers is null");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersIsNotNull() {
            addCriterion("numberoflayers is not null");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersEqualTo(String value) {
            addCriterion("numberoflayers =", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersNotEqualTo(String value) {
            addCriterion("numberoflayers <>", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersGreaterThan(String value) {
            addCriterion("numberoflayers >", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersGreaterThanOrEqualTo(String value) {
            addCriterion("numberoflayers >=", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersLessThan(String value) {
            addCriterion("numberoflayers <", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersLessThanOrEqualTo(String value) {
            addCriterion("numberoflayers <=", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersLike(String value) {
            addCriterion("numberoflayers like", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersNotLike(String value) {
            addCriterion("numberoflayers not like", value, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersIn(List<String> values) {
            addCriterion("numberoflayers in", values, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersNotIn(List<String> values) {
            addCriterion("numberoflayers not in", values, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersBetween(String value1, String value2) {
            addCriterion("numberoflayers between", value1, value2, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andNumberoflayersNotBetween(String value1, String value2) {
            addCriterion("numberoflayers not between", value1, value2, "numberoflayers");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationIsNull() {
            addCriterion("degreedecoration is null");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationIsNotNull() {
            addCriterion("degreedecoration is not null");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationEqualTo(String value) {
            addCriterion("degreedecoration =", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationNotEqualTo(String value) {
            addCriterion("degreedecoration <>", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationGreaterThan(String value) {
            addCriterion("degreedecoration >", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationGreaterThanOrEqualTo(String value) {
            addCriterion("degreedecoration >=", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationLessThan(String value) {
            addCriterion("degreedecoration <", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationLessThanOrEqualTo(String value) {
            addCriterion("degreedecoration <=", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationLike(String value) {
            addCriterion("degreedecoration like", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationNotLike(String value) {
            addCriterion("degreedecoration not like", value, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationIn(List<String> values) {
            addCriterion("degreedecoration in", values, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationNotIn(List<String> values) {
            addCriterion("degreedecoration not in", values, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationBetween(String value1, String value2) {
            addCriterion("degreedecoration between", value1, value2, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andDegreedecorationNotBetween(String value1, String value2) {
            addCriterion("degreedecoration not between", value1, value2, "degreedecoration");
            return (Criteria) this;
        }

        public Criteria andHouseorientationIsNull() {
            addCriterion("houseorientation is null");
            return (Criteria) this;
        }

        public Criteria andHouseorientationIsNotNull() {
            addCriterion("houseorientation is not null");
            return (Criteria) this;
        }

        public Criteria andHouseorientationEqualTo(String value) {
            addCriterion("houseorientation =", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationNotEqualTo(String value) {
            addCriterion("houseorientation <>", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationGreaterThan(String value) {
            addCriterion("houseorientation >", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationGreaterThanOrEqualTo(String value) {
            addCriterion("houseorientation >=", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationLessThan(String value) {
            addCriterion("houseorientation <", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationLessThanOrEqualTo(String value) {
            addCriterion("houseorientation <=", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationLike(String value) {
            addCriterion("houseorientation like", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationNotLike(String value) {
            addCriterion("houseorientation not like", value, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationIn(List<String> values) {
            addCriterion("houseorientation in", values, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationNotIn(List<String> values) {
            addCriterion("houseorientation not in", values, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationBetween(String value1, String value2) {
            addCriterion("houseorientation between", value1, value2, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andHouseorientationNotBetween(String value1, String value2) {
            addCriterion("houseorientation not between", value1, value2, "houseorientation");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeIsNull() {
            addCriterion("buildingtype is null");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeIsNotNull() {
            addCriterion("buildingtype is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeEqualTo(String value) {
            addCriterion("buildingtype =", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeNotEqualTo(String value) {
            addCriterion("buildingtype <>", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeGreaterThan(String value) {
            addCriterion("buildingtype >", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeGreaterThanOrEqualTo(String value) {
            addCriterion("buildingtype >=", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeLessThan(String value) {
            addCriterion("buildingtype <", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeLessThanOrEqualTo(String value) {
            addCriterion("buildingtype <=", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeLike(String value) {
            addCriterion("buildingtype like", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeNotLike(String value) {
            addCriterion("buildingtype not like", value, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeIn(List<String> values) {
            addCriterion("buildingtype in", values, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeNotIn(List<String> values) {
            addCriterion("buildingtype not in", values, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeBetween(String value1, String value2) {
            addCriterion("buildingtype between", value1, value2, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuildingtypeNotBetween(String value1, String value2) {
            addCriterion("buildingtype not between", value1, value2, "buildingtype");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocIsNull() {
            addCriterion("buyhousedoc is null");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocIsNotNull() {
            addCriterion("buyhousedoc is not null");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocEqualTo(String value) {
            addCriterion("buyhousedoc =", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocNotEqualTo(String value) {
            addCriterion("buyhousedoc <>", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocGreaterThan(String value) {
            addCriterion("buyhousedoc >", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocGreaterThanOrEqualTo(String value) {
            addCriterion("buyhousedoc >=", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocLessThan(String value) {
            addCriterion("buyhousedoc <", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocLessThanOrEqualTo(String value) {
            addCriterion("buyhousedoc <=", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocLike(String value) {
            addCriterion("buyhousedoc like", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocNotLike(String value) {
            addCriterion("buyhousedoc not like", value, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocIn(List<String> values) {
            addCriterion("buyhousedoc in", values, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocNotIn(List<String> values) {
            addCriterion("buyhousedoc not in", values, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocBetween(String value1, String value2) {
            addCriterion("buyhousedoc between", value1, value2, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedocNotBetween(String value1, String value2) {
            addCriterion("buyhousedoc not between", value1, value2, "buyhousedoc");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateIsNull() {
            addCriterion("buyhousedate is null");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateIsNotNull() {
            addCriterion("buyhousedate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateEqualTo(String value) {
            addCriterion("buyhousedate =", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateNotEqualTo(String value) {
            addCriterion("buyhousedate <>", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateGreaterThan(String value) {
            addCriterion("buyhousedate >", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateGreaterThanOrEqualTo(String value) {
            addCriterion("buyhousedate >=", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateLessThan(String value) {
            addCriterion("buyhousedate <", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateLessThanOrEqualTo(String value) {
            addCriterion("buyhousedate <=", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateLike(String value) {
            addCriterion("buyhousedate like", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateNotLike(String value) {
            addCriterion("buyhousedate not like", value, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateIn(List<String> values) {
            addCriterion("buyhousedate in", values, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateNotIn(List<String> values) {
            addCriterion("buyhousedate not in", values, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateBetween(String value1, String value2) {
            addCriterion("buyhousedate between", value1, value2, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andBuyhousedateNotBetween(String value1, String value2) {
            addCriterion("buyhousedate not between", value1, value2, "buyhousedate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2IsNull() {
            addCriterion("isrentoutdate2 is null");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2IsNotNull() {
            addCriterion("isrentoutdate2 is not null");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2EqualTo(Date value) {
            addCriterion("isrentoutdate2 =", value, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2NotEqualTo(Date value) {
            addCriterion("isrentoutdate2 <>", value, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2GreaterThan(Date value) {
            addCriterion("isrentoutdate2 >", value, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2GreaterThanOrEqualTo(Date value) {
            addCriterion("isrentoutdate2 >=", value, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2LessThan(Date value) {
            addCriterion("isrentoutdate2 <", value, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2LessThanOrEqualTo(Date value) {
            addCriterion("isrentoutdate2 <=", value, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2In(List<Date> values) {
            addCriterion("isrentoutdate2 in", values, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2NotIn(List<Date> values) {
            addCriterion("isrentoutdate2 not in", values, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2Between(Date value1, Date value2) {
            addCriterion("isrentoutdate2 between", value1, value2, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdate2NotBetween(Date value1, Date value2) {
            addCriterion("isrentoutdate2 not between", value1, value2, "isrentoutdate2");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateIsNull() {
            addCriterion("isrentoutdate is null");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateIsNotNull() {
            addCriterion("isrentoutdate is not null");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateEqualTo(Date value) {
            addCriterion("isrentoutdate =", value, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateNotEqualTo(Date value) {
            addCriterion("isrentoutdate <>", value, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateGreaterThan(Date value) {
            addCriterion("isrentoutdate >", value, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateGreaterThanOrEqualTo(Date value) {
            addCriterion("isrentoutdate >=", value, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateLessThan(Date value) {
            addCriterion("isrentoutdate <", value, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateLessThanOrEqualTo(Date value) {
            addCriterion("isrentoutdate <=", value, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateIn(List<Date> values) {
            addCriterion("isrentoutdate in", values, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateNotIn(List<Date> values) {
            addCriterion("isrentoutdate not in", values, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateBetween(Date value1, Date value2) {
            addCriterion("isrentoutdate between", value1, value2, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutdateNotBetween(Date value1, Date value2) {
            addCriterion("isrentoutdate not between", value1, value2, "isrentoutdate");
            return (Criteria) this;
        }

        public Criteria andIsrentoutIsNull() {
            addCriterion("isrentout is null");
            return (Criteria) this;
        }

        public Criteria andIsrentoutIsNotNull() {
            addCriterion("isrentout is not null");
            return (Criteria) this;
        }

        public Criteria andIsrentoutEqualTo(String value) {
            addCriterion("isrentout =", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutNotEqualTo(String value) {
            addCriterion("isrentout <>", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutGreaterThan(String value) {
            addCriterion("isrentout >", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutGreaterThanOrEqualTo(String value) {
            addCriterion("isrentout >=", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutLessThan(String value) {
            addCriterion("isrentout <", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutLessThanOrEqualTo(String value) {
            addCriterion("isrentout <=", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutLike(String value) {
            addCriterion("isrentout like", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutNotLike(String value) {
            addCriterion("isrentout not like", value, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutIn(List<String> values) {
            addCriterion("isrentout in", values, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutNotIn(List<String> values) {
            addCriterion("isrentout not in", values, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutBetween(String value1, String value2) {
            addCriterion("isrentout between", value1, value2, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIsrentoutNotBetween(String value1, String value2) {
            addCriterion("isrentout not between", value1, value2, "isrentout");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomIsNull() {
            addCriterion("iselevatorroom is null");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomIsNotNull() {
            addCriterion("iselevatorroom is not null");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomEqualTo(String value) {
            addCriterion("iselevatorroom =", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomNotEqualTo(String value) {
            addCriterion("iselevatorroom <>", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomGreaterThan(String value) {
            addCriterion("iselevatorroom >", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomGreaterThanOrEqualTo(String value) {
            addCriterion("iselevatorroom >=", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomLessThan(String value) {
            addCriterion("iselevatorroom <", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomLessThanOrEqualTo(String value) {
            addCriterion("iselevatorroom <=", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomLike(String value) {
            addCriterion("iselevatorroom like", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomNotLike(String value) {
            addCriterion("iselevatorroom not like", value, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomIn(List<String> values) {
            addCriterion("iselevatorroom in", values, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomNotIn(List<String> values) {
            addCriterion("iselevatorroom not in", values, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomBetween(String value1, String value2) {
            addCriterion("iselevatorroom between", value1, value2, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIselevatorroomNotBetween(String value1, String value2) {
            addCriterion("iselevatorroom not between", value1, value2, "iselevatorroom");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerIsNull() {
            addCriterion("issubwaynaer is null");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerIsNotNull() {
            addCriterion("issubwaynaer is not null");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerEqualTo(String value) {
            addCriterion("issubwaynaer =", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerNotEqualTo(String value) {
            addCriterion("issubwaynaer <>", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerGreaterThan(String value) {
            addCriterion("issubwaynaer >", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerGreaterThanOrEqualTo(String value) {
            addCriterion("issubwaynaer >=", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerLessThan(String value) {
            addCriterion("issubwaynaer <", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerLessThanOrEqualTo(String value) {
            addCriterion("issubwaynaer <=", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerLike(String value) {
            addCriterion("issubwaynaer like", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerNotLike(String value) {
            addCriterion("issubwaynaer not like", value, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerIn(List<String> values) {
            addCriterion("issubwaynaer in", values, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerNotIn(List<String> values) {
            addCriterion("issubwaynaer not in", values, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerBetween(String value1, String value2) {
            addCriterion("issubwaynaer between", value1, value2, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIssubwaynaerNotBetween(String value1, String value2) {
            addCriterion("issubwaynaer not between", value1, value2, "issubwaynaer");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearIsNull() {
            addCriterion("ishospitalnear is null");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearIsNotNull() {
            addCriterion("ishospitalnear is not null");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearEqualTo(String value) {
            addCriterion("ishospitalnear =", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearNotEqualTo(String value) {
            addCriterion("ishospitalnear <>", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearGreaterThan(String value) {
            addCriterion("ishospitalnear >", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearGreaterThanOrEqualTo(String value) {
            addCriterion("ishospitalnear >=", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearLessThan(String value) {
            addCriterion("ishospitalnear <", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearLessThanOrEqualTo(String value) {
            addCriterion("ishospitalnear <=", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearLike(String value) {
            addCriterion("ishospitalnear like", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearNotLike(String value) {
            addCriterion("ishospitalnear not like", value, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearIn(List<String> values) {
            addCriterion("ishospitalnear in", values, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearNotIn(List<String> values) {
            addCriterion("ishospitalnear not in", values, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearBetween(String value1, String value2) {
            addCriterion("ishospitalnear between", value1, value2, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIshospitalnearNotBetween(String value1, String value2) {
            addCriterion("ishospitalnear not between", value1, value2, "ishospitalnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearIsNull() {
            addCriterion("isschoolnear is null");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearIsNotNull() {
            addCriterion("isschoolnear is not null");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearEqualTo(String value) {
            addCriterion("isschoolnear =", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearNotEqualTo(String value) {
            addCriterion("isschoolnear <>", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearGreaterThan(String value) {
            addCriterion("isschoolnear >", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearGreaterThanOrEqualTo(String value) {
            addCriterion("isschoolnear >=", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearLessThan(String value) {
            addCriterion("isschoolnear <", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearLessThanOrEqualTo(String value) {
            addCriterion("isschoolnear <=", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearLike(String value) {
            addCriterion("isschoolnear like", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearNotLike(String value) {
            addCriterion("isschoolnear not like", value, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearIn(List<String> values) {
            addCriterion("isschoolnear in", values, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearNotIn(List<String> values) {
            addCriterion("isschoolnear not in", values, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearBetween(String value1, String value2) {
            addCriterion("isschoolnear between", value1, value2, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIsschoolnearNotBetween(String value1, String value2) {
            addCriterion("isschoolnear not between", value1, value2, "isschoolnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearIsNull() {
            addCriterion("issupermarketnear is null");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearIsNotNull() {
            addCriterion("issupermarketnear is not null");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearEqualTo(String value) {
            addCriterion("issupermarketnear =", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearNotEqualTo(String value) {
            addCriterion("issupermarketnear <>", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearGreaterThan(String value) {
            addCriterion("issupermarketnear >", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearGreaterThanOrEqualTo(String value) {
            addCriterion("issupermarketnear >=", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearLessThan(String value) {
            addCriterion("issupermarketnear <", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearLessThanOrEqualTo(String value) {
            addCriterion("issupermarketnear <=", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearLike(String value) {
            addCriterion("issupermarketnear like", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearNotLike(String value) {
            addCriterion("issupermarketnear not like", value, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearIn(List<String> values) {
            addCriterion("issupermarketnear in", values, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearNotIn(List<String> values) {
            addCriterion("issupermarketnear not in", values, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearBetween(String value1, String value2) {
            addCriterion("issupermarketnear between", value1, value2, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssupermarketnearNotBetween(String value1, String value2) {
            addCriterion("issupermarketnear not between", value1, value2, "issupermarketnear");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceIsNull() {
            addCriterion("issoleresidence is null");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceIsNotNull() {
            addCriterion("issoleresidence is not null");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceEqualTo(String value) {
            addCriterion("issoleresidence =", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceNotEqualTo(String value) {
            addCriterion("issoleresidence <>", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceGreaterThan(String value) {
            addCriterion("issoleresidence >", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceGreaterThanOrEqualTo(String value) {
            addCriterion("issoleresidence >=", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceLessThan(String value) {
            addCriterion("issoleresidence <", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceLessThanOrEqualTo(String value) {
            addCriterion("issoleresidence <=", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceLike(String value) {
            addCriterion("issoleresidence like", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceNotLike(String value) {
            addCriterion("issoleresidence not like", value, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceIn(List<String> values) {
            addCriterion("issoleresidence in", values, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceNotIn(List<String> values) {
            addCriterion("issoleresidence not in", values, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceBetween(String value1, String value2) {
            addCriterion("issoleresidence between", value1, value2, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andIssoleresidenceNotBetween(String value1, String value2) {
            addCriterion("issoleresidence not between", value1, value2, "issoleresidence");
            return (Criteria) this;
        }

        public Criteria andHistoryrateIsNull() {
            addCriterion("historyrate is null");
            return (Criteria) this;
        }

        public Criteria andHistoryrateIsNotNull() {
            addCriterion("historyrate is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryrateEqualTo(BigDecimal value) {
            addCriterion("historyrate =", value, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateNotEqualTo(BigDecimal value) {
            addCriterion("historyrate <>", value, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateGreaterThan(BigDecimal value) {
            addCriterion("historyrate >", value, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("historyrate >=", value, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateLessThan(BigDecimal value) {
            addCriterion("historyrate <", value, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("historyrate <=", value, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateIn(List<BigDecimal> values) {
            addCriterion("historyrate in", values, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateNotIn(List<BigDecimal> values) {
            addCriterion("historyrate not in", values, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("historyrate between", value1, value2, "historyrate");
            return (Criteria) this;
        }

        public Criteria andHistoryrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("historyrate not between", value1, value2, "historyrate");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceIsNull() {
            addCriterion("buyerfasttransprice is null");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceIsNotNull() {
            addCriterion("buyerfasttransprice is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceEqualTo(BigDecimal value) {
            addCriterion("buyerfasttransprice =", value, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceNotEqualTo(BigDecimal value) {
            addCriterion("buyerfasttransprice <>", value, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceGreaterThan(BigDecimal value) {
            addCriterion("buyerfasttransprice >", value, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buyerfasttransprice >=", value, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceLessThan(BigDecimal value) {
            addCriterion("buyerfasttransprice <", value, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buyerfasttransprice <=", value, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceIn(List<BigDecimal> values) {
            addCriterion("buyerfasttransprice in", values, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceNotIn(List<BigDecimal> values) {
            addCriterion("buyerfasttransprice not in", values, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyerfasttransprice between", value1, value2, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andBuyerfasttranspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buyerfasttransprice not between", value1, value2, "buyerfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceIsNull() {
            addCriterion("sellersfasttransprice is null");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceIsNotNull() {
            addCriterion("sellersfasttransprice is not null");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceEqualTo(BigDecimal value) {
            addCriterion("sellersfasttransprice =", value, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceNotEqualTo(BigDecimal value) {
            addCriterion("sellersfasttransprice <>", value, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceGreaterThan(BigDecimal value) {
            addCriterion("sellersfasttransprice >", value, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sellersfasttransprice >=", value, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceLessThan(BigDecimal value) {
            addCriterion("sellersfasttransprice <", value, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sellersfasttransprice <=", value, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceIn(List<BigDecimal> values) {
            addCriterion("sellersfasttransprice in", values, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceNotIn(List<BigDecimal> values) {
            addCriterion("sellersfasttransprice not in", values, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sellersfasttransprice between", value1, value2, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andSellersfasttranspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sellersfasttransprice not between", value1, value2, "sellersfasttransprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceIsNull() {
            addCriterion("hangingprice is null");
            return (Criteria) this;
        }

        public Criteria andHangingpriceIsNotNull() {
            addCriterion("hangingprice is not null");
            return (Criteria) this;
        }

        public Criteria andHangingpriceEqualTo(BigDecimal value) {
            addCriterion("hangingprice =", value, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceNotEqualTo(BigDecimal value) {
            addCriterion("hangingprice <>", value, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceGreaterThan(BigDecimal value) {
            addCriterion("hangingprice >", value, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hangingprice >=", value, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceLessThan(BigDecimal value) {
            addCriterion("hangingprice <", value, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hangingprice <=", value, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceIn(List<BigDecimal> values) {
            addCriterion("hangingprice in", values, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceNotIn(List<BigDecimal> values) {
            addCriterion("hangingprice not in", values, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hangingprice between", value1, value2, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andHangingpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hangingprice not between", value1, value2, "hangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceIsNull() {
            addCriterion("currenthangingprice is null");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceIsNotNull() {
            addCriterion("currenthangingprice is not null");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceEqualTo(BigDecimal value) {
            addCriterion("currenthangingprice =", value, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceNotEqualTo(BigDecimal value) {
            addCriterion("currenthangingprice <>", value, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceGreaterThan(BigDecimal value) {
            addCriterion("currenthangingprice >", value, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currenthangingprice >=", value, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceLessThan(BigDecimal value) {
            addCriterion("currenthangingprice <", value, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currenthangingprice <=", value, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceIn(List<BigDecimal> values) {
            addCriterion("currenthangingprice in", values, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceNotIn(List<BigDecimal> values) {
            addCriterion("currenthangingprice not in", values, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currenthangingprice between", value1, value2, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andCurrenthangingpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currenthangingprice not between", value1, value2, "currenthangingprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceIsNull() {
            addCriterion("houseunitprice is null");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceIsNotNull() {
            addCriterion("houseunitprice is not null");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceEqualTo(BigDecimal value) {
            addCriterion("houseunitprice =", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceNotEqualTo(BigDecimal value) {
            addCriterion("houseunitprice <>", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceGreaterThan(BigDecimal value) {
            addCriterion("houseunitprice >", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("houseunitprice >=", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceLessThan(BigDecimal value) {
            addCriterion("houseunitprice <", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("houseunitprice <=", value, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceIn(List<BigDecimal> values) {
            addCriterion("houseunitprice in", values, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceNotIn(List<BigDecimal> values) {
            addCriterion("houseunitprice not in", values, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("houseunitprice between", value1, value2, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHouseunitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("houseunitprice not between", value1, value2, "houseunitprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceIsNull() {
            addCriterion("housetotalprice is null");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceIsNotNull() {
            addCriterion("housetotalprice is not null");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceEqualTo(BigDecimal value) {
            addCriterion("housetotalprice =", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("housetotalprice <>", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceGreaterThan(BigDecimal value) {
            addCriterion("housetotalprice >", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("housetotalprice >=", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceLessThan(BigDecimal value) {
            addCriterion("housetotalprice <", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("housetotalprice <=", value, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceIn(List<BigDecimal> values) {
            addCriterion("housetotalprice in", values, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("housetotalprice not in", values, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housetotalprice between", value1, value2, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andHousetotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housetotalprice not between", value1, value2, "housetotalprice");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesIsNull() {
            addCriterion("isjudgenotclearlynotes is null");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesIsNotNull() {
            addCriterion("isjudgenotclearlynotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesEqualTo(String value) {
            addCriterion("isjudgenotclearlynotes =", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesNotEqualTo(String value) {
            addCriterion("isjudgenotclearlynotes <>", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesGreaterThan(String value) {
            addCriterion("isjudgenotclearlynotes >", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesGreaterThanOrEqualTo(String value) {
            addCriterion("isjudgenotclearlynotes >=", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesLessThan(String value) {
            addCriterion("isjudgenotclearlynotes <", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesLessThanOrEqualTo(String value) {
            addCriterion("isjudgenotclearlynotes <=", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesLike(String value) {
            addCriterion("isjudgenotclearlynotes like", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesNotLike(String value) {
            addCriterion("isjudgenotclearlynotes not like", value, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesIn(List<String> values) {
            addCriterion("isjudgenotclearlynotes in", values, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesNotIn(List<String> values) {
            addCriterion("isjudgenotclearlynotes not in", values, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesBetween(String value1, String value2) {
            addCriterion("isjudgenotclearlynotes between", value1, value2, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlynotesNotBetween(String value1, String value2) {
            addCriterion("isjudgenotclearlynotes not between", value1, value2, "isjudgenotclearlynotes");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyIsNull() {
            addCriterion("isjudgenotclearly is null");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyIsNotNull() {
            addCriterion("isjudgenotclearly is not null");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyEqualTo(String value) {
            addCriterion("isjudgenotclearly =", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyNotEqualTo(String value) {
            addCriterion("isjudgenotclearly <>", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyGreaterThan(String value) {
            addCriterion("isjudgenotclearly >", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyGreaterThanOrEqualTo(String value) {
            addCriterion("isjudgenotclearly >=", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyLessThan(String value) {
            addCriterion("isjudgenotclearly <", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyLessThanOrEqualTo(String value) {
            addCriterion("isjudgenotclearly <=", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyLike(String value) {
            addCriterion("isjudgenotclearly like", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyNotLike(String value) {
            addCriterion("isjudgenotclearly not like", value, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyIn(List<String> values) {
            addCriterion("isjudgenotclearly in", values, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyNotIn(List<String> values) {
            addCriterion("isjudgenotclearly not in", values, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyBetween(String value1, String value2) {
            addCriterion("isjudgenotclearly between", value1, value2, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIsjudgenotclearlyNotBetween(String value1, String value2) {
            addCriterion("isjudgenotclearly not between", value1, value2, "isjudgenotclearly");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesIsNull() {
            addCriterion("issalelimitnotes is null");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesIsNotNull() {
            addCriterion("issalelimitnotes is not null");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesEqualTo(String value) {
            addCriterion("issalelimitnotes =", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesNotEqualTo(String value) {
            addCriterion("issalelimitnotes <>", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesGreaterThan(String value) {
            addCriterion("issalelimitnotes >", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesGreaterThanOrEqualTo(String value) {
            addCriterion("issalelimitnotes >=", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesLessThan(String value) {
            addCriterion("issalelimitnotes <", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesLessThanOrEqualTo(String value) {
            addCriterion("issalelimitnotes <=", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesLike(String value) {
            addCriterion("issalelimitnotes like", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesNotLike(String value) {
            addCriterion("issalelimitnotes not like", value, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesIn(List<String> values) {
            addCriterion("issalelimitnotes in", values, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesNotIn(List<String> values) {
            addCriterion("issalelimitnotes not in", values, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesBetween(String value1, String value2) {
            addCriterion("issalelimitnotes between", value1, value2, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitnotesNotBetween(String value1, String value2) {
            addCriterion("issalelimitnotes not between", value1, value2, "issalelimitnotes");
            return (Criteria) this;
        }

        public Criteria andIssalelimitIsNull() {
            addCriterion("issalelimit is null");
            return (Criteria) this;
        }

        public Criteria andIssalelimitIsNotNull() {
            addCriterion("issalelimit is not null");
            return (Criteria) this;
        }

        public Criteria andIssalelimitEqualTo(String value) {
            addCriterion("issalelimit =", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitNotEqualTo(String value) {
            addCriterion("issalelimit <>", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitGreaterThan(String value) {
            addCriterion("issalelimit >", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitGreaterThanOrEqualTo(String value) {
            addCriterion("issalelimit >=", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitLessThan(String value) {
            addCriterion("issalelimit <", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitLessThanOrEqualTo(String value) {
            addCriterion("issalelimit <=", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitLike(String value) {
            addCriterion("issalelimit like", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitNotLike(String value) {
            addCriterion("issalelimit not like", value, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitIn(List<String> values) {
            addCriterion("issalelimit in", values, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitNotIn(List<String> values) {
            addCriterion("issalelimit not in", values, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitBetween(String value1, String value2) {
            addCriterion("issalelimit between", value1, value2, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIssalelimitNotBetween(String value1, String value2) {
            addCriterion("issalelimit not between", value1, value2, "issalelimit");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesIsNull() {
            addCriterion("isnotsameofhousenotes is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesIsNotNull() {
            addCriterion("isnotsameofhousenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesEqualTo(String value) {
            addCriterion("isnotsameofhousenotes =", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesNotEqualTo(String value) {
            addCriterion("isnotsameofhousenotes <>", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesGreaterThan(String value) {
            addCriterion("isnotsameofhousenotes >", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsameofhousenotes >=", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesLessThan(String value) {
            addCriterion("isnotsameofhousenotes <", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesLessThanOrEqualTo(String value) {
            addCriterion("isnotsameofhousenotes <=", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesLike(String value) {
            addCriterion("isnotsameofhousenotes like", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesNotLike(String value) {
            addCriterion("isnotsameofhousenotes not like", value, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesIn(List<String> values) {
            addCriterion("isnotsameofhousenotes in", values, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesNotIn(List<String> values) {
            addCriterion("isnotsameofhousenotes not in", values, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesBetween(String value1, String value2) {
            addCriterion("isnotsameofhousenotes between", value1, value2, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhousenotesNotBetween(String value1, String value2) {
            addCriterion("isnotsameofhousenotes not between", value1, value2, "isnotsameofhousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseIsNull() {
            addCriterion("isnotsameofhouse is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseIsNotNull() {
            addCriterion("isnotsameofhouse is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseEqualTo(String value) {
            addCriterion("isnotsameofhouse =", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseNotEqualTo(String value) {
            addCriterion("isnotsameofhouse <>", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseGreaterThan(String value) {
            addCriterion("isnotsameofhouse >", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsameofhouse >=", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseLessThan(String value) {
            addCriterion("isnotsameofhouse <", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseLessThanOrEqualTo(String value) {
            addCriterion("isnotsameofhouse <=", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseLike(String value) {
            addCriterion("isnotsameofhouse like", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseNotLike(String value) {
            addCriterion("isnotsameofhouse not like", value, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseIn(List<String> values) {
            addCriterion("isnotsameofhouse in", values, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseNotIn(List<String> values) {
            addCriterion("isnotsameofhouse not in", values, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseBetween(String value1, String value2) {
            addCriterion("isnotsameofhouse between", value1, value2, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofhouseNotBetween(String value1, String value2) {
            addCriterion("isnotsameofhouse not between", value1, value2, "isnotsameofhouse");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesIsNull() {
            addCriterion("isselfreformnotes is null");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesIsNotNull() {
            addCriterion("isselfreformnotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesEqualTo(String value) {
            addCriterion("isselfreformnotes =", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesNotEqualTo(String value) {
            addCriterion("isselfreformnotes <>", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesGreaterThan(String value) {
            addCriterion("isselfreformnotes >", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesGreaterThanOrEqualTo(String value) {
            addCriterion("isselfreformnotes >=", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesLessThan(String value) {
            addCriterion("isselfreformnotes <", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesLessThanOrEqualTo(String value) {
            addCriterion("isselfreformnotes <=", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesLike(String value) {
            addCriterion("isselfreformnotes like", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesNotLike(String value) {
            addCriterion("isselfreformnotes not like", value, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesIn(List<String> values) {
            addCriterion("isselfreformnotes in", values, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesNotIn(List<String> values) {
            addCriterion("isselfreformnotes not in", values, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesBetween(String value1, String value2) {
            addCriterion("isselfreformnotes between", value1, value2, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformnotesNotBetween(String value1, String value2) {
            addCriterion("isselfreformnotes not between", value1, value2, "isselfreformnotes");
            return (Criteria) this;
        }

        public Criteria andIsselfreformIsNull() {
            addCriterion("isselfreform is null");
            return (Criteria) this;
        }

        public Criteria andIsselfreformIsNotNull() {
            addCriterion("isselfreform is not null");
            return (Criteria) this;
        }

        public Criteria andIsselfreformEqualTo(String value) {
            addCriterion("isselfreform =", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformNotEqualTo(String value) {
            addCriterion("isselfreform <>", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformGreaterThan(String value) {
            addCriterion("isselfreform >", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformGreaterThanOrEqualTo(String value) {
            addCriterion("isselfreform >=", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformLessThan(String value) {
            addCriterion("isselfreform <", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformLessThanOrEqualTo(String value) {
            addCriterion("isselfreform <=", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformLike(String value) {
            addCriterion("isselfreform like", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformNotLike(String value) {
            addCriterion("isselfreform not like", value, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformIn(List<String> values) {
            addCriterion("isselfreform in", values, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformNotIn(List<String> values) {
            addCriterion("isselfreform not in", values, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformBetween(String value1, String value2) {
            addCriterion("isselfreform between", value1, value2, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsselfreformNotBetween(String value1, String value2) {
            addCriterion("isselfreform not between", value1, value2, "isselfreform");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesIsNull() {
            addCriterion("isnotsafehousenotes is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesIsNotNull() {
            addCriterion("isnotsafehousenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesEqualTo(String value) {
            addCriterion("isnotsafehousenotes =", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesNotEqualTo(String value) {
            addCriterion("isnotsafehousenotes <>", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesGreaterThan(String value) {
            addCriterion("isnotsafehousenotes >", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsafehousenotes >=", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesLessThan(String value) {
            addCriterion("isnotsafehousenotes <", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesLessThanOrEqualTo(String value) {
            addCriterion("isnotsafehousenotes <=", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesLike(String value) {
            addCriterion("isnotsafehousenotes like", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesNotLike(String value) {
            addCriterion("isnotsafehousenotes not like", value, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesIn(List<String> values) {
            addCriterion("isnotsafehousenotes in", values, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesNotIn(List<String> values) {
            addCriterion("isnotsafehousenotes not in", values, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesBetween(String value1, String value2) {
            addCriterion("isnotsafehousenotes between", value1, value2, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehousenotesNotBetween(String value1, String value2) {
            addCriterion("isnotsafehousenotes not between", value1, value2, "isnotsafehousenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseIsNull() {
            addCriterion("isnotsafehouse is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseIsNotNull() {
            addCriterion("isnotsafehouse is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseEqualTo(String value) {
            addCriterion("isnotsafehouse =", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseNotEqualTo(String value) {
            addCriterion("isnotsafehouse <>", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseGreaterThan(String value) {
            addCriterion("isnotsafehouse >", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsafehouse >=", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseLessThan(String value) {
            addCriterion("isnotsafehouse <", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseLessThanOrEqualTo(String value) {
            addCriterion("isnotsafehouse <=", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseLike(String value) {
            addCriterion("isnotsafehouse like", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseNotLike(String value) {
            addCriterion("isnotsafehouse not like", value, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseIn(List<String> values) {
            addCriterion("isnotsafehouse in", values, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseNotIn(List<String> values) {
            addCriterion("isnotsafehouse not in", values, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseBetween(String value1, String value2) {
            addCriterion("isnotsafehouse between", value1, value2, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsnotsafehouseNotBetween(String value1, String value2) {
            addCriterion("isnotsafehouse not between", value1, value2, "isnotsafehouse");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesIsNull() {
            addCriterion("isproblemcasenotes is null");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesIsNotNull() {
            addCriterion("isproblemcasenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesEqualTo(String value) {
            addCriterion("isproblemcasenotes =", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesNotEqualTo(String value) {
            addCriterion("isproblemcasenotes <>", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesGreaterThan(String value) {
            addCriterion("isproblemcasenotes >", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesGreaterThanOrEqualTo(String value) {
            addCriterion("isproblemcasenotes >=", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesLessThan(String value) {
            addCriterion("isproblemcasenotes <", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesLessThanOrEqualTo(String value) {
            addCriterion("isproblemcasenotes <=", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesLike(String value) {
            addCriterion("isproblemcasenotes like", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesNotLike(String value) {
            addCriterion("isproblemcasenotes not like", value, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesIn(List<String> values) {
            addCriterion("isproblemcasenotes in", values, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesNotIn(List<String> values) {
            addCriterion("isproblemcasenotes not in", values, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesBetween(String value1, String value2) {
            addCriterion("isproblemcasenotes between", value1, value2, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcasenotesNotBetween(String value1, String value2) {
            addCriterion("isproblemcasenotes not between", value1, value2, "isproblemcasenotes");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseIsNull() {
            addCriterion("isproblemcase is null");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseIsNotNull() {
            addCriterion("isproblemcase is not null");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseEqualTo(String value) {
            addCriterion("isproblemcase =", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseNotEqualTo(String value) {
            addCriterion("isproblemcase <>", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseGreaterThan(String value) {
            addCriterion("isproblemcase >", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseGreaterThanOrEqualTo(String value) {
            addCriterion("isproblemcase >=", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseLessThan(String value) {
            addCriterion("isproblemcase <", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseLessThanOrEqualTo(String value) {
            addCriterion("isproblemcase <=", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseLike(String value) {
            addCriterion("isproblemcase like", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseNotLike(String value) {
            addCriterion("isproblemcase not like", value, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseIn(List<String> values) {
            addCriterion("isproblemcase in", values, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseNotIn(List<String> values) {
            addCriterion("isproblemcase not in", values, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseBetween(String value1, String value2) {
            addCriterion("isproblemcase between", value1, value2, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIsproblemcaseNotBetween(String value1, String value2) {
            addCriterion("isproblemcase not between", value1, value2, "isproblemcase");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesIsNull() {
            addCriterion("issinglebuildingnotes is null");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesIsNotNull() {
            addCriterion("issinglebuildingnotes is not null");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesEqualTo(String value) {
            addCriterion("issinglebuildingnotes =", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesNotEqualTo(String value) {
            addCriterion("issinglebuildingnotes <>", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesGreaterThan(String value) {
            addCriterion("issinglebuildingnotes >", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesGreaterThanOrEqualTo(String value) {
            addCriterion("issinglebuildingnotes >=", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesLessThan(String value) {
            addCriterion("issinglebuildingnotes <", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesLessThanOrEqualTo(String value) {
            addCriterion("issinglebuildingnotes <=", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesLike(String value) {
            addCriterion("issinglebuildingnotes like", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesNotLike(String value) {
            addCriterion("issinglebuildingnotes not like", value, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesIn(List<String> values) {
            addCriterion("issinglebuildingnotes in", values, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesNotIn(List<String> values) {
            addCriterion("issinglebuildingnotes not in", values, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesBetween(String value1, String value2) {
            addCriterion("issinglebuildingnotes between", value1, value2, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingnotesNotBetween(String value1, String value2) {
            addCriterion("issinglebuildingnotes not between", value1, value2, "issinglebuildingnotes");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingIsNull() {
            addCriterion("issinglebuilding is null");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingIsNotNull() {
            addCriterion("issinglebuilding is not null");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingEqualTo(String value) {
            addCriterion("issinglebuilding =", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingNotEqualTo(String value) {
            addCriterion("issinglebuilding <>", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingGreaterThan(String value) {
            addCriterion("issinglebuilding >", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingGreaterThanOrEqualTo(String value) {
            addCriterion("issinglebuilding >=", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingLessThan(String value) {
            addCriterion("issinglebuilding <", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingLessThanOrEqualTo(String value) {
            addCriterion("issinglebuilding <=", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingLike(String value) {
            addCriterion("issinglebuilding like", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingNotLike(String value) {
            addCriterion("issinglebuilding not like", value, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingIn(List<String> values) {
            addCriterion("issinglebuilding in", values, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingNotIn(List<String> values) {
            addCriterion("issinglebuilding not in", values, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingBetween(String value1, String value2) {
            addCriterion("issinglebuilding between", value1, value2, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIssinglebuildingNotBetween(String value1, String value2) {
            addCriterion("issinglebuilding not between", value1, value2, "issinglebuilding");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesIsNull() {
            addCriterion("isnotsameofownernotes is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesIsNotNull() {
            addCriterion("isnotsameofownernotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesEqualTo(String value) {
            addCriterion("isnotsameofownernotes =", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesNotEqualTo(String value) {
            addCriterion("isnotsameofownernotes <>", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesGreaterThan(String value) {
            addCriterion("isnotsameofownernotes >", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsameofownernotes >=", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesLessThan(String value) {
            addCriterion("isnotsameofownernotes <", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesLessThanOrEqualTo(String value) {
            addCriterion("isnotsameofownernotes <=", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesLike(String value) {
            addCriterion("isnotsameofownernotes like", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesNotLike(String value) {
            addCriterion("isnotsameofownernotes not like", value, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesIn(List<String> values) {
            addCriterion("isnotsameofownernotes in", values, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesNotIn(List<String> values) {
            addCriterion("isnotsameofownernotes not in", values, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesBetween(String value1, String value2) {
            addCriterion("isnotsameofownernotes between", value1, value2, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownernotesNotBetween(String value1, String value2) {
            addCriterion("isnotsameofownernotes not between", value1, value2, "isnotsameofownernotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerIsNull() {
            addCriterion("isnotsameofowner is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerIsNotNull() {
            addCriterion("isnotsameofowner is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerEqualTo(String value) {
            addCriterion("isnotsameofowner =", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerNotEqualTo(String value) {
            addCriterion("isnotsameofowner <>", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerGreaterThan(String value) {
            addCriterion("isnotsameofowner >", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsameofowner >=", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerLessThan(String value) {
            addCriterion("isnotsameofowner <", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerLessThanOrEqualTo(String value) {
            addCriterion("isnotsameofowner <=", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerLike(String value) {
            addCriterion("isnotsameofowner like", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerNotLike(String value) {
            addCriterion("isnotsameofowner not like", value, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerIn(List<String> values) {
            addCriterion("isnotsameofowner in", values, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerNotIn(List<String> values) {
            addCriterion("isnotsameofowner not in", values, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerBetween(String value1, String value2) {
            addCriterion("isnotsameofowner between", value1, value2, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsnotsameofownerNotBetween(String value1, String value2) {
            addCriterion("isnotsameofowner not between", value1, value2, "isnotsameofowner");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesIsNull() {
            addCriterion("isgenerationnotes is null");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesIsNotNull() {
            addCriterion("isgenerationnotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesEqualTo(String value) {
            addCriterion("isgenerationnotes =", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesNotEqualTo(String value) {
            addCriterion("isgenerationnotes <>", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesGreaterThan(String value) {
            addCriterion("isgenerationnotes >", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesGreaterThanOrEqualTo(String value) {
            addCriterion("isgenerationnotes >=", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesLessThan(String value) {
            addCriterion("isgenerationnotes <", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesLessThanOrEqualTo(String value) {
            addCriterion("isgenerationnotes <=", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesLike(String value) {
            addCriterion("isgenerationnotes like", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesNotLike(String value) {
            addCriterion("isgenerationnotes not like", value, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesIn(List<String> values) {
            addCriterion("isgenerationnotes in", values, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesNotIn(List<String> values) {
            addCriterion("isgenerationnotes not in", values, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesBetween(String value1, String value2) {
            addCriterion("isgenerationnotes between", value1, value2, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationnotesNotBetween(String value1, String value2) {
            addCriterion("isgenerationnotes not between", value1, value2, "isgenerationnotes");
            return (Criteria) this;
        }

        public Criteria andIsgenerationIsNull() {
            addCriterion("isgeneration is null");
            return (Criteria) this;
        }

        public Criteria andIsgenerationIsNotNull() {
            addCriterion("isgeneration is not null");
            return (Criteria) this;
        }

        public Criteria andIsgenerationEqualTo(String value) {
            addCriterion("isgeneration =", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationNotEqualTo(String value) {
            addCriterion("isgeneration <>", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationGreaterThan(String value) {
            addCriterion("isgeneration >", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationGreaterThanOrEqualTo(String value) {
            addCriterion("isgeneration >=", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationLessThan(String value) {
            addCriterion("isgeneration <", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationLessThanOrEqualTo(String value) {
            addCriterion("isgeneration <=", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationLike(String value) {
            addCriterion("isgeneration like", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationNotLike(String value) {
            addCriterion("isgeneration not like", value, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationIn(List<String> values) {
            addCriterion("isgeneration in", values, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationNotIn(List<String> values) {
            addCriterion("isgeneration not in", values, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationBetween(String value1, String value2) {
            addCriterion("isgeneration between", value1, value2, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsgenerationNotBetween(String value1, String value2) {
            addCriterion("isgeneration not between", value1, value2, "isgeneration");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonIsNull() {
            addCriterion("isbadactionperson is null");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonIsNotNull() {
            addCriterion("isbadactionperson is not null");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonEqualTo(String value) {
            addCriterion("isbadactionperson =", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonNotEqualTo(String value) {
            addCriterion("isbadactionperson <>", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonGreaterThan(String value) {
            addCriterion("isbadactionperson >", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonGreaterThanOrEqualTo(String value) {
            addCriterion("isbadactionperson >=", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonLessThan(String value) {
            addCriterion("isbadactionperson <", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonLessThanOrEqualTo(String value) {
            addCriterion("isbadactionperson <=", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonLike(String value) {
            addCriterion("isbadactionperson like", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonNotLike(String value) {
            addCriterion("isbadactionperson not like", value, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonIn(List<String> values) {
            addCriterion("isbadactionperson in", values, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonNotIn(List<String> values) {
            addCriterion("isbadactionperson not in", values, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonBetween(String value1, String value2) {
            addCriterion("isbadactionperson between", value1, value2, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsbadactionpersonNotBetween(String value1, String value2) {
            addCriterion("isbadactionperson not between", value1, value2, "isbadactionperson");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesIsNull() {
            addCriterion("isnotsamenotes is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesIsNotNull() {
            addCriterion("isnotsamenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesEqualTo(String value) {
            addCriterion("isnotsamenotes =", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesNotEqualTo(String value) {
            addCriterion("isnotsamenotes <>", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesGreaterThan(String value) {
            addCriterion("isnotsamenotes >", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsamenotes >=", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesLessThan(String value) {
            addCriterion("isnotsamenotes <", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesLessThanOrEqualTo(String value) {
            addCriterion("isnotsamenotes <=", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesLike(String value) {
            addCriterion("isnotsamenotes like", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesNotLike(String value) {
            addCriterion("isnotsamenotes not like", value, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesIn(List<String> values) {
            addCriterion("isnotsamenotes in", values, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesNotIn(List<String> values) {
            addCriterion("isnotsamenotes not in", values, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesBetween(String value1, String value2) {
            addCriterion("isnotsamenotes between", value1, value2, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsamenotesNotBetween(String value1, String value2) {
            addCriterion("isnotsamenotes not between", value1, value2, "isnotsamenotes");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoIsNull() {
            addCriterion("isnotsameoffamilyinfo is null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoIsNotNull() {
            addCriterion("isnotsameoffamilyinfo is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoEqualTo(String value) {
            addCriterion("isnotsameoffamilyinfo =", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoNotEqualTo(String value) {
            addCriterion("isnotsameoffamilyinfo <>", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoGreaterThan(String value) {
            addCriterion("isnotsameoffamilyinfo >", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoGreaterThanOrEqualTo(String value) {
            addCriterion("isnotsameoffamilyinfo >=", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoLessThan(String value) {
            addCriterion("isnotsameoffamilyinfo <", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoLessThanOrEqualTo(String value) {
            addCriterion("isnotsameoffamilyinfo <=", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoLike(String value) {
            addCriterion("isnotsameoffamilyinfo like", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoNotLike(String value) {
            addCriterion("isnotsameoffamilyinfo not like", value, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoIn(List<String> values) {
            addCriterion("isnotsameoffamilyinfo in", values, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoNotIn(List<String> values) {
            addCriterion("isnotsameoffamilyinfo not in", values, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoBetween(String value1, String value2) {
            addCriterion("isnotsameoffamilyinfo between", value1, value2, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andIsnotsameoffamilyinfoNotBetween(String value1, String value2) {
            addCriterion("isnotsameoffamilyinfo not between", value1, value2, "isnotsameoffamilyinfo");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesIsNull() {
            addCriterion("dateduebignotes is null");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesIsNotNull() {
            addCriterion("dateduebignotes is not null");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesEqualTo(String value) {
            addCriterion("dateduebignotes =", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesNotEqualTo(String value) {
            addCriterion("dateduebignotes <>", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesGreaterThan(String value) {
            addCriterion("dateduebignotes >", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesGreaterThanOrEqualTo(String value) {
            addCriterion("dateduebignotes >=", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesLessThan(String value) {
            addCriterion("dateduebignotes <", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesLessThanOrEqualTo(String value) {
            addCriterion("dateduebignotes <=", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesLike(String value) {
            addCriterion("dateduebignotes like", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesNotLike(String value) {
            addCriterion("dateduebignotes not like", value, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesIn(List<String> values) {
            addCriterion("dateduebignotes in", values, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesNotIn(List<String> values) {
            addCriterion("dateduebignotes not in", values, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesBetween(String value1, String value2) {
            addCriterion("dateduebignotes between", value1, value2, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andDateduebignotesNotBetween(String value1, String value2) {
            addCriterion("dateduebignotes not between", value1, value2, "dateduebignotes");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueIsNull() {
            addCriterion("istenantbiggerdatedue is null");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueIsNotNull() {
            addCriterion("istenantbiggerdatedue is not null");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueEqualTo(String value) {
            addCriterion("istenantbiggerdatedue =", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueNotEqualTo(String value) {
            addCriterion("istenantbiggerdatedue <>", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueGreaterThan(String value) {
            addCriterion("istenantbiggerdatedue >", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueGreaterThanOrEqualTo(String value) {
            addCriterion("istenantbiggerdatedue >=", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueLessThan(String value) {
            addCriterion("istenantbiggerdatedue <", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueLessThanOrEqualTo(String value) {
            addCriterion("istenantbiggerdatedue <=", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueLike(String value) {
            addCriterion("istenantbiggerdatedue like", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueNotLike(String value) {
            addCriterion("istenantbiggerdatedue not like", value, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueIn(List<String> values) {
            addCriterion("istenantbiggerdatedue in", values, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueNotIn(List<String> values) {
            addCriterion("istenantbiggerdatedue not in", values, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueBetween(String value1, String value2) {
            addCriterion("istenantbiggerdatedue between", value1, value2, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andIstenantbiggerdatedueNotBetween(String value1, String value2) {
            addCriterion("istenantbiggerdatedue not between", value1, value2, "istenantbiggerdatedue");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesIsNull() {
            addCriterion("importdefectsnotes is null");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesIsNotNull() {
            addCriterion("importdefectsnotes is not null");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesEqualTo(String value) {
            addCriterion("importdefectsnotes =", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesNotEqualTo(String value) {
            addCriterion("importdefectsnotes <>", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesGreaterThan(String value) {
            addCriterion("importdefectsnotes >", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesGreaterThanOrEqualTo(String value) {
            addCriterion("importdefectsnotes >=", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesLessThan(String value) {
            addCriterion("importdefectsnotes <", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesLessThanOrEqualTo(String value) {
            addCriterion("importdefectsnotes <=", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesLike(String value) {
            addCriterion("importdefectsnotes like", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesNotLike(String value) {
            addCriterion("importdefectsnotes not like", value, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesIn(List<String> values) {
            addCriterion("importdefectsnotes in", values, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesNotIn(List<String> values) {
            addCriterion("importdefectsnotes not in", values, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesBetween(String value1, String value2) {
            addCriterion("importdefectsnotes between", value1, value2, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andImportdefectsnotesNotBetween(String value1, String value2) {
            addCriterion("importdefectsnotes not between", value1, value2, "importdefectsnotes");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsIsNull() {
            addCriterion("isimportdefects is null");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsIsNotNull() {
            addCriterion("isimportdefects is not null");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsEqualTo(String value) {
            addCriterion("isimportdefects =", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsNotEqualTo(String value) {
            addCriterion("isimportdefects <>", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsGreaterThan(String value) {
            addCriterion("isimportdefects >", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsGreaterThanOrEqualTo(String value) {
            addCriterion("isimportdefects >=", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsLessThan(String value) {
            addCriterion("isimportdefects <", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsLessThanOrEqualTo(String value) {
            addCriterion("isimportdefects <=", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsLike(String value) {
            addCriterion("isimportdefects like", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsNotLike(String value) {
            addCriterion("isimportdefects not like", value, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsIn(List<String> values) {
            addCriterion("isimportdefects in", values, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsNotIn(List<String> values) {
            addCriterion("isimportdefects not in", values, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsBetween(String value1, String value2) {
            addCriterion("isimportdefects between", value1, value2, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIsimportdefectsNotBetween(String value1, String value2) {
            addCriterion("isimportdefects not between", value1, value2, "isimportdefects");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesIsNull() {
            addCriterion("islistingsalenotes is null");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesIsNotNull() {
            addCriterion("islistingsalenotes is not null");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesEqualTo(String value) {
            addCriterion("islistingsalenotes =", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesNotEqualTo(String value) {
            addCriterion("islistingsalenotes <>", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesGreaterThan(String value) {
            addCriterion("islistingsalenotes >", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesGreaterThanOrEqualTo(String value) {
            addCriterion("islistingsalenotes >=", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesLessThan(String value) {
            addCriterion("islistingsalenotes <", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesLessThanOrEqualTo(String value) {
            addCriterion("islistingsalenotes <=", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesLike(String value) {
            addCriterion("islistingsalenotes like", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesNotLike(String value) {
            addCriterion("islistingsalenotes not like", value, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesIn(List<String> values) {
            addCriterion("islistingsalenotes in", values, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesNotIn(List<String> values) {
            addCriterion("islistingsalenotes not in", values, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesBetween(String value1, String value2) {
            addCriterion("islistingsalenotes between", value1, value2, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsalenotesNotBetween(String value1, String value2) {
            addCriterion("islistingsalenotes not between", value1, value2, "islistingsalenotes");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleIsNull() {
            addCriterion("islistingsale is null");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleIsNotNull() {
            addCriterion("islistingsale is not null");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleEqualTo(String value) {
            addCriterion("islistingsale =", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleNotEqualTo(String value) {
            addCriterion("islistingsale <>", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleGreaterThan(String value) {
            addCriterion("islistingsale >", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleGreaterThanOrEqualTo(String value) {
            addCriterion("islistingsale >=", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleLessThan(String value) {
            addCriterion("islistingsale <", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleLessThanOrEqualTo(String value) {
            addCriterion("islistingsale <=", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleLike(String value) {
            addCriterion("islistingsale like", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleNotLike(String value) {
            addCriterion("islistingsale not like", value, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleIn(List<String> values) {
            addCriterion("islistingsale in", values, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleNotIn(List<String> values) {
            addCriterion("islistingsale not in", values, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleBetween(String value1, String value2) {
            addCriterion("islistingsale between", value1, value2, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andIslistingsaleNotBetween(String value1, String value2) {
            addCriterion("islistingsale not between", value1, value2, "islistingsale");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesIsNull() {
            addCriterion("longtimenorecordnotes is null");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesIsNotNull() {
            addCriterion("longtimenorecordnotes is not null");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesEqualTo(String value) {
            addCriterion("longtimenorecordnotes =", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesNotEqualTo(String value) {
            addCriterion("longtimenorecordnotes <>", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesGreaterThan(String value) {
            addCriterion("longtimenorecordnotes >", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesGreaterThanOrEqualTo(String value) {
            addCriterion("longtimenorecordnotes >=", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesLessThan(String value) {
            addCriterion("longtimenorecordnotes <", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesLessThanOrEqualTo(String value) {
            addCriterion("longtimenorecordnotes <=", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesLike(String value) {
            addCriterion("longtimenorecordnotes like", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesNotLike(String value) {
            addCriterion("longtimenorecordnotes not like", value, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesIn(List<String> values) {
            addCriterion("longtimenorecordnotes in", values, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesNotIn(List<String> values) {
            addCriterion("longtimenorecordnotes not in", values, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesBetween(String value1, String value2) {
            addCriterion("longtimenorecordnotes between", value1, value2, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordnotesNotBetween(String value1, String value2) {
            addCriterion("longtimenorecordnotes not between", value1, value2, "longtimenorecordnotes");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordIsNull() {
            addCriterion("longtimenorecord is null");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordIsNotNull() {
            addCriterion("longtimenorecord is not null");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordEqualTo(String value) {
            addCriterion("longtimenorecord =", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordNotEqualTo(String value) {
            addCriterion("longtimenorecord <>", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordGreaterThan(String value) {
            addCriterion("longtimenorecord >", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordGreaterThanOrEqualTo(String value) {
            addCriterion("longtimenorecord >=", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordLessThan(String value) {
            addCriterion("longtimenorecord <", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordLessThanOrEqualTo(String value) {
            addCriterion("longtimenorecord <=", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordLike(String value) {
            addCriterion("longtimenorecord like", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordNotLike(String value) {
            addCriterion("longtimenorecord not like", value, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordIn(List<String> values) {
            addCriterion("longtimenorecord in", values, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordNotIn(List<String> values) {
            addCriterion("longtimenorecord not in", values, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordBetween(String value1, String value2) {
            addCriterion("longtimenorecord between", value1, value2, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andLongtimenorecordNotBetween(String value1, String value2) {
            addCriterion("longtimenorecord not between", value1, value2, "longtimenorecord");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrIsNull() {
            addCriterion("otherpicaddr is null");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrIsNotNull() {
            addCriterion("otherpicaddr is not null");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrEqualTo(String value) {
            addCriterion("otherpicaddr =", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrNotEqualTo(String value) {
            addCriterion("otherpicaddr <>", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrGreaterThan(String value) {
            addCriterion("otherpicaddr >", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("otherpicaddr >=", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrLessThan(String value) {
            addCriterion("otherpicaddr <", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrLessThanOrEqualTo(String value) {
            addCriterion("otherpicaddr <=", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrLike(String value) {
            addCriterion("otherpicaddr like", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrNotLike(String value) {
            addCriterion("otherpicaddr not like", value, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrIn(List<String> values) {
            addCriterion("otherpicaddr in", values, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrNotIn(List<String> values) {
            addCriterion("otherpicaddr not in", values, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrBetween(String value1, String value2) {
            addCriterion("otherpicaddr between", value1, value2, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andOtherpicaddrNotBetween(String value1, String value2) {
            addCriterion("otherpicaddr not between", value1, value2, "otherpicaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrIsNull() {
            addCriterion("balconyaddr is null");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrIsNotNull() {
            addCriterion("balconyaddr is not null");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrEqualTo(String value) {
            addCriterion("balconyaddr =", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrNotEqualTo(String value) {
            addCriterion("balconyaddr <>", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrGreaterThan(String value) {
            addCriterion("balconyaddr >", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("balconyaddr >=", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrLessThan(String value) {
            addCriterion("balconyaddr <", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrLessThanOrEqualTo(String value) {
            addCriterion("balconyaddr <=", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrLike(String value) {
            addCriterion("balconyaddr like", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrNotLike(String value) {
            addCriterion("balconyaddr not like", value, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrIn(List<String> values) {
            addCriterion("balconyaddr in", values, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrNotIn(List<String> values) {
            addCriterion("balconyaddr not in", values, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrBetween(String value1, String value2) {
            addCriterion("balconyaddr between", value1, value2, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andBalconyaddrNotBetween(String value1, String value2) {
            addCriterion("balconyaddr not between", value1, value2, "balconyaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrIsNull() {
            addCriterion("roomaddr is null");
            return (Criteria) this;
        }

        public Criteria andRoomaddrIsNotNull() {
            addCriterion("roomaddr is not null");
            return (Criteria) this;
        }

        public Criteria andRoomaddrEqualTo(String value) {
            addCriterion("roomaddr =", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrNotEqualTo(String value) {
            addCriterion("roomaddr <>", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrGreaterThan(String value) {
            addCriterion("roomaddr >", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrGreaterThanOrEqualTo(String value) {
            addCriterion("roomaddr >=", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrLessThan(String value) {
            addCriterion("roomaddr <", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrLessThanOrEqualTo(String value) {
            addCriterion("roomaddr <=", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrLike(String value) {
            addCriterion("roomaddr like", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrNotLike(String value) {
            addCriterion("roomaddr not like", value, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrIn(List<String> values) {
            addCriterion("roomaddr in", values, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrNotIn(List<String> values) {
            addCriterion("roomaddr not in", values, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrBetween(String value1, String value2) {
            addCriterion("roomaddr between", value1, value2, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andRoomaddrNotBetween(String value1, String value2) {
            addCriterion("roomaddr not between", value1, value2, "roomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrIsNull() {
            addCriterion("livingroomaddr is null");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrIsNotNull() {
            addCriterion("livingroomaddr is not null");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrEqualTo(String value) {
            addCriterion("livingroomaddr =", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrNotEqualTo(String value) {
            addCriterion("livingroomaddr <>", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrGreaterThan(String value) {
            addCriterion("livingroomaddr >", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrGreaterThanOrEqualTo(String value) {
            addCriterion("livingroomaddr >=", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrLessThan(String value) {
            addCriterion("livingroomaddr <", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrLessThanOrEqualTo(String value) {
            addCriterion("livingroomaddr <=", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrLike(String value) {
            addCriterion("livingroomaddr like", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrNotLike(String value) {
            addCriterion("livingroomaddr not like", value, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrIn(List<String> values) {
            addCriterion("livingroomaddr in", values, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrNotIn(List<String> values) {
            addCriterion("livingroomaddr not in", values, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrBetween(String value1, String value2) {
            addCriterion("livingroomaddr between", value1, value2, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andLivingroomaddrNotBetween(String value1, String value2) {
            addCriterion("livingroomaddr not between", value1, value2, "livingroomaddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrIsNull() {
            addCriterion("mortgagedooraddr is null");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrIsNotNull() {
            addCriterion("mortgagedooraddr is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrEqualTo(String value) {
            addCriterion("mortgagedooraddr =", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrNotEqualTo(String value) {
            addCriterion("mortgagedooraddr <>", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrGreaterThan(String value) {
            addCriterion("mortgagedooraddr >", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagedooraddr >=", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrLessThan(String value) {
            addCriterion("mortgagedooraddr <", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrLessThanOrEqualTo(String value) {
            addCriterion("mortgagedooraddr <=", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrLike(String value) {
            addCriterion("mortgagedooraddr like", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrNotLike(String value) {
            addCriterion("mortgagedooraddr not like", value, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrIn(List<String> values) {
            addCriterion("mortgagedooraddr in", values, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrNotIn(List<String> values) {
            addCriterion("mortgagedooraddr not in", values, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrBetween(String value1, String value2) {
            addCriterion("mortgagedooraddr between", value1, value2, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andMortgagedooraddrNotBetween(String value1, String value2) {
            addCriterion("mortgagedooraddr not between", value1, value2, "mortgagedooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrIsNull() {
            addCriterion("unitdooraddr is null");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrIsNotNull() {
            addCriterion("unitdooraddr is not null");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrEqualTo(String value) {
            addCriterion("unitdooraddr =", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrNotEqualTo(String value) {
            addCriterion("unitdooraddr <>", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrGreaterThan(String value) {
            addCriterion("unitdooraddr >", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrGreaterThanOrEqualTo(String value) {
            addCriterion("unitdooraddr >=", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrLessThan(String value) {
            addCriterion("unitdooraddr <", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrLessThanOrEqualTo(String value) {
            addCriterion("unitdooraddr <=", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrLike(String value) {
            addCriterion("unitdooraddr like", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrNotLike(String value) {
            addCriterion("unitdooraddr not like", value, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrIn(List<String> values) {
            addCriterion("unitdooraddr in", values, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrNotIn(List<String> values) {
            addCriterion("unitdooraddr not in", values, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrBetween(String value1, String value2) {
            addCriterion("unitdooraddr between", value1, value2, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andUnitdooraddrNotBetween(String value1, String value2) {
            addCriterion("unitdooraddr not between", value1, value2, "unitdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrIsNull() {
            addCriterion("districtdooraddr is null");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrIsNotNull() {
            addCriterion("districtdooraddr is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrEqualTo(String value) {
            addCriterion("districtdooraddr =", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrNotEqualTo(String value) {
            addCriterion("districtdooraddr <>", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrGreaterThan(String value) {
            addCriterion("districtdooraddr >", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrGreaterThanOrEqualTo(String value) {
            addCriterion("districtdooraddr >=", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrLessThan(String value) {
            addCriterion("districtdooraddr <", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrLessThanOrEqualTo(String value) {
            addCriterion("districtdooraddr <=", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrLike(String value) {
            addCriterion("districtdooraddr like", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrNotLike(String value) {
            addCriterion("districtdooraddr not like", value, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrIn(List<String> values) {
            addCriterion("districtdooraddr in", values, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrNotIn(List<String> values) {
            addCriterion("districtdooraddr not in", values, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrBetween(String value1, String value2) {
            addCriterion("districtdooraddr between", value1, value2, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andDistrictdooraddrNotBetween(String value1, String value2) {
            addCriterion("districtdooraddr not between", value1, value2, "districtdooraddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrIsNull() {
            addCriterion("insidepicaddr is null");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrIsNotNull() {
            addCriterion("insidepicaddr is not null");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrEqualTo(String value) {
            addCriterion("insidepicaddr =", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrNotEqualTo(String value) {
            addCriterion("insidepicaddr <>", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrGreaterThan(String value) {
            addCriterion("insidepicaddr >", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("insidepicaddr >=", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrLessThan(String value) {
            addCriterion("insidepicaddr <", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrLessThanOrEqualTo(String value) {
            addCriterion("insidepicaddr <=", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrLike(String value) {
            addCriterion("insidepicaddr like", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrNotLike(String value) {
            addCriterion("insidepicaddr not like", value, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrIn(List<String> values) {
            addCriterion("insidepicaddr in", values, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrNotIn(List<String> values) {
            addCriterion("insidepicaddr not in", values, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrBetween(String value1, String value2) {
            addCriterion("insidepicaddr between", value1, value2, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andInsidepicaddrNotBetween(String value1, String value2) {
            addCriterion("insidepicaddr not between", value1, value2, "insidepicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrIsNull() {
            addCriterion("supmarketpicaddr is null");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrIsNotNull() {
            addCriterion("supmarketpicaddr is not null");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrEqualTo(String value) {
            addCriterion("supmarketpicaddr =", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrNotEqualTo(String value) {
            addCriterion("supmarketpicaddr <>", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrGreaterThan(String value) {
            addCriterion("supmarketpicaddr >", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("supmarketpicaddr >=", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrLessThan(String value) {
            addCriterion("supmarketpicaddr <", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrLessThanOrEqualTo(String value) {
            addCriterion("supmarketpicaddr <=", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrLike(String value) {
            addCriterion("supmarketpicaddr like", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrNotLike(String value) {
            addCriterion("supmarketpicaddr not like", value, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrIn(List<String> values) {
            addCriterion("supmarketpicaddr in", values, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrNotIn(List<String> values) {
            addCriterion("supmarketpicaddr not in", values, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrBetween(String value1, String value2) {
            addCriterion("supmarketpicaddr between", value1, value2, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSupmarketpicaddrNotBetween(String value1, String value2) {
            addCriterion("supmarketpicaddr not between", value1, value2, "supmarketpicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrIsNull() {
            addCriterion("subwaypicaddr is null");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrIsNotNull() {
            addCriterion("subwaypicaddr is not null");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrEqualTo(String value) {
            addCriterion("subwaypicaddr =", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrNotEqualTo(String value) {
            addCriterion("subwaypicaddr <>", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrGreaterThan(String value) {
            addCriterion("subwaypicaddr >", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("subwaypicaddr >=", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrLessThan(String value) {
            addCriterion("subwaypicaddr <", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrLessThanOrEqualTo(String value) {
            addCriterion("subwaypicaddr <=", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrLike(String value) {
            addCriterion("subwaypicaddr like", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrNotLike(String value) {
            addCriterion("subwaypicaddr not like", value, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrIn(List<String> values) {
            addCriterion("subwaypicaddr in", values, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrNotIn(List<String> values) {
            addCriterion("subwaypicaddr not in", values, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrBetween(String value1, String value2) {
            addCriterion("subwaypicaddr between", value1, value2, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andSubwaypicaddrNotBetween(String value1, String value2) {
            addCriterion("subwaypicaddr not between", value1, value2, "subwaypicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrIsNull() {
            addCriterion("hospitalpicaddr is null");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrIsNotNull() {
            addCriterion("hospitalpicaddr is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrEqualTo(String value) {
            addCriterion("hospitalpicaddr =", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrNotEqualTo(String value) {
            addCriterion("hospitalpicaddr <>", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrGreaterThan(String value) {
            addCriterion("hospitalpicaddr >", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalpicaddr >=", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrLessThan(String value) {
            addCriterion("hospitalpicaddr <", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrLessThanOrEqualTo(String value) {
            addCriterion("hospitalpicaddr <=", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrLike(String value) {
            addCriterion("hospitalpicaddr like", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrNotLike(String value) {
            addCriterion("hospitalpicaddr not like", value, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrIn(List<String> values) {
            addCriterion("hospitalpicaddr in", values, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrNotIn(List<String> values) {
            addCriterion("hospitalpicaddr not in", values, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrBetween(String value1, String value2) {
            addCriterion("hospitalpicaddr between", value1, value2, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andHospitalpicaddrNotBetween(String value1, String value2) {
            addCriterion("hospitalpicaddr not between", value1, value2, "hospitalpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrIsNull() {
            addCriterion("schoolpicaddr is null");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrIsNotNull() {
            addCriterion("schoolpicaddr is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrEqualTo(String value) {
            addCriterion("schoolpicaddr =", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrNotEqualTo(String value) {
            addCriterion("schoolpicaddr <>", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrGreaterThan(String value) {
            addCriterion("schoolpicaddr >", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrGreaterThanOrEqualTo(String value) {
            addCriterion("schoolpicaddr >=", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrLessThan(String value) {
            addCriterion("schoolpicaddr <", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrLessThanOrEqualTo(String value) {
            addCriterion("schoolpicaddr <=", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrLike(String value) {
            addCriterion("schoolpicaddr like", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrNotLike(String value) {
            addCriterion("schoolpicaddr not like", value, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrIn(List<String> values) {
            addCriterion("schoolpicaddr in", values, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrNotIn(List<String> values) {
            addCriterion("schoolpicaddr not in", values, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrBetween(String value1, String value2) {
            addCriterion("schoolpicaddr between", value1, value2, "schoolpicaddr");
            return (Criteria) this;
        }

        public Criteria andSchoolpicaddrNotBetween(String value1, String value2) {
            addCriterion("schoolpicaddr not between", value1, value2, "schoolpicaddr");
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

        public Criteria andDegreeroomIsNull() {
            addCriterion("degreeroom is null");
            return (Criteria) this;
        }

        public Criteria andDegreeroomIsNotNull() {
            addCriterion("degreeroom is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeroomEqualTo(String value) {
            addCriterion("degreeroom =", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomNotEqualTo(String value) {
            addCriterion("degreeroom <>", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomGreaterThan(String value) {
            addCriterion("degreeroom >", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomGreaterThanOrEqualTo(String value) {
            addCriterion("degreeroom >=", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomLessThan(String value) {
            addCriterion("degreeroom <", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomLessThanOrEqualTo(String value) {
            addCriterion("degreeroom <=", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomLike(String value) {
            addCriterion("degreeroom like", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomNotLike(String value) {
            addCriterion("degreeroom not like", value, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomIn(List<String> values) {
            addCriterion("degreeroom in", values, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomNotIn(List<String> values) {
            addCriterion("degreeroom not in", values, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomBetween(String value1, String value2) {
            addCriterion("degreeroom between", value1, value2, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andDegreeroomNotBetween(String value1, String value2) {
            addCriterion("degreeroom not between", value1, value2, "degreeroom");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("room like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("room not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andHallIsNull() {
            addCriterion("hall is null");
            return (Criteria) this;
        }

        public Criteria andHallIsNotNull() {
            addCriterion("hall is not null");
            return (Criteria) this;
        }

        public Criteria andHallEqualTo(String value) {
            addCriterion("hall =", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallNotEqualTo(String value) {
            addCriterion("hall <>", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallGreaterThan(String value) {
            addCriterion("hall >", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallGreaterThanOrEqualTo(String value) {
            addCriterion("hall >=", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallLessThan(String value) {
            addCriterion("hall <", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallLessThanOrEqualTo(String value) {
            addCriterion("hall <=", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallLike(String value) {
            addCriterion("hall like", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallNotLike(String value) {
            addCriterion("hall not like", value, "hall");
            return (Criteria) this;
        }

        public Criteria andHallIn(List<String> values) {
            addCriterion("hall in", values, "hall");
            return (Criteria) this;
        }

        public Criteria andHallNotIn(List<String> values) {
            addCriterion("hall not in", values, "hall");
            return (Criteria) this;
        }

        public Criteria andHallBetween(String value1, String value2) {
            addCriterion("hall between", value1, value2, "hall");
            return (Criteria) this;
        }

        public Criteria andHallNotBetween(String value1, String value2) {
            addCriterion("hall not between", value1, value2, "hall");
            return (Criteria) this;
        }

        public Criteria andToiletIsNull() {
            addCriterion("toilet is null");
            return (Criteria) this;
        }

        public Criteria andToiletIsNotNull() {
            addCriterion("toilet is not null");
            return (Criteria) this;
        }

        public Criteria andToiletEqualTo(String value) {
            addCriterion("toilet =", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotEqualTo(String value) {
            addCriterion("toilet <>", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletGreaterThan(String value) {
            addCriterion("toilet >", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletGreaterThanOrEqualTo(String value) {
            addCriterion("toilet >=", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletLessThan(String value) {
            addCriterion("toilet <", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletLessThanOrEqualTo(String value) {
            addCriterion("toilet <=", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletLike(String value) {
            addCriterion("toilet like", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotLike(String value) {
            addCriterion("toilet not like", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletIn(List<String> values) {
            addCriterion("toilet in", values, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotIn(List<String> values) {
            addCriterion("toilet not in", values, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletBetween(String value1, String value2) {
            addCriterion("toilet between", value1, value2, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotBetween(String value1, String value2) {
            addCriterion("toilet not between", value1, value2, "toilet");
            return (Criteria) this;
        }

        public Criteria andBalconyIsNull() {
            addCriterion("balcony is null");
            return (Criteria) this;
        }

        public Criteria andBalconyIsNotNull() {
            addCriterion("balcony is not null");
            return (Criteria) this;
        }

        public Criteria andBalconyEqualTo(String value) {
            addCriterion("balcony =", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotEqualTo(String value) {
            addCriterion("balcony <>", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyGreaterThan(String value) {
            addCriterion("balcony >", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyGreaterThanOrEqualTo(String value) {
            addCriterion("balcony >=", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyLessThan(String value) {
            addCriterion("balcony <", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyLessThanOrEqualTo(String value) {
            addCriterion("balcony <=", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyLike(String value) {
            addCriterion("balcony like", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotLike(String value) {
            addCriterion("balcony not like", value, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyIn(List<String> values) {
            addCriterion("balcony in", values, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotIn(List<String> values) {
            addCriterion("balcony not in", values, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyBetween(String value1, String value2) {
            addCriterion("balcony between", value1, value2, "balcony");
            return (Criteria) this;
        }

        public Criteria andBalconyNotBetween(String value1, String value2) {
            addCriterion("balcony not between", value1, value2, "balcony");
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