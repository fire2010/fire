package com.yihaojishi.dao;

import com.yihaojishi.pojo.AppMenuItemRole;
import com.yihaojishi.pojo.AppMenuItemRoleQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppMenuItemRoleDao {
    int countByExample(AppMenuItemRoleQuery example);

    int deleteByExample(AppMenuItemRoleQuery example);

    int deleteByPrimaryKey(Integer itemRoleId);

    int insert(AppMenuItemRole record);

    int insertSelective(AppMenuItemRole record);

    List<AppMenuItemRole> selectByExample(AppMenuItemRoleQuery example);

    AppMenuItemRole selectByPrimaryKey(Integer itemRoleId);

    int updateByExampleSelective(@Param("record") AppMenuItemRole record, @Param("example") AppMenuItemRoleQuery example);

    int updateByExample(@Param("record") AppMenuItemRole record, @Param("example") AppMenuItemRoleQuery example);

    int updateByPrimaryKeySelective(AppMenuItemRole record);

    int updateByPrimaryKey(AppMenuItemRole record);
}