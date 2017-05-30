package com.yihaojishi.pojo;

import java.io.Serializable;

public class AppMenuItemRole implements Serializable {
    private Integer itemRoleId;

    /**
     * 目标类型 （商品，banner，活动，等....）
     */
    private Integer targetType;

    /**
     * 目标数量
     */
    private Integer targetCount;

    /**
     * 目标所属分类
     */
    private Integer targetCategoryId;

    /**
     * 规则顺序
     */
    private Integer sortOrder;

    private Integer createTime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getItemRoleId() {
        return itemRoleId;
    }

    public void setItemRoleId(Integer itemRoleId) {
        this.itemRoleId = itemRoleId;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Integer getTargetCount() {
        return targetCount;
    }

    public void setTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
    }

    public Integer getTargetCategoryId() {
        return targetCategoryId;
    }

    public void setTargetCategoryId(Integer targetCategoryId) {
        this.targetCategoryId = targetCategoryId;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemRoleId=").append(itemRoleId);
        sb.append(", targetType=").append(targetType);
        sb.append(", targetCount=").append(targetCount);
        sb.append(", targetCategoryId=").append(targetCategoryId);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}