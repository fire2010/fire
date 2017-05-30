package com.yihaojishi.pojo;

import java.io.Serializable;

public class AppBanner implements Serializable {
    /**
     * bannerID
     */
    private Integer bannerId;

    /**
     * 位置id
     */
    private Integer positionId;

    /**
     *  标题
     */
    private String title;

    /**
     * 简介
     */
    private String summary;

    /**
     * 关联的类型  1goods 2activity 3外链
     */
    private Integer targetType;

    /**
     * 关联的id
     */
    private Integer targetId;

    /**
     * 外链
     */
    private String targetlink;

    /**
     *  访问量
     */
    private Integer clickCount;

    /**
     * 是否生效  0是  1否
     */
    private Integer enabled;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     *   创建时间
     */
    private Integer createTime;

    /**
     *  状态0正常 1已删除
     */
    private Integer status;

    /**
     * 图片
     */
    private String img;

    private static final long serialVersionUID = 1L;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getTargetlink() {
        return targetlink;
    }

    public void setTargetlink(String targetlink) {
        this.targetlink = targetlink == null ? null : targetlink.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bannerId=").append(bannerId);
        sb.append(", positionId=").append(positionId);
        sb.append(", title=").append(title);
        sb.append(", summary=").append(summary);
        sb.append(", targetType=").append(targetType);
        sb.append(", targetId=").append(targetId);
        sb.append(", targetlink=").append(targetlink);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", enabled=").append(enabled);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", img=").append(img);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}