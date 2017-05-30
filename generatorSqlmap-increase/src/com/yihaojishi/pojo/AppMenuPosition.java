package com.yihaojishi.pojo;

import java.io.Serializable;

public class AppMenuPosition implements Serializable {
    /**
     * 位置
     */
    private Integer positionId;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     * 模块标题
     */
    private String title;

    /**
     * 子元素类型  
01 搜索栏 
02 banner
03 menu  
04 bulletin 
05 goods 
06 activity 
07 brand 
     */
    private String menuType;

    /**
     * 子元素个数
     */
    private Integer menuCount;

    /**
     * 是否展示 0是 1否
     */
    private Integer isShow;

    /**
     * 是否轮播 0是 1否
     */
    private Integer isRotation;

    /**
     * 所属模块 
01首页  
02分类  
03市集  
04购物车  
05个人中心
     */
    private String positionType;

    private Integer createTime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public Integer getMenuCount() {
        return menuCount;
    }

    public void setMenuCount(Integer menuCount) {
        this.menuCount = menuCount;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsRotation() {
        return isRotation;
    }

    public void setIsRotation(Integer isRotation) {
        this.isRotation = isRotation;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType == null ? null : positionType.trim();
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
        sb.append(", positionId=").append(positionId);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", title=").append(title);
        sb.append(", menuType=").append(menuType);
        sb.append(", menuCount=").append(menuCount);
        sb.append(", isShow=").append(isShow);
        sb.append(", isRotation=").append(isRotation);
        sb.append(", positionType=").append(positionType);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}