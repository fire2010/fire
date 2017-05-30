package com.yihaojishi.pojo;

import java.io.Serializable;

public class AppMenu implements Serializable {
    private Integer menuId;

    /**
     * 入口名称
     */
    private String name;

    /**
     *  背景图片
     */
    private String bdimage;

    /**
     * 标题
     */
    private String title;

    /**
     * 概要
     */
    private String summary;

    /**
     *  排序(数字越大越靠前）
     */
    private Integer sortOrder;

    private Integer positionId;

    /**
     * 是否展示0是 1否
     */
    private Integer isShow;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBdimage() {
        return bdimage;
    }

    public void setBdimage(String bdimage) {
        this.bdimage = bdimage == null ? null : bdimage.trim();
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

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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
        sb.append(", menuId=").append(menuId);
        sb.append(", name=").append(name);
        sb.append(", bdimage=").append(bdimage);
        sb.append(", title=").append(title);
        sb.append(", summary=").append(summary);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", positionId=").append(positionId);
        sb.append(", isShow=").append(isShow);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}