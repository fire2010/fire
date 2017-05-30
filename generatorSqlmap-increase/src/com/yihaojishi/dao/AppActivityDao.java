package com.yihaojishi.dao;

import com.yihaojishi.pojo.AppActivity;
import com.yihaojishi.pojo.AppActivityQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppActivityDao {
    int countByExample(AppActivityQuery example);

    int deleteByExample(AppActivityQuery example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(AppActivity record);

    int insertSelective(AppActivity record);

    List<AppActivity> selectByExample(AppActivityQuery example);

    AppActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") AppActivity record, @Param("example") AppActivityQuery example);

    int updateByExample(@Param("record") AppActivity record, @Param("example") AppActivityQuery example);

    int updateByPrimaryKeySelective(AppActivity record);

    int updateByPrimaryKey(AppActivity record);
}