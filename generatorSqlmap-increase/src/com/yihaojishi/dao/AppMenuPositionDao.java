package com.yihaojishi.dao;

import com.yihaojishi.pojo.AppMenuPosition;
import com.yihaojishi.pojo.AppMenuPositionQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppMenuPositionDao {
    int countByExample(AppMenuPositionQuery example);

    int deleteByExample(AppMenuPositionQuery example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(AppMenuPosition record);

    int insertSelective(AppMenuPosition record);

    List<AppMenuPosition> selectByExample(AppMenuPositionQuery example);

    AppMenuPosition selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") AppMenuPosition record, @Param("example") AppMenuPositionQuery example);

    int updateByExample(@Param("record") AppMenuPosition record, @Param("example") AppMenuPositionQuery example);

    int updateByPrimaryKeySelective(AppMenuPosition record);

    int updateByPrimaryKey(AppMenuPosition record);
}