package com.yihaojishi.dao;

import com.yihaojishi.pojo.AppMenuItem;
import com.yihaojishi.pojo.AppMenuItemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppMenuItemDao {
    int countByExample(AppMenuItemQuery example);

    int deleteByExample(AppMenuItemQuery example);

    int deleteByPrimaryKey(Integer menuItemId);

    int insert(AppMenuItem record);

    int insertSelective(AppMenuItem record);

    List<AppMenuItem> selectByExample(AppMenuItemQuery example);

    AppMenuItem selectByPrimaryKey(Integer menuItemId);

    int updateByExampleSelective(@Param("record") AppMenuItem record, @Param("example") AppMenuItemQuery example);

    int updateByExample(@Param("record") AppMenuItem record, @Param("example") AppMenuItemQuery example);

    int updateByPrimaryKeySelective(AppMenuItem record);

    int updateByPrimaryKey(AppMenuItem record);
}