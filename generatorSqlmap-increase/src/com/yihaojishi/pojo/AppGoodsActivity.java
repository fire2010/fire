package com.yihaojishi.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class AppGoodsActivity implements Serializable {
    private Integer goodsActivityId;

    private Integer goodsId;

    private Integer activityId;

    private String activityDesc;

    /**
     * 活动价
     */
    private BigDecimal activityPrice;

    /**
     * 参与活动减免的金额
     */
    private BigDecimal activityReducePrice;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsActivityId() {
        return goodsActivityId;
    }

    public void setGoodsActivityId(Integer goodsActivityId) {
        this.goodsActivityId = goodsActivityId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }

    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
    }

    public BigDecimal getActivityReducePrice() {
        return activityReducePrice;
    }

    public void setActivityReducePrice(BigDecimal activityReducePrice) {
        this.activityReducePrice = activityReducePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsActivityId=").append(goodsActivityId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", activityId=").append(activityId);
        sb.append(", activityDesc=").append(activityDesc);
        sb.append(", activityPrice=").append(activityPrice);
        sb.append(", activityReducePrice=").append(activityReducePrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}