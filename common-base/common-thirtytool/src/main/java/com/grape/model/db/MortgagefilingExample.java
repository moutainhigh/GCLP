package com.grape.model.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MortgagefilingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MortgagefilingExample() {
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

        public Criteria andMortgagefilingidIsNull() {
            addCriterion("mortgagefilingid is null");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidIsNotNull() {
            addCriterion("mortgagefilingid is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidEqualTo(String value) {
            addCriterion("mortgagefilingid =", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidNotEqualTo(String value) {
            addCriterion("mortgagefilingid <>", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidGreaterThan(String value) {
            addCriterion("mortgagefilingid >", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagefilingid >=", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidLessThan(String value) {
            addCriterion("mortgagefilingid <", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidLessThanOrEqualTo(String value) {
            addCriterion("mortgagefilingid <=", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidLike(String value) {
            addCriterion("mortgagefilingid like", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidNotLike(String value) {
            addCriterion("mortgagefilingid not like", value, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidIn(List<String> values) {
            addCriterion("mortgagefilingid in", values, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidNotIn(List<String> values) {
            addCriterion("mortgagefilingid not in", values, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidBetween(String value1, String value2) {
            addCriterion("mortgagefilingid between", value1, value2, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgagefilingidNotBetween(String value1, String value2) {
            addCriterion("mortgagefilingid not between", value1, value2, "mortgagefilingid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNull() {
            addCriterion("mortgageid is null");
            return (Criteria) this;
        }

        public Criteria andMortgageidIsNotNull() {
            addCriterion("mortgageid is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageidEqualTo(String value) {
            addCriterion("mortgageid =", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotEqualTo(String value) {
            addCriterion("mortgageid <>", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThan(String value) {
            addCriterion("mortgageid >", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidGreaterThanOrEqualTo(String value) {
            addCriterion("mortgageid >=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThan(String value) {
            addCriterion("mortgageid <", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLessThanOrEqualTo(String value) {
            addCriterion("mortgageid <=", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidLike(String value) {
            addCriterion("mortgageid like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotLike(String value) {
            addCriterion("mortgageid not like", value, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidIn(List<String> values) {
            addCriterion("mortgageid in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotIn(List<String> values) {
            addCriterion("mortgageid not in", values, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidBetween(String value1, String value2) {
            addCriterion("mortgageid between", value1, value2, "mortgageid");
            return (Criteria) this;
        }

        public Criteria andMortgageidNotBetween(String value1, String value2) {
            addCriterion("mortgageid not between", value1, value2, "mortgageid");
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

        public Criteria andIsnetsignIsNull() {
            addCriterion("isnetsign is null");
            return (Criteria) this;
        }

        public Criteria andIsnetsignIsNotNull() {
            addCriterion("isnetsign is not null");
            return (Criteria) this;
        }

        public Criteria andIsnetsignEqualTo(String value) {
            addCriterion("isnetsign =", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignNotEqualTo(String value) {
            addCriterion("isnetsign <>", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignGreaterThan(String value) {
            addCriterion("isnetsign >", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignGreaterThanOrEqualTo(String value) {
            addCriterion("isnetsign >=", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignLessThan(String value) {
            addCriterion("isnetsign <", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignLessThanOrEqualTo(String value) {
            addCriterion("isnetsign <=", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignLike(String value) {
            addCriterion("isnetsign like", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignNotLike(String value) {
            addCriterion("isnetsign not like", value, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignIn(List<String> values) {
            addCriterion("isnetsign in", values, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignNotIn(List<String> values) {
            addCriterion("isnetsign not in", values, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignBetween(String value1, String value2) {
            addCriterion("isnetsign between", value1, value2, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andIsnetsignNotBetween(String value1, String value2) {
            addCriterion("isnetsign not between", value1, value2, "isnetsign");
            return (Criteria) this;
        }

        public Criteria andClosecountIsNull() {
            addCriterion("closecount is null");
            return (Criteria) this;
        }

        public Criteria andClosecountIsNotNull() {
            addCriterion("closecount is not null");
            return (Criteria) this;
        }

        public Criteria andClosecountEqualTo(String value) {
            addCriterion("closecount =", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountNotEqualTo(String value) {
            addCriterion("closecount <>", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountGreaterThan(String value) {
            addCriterion("closecount >", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountGreaterThanOrEqualTo(String value) {
            addCriterion("closecount >=", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountLessThan(String value) {
            addCriterion("closecount <", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountLessThanOrEqualTo(String value) {
            addCriterion("closecount <=", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountLike(String value) {
            addCriterion("closecount like", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountNotLike(String value) {
            addCriterion("closecount not like", value, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountIn(List<String> values) {
            addCriterion("closecount in", values, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountNotIn(List<String> values) {
            addCriterion("closecount not in", values, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountBetween(String value1, String value2) {
            addCriterion("closecount between", value1, value2, "closecount");
            return (Criteria) this;
        }

        public Criteria andClosecountNotBetween(String value1, String value2) {
            addCriterion("closecount not between", value1, value2, "closecount");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeIsNull() {
            addCriterion("endclosetime is null");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeIsNotNull() {
            addCriterion("endclosetime is not null");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeEqualTo(String value) {
            addCriterion("endclosetime =", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeNotEqualTo(String value) {
            addCriterion("endclosetime <>", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeGreaterThan(String value) {
            addCriterion("endclosetime >", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeGreaterThanOrEqualTo(String value) {
            addCriterion("endclosetime >=", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeLessThan(String value) {
            addCriterion("endclosetime <", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeLessThanOrEqualTo(String value) {
            addCriterion("endclosetime <=", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeLike(String value) {
            addCriterion("endclosetime like", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeNotLike(String value) {
            addCriterion("endclosetime not like", value, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeIn(List<String> values) {
            addCriterion("endclosetime in", values, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeNotIn(List<String> values) {
            addCriterion("endclosetime not in", values, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeBetween(String value1, String value2) {
            addCriterion("endclosetime between", value1, value2, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosetimeNotBetween(String value1, String value2) {
            addCriterion("endclosetime not between", value1, value2, "endclosetime");
            return (Criteria) this;
        }

        public Criteria andEndclosedateIsNull() {
            addCriterion("endclosedate is null");
            return (Criteria) this;
        }

        public Criteria andEndclosedateIsNotNull() {
            addCriterion("endclosedate is not null");
            return (Criteria) this;
        }

        public Criteria andEndclosedateEqualTo(Date value) {
            addCriterion("endclosedate =", value, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateNotEqualTo(Date value) {
            addCriterion("endclosedate <>", value, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateGreaterThan(Date value) {
            addCriterion("endclosedate >", value, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateGreaterThanOrEqualTo(Date value) {
            addCriterion("endclosedate >=", value, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateLessThan(Date value) {
            addCriterion("endclosedate <", value, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateLessThanOrEqualTo(Date value) {
            addCriterion("endclosedate <=", value, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateIn(List<Date> values) {
            addCriterion("endclosedate in", values, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateNotIn(List<Date> values) {
            addCriterion("endclosedate not in", values, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateBetween(Date value1, Date value2) {
            addCriterion("endclosedate between", value1, value2, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andEndclosedateNotBetween(Date value1, Date value2) {
            addCriterion("endclosedate not between", value1, value2, "endclosedate");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseIsNull() {
            addCriterion("ismortgageclose is null");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseIsNotNull() {
            addCriterion("ismortgageclose is not null");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseEqualTo(String value) {
            addCriterion("ismortgageclose =", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseNotEqualTo(String value) {
            addCriterion("ismortgageclose <>", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseGreaterThan(String value) {
            addCriterion("ismortgageclose >", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseGreaterThanOrEqualTo(String value) {
            addCriterion("ismortgageclose >=", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseLessThan(String value) {
            addCriterion("ismortgageclose <", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseLessThanOrEqualTo(String value) {
            addCriterion("ismortgageclose <=", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseLike(String value) {
            addCriterion("ismortgageclose like", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseNotLike(String value) {
            addCriterion("ismortgageclose not like", value, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseIn(List<String> values) {
            addCriterion("ismortgageclose in", values, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseNotIn(List<String> values) {
            addCriterion("ismortgageclose not in", values, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseBetween(String value1, String value2) {
            addCriterion("ismortgageclose between", value1, value2, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andIsmortgagecloseNotBetween(String value1, String value2) {
            addCriterion("ismortgageclose not between", value1, value2, "ismortgageclose");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeIsNull() {
            addCriterion("legaldispute is null");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeIsNotNull() {
            addCriterion("legaldispute is not null");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeEqualTo(String value) {
            addCriterion("legaldispute =", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeNotEqualTo(String value) {
            addCriterion("legaldispute <>", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeGreaterThan(String value) {
            addCriterion("legaldispute >", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeGreaterThanOrEqualTo(String value) {
            addCriterion("legaldispute >=", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeLessThan(String value) {
            addCriterion("legaldispute <", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeLessThanOrEqualTo(String value) {
            addCriterion("legaldispute <=", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeLike(String value) {
            addCriterion("legaldispute like", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeNotLike(String value) {
            addCriterion("legaldispute not like", value, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeIn(List<String> values) {
            addCriterion("legaldispute in", values, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeNotIn(List<String> values) {
            addCriterion("legaldispute not in", values, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeBetween(String value1, String value2) {
            addCriterion("legaldispute between", value1, value2, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andLegaldisputeNotBetween(String value1, String value2) {
            addCriterion("legaldispute not between", value1, value2, "legaldispute");
            return (Criteria) this;
        }

        public Criteria andMortgagestateIsNull() {
            addCriterion("mortgagestate is null");
            return (Criteria) this;
        }

        public Criteria andMortgagestateIsNotNull() {
            addCriterion("mortgagestate is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagestateEqualTo(String value) {
            addCriterion("mortgagestate =", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotEqualTo(String value) {
            addCriterion("mortgagestate <>", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateGreaterThan(String value) {
            addCriterion("mortgagestate >", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagestate >=", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateLessThan(String value) {
            addCriterion("mortgagestate <", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateLessThanOrEqualTo(String value) {
            addCriterion("mortgagestate <=", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateLike(String value) {
            addCriterion("mortgagestate like", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotLike(String value) {
            addCriterion("mortgagestate not like", value, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateIn(List<String> values) {
            addCriterion("mortgagestate in", values, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotIn(List<String> values) {
            addCriterion("mortgagestate not in", values, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateBetween(String value1, String value2) {
            addCriterion("mortgagestate between", value1, value2, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagestateNotBetween(String value1, String value2) {
            addCriterion("mortgagestate not between", value1, value2, "mortgagestate");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankIsNull() {
            addCriterion("mortgagecomorbank is null");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankIsNotNull() {
            addCriterion("mortgagecomorbank is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankEqualTo(String value) {
            addCriterion("mortgagecomorbank =", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankNotEqualTo(String value) {
            addCriterion("mortgagecomorbank <>", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankGreaterThan(String value) {
            addCriterion("mortgagecomorbank >", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankGreaterThanOrEqualTo(String value) {
            addCriterion("mortgagecomorbank >=", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankLessThan(String value) {
            addCriterion("mortgagecomorbank <", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankLessThanOrEqualTo(String value) {
            addCriterion("mortgagecomorbank <=", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankLike(String value) {
            addCriterion("mortgagecomorbank like", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankNotLike(String value) {
            addCriterion("mortgagecomorbank not like", value, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankIn(List<String> values) {
            addCriterion("mortgagecomorbank in", values, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankNotIn(List<String> values) {
            addCriterion("mortgagecomorbank not in", values, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankBetween(String value1, String value2) {
            addCriterion("mortgagecomorbank between", value1, value2, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andMortgagecomorbankNotBetween(String value1, String value2) {
            addCriterion("mortgagecomorbank not between", value1, value2, "mortgagecomorbank");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthIsNull() {
            addCriterion("queriesofmonth is null");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthIsNotNull() {
            addCriterion("queriesofmonth is not null");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthEqualTo(String value) {
            addCriterion("queriesofmonth =", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthNotEqualTo(String value) {
            addCriterion("queriesofmonth <>", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthGreaterThan(String value) {
            addCriterion("queriesofmonth >", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthGreaterThanOrEqualTo(String value) {
            addCriterion("queriesofmonth >=", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthLessThan(String value) {
            addCriterion("queriesofmonth <", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthLessThanOrEqualTo(String value) {
            addCriterion("queriesofmonth <=", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthLike(String value) {
            addCriterion("queriesofmonth like", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthNotLike(String value) {
            addCriterion("queriesofmonth not like", value, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthIn(List<String> values) {
            addCriterion("queriesofmonth in", values, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthNotIn(List<String> values) {
            addCriterion("queriesofmonth not in", values, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthBetween(String value1, String value2) {
            addCriterion("queriesofmonth between", value1, value2, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andQueriesofmonthNotBetween(String value1, String value2) {
            addCriterion("queriesofmonth not between", value1, value2, "queriesofmonth");
            return (Criteria) this;
        }

        public Criteria andFronthandoneIsNull() {
            addCriterion("fronthandone is null");
            return (Criteria) this;
        }

        public Criteria andFronthandoneIsNotNull() {
            addCriterion("fronthandone is not null");
            return (Criteria) this;
        }

        public Criteria andFronthandoneEqualTo(String value) {
            addCriterion("fronthandone =", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneNotEqualTo(String value) {
            addCriterion("fronthandone <>", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneGreaterThan(String value) {
            addCriterion("fronthandone >", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneGreaterThanOrEqualTo(String value) {
            addCriterion("fronthandone >=", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneLessThan(String value) {
            addCriterion("fronthandone <", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneLessThanOrEqualTo(String value) {
            addCriterion("fronthandone <=", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneLike(String value) {
            addCriterion("fronthandone like", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneNotLike(String value) {
            addCriterion("fronthandone not like", value, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneIn(List<String> values) {
            addCriterion("fronthandone in", values, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneNotIn(List<String> values) {
            addCriterion("fronthandone not in", values, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneBetween(String value1, String value2) {
            addCriterion("fronthandone between", value1, value2, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andFronthandoneNotBetween(String value1, String value2) {
            addCriterion("fronthandone not between", value1, value2, "fronthandone");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalIsNull() {
            addCriterion("queriesoftotal is null");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalIsNotNull() {
            addCriterion("queriesoftotal is not null");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalEqualTo(String value) {
            addCriterion("queriesoftotal =", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalNotEqualTo(String value) {
            addCriterion("queriesoftotal <>", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalGreaterThan(String value) {
            addCriterion("queriesoftotal >", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalGreaterThanOrEqualTo(String value) {
            addCriterion("queriesoftotal >=", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalLessThan(String value) {
            addCriterion("queriesoftotal <", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalLessThanOrEqualTo(String value) {
            addCriterion("queriesoftotal <=", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalLike(String value) {
            addCriterion("queriesoftotal like", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalNotLike(String value) {
            addCriterion("queriesoftotal not like", value, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalIn(List<String> values) {
            addCriterion("queriesoftotal in", values, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalNotIn(List<String> values) {
            addCriterion("queriesoftotal not in", values, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalBetween(String value1, String value2) {
            addCriterion("queriesoftotal between", value1, value2, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andQueriesoftotalNotBetween(String value1, String value2) {
            addCriterion("queriesoftotal not between", value1, value2, "queriesoftotal");
            return (Criteria) this;
        }

        public Criteria andMortgages1IsNull() {
            addCriterion("mortgages1 is null");
            return (Criteria) this;
        }

        public Criteria andMortgages1IsNotNull() {
            addCriterion("mortgages1 is not null");
            return (Criteria) this;
        }

        public Criteria andMortgages1EqualTo(String value) {
            addCriterion("mortgages1 =", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1NotEqualTo(String value) {
            addCriterion("mortgages1 <>", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1GreaterThan(String value) {
            addCriterion("mortgages1 >", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1GreaterThanOrEqualTo(String value) {
            addCriterion("mortgages1 >=", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1LessThan(String value) {
            addCriterion("mortgages1 <", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1LessThanOrEqualTo(String value) {
            addCriterion("mortgages1 <=", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1Like(String value) {
            addCriterion("mortgages1 like", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1NotLike(String value) {
            addCriterion("mortgages1 not like", value, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1In(List<String> values) {
            addCriterion("mortgages1 in", values, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1NotIn(List<String> values) {
            addCriterion("mortgages1 not in", values, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1Between(String value1, String value2) {
            addCriterion("mortgages1 between", value1, value2, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgages1NotBetween(String value1, String value2) {
            addCriterion("mortgages1 not between", value1, value2, "mortgages1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1IsNull() {
            addCriterion("mortgagesman1 is null");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1IsNotNull() {
            addCriterion("mortgagesman1 is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1EqualTo(String value) {
            addCriterion("mortgagesman1 =", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1NotEqualTo(String value) {
            addCriterion("mortgagesman1 <>", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1GreaterThan(String value) {
            addCriterion("mortgagesman1 >", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1GreaterThanOrEqualTo(String value) {
            addCriterion("mortgagesman1 >=", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1LessThan(String value) {
            addCriterion("mortgagesman1 <", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1LessThanOrEqualTo(String value) {
            addCriterion("mortgagesman1 <=", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1Like(String value) {
            addCriterion("mortgagesman1 like", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1NotLike(String value) {
            addCriterion("mortgagesman1 not like", value, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1In(List<String> values) {
            addCriterion("mortgagesman1 in", values, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1NotIn(List<String> values) {
            addCriterion("mortgagesman1 not in", values, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1Between(String value1, String value2) {
            addCriterion("mortgagesman1 between", value1, value2, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgagesman1NotBetween(String value1, String value2) {
            addCriterion("mortgagesman1 not between", value1, value2, "mortgagesman1");
            return (Criteria) this;
        }

        public Criteria andMortgages2IsNull() {
            addCriterion("mortgages2 is null");
            return (Criteria) this;
        }

        public Criteria andMortgages2IsNotNull() {
            addCriterion("mortgages2 is not null");
            return (Criteria) this;
        }

        public Criteria andMortgages2EqualTo(String value) {
            addCriterion("mortgages2 =", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2NotEqualTo(String value) {
            addCriterion("mortgages2 <>", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2GreaterThan(String value) {
            addCriterion("mortgages2 >", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2GreaterThanOrEqualTo(String value) {
            addCriterion("mortgages2 >=", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2LessThan(String value) {
            addCriterion("mortgages2 <", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2LessThanOrEqualTo(String value) {
            addCriterion("mortgages2 <=", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2Like(String value) {
            addCriterion("mortgages2 like", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2NotLike(String value) {
            addCriterion("mortgages2 not like", value, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2In(List<String> values) {
            addCriterion("mortgages2 in", values, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2NotIn(List<String> values) {
            addCriterion("mortgages2 not in", values, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2Between(String value1, String value2) {
            addCriterion("mortgages2 between", value1, value2, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgages2NotBetween(String value1, String value2) {
            addCriterion("mortgages2 not between", value1, value2, "mortgages2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2IsNull() {
            addCriterion("mortgagesman2 is null");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2IsNotNull() {
            addCriterion("mortgagesman2 is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2EqualTo(String value) {
            addCriterion("mortgagesman2 =", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2NotEqualTo(String value) {
            addCriterion("mortgagesman2 <>", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2GreaterThan(String value) {
            addCriterion("mortgagesman2 >", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2GreaterThanOrEqualTo(String value) {
            addCriterion("mortgagesman2 >=", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2LessThan(String value) {
            addCriterion("mortgagesman2 <", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2LessThanOrEqualTo(String value) {
            addCriterion("mortgagesman2 <=", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2Like(String value) {
            addCriterion("mortgagesman2 like", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2NotLike(String value) {
            addCriterion("mortgagesman2 not like", value, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2In(List<String> values) {
            addCriterion("mortgagesman2 in", values, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2NotIn(List<String> values) {
            addCriterion("mortgagesman2 not in", values, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2Between(String value1, String value2) {
            addCriterion("mortgagesman2 between", value1, value2, "mortgagesman2");
            return (Criteria) this;
        }

        public Criteria andMortgagesman2NotBetween(String value1, String value2) {
            addCriterion("mortgagesman2 not between", value1, value2, "mortgagesman2");
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

        public Criteria andOneagencyIsNull() {
            addCriterion("oneagency is null");
            return (Criteria) this;
        }

        public Criteria andOneagencyIsNotNull() {
            addCriterion("oneagency is not null");
            return (Criteria) this;
        }

        public Criteria andOneagencyEqualTo(String value) {
            addCriterion("oneagency =", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyNotEqualTo(String value) {
            addCriterion("oneagency <>", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyGreaterThan(String value) {
            addCriterion("oneagency >", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyGreaterThanOrEqualTo(String value) {
            addCriterion("oneagency >=", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyLessThan(String value) {
            addCriterion("oneagency <", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyLessThanOrEqualTo(String value) {
            addCriterion("oneagency <=", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyLike(String value) {
            addCriterion("oneagency like", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyNotLike(String value) {
            addCriterion("oneagency not like", value, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyIn(List<String> values) {
            addCriterion("oneagency in", values, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyNotIn(List<String> values) {
            addCriterion("oneagency not in", values, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyBetween(String value1, String value2) {
            addCriterion("oneagency between", value1, value2, "oneagency");
            return (Criteria) this;
        }

        public Criteria andOneagencyNotBetween(String value1, String value2) {
            addCriterion("oneagency not between", value1, value2, "oneagency");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoIsNull() {
            addCriterion("fronthandtwo is null");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoIsNotNull() {
            addCriterion("fronthandtwo is not null");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoEqualTo(String value) {
            addCriterion("fronthandtwo =", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoNotEqualTo(String value) {
            addCriterion("fronthandtwo <>", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoGreaterThan(String value) {
            addCriterion("fronthandtwo >", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoGreaterThanOrEqualTo(String value) {
            addCriterion("fronthandtwo >=", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoLessThan(String value) {
            addCriterion("fronthandtwo <", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoLessThanOrEqualTo(String value) {
            addCriterion("fronthandtwo <=", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoLike(String value) {
            addCriterion("fronthandtwo like", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoNotLike(String value) {
            addCriterion("fronthandtwo not like", value, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoIn(List<String> values) {
            addCriterion("fronthandtwo in", values, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoNotIn(List<String> values) {
            addCriterion("fronthandtwo not in", values, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoBetween(String value1, String value2) {
            addCriterion("fronthandtwo between", value1, value2, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andFronthandtwoNotBetween(String value1, String value2) {
            addCriterion("fronthandtwo not between", value1, value2, "fronthandtwo");
            return (Criteria) this;
        }

        public Criteria andTwoagencyIsNull() {
            addCriterion("twoagency is null");
            return (Criteria) this;
        }

        public Criteria andTwoagencyIsNotNull() {
            addCriterion("twoagency is not null");
            return (Criteria) this;
        }

        public Criteria andTwoagencyEqualTo(String value) {
            addCriterion("twoagency =", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyNotEqualTo(String value) {
            addCriterion("twoagency <>", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyGreaterThan(String value) {
            addCriterion("twoagency >", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyGreaterThanOrEqualTo(String value) {
            addCriterion("twoagency >=", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyLessThan(String value) {
            addCriterion("twoagency <", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyLessThanOrEqualTo(String value) {
            addCriterion("twoagency <=", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyLike(String value) {
            addCriterion("twoagency like", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyNotLike(String value) {
            addCriterion("twoagency not like", value, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyIn(List<String> values) {
            addCriterion("twoagency in", values, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyNotIn(List<String> values) {
            addCriterion("twoagency not in", values, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyBetween(String value1, String value2) {
            addCriterion("twoagency between", value1, value2, "twoagency");
            return (Criteria) this;
        }

        public Criteria andTwoagencyNotBetween(String value1, String value2) {
            addCriterion("twoagency not between", value1, value2, "twoagency");
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