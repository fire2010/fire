package com.yihaojishi.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class AppActivity implements Serializable {
    private Integer activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动描述
     */
    private String activityDesc;

    /**
     * 活动类型：折扣，促销，满减，满就送
     */
    private String activityType;

    /**
     * 折扣
     */
    private BigDecimal activityDiscount;

    /**
     * 满减金额
     */
    private BigDecimal lessPrice;

    /**
     * 活动开始时间
     */
    private Integer startTime;

    /**
     * 活动结束时间
     */
    private Integer endTime;

    /**
     * 活动创建时间
     */
    private Integer creatTime;

    /**
     * 活动的状态 0正常  1未生效
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    public BigDecimal getActivityDiscount() {
        return activityDiscount;
    }

    public void setActivityDiscount(BigDecimal activityDiscount) {
        this.activityDiscount = activityDiscount;
    }

    public BigDecimal getLessPrice() {
        return lessPrice;
    }

    public void setLessPrice(BigDecimal lessPrice) {
        this.lessPrice = lessPrice;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Integer creatTime) {
        this.creatTime = creatTime;
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
        sb.append(", activityId=").append(activityId);
        sb.append(", activityName=").append(activityName);
        sb.append(", activityDesc=").append(activityDesc);
        sb.append(", activityType=").append(activityType);
        sb.append(", activityDiscount=").append(activityDiscount);
        sb.append(", lessPrice=").append(lessPrice);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}