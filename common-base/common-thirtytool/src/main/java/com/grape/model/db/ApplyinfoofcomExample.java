package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyinfoofcomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyinfoofcomExample() {
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

        public Criteria andSocialcreditcodeIsNull() {
            addCriterion("socialcreditcode is null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIsNotNull() {
            addCriterion("socialcreditcode is not null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeEqualTo(String value) {
            addCriterion("socialcreditcode =", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotEqualTo(String value) {
            addCriterion("socialcreditcode <>", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThan(String value) {
            addCriterion("socialcreditcode >", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("socialcreditcode >=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThan(String value) {
            addCriterion("socialcreditcode <", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThanOrEqualTo(String value) {
            addCriterion("socialcreditcode <=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLike(String value) {
            addCriterion("socialcreditcode like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotLike(String value) {
            addCriterion("socialcreditcode not like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIn(List<String> values) {
            addCriterion("socialcreditcode in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotIn(List<String> values) {
            addCriterion("socialcreditcode not in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeBetween(String value1, String value2) {
            addCriterion("socialcreditcode between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotBetween(String value1, String value2) {
            addCriterion("socialcreditcode not between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andApplyertypeIsNull() {
            addCriterion("applyertype is null");
            return (Criteria) this;
        }

        public Criteria andApplyertypeIsNotNull() {
            addCriterion("applyertype is not null");
            return (Criteria) this;
        }

        public Criteria andApplyertypeEqualTo(String value) {
            addCriterion("applyertype =", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotEqualTo(String value) {
            addCriterion("applyertype <>", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeGreaterThan(String value) {
            addCriterion("applyertype >", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeGreaterThanOrEqualTo(String value) {
            addCriterion("applyertype >=", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeLessThan(String value) {
            addCriterion("applyertype <", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeLessThanOrEqualTo(String value) {
            addCriterion("applyertype <=", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeLike(String value) {
            addCriterion("applyertype like", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotLike(String value) {
            addCriterion("applyertype not like", value, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeIn(List<String> values) {
            addCriterion("applyertype in", values, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotIn(List<String> values) {
            addCriterion("applyertype not in", values, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeBetween(String value1, String value2) {
            addCriterion("applyertype between", value1, value2, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplyertypeNotBetween(String value1, String value2) {
            addCriterion("applyertype not between", value1, value2, "applyertype");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyIsNull() {
            addCriterion("applymainbody is null");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyIsNotNull() {
            addCriterion("applymainbody is not null");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyEqualTo(String value) {
            addCriterion("applymainbody =", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyNotEqualTo(String value) {
            addCriterion("applymainbody <>", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyGreaterThan(String value) {
            addCriterion("applymainbody >", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyGreaterThanOrEqualTo(String value) {
            addCriterion("applymainbody >=", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyLessThan(String value) {
            addCriterion("applymainbody <", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyLessThanOrEqualTo(String value) {
            addCriterion("applymainbody <=", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyLike(String value) {
            addCriterion("applymainbody like", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyNotLike(String value) {
            addCriterion("applymainbody not like", value, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyIn(List<String> values) {
            addCriterion("applymainbody in", values, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyNotIn(List<String> values) {
            addCriterion("applymainbody not in", values, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyBetween(String value1, String value2) {
            addCriterion("applymainbody between", value1, value2, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andApplymainbodyNotBetween(String value1, String value2) {
            addCriterion("applymainbody not between", value1, value2, "applymainbody");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgname is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgname =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgname <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgname >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgname >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgname <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgname <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgname like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgname not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgname in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgname not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgname between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgname not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andManagetypeIsNull() {
            addCriterion("managetype is null");
            return (Criteria) this;
        }

        public Criteria andManagetypeIsNotNull() {
            addCriterion("managetype is not null");
            return (Criteria) this;
        }

        public Criteria andManagetypeEqualTo(String value) {
            addCriterion("managetype =", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotEqualTo(String value) {
            addCriterion("managetype <>", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeGreaterThan(String value) {
            addCriterion("managetype >", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("managetype >=", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeLessThan(String value) {
            addCriterion("managetype <", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeLessThanOrEqualTo(String value) {
            addCriterion("managetype <=", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeLike(String value) {
            addCriterion("managetype like", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotLike(String value) {
            addCriterion("managetype not like", value, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeIn(List<String> values) {
            addCriterion("managetype in", values, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotIn(List<String> values) {
            addCriterion("managetype not in", values, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeBetween(String value1, String value2) {
            addCriterion("managetype between", value1, value2, "managetype");
            return (Criteria) this;
        }

        public Criteria andManagetypeNotBetween(String value1, String value2) {
            addCriterion("managetype not between", value1, value2, "managetype");
            return (Criteria) this;
        }

        public Criteria andJuridicalIsNull() {
            addCriterion("juridical is null");
            return (Criteria) this;
        }

        public Criteria andJuridicalIsNotNull() {
            addCriterion("juridical is not null");
            return (Criteria) this;
        }

        public Criteria andJuridicalEqualTo(String value) {
            addCriterion("juridical =", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalNotEqualTo(String value) {
            addCriterion("juridical <>", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalGreaterThan(String value) {
            addCriterion("juridical >", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalGreaterThanOrEqualTo(String value) {
            addCriterion("juridical >=", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalLessThan(String value) {
            addCriterion("juridical <", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalLessThanOrEqualTo(String value) {
            addCriterion("juridical <=", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalLike(String value) {
            addCriterion("juridical like", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalNotLike(String value) {
            addCriterion("juridical not like", value, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalIn(List<String> values) {
            addCriterion("juridical in", values, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalNotIn(List<String> values) {
            addCriterion("juridical not in", values, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalBetween(String value1, String value2) {
            addCriterion("juridical between", value1, value2, "juridical");
            return (Criteria) this;
        }

        public Criteria andJuridicalNotBetween(String value1, String value2) {
            addCriterion("juridical not between", value1, value2, "juridical");
            return (Criteria) this;
        }

        public Criteria andComstartdateIsNull() {
            addCriterion("comstartdate is null");
            return (Criteria) this;
        }

        public Criteria andComstartdateIsNotNull() {
            addCriterion("comstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andComstartdateEqualTo(Date value) {
            addCriterion("comstartdate =", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateNotEqualTo(Date value) {
            addCriterion("comstartdate <>", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateGreaterThan(Date value) {
            addCriterion("comstartdate >", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("comstartdate >=", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateLessThan(Date value) {
            addCriterion("comstartdate <", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateLessThanOrEqualTo(Date value) {
            addCriterion("comstartdate <=", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateIn(List<Date> values) {
            addCriterion("comstartdate in", values, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateNotIn(List<Date> values) {
            addCriterion("comstartdate not in", values, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateBetween(Date value1, Date value2) {
            addCriterion("comstartdate between", value1, value2, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateNotBetween(Date value1, Date value2) {
            addCriterion("comstartdate not between", value1, value2, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComenddateIsNull() {
            addCriterion("comenddate is null");
            return (Criteria) this;
        }

        public Criteria andComenddateIsNotNull() {
            addCriterion("comenddate is not null");
            return (Criteria) this;
        }

        public Criteria andComenddateEqualTo(Date value) {
            addCriterion("comenddate =", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateNotEqualTo(Date value) {
            addCriterion("comenddate <>", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateGreaterThan(Date value) {
            addCriterion("comenddate >", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("comenddate >=", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateLessThan(Date value) {
            addCriterion("comenddate <", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateLessThanOrEqualTo(Date value) {
            addCriterion("comenddate <=", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateIn(List<Date> values) {
            addCriterion("comenddate in", values, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateNotIn(List<Date> values) {
            addCriterion("comenddate not in", values, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateBetween(Date value1, Date value2) {
            addCriterion("comenddate between", value1, value2, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateNotBetween(Date value1, Date value2) {
            addCriterion("comenddate not between", value1, value2, "comenddate");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalIsNull() {
            addCriterion("registcapital is null");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalIsNotNull() {
            addCriterion("registcapital is not null");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalEqualTo(BigDecimal value) {
            addCriterion("registcapital =", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalNotEqualTo(BigDecimal value) {
            addCriterion("registcapital <>", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalGreaterThan(BigDecimal value) {
            addCriterion("registcapital >", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("registcapital >=", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalLessThan(BigDecimal value) {
            addCriterion("registcapital <", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("registcapital <=", value, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalIn(List<BigDecimal> values) {
            addCriterion("registcapital in", values, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalNotIn(List<BigDecimal> values) {
            addCriterion("registcapital not in", values, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registcapital between", value1, value2, "registcapital");
            return (Criteria) this;
        }

        public Criteria andRegistcapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registcapital not between", value1, value2, "registcapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalIsNull() {
            addCriterion("contricapital is null");
            return (Criteria) this;
        }

        public Criteria andContricapitalIsNotNull() {
            addCriterion("contricapital is not null");
            return (Criteria) this;
        }

        public Criteria andContricapitalEqualTo(BigDecimal value) {
            addCriterion("contricapital =", value, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalNotEqualTo(BigDecimal value) {
            addCriterion("contricapital <>", value, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalGreaterThan(BigDecimal value) {
            addCriterion("contricapital >", value, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("contricapital >=", value, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalLessThan(BigDecimal value) {
            addCriterion("contricapital <", value, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("contricapital <=", value, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalIn(List<BigDecimal> values) {
            addCriterion("contricapital in", values, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalNotIn(List<BigDecimal> values) {
            addCriterion("contricapital not in", values, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contricapital between", value1, value2, "contricapital");
            return (Criteria) this;
        }

        public Criteria andContricapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("contricapital not between", value1, value2, "contricapital");
            return (Criteria) this;
        }

        public Criteria andComaddressIsNull() {
            addCriterion("comaddress is null");
            return (Criteria) this;
        }

        public Criteria andComaddressIsNotNull() {
            addCriterion("comaddress is not null");
            return (Criteria) this;
        }

        public Criteria andComaddressEqualTo(String value) {
            addCriterion("comaddress =", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotEqualTo(String value) {
            addCriterion("comaddress <>", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressGreaterThan(String value) {
            addCriterion("comaddress >", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressGreaterThanOrEqualTo(String value) {
            addCriterion("comaddress >=", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLessThan(String value) {
            addCriterion("comaddress <", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLessThanOrEqualTo(String value) {
            addCriterion("comaddress <=", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressLike(String value) {
            addCriterion("comaddress like", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotLike(String value) {
            addCriterion("comaddress not like", value, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressIn(List<String> values) {
            addCriterion("comaddress in", values, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotIn(List<String> values) {
            addCriterion("comaddress not in", values, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressBetween(String value1, String value2) {
            addCriterion("comaddress between", value1, value2, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressNotBetween(String value1, String value2) {
            addCriterion("comaddress not between", value1, value2, "comaddress");
            return (Criteria) this;
        }

        public Criteria andComaddressareaIsNull() {
            addCriterion("comaddressarea is null");
            return (Criteria) this;
        }

        public Criteria andComaddressareaIsNotNull() {
            addCriterion("comaddressarea is not null");
            return (Criteria) this;
        }

        public Criteria andComaddressareaEqualTo(String value) {
            addCriterion("comaddressarea =", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaNotEqualTo(String value) {
            addCriterion("comaddressarea <>", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaGreaterThan(String value) {
            addCriterion("comaddressarea >", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaGreaterThanOrEqualTo(String value) {
            addCriterion("comaddressarea >=", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaLessThan(String value) {
            addCriterion("comaddressarea <", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaLessThanOrEqualTo(String value) {
            addCriterion("comaddressarea <=", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaLike(String value) {
            addCriterion("comaddressarea like", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaNotLike(String value) {
            addCriterion("comaddressarea not like", value, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaIn(List<String> values) {
            addCriterion("comaddressarea in", values, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaNotIn(List<String> values) {
            addCriterion("comaddressarea not in", values, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaBetween(String value1, String value2) {
            addCriterion("comaddressarea between", value1, value2, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddressareaNotBetween(String value1, String value2) {
            addCriterion("comaddressarea not between", value1, value2, "comaddressarea");
            return (Criteria) this;
        }

        public Criteria andComaddresscityIsNull() {
            addCriterion("comaddresscity is null");
            return (Criteria) this;
        }

        public Criteria andComaddresscityIsNotNull() {
            addCriterion("comaddresscity is not null");
            return (Criteria) this;
        }

        public Criteria andComaddresscityEqualTo(String value) {
            addCriterion("comaddresscity =", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityNotEqualTo(String value) {
            addCriterion("comaddresscity <>", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityGreaterThan(String value) {
            addCriterion("comaddresscity >", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("comaddresscity >=", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityLessThan(String value) {
            addCriterion("comaddresscity <", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityLessThanOrEqualTo(String value) {
            addCriterion("comaddresscity <=", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityLike(String value) {
            addCriterion("comaddresscity like", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityNotLike(String value) {
            addCriterion("comaddresscity not like", value, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityIn(List<String> values) {
            addCriterion("comaddresscity in", values, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityNotIn(List<String> values) {
            addCriterion("comaddresscity not in", values, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityBetween(String value1, String value2) {
            addCriterion("comaddresscity between", value1, value2, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddresscityNotBetween(String value1, String value2) {
            addCriterion("comaddresscity not between", value1, value2, "comaddresscity");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceIsNull() {
            addCriterion("comaddressprovince is null");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceIsNotNull() {
            addCriterion("comaddressprovince is not null");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceEqualTo(String value) {
            addCriterion("comaddressprovince =", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceNotEqualTo(String value) {
            addCriterion("comaddressprovince <>", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceGreaterThan(String value) {
            addCriterion("comaddressprovince >", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("comaddressprovince >=", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceLessThan(String value) {
            addCriterion("comaddressprovince <", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceLessThanOrEqualTo(String value) {
            addCriterion("comaddressprovince <=", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceLike(String value) {
            addCriterion("comaddressprovince like", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceNotLike(String value) {
            addCriterion("comaddressprovince not like", value, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceIn(List<String> values) {
            addCriterion("comaddressprovince in", values, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceNotIn(List<String> values) {
            addCriterion("comaddressprovince not in", values, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceBetween(String value1, String value2) {
            addCriterion("comaddressprovince between", value1, value2, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andComaddressprovinceNotBetween(String value1, String value2) {
            addCriterion("comaddressprovince not between", value1, value2, "comaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressIsNull() {
            addCriterion("realcomaddress is null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressIsNotNull() {
            addCriterion("realcomaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressEqualTo(String value) {
            addCriterion("realcomaddress =", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotEqualTo(String value) {
            addCriterion("realcomaddress <>", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressGreaterThan(String value) {
            addCriterion("realcomaddress >", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressGreaterThanOrEqualTo(String value) {
            addCriterion("realcomaddress >=", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressLessThan(String value) {
            addCriterion("realcomaddress <", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressLessThanOrEqualTo(String value) {
            addCriterion("realcomaddress <=", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressLike(String value) {
            addCriterion("realcomaddress like", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotLike(String value) {
            addCriterion("realcomaddress not like", value, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressIn(List<String> values) {
            addCriterion("realcomaddress in", values, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotIn(List<String> values) {
            addCriterion("realcomaddress not in", values, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressBetween(String value1, String value2) {
            addCriterion("realcomaddress between", value1, value2, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressNotBetween(String value1, String value2) {
            addCriterion("realcomaddress not between", value1, value2, "realcomaddress");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaIsNull() {
            addCriterion("realcomaddressarea is null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaIsNotNull() {
            addCriterion("realcomaddressarea is not null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaEqualTo(String value) {
            addCriterion("realcomaddressarea =", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaNotEqualTo(String value) {
            addCriterion("realcomaddressarea <>", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaGreaterThan(String value) {
            addCriterion("realcomaddressarea >", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaGreaterThanOrEqualTo(String value) {
            addCriterion("realcomaddressarea >=", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaLessThan(String value) {
            addCriterion("realcomaddressarea <", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaLessThanOrEqualTo(String value) {
            addCriterion("realcomaddressarea <=", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaLike(String value) {
            addCriterion("realcomaddressarea like", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaNotLike(String value) {
            addCriterion("realcomaddressarea not like", value, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaIn(List<String> values) {
            addCriterion("realcomaddressarea in", values, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaNotIn(List<String> values) {
            addCriterion("realcomaddressarea not in", values, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaBetween(String value1, String value2) {
            addCriterion("realcomaddressarea between", value1, value2, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressareaNotBetween(String value1, String value2) {
            addCriterion("realcomaddressarea not between", value1, value2, "realcomaddressarea");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityIsNull() {
            addCriterion("realcomaddresscity is null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityIsNotNull() {
            addCriterion("realcomaddresscity is not null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityEqualTo(String value) {
            addCriterion("realcomaddresscity =", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityNotEqualTo(String value) {
            addCriterion("realcomaddresscity <>", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityGreaterThan(String value) {
            addCriterion("realcomaddresscity >", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("realcomaddresscity >=", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityLessThan(String value) {
            addCriterion("realcomaddresscity <", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityLessThanOrEqualTo(String value) {
            addCriterion("realcomaddresscity <=", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityLike(String value) {
            addCriterion("realcomaddresscity like", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityNotLike(String value) {
            addCriterion("realcomaddresscity not like", value, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityIn(List<String> values) {
            addCriterion("realcomaddresscity in", values, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityNotIn(List<String> values) {
            addCriterion("realcomaddresscity not in", values, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityBetween(String value1, String value2) {
            addCriterion("realcomaddresscity between", value1, value2, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddresscityNotBetween(String value1, String value2) {
            addCriterion("realcomaddresscity not between", value1, value2, "realcomaddresscity");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceIsNull() {
            addCriterion("realcomaddressprovince is null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceIsNotNull() {
            addCriterion("realcomaddressprovince is not null");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceEqualTo(String value) {
            addCriterion("realcomaddressprovince =", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceNotEqualTo(String value) {
            addCriterion("realcomaddressprovince <>", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceGreaterThan(String value) {
            addCriterion("realcomaddressprovince >", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("realcomaddressprovince >=", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceLessThan(String value) {
            addCriterion("realcomaddressprovince <", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceLessThanOrEqualTo(String value) {
            addCriterion("realcomaddressprovince <=", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceLike(String value) {
            addCriterion("realcomaddressprovince like", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceNotLike(String value) {
            addCriterion("realcomaddressprovince not like", value, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceIn(List<String> values) {
            addCriterion("realcomaddressprovince in", values, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceNotIn(List<String> values) {
            addCriterion("realcomaddressprovince not in", values, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceBetween(String value1, String value2) {
            addCriterion("realcomaddressprovince between", value1, value2, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andRealcomaddressprovinceNotBetween(String value1, String value2) {
            addCriterion("realcomaddressprovince not between", value1, value2, "realcomaddressprovince");
            return (Criteria) this;
        }

        public Criteria andManageareaIsNull() {
            addCriterion("managearea is null");
            return (Criteria) this;
        }

        public Criteria andManageareaIsNotNull() {
            addCriterion("managearea is not null");
            return (Criteria) this;
        }

        public Criteria andManageareaEqualTo(String value) {
            addCriterion("managearea =", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaNotEqualTo(String value) {
            addCriterion("managearea <>", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaGreaterThan(String value) {
            addCriterion("managearea >", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaGreaterThanOrEqualTo(String value) {
            addCriterion("managearea >=", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaLessThan(String value) {
            addCriterion("managearea <", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaLessThanOrEqualTo(String value) {
            addCriterion("managearea <=", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaLike(String value) {
            addCriterion("managearea like", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaNotLike(String value) {
            addCriterion("managearea not like", value, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaIn(List<String> values) {
            addCriterion("managearea in", values, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaNotIn(List<String> values) {
            addCriterion("managearea not in", values, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaBetween(String value1, String value2) {
            addCriterion("managearea between", value1, value2, "managearea");
            return (Criteria) this;
        }

        public Criteria andManageareaNotBetween(String value1, String value2) {
            addCriterion("managearea not between", value1, value2, "managearea");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondIsNull() {
            addCriterion("industrysecond is null");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondIsNotNull() {
            addCriterion("industrysecond is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondEqualTo(String value) {
            addCriterion("industrysecond =", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondNotEqualTo(String value) {
            addCriterion("industrysecond <>", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondGreaterThan(String value) {
            addCriterion("industrysecond >", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondGreaterThanOrEqualTo(String value) {
            addCriterion("industrysecond >=", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondLessThan(String value) {
            addCriterion("industrysecond <", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondLessThanOrEqualTo(String value) {
            addCriterion("industrysecond <=", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondLike(String value) {
            addCriterion("industrysecond like", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondNotLike(String value) {
            addCriterion("industrysecond not like", value, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondIn(List<String> values) {
            addCriterion("industrysecond in", values, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondNotIn(List<String> values) {
            addCriterion("industrysecond not in", values, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondBetween(String value1, String value2) {
            addCriterion("industrysecond between", value1, value2, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustrysecondNotBetween(String value1, String value2) {
            addCriterion("industrysecond not between", value1, value2, "industrysecond");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstIsNull() {
            addCriterion("industryfirst is null");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstIsNotNull() {
            addCriterion("industryfirst is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstEqualTo(String value) {
            addCriterion("industryfirst =", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstNotEqualTo(String value) {
            addCriterion("industryfirst <>", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstGreaterThan(String value) {
            addCriterion("industryfirst >", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstGreaterThanOrEqualTo(String value) {
            addCriterion("industryfirst >=", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstLessThan(String value) {
            addCriterion("industryfirst <", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstLessThanOrEqualTo(String value) {
            addCriterion("industryfirst <=", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstLike(String value) {
            addCriterion("industryfirst like", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstNotLike(String value) {
            addCriterion("industryfirst not like", value, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstIn(List<String> values) {
            addCriterion("industryfirst in", values, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstNotIn(List<String> values) {
            addCriterion("industryfirst not in", values, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstBetween(String value1, String value2) {
            addCriterion("industryfirst between", value1, value2, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andIndustryfirstNotBetween(String value1, String value2) {
            addCriterion("industryfirst not between", value1, value2, "industryfirst");
            return (Criteria) this;
        }

        public Criteria andMianbusinessIsNull() {
            addCriterion("mianbusiness is null");
            return (Criteria) this;
        }

        public Criteria andMianbusinessIsNotNull() {
            addCriterion("mianbusiness is not null");
            return (Criteria) this;
        }

        public Criteria andMianbusinessEqualTo(String value) {
            addCriterion("mianbusiness =", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessNotEqualTo(String value) {
            addCriterion("mianbusiness <>", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessGreaterThan(String value) {
            addCriterion("mianbusiness >", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("mianbusiness >=", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessLessThan(String value) {
            addCriterion("mianbusiness <", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessLessThanOrEqualTo(String value) {
            addCriterion("mianbusiness <=", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessLike(String value) {
            addCriterion("mianbusiness like", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessNotLike(String value) {
            addCriterion("mianbusiness not like", value, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessIn(List<String> values) {
            addCriterion("mianbusiness in", values, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessNotIn(List<String> values) {
            addCriterion("mianbusiness not in", values, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessBetween(String value1, String value2) {
            addCriterion("mianbusiness between", value1, value2, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMianbusinessNotBetween(String value1, String value2) {
            addCriterion("mianbusiness not between", value1, value2, "mianbusiness");
            return (Criteria) this;
        }

        public Criteria andMainsupplierIsNull() {
            addCriterion("mainsupplier is null");
            return (Criteria) this;
        }

        public Criteria andMainsupplierIsNotNull() {
            addCriterion("mainsupplier is not null");
            return (Criteria) this;
        }

        public Criteria andMainsupplierEqualTo(String value) {
            addCriterion("mainsupplier =", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierNotEqualTo(String value) {
            addCriterion("mainsupplier <>", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierGreaterThan(String value) {
            addCriterion("mainsupplier >", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierGreaterThanOrEqualTo(String value) {
            addCriterion("mainsupplier >=", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierLessThan(String value) {
            addCriterion("mainsupplier <", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierLessThanOrEqualTo(String value) {
            addCriterion("mainsupplier <=", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierLike(String value) {
            addCriterion("mainsupplier like", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierNotLike(String value) {
            addCriterion("mainsupplier not like", value, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierIn(List<String> values) {
            addCriterion("mainsupplier in", values, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierNotIn(List<String> values) {
            addCriterion("mainsupplier not in", values, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierBetween(String value1, String value2) {
            addCriterion("mainsupplier between", value1, value2, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMainsupplierNotBetween(String value1, String value2) {
            addCriterion("mainsupplier not between", value1, value2, "mainsupplier");
            return (Criteria) this;
        }

        public Criteria andMaincustomerIsNull() {
            addCriterion("maincustomer is null");
            return (Criteria) this;
        }

        public Criteria andMaincustomerIsNotNull() {
            addCriterion("maincustomer is not null");
            return (Criteria) this;
        }

        public Criteria andMaincustomerEqualTo(String value) {
            addCriterion("maincustomer =", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerNotEqualTo(String value) {
            addCriterion("maincustomer <>", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerGreaterThan(String value) {
            addCriterion("maincustomer >", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerGreaterThanOrEqualTo(String value) {
            addCriterion("maincustomer >=", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerLessThan(String value) {
            addCriterion("maincustomer <", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerLessThanOrEqualTo(String value) {
            addCriterion("maincustomer <=", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerLike(String value) {
            addCriterion("maincustomer like", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerNotLike(String value) {
            addCriterion("maincustomer not like", value, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerIn(List<String> values) {
            addCriterion("maincustomer in", values, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerNotIn(List<String> values) {
            addCriterion("maincustomer not in", values, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerBetween(String value1, String value2) {
            addCriterion("maincustomer between", value1, value2, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andMaincustomerNotBetween(String value1, String value2) {
            addCriterion("maincustomer not between", value1, value2, "maincustomer");
            return (Criteria) this;
        }

        public Criteria andShareremarkIsNull() {
            addCriterion("shareremark is null");
            return (Criteria) this;
        }

        public Criteria andShareremarkIsNotNull() {
            addCriterion("shareremark is not null");
            return (Criteria) this;
        }

        public Criteria andShareremarkEqualTo(String value) {
            addCriterion("shareremark =", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkNotEqualTo(String value) {
            addCriterion("shareremark <>", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkGreaterThan(String value) {
            addCriterion("shareremark >", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkGreaterThanOrEqualTo(String value) {
            addCriterion("shareremark >=", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkLessThan(String value) {
            addCriterion("shareremark <", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkLessThanOrEqualTo(String value) {
            addCriterion("shareremark <=", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkLike(String value) {
            addCriterion("shareremark like", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkNotLike(String value) {
            addCriterion("shareremark not like", value, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkIn(List<String> values) {
            addCriterion("shareremark in", values, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkNotIn(List<String> values) {
            addCriterion("shareremark not in", values, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkBetween(String value1, String value2) {
            addCriterion("shareremark between", value1, value2, "shareremark");
            return (Criteria) this;
        }

        public Criteria andShareremarkNotBetween(String value1, String value2) {
            addCriterion("shareremark not between", value1, value2, "shareremark");
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