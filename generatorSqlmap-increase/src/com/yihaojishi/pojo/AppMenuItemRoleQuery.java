package com.yihaojishi.pojo;

import java.util.ArrayList;
import java.util.List;

public class AppMenuItemRoleQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public AppMenuItemRoleQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andItemRoleIdIsNull() {
            addCriterion("item_role_id is null");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdIsNotNull() {
            addCriterion("item_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdEqualTo(Integer value) {
            addCriterion("item_role_id =", value, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdNotEqualTo(Integer value) {
            addCriterion("item_role_id <>", value, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdGreaterThan(Integer value) {
            addCriterion("item_role_id >", value, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_role_id >=", value, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdLessThan(Integer value) {
            addCriterion("item_role_id <", value, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_role_id <=", value, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdIn(List<Integer> values) {
            addCriterion("item_role_id in", values, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdNotIn(List<Integer> values) {
            addCriterion("item_role_id not in", values, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("item_role_id between", value1, value2, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andItemRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_role_id not between", value1, value2, "itemRoleId");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNull() {
            addCriterion("target_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIsNotNull() {
            addCriterion("target_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTypeEqualTo(Integer value) {
            addCriterion("target_type =", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotEqualTo(Integer value) {
            addCriterion("target_type <>", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThan(Integer value) {
            addCriterion("target_type >", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_type >=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThan(Integer value) {
            addCriterion("target_type <", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeLessThanOrEqualTo(Integer value) {
            addCriterion("target_type <=", value, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeIn(List<Integer> values) {
            addCriterion("target_type in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotIn(List<Integer> values) {
            addCriterion("target_type not in", values, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeBetween(Integer value1, Integer value2) {
            addCriterion("target_type between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("target_type not between", value1, value2, "targetType");
            return (Criteria) this;
        }

        public Criteria andTargetCountIsNull() {
            addCriterion("target_count is null");
            return (Criteria) this;
        }

        public Criteria andTargetCountIsNotNull() {
            addCriterion("target_count is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCountEqualTo(Integer value) {
            addCriterion("target_count =", value, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountNotEqualTo(Integer value) {
            addCriterion("target_count <>", value, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountGreaterThan(Integer value) {
            addCriterion("target_count >", value, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_count >=", value, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountLessThan(Integer value) {
            addCriterion("target_count <", value, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountLessThanOrEqualTo(Integer value) {
            addCriterion("target_count <=", value, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountIn(List<Integer> values) {
            addCriterion("target_count in", values, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountNotIn(List<Integer> values) {
            addCriterion("target_count not in", values, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountBetween(Integer value1, Integer value2) {
            addCriterion("target_count between", value1, value2, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCountNotBetween(Integer value1, Integer value2) {
            addCriterion("target_count not between", value1, value2, "targetCount");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdIsNull() {
            addCriterion("target_category_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdIsNotNull() {
            addCriterion("target_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdEqualTo(Integer value) {
            addCriterion("target_category_id =", value, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdNotEqualTo(Integer value) {
            addCriterion("target_category_id <>", value, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdGreaterThan(Integer value) {
            addCriterion("target_category_id >", value, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_category_id >=", value, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdLessThan(Integer value) {
            addCriterion("target_category_id <", value, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("target_category_id <=", value, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdIn(List<Integer> values) {
            addCriterion("target_category_id in", values, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdNotIn(List<Integer> values) {
            addCriterion("target_category_id not in", values, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("target_category_id between", value1, value2, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andTargetCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("target_category_id not between", value1, value2, "targetCategoryId");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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