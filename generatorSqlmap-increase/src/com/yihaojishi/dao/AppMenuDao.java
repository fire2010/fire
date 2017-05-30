package com.yihaojishi.dao;

import com.yihaojishi.pojo.AppMenu;
import com.yihaojishi.pojo.AppMenuQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppMenuDao {
    int countByExample(AppMenuQuery example);

    int deleteByExample(AppMenuQuery example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(AppMenu record);

    int insertSelective(AppMenu record);

    List<AppMenu> selectByExample(AppMenuQuery example);

    AppMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") AppMenu record, @Param("example") AppMenuQuery example);

    int updateByExample(@Param("record") AppMenu record, @Param("example") AppMenuQuery example);

    int updateByPrimaryKeySelective(AppMenu record);

    int updateByPrimaryKey(AppMenu record);
}