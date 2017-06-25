package com.zrb.domain;

import java.util.ArrayList;
import java.util.List;

public class SurveyAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyAdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("ADMIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("ADMIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("ADMIN_ID =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("ADMIN_ID <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("ADMIN_ID >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADMIN_ID >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("ADMIN_ID <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("ADMIN_ID <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("ADMIN_ID in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("ADMIN_ID not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("ADMIN_ID between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ADMIN_ID not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("ADMIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("ADMIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("ADMIN_NAME =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("ADMIN_NAME <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("ADMIN_NAME >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("ADMIN_NAME <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("ADMIN_NAME like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("ADMIN_NAME not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("ADMIN_NAME in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("ADMIN_NAME not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNull() {
            addCriterion("ADMIN_PWD is null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNotNull() {
            addCriterion("ADMIN_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdEqualTo(String value) {
            addCriterion("ADMIN_PWD =", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotEqualTo(String value) {
            addCriterion("ADMIN_PWD <>", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThan(String value) {
            addCriterion("ADMIN_PWD >", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_PWD >=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThan(String value) {
            addCriterion("ADMIN_PWD <", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_PWD <=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLike(String value) {
            addCriterion("ADMIN_PWD like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotLike(String value) {
            addCriterion("ADMIN_PWD not like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIn(List<String> values) {
            addCriterion("ADMIN_PWD in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotIn(List<String> values) {
            addCriterion("ADMIN_PWD not in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdBetween(String value1, String value2) {
            addCriterion("ADMIN_PWD between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotBetween(String value1, String value2) {
            addCriterion("ADMIN_PWD not between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andResCodeArrIsNull() {
            addCriterion("RES_CODE_ARR is null");
            return (Criteria) this;
        }

        public Criteria andResCodeArrIsNotNull() {
            addCriterion("RES_CODE_ARR is not null");
            return (Criteria) this;
        }

        public Criteria andResCodeArrEqualTo(String value) {
            addCriterion("RES_CODE_ARR =", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrNotEqualTo(String value) {
            addCriterion("RES_CODE_ARR <>", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrGreaterThan(String value) {
            addCriterion("RES_CODE_ARR >", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrGreaterThanOrEqualTo(String value) {
            addCriterion("RES_CODE_ARR >=", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrLessThan(String value) {
            addCriterion("RES_CODE_ARR <", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrLessThanOrEqualTo(String value) {
            addCriterion("RES_CODE_ARR <=", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrLike(String value) {
            addCriterion("RES_CODE_ARR like", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrNotLike(String value) {
            addCriterion("RES_CODE_ARR not like", value, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrIn(List<String> values) {
            addCriterion("RES_CODE_ARR in", values, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrNotIn(List<String> values) {
            addCriterion("RES_CODE_ARR not in", values, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrBetween(String value1, String value2) {
            addCriterion("RES_CODE_ARR between", value1, value2, "resCodeArr");
            return (Criteria) this;
        }

        public Criteria andResCodeArrNotBetween(String value1, String value2) {
            addCriterion("RES_CODE_ARR not between", value1, value2, "resCodeArr");
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