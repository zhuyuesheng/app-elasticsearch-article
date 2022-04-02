package com.zhuys.module.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andYhidIsNull() {
            addCriterion("yhid is null");
            return (Criteria) this;
        }

        public Criteria andYhidIsNotNull() {
            addCriterion("yhid is not null");
            return (Criteria) this;
        }

        public Criteria andYhidEqualTo(String value) {
            addCriterion("yhid =", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotEqualTo(String value) {
            addCriterion("yhid <>", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThan(String value) {
            addCriterion("yhid >", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThanOrEqualTo(String value) {
            addCriterion("yhid >=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThan(String value) {
            addCriterion("yhid <", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThanOrEqualTo(String value) {
            addCriterion("yhid <=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLike(String value) {
            addCriterion("yhid like", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotLike(String value) {
            addCriterion("yhid not like", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidIn(List<String> values) {
            addCriterion("yhid in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotIn(List<String> values) {
            addCriterion("yhid not in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidBetween(String value1, String value2) {
            addCriterion("yhid between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotBetween(String value1, String value2) {
            addCriterion("yhid not between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andBpIsNull() {
            addCriterion("bp is null");
            return (Criteria) this;
        }

        public Criteria andBpIsNotNull() {
            addCriterion("bp is not null");
            return (Criteria) this;
        }

        public Criteria andBpEqualTo(String value) {
            addCriterion("bp =", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotEqualTo(String value) {
            addCriterion("bp <>", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpGreaterThan(String value) {
            addCriterion("bp >", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpGreaterThanOrEqualTo(String value) {
            addCriterion("bp >=", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLessThan(String value) {
            addCriterion("bp <", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLessThanOrEqualTo(String value) {
            addCriterion("bp <=", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLike(String value) {
            addCriterion("bp like", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotLike(String value) {
            addCriterion("bp not like", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpIn(List<String> values) {
            addCriterion("bp in", values, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotIn(List<String> values) {
            addCriterion("bp not in", values, "bp");
            return (Criteria) this;
        }

        public Criteria andBpBetween(String value1, String value2) {
            addCriterion("bp between", value1, value2, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotBetween(String value1, String value2) {
            addCriterion("bp not between", value1, value2, "bp");
            return (Criteria) this;
        }

        public Criteria andCabmIsNull() {
            addCriterion("cabm is null");
            return (Criteria) this;
        }

        public Criteria andCabmIsNotNull() {
            addCriterion("cabm is not null");
            return (Criteria) this;
        }

        public Criteria andCabmEqualTo(String value) {
            addCriterion("cabm =", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmNotEqualTo(String value) {
            addCriterion("cabm <>", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmGreaterThan(String value) {
            addCriterion("cabm >", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmGreaterThanOrEqualTo(String value) {
            addCriterion("cabm >=", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmLessThan(String value) {
            addCriterion("cabm <", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmLessThanOrEqualTo(String value) {
            addCriterion("cabm <=", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmLike(String value) {
            addCriterion("cabm like", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmNotLike(String value) {
            addCriterion("cabm not like", value, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmIn(List<String> values) {
            addCriterion("cabm in", values, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmNotIn(List<String> values) {
            addCriterion("cabm not in", values, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmBetween(String value1, String value2) {
            addCriterion("cabm between", value1, value2, "cabm");
            return (Criteria) this;
        }

        public Criteria andCabmNotBetween(String value1, String value2) {
            addCriterion("cabm not between", value1, value2, "cabm");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhIsNull() {
            addCriterion("change_bmbh is null");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhIsNotNull() {
            addCriterion("change_bmbh is not null");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhEqualTo(String value) {
            addCriterion("change_bmbh =", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhNotEqualTo(String value) {
            addCriterion("change_bmbh <>", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhGreaterThan(String value) {
            addCriterion("change_bmbh >", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhGreaterThanOrEqualTo(String value) {
            addCriterion("change_bmbh >=", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhLessThan(String value) {
            addCriterion("change_bmbh <", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhLessThanOrEqualTo(String value) {
            addCriterion("change_bmbh <=", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhLike(String value) {
            addCriterion("change_bmbh like", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhNotLike(String value) {
            addCriterion("change_bmbh not like", value, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhIn(List<String> values) {
            addCriterion("change_bmbh in", values, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhNotIn(List<String> values) {
            addCriterion("change_bmbh not in", values, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhBetween(String value1, String value2) {
            addCriterion("change_bmbh between", value1, value2, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andChangeBmbhNotBetween(String value1, String value2) {
            addCriterion("change_bmbh not between", value1, value2, "changeBmbh");
            return (Criteria) this;
        }

        public Criteria andCjrIsNull() {
            addCriterion("cjr is null");
            return (Criteria) this;
        }

        public Criteria andCjrIsNotNull() {
            addCriterion("cjr is not null");
            return (Criteria) this;
        }

        public Criteria andCjrEqualTo(String value) {
            addCriterion("cjr =", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotEqualTo(String value) {
            addCriterion("cjr <>", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThan(String value) {
            addCriterion("cjr >", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrGreaterThanOrEqualTo(String value) {
            addCriterion("cjr >=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThan(String value) {
            addCriterion("cjr <", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLessThanOrEqualTo(String value) {
            addCriterion("cjr <=", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrLike(String value) {
            addCriterion("cjr like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotLike(String value) {
            addCriterion("cjr not like", value, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrIn(List<String> values) {
            addCriterion("cjr in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotIn(List<String> values) {
            addCriterion("cjr not in", values, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrBetween(String value1, String value2) {
            addCriterion("cjr between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjrNotBetween(String value1, String value2) {
            addCriterion("cjr not between", value1, value2, "cjr");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("cjsj is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(String value) {
            addCriterion("cjsj =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(String value) {
            addCriterion("cjsj <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(String value) {
            addCriterion("cjsj >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(String value) {
            addCriterion("cjsj >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(String value) {
            addCriterion("cjsj <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(String value) {
            addCriterion("cjsj <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLike(String value) {
            addCriterion("cjsj like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotLike(String value) {
            addCriterion("cjsj not like", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<String> values) {
            addCriterion("cjsj in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<String> values) {
            addCriterion("cjsj not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(String value1, String value2) {
            addCriterion("cjsj between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(String value1, String value2) {
            addCriterion("cjsj not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(String value) {
            addCriterion("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(String value) {
            addCriterion("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(String value) {
            addCriterion("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(String value) {
            addCriterion("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(String value) {
            addCriterion("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(String value) {
            addCriterion("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLike(String value) {
            addCriterion("csrq like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotLike(String value) {
            addCriterion("csrq not like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<String> values) {
            addCriterion("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<String> values) {
            addCriterion("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(String value1, String value2) {
            addCriterion("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(String value1, String value2) {
            addCriterion("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andDllxIsNull() {
            addCriterion("dllx is null");
            return (Criteria) this;
        }

        public Criteria andDllxIsNotNull() {
            addCriterion("dllx is not null");
            return (Criteria) this;
        }

        public Criteria andDllxEqualTo(String value) {
            addCriterion("dllx =", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotEqualTo(String value) {
            addCriterion("dllx <>", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxGreaterThan(String value) {
            addCriterion("dllx >", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxGreaterThanOrEqualTo(String value) {
            addCriterion("dllx >=", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxLessThan(String value) {
            addCriterion("dllx <", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxLessThanOrEqualTo(String value) {
            addCriterion("dllx <=", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxLike(String value) {
            addCriterion("dllx like", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotLike(String value) {
            addCriterion("dllx not like", value, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxIn(List<String> values) {
            addCriterion("dllx in", values, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotIn(List<String> values) {
            addCriterion("dllx not in", values, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxBetween(String value1, String value2) {
            addCriterion("dllx between", value1, value2, "dllx");
            return (Criteria) this;
        }

        public Criteria andDllxNotBetween(String value1, String value2) {
            addCriterion("dllx not between", value1, value2, "dllx");
            return (Criteria) this;
        }

        public Criteria andDzqzjzIsNull() {
            addCriterion("dzqzjz is null");
            return (Criteria) this;
        }

        public Criteria andDzqzjzIsNotNull() {
            addCriterion("dzqzjz is not null");
            return (Criteria) this;
        }

        public Criteria andDzqzjzEqualTo(String value) {
            addCriterion("dzqzjz =", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzNotEqualTo(String value) {
            addCriterion("dzqzjz <>", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzGreaterThan(String value) {
            addCriterion("dzqzjz >", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzGreaterThanOrEqualTo(String value) {
            addCriterion("dzqzjz >=", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzLessThan(String value) {
            addCriterion("dzqzjz <", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzLessThanOrEqualTo(String value) {
            addCriterion("dzqzjz <=", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzLike(String value) {
            addCriterion("dzqzjz like", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzNotLike(String value) {
            addCriterion("dzqzjz not like", value, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzIn(List<String> values) {
            addCriterion("dzqzjz in", values, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzNotIn(List<String> values) {
            addCriterion("dzqzjz not in", values, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzBetween(String value1, String value2) {
            addCriterion("dzqzjz between", value1, value2, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzjzNotBetween(String value1, String value2) {
            addCriterion("dzqzjz not between", value1, value2, "dzqzjz");
            return (Criteria) this;
        }

        public Criteria andDzqzqsIsNull() {
            addCriterion("dzqzqs is null");
            return (Criteria) this;
        }

        public Criteria andDzqzqsIsNotNull() {
            addCriterion("dzqzqs is not null");
            return (Criteria) this;
        }

        public Criteria andDzqzqsEqualTo(String value) {
            addCriterion("dzqzqs =", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsNotEqualTo(String value) {
            addCriterion("dzqzqs <>", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsGreaterThan(String value) {
            addCriterion("dzqzqs >", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsGreaterThanOrEqualTo(String value) {
            addCriterion("dzqzqs >=", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsLessThan(String value) {
            addCriterion("dzqzqs <", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsLessThanOrEqualTo(String value) {
            addCriterion("dzqzqs <=", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsLike(String value) {
            addCriterion("dzqzqs like", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsNotLike(String value) {
            addCriterion("dzqzqs not like", value, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsIn(List<String> values) {
            addCriterion("dzqzqs in", values, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsNotIn(List<String> values) {
            addCriterion("dzqzqs not in", values, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsBetween(String value1, String value2) {
            addCriterion("dzqzqs between", value1, value2, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andDzqzqsNotBetween(String value1, String value2) {
            addCriterion("dzqzqs not between", value1, value2, "dzqzqs");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andImorderIsNull() {
            addCriterion("imorder is null");
            return (Criteria) this;
        }

        public Criteria andImorderIsNotNull() {
            addCriterion("imorder is not null");
            return (Criteria) this;
        }

        public Criteria andImorderEqualTo(String value) {
            addCriterion("imorder =", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderNotEqualTo(String value) {
            addCriterion("imorder <>", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderGreaterThan(String value) {
            addCriterion("imorder >", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderGreaterThanOrEqualTo(String value) {
            addCriterion("imorder >=", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderLessThan(String value) {
            addCriterion("imorder <", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderLessThanOrEqualTo(String value) {
            addCriterion("imorder <=", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderLike(String value) {
            addCriterion("imorder like", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderNotLike(String value) {
            addCriterion("imorder not like", value, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderIn(List<String> values) {
            addCriterion("imorder in", values, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderNotIn(List<String> values) {
            addCriterion("imorder not in", values, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderBetween(String value1, String value2) {
            addCriterion("imorder between", value1, value2, "imorder");
            return (Criteria) this;
        }

        public Criteria andImorderNotBetween(String value1, String value2) {
            addCriterion("imorder not between", value1, value2, "imorder");
            return (Criteria) this;
        }

        public Criteria andJyhmIsNull() {
            addCriterion("jyhm is null");
            return (Criteria) this;
        }

        public Criteria andJyhmIsNotNull() {
            addCriterion("jyhm is not null");
            return (Criteria) this;
        }

        public Criteria andJyhmEqualTo(String value) {
            addCriterion("jyhm =", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmNotEqualTo(String value) {
            addCriterion("jyhm <>", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmGreaterThan(String value) {
            addCriterion("jyhm >", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmGreaterThanOrEqualTo(String value) {
            addCriterion("jyhm >=", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmLessThan(String value) {
            addCriterion("jyhm <", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmLessThanOrEqualTo(String value) {
            addCriterion("jyhm <=", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmLike(String value) {
            addCriterion("jyhm like", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmNotLike(String value) {
            addCriterion("jyhm not like", value, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmIn(List<String> values) {
            addCriterion("jyhm in", values, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmNotIn(List<String> values) {
            addCriterion("jyhm not in", values, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmBetween(String value1, String value2) {
            addCriterion("jyhm between", value1, value2, "jyhm");
            return (Criteria) this;
        }

        public Criteria andJyhmNotBetween(String value1, String value2) {
            addCriterion("jyhm not between", value1, value2, "jyhm");
            return (Criteria) this;
        }

        public Criteria andLockyhIsNull() {
            addCriterion("lockyh is null");
            return (Criteria) this;
        }

        public Criteria andLockyhIsNotNull() {
            addCriterion("lockyh is not null");
            return (Criteria) this;
        }

        public Criteria andLockyhEqualTo(String value) {
            addCriterion("lockyh =", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhNotEqualTo(String value) {
            addCriterion("lockyh <>", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhGreaterThan(String value) {
            addCriterion("lockyh >", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhGreaterThanOrEqualTo(String value) {
            addCriterion("lockyh >=", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhLessThan(String value) {
            addCriterion("lockyh <", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhLessThanOrEqualTo(String value) {
            addCriterion("lockyh <=", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhLike(String value) {
            addCriterion("lockyh like", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhNotLike(String value) {
            addCriterion("lockyh not like", value, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhIn(List<String> values) {
            addCriterion("lockyh in", values, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhNotIn(List<String> values) {
            addCriterion("lockyh not in", values, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhBetween(String value1, String value2) {
            addCriterion("lockyh between", value1, value2, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLockyhNotBetween(String value1, String value2) {
            addCriterion("lockyh not between", value1, value2, "lockyh");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesIsNull() {
            addCriterion("logerrortimes is null");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesIsNotNull() {
            addCriterion("logerrortimes is not null");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesEqualTo(String value) {
            addCriterion("logerrortimes =", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesNotEqualTo(String value) {
            addCriterion("logerrortimes <>", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesGreaterThan(String value) {
            addCriterion("logerrortimes >", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesGreaterThanOrEqualTo(String value) {
            addCriterion("logerrortimes >=", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesLessThan(String value) {
            addCriterion("logerrortimes <", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesLessThanOrEqualTo(String value) {
            addCriterion("logerrortimes <=", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesLike(String value) {
            addCriterion("logerrortimes like", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesNotLike(String value) {
            addCriterion("logerrortimes not like", value, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesIn(List<String> values) {
            addCriterion("logerrortimes in", values, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesNotIn(List<String> values) {
            addCriterion("logerrortimes not in", values, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesBetween(String value1, String value2) {
            addCriterion("logerrortimes between", value1, value2, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andLogerrortimesNotBetween(String value1, String value2) {
            addCriterion("logerrortimes not between", value1, value2, "logerrortimes");
            return (Criteria) this;
        }

        public Criteria andMgrLevelIsNull() {
            addCriterion("mgr_level is null");
            return (Criteria) this;
        }

        public Criteria andMgrLevelIsNotNull() {
            addCriterion("mgr_level is not null");
            return (Criteria) this;
        }

        public Criteria andMgrLevelEqualTo(String value) {
            addCriterion("mgr_level =", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelNotEqualTo(String value) {
            addCriterion("mgr_level <>", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelGreaterThan(String value) {
            addCriterion("mgr_level >", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelGreaterThanOrEqualTo(String value) {
            addCriterion("mgr_level >=", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelLessThan(String value) {
            addCriterion("mgr_level <", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelLessThanOrEqualTo(String value) {
            addCriterion("mgr_level <=", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelLike(String value) {
            addCriterion("mgr_level like", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelNotLike(String value) {
            addCriterion("mgr_level not like", value, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelIn(List<String> values) {
            addCriterion("mgr_level in", values, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelNotIn(List<String> values) {
            addCriterion("mgr_level not in", values, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelBetween(String value1, String value2) {
            addCriterion("mgr_level between", value1, value2, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMgrLevelNotBetween(String value1, String value2) {
            addCriterion("mgr_level not between", value1, value2, "mgrLevel");
            return (Criteria) this;
        }

        public Criteria andMjIsNull() {
            addCriterion("mj is null");
            return (Criteria) this;
        }

        public Criteria andMjIsNotNull() {
            addCriterion("mj is not null");
            return (Criteria) this;
        }

        public Criteria andMjEqualTo(Integer value) {
            addCriterion("mj =", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotEqualTo(Integer value) {
            addCriterion("mj <>", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThan(Integer value) {
            addCriterion("mj >", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThanOrEqualTo(Integer value) {
            addCriterion("mj >=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThan(Integer value) {
            addCriterion("mj <", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThanOrEqualTo(Integer value) {
            addCriterion("mj <=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjIn(List<Integer> values) {
            addCriterion("mj in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotIn(List<Integer> values) {
            addCriterion("mj not in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjBetween(Integer value1, Integer value2) {
            addCriterion("mj between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotBetween(Integer value1, Integer value2) {
            addCriterion("mj not between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andNcIsNull() {
            addCriterion("nc is null");
            return (Criteria) this;
        }

        public Criteria andNcIsNotNull() {
            addCriterion("nc is not null");
            return (Criteria) this;
        }

        public Criteria andNcEqualTo(String value) {
            addCriterion("nc =", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotEqualTo(String value) {
            addCriterion("nc <>", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcGreaterThan(String value) {
            addCriterion("nc >", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcGreaterThanOrEqualTo(String value) {
            addCriterion("nc >=", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLessThan(String value) {
            addCriterion("nc <", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLessThanOrEqualTo(String value) {
            addCriterion("nc <=", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcLike(String value) {
            addCriterion("nc like", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotLike(String value) {
            addCriterion("nc not like", value, "nc");
            return (Criteria) this;
        }

        public Criteria andNcIn(List<String> values) {
            addCriterion("nc in", values, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotIn(List<String> values) {
            addCriterion("nc not in", values, "nc");
            return (Criteria) this;
        }

        public Criteria andNcBetween(String value1, String value2) {
            addCriterion("nc between", value1, value2, "nc");
            return (Criteria) this;
        }

        public Criteria andNcNotBetween(String value1, String value2) {
            addCriterion("nc not between", value1, value2, "nc");
            return (Criteria) this;
        }

        public Criteria andYhmmIsNull() {
            addCriterion("yhmm is null");
            return (Criteria) this;
        }

        public Criteria andYhmmIsNotNull() {
            addCriterion("yhmm is not null");
            return (Criteria) this;
        }

        public Criteria andYhmmEqualTo(String value) {
            addCriterion("yhmm =", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotEqualTo(String value) {
            addCriterion("yhmm <>", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmGreaterThan(String value) {
            addCriterion("yhmm >", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmGreaterThanOrEqualTo(String value) {
            addCriterion("yhmm >=", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLessThan(String value) {
            addCriterion("yhmm <", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLessThanOrEqualTo(String value) {
            addCriterion("yhmm <=", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLike(String value) {
            addCriterion("yhmm like", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotLike(String value) {
            addCriterion("yhmm not like", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmIn(List<String> values) {
            addCriterion("yhmm in", values, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotIn(List<String> values) {
            addCriterion("yhmm not in", values, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmBetween(String value1, String value2) {
            addCriterion("yhmm between", value1, value2, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotBetween(String value1, String value2) {
            addCriterion("yhmm not between", value1, value2, "yhmm");
            return (Criteria) this;
        }

        public Criteria andQxqzIsNull() {
            addCriterion("qxqz is null");
            return (Criteria) this;
        }

        public Criteria andQxqzIsNotNull() {
            addCriterion("qxqz is not null");
            return (Criteria) this;
        }

        public Criteria andQxqzEqualTo(String value) {
            addCriterion("qxqz =", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzNotEqualTo(String value) {
            addCriterion("qxqz <>", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzGreaterThan(String value) {
            addCriterion("qxqz >", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzGreaterThanOrEqualTo(String value) {
            addCriterion("qxqz >=", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzLessThan(String value) {
            addCriterion("qxqz <", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzLessThanOrEqualTo(String value) {
            addCriterion("qxqz <=", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzLike(String value) {
            addCriterion("qxqz like", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzNotLike(String value) {
            addCriterion("qxqz not like", value, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzIn(List<String> values) {
            addCriterion("qxqz in", values, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzNotIn(List<String> values) {
            addCriterion("qxqz not in", values, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzBetween(String value1, String value2) {
            addCriterion("qxqz between", value1, value2, "qxqz");
            return (Criteria) this;
        }

        public Criteria andQxqzNotBetween(String value1, String value2) {
            addCriterion("qxqz not between", value1, value2, "qxqz");
            return (Criteria) this;
        }

        public Criteria andScyyIsNull() {
            addCriterion("scyy is null");
            return (Criteria) this;
        }

        public Criteria andScyyIsNotNull() {
            addCriterion("scyy is not null");
            return (Criteria) this;
        }

        public Criteria andScyyEqualTo(String value) {
            addCriterion("scyy =", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyNotEqualTo(String value) {
            addCriterion("scyy <>", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyGreaterThan(String value) {
            addCriterion("scyy >", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyGreaterThanOrEqualTo(String value) {
            addCriterion("scyy >=", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyLessThan(String value) {
            addCriterion("scyy <", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyLessThanOrEqualTo(String value) {
            addCriterion("scyy <=", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyLike(String value) {
            addCriterion("scyy like", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyNotLike(String value) {
            addCriterion("scyy not like", value, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyIn(List<String> values) {
            addCriterion("scyy in", values, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyNotIn(List<String> values) {
            addCriterion("scyy not in", values, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyBetween(String value1, String value2) {
            addCriterion("scyy between", value1, value2, "scyy");
            return (Criteria) this;
        }

        public Criteria andScyyNotBetween(String value1, String value2) {
            addCriterion("scyy not between", value1, value2, "scyy");
            return (Criteria) this;
        }

        public Criteria andSfshrzIsNull() {
            addCriterion("sfshrz is null");
            return (Criteria) this;
        }

        public Criteria andSfshrzIsNotNull() {
            addCriterion("sfshrz is not null");
            return (Criteria) this;
        }

        public Criteria andSfshrzEqualTo(String value) {
            addCriterion("sfshrz =", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzNotEqualTo(String value) {
            addCriterion("sfshrz <>", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzGreaterThan(String value) {
            addCriterion("sfshrz >", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzGreaterThanOrEqualTo(String value) {
            addCriterion("sfshrz >=", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzLessThan(String value) {
            addCriterion("sfshrz <", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzLessThanOrEqualTo(String value) {
            addCriterion("sfshrz <=", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzLike(String value) {
            addCriterion("sfshrz like", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzNotLike(String value) {
            addCriterion("sfshrz not like", value, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzIn(List<String> values) {
            addCriterion("sfshrz in", values, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzNotIn(List<String> values) {
            addCriterion("sfshrz not in", values, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzBetween(String value1, String value2) {
            addCriterion("sfshrz between", value1, value2, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfshrzNotBetween(String value1, String value2) {
            addCriterion("sfshrz not between", value1, value2, "sfshrz");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNull() {
            addCriterion("sfzh is null");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNotNull() {
            addCriterion("sfzh is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhEqualTo(String value) {
            addCriterion("sfzh =", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotEqualTo(String value) {
            addCriterion("sfzh <>", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThan(String value) {
            addCriterion("sfzh >", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThanOrEqualTo(String value) {
            addCriterion("sfzh >=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThan(String value) {
            addCriterion("sfzh <", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThanOrEqualTo(String value) {
            addCriterion("sfzh <=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLike(String value) {
            addCriterion("sfzh like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotLike(String value) {
            addCriterion("sfzh not like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhIn(List<String> values) {
            addCriterion("sfzh in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotIn(List<String> values) {
            addCriterion("sfzh not in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhBetween(String value1, String value2) {
            addCriterion("sfzh between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotBetween(String value1, String value2) {
            addCriterion("sfzh not between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andShrIsNull() {
            addCriterion("shr is null");
            return (Criteria) this;
        }

        public Criteria andShrIsNotNull() {
            addCriterion("shr is not null");
            return (Criteria) this;
        }

        public Criteria andShrEqualTo(String value) {
            addCriterion("shr =", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotEqualTo(String value) {
            addCriterion("shr <>", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThan(String value) {
            addCriterion("shr >", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThanOrEqualTo(String value) {
            addCriterion("shr >=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThan(String value) {
            addCriterion("shr <", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThanOrEqualTo(String value) {
            addCriterion("shr <=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLike(String value) {
            addCriterion("shr like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotLike(String value) {
            addCriterion("shr not like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIn(List<String> values) {
            addCriterion("shr in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotIn(List<String> values) {
            addCriterion("shr not in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrBetween(String value1, String value2) {
            addCriterion("shr between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotBetween(String value1, String value2) {
            addCriterion("shr not between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShsjIsNull() {
            addCriterion("shsj is null");
            return (Criteria) this;
        }

        public Criteria andShsjIsNotNull() {
            addCriterion("shsj is not null");
            return (Criteria) this;
        }

        public Criteria andShsjEqualTo(Date value) {
            addCriterionForJDBCDate("shsj =", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("shsj <>", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjGreaterThan(Date value) {
            addCriterionForJDBCDate("shsj >", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shsj >=", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjLessThan(Date value) {
            addCriterionForJDBCDate("shsj <", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shsj <=", value, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjIn(List<Date> values) {
            addCriterionForJDBCDate("shsj in", values, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("shsj not in", values, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shsj between", value1, value2, "shsj");
            return (Criteria) this;
        }

        public Criteria andShsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shsj not between", value1, value2, "shsj");
            return (Criteria) this;
        }

        public Criteria andShyyIsNull() {
            addCriterion("shyy is null");
            return (Criteria) this;
        }

        public Criteria andShyyIsNotNull() {
            addCriterion("shyy is not null");
            return (Criteria) this;
        }

        public Criteria andShyyEqualTo(String value) {
            addCriterion("shyy =", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyNotEqualTo(String value) {
            addCriterion("shyy <>", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyGreaterThan(String value) {
            addCriterion("shyy >", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyGreaterThanOrEqualTo(String value) {
            addCriterion("shyy >=", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyLessThan(String value) {
            addCriterion("shyy <", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyLessThanOrEqualTo(String value) {
            addCriterion("shyy <=", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyLike(String value) {
            addCriterion("shyy like", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyNotLike(String value) {
            addCriterion("shyy not like", value, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyIn(List<String> values) {
            addCriterion("shyy in", values, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyNotIn(List<String> values) {
            addCriterion("shyy not in", values, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyBetween(String value1, String value2) {
            addCriterion("shyy between", value1, value2, "shyy");
            return (Criteria) this;
        }

        public Criteria andShyyNotBetween(String value1, String value2) {
            addCriterion("shyy not between", value1, value2, "shyy");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNull() {
            addCriterion("sjhm is null");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNotNull() {
            addCriterion("sjhm is not null");
            return (Criteria) this;
        }

        public Criteria andSjhmEqualTo(String value) {
            addCriterion("sjhm =", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotEqualTo(String value) {
            addCriterion("sjhm <>", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThan(String value) {
            addCriterion("sjhm >", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThanOrEqualTo(String value) {
            addCriterion("sjhm >=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThan(String value) {
            addCriterion("sjhm <", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThanOrEqualTo(String value) {
            addCriterion("sjhm <=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLike(String value) {
            addCriterion("sjhm like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotLike(String value) {
            addCriterion("sjhm not like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmIn(List<String> values) {
            addCriterion("sjhm in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotIn(List<String> values) {
            addCriterion("sjhm not in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmBetween(String value1, String value2) {
            addCriterion("sjhm between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotBetween(String value1, String value2) {
            addCriterion("sjhm not between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSpsjIsNull() {
            addCriterion("spsj is null");
            return (Criteria) this;
        }

        public Criteria andSpsjIsNotNull() {
            addCriterion("spsj is not null");
            return (Criteria) this;
        }

        public Criteria andSpsjEqualTo(String value) {
            addCriterion("spsj =", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotEqualTo(String value) {
            addCriterion("spsj <>", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjGreaterThan(String value) {
            addCriterion("spsj >", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjGreaterThanOrEqualTo(String value) {
            addCriterion("spsj >=", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjLessThan(String value) {
            addCriterion("spsj <", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjLessThanOrEqualTo(String value) {
            addCriterion("spsj <=", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjLike(String value) {
            addCriterion("spsj like", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotLike(String value) {
            addCriterion("spsj not like", value, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjIn(List<String> values) {
            addCriterion("spsj in", values, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotIn(List<String> values) {
            addCriterion("spsj not in", values, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjBetween(String value1, String value2) {
            addCriterion("spsj between", value1, value2, "spsj");
            return (Criteria) this;
        }

        public Criteria andSpsjNotBetween(String value1, String value2) {
            addCriterion("spsj not between", value1, value2, "spsj");
            return (Criteria) this;
        }

        public Criteria andSqlxIsNull() {
            addCriterion("sqlx is null");
            return (Criteria) this;
        }

        public Criteria andSqlxIsNotNull() {
            addCriterion("sqlx is not null");
            return (Criteria) this;
        }

        public Criteria andSqlxEqualTo(String value) {
            addCriterion("sqlx =", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotEqualTo(String value) {
            addCriterion("sqlx <>", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxGreaterThan(String value) {
            addCriterion("sqlx >", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxGreaterThanOrEqualTo(String value) {
            addCriterion("sqlx >=", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxLessThan(String value) {
            addCriterion("sqlx <", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxLessThanOrEqualTo(String value) {
            addCriterion("sqlx <=", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxLike(String value) {
            addCriterion("sqlx like", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotLike(String value) {
            addCriterion("sqlx not like", value, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxIn(List<String> values) {
            addCriterion("sqlx in", values, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotIn(List<String> values) {
            addCriterion("sqlx not in", values, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxBetween(String value1, String value2) {
            addCriterion("sqlx between", value1, value2, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqlxNotBetween(String value1, String value2) {
            addCriterion("sqlx not between", value1, value2, "sqlx");
            return (Criteria) this;
        }

        public Criteria andSqsjjzIsNull() {
            addCriterion("sqsjjz is null");
            return (Criteria) this;
        }

        public Criteria andSqsjjzIsNotNull() {
            addCriterion("sqsjjz is not null");
            return (Criteria) this;
        }

        public Criteria andSqsjjzEqualTo(String value) {
            addCriterion("sqsjjz =", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzNotEqualTo(String value) {
            addCriterion("sqsjjz <>", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzGreaterThan(String value) {
            addCriterion("sqsjjz >", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzGreaterThanOrEqualTo(String value) {
            addCriterion("sqsjjz >=", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzLessThan(String value) {
            addCriterion("sqsjjz <", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzLessThanOrEqualTo(String value) {
            addCriterion("sqsjjz <=", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzLike(String value) {
            addCriterion("sqsjjz like", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzNotLike(String value) {
            addCriterion("sqsjjz not like", value, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzIn(List<String> values) {
            addCriterion("sqsjjz in", values, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzNotIn(List<String> values) {
            addCriterion("sqsjjz not in", values, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzBetween(String value1, String value2) {
            addCriterion("sqsjjz between", value1, value2, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSqsjjzNotBetween(String value1, String value2) {
            addCriterion("sqsjjz not between", value1, value2, "sqsjjz");
            return (Criteria) this;
        }

        public Criteria andSsxtIsNull() {
            addCriterion("ssxt is null");
            return (Criteria) this;
        }

        public Criteria andSsxtIsNotNull() {
            addCriterion("ssxt is not null");
            return (Criteria) this;
        }

        public Criteria andSsxtEqualTo(String value) {
            addCriterion("ssxt =", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtNotEqualTo(String value) {
            addCriterion("ssxt <>", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtGreaterThan(String value) {
            addCriterion("ssxt >", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtGreaterThanOrEqualTo(String value) {
            addCriterion("ssxt >=", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtLessThan(String value) {
            addCriterion("ssxt <", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtLessThanOrEqualTo(String value) {
            addCriterion("ssxt <=", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtLike(String value) {
            addCriterion("ssxt like", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtNotLike(String value) {
            addCriterion("ssxt not like", value, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtIn(List<String> values) {
            addCriterion("ssxt in", values, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtNotIn(List<String> values) {
            addCriterion("ssxt not in", values, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtBetween(String value1, String value2) {
            addCriterion("ssxt between", value1, value2, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSsxtNotBetween(String value1, String value2) {
            addCriterion("ssxt not between", value1, value2, "ssxt");
            return (Criteria) this;
        }

        public Criteria andSxsjqsIsNull() {
            addCriterion("sxsjqs is null");
            return (Criteria) this;
        }

        public Criteria andSxsjqsIsNotNull() {
            addCriterion("sxsjqs is not null");
            return (Criteria) this;
        }

        public Criteria andSxsjqsEqualTo(String value) {
            addCriterion("sxsjqs =", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsNotEqualTo(String value) {
            addCriterion("sxsjqs <>", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsGreaterThan(String value) {
            addCriterion("sxsjqs >", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsGreaterThanOrEqualTo(String value) {
            addCriterion("sxsjqs >=", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsLessThan(String value) {
            addCriterion("sxsjqs <", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsLessThanOrEqualTo(String value) {
            addCriterion("sxsjqs <=", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsLike(String value) {
            addCriterion("sxsjqs like", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsNotLike(String value) {
            addCriterion("sxsjqs not like", value, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsIn(List<String> values) {
            addCriterion("sxsjqs in", values, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsNotIn(List<String> values) {
            addCriterion("sxsjqs not in", values, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsBetween(String value1, String value2) {
            addCriterion("sxsjqs between", value1, value2, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andSxsjqsNotBetween(String value1, String value2) {
            addCriterion("sxsjqs not between", value1, value2, "sxsjqs");
            return (Criteria) this;
        }

        public Criteria andXgmmsjIsNull() {
            addCriterion("xgmmsj is null");
            return (Criteria) this;
        }

        public Criteria andXgmmsjIsNotNull() {
            addCriterion("xgmmsj is not null");
            return (Criteria) this;
        }

        public Criteria andXgmmsjEqualTo(String value) {
            addCriterion("xgmmsj =", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjNotEqualTo(String value) {
            addCriterion("xgmmsj <>", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjGreaterThan(String value) {
            addCriterion("xgmmsj >", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjGreaterThanOrEqualTo(String value) {
            addCriterion("xgmmsj >=", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjLessThan(String value) {
            addCriterion("xgmmsj <", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjLessThanOrEqualTo(String value) {
            addCriterion("xgmmsj <=", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjLike(String value) {
            addCriterion("xgmmsj like", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjNotLike(String value) {
            addCriterion("xgmmsj not like", value, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjIn(List<String> values) {
            addCriterion("xgmmsj in", values, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjNotIn(List<String> values) {
            addCriterion("xgmmsj not in", values, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjBetween(String value1, String value2) {
            addCriterion("xgmmsj between", value1, value2, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgmmsjNotBetween(String value1, String value2) {
            addCriterion("xgmmsj not between", value1, value2, "xgmmsj");
            return (Criteria) this;
        }

        public Criteria andXgrIsNull() {
            addCriterion("xgr is null");
            return (Criteria) this;
        }

        public Criteria andXgrIsNotNull() {
            addCriterion("xgr is not null");
            return (Criteria) this;
        }

        public Criteria andXgrEqualTo(String value) {
            addCriterion("xgr =", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotEqualTo(String value) {
            addCriterion("xgr <>", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThan(String value) {
            addCriterion("xgr >", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThanOrEqualTo(String value) {
            addCriterion("xgr >=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThan(String value) {
            addCriterion("xgr <", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThanOrEqualTo(String value) {
            addCriterion("xgr <=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLike(String value) {
            addCriterion("xgr like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotLike(String value) {
            addCriterion("xgr not like", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrIn(List<String> values) {
            addCriterion("xgr in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotIn(List<String> values) {
            addCriterion("xgr not in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrBetween(String value1, String value2) {
            addCriterion("xgr between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotBetween(String value1, String value2) {
            addCriterion("xgr not between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNull() {
            addCriterion("xgsj is null");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNotNull() {
            addCriterion("xgsj is not null");
            return (Criteria) this;
        }

        public Criteria andXgsjEqualTo(String value) {
            addCriterion("xgsj =", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotEqualTo(String value) {
            addCriterion("xgsj <>", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThan(String value) {
            addCriterion("xgsj >", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThanOrEqualTo(String value) {
            addCriterion("xgsj >=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThan(String value) {
            addCriterion("xgsj <", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThanOrEqualTo(String value) {
            addCriterion("xgsj <=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLike(String value) {
            addCriterion("xgsj like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotLike(String value) {
            addCriterion("xgsj not like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjIn(List<String> values) {
            addCriterion("xgsj in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotIn(List<String> values) {
            addCriterion("xgsj not in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjBetween(String value1, String value2) {
            addCriterion("xgsj between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotBetween(String value1, String value2) {
            addCriterion("xgsj not between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXyztIsNull() {
            addCriterion("xyzt is null");
            return (Criteria) this;
        }

        public Criteria andXyztIsNotNull() {
            addCriterion("xyzt is not null");
            return (Criteria) this;
        }

        public Criteria andXyztEqualTo(String value) {
            addCriterion("xyzt =", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztNotEqualTo(String value) {
            addCriterion("xyzt <>", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztGreaterThan(String value) {
            addCriterion("xyzt >", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztGreaterThanOrEqualTo(String value) {
            addCriterion("xyzt >=", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztLessThan(String value) {
            addCriterion("xyzt <", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztLessThanOrEqualTo(String value) {
            addCriterion("xyzt <=", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztLike(String value) {
            addCriterion("xyzt like", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztNotLike(String value) {
            addCriterion("xyzt not like", value, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztIn(List<String> values) {
            addCriterion("xyzt in", values, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztNotIn(List<String> values) {
            addCriterion("xyzt not in", values, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztBetween(String value1, String value2) {
            addCriterion("xyzt between", value1, value2, "xyzt");
            return (Criteria) this;
        }

        public Criteria andXyztNotBetween(String value1, String value2) {
            addCriterion("xyzt not between", value1, value2, "xyzt");
            return (Criteria) this;
        }

        public Criteria andYhztIsNull() {
            addCriterion("yhzt is null");
            return (Criteria) this;
        }

        public Criteria andYhztIsNotNull() {
            addCriterion("yhzt is not null");
            return (Criteria) this;
        }

        public Criteria andYhztEqualTo(String value) {
            addCriterion("yhzt =", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztNotEqualTo(String value) {
            addCriterion("yhzt <>", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztGreaterThan(String value) {
            addCriterion("yhzt >", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztGreaterThanOrEqualTo(String value) {
            addCriterion("yhzt >=", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztLessThan(String value) {
            addCriterion("yhzt <", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztLessThanOrEqualTo(String value) {
            addCriterion("yhzt <=", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztLike(String value) {
            addCriterion("yhzt like", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztNotLike(String value) {
            addCriterion("yhzt not like", value, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztIn(List<String> values) {
            addCriterion("yhzt in", values, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztNotIn(List<String> values) {
            addCriterion("yhzt not in", values, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztBetween(String value1, String value2) {
            addCriterion("yhzt between", value1, value2, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhztNotBetween(String value1, String value2) {
            addCriterion("yhzt not between", value1, value2, "yhzt");
            return (Criteria) this;
        }

        public Criteria andYhzwIsNull() {
            addCriterion("yhzw is null");
            return (Criteria) this;
        }

        public Criteria andYhzwIsNotNull() {
            addCriterion("yhzw is not null");
            return (Criteria) this;
        }

        public Criteria andYhzwEqualTo(String value) {
            addCriterion("yhzw =", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotEqualTo(String value) {
            addCriterion("yhzw <>", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwGreaterThan(String value) {
            addCriterion("yhzw >", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwGreaterThanOrEqualTo(String value) {
            addCriterion("yhzw >=", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwLessThan(String value) {
            addCriterion("yhzw <", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwLessThanOrEqualTo(String value) {
            addCriterion("yhzw <=", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwLike(String value) {
            addCriterion("yhzw like", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotLike(String value) {
            addCriterion("yhzw not like", value, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwIn(List<String> values) {
            addCriterion("yhzw in", values, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotIn(List<String> values) {
            addCriterion("yhzw not in", values, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwBetween(String value1, String value2) {
            addCriterion("yhzw between", value1, value2, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYhzwNotBetween(String value1, String value2) {
            addCriterion("yhzw not between", value1, value2, "yhzw");
            return (Criteria) this;
        }

        public Criteria andYxqsIsNull() {
            addCriterion("yxqs is null");
            return (Criteria) this;
        }

        public Criteria andYxqsIsNotNull() {
            addCriterion("yxqs is not null");
            return (Criteria) this;
        }

        public Criteria andYxqsEqualTo(String value) {
            addCriterion("yxqs =", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsNotEqualTo(String value) {
            addCriterion("yxqs <>", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsGreaterThan(String value) {
            addCriterion("yxqs >", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsGreaterThanOrEqualTo(String value) {
            addCriterion("yxqs >=", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsLessThan(String value) {
            addCriterion("yxqs <", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsLessThanOrEqualTo(String value) {
            addCriterion("yxqs <=", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsLike(String value) {
            addCriterion("yxqs like", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsNotLike(String value) {
            addCriterion("yxqs not like", value, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsIn(List<String> values) {
            addCriterion("yxqs in", values, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsNotIn(List<String> values) {
            addCriterion("yxqs not in", values, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsBetween(String value1, String value2) {
            addCriterion("yxqs between", value1, value2, "yxqs");
            return (Criteria) this;
        }

        public Criteria andYxqsNotBetween(String value1, String value2) {
            addCriterion("yxqs not between", value1, value2, "yxqs");
            return (Criteria) this;
        }

        public Criteria andZhdlipIsNull() {
            addCriterion("zhdlip is null");
            return (Criteria) this;
        }

        public Criteria andZhdlipIsNotNull() {
            addCriterion("zhdlip is not null");
            return (Criteria) this;
        }

        public Criteria andZhdlipEqualTo(String value) {
            addCriterion("zhdlip =", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipNotEqualTo(String value) {
            addCriterion("zhdlip <>", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipGreaterThan(String value) {
            addCriterion("zhdlip >", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipGreaterThanOrEqualTo(String value) {
            addCriterion("zhdlip >=", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipLessThan(String value) {
            addCriterion("zhdlip <", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipLessThanOrEqualTo(String value) {
            addCriterion("zhdlip <=", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipLike(String value) {
            addCriterion("zhdlip like", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipNotLike(String value) {
            addCriterion("zhdlip not like", value, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipIn(List<String> values) {
            addCriterion("zhdlip in", values, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipNotIn(List<String> values) {
            addCriterion("zhdlip not in", values, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipBetween(String value1, String value2) {
            addCriterion("zhdlip between", value1, value2, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlipNotBetween(String value1, String value2) {
            addCriterion("zhdlip not between", value1, value2, "zhdlip");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIsNull() {
            addCriterion("zhdlsj is null");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIsNotNull() {
            addCriterion("zhdlsj is not null");
            return (Criteria) this;
        }

        public Criteria andZhdlsjEqualTo(Date value) {
            addCriterionForJDBCDate("zhdlsj =", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("zhdlsj <>", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjGreaterThan(Date value) {
            addCriterionForJDBCDate("zhdlsj >", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zhdlsj >=", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjLessThan(Date value) {
            addCriterionForJDBCDate("zhdlsj <", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zhdlsj <=", value, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjIn(List<Date> values) {
            addCriterionForJDBCDate("zhdlsj in", values, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("zhdlsj not in", values, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zhdlsj between", value1, value2, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZhdlsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zhdlsj not between", value1, value2, "zhdlsj");
            return (Criteria) this;
        }

        public Criteria andZsidIsNull() {
            addCriterion("zsid is null");
            return (Criteria) this;
        }

        public Criteria andZsidIsNotNull() {
            addCriterion("zsid is not null");
            return (Criteria) this;
        }

        public Criteria andZsidEqualTo(String value) {
            addCriterion("zsid =", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidNotEqualTo(String value) {
            addCriterion("zsid <>", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidGreaterThan(String value) {
            addCriterion("zsid >", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidGreaterThanOrEqualTo(String value) {
            addCriterion("zsid >=", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidLessThan(String value) {
            addCriterion("zsid <", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidLessThanOrEqualTo(String value) {
            addCriterion("zsid <=", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidLike(String value) {
            addCriterion("zsid like", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidNotLike(String value) {
            addCriterion("zsid not like", value, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidIn(List<String> values) {
            addCriterion("zsid in", values, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidNotIn(List<String> values) {
            addCriterion("zsid not in", values, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidBetween(String value1, String value2) {
            addCriterion("zsid between", value1, value2, "zsid");
            return (Criteria) this;
        }

        public Criteria andZsidNotBetween(String value1, String value2) {
            addCriterion("zsid not between", value1, value2, "zsid");
            return (Criteria) this;
        }

        public Criteria andBmbhIsNull() {
            addCriterion("bmbh is null");
            return (Criteria) this;
        }

        public Criteria andBmbhIsNotNull() {
            addCriterion("bmbh is not null");
            return (Criteria) this;
        }

        public Criteria andBmbhEqualTo(String value) {
            addCriterion("bmbh =", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotEqualTo(String value) {
            addCriterion("bmbh <>", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhGreaterThan(String value) {
            addCriterion("bmbh >", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhGreaterThanOrEqualTo(String value) {
            addCriterion("bmbh >=", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLessThan(String value) {
            addCriterion("bmbh <", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLessThanOrEqualTo(String value) {
            addCriterion("bmbh <=", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhLike(String value) {
            addCriterion("bmbh like", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotLike(String value) {
            addCriterion("bmbh not like", value, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhIn(List<String> values) {
            addCriterion("bmbh in", values, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotIn(List<String> values) {
            addCriterion("bmbh not in", values, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhBetween(String value1, String value2) {
            addCriterion("bmbh between", value1, value2, "bmbh");
            return (Criteria) this;
        }

        public Criteria andBmbhNotBetween(String value1, String value2) {
            addCriterion("bmbh not between", value1, value2, "bmbh");
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