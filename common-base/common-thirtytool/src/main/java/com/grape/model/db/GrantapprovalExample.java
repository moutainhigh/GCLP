package com.grape.model.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GrantapprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrantapprovalExample() {
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

        public Criteria andLoanconfirmflgIsNull() {
            addCriterion("loanconfirmflg is null");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgIsNotNull() {
            addCriterion("loanconfirmflg is not null");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgEqualTo(String value) {
            addCriterion("loanconfirmflg =", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgNotEqualTo(String value) {
            addCriterion("loanconfirmflg <>", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgGreaterThan(String value) {
            addCriterion("loanconfirmflg >", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgGreaterThanOrEqualTo(String value) {
            addCriterion("loanconfirmflg >=", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgLessThan(String value) {
            addCriterion("loanconfirmflg <", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgLessThanOrEqualTo(String value) {
            addCriterion("loanconfirmflg <=", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgLike(String value) {
            addCriterion("loanconfirmflg like", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgNotLike(String value) {
            addCriterion("loanconfirmflg not like", value, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgIn(List<String> values) {
            addCriterion("loanconfirmflg in", values, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgNotIn(List<String> values) {
            addCriterion("loanconfirmflg not in", values, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgBetween(String value1, String value2) {
            addCriterion("loanconfirmflg between", value1, value2, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andLoanconfirmflgNotBetween(String value1, String value2) {
            addCriterion("loanconfirmflg not between", value1, value2, "loanconfirmflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgIsNull() {
            addCriterion("contractsignflg is null");
            return (Criteria) this;
        }

        public Criteria andContractsignflgIsNotNull() {
            addCriterion("contractsignflg is not null");
            return (Criteria) this;
        }

        public Criteria andContractsignflgEqualTo(String value) {
            addCriterion("contractsignflg =", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgNotEqualTo(String value) {
            addCriterion("contractsignflg <>", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgGreaterThan(String value) {
            addCriterion("contractsignflg >", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgGreaterThanOrEqualTo(String value) {
            addCriterion("contractsignflg >=", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgLessThan(String value) {
            addCriterion("contractsignflg <", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgLessThanOrEqualTo(String value) {
            addCriterion("contractsignflg <=", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgLike(String value) {
            addCriterion("contractsignflg like", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgNotLike(String value) {
            addCriterion("contractsignflg not like", value, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgIn(List<String> values) {
            addCriterion("contractsignflg in", values, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgNotIn(List<String> values) {
            addCriterion("contractsignflg not in", values, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgBetween(String value1, String value2) {
            addCriterion("contractsignflg between", value1, value2, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andContractsignflgNotBetween(String value1, String value2) {
            addCriterion("contractsignflg not between", value1, value2, "contractsignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgIsNull() {
            addCriterion("declaresignflg is null");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgIsNotNull() {
            addCriterion("declaresignflg is not null");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgEqualTo(String value) {
            addCriterion("declaresignflg =", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgNotEqualTo(String value) {
            addCriterion("declaresignflg <>", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgGreaterThan(String value) {
            addCriterion("declaresignflg >", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgGreaterThanOrEqualTo(String value) {
            addCriterion("declaresignflg >=", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgLessThan(String value) {
            addCriterion("declaresignflg <", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgLessThanOrEqualTo(String value) {
            addCriterion("declaresignflg <=", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgLike(String value) {
            addCriterion("declaresignflg like", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgNotLike(String value) {
            addCriterion("declaresignflg not like", value, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgIn(List<String> values) {
            addCriterion("declaresignflg in", values, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgNotIn(List<String> values) {
            addCriterion("declaresignflg not in", values, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgBetween(String value1, String value2) {
            addCriterion("declaresignflg between", value1, value2, "declaresignflg");
            return (Criteria) this;
        }

        public Criteria andDeclaresignflgNotBetween(String value1, String value2) {
            addCriterion("declaresignflg not between", value1, value2, "declaresignflg");
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

        public Criteria andApprovelcarryoutflgIsNull() {
            addCriterion("approvelcarryoutflg is null");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgIsNotNull() {
            addCriterion("approvelcarryoutflg is not null");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgEqualTo(String value) {
            addCriterion("approvelcarryoutflg =", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgNotEqualTo(String value) {
            addCriterion("approvelcarryoutflg <>", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgGreaterThan(String value) {
            addCriterion("approvelcarryoutflg >", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgGreaterThanOrEqualTo(String value) {
            addCriterion("approvelcarryoutflg >=", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgLessThan(String value) {
            addCriterion("approvelcarryoutflg <", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgLessThanOrEqualTo(String value) {
            addCriterion("approvelcarryoutflg <=", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgLike(String value) {
            addCriterion("approvelcarryoutflg like", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgNotLike(String value) {
            addCriterion("approvelcarryoutflg not like", value, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgIn(List<String> values) {
            addCriterion("approvelcarryoutflg in", values, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgNotIn(List<String> values) {
            addCriterion("approvelcarryoutflg not in", values, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgBetween(String value1, String value2) {
            addCriterion("approvelcarryoutflg between", value1, value2, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andApprovelcarryoutflgNotBetween(String value1, String value2) {
            addCriterion("approvelcarryoutflg not between", value1, value2, "approvelcarryoutflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgIsNull() {
            addCriterion("suggestloanflg is null");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgIsNotNull() {
            addCriterion("suggestloanflg is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgEqualTo(String value) {
            addCriterion("suggestloanflg =", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotEqualTo(String value) {
            addCriterion("suggestloanflg <>", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgGreaterThan(String value) {
            addCriterion("suggestloanflg >", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgGreaterThanOrEqualTo(String value) {
            addCriterion("suggestloanflg >=", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgLessThan(String value) {
            addCriterion("suggestloanflg <", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgLessThanOrEqualTo(String value) {
            addCriterion("suggestloanflg <=", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgLike(String value) {
            addCriterion("suggestloanflg like", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotLike(String value) {
            addCriterion("suggestloanflg not like", value, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgIn(List<String> values) {
            addCriterion("suggestloanflg in", values, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotIn(List<String> values) {
            addCriterion("suggestloanflg not in", values, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgBetween(String value1, String value2) {
            addCriterion("suggestloanflg between", value1, value2, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andSuggestloanflgNotBetween(String value1, String value2) {
            addCriterion("suggestloanflg not between", value1, value2, "suggestloanflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgIsNull() {
            addCriterion("realestatecollectflg is null");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgIsNotNull() {
            addCriterion("realestatecollectflg is not null");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgEqualTo(String value) {
            addCriterion("realestatecollectflg =", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgNotEqualTo(String value) {
            addCriterion("realestatecollectflg <>", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgGreaterThan(String value) {
            addCriterion("realestatecollectflg >", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgGreaterThanOrEqualTo(String value) {
            addCriterion("realestatecollectflg >=", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgLessThan(String value) {
            addCriterion("realestatecollectflg <", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgLessThanOrEqualTo(String value) {
            addCriterion("realestatecollectflg <=", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgLike(String value) {
            addCriterion("realestatecollectflg like", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgNotLike(String value) {
            addCriterion("realestatecollectflg not like", value, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgIn(List<String> values) {
            addCriterion("realestatecollectflg in", values, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgNotIn(List<String> values) {
            addCriterion("realestatecollectflg not in", values, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgBetween(String value1, String value2) {
            addCriterion("realestatecollectflg between", value1, value2, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andRealestatecollectflgNotBetween(String value1, String value2) {
            addCriterion("realestatecollectflg not between", value1, value2, "realestatecollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgIsNull() {
            addCriterion("resultcollectflg is null");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgIsNotNull() {
            addCriterion("resultcollectflg is not null");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgEqualTo(String value) {
            addCriterion("resultcollectflg =", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgNotEqualTo(String value) {
            addCriterion("resultcollectflg <>", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgGreaterThan(String value) {
            addCriterion("resultcollectflg >", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgGreaterThanOrEqualTo(String value) {
            addCriterion("resultcollectflg >=", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgLessThan(String value) {
            addCriterion("resultcollectflg <", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgLessThanOrEqualTo(String value) {
            addCriterion("resultcollectflg <=", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgLike(String value) {
            addCriterion("resultcollectflg like", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgNotLike(String value) {
            addCriterion("resultcollectflg not like", value, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgIn(List<String> values) {
            addCriterion("resultcollectflg in", values, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgNotIn(List<String> values) {
            addCriterion("resultcollectflg not in", values, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgBetween(String value1, String value2) {
            addCriterion("resultcollectflg between", value1, value2, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andResultcollectflgNotBetween(String value1, String value2) {
            addCriterion("resultcollectflg not between", value1, value2, "resultcollectflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgIsNull() {
            addCriterion("referenceflg is null");
            return (Criteria) this;
        }

        public Criteria andReferenceflgIsNotNull() {
            addCriterion("referenceflg is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceflgEqualTo(String value) {
            addCriterion("referenceflg =", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgNotEqualTo(String value) {
            addCriterion("referenceflg <>", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgGreaterThan(String value) {
            addCriterion("referenceflg >", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgGreaterThanOrEqualTo(String value) {
            addCriterion("referenceflg >=", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgLessThan(String value) {
            addCriterion("referenceflg <", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgLessThanOrEqualTo(String value) {
            addCriterion("referenceflg <=", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgLike(String value) {
            addCriterion("referenceflg like", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgNotLike(String value) {
            addCriterion("referenceflg not like", value, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgIn(List<String> values) {
            addCriterion("referenceflg in", values, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgNotIn(List<String> values) {
            addCriterion("referenceflg not in", values, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgBetween(String value1, String value2) {
            addCriterion("referenceflg between", value1, value2, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andReferenceflgNotBetween(String value1, String value2) {
            addCriterion("referenceflg not between", value1, value2, "referenceflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgIsNull() {
            addCriterion("sharepledgeflg is null");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgIsNotNull() {
            addCriterion("sharepledgeflg is not null");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgEqualTo(String value) {
            addCriterion("sharepledgeflg =", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgNotEqualTo(String value) {
            addCriterion("sharepledgeflg <>", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgGreaterThan(String value) {
            addCriterion("sharepledgeflg >", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgGreaterThanOrEqualTo(String value) {
            addCriterion("sharepledgeflg >=", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgLessThan(String value) {
            addCriterion("sharepledgeflg <", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgLessThanOrEqualTo(String value) {
            addCriterion("sharepledgeflg <=", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgLike(String value) {
            addCriterion("sharepledgeflg like", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgNotLike(String value) {
            addCriterion("sharepledgeflg not like", value, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgIn(List<String> values) {
            addCriterion("sharepledgeflg in", values, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgNotIn(List<String> values) {
            addCriterion("sharepledgeflg not in", values, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgBetween(String value1, String value2) {
            addCriterion("sharepledgeflg between", value1, value2, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andSharepledgeflgNotBetween(String value1, String value2) {
            addCriterion("sharepledgeflg not between", value1, value2, "sharepledgeflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgIsNull() {
            addCriterion("bailcollectflg is null");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgIsNotNull() {
            addCriterion("bailcollectflg is not null");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgEqualTo(String value) {
            addCriterion("bailcollectflg =", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgNotEqualTo(String value) {
            addCriterion("bailcollectflg <>", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgGreaterThan(String value) {
            addCriterion("bailcollectflg >", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgGreaterThanOrEqualTo(String value) {
            addCriterion("bailcollectflg >=", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgLessThan(String value) {
            addCriterion("bailcollectflg <", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgLessThanOrEqualTo(String value) {
            addCriterion("bailcollectflg <=", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgLike(String value) {
            addCriterion("bailcollectflg like", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgNotLike(String value) {
            addCriterion("bailcollectflg not like", value, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgIn(List<String> values) {
            addCriterion("bailcollectflg in", values, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgNotIn(List<String> values) {
            addCriterion("bailcollectflg not in", values, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgBetween(String value1, String value2) {
            addCriterion("bailcollectflg between", value1, value2, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andBailcollectflgNotBetween(String value1, String value2) {
            addCriterion("bailcollectflg not between", value1, value2, "bailcollectflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgIsNull() {
            addCriterion("preloanapplyflg is null");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgIsNotNull() {
            addCriterion("preloanapplyflg is not null");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgEqualTo(String value) {
            addCriterion("preloanapplyflg =", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgNotEqualTo(String value) {
            addCriterion("preloanapplyflg <>", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgGreaterThan(String value) {
            addCriterion("preloanapplyflg >", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgGreaterThanOrEqualTo(String value) {
            addCriterion("preloanapplyflg >=", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgLessThan(String value) {
            addCriterion("preloanapplyflg <", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgLessThanOrEqualTo(String value) {
            addCriterion("preloanapplyflg <=", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgLike(String value) {
            addCriterion("preloanapplyflg like", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgNotLike(String value) {
            addCriterion("preloanapplyflg not like", value, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgIn(List<String> values) {
            addCriterion("preloanapplyflg in", values, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgNotIn(List<String> values) {
            addCriterion("preloanapplyflg not in", values, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgBetween(String value1, String value2) {
            addCriterion("preloanapplyflg between", value1, value2, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andPreloanapplyflgNotBetween(String value1, String value2) {
            addCriterion("preloanapplyflg not between", value1, value2, "preloanapplyflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgIsNull() {
            addCriterion("repayplanflg is null");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgIsNotNull() {
            addCriterion("repayplanflg is not null");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgEqualTo(String value) {
            addCriterion("repayplanflg =", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgNotEqualTo(String value) {
            addCriterion("repayplanflg <>", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgGreaterThan(String value) {
            addCriterion("repayplanflg >", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgGreaterThanOrEqualTo(String value) {
            addCriterion("repayplanflg >=", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgLessThan(String value) {
            addCriterion("repayplanflg <", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgLessThanOrEqualTo(String value) {
            addCriterion("repayplanflg <=", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgLike(String value) {
            addCriterion("repayplanflg like", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgNotLike(String value) {
            addCriterion("repayplanflg not like", value, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgIn(List<String> values) {
            addCriterion("repayplanflg in", values, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgNotIn(List<String> values) {
            addCriterion("repayplanflg not in", values, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgBetween(String value1, String value2) {
            addCriterion("repayplanflg between", value1, value2, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andRepayplanflgNotBetween(String value1, String value2) {
            addCriterion("repayplanflg not between", value1, value2, "repayplanflg");
            return (Criteria) this;
        }

        public Criteria andFeeamountIsNull() {
            addCriterion("feeamount is null");
            return (Criteria) this;
        }

        public Criteria andFeeamountIsNotNull() {
            addCriterion("feeamount is not null");
            return (Criteria) this;
        }

        public Criteria andFeeamountEqualTo(BigDecimal value) {
            addCriterion("feeamount =", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountNotEqualTo(BigDecimal value) {
            addCriterion("feeamount <>", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountGreaterThan(BigDecimal value) {
            addCriterion("feeamount >", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("feeamount >=", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountLessThan(BigDecimal value) {
            addCriterion("feeamount <", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("feeamount <=", value, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountIn(List<BigDecimal> values) {
            addCriterion("feeamount in", values, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountNotIn(List<BigDecimal> values) {
            addCriterion("feeamount not in", values, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("feeamount between", value1, value2, "feeamount");
            return (Criteria) this;
        }

        public Criteria andFeeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("feeamount not between", value1, value2, "feeamount");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeIsNull() {
            addCriterion("loanapproveltype is null");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeIsNotNull() {
            addCriterion("loanapproveltype is not null");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeEqualTo(String value) {
            addCriterion("loanapproveltype =", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeNotEqualTo(String value) {
            addCriterion("loanapproveltype <>", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeGreaterThan(String value) {
            addCriterion("loanapproveltype >", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeGreaterThanOrEqualTo(String value) {
            addCriterion("loanapproveltype >=", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeLessThan(String value) {
            addCriterion("loanapproveltype <", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeLessThanOrEqualTo(String value) {
            addCriterion("loanapproveltype <=", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeLike(String value) {
            addCriterion("loanapproveltype like", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeNotLike(String value) {
            addCriterion("loanapproveltype not like", value, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeIn(List<String> values) {
            addCriterion("loanapproveltype in", values, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeNotIn(List<String> values) {
            addCriterion("loanapproveltype not in", values, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeBetween(String value1, String value2) {
            addCriterion("loanapproveltype between", value1, value2, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andLoanapproveltypeNotBetween(String value1, String value2) {
            addCriterion("loanapproveltype not between", value1, value2, "loanapproveltype");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("approver not between", value1, value2, "approver");
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